import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste MesTest.
 *
 * @author  Danizinha
 * @version 02/04/2020 16:53
 */
public class MesTest {
    
    private Mes mes = new Mes();
    
    /**
     * Construtor default para a classe de teste MesTest
     */
    public MesTest() {
        mes.setNumeroMes(1);
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
    public void testVerificarMes() {
        assertEquals("Janeiro", mes.verificarMes());
        
        mes.setNumeroMes(2);
        assertEquals("Fevereiro", mes.verificarMes());
        
        mes.setNumeroMes(3);
        assertEquals("Março", mes.verificarMes());
        
        mes.setNumeroMes(4);
        assertEquals("Abril", mes.verificarMes());
        
        mes.setNumeroMes(5);
        assertEquals("Maio", mes.verificarMes());
        
        mes.setNumeroMes(6);
        assertEquals("Junho", mes.verificarMes());
        
        mes.setNumeroMes(7);
        assertEquals("Julho", mes.verificarMes());
        
        mes.setNumeroMes(8);
        assertEquals("Agosto", mes.verificarMes());
        
        mes.setNumeroMes(9);
        assertEquals("Setembro", mes.verificarMes());
        
        mes.setNumeroMes(10);
        assertEquals("Outubro", mes.verificarMes());
        
        mes.setNumeroMes(11);
        assertEquals("Novembro", mes.verificarMes());
        
        mes.setNumeroMes(12);
        assertEquals("Dezembro", mes.verificarMes());
    }
       
}
