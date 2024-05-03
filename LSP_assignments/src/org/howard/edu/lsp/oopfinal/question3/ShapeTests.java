package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ShapeTests {

    @Test
    public void testCircleCreation() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCircleDraw() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw(); // Expected to print "I'm a Circle!!!"
    }

    @Test
    public void testRectangleDraw() {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw(); // Expected to print "I'm a Rectangle!!!"
    }
}
