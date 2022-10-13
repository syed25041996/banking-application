public class Account {

    private String name;
    private String id;

    public Account() {
    }

    public Account(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("Thank you "+ name +" for creating an account with us");
        System.out.println("Your id is " + id);
        System.out.println("Please go to the login section");
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

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
