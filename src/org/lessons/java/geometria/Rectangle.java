package org.lessons.java.geometria;

public class Rectangle {

    //campi

    int basevalue;
    int highValue;

    //costruttori

    Rectangle(int basevalue, int highValue){
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
