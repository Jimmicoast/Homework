package Homework_2;

public class Weasel {
    String nickname;
    int age;
    int weight;

    public Weasel (String weaselNickname, int weaselAge, int weaselWeight) {
        this.nickname = weaselNickname;
        this.age = weaselAge;
        this.weight = weaselWeight;
    }
    public void makeSound() {
        System.out.println(this.nickname + " издает хорьковое урчание");
        System.out.println(this.age + " - возраст хорька");
        System.out.println(this.weight + " - вес хорька");
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
