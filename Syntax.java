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

    // Method to check if the next character is a '{'. When called it moves the Scanner forward.
    public static boolean isClose (Scanner input) throws Exception {
        if (! input.hasNext("\\}")) {
            throw new Exception("Error: isClose");
        } 
        input.next();
        return true;
    }

    public static boolean isOpen (Scanner input) throws Exception {
        if (! input.hasNext("\\{")) {
            throw new Exception("Error: isOpen");
        } 
        input.next();
        return true;
    }

    public static boolean isSpace (Scanner input) throws Exception {
        if (! input.hasNext(" ")) {
            throw new Exception("Error: space");
        } 
        input.next();
        return true;
    }

    public static char isLetter (Scanner input) throws Exception {
        if (! nextCharIsLetter(input)) {
            throw new Exception("Error: not a letter");
        } 
        return getContent(input);
    }    

    public static char isAlphanumeric (Scanner input) throws Exception {
        if (! nextCharIsAlphanumeric(input)) {
            throw new Exception("Error: not alphanumeric");
        } 
        return getContent(input);
    }

    // method to get the contents of input
    public static char getContent (Scanner input) {
        String character = input.next();
        return character.charAt(0);
    }


}