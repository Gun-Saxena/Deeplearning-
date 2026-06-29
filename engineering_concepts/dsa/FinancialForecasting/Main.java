import java.util.Scanner;

class Forecast{
        static double calculate(double pval,double gr,int yr){
            return pval*Math.pow(1+gr,yr);
        }
    }
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Present Value");
        double pval=sc.nextDouble();
        System.out.println("Enter Growth Rate");
        double gr=sc.nextDouble();
        System.out.println("Enter Number of Years");
        int yr=sc.nextInt();
        gr=gr/100;
        double ans=Forecast.calculate(pval,gr,yr);
        System.out.println("Future Value"+yr+" "+ans);
        sc.close();
    }
}