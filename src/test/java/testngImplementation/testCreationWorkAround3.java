package testngImplementation;

import org.testng.annotations.Factory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

// In order to have the ability to run individual testngImplementation cases, I am forced to create an additional layer of mapping.
// In this case you can see I have mapped testngImplementation cases to strings, that must be provided via parameters.
// This also introduces (in my opinion) unnecessary  overhead of having to configure parameters in order to run
// one off testngImplementation cases. Also I couldn't tag individual testngImplementation cases into testngImplementation groups
public class testCreationWorkAround3 {

    @Factory
    @Parameters("testCase")
    public Object[] factory(@Optional String testCase){
        sampletest2 google = new sampletest2("https://www.google.com/", new acomplexclass());
        sampletest2 bing = new sampletest2("https://www.bing.com/", new acomplexclass());
        if(testCase!= null){
            if( testCase.equals("google")){
                return new Object[]{google};
            }
            if(testCase.equals("bing")){
                return new Object[]{bing};
            }
        }
        return new Object[]{google, bing};
    }
}
