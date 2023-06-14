package cursojava;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8,5.2,5.5,10.1};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Kleber");
		aluno.setIdade(35);
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplina().add(disciplina);
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d: arrayAlunos[pos].getDisciplina()) {
				System.out.println("Nome da disciplina: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota numero " + (posnota + 1) + " é " + d.getNota()[posnota]);
				}
			}
		}
		
		
		
		
//		System.out.println("Nome do aluno = " + aluno.getNome() + " Idade = " + aluno.getIdade());
//		for (Disciplina d : aluno.getDisciplina()) {
//			System.out.println(d.getDisciplina());
//			
//			double notaMax = 0.0;
//			for (int pos = 0; pos < d.getNota().length; pos++) {
//				System.out.println("nota " +(pos + 1)+ " igual = " + d.getNota()[pos]);
//				if(pos == 0) {
//					notaMax = d.getNota()[pos];
//				} else
//					if(d.getNota()[pos] > notaMax) {
//					notaMax = d.getNota()[pos];
//				}
//			}
//			
//			System.out.println("A Maior nota da Disciplina = " + d.getDisciplina() + "e de valor: " + notaMax);
//		}
		
		
		
//		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
//		
//		double[] notas = new double[Integer.parseInt(posicoes)];
//		
//		for(int pos = 0; pos < notas.length; pos++) {
//			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + (pos + 1));
//			notas[pos] = Double.valueOf(valor);
//		}
//		
//		for(int pos = 0; pos < notas.length; pos++) {
//			System.out.println("Nota " + (pos + 1) + " é " + notas[pos]);
//		}
	}
}
