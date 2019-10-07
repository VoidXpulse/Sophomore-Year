public class employeeLab {
    //Justin Ecarma
    //9/24/2019
    //Employee Lab
    //Extra:Companys implemented. Can track the amount of employees in each company, and fire and hire employees.

    public static void main(String[] args) {
        Company Toshiba = new Company("Toshiba");
        Company Totoro = new Company("Totoro");
        //Companies Toshiba and Totoro

        Employee harry = new Employee("Hacker, Harry", 50000, Toshiba);
        Employee sherry = new Employee("Sacker, Sherry", 503000, Toshiba);
        Employee garry = new Employee("Gacker, Garry", 5690, Toshiba);
        //Three employees

        harry.raiseSalary(10); // Harry gets a 10% raise
        harry.raiseSalary(10);

        harry.getFired();//firing

        sherry.raiseSalary(25);//raise salary

        garry.getFired();//firing

        harry.getHired(Totoro, 6969);//get hired

        sherry.raiseSalary(69);//raise salary

        garry.getHired(Totoro, 42024);//get hired

        harry.raiseSalary(13);
//raising salary
        garry.raiseSalary(89);

        System.out.println(harry.toString());
        System.out.println(garry.toString());
        System.out.println(sherry.toString());//printing out the final thing
        System.out.println(Toshiba.toString());
        System.out.println(Totoro.toString());
    }
}
class Employee{
    public static Company unemployed = new Company("unemployed");
    private String name;
    private double yearlySalary;
    private Company company;

    public Employee(String name, double salary, Company employer){//constructor for employees
        company = employer;
        company.addEmployee();
        this.name = name;
        yearlySalary = salary;
    }
    public void getFired() {company.fireEmployee(); company = unemployed; yearlySalary = 0;}//fire method
    public void getHired(Company hiring, int newSalary) {//  hire method
        company = hiring; company.addEmployee(); yearlySalary = newSalary;
    }
    public String getName() {
        return name;
    }//rturns employee name

    public double getSalary() {
        return yearlySalary;
    }// returns employee salary

    public void raiseSalary(double byPercent){
        yearlySalary = yearlySalary + (yearlySalary * (byPercent / 100));
    }//raises salary by a percent
    public String toString() {
       return String.format("The employee's name is %s, their employer is %s and they have a yearly salary of $%.2f", name, company.getName() ,yearlySalary);
    }//returns relevant info
}
class Company{///company
    private int employeeCount;
    private String name;

    public Company(String name) {
        this.name = name;
    }//Constructor for company
    public String getName() {return name;}//returns name
    public void addEmployee(){
        employeeCount++;
    }//adds an employee to the count
    public void fireEmployee() { employeeCount--;}// fires an employee from the count
    public String toString() {//returns relevant information
       return String.format("The company is %s, and they have %s employee(s).", name, employeeCount);
    }
}

