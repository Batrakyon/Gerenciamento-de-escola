import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		int menu = 0;

		ArrayList<Aluno> list_aluno = new ArrayList<Aluno>();
		ArrayList<Docentes> list_docente = new ArrayList<Docentes>();
		ArrayList<Disciplinas> list_disci = new ArrayList<Disciplinas>();
		ArrayList<Turma> list_turma = new ArrayList<Turma>();

		System.out.println("SEJA BEM VINDO A ADMINISTRAÇÃO DA ESCOLA DAJJAK.");
		System.out.println("O que você deseja fazer? ");

		while(opcao != 6) {

			System.out.println("-------------------------------");
			System.out.println("1 - Gerenciamento dos Alunos. ");
			System.out.println("2 - Gerenciamento dos Docentes. ");
			System.out.println("3 - Gerenciamento das Disciplinas. ");
			System.out.println("4 - Gerenciamento das Turmas. ");
			System.out.println("5 - Relatórios. ");
			System.out.println("6 - Sair. ");
			System.out.println("-------------------------------");
			System.out.print("\nDigite a opção desejada:");
			opcao = sc.nextInt();

			switch(opcao) {

			case 1:

				int gereciamento_aluno = 0;
				Aluno aluno = new Aluno(null, 0, 0);

				System.out.println("\nVocê escolheu Gerenciamento de alunos.");
				System.out.print("Insira o que deseja realizar: ");

				while (gereciamento_aluno != 6){ //menu alunos

					System.out.println("\n-------------------------------");
					System.out.println("1 - Adicionar Aluno; ");
					System.out.println("2 - Registrar Aluno em Turma; ");
					System.out.println("3 - Registrar Aluno em Disciplina; ");
					System.out.println("4 - Modificar informações de Aluno; ");
					System.out.println("5 - Remover aluno; ");
					System.out.println("6 - voltar. ");
					System.out.println("-------------------------------");
					System.out.print("\nDigite a opção desejada:");
					gereciamento_aluno = sc.nextInt();

					switch(gereciamento_aluno){

					case 1:

						System.out.println("\nVocê escolheu cadastro de aluno");
						System.out.print("\nInsira o nome do aluno: ");
						String nome = sc.next();

						System.out.print("Insira o CPF: ");
						int CPF = sc.nextInt();

						System.out.print("Insira a matrícula: ");
						int matricula = sc.nextInt();

						aluno = new Aluno(nome, CPF, matricula);
						aluno.setCad_aluno(true);
						list_aluno.add(aluno);

						System.out.println("Aluno " + aluno.getNome() + " cadastrado!");

						break;

					case 2:

						// colocar a condição de existencia da turma aqui
						if(Aluno.getCad_aluno() == true) {

							System.out.println("\nVocê escolheu o registro de aluno em turma");

							for (int i = 0; i < list_aluno.size(); i++){
								System.out.println(list_aluno.get(i).getNome());

							}

							System.out.println("\nDigite o nome do aluno que deseja registrar");
							String registrar_aluno = sc.next();

							//colocar a turma que ele vai se registrar

							System.out.print("Tem certeza? [1 - Sim, 2 - N�o]: ");
							int certeza = sc.nextInt();

						} else {
							System.out.println("\nVocê não possui nenhuma turma ou nenhum aluno cadastratos no sistema.");
						}
						
						break;
						
					case 3:
						
						// colocar a condição de existencia de disciplina aqui
						if(Aluno.getCad_aluno() == true) {

							System.out.println("\nVocê escolheu o registro de aluno em qual disciplina");

							for (int i = 0; i < list_aluno.size(); i++){
								System.out.println(list_aluno.get(i).getNome());

							}

							System.out.println("\nDigite o nome do aluno que deseja registrar");
							String registrar_aluno = sc.next();

							//colocar a disciplina que ele vai se registrar

							System.out.print("Tem certeza? [1 - Sim, 2 - N�o]: ");
							int certeza = sc.nextInt();

						} else {
							System.out.println("\nVocê não possui nenhuma disciplina ou nenhum aluno cadastratos no sistema.");
						}
						
						break;

					case 4:

						if(Aluno.getCad_aluno() == true) {

							System.out.println("\nVocê escolheu modificar informação de aluno");

							System.out.println("1 - Nome");
							System.out.println("2 - CPF");
							System.out.println("3 - Matricula");

							System.out.println("\nDigite o numero da opção que deseja modificar: ");
							int aluno_modificar = sc.nextInt();

							switch (aluno_modificar) {

							case 1:

								System.out.println("\nQual nome deseja modificar? ");

								for (int i = 0; list_aluno.size() > i;i++) {
									System.out.println(list_aluno.get(i).getNome());

								}

								System.out.println("\nDigite sua opção: ");
								String escolher_nome = sc.next();

								if (SeachDelete.buscarNomeAluno(escolher_nome, list_aluno) > -1) {

									System.out.println("Digite o novo nome: ");
									aluno.setNome(sc.next());

									System.out.println("\nO novo nome é: " + aluno.getNome());
								} else {
									System.out.println("Esse nome não existe.");

								}

								break;

							case 2:

								System.out.println("\nQual CPF deseja modificar?");

								for(int i = 0; list_aluno.size() > i; i++) {
									System.out.println(list_aluno.get(i).getCPF());

								}

								System.out.println("\nDigite sua opção: ");
								int escolher_CPF = sc.nextInt();

								if(SeachDelete.buscarCPFAluno(escolher_CPF, list_aluno) > -1) {

									System.out.println("Digite o novo CPF: ");
									aluno.setCPF(sc.nextInt());

									System.out.println("\nO novo CPF é: " + aluno.getCPF());
								} else {
									System.out.println("Esse CPF não existe.");
								}

								break;

							case 3:

								System.out.println("\nQual matricula deseja modificar?");

								for(int i = 0; list_aluno.size() > i; i++) {
									System.out.println(list_aluno.get(i).getMatricula());

								}

								System.out.println("\nDigite sua opção: ");
								int escolher_matricula = sc.nextInt();

								if(SeachDelete.buscarMatriculaAluno(escolher_matricula, list_aluno) > -1) {

									System.out.println("Digite a nova matricula: ");
									aluno.setMatricula(sc.nextInt());

									System.out.println("\nA nova matricula é: " + aluno.getMatricula());
								} else {
									System.out.println("Essa matricula não existe.");
								}

								break;
							}

						} else {
							System.out.println("\nNão existem alunos cadastrados no sistema.");
						}

						break;

					case 5:

						if(Aluno.getCad_aluno() == true) {

							System.out.println("\nVocê escolheu excluir um aluno");
							System.out.println("1 - CPF");
							System.out.println("2 - Matricula");

							System.out.println("\nEscolha por qual metodo deseja excluir o aluno");
							int excluir_aluno = sc.nextInt();

							switch(excluir_aluno) {

							case 1:

								System.out.println("\nQual CPF deseja excluir?");
								for(int i = 0; i < list_aluno.size(); i++) {
									System.out.println(list_aluno.get(i).getCPF());

								}

								System.out.println("\nDigite sua escolha: ");
								int escolher_CPF = sc.nextInt();

								System.out.println("Tem certeza que é esse que deseja excluir? [1 - sim, 2 - não]");
								int certeza = sc.nextInt();

								if(certeza == 1) {
									SeachDelete.apagarCPFAluno(escolher_CPF, list_aluno, Aluno.getCad_aluno());

									if(list_aluno.size() < 1) {
										aluno.setCad_aluno(false);
									}

								}else {
									System.out.println("\nExclução cancelada");

									break;
								}

							case 2:

								System.out.println("\nQual matricula deseja excluir");
								for(int i = 0; i < list_aluno.size(); i++) {
									System.out.println(list_aluno.get(i).getMatricula());

								}

								System.out.println("\nDigite a sua escolha: ");
								int escolher_Matricula = sc.nextInt();

								System.out.println("Tem certeza que deseja excluir? [1 - sim, 2 - não]");
								int certeza2 = sc.nextInt();

								if(certeza2 == 1) {
									SeachDelete.apagarMatriculaAluno(escolher_Matricula, list_aluno, Aluno.getCad_aluno());

									if(list_aluno.size() < 1) {
										aluno.setCad_aluno(false);
									}

								}else {
									System.out.println("\nExclução cancelada");

									break;
								}

							}

						} else {
							System.out.println("\nNão existem alunos cadastrados no sistema.");
						}
						
						break;

					default:

					}

				}

				break;

			case 2:
				
				int gereciamento_docente = 0;
				Docentes docente = new Docentes(null, 0);

				System.out.println("\nVocê escolheu Gerenciamento de docentes.");
				System.out.print("Insira o que deseja realizar: ");
				
				while (gereciamento_docente != 5){ //menu docentes

					System.out.println("\n-------------------------------");
					System.out.println("1 - Adicionar Docente; ");
					System.out.println("2 - Registrar Docente em Disciplina; ");
					System.out.println("3 - Modificar informações de Docente; ");
					System.out.println("4 - Remover Doscente; ");
					System.out.println("5 - voltar. ");
					System.out.println("-------------------------------");
					System.out.print("\nDigite a opção desejada:");
					gereciamento_docente = sc.nextInt();
					
					switch(gereciamento_docente){

					case 1:

						System.out.println("\nVocê escolheu cadastro de docente");
						System.out.print("\nInsira o nome do docente: ");
						String nome = sc.next();

						System.out.print("Insira o CPF: ");
						int CPF = sc.nextInt();

						docente = new Docentes(nome, CPF);
						docente.setCad_docente(true);
						list_docente.add(docente);

						System.out.println("Docente " + docente.getNome() + " cadastrado!");

						break;
						
					case 2:
						
						// colocar a condição de existencia da disciplina aqui
						if(Docentes.getCad_docente() == true) {

							System.out.println("\nVocê escolheu o registro de docente em disciplina");

							for (int i = 0; i < list_docente.size(); i++){
								System.out.println(list_docente.get(i).getNome());

							}
							
							System.out.println("\nDigite o nome do docente que deseja registrar");
							String registrar_docente = sc.next();

							//colocar a disciplina que ele vai se registrar

							System.out.print("Tem certeza? [1 - Sim, 2 - N�o]: ");
							int certeza = sc.nextInt();
							
						} else {
							System.out.println("\nVocê não possui nenhum docente ou nenhuma disciplina cadastratos no sistema.");
						}
						
						break;
						
					case 3:

						if(Docentes.getCad_docente() == true) {

							System.out.println("\nVocê escolheu modificar informação de docente");

							System.out.println("1 - Nome");
							System.out.println("2 - CPF");

							System.out.println("\nDigite o numero da opção que deseja modificar: ");
							int docente_modificar = sc.nextInt();
							
							switch (docente_modificar) {

							case 1:

								System.out.println("\nQual nome deseja modificar? ");

								for (int i = 0; list_docente.size() > i;i++) {
									System.out.println(list_docente.get(i).getNome());

								}

								System.out.println("\nDigite sua opção: ");
								String escolher_nome = sc.next();

								if (SeachDelete.buscarNomeDocente(escolher_nome, list_docente) > -1) {

									System.out.println("Digite o novo nome: ");
									docente.setNome(sc.next());

									System.out.println("\nO novo nome é: " + docente.getNome());
								} else {
									System.out.println("Esse nome não existe.");

								}

								break;
								
							case 2:

								System.out.println("\nQual CPF deseja modificar?");

								for(int i = 0; list_docente.size() > i; i++) {
									System.out.println(list_docente.get(i).getCPF());

								}

								System.out.println("\nDigite sua opção: ");
								int escolher_CPF = sc.nextInt();

								if(SeachDelete.buscarCPFDocente(escolher_CPF, list_docente) > -1) {

									System.out.println("Digite o novo CPF: ");
									docente.setCPF(sc.nextInt());

									System.out.println("\nO novo CPF é: " + docente.getCPF());
								} else {
									System.out.println("Esse CPF não existe.");
								}

								break;
								
							}					

						} else {
							System.out.println("\nNão existem nenhum docente registrado");
						}
						
						break;	
						
					case 4:

						if(Docentes.getCad_docente() == true) {

							System.out.println("\nVocê escolheu excluir um docente");
							System.out.println("Qual CPF deseja excluir?");
							
							for(int i = 0; i < list_docente.size(); i++) {
								System.out.println(list_docente.get(i).getCPF());

							}

							System.out.println("\nDigite sua escolha: ");
							int escolher_CPF = sc.nextInt();
							
							System.out.println("Tem certeza que é esse que deseja excluir? [1 - sim, 2 - não]");
							int certeza = sc.nextInt();

							if(certeza == 1) {
								SeachDelete.apagarCPFAluno(escolher_CPF, list_aluno, Aluno.getCad_aluno());

								if(list_docente.size() < 1) {
									docente.setCad_docente(false);
								}

							}else {
								System.out.println("\nExclução cancelada");

							}
							
						} else {
							System.out.println("\nNão existem nenhum docente registrado");
						}
						
						break;
						
						default:
						
					}

				}
				
				break;

			case 3:
				
				int gereciamento_disci= 0;
				Disciplinas disci = new Disciplinas(null);

				System.out.println("\nVocê escolheu Gerenciamento de disciplinas.");
				System.out.print("Insira o que deseja realizar: ");
				
				while (gereciamento_disci != 5){ //menu alunos

					System.out.println("\n-------------------------------");
					System.out.println("1 - Adicionar Diciplina; ");
					System.out.println("2 - Registrar Diciplina em Turma; ");
					System.out.println("3 - Modificar informações de Disciplina; ");
					System.out.println("4 - Remover Disciplina; ");
					System.out.println("5 - voltar. ");
					System.out.println("-------------------------------");
					System.out.print("\nDigite a opção desejada:");
					gereciamento_disci = sc.nextInt();
					
					switch(gereciamento_disci){

					case 1:

						System.out.println("\nVocê escolheu cadastro de disciplina");
						System.out.print("\nInsira o nome da disciplina: ");
						String materia = sc.next();
						
						disci = new Disciplinas(materia);
						disci.setCad_disci(true);
						list_disci.add(disci);

						System.out.println("Disciplina " + disci.getMateria() + " cadastrada!");

						break;
						
					case 2:
						
					    // colocar a condição de existencia de turma
						if(Disciplinas.getCad_disci() == true) {

							System.out.println("\nVocê escolheu o registro de docente em disciplina");

							for (int i = 0; i < list_disci.size(); i++){
								System.out.println(list_disci.get(i).getMateria());

							}
							
							System.out.println("\nDigite o nome da diciplina que deseja registrar");
							String registrar_disci = sc.next();

							//colocar a turma que ele vai se registrar

							System.out.print("Tem certeza? [1 - Sim, 2 - N�o]: ");
							int certeza = sc.nextInt();
						} else {
							System.out.println("\nVocê não possui nenhuma disciplina ou nenhuma turma cadastratas no sistema.");
						}
						
						break;
						
					case 3:
						
						if(Disciplinas.getCad_disci() == true) {

							System.out.println("\nVocê escolheu modificar informação de disciplinas");
							System.out.println("Digite qual materia deseja modificar");
							
							for (int i = 0; i < list_disci.size(); i++){
								System.out.println(list_disci.get(i).getMateria());

							}
							
							System.out.println("\nDigite sua opção: ");
							String escolher_materia = sc.next();
							
							if(SeachDelete.buscarMateriaDisci(escolher_materia, list_disci) > -1) {

								System.out.println("Digite a nova materia: ");
								disci.setMateria(sc.next());

								System.out.println("\nA nova materia é: " + disci.getMateria());
							} else {
								System.out.println("Essa materia não existe.");
							}
							
						} else {
							System.out.println("\nNão existem nenhuma disciplina registrada");
						}
						
						break;
						
					case 4:
						
						if(Disciplinas.getCad_disci() == true) {

							System.out.println("\nVocê escolheu excluir uma disciplina");
							System.out.println("Qual materia deseja excluir?");
							
							for(int i = 0; i < list_disci.size(); i++) {
								System.out.println(list_disci.get(i).getMateria());

							}
							
							System.out.println("\nDigite sua escolha: ");
							String escolher_materia = sc.next();
							
							System.out.println("Tem certeza que é esse que deseja excluir? [1 - sim, 2 - não]");
							int certeza = sc.nextInt();
							
							if(certeza == 1) {
								SeachDelete.apagarMateriaDisci(escolher_materia, list_disci, Disciplinas.getCad_disci());

								if(list_disci.size() < 1) {
									disci.setCad_disci(false);
								}

							}else {
								System.out.println("\nExclução cancelada");
								
							}
							
						}else {
							System.out.println("\nNão existem nenhuma diciplina registrada");
						}
						
						break;
						
						default:
							
					}
					
				}
				
				break;
				
			case 4:
				
				int gereciamento_turma= 0;
				Turma turma = new Turma(null, 0, 0);

				System.out.println("\nVocê escolheu Gerenciamento de turmas.");
				System.out.print("Insira o que deseja realizar: ");
				
				while (gereciamento_turma != 5){ //menu docentes

					System.out.println("\n-------------------------------");
					System.out.println("1 - Adicionar Turma; ");
					System.out.println("2 - Registrar Docente em Disciplina; ");
					System.out.println("3 - Modificar informações de Docente; ");
					System.out.println("4 - Remover Doscente; ");
					System.out.println("5 - voltar. ");
					System.out.println("-------------------------------");
					System.out.print("\nDigite a opção desejada:");
					gereciamento_turma = sc.nextInt();
					
					switch(gereciamento_turma){

					case 1:

						System.out.println("\nVocê escolheu cadastro de turma");
						System.out.print("\nInsira a serie dessa turma: ");
						String serie = sc.next();
						
						System.out.println("Insira o ano de registro dess turma: ");
						int ano = sc.nextInt();
						
						System.out.println("Insira o codigo dessa turma: ");
						int codigo = sc.nextInt();
						
						turma = new Turma(serie, ano, codigo);
						turma.setCad_turma(true);
						list_turma.add(turma);

						System.out.println("A turma" + turma.getSerie() + " doe  cadastrada!");
						
						break;
					}
				}

			case 5:
				System.out.println("Você escolheu visualizar os relatórios.");
				System.out.print("Insira o código da turma que será visualizada: ");
				menu = sc.nextInt();

				for(int i = 0; i < list_turma.size(); i++){

					if(menu == list_turma.get(i).getCodigo()){
						System.out.println("Turma encontrada!");
						list_turma.get(i).mostrarInfo();

					} else {
						System.out.println("Erro! Código inválido inserido");
					}

				}
				break;

			case 6:
				System.out.println("\nObrigado por gerenciar a escola! ");
				System.out.println("Até a proxima! ");
				break;

			default:
				System.out.println("\nA opção que digitou é invalida, por favor insira uma opção válida: \n");

				break;
			}

		}
	}

}
