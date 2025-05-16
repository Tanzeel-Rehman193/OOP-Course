
    public class circle {
    private Double radius;
    private Double area;
    private Double cirf;

    circle (){
        radius = null;
        area = null;
        cirf = null;
    }
void SetRadius(Double r){
    radius = r;
}
void SetCirf(Double c){
    cirf = c;
}
Double calculatearea(){
area = 3.14 * radius * radius;
return area;
}
Double calculatecirf(){
    cirf = 2 *3.14 *cirf;
    return cirf;
    }

    public static void main(String[] args) {
        circle A = new circle();
        A.SetRadius(3.5);
        System.out.println("Total area is :"+ A.calculatearea());
        A.SetCirf(2.7);
        System.out.println("Total cirf is :"+A.calculatecirf());
    }
    }