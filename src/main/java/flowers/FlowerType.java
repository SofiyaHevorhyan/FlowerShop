package flowers;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum FlowerType {
    TULIP("Tulip", "beautiful color"),
    CHAMOMILE("Chamomile", "beautiful odor"),
    ROSE("Rose", "spikes"),
    VIOLA("Viola", "different tone");

    private String name;
    private String addAttribute;

    FlowerType(String name, String attribute) {
        this.name = name;
        this.addAttribute = attribute;
    }
}
