package module3.task1.task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    int sumBalace;

    void paySalary(){
        sumBalace = balance + salary;
        System.out.println("Final balance " + monthsOfEmployment + " work monthes " + sumBalace + currency);
    }
    void  withdraw (int sum){
        if (sum < 1000){
            System.out.println("Balance after withdrawal = " + (balance - sum - sum*0.05) + currency);
            System.out.println("Comition = " + sum*0.05 + currency);
        }
        else {
            System.out.println("Balance after withdrawal = " + (balance - sum- sum*0.1) + currency);
            System.out.println("Comition = " + sum*0.1 + currency);
        }
    }

    void companyNameLength(){
        companyName.length();
        System.out.println("Length companyName " + companyName.length());
    }

    void monthIncreaser(int addMonth){
        System.out.println(companyName + " " + (monthsOfEmployment + addMonth));
    }
}
