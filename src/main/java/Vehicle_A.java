public abstract class Vehicle_A {                   // Abstraction: An abstract class achieves partial abstraction.
    abstract void fuel();                           // It is a superclass (parent class) that cannot be instantiated;
    abstract void wheels();                         // you need to instantiate one of its child classes if you want to
                                                    // create a new object. Abstract classes can have both abstract and
    void label() {                                  // concrete methods. They are defined by the "abstract" keyword.
        System.out.println("Vehicle's data: ");
    }
}
