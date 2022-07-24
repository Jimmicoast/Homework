package Homework_2;

public class Parrot {
    String nickname;
    int age;
    int weight;

    public Parrot (String parrotNickname, int parrotAge, int parrotWeight) {
        this.nickname = parrotNickname;
        this.age = parrotAge;
        this.weight = parrotWeight;
    }
    public void sayHi() {
        System.out.println(this.nickname + " - привет, я попугай");
        System.out.println("мой вес - " + this.weight);
        System.out.println("мой возраст - " + this.age);
    }
    public String getNickname () {
        return this.nickname;
    }
    public int getAge () {
        return this.age;
    }
    public int getWeight () {
        return this.weight;
    }
    public void setNickname (String newNickname) {
        this.nickname = newNickname;
    }
    public void setAge (int newAge) {
        this.age = newAge;
    }
    public void setWeight (int newWeight) {
        this.weight = newWeight;
    }
}
