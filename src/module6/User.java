package module6;

public class User {
    private long id;
    private String firstName, lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o== null) return false;
        if (getClass() != o.getClass()) return false;
        User any = (User) o;
        if (id != any.id)
            return false;
        if (firstName != any.firstName)
            return false;
        if (lastName != any.lastName)
            return false;
        if (salary != any.salary)
            return false;
        if (balance != any.balance)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + salary;
        result = 31 * result + balance;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname=" + firstName +
                ", lastname name=" + lastName +
                ", salary=" + salary +
                ", balance='" + balance +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }
}
