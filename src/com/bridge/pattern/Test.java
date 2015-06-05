package com.bridge.pattern;

import com.bridge.notpattern.pattern.BlueCircle;
import com.bridge.notpattern.pattern.RedCircle;

/**
 * Created by wyr on 2015/6/5.
 */

//In my experience, Bridge is the most often recurring pattern, because it's the solution whenever
// there are two orthogonal dimensions in the domain. E.g. shapes and drawing methods,
// behaviours and platforms, file formats and serializers and so forth.

//The Bridge pattern is an application of the old advice, "prefer composition over inheritance".
// It becomes handy when you must subclass different times in ways that are orthogonal with one another.
// Say you must implement a hierarchy of colored shapes.
// You wouldn't subclass Shape with Rectangle and Circle and then subclass Rectangle with RedRectangle,
// BlueRectangle and GreenRectangle and the same for Circle, would you?
// You would prefer to say that each Shape has a Color and to implement a hierarchy of colors, and that is the Bridge Pattern.
// Well, I wouldn't implement a "hierarchy of colors", but you get the idea.


public class Test {
    public static void main(String[] args) {
       Circle redCircle = new Circle(new Red());
        redCircle.draw();
        Circle blueCircle = new Circle(new Blue());
        blueCircle.draw();
    }
}
