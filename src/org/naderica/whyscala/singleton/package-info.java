/**
 * The package illustrates how singletons can be done in Java and Scala.
 * 
 * <p>Singletons have been around for decades, but still they are <b>most often</b> programmed wrongly by Java developers.
 * As singletons are used by multiple users (read threads), they have to be thread safe.  It is widely <b>thought</b> by Java developers that object 
 * instantiation is expensive.  Therefore, most developers adopt lazy initialization at the cost of ending up with classes that are not thread safe.
 * The latter results in random errors (exceptions) in production which are extremely hard to detect and fix.  Another approach that some Java developers adopt
 * is to use synchronization or locks.  Firstly, the latter has a performance/scalability penalty.  Secondly, synchronization and locking is unfortunately 
 * too often gets implemented by Java developers.
 * 
 * <p>In the Java examples, we have implemented singletons as final static variables.  Strictly speaking, we should have created a code that 
 * reads:
  <pre>
  <code>
   public class SomeMachine {

    public final static SomeMachine INSTANCE = new SomeMachine();
    private SomeMachine(){
        
    }
    
    public void doXXXx(){        
    }}
 </code>
 </pre>
 * 
 * Alternatively, we could use an Enum in Java as:
 <pre>
 <code>
public enum EnumMachine {

    INSTANCE;
    
    public void doXXX(){
        
    }
}
 </code>
 </pre>
 
 * <p>In Scala, a singleton is created as <code>object MySingleton</code>.  A Scala object is simply a class that is singleton.  Scala provides something called
 * companion objects.  Companion objects have the same name as the class which makes them additional acces to the internal implementation of the class.
  
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
package org.naderica.whyscala.singleton;

import org.naderica.whyscala.singleton.java.SomeMachine;

