public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 65;
        double height = 1.76;
        double mass = service.calculate(weight, height);
        System.out.println(mass);
        }
    }
