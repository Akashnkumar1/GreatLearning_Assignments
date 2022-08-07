import java.util.Scanner;


public class PowerXoverN {

    static int pow(int x,int n)
    {
        if(n==0)return 1;
        if(n==1)return x;
        if(x==0)return 0;
        if(x==1)return 1;
        if(n%2==0)return pow(x,n/2)*pow(x,n/2);
        else return x*pow(x,n/2)*pow(x,n/2);
    }
    public static void main(String[] args) {
        int x;int n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        System.out.println(pow(x,n));
    }
}
