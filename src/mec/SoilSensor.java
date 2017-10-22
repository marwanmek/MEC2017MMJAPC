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
public class SoilSensor {
    protected static int soilID;
    
    public int waterLevel;
    
    //protected WateringDevice waterDevice;
    protected Crop crop;
    
    protected int soilSensorID;
    
    public SoilSensor(){
        this.soilSensorID = ++soilID;
        this.waterLevel = 0;
    }
    
    public int getLevel(){
        return waterLevel;
    }
    
    
}
