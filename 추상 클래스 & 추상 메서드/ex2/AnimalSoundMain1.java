package poly.ex2;

public class AnimalSoundMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);


    }

    public static void soundAnimal(Animal animal) {
        // 부모는 모두 똑같기 떄문에 같은 값을 파라미터로 받을수 있다.
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        // 메소드를 하나하나 만들지말고 부모 타입으로 집어 넣어주고
        // 부모의 메소드가 자식의 메소드를 오버라이딩하면 자식의 메소드가 우선되기 때문에 아무튼 자식에 필드값이 나온다.
        // 문제 1 : 이제 오버라이딩을 감빡하면 오류가 남
        // 문제 2 :
    }
}

/*
위 코드의 핵심은 Animal animal 부분이다.
    -다향적 참조 덕분에 animal 변수는 자식인 dog, cat, caw의 인스턴스를 참조할 수 있다.
    -메소드 오버라이딩 덕분에 animal sound()를 호출해도 DOg,sound(), Cat.sound(), Caw.sound()와 같이 각 인스턴스의
    메서드를 호출할 수 있다.
 */
