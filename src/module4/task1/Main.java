package module4.task1;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank();
        usBank.setCurrency(Currency.USD);
        usBank.setBankCountry("Canada");
        usBank.setId(723234434);
        usBank.setAvrSalaryOfEmployee(1300);
        usBank.setNumberOfEmployees(106);
        usBank.setRating(7);
        usBank.setTotalCapital(250000000);

        Bank euBank = new EUBank();
        euBank.setCurrency(Currency.EUR);
        euBank.setBankCountry("Norway");
        euBank.setId(456365434);
        euBank.setAvrSalaryOfEmployee(1800);
        euBank.setNumberOfEmployees(87);
        euBank.setRating(2);
        euBank.setTotalCapital(350000000);

        Bank chinaBank = new ChinaBank();
        chinaBank.setCurrency(Currency.USD);
        chinaBank.setBankCountry("Japan");
        chinaBank.setId(758654435);
        chinaBank.setAvrSalaryOfEmployee(1100);
        chinaBank.setNumberOfEmployees(99);
        chinaBank.setRating(9);
        chinaBank.setTotalCapital(150000000);


        User user = new User();
        user.setCompanyName("Toyota");
        user.setId(123213);
        user.setMonthsOfEmployment(6);
        user.setName("Ivan");
        user.setSalary(1300);
        user.setBalance(5000);
        user.setBank(usBank);
        //System.out.println(user);


        User user1 = new User();
        user1.setCompanyName("Honda");
        user1.setId(853213);
        user1.setMonthsOfEmployment(14);
        user1.setName("Tony");
        user1.setSalary(2300);
        user1.setBalance(2000);
        user1.setBank(usBank);
        //System.out.println(user1);


        User user2 = new User();
        user2.setCompanyName("Audi");
        user2.setId(344213);
        user2.setMonthsOfEmployment(23);
        user2.setName("Sonia");
        user2.setSalary(1635);
        user2.setBalance(12555);
        user2.setBank(euBank);
        //System.out.println(user2);


        User user3 = new User();
        user3.setCompanyName("BMW");
        user3.setId(343413);
        user3.setMonthsOfEmployment(2);
        user3.setName("Oliver");
        user3.setSalary(800);
        user3.setBalance(0);
        user3.setBank(euBank);
        //System.out.println(user3);


        User user4 = new User();
        user4.setCompanyName("KIA");
        user4.setId(234413);
        user4.setMonthsOfEmployment(42);
        user4.setName("Jacky");
        user4.setSalary(230);
        user4.setBalance(420);
        user4.setBank(chinaBank);
        //System.out.println(user4);


        User user5 = new User();
        user5.setCompanyName("Peugeut");
        user5.setId(324343);
        user5.setMonthsOfEmployment(6);
        user5.setName("Lu");
        user5.setSalary(1120);
        user5.setBalance(600);
        user5.setBank(chinaBank);
        //System.out.println(user5);


        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(user, 1000);
        System.out.println(user);

        BankSystem bankSystem1 = new BankSystemImpl();
        bankSystem1.fundUser(user3,21000);
        System.out.println(user3);

        BankSystem bankSystem2 = new BankSystemImpl();
        bankSystem2.transferMoney(user4, user5, 100);
        System.out.println(user4.getName() + " " + user4.getBalance());
        System.out.println(user5.getName() + " " + user5.getBalance());

        BankSystem bankSystem3 = new BankSystemImpl();
        bankSystem3.paySalary(user2);
        System.out.println(user2.getName() + " " + user2.getSalary() + " " + user2.getBalance());

    }
}
