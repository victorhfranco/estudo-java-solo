package poo.heranca;

public class LivroDigital7 extends Livro7 {
	public String linkDownload;
	public int tamanhoMB;
	

	public LivroDigital7(String titulo, String autor, String linkDownload) {
		super(titulo, autor);
		this.linkDownload = linkDownload;
	}
	//MUDOU
	public float imposto() {
		return super.imposto() + 2;
	}

	//NOVO
	public float tamanhoPorPagina() {
		return tamanhoMB / (float) paginas;
	}
	
	public void imprimirImposto() {
		System.out.println("Imposto livro fisico: " + super.imposto());
		System.out.println("Imposto livro digital: " + this.imposto());
	}

}
