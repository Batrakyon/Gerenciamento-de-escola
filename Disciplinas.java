
public class Disciplinas {
	
	private String materia;
	private static boolean cad_disci = false;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public static boolean getCad_disci() {
		return cad_disci;
	}

	public static void setCad_disci(boolean cad_disci) {
		Disciplinas.cad_disci = cad_disci;
	}
	
	public Disciplinas(String materia) {
		this.materia = materia;
	}
	
}
