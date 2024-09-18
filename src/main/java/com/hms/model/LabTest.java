
package com.hms.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author Banna
 */

public abstract class LabTest {

    protected String title;
    protected double cost;
    protected boolean isAvailable;

    public LabTest(){}
    public LabTest(String title,
                   double cost,
                   boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;

    }
    public String returnLabTestInfo(){
        String output = "Test name :"+this.title+"\n"
                +"Cost :"+this.cost+"\n"
                +"Avaiablity :"+this.isAvailable;
        return output;
    }

    public abstract boolean report();

    public abstract double CalCost();
}
