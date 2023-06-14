package curso.java.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Kleber");
		pessoa1.setEmail("kleber@kleber");
		pessoa1.setIdade(36);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Le");
		pessoa2.setEmail("Le@kleber");
		pessoa2.setIdade(31);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Nino");
		pessoa3.setEmail("nino@kleber");
		pessoa3.setIdade(5);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Workspace-curso-java\\Curso-Java\\src\\curso\\java\\arquivos\\arquivo.csv");
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
	
		escrever_no_arquivo.flush(); // persisitr
		escrever_no_arquivo.close(); // fecha
	}

}
