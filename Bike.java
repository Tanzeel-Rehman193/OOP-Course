public class Bike {
    private String modelname;
    private String mancomp;
    private int modelyear;
    private int price;
    Bike(){

    }
    Bike(String model,String man, int year,int p){
    modelname = model;
    mancomp = man;
    modelyear = year;
    price = p;
    }
    Bike(Bike b){
    this.modelname = b.modelname;
    this.mancomp = b.mancomp;
    this.modelyear = b.modelyear;
    this.price = b.price;
    }
    void display(){
        System.out.println(modelname+mancomp+modelyear+price);
    }
    public static void main(String[] args) {
        Bike CD = new Bike("CD70","Honda",2025,150000);
        Bike CD_70 = new Bike(CD);
        CD_70.display();
        
    }
}
