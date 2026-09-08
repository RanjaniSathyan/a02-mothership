package edu.unc.comp210.a02mothership;

public class WaterModule extends AModule{
    private int water;
    public WaterModule(int water){
        super("Water Module");
        this.water = water;
    }

    public void heatWater(int waterIncrease){
        this.water += waterIncrease;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println("Water Module: Water level: " + water);
        super.statusReport(moduleStatus, isSuccessful);
    }

}
