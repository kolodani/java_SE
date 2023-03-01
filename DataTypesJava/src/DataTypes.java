public class DataTypes {
    public static void main(String[] args) {
        byte a = 127; // numero mas grande de un byte, 1 byte
        short b = 32767; // numeri mas grande de un short, 2 bytes
        int n = 2147483647; // numero mas grande en un int, 4 bytes
        long r = 922337036854775807L; // numero mas grande en un long, 8 Bytes, Siempre colocar una L al final
        float f = 5.46465465465465465465465465465464F; // numero con punto flotante de 4 bytes
        double d = 1.65146584984651316565146546514631685498465D; // numero con punto flotante de 8 bytes

        var salary = 1000; // int
        // pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Daniel Vinzia";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary);
    }
}
