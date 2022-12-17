import java.util.ArrayList;

public class SeachDelete {
	
	public static int buscarNomeAluno(String nome, ArrayList<Aluno> list_aluno) {
		
		for(int i = 0; i < list_aluno.size(); i++) {
			if(list_aluno.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int buscarCPFAluno(int CPF, ArrayList<Aluno> list_aluno) {
		
		for(int i = 0; i < list_aluno.size(); i++) {
			if(list_aluno.get(i).getCPF() == CPF) {
				return i;
			}
		}
		return -1;
	}
	
	public static void apagarCPFAluno(int CPF, ArrayList<Aluno> list_aluno, boolean cad_aluno) { 
		
		int posicao = buscarCPFAluno(CPF, list_aluno);
		
		if(posicao != -1) {
			System.out.println("\nO aluno " + list_aluno.get(posicao).getNome() + " com o CPF " + CPF + " foi apagado.");
			list_aluno.remove(posicao);
			
			if (list_aluno.size() < 1) {
				cad_aluno = false;
			}
			
		}else {
			System.out.println("\nEsse CPF não existe.");
		}
	}

	public static int buscarMatriculaAluno(int matricula, ArrayList<Aluno> list_aluno) {
		
		for(int i = 0; i< list_aluno.size(); i++) {
			if(list_aluno.get(i).getMatricula() == matricula) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void apagarMatriculaAluno(int matricula, ArrayList<Aluno> list_aluno, boolean cad_aluno) {
		
		int posicao = buscarMatriculaAluno(matricula, list_aluno);
		
		if(posicao != -1) {
			System.out.println("\nO aluno " + list_aluno.get(posicao).getNome() + " com a matricula " + matricula + " foi apagado.");
			list_aluno.remove(posicao);
			
			if(list_aluno.size() < 1) {
				cad_aluno = false;
			}
			
		} else {
			System.out.println("\nEssa matricula não existe.");
		}
	}
	
	public static int buscarNomeDocente(String nome, ArrayList<Docentes> list_docente) {

		for(int i = 0; i < list_docente.size(); i++) {
			if(list_docente.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}

	public static int buscarCPFDocente(int CPF, ArrayList<Docentes> list_docente) {

		for(int i = 0; i < list_docente.size(); i++) {
			if(list_docente.get(i).getCPF() == CPF) {
				return i;
			}
		}
		return -1;
	}
	
	public static void apagarCPFDocente(int CPF, ArrayList<Docentes> list_docente, boolean cad_docente) { 

		int posicao = buscarCPFDocente(CPF, list_docente);

		if(posicao != -1) {
			System.out.println("\nO docente " + list_docente.get(posicao).getNome() + " com o CPF " + CPF + " foi apagado.");
			list_docente.remove(posicao);

			if (list_docente.size() < 1) {
				cad_docente = false;
			}

		}else {
			System.out.println("\nEsse CPF não existe.");
		}
	}
	
	public static int buscarMateriaDisci(String materia, ArrayList<Disciplinas> list_disci) {

		for(int i = 0; i < list_disci.size(); i++) {
			if(list_disci.get(i).getMateria().equals(materia)) {
				return i;
			}
		}
		return -1;
	}
	
public static void apagarMateriaDisci(String materia, ArrayList<Disciplinas> list_disci, boolean cad_disci) {
		
		int posicao = buscarMateriaDisci(materia, list_disci);
		
		if(posicao != -1) {
			System.out.println("\nA materia " + list_disci.get(posicao).getMateria() + " foi apagado.");
			list_disci.remove(posicao);
			
			if(list_disci.size() < 1) {
				cad_disci = false;
			}
			
		} else {
			System.out.println("\nEssa materia não existe.");
		}
	}
}
