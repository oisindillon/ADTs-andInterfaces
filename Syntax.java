import java.util.Scanner;

public class Syntax {

    public Syntax(){
    }

    // SYNTAX METHODS
   
    // Boolean checks for letters/digits
    public static boolean nextCharIsAlphanumeric(Scanner input){
        return input.hasNext("[a-zA-Z0-9]");
    }

    public static boolean nextCharIsLetter(Scanner input){ 
        return input.hasNext("[a-zA-Z]");
    }

    public static boolean nextCharIsSpace(Scanner input){ 
        return input.hasNext(" ");
    }

    public static boolean nextCharIsOpen(Scanner input){ 
        return input.hasNext("\\{");
    }

    public static boolean nextCharIsClose(Scanner input){ 
        return input.hasNext("\\}");
    }

    public static boolean nextCharIsEOLN(Scanner input){ 
        return input.hasNext("\\s");
    }

    // Methods to move the Scanner forward if the next character meets the condition
    public static boolean isClose (Scanner input) throws Exception {
        if (! nextCharIsClose(input)) {
            throw new Exception("Syntax error: The set should end with '}'.");
        } 
        input.next();
        return true;
    }

    public static boolean isOpen (Scanner input) throws Exception {
        if (! nextCharIsOpen(input)) {
            throw new Exception("Syntax error: The set should start with '{'.");
        } 
        input.next();
        return true;
    }

    public static boolean isSpace (Scanner input) throws Exception {
        if (! nextCharIsSpace(input)) {
            throw new Exception("Syntax Error: The identifiers should be separated by whitespaces only.");
        } 
        input.next();
        return true;
    }

    public static char isLetter (Scanner input) throws Exception {
        if (! nextCharIsLetter(input)) {
            throw new Exception("Syntax Error: An identifier must start with a letter.");
        } 
        return getContent(input);
    }    

    public static char isAlphanumeric (Scanner input) throws Exception {
        if (! nextCharIsAlphanumeric(input)) {
            throw new Exception("Syntax Error: An identifier can only contain alphanumeric characters.");
        } 
        return getContent(input);
    }
    
    public static void skipSpaces (Scanner input) {
        while (Syntax.nextCharIsSpace(input)) {
            try {
                Syntax.isSpace(input);
            } catch (Exception e) {

            }            
        }
    }

    public static boolean eoln (Scanner input) throws Exception {
        while (nextCharIsSpace(input)) {
            isSpace(input);
        }

        if (! nextCharIsEOLN(input)) {
            throw new Exception("Syntax Error: There should be no characters after the '}'.");
        } 
        return true;
    }

    // Method to get the contents of input
    public static char getContent (Scanner input) {
        String character = input.next();
        return character.charAt(0);
    }


}