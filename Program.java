import java.util.Scanner;

public class Program{ 
    Scanner input = new Scanner("{a } b c}"); 

    void run () {        
        

        Set set1 = new Set(),
            set2 = new Set();


        // Testing:
        getSet(input, "Give set: ", set1);



        /*
        while (getSets(input, set1, set2)) {
            //calculateAndGiveOutput(set1, set2);
            System.out.println("Inputs are correct.");
        }  
        */

    }
    

    boolean getSets (Scanner input, Set set1, Set set2) {
        return getSet(input, "Give first set : ", set1) && 
               getSet(input, "Give second set : ", set2);
    }
    
    
    void isOpen (Scanner input) throws Exception {
        if (! input.hasNext("\\{")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is {");
        }   
        input.next();
    }
    void isClose (Scanner input) throws Exception {
        if (! input.hasNext("\\}")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is }");
        }   
        input.next();
    }
    void isLetter (Scanner input) throws Exception {
        if (! input.hasNext("[a-z]")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is a letter");
        }
        input.next();
    }
    void isSpace (Scanner input) throws Exception {
        if (! input.hasNext(" ")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is a space");
        }
        input.next();
    }
    
    void next (Scanner input) {
        System.out.println("this.input.next(): " + this.input.next());
    }
    
    boolean getSet (Scanner input, String question, Set set) {

        input.useDelimiter("");
        String character = "{";
        //System.out.printf(question);
        try{  
            isOpen(input);
            isLetter(input);
            isSpace(input);
            isClose(input);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        

        /*
        do {
            System.out.printf("%s", question);
            
            if (! input.hasNextLine()) {
                System.out.printf("\n"); 
                return false;
            }
        } while (! validSet(input, set));
        */

        

        return true;
    }
    
    boolean validSet(Scanner input, Set setToValidate) {
        boolean valid = true;
        //call function to check errors
        if(valid) {
            System.out.println("Input is: " + input);
        }
        
        return valid; //assume it's valid
    }

    void calculateAndGiveOutput(Set set1, Set set2) {
        System.out.println("Finished");
    }
}
