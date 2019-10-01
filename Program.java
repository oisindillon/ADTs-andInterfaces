import java.util.Scanner;

public class Program{    

    void run () {
        Scanner in = new Scanner(System.in);
        
        Set set1 = new Set(),
            set2 = new Set(); 

        
        while (getSets(in, set1, set2)) {
            calculateAndGiveOutput(set1, set2);
        }  

    }
    

    boolean getSets (Scanner input, Set set1, Set set2) {
        return getSet(input, "Give first set : ", set1) && 
               getSet(input, "Give second set : ", set2);
    }
    
    
    boolean getSet (Scanner input, String question, Set set) {
        String setToValidate;

        System.out.printf(question);
        do {
            input.nextLine();
            if (input.hasNext()) {
                setToValidate = input.next();
                System.out.printf("Set: " + setToValidate);
            } else {
                System.out.printf("No input given.\n");
            }
        } while (! input.hasNext());
        

        /*
        do {
            

            if (input.hasNext()) {
                
            } else {
                System.out.printf("has no next\n");
                return false;
            }
        } while (! validSet(input, set));         

        */

        return true;
    }

    
    static String function(Scanner in) {
        
        System.out.print("Input: ");
        String setToValidate = in.next();
        return setToValidate;
    }
    
    boolean validSet(Scanner input, Set set) {
        boolean valid = true;
        //call function to check errors
        if(valid) {
        }
        
        return valid; //assume it's valid
    }

    void calculateAndGiveOutput(Set set1, Set set2) {
        System.out.println("Finished");
    }
}
