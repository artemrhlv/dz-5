public class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 9;
        int c = 13;
        int d = 10;

        int sum1 = a + b;
        int sum2 = c + d;

        String compare1 = sum1 > sum2 ? "True" : "False";

        System.out.println(compare1);

        sum1++;
        sum2 -= 2;

        String compare2 = sum1 > sum2 ? "True" : "False";

        System.out.println(compare2);

        String compare3 = sum1 % 2 == 0 || sum2 % 2 == 0 ? "True" : "False";

        System.out.println(compare3);

    }
}