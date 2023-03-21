package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ConcreteDecoratorA extends Decorator{    
    void operation() { }
    
    void addItem(ComponentInterface item) { }
    void delItem(ComponentInterface item) { }
    ComponentInterface getChild(int n) {  return null; }
    
    void dummy() { }    
}
