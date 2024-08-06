package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> layerElements;

    public Layer(T[] elements) {
        this.layerElements = new ArrayList<>(List.of(elements));
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for(T element: layerElements) {
            element.render();
        }
    }

}
