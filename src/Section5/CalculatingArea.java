package Section5;

public class CalculatingArea {
    public static void main(String[] args) {
        System.out.println(calcCentripetalForce(0.2,0.8, 3));
    }

    /**
     * This method calculates the area of a circle
     * It uses formula area = PI * radius^2
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calcPathVelocity(double radius,double period) {
        double circumference = 2 * Math.PI * radius;
        return circumference/period;
    }

    public static double calcCentripetalAccel(double pathVel, double radius){
        return Math.pow(pathVel,2) / radius;
    }

    public static double calcCentripetalForce(double mass, double acc){
        return mass*acc;
    }

    public static double calcCentripetalForce(double mass, double radius, double period){
        double pathVelocity = calcPathVelocity(radius,period);
        double centripetalAccel = calcCentripetalAccel(pathVelocity,radius);
        double centripetalForce = calcCentripetalForce(mass, centripetalAccel);
        return centripetalForce;
    }
}


