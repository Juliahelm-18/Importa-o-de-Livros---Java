package model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    public Livro(int id) {
        this.id = id;
    }

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(int id, String titulo, String autor, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(int id, String titulo, String autor, int anoPublicacao, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }
}