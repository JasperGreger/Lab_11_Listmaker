import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArray = new ArrayList<>();
        int total = myArray.size();
        boolean done = false;


    do{
        System.out.print(myArray);
        String menuInput = SafeInput.getRegExString(in, "\nWhat would you like to do? Add, Delete, Insert, Print, or Quit?","[aAdDiIpPqQ]");

        menuInput.toLowerCase();

            if (menuInput.equals("a")){

               myArray.add(addIndex());

            }

            else if(menuInput.equals("d")) {
                if (myArray.isEmpty()) {
                    System.out.println("There are no indexes to delete!");
                }else {

                    for(int x = 0; x < myArray.size(); x++){
                        System.out.print(x + ": " + myArray.get(x) + "\n");
                    }
                    int del = SafeInput.getRangedInt(in, "Which index would you like to delete?",0, myArray.size()-1);
                    myArray.remove(del);
                }

            }

            else if(menuInput.equals("i")){

                int loc = insertInd();
                String insert = insertStr();

                myArray.add(loc,insert);
            }

            else if(menuInput.equals("p")){
                System.out.println(myArray);
            }

            else if(menuInput.equals("q")) {
                if(quitMenu() == true) {
                    done = true;
                }else{
                    done= false;
                }
            }


    }while(!done);

    }



    private static String addIndex(){
        Scanner in = new Scanner(System.in);
        return SafeInput.getNonZeroLenString(in,"What would you like to add to the list?");
    }

    private static int insertInd(){
        Scanner in = new Scanner(System.in);
        return SafeInput.getInt(in, "Where would you like to add your index?");
    }

    private static String insertStr(){
        Scanner in = new Scanner(System.in);
        return SafeInput.getNonZeroLenString(in, "What would you like to add?");
    }

    private static boolean quitMenu(){
        Scanner in = new Scanner(System.in);
        return SafeInput.getYNConfirm(in, "Are you sure?");
    }

}
