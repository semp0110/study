package _02_Operator;

/**
 * Study
 * Created by hirang on 2016-07-07.
 */
public class B_BitOperatorExam {
    /*
    - 비트 연산자
                & | ^(XOR) ~ << >>
     */
    B_BitOperatorExam(){
//        int x = 0xAB;
//        int y = 0xF;
//
//        System.out.printf("x = %#X\t\t\t\t\t\t\t %s%n", x, toBinaryString(x));
//        System.out.printf("y = %#X\t\t\t\t\t\t\t\t %s%n", y, toBinaryString(y));
//        System.out.printf("x = %#X | y = %#X = %#X\t\t\t %s%n", x, y, x|y , toBinaryString(x|y));
//        System.out.printf("x = %#X & y = %#X = %#X\t\t\t %s%n", x, y, x&y, toBinaryString(x&y));
//        System.out.printf("x = %#X ^ y = %#X = %#X\t\t\t %s%n", x, y, x^y, toBinaryString(x^y));
//        System.out.printf("x = %#X ^ y = %#X  ^ y = %#X = %#X %s%n", x, y, y, x^y^y, toBinaryString(x^y^y));
//        System.out.printf("~x = %#X\t\t\t\t\t\t %s%n", ~x, toBinaryString(~x));

    }

    String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }
}


