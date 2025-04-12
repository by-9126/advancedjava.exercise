package Bai2_5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        if( gender !='m'&& gender !='f'){
            this.gender = gender;}
        else {
            throw new IllegalArgumentException("Gender must be 'm' or 'f'.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}
