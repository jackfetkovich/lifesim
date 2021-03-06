import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Gender gender;
    private String job;
    private int accountBalance;
    private int salary;

    public Person(int age, Gender gender, String job, int accountBalance, int salary) {
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.accountBalance = accountBalance;
        this.salary = salary;
        this.setName(RandomNameGenerator.randomName(gender));
    }

    public Person() {
        this(0, generateGender() ? Gender.MALE : Gender.FEMALE, "none", 0, 0 );
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getJob() {
        return job;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getSalary() {
        return salary;
    }

    //Returns true for male, false for female, used in constructor when no gender is picked
    private static boolean generateGender() {
        Random rand = new Random();
        int randomNum = rand.nextInt(2);

        return randomNum == 1;
    }

}
