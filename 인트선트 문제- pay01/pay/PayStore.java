package poly.car0.ex.pay1;

public class PayStore {

    //결제 수단이 추가되거나 삭제되는 변경이 일어나면 수정되는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
