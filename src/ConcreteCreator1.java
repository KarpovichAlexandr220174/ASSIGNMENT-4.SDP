// Concrete implementation of the Creator interface for creating ConcreteProduct1
public class ConcreteCreator1 implements Creator {

    // Implementation of the factoryMethod to create a ConcreteProduct1 instance
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
