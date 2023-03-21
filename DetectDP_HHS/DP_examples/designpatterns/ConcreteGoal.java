package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ConcreteGoal extends Target{
    Adapted supplier;
    
    ConcreteGoal() {
        supplier = new Adapted();
    }
    
    @Override
    void request() {
        supplier.myRequest();
    }  
}
