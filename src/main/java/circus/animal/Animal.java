package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    public abstract String speak();
    // When u make a method abstract u have to make a class abstract
    // Not the other way around

//    public int getValue() {
//        return 10;
//    }
}
