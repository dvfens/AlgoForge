import java.util.Scanner;
class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of 1st item: ");
        float a = sc.nextFloat();
        System.out.println("Enter the price of 2nd item: ");
        float b = sc.nextFloat();
        System.out.println("Enter the price of 3rd item: ");
        float c = sc.nextFloat();
        double total = (a+b+c);
        double gst = total*0.18;
        double amount= total+gst ;

        System.out.println("-------------BILL----------------");
        System.out.println("Price of 1st item: "+a);
        System.out.println("Price of 2nd item: "+b);
        System.out.println("Price of 3rd item: "+c);
        System.out.println("Total bill before gst: "+ total);
        System.out.println("18% GST: "+ gst);
        System.out.println("--------------------------------");
        System.out.println("Total pay amount with gst: "+ amount);
        System.out.println("-------------THANK YOU----------------");
    }
}
