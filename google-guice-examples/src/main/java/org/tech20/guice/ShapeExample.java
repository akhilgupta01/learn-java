package org.tech20.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.tech20.guice.shapes.ShapeManager;
import org.tech20.guice.shapes.modules.BasicModule;

public class ShapeExample {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        ShapeManager shapeManager = injector.getInstance(ShapeManager.class);
        shapeManager.printArea();
    }
}
