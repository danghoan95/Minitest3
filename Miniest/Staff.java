package Miniest;

public class Staff {
    private int id;
    private String name;
    private double phoneNumber;
    private String email;
    private Address address;


    public Staff(int id, String name, double phoneNumber, String email, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "id:" + id + " name:" + name + "  phoneNumber:" + phoneNumber + "  email " + email;
    }
}
