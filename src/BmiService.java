public class BmiService {
    public int calculate(double body) {
        int index = (int) (60 / (body * body));
        return index;
    }
}
