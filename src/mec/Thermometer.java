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
public class Thermometer {
    protected static int tID;
    
    protected Crop crop;
    public int temperature = 20;
    
    protected int tempID;
    
    public Thermometer(){
        this.tempID = ++tID;
    }
    
    public int getTemperature(){
        return this.temperature;
    }
    
    public int getTemperatureDifference(){
        return this.temperature - crop.getPrefferedTemperature();
    }
    
    public void setCrop(Crop crop){
        this.crop = crop;
    }
}
