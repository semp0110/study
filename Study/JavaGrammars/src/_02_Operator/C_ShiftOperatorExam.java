package _02_Operator;

/**
 * Study
 * Created by hirang on 2016-07-07.
 */
public class C_ShiftOperatorExam {
    C_ShiftOperatorExam(){
        /*
        << (왼쪽으로 이동) 양수 음수 0으로 채워짐
        >> (오른쪽 이동) 양수 0으로 채워짐 음수는 1로 채워짐
         */
//        int dec = 8;
//        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0 , toBinaryString(dec >>0));
//        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1 , toBinaryString(dec >>1));
//        System.out.printf("%d >> %d = %4d \t%s%n%n", dec, 2, dec >> 2 , toBinaryString(dec >>2));
//
//        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0 , toBinaryString(dec <<0));
//        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1 , toBinaryString(dec <<1));
//        System.out.printf("%d << %d = %4d \t%s%n%n", dec, 2, dec << 2 , toBinaryString(dec <<2));
//
//        int dec1 = -8;
//        System.out.printf("%d >> %d = %4d \t%s%n", dec1, 0, dec1 >> 0 , toBinaryString(dec1 >>0));
//        System.out.printf("%d >> %d = %4d \t%s%n", dec1, 1, dec1 >> 1 , toBinaryString(dec1 >>1));
//        System.out.printf("%d >> %d = %4d \t%s%n%n", dec1, 2, dec1 >> 2 , toBinaryString(dec1 >>2));
//
//        System.out.printf("%d << %d = %4d \t%s%n", dec1, 0, dec1 << 0 , toBinaryString(dec1 <<0));
//        System.out.printf("%d << %d = %4d \t%s%n", dec1, 1, dec1 << 1 , toBinaryString(dec1 <<1));
//        System.out.printf("%d << %d = %4d \t%s%n%n", dec1, 2, dec1 << 2 , toBinaryString(dec1 <<2));
//
//        System.out.printf("%d >> %d = %4d \t%s%n%n", dec, 33, dec >> 33 , toBinaryString(dec >>33));
//        System.out.printf("%d >> %d = %4d \t%s%n%n", dec, 64, dec >> 64 , toBinaryString(dec >>64));

    }

    String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }


}
