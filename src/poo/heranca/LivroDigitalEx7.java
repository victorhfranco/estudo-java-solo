package poo.heranca;

public class LivroDigitalEx7 {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	//NOVO
	public String linkDownload;
	public int tamanhoMB;
	
	public float lucro() {
		return precoVenda - custoProducao;
	}

	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	//MUDOU
	public float imposto() {
		return 0.2f * lucro();
	}
	//NOVO
	public float tamanhoPorPagina() {
		return tamanhoMB / (float) paginas;
	}
}
