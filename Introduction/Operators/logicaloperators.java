package Operators;
import java.util.Scanner;
class logicaloperators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if((a%4==0) && ( a%400 == 0 || a%100!=0 )){
            System.out.println("it's a leap year");
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
    
}
