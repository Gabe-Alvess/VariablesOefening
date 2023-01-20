package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("--- exercise variables ----");

        byte byteExample = 100;
        byteExample = 110;
        System.out.println(byteExample);

        short shortExample = -5000;
        shortExample = -5050;
        System.out.println(shortExample);

        int intExample = 2000000000;
        intExample = 2100000000;
        System.out.println(intExample);

        long longExample = 999999999999999999L;
        longExample = 999999999999999991L;
        System.out.println(longExample);

        float floatExample = 3.14F;
        floatExample = 3.15F;
        System.out.println(floatExample);

        double doubleExample = 2.71828;
        doubleExample = 2.71829;
        System.out.println(doubleExample);

        char charExample = 'A';
        charExample = 'B';
        System.out.println(charExample);

        boolean booleanExample = true;
        booleanExample = false;
        System.out.println(booleanExample);

        System.out.println("--- exercise variables github ----");

        System.out.println("Oefening 1");
        int number = 21;
        System.out.println(number);

        System.out.println("Oefening 2");
        boolean something = true;
        System.out.println(something);

        System.out.println("Oefening 3");
        int a = 20;
        a += 20;
        System.out.println("a = " + a);
        a -= 20;
        System.out.println("a = " + a);
        a *= 20;
        System.out.println("a = " + a);
        a /= 20;
        System.out.println("a = " + a);
    }
}
