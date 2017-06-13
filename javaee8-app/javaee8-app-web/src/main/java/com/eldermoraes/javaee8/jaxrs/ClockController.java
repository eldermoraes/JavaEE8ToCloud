/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.javaee8.jaxrs;

import com.eldermoraes.javaee8.Watch;
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
@Path("clock")
public class ClockController {
    
    @Inject
    Models models;
    
    @Inject
    Watch watch;
    
    @GET
    public String current(){
        this.models.put("clock", new Time(watch.getCurrent()));
        return "/time.jsp";
    }
    
}
