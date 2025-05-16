public class Int {
    int value; 
    public Int() {
        value = 0;
    }
    public Int(int number) {
        value = number;
    }
    public void display() {
        System.out.println(value);
    }
    public Int add(Int other) {
        int sum = this.value + other.value;
        return new Int(sum);
    }
    public static void main(String[] args) {
        Int first = new Int(); 
        Int second = new Int(5); 
        Int third = new Int(10); 

        first = second.add(third); 
        
        System.out.print("The answer is: ");
        first.display(); 
    }
}