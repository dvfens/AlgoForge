package Conditionals;
import java.util.Scanner;
class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = x>y ? x:y;
        System.out.println("Max number is : "+ max);
    }
}
