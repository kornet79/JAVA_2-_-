package poly.car0.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {



        while(true) {
            System.out.println("결제 수단을 입력하세요.");
            Scanner sc = new Scanner(System.in);
            String payoption = sc.next();
            // exit 를 입력하였을때 프로그램을 종료합니다.
            if(payoption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요 : ");
            int amount = sc.nextInt();
            sc.nextLine();

//            PayService payService = new PayService(payoption, amount);


        }




//        // kakao 결제
//        String payOption1 = "kakao";
//        int amount1 = 5000;
//        payService.processPay(payOption1, amount1);
//
//        // naver 결제
//        String payOption2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(payOption2, amount2);
//
//        // 잘못된 결제
//        String payOption3 = "apple";
//        int amount3 = 15000;
//        payService.processPay(payOption3, amount3);
    }
}
