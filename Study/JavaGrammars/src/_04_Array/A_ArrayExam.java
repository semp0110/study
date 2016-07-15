package _04_Array;

import java.util.Arrays;

/**
 * Study
 * Created by hirang on 2016-07-13.
 */
public class A_ArrayExam {
    A_ArrayExam(){

        /*
        기본형(Primitive Type) 타입 초기값
         */
        /*byte[] arrByte = new byte[5];
        System.out.println("byte배열 기본값은 " + arrByte[0]);
        short[] arrSrt = new short[5];
        System.out.println("short배열 기본값은 " + arrSrt[0]);
        int[] arrInt = new int[5];
        System.out.println("int배열 기본값은 " + arrInt[0]);
        int[] arrLong = new int[5];
        System.out.println("long배열 기본값은 "+ arrLong[0]);
        double[] arrDbl = new double[5];
        System.out.println("double배열의 기본값은" + arrDbl[0]);
        float[] arrFlt = new float[5];
        System.out.println("float배열의 기본값은" + arrFlt[0]);
        String[] arrStr = new String[5];
        System.out.println("STring배열 기본값은 " + arrStr[0]);
        char[] arrCh = new char[5];
        System.out.println("char배열의 기본값은 '" + arrCh[0] + "'");
        boolean[] arrBool = new boolean[5];
        System.out.println("boolean배열의 기본값은 " + arrBool[0]);
        System.out.println();*/

        /*
        배열이름.length : 배열길이
         */
        /*int[] arr = new int[5];
        int arrCnt = arr.length;
        System.out.println("arr.length = " + arrCnt);
        //루프문에 조건식에 보통 사용
        for (int i=0; i < arr.length; i++){
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();*/

        /*
        배열 초기화
         */
        /*int[] score = new int[]{1,2,3,4,5};
        int[] score1 = {1,2,3,4,5};

        int[] score2;
        score2 = new int[]{1,2,3,4,5};
        //score2 = {1,2,3,4,5}; //에러  선언과 생성을 따로 하는 경우 new int[]는 생략 불가능

        //모두 길이가 0인 배열
        int[] score3 = new int[0];
        int[] score4 = new int[]{};
        int[] score5 = {};
        System.out.printf("score3 = %d\tscore4 = %d\tscore5 = %d\t\n", score3.length, score4.length, score5.length);

        //Arrays.toString : 배열의 모든 요소를 [, ,..] 형태로 반환
        System.out.println(Arrays.toString(score));
        System.out.println("score 배열변수의 주소(타입@주소)" + score);

        //예외적으로 char배열은 println으로 하면 요소가 구분자 없이 그대로 출력
        char[] arrCh = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(arrCh);*/

        /*
        배열 복사 첫번째
         */
        /*int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //복사하기 위한 배열 생성
        int[] tmp = new int[arr.length*2];
        System.out.println(Arrays.toString(tmp));
        //배열 값 복사
        for(int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));
        arr[0] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));
        //복사하기 위한 배열 생성
        int[] tmp1;
        tmp1 = arr; //변수는 다르지만 참조 값을 가지고 있다.
        arr[0] = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp1));*/

        /*
        System.arraycopy() 이용한 배열 복사 두번째
         */
        /*int[] arr = new int[]{1,2,3,4,5};
        int[] tmp1 = new int[arr.length*2];
        //배열의 복사는 System.arraycopy()를 사용하는게 효율적
        //http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#arraycopy-java.lang.Object-int-java.lang.Object-int-int-
        System.arraycopy(arr, 0, tmp1, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp1));
        arr[0] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp1));*/

        /*
        System.arraycopy() 이용한 배열 복사 세번째
         */
        char[] abc = {'A','B','C','D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        //배열 abc와 num을 붙여서 하나의 배열(result)을 만든다.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length); //abc를 result에 복사 (index 0부터)
        System.arraycopy(num, 0, result, abc.length, num.length); //num을 result에 복사 (index abc.length부터)
        System.out.println(result);

        //배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이 만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        //abc를 0~2번째 인덱스를 num의 인덱스6 위치부터 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);

        //abc를 0~2번째 인덱스를 num의 인덱스9 위치부터 복사
        //java.lang.ArrayIndexOutOfBoundsException 발생
//        System.arraycopy(abc, 0, num, 9, 3);
//        System.out.println(num);

    }
}



