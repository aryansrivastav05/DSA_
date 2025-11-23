package OOPS;

public class accessModifiers {
    public static void main(String[] args) {
        Bank B = new Bank();
        B.user("Abc");
        System.out.println(B.username);

        B.Account(123456);
        System.out.println(B.AccNo);
        
        B.pass("123");
       // password cannot be printed as it is private in below class
    }
}
class Bank{
   public String username;
   protected int AccNo;
    private String password;
public void user(String newUser){
    username = newUser;
}


protected void Account(int newAcc){
    AccNo = newAcc;
}

public void pass(String newPass){
    password = newPass;
}

}