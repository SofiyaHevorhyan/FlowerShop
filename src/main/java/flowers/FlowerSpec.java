package flowers;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FlowerSpec {
    private double SepalLength;
    private Country OriginCountry;
    private FlowerType odor;
}
