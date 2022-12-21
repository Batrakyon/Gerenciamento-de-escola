import java.util.ArrayList;

public class Disciplinas {
	
	protected String materia;
	private static boolean cad_disci = false;
	ArrayList<Docentes> docentes = new ArrayList<Docentes>();
	ArrayList<Aluno> aluno = new ArrayList<Aluno>();

	 /*
	 double total;

	  * for(Aluno a: aluno){

		total += a.getBoletim().get(this);
		
		a.getNome() + " - " a.getBoletim().get(this);
	  }

	  double media = total / aluno.size();

	  aqui é pra poder monstrar ou a media geral ou a nota separada 

	  */

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

	public ArrayList<Docentes> getDocentes() {
		return docentes;
	}

    public ArrayList<Aluno> getAluno() {
		return aluno;
	}

	public int searchCPFDocente(int CPF) {

		for(int i = 0; i < docentes.size(); i++) {
			if(docentes.get(i).getCPF() == CPF) {
				return i;
			}
		}
		return -1;
	}

	public void excluirCPFDocente(int CPF, ArrayList<Docentes> docente, boolean cad_docente) { 

		int posicao = searchCPFDocente(CPF);

		if(posicao != -1) {
			System.out.println("\nO docente " + docente.get(posicao).getNome() + " com o CPF " + CPF + " foi apagado.");
			docente.remove(posicao);

			if (docente.size() < 1) {
				cad_docente = false;
			}

		}else {
			System.out.println("\nEsse CPF não existe.");
		}
	}

	public int searchMatriculaAluno(int matricula) {

		for(int i = 0; i < aluno.size(); i++) {
			if(aluno.get(i).getCPF() == matricula) {
				return i;
			}
		}
		return -1;
	}

	public void excluirMatriculaAluno(int matricula, ArrayList<Aluno> aluno, boolean cad_aluno) { 

		int posicao = searchMatriculaAluno(matricula);

		if(posicao != -1) {
			System.out.println("\nO aluno " + aluno.get(posicao).getMatricula() + " com a matricula " + matricula + " foi apagado.");
			aluno.get(posicao).getBoletim().remove(this);
			aluno.remove(posicao);

			if (aluno.size() < 1) {
				cad_aluno = false;
			}

		}else {
			System.out.println("\nEssa matricula não existe.");
		}
	}

	public void mostrarDocentes(){
		for (Docentes d : docentes) {
			System.out.println(d.getNome());
		}
	}

	
}
