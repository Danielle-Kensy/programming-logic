import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AlunoTest.
 *
 * @author  Danizinha
 * @version 04/04/2020 16:53
 */
public class AlunoTest
{
    
    private Aluno aluno = new Aluno();
    
    /**
     * Construtor default para a classe de teste AlunoTest
     */
    public AlunoTest() {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        aluno.setNota1(9);
        aluno.setNota2(9);
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
    public void testCalcularMedia() {
        assertEquals(9.0, aluno.calcularMedia(), 0.0);
    }
    
    @Test
    public void testVerificarConceito() {
        assertEquals("Conceito A, Parabéns!!!", aluno.verificarConceito());
        
        aluno.setNota2(7);
        assertEquals("Conceito B", aluno.verificarConceito());
        
        aluno.setNota2(5);
        assertEquals("Conceito C", aluno.verificarConceito());
        
        aluno.setNota2(1);
        assertEquals("Conceito D", aluno.verificarConceito());
    }
    
    @Test
    public void testVerificarSituacao() {
        assertEquals("Aprovado.", aluno.verificarSituacao());
        
        aluno.setNota2(1);
        assertEquals("Reprovado.", aluno.verificarSituacao());
    }
}
