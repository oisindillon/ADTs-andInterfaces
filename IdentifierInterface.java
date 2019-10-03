public interface IdentifierInterface{

/* 
 * 
 * Elements: alphanumeric characters
 * Structure: linear
 * Domain: all arrays of alphanumeric characters with a length greater than 0 and starting with a letter
 * 
 * A default constructor is not allowed
 * 
 * Identifier (char src);
 *   PRE- 
 *   POST- src is a letter
 *       - if src is not letter, the method fails with an exception
 * 
 */

IdentifierInterface addChar(char charInput);
/*  PRE -  char is alphanumeric
 *  POST - c is appended
 */

IdentifierInterface copy();
/*  PRE - 
 *  POST - A new identifier with the same elements
 */

boolean equals(IdentifierInterface id);
/*  PRE - 
 *  POST - Returns true if this is equal to identifier chosen
 */

void init(char c);
/*  PRE -
 *  POST - src is a letter
 *       - if src is not letter, the method fails with an exception
 * 
 */

char atIndex(int index);
/*  PRE - identifier is not empty and index is not greater than this.size()
 *  POST - gives char from desired index given
 */

String getIdentifier();
/*  PRE - 
 *  POST - returns the whole identifier as a string
 */

int size();
/*  PRE-
 *  POST - number of elements in identifier is given
 */

}