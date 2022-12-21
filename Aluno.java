import java.util.HashMap;

public class Aluno extends Humano {
	
	private int matricula = 0;
	private double nota = 0;
	private static boolean cad_aluno = false;
	HashMap<Disciplinas, Double> boletim = new HashMap<>();

	public HashMap<Disciplinas, Double> getBoletim() {
		return boletim;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public static boolean getCad_aluno() {
		return cad_aluno;
	}

	public static void setCad_aluno(boolean cad_aluno) {
		Aluno.cad_aluno = cad_aluno;
	}
	
	public Aluno (String nome, int CPF, int matricula) {
		this.nome = nome;
		this.CPF = CPF;
		this.matricula = matricula;
	}
}
