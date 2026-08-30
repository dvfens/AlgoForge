package Introduction;
import java.util.Scanner;
class conditionals{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>90){
            System.out.println("Excellent");
        }
        else if(a>80){
            System.out.println("Very Good");
        }
        else if(a>60){
            System.out.println("Good");
        }
        else if(a>45){
            System.out.println("Average");
        }
        else if(a>33){
            System.out.println("Can do better");
        }
        else{
            System.out.println("work harder");
        }
    }
}