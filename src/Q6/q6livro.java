package Q6;
public class q6livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean estaEmprestado;

    public q6livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.estaEmprestado = false;
    }

    public void emprestar() {
        if (this.estaEmprestado) {
            System.out.println("O livro '" + this.titulo + "' já está emprestado.");
        } else {
            this.estaEmprestado = true;
            System.out.println("Você emprestou o livro '" + this.titulo + "'.");
        }
    }
    public void devolver() {
        if (this.estaEmprestado) {
            this.estaEmprestado = false;
            System.out.println("Você devolveu o livro '" + this.titulo + "'.");
        } else {
            System.out.println("O livro '" + this.titulo + "' não estava emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.numeroPaginas);
        System.out.println("Status: " + (this.estaEmprestado ? "Emprestado" : "Disponível"));
    }
}