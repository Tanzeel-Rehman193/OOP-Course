public class head {
    public static void main(String[] args) {
        Reportgenerator daraz = new salesreport(45,"Shoes");
        daraz.setdata("Increasing");
        daraz.generatereport();
        Reportgenerator Amazon = new InventoryReportGenerator(65);
        Amazon.setdata("Decreasing");
        Amazon.generatereport();

    }
}
