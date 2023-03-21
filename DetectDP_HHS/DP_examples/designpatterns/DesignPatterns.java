/** 
 * These Java sources contain the design patterns:
 *       Abstract Factory
 *       Builder
 *       Factory Method variant 1
 *       Singleton
 *       State / Strategy
 * 
 * The file templates.xml contains the specification of the the design patterns.
 * The specifications are based on
 * 'Design patterns: elements of reusable object-oriented software',
 * written by Erich Gamma et al.
 * 
 * The correspondence between the classes in the Java sources and
 * the specifications is given below.
 * 
 * 
 * Design pattern: Factory Method variant 1
 * ----------------------------------------
 * System names          --> Template names
 * AbstractCompany       --> Creator
 * AbstractObjectA       --> Product
 * ConcreteFirm1         --> ConcreteCreator
 * ConcreteFirm2         --> ConcreteCreator
 * ProdA1                --> ConcreteProduct
 * ProdA2                --> ConcreteProduct
 * 
 * 
 * Design pattern: Singleton
 * -------------------------
 * System names          --> Template names
 * ProdA3                --> Singleton
 * 
 * 
 * Design pattern: Adapter
 * -----------------------
 * System names          --> Template names
 * Adapted               --> Adaptee
 * ConcreteGoal          --> Adapter
 * Customer              --> Client
 * Target                --> Target
 * 
 * 
 * Design pattern: Adapter
 * -----------------------
 * System names          --> Template names
 * Customer              --> Client
 * Flw                   --> Target
 * FlwConcrete           --> Adaptee
 * ProxyFlw              --> Adapter
 * 
 * 
 * Design pattern: Adapter
 * -----------------------
 * System names          --> Template names
 * Customer              --> Client
 * TweedeProxy           --> Adapter
 * TweedeRealSubject     --> Adaptee
 * TweedeSubject         --> Target
 * 
 * 
 * Design pattern: Bridge
 * ----------------------
 * System names            --> Template names
 * AbstractLeftSideBridge  --> Abstraction
 * AbstractObjectA         --> Implementor
 * ConcreteLeftSide0Bridge --> RefinedAbstraction
 * ConcreteLeftSide1Bridge --> RefinedAbstraction
 * ProdA1                  --> ConcreteImplementor
 * ProdA2                  --> ConcreteImplementor
 * ProdA3                  --> ConcreteImplementor
 * 
 * 
 * Design pattern: Bridge
 * ----------------------
 * System names          --> Template names
 * ComponentInterface    --> Implementor
 * ConcreteComponentInt  --> ConcreteImplementor
 * ConcreteDecoratorA    --> RefinedAbstraction
 * ConcreteDecoratorB    --> RefinedAbstraction
 * Decorator             --> Abstraction
 * 
 * 
 * Design pattern: Decorator
 * -------------------------
 * System names          --> Template names
 * ComponentInterface    --> Component
 * ConcreteComponentInt  --> ConcreteComponent
 * ConcreteDecoratorA    --> ConcreteDecorator
 * ConcreteDecoratorB    --> ConcreteDecorator
 * Decorator             --> Decorator
 * 
 * 
 * Design pattern: Flyweight
 * -------------------------
 * System names          --> Template names
 * Customer              --> Client
 * Flw                   --> Flyweight
 * FlwConcrete           --> ConcreteFlyweight
 * FlwProducer           --> FlyweightFactory
 * FlwUnsharedConcrete   --> UnsharedConcreteFlyweight
 * 
 * 
 * Design pattern: Flyweight
 * ----------------------------------------
 * System names          --> Template names
 * Customer              --> Client
 * Flw                   --> Flyweight
 * FlwConcrete           --> UnsharedConcreteFlyweight
 * FlwProducer           --> FlyweightFactory
 * FlwUnsharedConcrete   --> ConcreteFlyweight
 * 
 * 
 * Design pattern: Proxy
 * ---------------------
 * System names          --> Template names
 * Customer              --> Client
 * Flw                   --> Subject
 * FlwConcrete           --> RealSubject
 * ProxyFlw              --> Proxy
 * 
 * 
 * 
 * Design pattern: Proxy
 * ---------------------
 * System names          --> Template names
 * Customer              --> Client
 * TweedeProxy           --> Proxy
 * TweedeRealSubject     --> RealSubject
 * TweedeSubject         --> Subject
 * 
 * 
 * Design pattern: Mediator
 * ------------------------
 * System names          --> Template names
 * Employee              --> Colleague
 * EmployeeA             --> ConcreteColleague
 * EmployeeB             --> ConcreteColleague
 * Mediator              --> Mediator
 * MediatorRealizor      --> ConcreteMediator
 * 
 * 
 * Design pattern: Memento
 * -----------------------
 * System names          --> Template names
 * CareManager           --> Caretaker
 * Memory                --> Memento
 * OriginMemento         --> Originator
 * 
 * 
 * Design pattern: Memento
 * -----------------------
 * System names          --> Template names
 * CareManager           --> Caretaker
 * Memory                --> Memento
 * StateMaker            --> Originator
 * 
 * 
 * Design pattern: State
 * ---------------------
 * System names          --> Template names
 * Flw                   --> State
 * FlwConcrete           --> ConcreteState
 * FlwProducer           --> Context
 * FlwUnsharedConcrete   --> ConcreteState
 * ProxyFlw              --> ConcreteState
 * 
 * 
 * Design pattern: Strategy
 * ------------------------
 * System names          --> Template names
 * Flw                   --> Strategy
 * FlwConcrete           --> ConcreteStrategy
 * FlwProducer           --> Context
 * FlwUnsharedConcrete   --> ConcreteStrategy
 * ProxyFlw              --> ConcreteStrategy
 *
 */


package designpatterns;

/**
 *
 * @author Ed van Doorn
 */

public class DesignPatterns {
    public static void main(String[] args) {
        new Customer();
    }   
}
