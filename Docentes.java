
public class Docentes extends Humano{
	
	private static boolean cad_docente = false;
	
	public static boolean getCad_docente() {
		return cad_docente;
	}

	public static void setCad_docente(boolean cad_docente) {
		Docentes.cad_docente = cad_docente;
	}

	public Docentes (String nome, int CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

}
