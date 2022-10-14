public class Account {

    private String name;
    private String id;

    private double money;

    public Account() {
    }

    public Account(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("Thank you "+ name +" for creating an account with us");
        System.out.println("Your id is " + id);
        System.out.println("Please go to the login section");
    }

    public Account(String name, String id, double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
