package Test;

import domain.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StreamTest {

    @Test
    public void nomesFeminino() {
        Pessoa pessoa = new Pessoa("Maria", "F", 20);
        Assert.assertEquals("F", pessoa.getGenero());

    }

}