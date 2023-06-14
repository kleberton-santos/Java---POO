package cursojava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutentificacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* main é um método em Java auto executável */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			
//			try {
//				File file = new File("c://lines.txt");
//				Scanner sc = new Scanner(file);
//			}catch (FileNotFoundException e) {
//				throw new ExcecaoProcessarNota(e.getMessage());
//			}

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutentificacao(new Diretor(login, senha)) 
					.autenticar()) {/* se TRUE acessa se False não acessa */

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * é uma lista que dentro dela temos uma chave que identifica uma sequencia de
				 * valores
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					
					 String idade = JOptionPane.showInputDialog("Qual é a idade? "); 
					 /* dataNascimento = JOptionPane.showInputDialog("Data de nascimento? "); String
					 * rg = JOptionPane.showInputDialog("Registro Geral? "); String cpf =
					 * JOptionPane.showInputDialog("Qual número do CPF? "); String mae =
					 * JOptionPane.showInputDialog("Nome da mãe? "); String pai =
					 * JOptionPane.showInputDialog("Nome do pai? "); String matricula =
					 * JOptionPane.showInputDialog("Qual data da matrícula? "); String serie =
					 * JOptionPane.showInputDialog("Qual é a série? "); String escola =
					 * JOptionPane.showInputDialog("nome da escola? ");/*
					 * 
					 * /* new Aluno() é uma instância (Criação do objeto)
					 */
					/* aluno é uma referência para objeto aluno */

					Aluno aluno = new Aluno();

					aluno.setNome(nome);
					
					 aluno.setIdade(Integer.valueOf(idade));
					 /* aluno.setDataNascimento(dataNascimento); aluno.setRegistroGeral(rg);
					 * aluno.setNumeroCpf(cpf); aluno.setNomeMae(mae); aluno.setNomePai(pai);
					 * aluno.setDataMatricula(matricula); aluno.setSerieMatriculado(serie);
					 * aluno.setNomeEscola(escola);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno.getDisciplina().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

					if (escolha == 0) {/* Opção SIM e Zero */

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
							aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
						}
					}

					alunos.add(aluno);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("-------------------lista dos Aprovados-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("O aluno " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado()
							+ " a média foi : " + aluno.getMediaNota());

				}
				System.out.println("-------------------lista de Recuperação-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("O aluno " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado()
							+ " a média foi : " + aluno.getMediaNota());
				}
				System.out.println("-------------------lista dos Reprovados-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("O aluno " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado()
							+ " a média foi : " + aluno.getMediaNota());

				}

			} else {
				JOptionPane.showConfirmDialog(null, "Acesso não permitido ");
			}

		} catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();
			
			// imprime o erro no console java
			e.printStackTrace(); 
			
			// Mensagem do erro ou causa
			System.out.println(" Mensagem: " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				saida.append("\nClasse de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\nClasse de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\nClasse de erro: " + e.getStackTrace()[pos].getLineNumber());
			}

			JOptionPane.showConfirmDialog(null, "Erro ao processar notas " + saida.toString());
		}
		
	
	
	}
}
