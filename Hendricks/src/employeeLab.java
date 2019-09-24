public class employeeLab {
    //Justin Ecarma
    //9/24/2019
    //Employee Lab
    //Extra:
    public static void main(String[] args) {
        Company Toshiba = new Company("Toshiba");
        Employee harry = new Employee("Hacker, Harry", 50000, Toshiba);
        Employee sherry = new Employee("Sacker, Sherry", 503000, Toshiba);
        Employee garry = new Employee("Gacker, Garry", 5690, Toshiba);
        harry.raiseSalary(10); // Harry gets a 10% raise

        System.out.println(harry.toString());
        System.out.println(Toshiba.toString());
    }
}
class Employee{

    private String name;
    private double yearlySalary;

    public Employee(String name, double salary, Company employer){
        Company tosh = employer;
        tosh.addEmployee();
        this.name = name;
        yearlySalary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return yearlySalary;
    }

    public void raiseSalary(double byPercent){
        yearlySalary = yearlySalary + (yearlySalary * (byPercent / 100));
    }
    public String toString() {
       return String.format("The employee's name is %s, and they have a yearly salary of $%.2f", name, yearlySalary);
    }
}
class Company{
    private int employeeCount;
    private String name;

    public Company(String name) {
        this.name = name;
    }
    public void addEmployee(){
        employeeCount++;
    }
    public String toString() {
       return String.format("%s", employeeCount);
    }
}

