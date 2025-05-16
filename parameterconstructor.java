public class parameterconstructor {
    int id;
    String name;
    int age;

    parameterconstructor(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        parameterconstructor tanzeel = new parameterconstructor(12, "ali", 23);
        tanzeel.display();
    }
}
