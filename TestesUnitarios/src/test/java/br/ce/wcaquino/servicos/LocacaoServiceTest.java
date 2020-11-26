package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static br.ce.wcaquino.utils.DataUtils.obterDataComDiferencaDias;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {

	@Test
	public void test() {
		//cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Maks");
		Filme filme = new Filme("Top Gun", 1, 10.0);
		
		//acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verificacao
		assertEquals(10.0, locacao.getValor(), 0.01);
		
		//Usando assertThat
		assertThat(locacao.getValor(), CoreMatchers.is(10.0));
		assertThat(locacao.getValor(), is(10.0));
		assertThat(locacao.getValor(), is(CoreMatchers.equalTo(10.0)));
		assertThat(locacao.getValor(), is(equalTo(10.0)));
		assertThat(locacao.getValor(), is(not(10.0)));
		
		assertTrue(isMesmaData(locacao.getDataLocacao(), new Date()));
		assertTrue(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)));
		
		assertThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		assertThat(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)), is(true));
	}

}
