package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Vixi erro no processamento do arquivo" + erro);
	}

}
