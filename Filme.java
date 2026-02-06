package Class;

public class Filme {
    private String nome;
    private String img;

    // Construtor: define o nome e a imagem quando criamos o filme
    public Filme(String nome, String img) {
        this.nome = nome;
        this.img = img;
    }

    // Getters (opcional agora, mas útil para o HTML depois)
    public String getNome() { return nome; }
    public String getImg() { return img; }

    // Este método serve para quando dermos "print", o Java saber o que escrever
    @Override
    public String toString() {
        return "Título: " + nome + " | Poster: " + img;
    }
}
