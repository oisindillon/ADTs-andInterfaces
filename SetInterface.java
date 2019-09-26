public interface SetInterface{

public static final int MAX_SET_LENGTH = 20; 

/* 
 * 
 * Elements: Objects of type Identfier
 * Structure: non-linear 
 * Domain: Rows of objects of type Identifier not exceeding 20 elements
 * 
 * constructors
 * 
 * Set();
 *   PRE  -
 *   POST - A new Set-object has been created and is an empty set
 * 
 * Set (Set src);
 *   PRE  -
 *   POST - A new Set-object has been created and is a copy of src
 * 
 */

void init();
/*  PRE  - 
 *  POST - The set is empty.
 */

void remove (IdentifierInterface identifier);
/*  PRE    - 
    POST   - The identifier is not in the set 
*/ 

IdentifierInterface get();
/*  PRE    - The set is not empty
    POST   - An element from the set is returned
*/ 

boolean contains (IdentifierInterface identifier);
/*  PRE    - 
    POST   - true:  The set does contain the identifier
             false: The set does not contain the identifier
*/ 

int size();
/*  PRE    - 
    POST   - The amount of elements of the set is returned
*/ 

void addIdentifier (IdentifierInterface identifier);
/*  PRE    - 
    POST   - success: The identifier is added to the set
             failure: if the set contains 20 elements or if the set already contains the identifier, no changes are made
*/ 

SetInterface difference (SetInterface set); 
/*  PRE  -  
    POST - a new set that is the difference of both sets is returned
*/ 

SetInterface intersection (SetInterface set); 
/*  PRE  -  
    POST - a new set that is the intersection of both sets is returned
*/ 

SetInterface union (SetInterface set); 
/*  PRE  - 
    POST - success: a new set that is the union of both sets is returned
           failure: if the union of both sets exceeds 20 elements, an error occurs
*/ 

SetInterface symmetricDifference (SetInterface set); 
/*  PRE  -  
    POST -  success: a new set that is the symmetric difference of both sets is returned
            failure: the symmetric difference of both sets exceeds 20 elements, an error occurs
*/

}