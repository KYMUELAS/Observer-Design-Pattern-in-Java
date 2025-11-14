public class Main {
    public static void main(String[] args) {
        Order order = new Order(101);

        Customer karen = new Customer("Karen");
        Customer john = new Customer("John");

        order.register(karen);
        order.register(john);

        order.setState("Preparing");
        order.setState("Ready for pickup");
    }
}