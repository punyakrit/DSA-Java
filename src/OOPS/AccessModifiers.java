package OOPS;

public class AccessModifiers {
    public static void main(String[] args) {
       BankAccount b1 = new BankAccount();
       b1.username= "Anoop";
       b1.setPassword("abcdubf");


    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
        System.out.println(password);
    }

}
