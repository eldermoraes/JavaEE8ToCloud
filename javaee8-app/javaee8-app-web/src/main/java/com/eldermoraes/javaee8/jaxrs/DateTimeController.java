/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.javaee8.jaxrs;

import com.eldermoraes.javaee8.DateTime;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;

/**
 *
 * @author eldermoraes
 */
@Controller
@Path("datetime")
public class DateTimeController {
    
    @Inject
    Models models;
    
    @Inject
    DateTime dateTime;
    
    @GET
    public String current(){
        this.models.put("current", new Current(dateTime.getCurrent()));
        return "/current.jsp";
    }
    
}
