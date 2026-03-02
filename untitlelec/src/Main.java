class GravityCalculator{
    public static  void main(String[] arguments){
        double gravity=-9.81;
        double initialVelocity=0.0;
        double fallingTime=10;
        double initalPosition=0;
        double finalPosition=0;
        finalPosition=0.5*gravity*fallingTime*fallingTime;
        System.out.println("The object's position after "+fallingTime+"seconds is "+ finalPosition+ "m.");
    }
}