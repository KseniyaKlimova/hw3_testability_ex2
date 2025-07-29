public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес в кг
        double height = 1.87; // рост в м
        int bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}