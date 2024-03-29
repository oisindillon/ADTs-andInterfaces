import java.util.Iterator;

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
    POST   - An element from the set is returned, null otherwise
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

boolean addIdentifier (IdentifierInterface identifier) throws Exception;
/*  PRE    - 
    POST   - success: identifier is in the set 
             failure: if size of set @pre is 20 and identifier not in set @pre, then no changes, set @pre == set @post
*/ 

Set difference (SetInterface set); 
/*  PRE  -  
    POST - a new set that is the difference of both sets is returned
*/ 

Set intersection (SetInterface set); 
/*  PRE  -  
    POST - a new set that is the intersection of both sets is returned
*/ 

Set union (SetInterface set) throws Exception; 
/*  PRE  - 
    POST - success: a new set that is the union of both sets is returned
           failure: if the union of both sets exceeds 20 elements, a "set is full" error occurs
*/ 

Set symmetricDifference (SetInterface set) throws Exception; 
/*  PRE  -  
    POST -  success: a new set that is the symmetric difference of both sets is returned
            failure: the symmetric difference of both sets exceeds 20 elements, a "set is full" error occurs
*/


Iterator<IdentifierInterface> iterator();
/*  PRE  -  
    POST -  an Iterator Object for the set is returned
*/
}