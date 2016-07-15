package _03_Conditions;

import java.util.Scanner;

/**
 * Study
 * Created by hirang on 2016-07-08.
 */
public class A_ConditionExam {
    A_ConditionExam(){
        /*
        if ~ else
        switch ~ case
         */
        /*
        첫번째 예제
         */
//        System.out.println("숫자를 하나 입력하세요~");
//        Scanner scan = new Scanner(System.in);
//        String tmp = scan.nextLine();
//        try{
//            int input = Integer.parseInt(tmp);
//            if(input==0){
//                System.out.println("입력하신 숫자는 0입니다.");
//            }
//            else if(input > 100)
//                System.out.println("입력하신 숫자는 100보다 큽니다.");
//            else
//                System.out.println("입력하신 숫자는 0이 아닙니다.");
//            System.out.printf("입력하신 숫자는 %d 입니다.", input);
//        }
//        catch(Exception e){
//            System.out.println("숫자가 아님~");
//        }

        /*
        두번째 예제
         */

//        System.out.println();
//        System.out.println("월을 숫자로 입력하세요 계절을 말해줍니다.(1월~12월 중 선택)");
//        Scanner scan1 = new Scanner(System.in);
//        String tmp1 = scan1.nextLine();
//        String season;
//        int month;
//        try{
//
//            month = Integer.parseInt(tmp1);
//            if(month > 12) {
//                System.out.println("그런 월은 없습니다.");
//                return;
//            }
//
//            System.out.printf("입력하신 %d월은 %s입니다.%n", month, selectSeason(month));
//        }
//        catch(Exception e){
//            System.out.println("숫자를 입력하세요%n");
//        }
//
//        System.out.println("컴퓨터도 한번 선택해 봅니다.");
//        month = (int)(Math.random()*13);
//        System.out.printf("컴퓨터는 %d월을 선택했고 %s입니다.", month, selectSeason(month));
    }

    String selectSeason(int month){
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "이건 머지?";
        }
        return season;
    }
}
