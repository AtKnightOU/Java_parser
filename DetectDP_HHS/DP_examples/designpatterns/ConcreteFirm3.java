package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ConcreteFirm3 extends AbstractCompany {
    @Override
    ProdA3 createProdA () {
        return ProdA3.getThisProduct();
    }
    
    @Override
    ProdB3 createProdB () {
        return new ProdB3();
    }  
}
