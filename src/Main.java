public class Main {
    public static float calc(float a, float b, float c,float d){
        return a * (b + (c / d));
    }

    public static boolean isSumBetween10and20 (int a, int b){
        return a + b >=10 && a + b <=20;
    }

    public static void isNegativeOrPositive (int a){
        if(a < 0)
            System.out.println("Отрицательное");
        else
            System.out.println("Положительное");
    }

    public static boolean isNegative (int a){
        return a < 0;
    }

    public static void Hello (String name){
        System.out.println("Привет, " + name + "!");
    }

    public static boolean isLeapYear (int a){
        return a % 100 != 0 && a % 4 == 0 || a % 400 ==0;
    }

    public static void main(String[] args) {
        byte a = 4;
        short b = 1234;
        int c = 999;
        float d = 1.23f;
        double e = 1.1;
        boolean f = true;

        float test1 = calc(0.5f,0.45f,2.56f,3.45f);
        System.out.println(test1);

        boolean test2 = isSumBetween10and20(13, 1);
        System.out.println(test2);

        isNegativeOrPositive(-10);

        boolean test4 = isNegative(0);
        System.out.println(test4);

        Hello("Андрей");

        boolean test6 = isLeapYear(2020);
        System.out.println(test6);

        // write your code here
    }

}