import java.util.ArrayList;

public class Turma {
	
	private String serie;
	private int ano;
	private int codigo;
	private static boolean cad_turma = false;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
	
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

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public int searchMatriculaAluno(int matricula) {

		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCPF() == matricula) {
				return i;
			}
		}
		return -1;
	}

	public void excluirMatriculaAluno(int matricula, ArrayList<Aluno> alunos, boolean cad_aluno) { 

		int posicao = searchMatriculaAluno(matricula);

		if(posicao != -1) {
			System.out.println("\nO aluno " + alunos.get(posicao).getMatricula() + " com a matricula " + matricula + " foi apagado.");
			alunos.remove(posicao);

			if (alunos.size() < 1) {
				cad_aluno = false;
			}

		}else {
			System.out.println("\nEssa matricula não existe.");
		}
	}

    public int searchMateriaDisci(String materia) {

		for(int i = 0; i < disciplinas.size(); i++) {
			if(disciplinas.get(i).getMateria().equals(materia)) {
				return i;
			}
		}
		return -1;
	}

	public void excluirMateriaDisci(String materia, ArrayList<Disciplinas> disciplinas, boolean cad_disci) { 

		int posicao = searchMateriaDisci(materia);

		if(posicao != -1) {
			System.out.println("\nA disciplina " + disciplinas.get(posicao).getMateria() + " foi apagado.");
			disciplinas.remove(posicao);

			if (disciplinas.size() < 1) {
				cad_disci = false;
			}

		}else {
			System.out.println("\nEssa matricula não existe.");
		}
	}

	public String mostrarInfo(){
		return "// relatório da turma "+getSerie()+" do ano " + getAno() + "// "+
		"código: "+getCodigo()+
		"------------------"+
		"\nAlunos desta turma: ";
		//a finalizar
	}
	
	public Turma(String serie, int ano, int codigo) {
		this.serie = serie;
		this.ano = ano;
		this.codigo = codigo;
		
	}
}
