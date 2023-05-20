package poo.heranca;

public class Livro8 {
	private String titulo;
	private Autor8 autor;
	private String genero;
	private int edicao;

	public Livro8() {

	}

	public Livro8(String titulo, Autor8 autor, String genero, int edicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor8 getAutor() {
		return autor;
	}

	public void setAutor(Autor8 autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	void info() {
		System.out.println("Titulo do livro: " + titulo);
		System.out.println("Genero do livro: " + genero);
		System.out.println("Edição: " + edicao);
		autor.info();
	}

}
