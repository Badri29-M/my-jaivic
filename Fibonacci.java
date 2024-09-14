public class Fibonacci{
    public static void main(String[] args) {
        int N=5;
        printFibonacci(N);

    }
     public static void printFibonacci(int n)
    {
        int a=0, b=1;
        for (int i = 0; i < 5; i++) {
            System.out.print(b +"");
            int next=a+b;
            a=b;
            b=next;
            
        }
    }
}
     