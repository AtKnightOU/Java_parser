package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class StateMaker {
    String toestand;
    
    Memory makeState() {
        return new Memory(toestand);
    }
    
    void setMemento(Memory gedenk) {
        toestand = gedenk.getState();
    }   
}
