/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.multimedia_matija_losic;

/**
 *
 * @author qa
 */
public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public Computer() {
        this.operatingSystem = "Linux";
        this.processTact = 2.4;
        this.memory = 16.0;
        this.hardDrive = 500;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String customoperatingSystem) {
        this.operatingSystem = customoperatingSystem;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
    
    public void setProcessTact (double customProcessTact) {
        this.processTact = customProcessTact;
    }
    
    public double getMemory () {
        return this.memory;
    }
    
    public void setMemory (double customMemory) {
        this.memory = customMemory;
    }
    
}
