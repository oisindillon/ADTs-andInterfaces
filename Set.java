import java.util.*;

public class Set implements SetInterface, Iterable<IdentifierInterface>{

	private IdentifierInterface[] elements = new IdentifierInterface[MAX_SET_LENGTH];
	private int startIndex = 0;
	private int size = 0; 


    public Set(){
	}


    // INTEFACE METHODS
    public void init() {
		for (int i = 0; i < MAX_SET_LENGTH; i++) {
			elements[i] = null;
		}
		this.startIndex = 0;
		this.size = 0;
	}

	public void remove(IdentifierInterface identifier) {
		
		if (this.contains(identifier)) {
			Iterator<IdentifierInterface> iterator = this.iterator();
			
			
			// Iterate through the array until the identifier is found
			while (iterator.hasNext()) {
				
				IdentifierInterface currentIdentifier = iterator.next();
				
				// When found, move the starting identifier into its place
				if (currentIdentifier.equals(identifier)) {
					
					IdentifierInterface firstIdentifier = this.get();
					currentIdentifier = firstIdentifier;
					firstIdentifier = null;
					
					startIndex++;
					size--;
					
					return;
				}
			}
		}
	}


	public IdentifierInterface get() {
		if (elements[startIndex] == null) {
			return null;
		}
		IdentifierInterface identifier = elements[startIndex];
		return identifier;
	}

	public boolean contains(IdentifierInterface compareIdentifier) {
		
		for (IdentifierInterface identifier : elements) {
			if (identifier != null && identifier.getContent().equals(compareIdentifier.getContent())) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return size;
	}

	public boolean addIdentifier(IdentifierInterface identifier) throws Exception { 
		
		// Case: @pre contains 20 elements
		if (size == MAX_SET_LENGTH) {
			throw new Exception("Operation Error: The set has reached a maximum of " + MAX_SET_LENGTH + " elements.");
		}
		
		// Case: @pre contains the identifier
		else if (this.contains(identifier)) {
			throw new Exception("Operation Error: The set must not contain any duplicates. Remove any extra occurances of '" + identifier.getContent() + "'.");
		}
	
		// Case: the identifier can be added successfully
		this.elements[(startIndex+size) % MAX_SET_LENGTH] = identifier;
		size++;
		
		return true;
    }
	
	public SetInterface copy() {	
		
		SetInterface setCopy =  new Set();
		
		for (int i=0; i<MAX_SET_LENGTH; i++) {
			try {
				setCopy.addIdentifier(this.elements[i].copy());
			} catch (Exception e) {
				
			}
		}
		
	
		
		return setCopy;
	}



	// SET OPERATIONS 

	public Set difference(SetInterface set) {
		
		Set resultSet = new Set();
		
		Iterator<IdentifierInterface> iterator = this.iterator();

		// Iterate through the second set 
    	while (iterator.hasNext()) {
    		
    		IdentifierInterface currentIdentifier = iterator.next();
    		
    		// If an element from the first set is not in the second set, 
    		// add it to the result set
    		if (! set.contains(currentIdentifier)) {
				try {
					resultSet.addIdentifier(currentIdentifier);
				} catch (Exception e) {
					e.getMessage();
				}
			}

    	}

    	
		return resultSet;
	}

	public Set intersection(SetInterface set) {
		
		Set resultSet = new Set();
		
		Iterator<IdentifierInterface> iterator = this.iterator();

		// Iterate through the second set 
    	while (iterator.hasNext()) {
    		
    		IdentifierInterface currentIdentifier = iterator.next();
    		
    		// If an element from the first set is in the second set, 
    		// add it to the result set
    		if (set.contains(currentIdentifier)) {
				try {
					resultSet.addIdentifier(currentIdentifier);
				} catch (Exception e) {
					e.getMessage();
				}
			}

    	}


		return resultSet;

	}

	public Set union(SetInterface set) throws Exception {

		Set resultSet = new Set();

		// add all elements of the first set
		Iterator<IdentifierInterface> iterator = this.iterator();
		
    	while (iterator.hasNext()) {
    		resultSet.addIdentifier(iterator.next());
    	}
    	
    	// add all elements of the first set
		iterator = set.iterator();
		
    	while (iterator.hasNext()) {
    		
    		// try-catch ignores the errors about duplicates and continues on adding the identifiers
    		try {
    			resultSet.addIdentifier(iterator.next());
    		} catch (Exception e) {
    			
    		}
    	}	
    	
		return resultSet;
	}

	public Set symmetricDifference(SetInterface set) throws Exception {

		Set resultSet = new Set(); 
		
		// Get A / B
		Set difference1 = this.difference(set);

		// Get B / A
		Set difference2 = set.difference(this);

		// Add the resulting sets
		resultSet = difference1.union(difference2);

		return resultSet;
    }



	// ITERATOR

	@Override
	public Iterator<IdentifierInterface> iterator() {
		return new SetIterator(elements);
	}
	
	
	public class SetIterator implements Iterator<IdentifierInterface> {
		
		int current = startIndex;

		public SetIterator(IdentifierInterface[] elements) {
		}

		@Override
		public boolean hasNext() {
			return elements[current] != null;
		}

		@Override
		public IdentifierInterface next() {
									
			IdentifierInterface identifier = (IdentifierInterface) elements[current];
			
			current = (current+1) % MAX_SET_LENGTH;
						
			return identifier;
		}
		
	}	
	
	
}