import java.util.Scanner;

public class login_3_tries {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String static_username="Paurakh";
        String static_password="ok12";
        for (int i = 3; i >0 ; i--) {
            System.out.println("enter your user name");
            String username= obj.next();
            System.out.println("Enter Your Password");
            String password= obj.next();
            if (static_username.equals(username)& static_password.equals(password)){
                System.out.println("Your are sucessfully loggedin");
                break;
            }
            else {
                System.out.println("Invalid Username password");
                System.out.println("You have got "+ i+" more tires.");
            }
        }
    }
}
