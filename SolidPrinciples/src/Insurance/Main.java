package Insurance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("brainy",21);
        customer.healthInsurance = new HealthInsurance();
        customer.fileClaim("Si31tyu6378");
    }
}
