import java.util.ArrayList;
import java.util.Scanner;

public class payrollSystem {
    private ArrayList<employee> employees;
    private Scanner sc;
    payrollSystem(){
   employees= new ArrayList<>();
   sc=new Scanner(System.in);
    }
    public void addEmployee(employee emp){
        employees.add(emp);
        System.out.println("employee added successfully");
    }
    public void removeEmployee(int id){
        employee toRemove=null;
        for(employee emp:employees){
            if(emp.getID()==id){
                toRemove=emp;
                break;
            }
        }
        if(toRemove!=null){
            employees.remove(toRemove);
            System.out.println("employee is removed");
        }
        else{
            System.out.println("employee with id" + " is not found!");
        }

    }
    public void displayEmployee(){
        if(employees.size()==0){
            System.out.println("empty no employee found");
        }
        else{
            for(employee emp:employees){
                System.out.println(emp);
            }
        }
    }
    public void calculateAllSalaries() {
        for (employee emp : employees) {
            emp.calculateSalary();
        }
        System.out.println("Salaries calculated successfully!");
    }
    public void menu() {
        while (true) {
            System.out.println("\n--- Payroll System Menu ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Calculate Salaries");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Basic Pay: ");
                    double basicPay = sc.nextDouble();
                    System.out.print("Enter HRA: ");
                    double hra = sc.nextDouble();
                    addEmployee(new fulltimeEmployee(id, name, dept, basicPay, hra));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String pdept = sc.nextLine();
                    System.out.print("Enter Hourly Rate: ");
                    int hourpay = sc.nextInt();
                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();
                    addEmployee(new parttimeemployee(pid, pname, pdept, hours, hourpay));
                    break;

                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    removeEmployee(removeId);
                    break;

                case 4:
                    displayEmployee();
                    break;

                case 5:
                    calculateAllSalaries();
                    break;

                case 6:
                    System.out.println("Exiting Payroll System...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }


    public static void main(String[] args) {
        payrollSystem payroll= new payrollSystem();
        payroll.menu();
    }


}
