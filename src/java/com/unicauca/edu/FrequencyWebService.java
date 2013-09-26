/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.edu;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Mosse
 */
@WebService(serviceName = "FrequencyWebService")
public class FrequencyWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "convert")
    public ArrayList<FrequencyObject> convert(@WebParam(name = "value") Double value, @WebParam(name = "from") String from) {
        return ConvertClass.convert(value, from);
    }
}
