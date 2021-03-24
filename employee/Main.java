package homework.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Entrepreneur entrepreneur1 = new Entrepreneur();
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
        SalariedEmployee salariedEmployee1 = new SalariedEmployee();


        employee1.perName("John!");
        entrepreneur1.perName("Jacob!");
        hourlyEmployee1.perName("Sara!");
        salariedEmployee1.perName("Mary!");

        employee1.dateOfHire("June",23,2023);
        entrepreneur1.dateOfHire("October",1,2012);
        hourlyEmployee1.dateOfHire("February",14, 1990);
        salariedEmployee1.dateOfHire("May", 15,2000);

        salariedEmployee1.salary(40000);
        hourlyEmployee1.hourWage(50,80);

        entrepreneur1.printBadge("Jacob", "October",1,2012);
        employee1.printBadge("John", "June", 23, 2023);
        hourlyEmployee1.printBadge("Sara", "February", 14, 1990);
        salariedEmployee1.printBadge("Mary","May",15,2000);









    }
}
