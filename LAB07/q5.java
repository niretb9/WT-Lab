/*Write a program to create an Account class containing acc_no, balance as data
members and disp() to display the details. Inherit it in Person class with all mentioned
data members and functions. Person class also has name and aadhar_no as extra data
members of its own. Override disp() function. Create
5 persons‟ details. */
package LAB07;
class Account {
    protected int acc_no;
    protected double balance;

    public Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void disp() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;

    public Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    public void disp() {
        System.out.println("Account holder name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
        super.disp();
    }
}

public class q5{
    public static void main(String[] args) {
        Person p1 = new Person(1001, 5000.0, "John", "123456789012");
        p1.disp();

        Person p2 = new Person(1002, 7500.0, "Jane", "234567890123");
        p2.disp();

        Person p3 = new Person(1003, 10000.0, "Bob", "345678901234");
        p3.disp();

        Person p4 = new Person(1004, 15000.0, "Alice", "456789012345");
        p4.disp();

        Person p5 = new Person(1005, 20000.0, "Tom", "567890123456");
        p5.disp();
    }
}
