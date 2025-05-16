public class Student implements registerforexam {
    private String name;
    private int age;
    private double cgpa;
    Student(String n, int a,  double c){
        name = n;
        age = a;
        cgpa = c;
    }

    @Override
    public void register() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
    }
}
