import java.util.*;
class strings{

    public static void getBit(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position for bit check: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("The bit was zero");
        }
        else{
            System.out.println("The bit was one");
        }
    }


    public static void setBit(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position for bit check: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }

    public static void clearBit(){
         

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position for bit check: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }

    public static void updateBit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position for bit check: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        System.out.println("Enter the operation to perform: ");
        int oper = sc.nextInt();

        switch (oper) {

            case 1:
                int newNumber1 = bitMask | n;
                System.out.println(newNumber1);
                break;
            
            case 2:
                int newBitMask = ~(bitMask);
                int newNumber2 = newBitMask & n;
                System.out.println(newNumber2);
            
            default:
                break;
        }

    }


    public static void printPower(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int val = (n & (n-1));
        if(val == 0){
            System.out.println("The number is power of 2");
        }
        else{
            System.out.println("The number is not the power of 2");
        }
    }
    public static void main(String[] args) { 
        // System.out.println("Select any of the following: ");
        // System.out.println("Press 1 to get bit");
        // System.out.println("Press 2 to set bit");
        // System.out.println("Press 3 to clear bit");
        // System.out.println("Press 4 to update bit");

        // Scanner sc = new Scanner(System.in);

        // int choice = sc.nextInt();

        // switch (choice) {
        //     case 1:

        //         getBit();    

        //         break;
        //     case 2:

        //         setBit();

        //         break;

        //     case 3:
                
        //         clearBit();

        //         break;

        //     case 4:

        //         updateBit();

        //         break;
                
        //     default:
        //         break;
        // }



        
    }
}