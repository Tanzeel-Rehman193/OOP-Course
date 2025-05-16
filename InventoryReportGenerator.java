public class InventoryReportGenerator implements Reportgenerator{
    int Stocks;
    String figures;


    InventoryReportGenerator(int s){
        Stocks = s;
    }


    @Override
    public void setdata(String f) {
    figures=f;
    }

    @Override
    public void generatereport() {
        System.out.println("Current Status is :" + figures);
        System.out.println("Stock products are : "+ Stocks);
    }
}
