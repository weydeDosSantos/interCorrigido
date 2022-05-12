package elementos;

import org.openqa.selenium.By;

public class elementos {

	
	private By btnabrirSuaConta = By.cssSelector("#gatsby-focus-wrapper > div > main > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By campoDataNascimento = By.id("dataNascimento");
	private By caixaTratamentosDeDados = By.cssSelector("body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label");
	private By botaoContinuar = By.xpath("/html/body/div[5]/div[2]/div/div[2]/form/div/div[7]/button");
	private By btnCookies = By.id("onetrust-accept-btn-handler");
	public By getBtnCookies() {
		return btnCookies;
	}
	public void setBtnCookies(By btnCookies) {
		this.btnCookies = btnCookies;
	}
	public By getBtnabrirSuaConta() {
		return btnabrirSuaConta;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getCampoDataNascimento() {
		return campoDataNascimento;
	}
	public By getCaixaTratamentosDeDados() {
		return caixaTratamentosDeDados;
	}
	public By getBotaoContinuar() {
		return botaoContinuar;
	}
	
}
