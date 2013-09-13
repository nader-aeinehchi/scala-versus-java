/**
 * The package illustrates how Domain Transfer Objects(DTO) can be done in Java and Scala.
 * 
 * <p>Domain Transfer Objects(DTO) are frequently referred to as Value Objects.  Primarily, DTOs are data carriers.  
 * 
 * <p>DTOs are a simplification of
 * JavaBean standard where attributes have getters and setters.  In doing so, DTOs are modeled as mutable objects.
 * 
 * <p>DTOs should rather be implemented as immutable classes as shown in <code>aggregation</code> and <code>composition</code> packages.
 * 
 * <p>In this package, we have created mutable classes.
 * 
 * <p>Note that Java examples all override <code>hashCode</code> and <code>equals</code> methods.  
 * This is to ensure that different objects with represent the same entity are treated as equal.  Not doing so results in well-known widespread bugs. 
 * Furthermore, they override <code>toString</code> method.
 * When attributes are added or removed, the Java developer has to manually update the code.  
 * On the other hand, Scala case classes automatically provide these methods.
 * Adding or removing attributes is therefore very simple in Scala.
 * 
 *  
 *   
 */
package org.naderica.whyscala.dto;

