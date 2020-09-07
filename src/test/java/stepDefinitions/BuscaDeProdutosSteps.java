package stepDefinitions;

import baseClass.BaseSteps;
import cucumber.api.java.pt.Dados;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.BuscaProdutosPage;
import pageObjects.ResultadoBuscaPage;

public class BuscaDeProdutosSteps extends BaseSteps {

	/**
	 * Paginas necessaria
	 **/
	BuscaProdutosPage paginaInicial = new BuscaProdutosPage(BaseSteps.browser);
	ResultadoBuscaPage paginaResultadoBusca = new ResultadoBuscaPage(BaseSteps.browser);

	
	/**
	 * FluxoBase_BuscaDeProdutos
	 **/
	@Dados("^que o usuario acesse o site do Magazine Luiza$")
	public void que_o_usuario_acesse_o_site_do_Magazine_Luiza() {
		paginaInicial.abrirPagina();
		paginaInicial.verificaSeEstouNaPagina();
	}

	@Quando("^o usuario buscar por \"([^\"]*)\"$")
	public void o_usuario_buscar_por(String produto) {
		paginaInicial.preencheInputPesquisa(produto);
		paginaInicial.clicaNoBotaoPesquisar();
	}

	@Entao("^o sistema mostra resultado maior que Zero$")
	public void o_sistema_mostra_resultado_maior_que_Zero() {
		paginaResultadoBusca.verificaSeEstouNaPagina();
	}

	@E("^o sistema mostra a lista de produto\\(s\\) encontrado\\(s\\)$")
	public void oSistemaMostraAListaDeProdutoSEncontradoS() {

	}
}
