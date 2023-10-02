package Lesson_06;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1 = true;
        bol1 = false;

        bol1 = (x  == y);
        System.out.println(bol1);

        boolean b1 = x != y;
        System.out.println(b1);

        y = 10;

        boolean b2 = x > y;
        System.out.println(x + " > " + y + " -> " + b2);

        boolean b3 = x < y;
        System.out.println(x + " < " + y + " -> " + b3);

        boolean b4 = x >= y;
        System.out.println(x + " >= " + y + " -> " + b4);

        y = 7;

        boolean b5 = x <= y;
        System.out.println(x + " <= " + y + " -> " + b5);

        boolean b6 = !(4 == 5);
        System.out.println(" !(4==5) : " + b6);

        boolean b7 = true & true;
        System.out.println("логическое И b7 " + b7);

        boolean b8 = true | false;
        System.out.println("true | false " + b8);

        boolean b9 = true ^ false;
        System.out.println("true ^ false " + b9);

        b9 = true ^ true;
        System.out.println("true ^ true " + b9);

        boolean b10 = true && false;
        System.out.println("true && false  " + b10);

        int a = 2;
        int b = 10;
  //      int c;
  //      c = b / a;

        boolean b11 = (a != 0) && (b / a > 4);
        System.out.println(b11);

        boolean b12 = true || (b / a < 4);
        System.out.println(b12);

        System.out.println("========================");

        System.out.println(true ^ true & false); //true XOR true и false
        System.out.println(true ^ false);
        System.out.println(true);
        System.out.println ("++++++++++++");

        System.out.println(true ^ true && false);
        System.out.println(false & false);
        System.out.println(false);


        System.out.println ("++++++++++++++++++");
        //boolean aa = true;
        //boolean bb = false;
        //int cc = 25;
        //int qq = 2;
        //System.out.println(aa | bb | (cc < 100) & !aa ^ (qq == 5));







    }
}
