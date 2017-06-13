/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.javaee8;

import java.time.LocalTime;
import javax.ejb.Stateless;

/**
 *
 * @author eldermoraes
 */
@Stateless
public class Watch {
    
    public String getCurrent(){
        return LocalTime.now().toString();
    }
}
