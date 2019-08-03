public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Department salesDepartment = new SalesDepartment(0, "Sales department");
        Department financialDepartment = new FinancialDepartment(1, "Financial department");
        HeadDepartment headDepartment = new HeadDepartment(2, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
