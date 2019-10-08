import java.util.*;

public class Set implements SetInterface {

	private LinkedList<IdentifierInterface> elements = new LinkedList<IdentifierInterface>();


    public Set(){
	}

	public Set (Set src) {
		this.elements = src.elements;
	}

    // INTEFACE METHODS
    public void init() {
		this.elements.clear();		
	}

	public LinkedList<IdentifierInterface> getSet() {
		return this.elements;
	}

	public void remove(IdentifierInterface identifier) {
		elements.remove(identifier);		
	}

	public IdentifierInterface get() {
		/*
		Iterator<IdentifierInterface> iterator = elements.iterator();

		REMOVE FROM A COPY?
		
		if (iterator.hasNext()) {

			return iterator.next(); 
		}
		*/
		
		return null;
	}

	public boolean contains(IdentifierInterface compareIdentifier) {
		for (IdentifierInterface identifier : elements) {
			if (identifier.getContent().equals(compareIdentifier.getContent())) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return elements.size();
	}

	public void addIdentifier(IdentifierInterface identifier) { 
		if (!this.contains(identifier)) {
			this.elements.add(identifier);
		}
    }

	public Set difference(Set set) {
		Set resultSet = new Set();

		for (IdentifierInterface identifier : this.elements) {
			if (! set.contains(identifier)) {
				resultSet.addIdentifier(identifier);
			}
		}

		return resultSet;
	}

	public Set intersection(Set set) {
		Set resultSet = new Set();

		for (IdentifierInterface identifier : this.elements) {
			if (set.contains(identifier)) {
				resultSet.addIdentifier(identifier);
			}
		}

		return resultSet;
	}

	public Set union(Set set) {
		Set resultSet = new Set(this);

		for (IdentifierInterface identifier : set.elements) {
			resultSet.addIdentifier(identifier);
		}

		return resultSet;
	}

	public Set symmetricDifference(Set set) {

		System.out.println(this.printSet());
		System.out.println(set.printSet());

		Set difference1 = this.difference(set);
		Set difference2 = set.difference(this);

		Set resultSet = difference1.union(difference2);

		return resultSet;
    }


	// ADDITIONAL METHODS
	public String printSet(){
		
		String set = "";
		int i = 0;

		set += '{';

		while (i < this.size()) {
			set += elements.get(i).getContent();

			if (i != this.size() - 1) {
				set += (' ');
			}

			i++;
		}

		set += '}';

		return set;

    }
	
}