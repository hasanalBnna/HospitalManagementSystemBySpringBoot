package com.hms.controller;

import com.hms.model.LabTest;

import java.util.ArrayList;
import java.util.List;

public class LabTestController {

    private int[] arrayOfInteger = new int[5];
    private int aoiInteger;
    private int aoiIndex;

    public void addArrayOfInteger(int testInteger){
            arrayOfInteger[aoiIndex] = testInteger;
        aoiInteger++;
    }

    private String[] testString;
    public void addTestString(String testString){
//        testString.add(testString);
    }
    public void showTestString(){
        System.out.println(testString.toString());
    }

    private LabTest[] diagonostic;
    public void adddiagonostic(LabTest diagonostic){
//        diagonostic.add(diagonostic);
    }

    public void showDiagonostic(){
        System.out.println(diagonostic.toString());
    }

    private List<LabTest> labTests= new ArrayList<>();
    public void TestController(LabTest lt){

        labTests.add(lt);
    }

    public void showLabTests(){
        System.out.println(labTests.toString());
    }
}
