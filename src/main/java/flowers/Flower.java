package flowers;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Flower {
    private FlowerType type;
    private Color color;
    private double price;

    private FlowerSpec spec;

    public double getSepalLength() {
        return spec.getSepalLength();
    }

    public void setSepalLength(double SepalLength) {
        spec.setSepalLength(SepalLength);
    }

    public Country getOriginCountry() {
        return spec.getOriginCountry();
    }

    public void setOriginCountry(Country country) {
        spec.setOriginCountry(country);
    }

    public FlowerType getOdor() {
        return spec.getOdor();
    }

    public void setOdor(FlowerType odor) {
        spec.setOdor(odor);
    }
}
