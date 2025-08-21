import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int x =sc.nextInt();
            int y = sc.nextInt();
            int z = x /y;
            System.out.println(x+"/"+y+"="+z);

        }
        catch (ArithmeticException ex){
            System.out.println("---Catch block===");
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("---Final block---");
            System.out.println("Application Designed & Developed by:");
            sc.close();
        }
        System.out.println("----Done----");

    }
}

