import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste PesoIdealTest.
 *
 * @author  Danizinha 
 * @version 03/04/2020 17:00
 */
public class PesoIdealTest {
    
    private PesoIdeal pesoIdeal = new PesoIdeal();
    
    /**
     * Construtor default para a classe de teste PesoIdealTest
     */
    public PesoIdealTest() {
        
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        pesoIdeal.setPeso(45);
        pesoIdeal.setAltura(1.60);
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
    public void testCalcularIMC() {
        assertEquals(17.578124999999996, pesoIdeal.calcularIMC(), 0.0);
    }
    
    @Test 
    public void testVerificarPesoIdeal() {
        assertEquals("Abaixo do peso", pesoIdeal.verificarPesoIdeal());
        
        pesoIdeal.setPeso(49);
        assertEquals("Peso ideal", pesoIdeal.verificarPesoIdeal());
        
        pesoIdeal.setPeso(65);
        assertEquals("Sobrepeso", pesoIdeal.verificarPesoIdeal());
        
        pesoIdeal.setPeso(80);
        assertEquals("Obesidade grau 1", pesoIdeal.verificarPesoIdeal());
        
        pesoIdeal.setPeso(95);
        assertEquals("Obesidade grau 2 (severa)", pesoIdeal.verificarPesoIdeal());
        
        pesoIdeal.setPeso(106);
        assertEquals("Obesidade grau 3 (mórbida)", pesoIdeal.verificarPesoIdeal());
    }
}
