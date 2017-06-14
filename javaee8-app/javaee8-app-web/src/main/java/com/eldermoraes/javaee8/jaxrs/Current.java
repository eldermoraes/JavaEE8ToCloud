package com.eldermoraes.javaee8.jaxrs;

/**
 *
 * @author eldermoraes
 */
public class Current {

    private String now;

    public Current(String now) {
        this.now = now;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }
}
