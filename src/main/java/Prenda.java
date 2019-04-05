import java.util.Objects;

public class Prenda {
    TipoDePrenda tipoDePrenda;
    Material material;
    Color color;
    Color colorSecundario;

    Prenda(TipoDePrenda tipoDePrenda, Material material, Color color) {
        this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio");
        this.material = Objects.requireNonNull(material, "material es obligatorio");
        this.color = Objects.requireNonNull(color, "color es obligatorio");
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}
