public class Employeetask implements registerforexam{
    private String name;
    private  String date;
    private int salary;
    Employeetask(String n, String d, int s){
        name = n;
        date = d;
        salary = s;
    }

    @Override
    public void register() {
        System.out.println(name);
        System.out.println(date);
        System.out.println(salary);
    }
}
