package designpatterns;

import java.util.ArrayList;

/**
 *
 * @author Ed van Doorn
 */

public abstract class Decorator extends ComponentInterface {
    ArrayList <ComponentInterface> components;
    
    @Override
    void doSomething() { components.get(0).doSomething(); 
    }
}
