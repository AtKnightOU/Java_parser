package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ProdA3 extends AbstractObjectA {
    private static ProdA3 thisProduct = null;
    
    private ProdA3() {
    }
    
    @Override
    void printIndex() {}
    
    @Override
    void printContent() {}
    
    public static ProdA3 getThisProduct() {
        return (thisProduct == null) ? new ProdA3() : thisProduct;   
    }
}
