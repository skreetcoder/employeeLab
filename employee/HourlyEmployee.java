package homework.employee;

public class HourlyEmployee extends Person{
    public void hourWage (int hourlyRate, int hoursWorked){
        int pay = hourlyRate * hoursWorked;
        System.out.println("Your wages are composed of" + " " + hoursWorked + " " + "hours worked" + " " + "multiplied by the hourly rate of" +" " + "$" + hourlyRate + " " + "Totaling" + " " + "$" + pay);



    }


}
