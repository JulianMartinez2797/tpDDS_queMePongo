import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrendaTest {
    @Test
    public void unaPrendaSeCreaCorrectamente() {
        TipoDePrenda zapato = new TipoDePrenda(Categoria.CALZADO);
        Color azulClaro = new Color(95,159,159);
        Prenda botines = new Prenda(zapato, Material.CUERO, azulClaro);

        Assert.assertNotNull(botines);
    }
}