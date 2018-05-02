package junit5Implementation.suites;


import junit5Implementation.AbstractValidator2;
import junit5Implementation.sampletest2;
import junit5Implementation.acomplexclass;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;

public class sampletest2SuiteTests {

    public ArrayList<DynamicTest> createDynamicTests(AbstractValidator2... validators){
        ArrayList<DynamicTest> tempDynamicTest = new ArrayList<>();
        for(AbstractValidator2 validator: validators){
            tempDynamicTest.add(DynamicTest.dynamicTest(validator.getClass().getName(), validator));
        }
        return tempDynamicTest;
    }

    @TestFactory
    @Tag("google")
    @Tag("sampletest")
    ArrayList<DynamicTest> sampletest2google() {
        sampletest2 a = new sampletest2("https://www.google.com/", new acomplexclass());
        return createDynamicTests(a);
    }

    @TestFactory
    @Tag("bing")
    @Tag("sampletest")
    ArrayList<DynamicTest> sampletest2bing() {
        sampletest2 a = new sampletest2("https://www.bing.com/", new acomplexclass());
        return createDynamicTests(a);
    }
}
