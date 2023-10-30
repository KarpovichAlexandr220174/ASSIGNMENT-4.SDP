// Concrete implementation of the Creator interface for creating ConcreteProduct3
public class ConcreteCreator3 implements Creator {

    // Implementation of the factoryMethod to create a ConcreteProduct1 instance
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
