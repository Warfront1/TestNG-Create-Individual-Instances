package testngImplementation.testCreationWorkAround5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractValidator2{
    @BeforeMethod
    public void setup(){
        System.out.println("We are executing things before our test here.");
        //setup
    }

    @AfterMethod
    public void teardown(){
        System.out.println("We are executing things after our test here.");
        //teardown
    }
}