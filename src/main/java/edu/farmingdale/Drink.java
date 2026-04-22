package edu.farmingdale;

public abstract class Drink {

    public String name;
    public String temp=null;
    public String size;
    public String milkType = "none";
    public int numShots=0;
    public String sweetener="none";

    //All drinks have a name and can be iced or hot
    public Drink(String name, String size){
        this.name = name;
        this.size = size;
    }
    //Builder setter methods

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

    public Drink setTemp(String temp){
        this.temp = temp;
        return this;
    }
    public abstract boolean allowsMilk();
    public abstract boolean allowsShots();
    public abstract boolean allowsTemp();




    public String toString() {
        String s= "Drink: " + name +
                "\nSize: " + size;
                if(temp!=null) s+= "\nTemp: " + temp;
               if(milkType != "none"){s+="\nMilk: " + milkType;}
            if(sweetener != "none"){s+="\nSweetener: " + sweetener;}
            if(numShots != 0){s+="\nShots: " + numShots;}
    return s;
    }
}
