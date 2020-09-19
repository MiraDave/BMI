public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 52;
        double growth = 1.58;
        double bmi = service.calculate(weight, growth);
        System.out.println(bmi);
    }
}
