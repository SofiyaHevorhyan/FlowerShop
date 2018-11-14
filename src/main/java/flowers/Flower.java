package flowers;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Flower {
    private FlowerType type;
    private Color color;
    private float price;
    private FlowerSpec spec;

    public double getSepalLength() {
        return spec.getSepalLength();
    }

    public void setSepalLength(double SepalLength) {
        spec.setSepalLength(SepalLength);
    }


}
