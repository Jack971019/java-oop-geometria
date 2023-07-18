package org.lessons.java.geometria;

public class Squares1 {

    //campi

    int basevalue;
    int highValue;

    //costruttori

    Squares1(int basevalue, int highValue){
        this.basevalue= basevalue;
        this.highValue= highValue;
    }

    //metodi

    int getsquarearea(){
        int squarearea = basevalue * highValue;
        return squarearea;
    }

    int getsquareperimeter(){
        int suqareperimeter = basevalue * 4;
        return suqareperimeter;
    }


}
