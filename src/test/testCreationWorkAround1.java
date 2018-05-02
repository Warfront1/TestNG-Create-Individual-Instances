package test;

import org.testng.annotations.Test;

// This Approach doesn't let me leverage test ng that well as now the @Test annoation is on dummy methods, that provider
// no value.... Other than creating an instance of tests and leveraging the old framework.
// It is very easy to run test cases just click the run button
public class testCreationWorkAround1 {
    @Test
    public void sampletest2google(){
        new sampletest2("https://www.google.com/", new acomplexclass()).run();
    }
    @Test
    public void sampletest3bing(){
        new sampletest2("https://www.bing.com/", new acomplexclass()).run();
    }
}