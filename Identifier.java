import java.util.regex.Pattern;
import java.util.Scanner;

public class Identifier implements IdentifierInterface {

    String element;

    public IdentifierInterface addChar(char charInput) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public IdentifierInterface copy() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public boolean equals(IdentifierInterface id) {
        // TODO Auto-generated method stub
        return false;
    }

    
    public void init(char c) {
        // TODO Auto-generated method stub

    }

    
    public char atIndex(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    public String getIdentifier() {
        return this.element;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void set(String content) {
        this.element = content;
    }

    public String get() {
        return this.element;
    }

    public static String identifier (Scanner input) {
        String result = new String();

        try {
            result += Set.isLetter(input);

            while (input.hasNext("[a-zA-Z0-9]")) {
                result += Set.isAlphanumeric(input);
            }
        
         } catch (Exception e) {
            System.out.println(e);
         }

        return result;
    }
}