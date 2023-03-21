package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public abstract class AbstractCompany {
    abstract AbstractObjectA createProdA ();    
    abstract AbstractObjectB createProdB (); 
    
    void doSomething() {}
}
