package flowers;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Color {
    RED("#FF0"),
    BLUE("#00F"),
    GREEN("#00FF00"),
    WHITE("#FFF"),
    PURPLE("#F0F");

    private String rgb;

    Color(String rgb) {
        this.rgb = rgb;
    }
}