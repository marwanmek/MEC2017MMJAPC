/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mec;

/**
 *
 * @author Marwan
 */
public class Crop {
    private static int ID;
    
    protected String type;
    protected int waterLevel;
    protected int preferredTemperature;
    
    protected WateringDevice waterDevice;
    public SoilSensor soilSensor;
    protected Thermometer thermometer;
    
    protected boolean watering = false;
    protected int cropID;
    
    public Crop(String type, int waterLevel, int preferredTemperature, Thermometer thermometer, SoilSensor soilSensor, WateringDevice waterDevice) {
        this.cropID = ++ID;
        this.type = type;
        this.preferredTemperature = preferredTemperature;;
        this.waterLevel = waterLevel;
        /*
        this.thermometer = thermometer;
        this.soilSensor = soilSensor;
        this.waterDevice = waterDevice;
        */
    }
    
    public void setWaterLevel(int waterLevel){
        this.waterLevel = waterLevel;
    }
    
    public void setPrefferedTemperature(int preferredTemperature){
        this.preferredTemperature = preferredTemperature;
    }
    
    public int getPrefferedTemperature(){
        return this.preferredTemperature;
    }
    
    public void water(){
        while(this.soilSensor.getLevel()<this.waterLevel){
               
        }        
    }
    
}
