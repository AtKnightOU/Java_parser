package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class OriginMemento {
    String state;
    
    void bewaarMemory(Memory mem) {
        state = mem.getState();
    }
    
    Memory createMomory() { 
        return new Memory(state);
    }   
}
