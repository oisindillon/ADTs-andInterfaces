import java.util.Scanner;

public class Program{ 
    

    void run () {        
        
        Scanner input = new Scanner(System.in); 

        Set set1 = new Set(),
            set2 = new Set();

        while (getSets(input, set1, set2)) {
            //calculateAndGiveOutput(set1, set2);
            System.out.println("Inputs are correct.");
        }  
        

    }
    

    boolean getSets (Scanner input, Set set1, Set set2) {
        return getSet(input, "Give first set : ", set1) && 
               getSet(input, "Give second set : ", set2);
    }
    
    /*
    void eoln (Scanner input) throws Exception {
        if (input.hasNext()) {
            System.out.println("Next is: " + input.next());
            throw new Exception("Error: hasNext");
        } else {
            System.out.println("End of line");
        }
    }
    */


    /*
    Identifier[] identifiersRow (Scanner input) {
        
        Identifier[] result = new Identifier[20];
        int count = 0;
 
        result[count] = (Identifier.identifier(input));
    
        while (input.hasNext(" ")) {
            try {
                Syntax.isSpace(input);
                count++;
                result[count] = (Identifier.identifier(input));
            } catch (Exception e) {
                System.out.println(e);
            }
   
            
        }
    
        return result;
       
    }
    */
   
     
    boolean getSet (Scanner input, String question, Set set) {

        
        input.useDelimiter("");
        Identifier identifierr = new Identifier();
        System.out.printf(question);
        try{  
            Syntax.isOpen(input);
            identifierr.identifier(input);
            
            //set.elements = identifiersRow(input);

            //identifier.set(Identifier.identifier(input));
            
            Syntax.isClose(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        input.nextLine();
        return true;
        


        /*
        do {
            System.out.printf("%s", question);
            
            if (! input.hasNextLine()) {
                System.out.printf("\n"); 
                return false;
            }
        } while (! validSet(input, set));
        */
        
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
