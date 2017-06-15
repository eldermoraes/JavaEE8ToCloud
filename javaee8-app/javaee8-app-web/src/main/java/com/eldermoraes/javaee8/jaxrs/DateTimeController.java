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

//MVC Controller
@Controller
@Path("datetime")
public class DateTimeController {
    
    //CDI Injection
    @Inject
    Models models;
    
    @Inject
    DateTime dateTime;
    
    //Request managed by MVC
    @GET
    public String current(){
        //Pass data to the view
        this.models.put("current", new Current(dateTime.getCurrent()));
        return "/current.jsp";
    }
    
}
