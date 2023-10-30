// Concrete implementation of the Creator interface for creating ConcreteProduct2
public class ConcreteCreator2 implements Creator {

    // Implementation of the factoryMethod to create a ConcreteProduct1 instance
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
