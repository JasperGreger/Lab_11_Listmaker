import java.util.Scanner;

class SafeInput {

    static void main() {
        prettyHeader("This is a longer message, look at me go");
    }

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");

            if(pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }
        }while(!done);

        return retInt;
    }


    public static double getDouble(Scanner pipe, String prompt) {

        double retDouble = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");

            if(pipe.hasNextDouble()) {
                retDouble = (pipe.nextDouble());
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not " + trash);
            }

        }while(retDouble == 0);

        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {

        int retValue = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()){
                retValue = pipe.nextInt();
                pipe.nextLine();
                if(retValue >= low && retValue <= high){
                    done = true;
                }else{
                    System.out.println("Number is out of range [" + low + " - " + high + "] not: " + retValue);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }
        }while(!done);

        return retValue;

    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){

        double retValue = 0;
        String fin = "";
        boolean done = false;
        String trash = "";


        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                if (retValue >= low && retValue <= high) {
                    done = true;
                } else {
                    System.out.println("Number is out of range [" + low + " - " + high + "] not: " + retValue);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }


        }while(!done);

        return retValue;
    }




    public static boolean getYNConfirm(Scanner pipe, String prompt){
        String response = "";
        boolean done = false;
        boolean retVal = false;

        do {
            System.out.print(prompt + ": ");
            response  = pipe.nextLine();

            if(response.equalsIgnoreCase("y")){
                retVal = true;
                done = true;
            } else if (response.equalsIgnoreCase("n")){
                retVal = false;
                done = true;
            } else {
                System.out.printf("Please enter [Y/N], not " + response + "\n");
            }

        }while(!done);



        return retVal;

    }



    public static String getRegExString(Scanner pipe, String prompt, String regEx){

        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.matches(regEx)){
                done = true;
            } else {
                System.out.println(retVal + " must match the pattern: " + regEx);
            }

        }while(!done);


        return retVal;

    }

    public static void prettyHeader(String msg){

        int spaces = (54 - msg.length())/2;


        for (int x = 0; x <= 60; x++) {
            System.out.print("*");
        }


        System.out.print("\n" + "***");

        for(int f = 0; f <= spaces ; f++){

            System.out.print(" ");
        }

        System.out.print(msg);

        for(int f = 0; f <= spaces ; f++){

            System.out.print(" ");
        }

        System.out.print("***" + "\n");

        for (int x = 0; x <= 60; x++) {
            System.out.print("*");
        }


    }



    public static double CtoF(double Celsius) {

        double Fahrenheit = 0;

        for(Celsius = -100; Celsius <=100; Celsius++){
            Fahrenheit = (Celsius * 9/5) + 32;
            System.out.printf("\n"+ Celsius + " ==== " + Fahrenheit);
        }



        return Celsius;
    }



}
