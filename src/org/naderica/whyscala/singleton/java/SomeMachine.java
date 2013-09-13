package org.naderica.whyscala.singleton.java;

/**
 * A simple singleton in Java.
 * 
 * 
 */
public class SomeMachine {

    public final static SomeMachine INSTANCE = new SomeMachine();

    /**
     * Prevents external instantiation to ensure that there exists one and only one instance.
     */
    private SomeMachine() {

    }

    public void doXXXx() {

    }
}
