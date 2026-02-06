package Class;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import Class.Filme;

public class HTMLGenerator {
    public void generate(List<Filme> filmes) throws IOException {
        PrintWriter writer = new PrintWriter("index.html");

        writer.println("""
    <html>
    <head>
        <meta charset=\"utf-8\">
        <title>Meus Filmes</title>
        <link rel=\"stylesheet\" href=\"style.css\"> </head>
    <body>
    """);

        for (Filme filme : filmes) {
            // Aqui você escreve o HTML para cada filme
            writer.println("<div>");
            writer.println("<h2>" + filme.getNome() + "</h2>");
            writer.println("<img src=\"" + filme.getImg() + "\">");
            writer.println("</div>");
        }

        writer.println("</body>"+"<footer> Criado por: Jose Francisco <a href=\"https://github.com/josefranciscorodrigues03-sketch\">GitHub</a></footer>"+"</html>");
        writer.close();
    }
}