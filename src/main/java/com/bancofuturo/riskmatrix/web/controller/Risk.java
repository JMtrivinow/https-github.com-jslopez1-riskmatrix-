package com.bancofuturo.riskmatrix.web.controller;


import javax.validation.constraints.NotNull;

public class Risk {

    @NotNull
    private String driver;
    private Integer impact;
    private Integer urgency;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Integer getImpact() {
        return impact;
    }

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    public Integer getUrgency() {
        return urgency;
    }

    public void setUrgency(Integer urgency) {
        this.urgency = urgency;
    }
}
