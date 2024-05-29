package poly.car0.ex.pay1;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;

        // null은 왠만하면 사용하지 말자 -리펙토링-
    }
}
