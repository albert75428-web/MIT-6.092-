class FooCorporation{
    public static double rules(double time, double base){
        if(base < 8)
        {
            System.out.print("too low base salary!");
            return -1;
        }
        if(time > 60) {
            System.out.print("too high work time!");
            return -1;
        }
        if(time > 40){
            return 40*base+(time-40)*base*1.5;
        } else return time*base;
    }
    public static void main(String[] arguments){

        System.out.println("worker 1 all money is "+rules(35,7.5));
        System.out.println("worker 2 all money is "+rules(47,8.2));
        System.out.println("worker 3 all money is "+rules(73,10));
    }
}