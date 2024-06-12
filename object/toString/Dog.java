package object.toString;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public String dogInfo() {
        // toString에 똑같은 기능을 가진 carInfo를 만듬
        return "Dog{" +
                "dogName=" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName=" + dogName + '\'' +
                ", age=" + age +
                        '}';
    }
}
