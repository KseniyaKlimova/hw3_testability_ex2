public class BmiService {

    public int calculate(double weight, double height) {
        double bmi;
        bmi = weight / Math.pow(height, 2);
        return (int) bmi;
    }
}