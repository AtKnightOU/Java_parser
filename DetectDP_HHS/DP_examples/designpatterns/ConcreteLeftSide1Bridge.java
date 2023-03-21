package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class ConcreteLeftSide1Bridge extends AbstractLeftSideBridge {
    void printC1() { printMyContent(1); }
    void printI1() { printMyIndex(1); }
}
