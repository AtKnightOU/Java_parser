package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class Customer {    
    Target goal;
    AbstractLeftSideBridge leftSide;
    Flw flw;
    FlwProducer flwProducer;
    FlwConcrete flwReal;
    FlwUnsharedConcrete flwUnsharedReal;
    EmployeeA employeeA;
    EmployeeB employeeB;
    CareManager verzorger;
    TweedeSubject tweedeSubject;    
    
    Customer() {        
        goal = new ConcreteGoal();
             
        leftSide = new ConcreteLeftSide0Bridge();
        
        flwProducer = new FlwProducer ();
        flwReal = new FlwConcrete();
        flwUnsharedReal = new FlwUnsharedConcrete();
    }  
    
    void doeSomething() {}
}
