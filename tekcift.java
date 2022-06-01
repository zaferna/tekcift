import java.util.Scanner;

public class tekcift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n,tek;
        System.out.print("Enter Number :");
        n= in.nextDouble();
        tek= n%2;


        if(tek==1){

                    System.out.print("Wierd");
                }

        else if(tek==0){
            if(n>=2&&n<=5) {
                System.out.print("Not Wierd");

            }
            else if(n>=6&&n<=20){
                System.out.print(" Wierd");
            }
            else{
                System.out.print("Not Wierd");
            }
        }

    }
}
