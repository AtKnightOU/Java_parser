package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ConcreteFirm2 extends AbstractCompany {
    @Override
    ProdA2 createProdA () {
        return new ProdA2();
    }
    
    @Override
    ProdB2 createProdB () {
        return new ProdB2();
    }    
}
