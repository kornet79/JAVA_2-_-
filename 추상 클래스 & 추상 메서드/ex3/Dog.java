package poly.ex3;

public class Dog extends Animal{
    // 처음에 오류가 뜬 이유는 바디가 없기 때문에
    // 먼저 오버라이딩을 해줘야 오류가 풀린다.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
