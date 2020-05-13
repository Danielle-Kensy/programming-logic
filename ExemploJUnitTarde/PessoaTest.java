import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PessoaTest.
 *
 * @author  Thiago Cury
 * @version 1.0
 */
public class PessoaTest {
    
    private Pessoa pessoa = new Pessoa();
    
    public PessoaTest() {
        pessoa.setIdade(20);
    }
    
    @Before
    public void setUp() {
        pessoa.setIdade(20);
        System.out.println("passou no setUP");
    }
    
    @After
    public void tearDown() {
        System.out.println("passou no tearDown");        
    }
    
    @Test
    public void testCalcularIdadeMeses() {
        System.out.println("passou no idade em meses");
        assertEquals(240, pessoa.calcularIdadeMeses());
        pessoa.setIdade(30);
        assertEquals(360, pessoa.calcularIdadeMeses());
    }
    
    @Test
    public void testCalcularIdadeSemanas() {
        System.out.println("passou no idade em semanas");
        //int, long ou byte
        assertEquals(960, pessoa.calcularIdadeSemanas()); 
    }    
    
    @Test
    public void testCalcularIdadeLoka() {
        System.out.println("passou no idade em loka");
        //float e double
        // (expected, actual, delta)
        assertEquals(21.0, pessoa.calcularIdadeLoka(), 2.0); 
    }
    
    @Test
    public void testCalcularIdadeComNome() {
        System.out.println("passou no idade com nome");
        //String
        assertEquals("thiago20", pessoa.calcularIdadeComNome("thiago")); 
    }    

}
