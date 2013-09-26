/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.edu;

import com.unicauca.edu.service.FrequencyUnit;
import com.unicauca.edu.service.FrequencyUnitSoap;
import com.unicauca.edu.service.Frequencys;
import java.util.ArrayList;

/**
 *
 * @author Mosse
 */
public class ConvertClass {
    
    public static Frequencys[] frequencys = new Frequencys[]{
        Frequencys.HERTZ, Frequencys.KILOHERTZ, Frequencys.MEGAHERTZ, 
        Frequencys.GIGAHERTZ, Frequencys.MILLIHERTZ, Frequencys.RADIAN_PERSECOND,
        Frequencys.RADIAN_PERMINUTE, Frequencys.RADIAN_PERHOUR, Frequencys.REVOLUTION_PERSECOND,
        Frequencys.REVOLUTION_PERMINUTE, Frequencys.REVOLUTION_PERHOUR, Frequencys.CYCLE_PERSECOND
    };
    
    public static ArrayList<FrequencyObject> convert(Double value, String from){        
        try{
            FrequencyUnit service = new FrequencyUnit();
            FrequencyUnitSoap port = service.getFrequencyUnitSoap();
            ArrayList<FrequencyObject> list = new ArrayList<>();
            for(int i=0; i<frequencys.length; i++){
                double d = port.changeFrequencyUnit(value, Frequencys.fromValue(from), frequencys[i]);
                FrequencyObject object = new FrequencyObject(d, frequencys[i].value());
                list.add(object);
            }
            return list;
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
