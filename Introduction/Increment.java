class Increment {
    public static void main(String args[]){
        int x=7;
        if ( x++ == 7){
            System.out.println("Value of x is "+x);
        }
        else{
            System.out.println("We are in else");
        }

        int y=7;
        if(++y == 7){
            System.out.println("value of y is "+y);
        }
        else{
            System.out.println("We are in else");
        }
    }
}
