package org.springframework.samples.petclinic.util;

public class BrokenSingleton {

    public static BrokenSingleton INSTANCE;

    private String someValue;

    public static BrokenSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new BrokenSingleton();
        }
        return INSTANCE;
    }

    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }
}
