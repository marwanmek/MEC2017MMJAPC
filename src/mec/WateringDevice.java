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
public class WateringDevice {
    protected static int wdID;
    
    protected int waterDevice;
    protected int soilSensor;
    
    protected boolean operating = false;
    protected int deviceID;
    
    public WateringDevice(){
        deviceID = ++wdID;
    }
    
    public void setOperating(boolean operating){
        this.operating = operating;
    }
    
}
