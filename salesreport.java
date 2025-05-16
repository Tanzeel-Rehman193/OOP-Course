public class salesreport implements Reportgenerator {
    String figures;
    int totals;
    String sellingItems;
    salesreport( int t, String s){
        totals = t;
        sellingItems = s;
    }
    @Override
    public void generatereport() {
        System.out.println("Status is :"+ figures);
        System.out.println("Total items are :"+ totals);
        System.out.println("Selling items are :" + sellingItems);
    }
    @Override
    public void setdata(String f) {
    figures = f;
    }
}
