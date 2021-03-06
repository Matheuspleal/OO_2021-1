package ArquivosDeTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import toyStore.srcCode.Brinquedo;
import toyStore.srcCode.Cliente;


/**
 * Classe de teste para atributos do cliente.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */
class ClienteTest {
	
	
	/**
	 * Testa a adicao de um item no carrinho do cliente
	 * 
	 * @throws CloneNotSupportedException
	 * */
	@Test
	void testaAdicaoNoCarrinho() throws CloneNotSupportedException{
		boolean adicionou = false;
		
		Brinquedo brinquedo = new Brinquedo("Teste", "Teste", "Teste", 10.2, 5, 10, 123);
		
		Cliente teste = new Cliente("John Doe", "012.345.678-90");
		
		int itensNoCarrinho_anterior = teste.getCarrinho().size();
		
		teste.AdicionaItem(brinquedo.clone(), 2);
		
		if(itensNoCarrinho_anterior == (teste.getCarrinho().size()-1)) {
			adicionou = true;
		}
		
		Assertions.assertTrue(adicionou);
		Assertions.assertEquals(itensNoCarrinho_anterior, (teste.getCarrinho().size()-1));
	}

}
