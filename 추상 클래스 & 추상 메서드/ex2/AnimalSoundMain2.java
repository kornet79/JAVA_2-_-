package poly.ex2;

public class AnimalSoundMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog,cat,caw};

        for(Animal animal : animals) {
            System.out.println("동물 울음소리 시작");
            animal.sound();
            System.out.println("동물 울음소리 종료");
        }
    }


}

