// Concrete implementation of the Product interface representing a specific product (Milk)
public class ConcreteProduct3 implements Product {

    // Implementation of the create method specified in the Product interface
    @Override
    public void create() {
        System.out.println("Milk created");
    }
}
