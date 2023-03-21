package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ConcreteFirm1 extends AbstractCompany {
    @Override
    AbstractObjectA createProdA () {
        return new ProdA1();
    }
    
    @Override
    AbstractObjectB createProdB () {
        return new ProdB1();
    }
    
    @Override
    void doSomething() { }
}
