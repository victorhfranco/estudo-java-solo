package poo.heranca;

public class LivroDigital8 extends Livro8 {
	private int download;
	private double tamanho;
	
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public LivroDigital8(String titulo, Autor8 autor, String genero, int edicao, int download, double tamanho) {
		super(titulo, autor, genero, edicao);
		this.download = download;
		this.tamanho = tamanho;
	}
	
	public LivroDigital8() {
		
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Download: " + download);
		System.out.println("Tamanho: " + tamanho);
	}
}
