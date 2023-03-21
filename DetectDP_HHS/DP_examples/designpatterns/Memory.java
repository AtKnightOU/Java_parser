package designpatterns;

/**
 *
 * @author Ed van Doorn 
 */

public class Memory {
    String toestand;
    
    Memory(String str) {
        toestand = str;
    }
    
    String getState() {
        return toestand;
    }
    
    void setState(String str) {
        toestand = str;
    }
}
