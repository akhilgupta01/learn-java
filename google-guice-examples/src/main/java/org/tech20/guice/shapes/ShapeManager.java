package org.tech20.guice.shapes;

import com.google.inject.name.Named;
import org.tech20.guice.shapes.model.Shape;

import javax.inject.Inject;

public class ShapeManager {
    @Inject
    private Shape shape;

    public void printArea() {
        System.out.println(shape.area());
    }


}
