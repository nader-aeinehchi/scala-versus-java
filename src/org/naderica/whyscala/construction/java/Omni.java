package org.naderica.whyscala.construction.java;

public class Omni {

    private final String name;
    public Omni(final String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    
    @Override
    public String toString() {
        return "Omni [name=" + name + "]";
    }

    public final static Omni newInstance(final String name){
        return new Omni(name);
    }
    
    public static void main(String[] args) {
        System.out.println(Omni.newInstance("Martin Odersky"));
    }
}
