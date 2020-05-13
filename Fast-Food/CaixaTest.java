import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste CaixaTest.
 *
 * @author  Danizinha
 * @version 04/04/2020
 */
public class CaixaTest
{
    
    Caixa caixa = new Caixa();
    
    /**
     * Construtor default para a classe de teste CaixaTest
     */
    public CaixaTest() {
        caixa.setQuantidade(1);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testVerificarOpcao() {

        assertEquals("\n#########Seu pedido###########" 
                  +"\nSanduíche de Presunto: "+1
                  +"\nValor total do pedido: R$"+3.65, caixa.verificarOpcao(1));
        
        assertEquals("\n#########Seu pedido###########"
                  +"\nSuco de Tamarindo: " +1
                  +"\nValor total do pedido: R$"+2.50, caixa.verificarOpcao(2));
                  
        assertEquals("\n#########Seu pedido###########"
                  +"\nPastel com ovo: "+1
                  +"\nValor total do pedido: R$"+3.30, caixa.verificarOpcao(3));
        
        assertEquals("\n#########Seu pedido###########"
                  +"\nFarroupilha: "+1
                  +"\nValor total do pedido: R$"+4.70, caixa.verificarOpcao(4));
    }
    
}
