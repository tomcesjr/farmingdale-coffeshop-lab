package edu.farmingdale;

public abstract class Drink {

    public String name;
    public String temp="hot";
    public String size="small";
    public String milkType = "none";
    public int numShots=0;
    public String sweetener="none";

    //All drinks have a name and can be iced or hot
    public Drink(String name, String temp){
        this.name = name;
        this.temp = temp;
    }
    //Builder setter methods
    public Drink setSize(String size){
        this.size = size;
        return this;
    }
    public Drink setMilkType(String milkType){
        this.milkType = milkType;
        return this;
    }
    public Drink setNumShots(int numShots){
        this.numShots = numShots;
        return this;
    }
    public Drink setSweetener(String sweetener){
        this.sweetener = sweetener;
        return this;
    }



    public String toString() {
        return"Beverage: " + name +
                "\nTemperature: " + temp +
                "\nSize: " + size +
                "\nMilk: " + milkType +
                "\nShots: " + numShots +
                "\nSweetener: " + sweetener;
    }
}
