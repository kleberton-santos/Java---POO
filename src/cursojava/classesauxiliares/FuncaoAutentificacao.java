package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutentificacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutentificacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}