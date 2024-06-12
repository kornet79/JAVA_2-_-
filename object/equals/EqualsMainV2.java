package object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
        // 하나하나 비교해서 결국 다르다 라는 결과 값이 나옴 그렇기에 동일성 비교 라고 한다.
        // 이에 동등하게 비교하기위해 오버라이딩 해주자.
    }
}
