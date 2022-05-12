package steps;

import org.openqa.selenium.Keys;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.elementos;
import metodos.Metodos;

public class Steps {

	Metodos m = new Metodos();
	elementos e = new elementos();

	@Dado("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String arg1) throws Throwable {
		m.execultarNavegador(arg1);
	}

	@Dado("^selecione o campo abra a sua conta$")
	public void selecione_o_campo_abra_a_sua_conta() throws Throwable {
		m.clicar(e.getBtnabrirSuaConta());
	}

	@Dado("^preencha os dados$")
	public void preencha_os_dados() throws Throwable {
	}

	@Dado("^selecione a politica de privacidade$")
	public void selecione_a_politica_de_privacidade() throws Throwable {
		m.pausa(3000);
		m.preencher(e.getCampoNome(), "cavalheiro automatizador");
		m.preencher(e.getCampoTelefone(), "11111111111");
		m.preencher(e.getCampoEmail(), "teste@teste.com");
		m.preencher(e.getCampoCpf(), "34514913030");
		m.preencher(e.getCampoDataNascimento(), Keys.chord("30121994"));
		m.clicar(e.getBtnCookies());
		m.clicar(e.getCaixaTratamentosDeDados());

	}

	@Quando("^selecionar o botao continuar$")
	public void selecionar_o_botao_continuar() throws Throwable {
		m.pausa(4000);
		m.clicar(e.getBotaoContinuar());
	}

	@Entao("^realizo a validacao do texto Prontinho! Recebemos os seus dados$")
	public void realizo_a_validacao_do_texto_Prontinho_Recebemos_os_seus_dados() throws Throwable {
		m.pausa(3000);
		m.validarTexto("Prontinho! Recebemos os seus dados.", e.getValidacaoTexto());
	}

}
