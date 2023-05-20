package poo.polimorfismo;

enum Estacao {
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVRA
}
public class Roupa3 {
	String modelo;
	int tamanho;
	Estacao colecao; //1 VERÃO; 2 OUTONO; 3 INVERNO; 4 PRIMAVERA.
	
	public Roupa3(String modelo, int tamanho, Estacao colecao) {
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}
	
	public void msg() {
		switch (colecao) {
		case VERAO:
			System.out.println("Arrase na praia!");
			break;
		case OUTONO:
			System.out.println("Passe o outono com elegância!");
			break;
		case INVERNO:
			System.out.println("Se agasalhe bem e com estilo!");
			break;
		case PRIMAVRA:
			System.out.println("Se vista na estação das flores!");
			break;
		default:
			
		}
	}
}
