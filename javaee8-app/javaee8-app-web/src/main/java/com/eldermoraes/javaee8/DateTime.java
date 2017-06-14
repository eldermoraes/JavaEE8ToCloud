package com.eldermoraes.javaee8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.ejb.Stateless;

/**
 *
 * @author eldermoraes
 */
@Stateless
public class DateTime {
    
    public String getCurrent(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }
}
