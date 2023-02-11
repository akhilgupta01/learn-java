package org.tech20.guice.shapes.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.tech20.guice.shapes.model.Shape;
import org.tech20.guice.shapes.model.Square;
import org.tech20.guice.shapes.model.Triangle;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        //bind(Shape.class).toInstance(new Triangle(12, 5));
        bind(Shape.class).to(Triangle.class);
        bind(Shape.class).annotatedWith(Names.named("Quad")).to(Square.class);
    }
}
