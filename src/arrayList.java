import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        boolean done = false;


    do{
        System.out.print(arrayList);
        String menuInput = SafeInput.getRegExString(in, "\nWhat would you like to do? Add, Delete, Insert, Print, or Quit?","[aAdDiIpPqQ]");

        menuInput.toLowerCase();

            if (menuInput.equals("a")){

                    String add = SafeInput.getNonZeroLenString(in,"What would you like to add to the list?");
                    arrayList.add(add);

            }
            else if(menuInput.equals("d")) {

                if (arrayList.size() == 0) {
                    System.out.println("There are no indexes to delete!");
                } else {
                    int del = SafeInput.getRangedInt(in, "Which index would you like to delete?",0, arrayList.size() -1);
                    if (del < arrayList.size()) {
                        arrayList.remove(del);
                    }
                }
            }
            else if(menuInput.equals("i")){

                int loc = SafeInput.getInt(in, "Where would you like to add your index?");
                String insert = SafeInput.getNonZeroLenString(in, "What would you like to add?");
                arrayList.add(loc,insert);
            }
            else if(menuInput.equals("p")){
                System.out.println(arrayList);
            }
            else if(menuInput.equals("q")) {
                boolean confirm = SafeInput.getYNConfirm(in, "Are you sure?");
                if(confirm == true) {
                    done = true;
                }else{
                    done= false;
                }
            }


    }while(!done);



    }
}
