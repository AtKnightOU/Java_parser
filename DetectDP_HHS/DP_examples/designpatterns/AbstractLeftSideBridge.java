package designpatterns;

import java.util.ArrayList;

/**
 *
 * @author ed
 */

public abstract class AbstractLeftSideBridge {
    ArrayList <AbstractObjectA> objA;
    
    void printMyIndex(int i ) { objA.get(i).printIndex();}
    void printMyContent(int i){ objA.get(i).printContent(); }
}
