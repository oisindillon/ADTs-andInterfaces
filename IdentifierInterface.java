public interface IdentifierInterface{

/*
 *
 * • Only alphanumeric characters are allowed as elements of an identifier.
 * • An identifier begins with a letter.
 * • Identifiers have a length of at least 1 character
 * 
 */

// Write the conditions here:

/* 
 * 
 * Elements: list of characters
 * Structure: linear
 * Domain: ???
 * 
 * 
 */

 IdentifierInterface createIdentifier(String stringIdentifier);
 /*
 *  PRE - 
 *  POST - Identifer is created with correct syntax
 */

 boolean checkInput(Object inputToCheck);
 /*
 *  PRE - 
 *  POST - will tell you if the desired input for the identifier is an identifiers 
 */

}