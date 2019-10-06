import java.util.Scanner;

public class Program{ 
    Scanner input = new Scanner("{afew }"); 

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
    boolean isClose (Scanner input) throws Exception {
        if (! input.hasNext("\\}")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is }");
        }   
        input.next();
        return true;
    }
    boolean isLetter (Scanner input) throws Exception {
        if (! input.hasNext("[a-zA-Z]")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is a letter");
        }
        input.next();
        return true;
    }
    boolean isAlphanumeric (Scanner input) throws Exception {
        if (! input.hasNext("[a-zA-Z0-9]")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is a letter/digit");
        }
        input.next();
        return true;
    }
    boolean isSpace (Scanner input) throws Exception {
        if (! input.hasNext(" ")) {
            throw new Exception("Error");
        } else {
            System.out.println("Char is a space");
        }
        input.next();
        return true;
    }
    void eoln (Scanner input) throws Exception {
        if (input.hasNext()) {
            throw new Exception("Error");
        }
    }
    String identifier (Scanner input) {
        String result = new String();

        try {
            isLetter(input);

            while (input.hasNext("[a-zA-Z0-9]")) {
                isAlphanumeric(input);
            }
        
         } catch (Exception e) {
             System.out.println(e);
         }

        return result;
    }
    /*
    Student student (Scanner input) throws APException {
        Student result = new Student();
     
        result.putstudentnumber(studentnumber(input));
        character(input, ';');
        result.putData(data(input));
        character(input, ';');
     
        return result;
    }
    */
     
    boolean getSet (Scanner input, String question, Set set) {

        input.useDelimiter("");
        String newIdentifier = "";
        //System.out.printf(question);
        try{  
            isOpen(input);
            newIdentifier = identifier(input);
            isSpace(input);
            isClose(input);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Identifier: " + newIdentifier);

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
