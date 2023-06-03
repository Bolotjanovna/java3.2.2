public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double body = 1.7;
        int index = (int) service.calculate(body);
        System.out.println(index);
    }
}