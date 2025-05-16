public class constructor {
    int id;
    String name;
    int age;

    constructor() {
        id = 25;
        name = "Tanzeel";
        age = 20;
    }

    public static void main(String[] args) {

        constructor tanzeel = new constructor();
        System.out.println(tanzeel.id);
        System.out.println(tanzeel.name);
        System.out.println(tanzeel.age);
        constructor waleed = new constructor();
        waleed.id = 23;
        waleed.name = "Waleed";
        waleed.age = 15;
        System.out.println(waleed.id);
        System.out.println(waleed.name);
        System.out.println(waleed.age);
    }
}
