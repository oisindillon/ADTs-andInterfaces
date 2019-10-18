import java.util.Scanner;

public class Identifier implements IdentifierInterface {

    StringBuffer content;

    
    public Identifier(char c) throws Exception {
		init(c);
	}
    
    public Identifier () {
    }

    @Override
	public void addChar (char c) {
		this.content.append(c);
	}

    public void init (char c) throws Exception {	
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			StringBuffer sb = new StringBuffer(String.valueOf(c));
			this.content = sb;
		}
		else {
			throw new Exception("Syntax Error: An Identifier must start with a letter.");
		}
	}
    
    public IdentifierInterface copy() {
        Identifier copiedIdentifier = new Identifier();
        copiedIdentifier.content = this.content;
        return copiedIdentifier;
    }

    
    public boolean equals(IdentifierInterface id) {
        if (this.content.equals(id.getContent())) {
            return true;
        }
        return false;
    }


    public char atIndex(int index) {
        if (index > this.content.length() && content != null) {
            return 'd';
        }
  
        char c = this.content.charAt(index);
        return c;
    }

    public String getContent() {
        if (content == null) {
            return null;
        }
        return this.content.toString();
    }

    public int size() {
        return this.content.length();
    }

    public boolean create (Scanner input) throws Exception {
        
        try {
            char c;

            // initialize the identifier with with the first character
            if (Syntax.nextCharIsEOLN(input)) {
                throw new Exception("Syntax error: The set should end with '}'.");
            } else if (!Syntax.nextCharIsAlphanumeric(input)) {
                throw new Exception("Syntax error: Non-alphanumeric characters are not allowed.");
            } else {
                c = Syntax.getContent(input);
                init(c);
            }
            
            
            // if more characters follow, append them to the identifier
            while (Syntax.nextCharIsAlphanumeric(input)) {
                c = Syntax.getContent(input);
                addChar(c);
            }      
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return true;
    }
}