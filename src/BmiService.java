public class BmiService {
    public double calculate (int weight, double height){
        double mass = weight / (height * height);
        return mass;
    }

}
