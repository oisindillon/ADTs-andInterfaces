
public class Identifier implements IdentifierInterface {

    private StringBuffer content;

    
    public Identifier(char c) throws Exception {
		init(c);
	}
	
	private Identifier() {
		this.content = new StringBuffer();
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
		copiedIdentifier.content = new StringBuffer(new String(this.getContent()));
        return copiedIdentifier;
    }

    
    public boolean equals(IdentifierInterface id) {
        if (this.getContent().equals(id.getContent())) {
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

}