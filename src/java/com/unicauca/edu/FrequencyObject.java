/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.edu;

/**
 *
 * @author Mosse
 */
public class FrequencyObject {
    
    double value;
    String unit;

    public FrequencyObject(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
}
