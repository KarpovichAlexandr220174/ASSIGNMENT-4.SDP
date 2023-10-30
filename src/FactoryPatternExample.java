public class FactoryPatternExample {
    public static void main(String[] args) {

        Creator creator1 = new ConcreteCreator1();
        Product product1 = creator1.factoryMethod();

        Creator creator2 = new ConcreteCreator2();
        Product product2 = creator2.factoryMethod();

        product1.create();
        product2.create();

        Creator creator3 = new ConcreteCreator3();
        Product product3 = creator3.factoryMethod();

        product3.create();

    }
}
