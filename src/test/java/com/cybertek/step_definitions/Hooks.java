package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;


public class Hooks {



    @After
    public void tearDownMethod(){

        Driver.closeDriver();
    }


}
