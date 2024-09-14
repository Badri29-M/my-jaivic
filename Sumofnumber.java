import java.util.Scanner;

public class Sumofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
         int n = sc.nextInt();

        if (n % 2==0) {
            System.out.print("it is even number:"+n);
        }
        else{
            System.out.print("it is not add number:"+n);
        }

    }
    
}
