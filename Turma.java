
public class Turma {
	
	private String serie;
	private int ano;
	private int codigo;
	private static boolean cad_turma = false;
	
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public static boolean getCad_turma() {
		return cad_turma;
	}

	public static void setCad_turma(boolean cad_turma) {
		Turma.cad_turma = cad_turma;
	}

	public String mostrarInfo(){
		return "// relatório da turma "+getSerie()+" do ano " + getAno() + "//"+
		"código: "+getCodigo();
		//a finalizar
	}
	
	public Turma(String serie, int ano, int codigo) {
		this.serie = serie;
		this.ano = ano;
		this.codigo = codigo;
		
	}
}
