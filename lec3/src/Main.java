class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        int fastNumber=-1;
        int fastTime=1000;
        int secondTime=1500;
        int secondNumber=-1;
        for (int i = 0; i < names.length; i++) {
            if(fastTime>times[i]){
                fastTime=times[i];
                fastNumber=i;}
            if((secondTime>times[i]&&times[i]!=fastTime)||(times[i]==fastTime&&i!=fastNumber)){//这里有bug万一第一第二成绩一样的话，需要补充一下
                secondTime=times[i];
                secondNumber=i;
            }
        }
        System.out.println("The fast of marathon is "+names[fastNumber]);
        System.out.println("The second fast of marathon is "+names[secondNumber]);
    }
}