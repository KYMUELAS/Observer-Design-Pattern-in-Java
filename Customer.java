public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String state, int orderId) {
        System.out.println("Customer " + name + ": your order #" + orderId + " is now '" + state + "'");
    }
}