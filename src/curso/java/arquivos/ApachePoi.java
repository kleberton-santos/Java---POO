package curso.java.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Workspace-curso-java\\Curso-Java\\src\\curso\\java\\arquivos\\arquivo_xls.xsl");

		if (!file.exists()) {
			file.createNewFile();
		}

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

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // Usado para escrever planilha
		HSSFSheet linhaPessoa = hssfWorkbook.createSheet("Planilha de pessoa"); // Criar planilha

		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row linha = linhaPessoa.createRow(numeroLinha++); // Cria linha na planilha

			int celula = 0;
			
			Cell celNome = linha.createCell(celula++); // celula1
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++); // celula1
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++); // celula2
			celIdade.setCellValue(p.getIdade());
		}
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); // escreve a planilha em arquivo
		saida.flush();
		saida.close();
	}

}
