package chap_00;

public class 추상클래스공부 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.breath();

    }
}


// 동물 클래스 만들어서 자식 클래스 분류하고 내는 소리 분류해서 작동시켜보기

abstract class Animal {
    public String kind;
    public void breath () {
        System.out.println("숨을 쉰다.");
    }
    public abstract void sound();
}

class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("왈왈");
    }
}

class Cat extends Animal {
    public Cat(){
        this.kind="포유류";
    }
    @Override
    public void sound(){
        System.out.println("야~옹!");
    }
}