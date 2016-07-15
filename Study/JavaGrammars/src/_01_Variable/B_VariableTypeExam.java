package _01_Variable;

/**
 * Study
 * Created by hirang on 2016-07-06.
 */
public class B_VariableTypeExam {
    B_VariableTypeExam(){
        /*
        변수
            기본형(Primitive Type)
                - boolean(1byte), char(2byte), byte, short(2byte), int(4byte), long(8byte), float(4byte), double(8byte)
            참조형(Refernce Type)
                - 8개를 제외한 나머지 타입 예) 객체 참조변수
        */
//        long big = 100_000000L;
//        float pi = 3.14f;
//        long hex = 0xFFFFFFFF_FFFFL;
//        int binNum = 0b1010;
//        double rate1 = 1.611d;
//        double rate2 = 1.611;
//        boolean bool = true;
//        double sq1 = 1e3;
//        double sq2 = 1e-3;
//        char ch = 'A';
//        String name = "Java";
//
//        System.out.println(big);
//        System.out.println(pi);
//        System.out.println(hex);
//        System.out.println(binNum);
//        System.out.println(rate1);
//        System.out.println(rate2);
//        System.out.println(bool);
//        System.out.println(sq1);
//        System.out.println(sq2);
//        System.out.println(ch);
//        System.out.println(hex);
//        System.out.println();

        /*
        형식화된 출력
            %b(boolean), %d(decimal integer), %o(octal integer), %x, %X(hexadecimal integer), %f(decimal float), %c(char), %s(string)
        */
//        System.out.printf("Name is %s, age %f%n", name, sq1);
//        System.out.printf("value = [%-5d], value1 = [%5d]%n" , 1, 1);
//        System.out.printf("hex = %x%n" , hex);
//        System.out.printf("hex = %#x%n" , hex);
//        System.out.printf("hex = %#X%n" , hex);
//        // 10진수를 2진수로 출력해주는 지시자가 없기 때문에 Integer.toBinaryString(int i) 를 사용
//        System.out.printf("binNum = %s%n" , Integer.toBinaryString(binNum));
//        // char 타입 값은 %d 출력하기 위해선 형변환
//        System.out.printf("%d%n" , (int)ch);
//        System.out.printf("%c%n" , ch);
//        System.out.println();

        /*
        타입불일치
            넓은 타입에 좁은 타입의 값을 저장은 허용
        */
//        int a = 'A';
//        double d = 3.14F;
//        System.out.println(a);
//        System.out.println(d);
//
//        /*
//        상수
//            변수 타입 앞에 final 추가
//        */
//        final int MAX_VALUE = 100;
//        final int MIN_VALUE;
//        MIN_VALUE = 1;

        /*
        리터럴
            그 값 자체
            예) 12, 3.14, 'A'
        */

        /*
        화면에서 입력받기
            Scanner
        */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("아무거나 입력하세요");
//        String input = scan.nextLine();
//        System.out.printf("당신이 입력한 것은 \"%s\" 입니다.", input);
    }
}
