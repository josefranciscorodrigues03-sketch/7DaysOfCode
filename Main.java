import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Class.Filme;
import Class.HTMLGenerator;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = "e923933a4732213410d6f4e02405343e";
        HttpClient client = HttpClient.newHttpClient();

        List<Filme> listaDeFilmesCompleta = new ArrayList<>();

        System.out.println("Buscando filmes...");
        
        for (int p = 1; p <= 13; p++) {
            String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=" + apiKey + "&page=" + p;

            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            // Listas temporárias para esta página específica
            List<String> titulosDaPagina = new ArrayList<>();
            List<String> linksDaPagina = new ArrayList<>();

            // Extração de Títulos
            Matcher mTitulo = Pattern.compile("\"title\":\"(.*?)\"").matcher(json);
            while (mTitulo.find()) {
                titulosDaPagina.add(mTitulo.group(1));
            }

            // Extração de Imagens
            Matcher mImg = Pattern.compile("\"poster_path\":\"(.*?)\"").matcher(json);
            while (mImg.find()) {
                linksDaPagina.add("https://image.tmdb.org/t/p/w500" + mImg.group(1));
            }

            // Transforma os dados desta página em objetos Filme e adiciona na lista principal
            int totalPagina = Math.min(titulosDaPagina.size(), linksDaPagina.size());
            for (int i = 0; i < totalPagina; i++) {
                Filme f = new Filme(titulosDaPagina.get(i), linksDaPagina.get(i));
                listaDeFilmesCompleta.add(f);
            }

            System.out.println("Página " + p + " processada.");
        }

        // Se quiser limitar exatamente a 250, podemos fazer um corte:
        if (listaDeFilmesCompleta.size() > 250) {
            listaDeFilmesCompleta = listaDeFilmesCompleta.subList(0, 250);
        }

        // Mostrar no console a quantidade total
        System.out.println("Total de filmes capturados: " + listaDeFilmesCompleta.size());

        // Gerar o HTML com a lista cheia
        HTMLGenerator gerador = new HTMLGenerator();
        gerador.generate(listaDeFilmesCompleta);

        System.out.println("HTML gerado com sucesso! Abra o arquivo index.html.");
    }
}