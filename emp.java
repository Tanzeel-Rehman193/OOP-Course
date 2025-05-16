public class emp extends Sunstar{
    String name;
    int age;
    double salary;
    emp(){
        
    }
    emp(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }
    public void printinfo(){
        System.out.println(name + age + salary);
    }
}
