package _03_Conditions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Study
 * Created by hirang on 2016-07-08.
 */
public class B_LoopExam {
    B_LoopExam(){
        /*
        for 문
         */

         /*
        첫번째 예제
         */
//        int sum = 0;
//        for(int i = 1; i<= 10 ; i++){
//            sum += i;
//            System.out.printf("1부터 %2d까지의 합은 %2d%n", i, sum);
//        }

         /*
        두번째 예제
         */
//        for(int i = 1; i <=5 ; i++){
//            for(int j = 1; j <=5 ; j++) {
//                if(i <= j)
//                    System.out.printf("[%d,%d]", i, j);
//                else
//                    System.out.printf("%5c", ' ');
//            }
//            System.out.println();
//        }

        /*
        foreach
         */
//        int[] arr = new int[10];
//        Random rdn = new Random();
//        for (int i = 0; i < 10; i++){
//            arr[i] = (int)(Math.random()*100);
//        }
//        for(int tmp : arr) {
//            System.out.println(tmp);
//        }

        /*
        while
         */
//        System.out.println("자 이제 카운트다운을 시작합니다.");
//        int i = 11;
//        while(i--!=0){
//            System.out.println(i);
//            for(int j = 0; j < 2_000_000_000; j++){
//                ;
//            }
//        }
//        System.out.println("게임오버");

        /*
        do~while
         */
//        int input = -0;
//        int answer = 0;
//        //1~100사이의 임의의 수를 저장
//        answer = (int)(Math.random()*100)+1;
//        Scanner scan = new Scanner(System.in);
//        do{
//            System.out.print("1과 100사이의 정수를 입력하세요.>");
//            String tmp = scan.nextLine();
//            input = Integer.parseInt(tmp);
//
//            if(input > answer){
//                System.out.println("더 작은 수로 다시 시도해보세요");
//            } else if(input < answer){
//                System.out.println("더 큰 수로 다시 시도해보세요");
//            }
//
//        }while(input!=answer);
//        System.out.println("정답입니다.");

        /*
        break
         */
//        int sum = 0;
//        int i = 0;
//        while(true){
//            if(sum > 100 )
//                break;
//            ++i;
//            sum += i;
//        }
//        System.out.println("i="+i);
//        System.out.println("sum="+sum);

        /*
        continue
         */
//        for(int i = 0; i <= 10; i++){
//            if(i%3==0)
//                continue;
//            System.out.println(i);
//        }

        /*
        이름 붙은 반복문
         */
//        Loop1 :
//        for(int i = 2; i <= 9; i++){
//            for(int j = 1; j <= 9; j++){
//                if(j == 5)
//                    break Loop1;
////                break;
////                continue Loop1;
////                continue ;
//                System.out.println(i + "*" + j + "=" + i*j);
//            }
//        }
    }
}
