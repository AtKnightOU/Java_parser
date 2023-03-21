package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ProxyFlw extends Flw{
    private FlwConcrete flwc;
    
    @Override
    void doSomething(String s) { flwc.doSomething(s);}    
}
