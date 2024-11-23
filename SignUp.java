
import java.util.Scanner;

public class SignUp {
    private static String email="devendra@gmail.com";
    private static int pass=1234;

    static void Email() throws Exception {

        System.out.println("Enter the email ");
        Scanner sc=new Scanner(System.in);
        String iemail=sc.nextLine();
         
            if(iemail.equals(email)){
                System.out.println("right email");
                Password();
            }
             else{
                System.out.println("invalid email try again later");
             }
        
        

    }
    static void Password(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password ");
        int ipass=sc.nextInt();

        if(ipass==pass){
            System.out.println("right password");
            System.out.println("Successfully Login");

        }
        else{
            System.out.println("wrong password");
        }

    }

    public static void main(String[]args) throws Exception{
        
        Email();
       

        System.out.println("RADHA KRISHNA");
    }
    
}
