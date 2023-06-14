package cursojava;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
public static void main(String[] args) {
		
		Aluno aluno = new Aluno(); 
		aluno.setNome("Gilmar JDev - Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("84i84iieiejwjhwh");
		diretor.setNome("Egidio");
		diretor.setIdade(60);
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("1224494003930");
		secretario.setIdade(45);
		secretario.setNome("Marcelo");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pesssoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pesssoaMaiorIdade());
		System.out.println(secretario.pesssoaMaiorIdade());
		
		System.out.println("Salário Aluno é = " + aluno.salario());
		System.out.println("Salário Secretário é = " + secretario.salario());
		System.out.println("Salário Diretor é = " + diretor.salario());
		
		
		
		Pessoa pessoa = new Aluno();
		
		pessoa = secretario;
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa e demais " + pessoa.getNome()
		   +  " seu salário e de = " + pessoa.salario());
		
		
	}      
 
}