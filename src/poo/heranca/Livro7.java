package poo.heranca;

public class Livro7 {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	
	
	public Livro7(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public float lucro() {
		return precoVenda - custoProducao;
	}

	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
}
