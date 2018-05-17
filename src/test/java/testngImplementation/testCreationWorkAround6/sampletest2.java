package testngImplementation.testCreationWorkAround6;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(acomplexclassListener.class)
public class sampletest2 {

    private void validate(String url) {
        System.out.println("I'm running on sampleTest2 with url"+ url + acomplexclassManager.getComplexClass().hashCode());
    }

    @Test
    public void testGoogle(){
        validate("https://www.google.com/");
    }

    @Test
    public void testBing(){
        validate("https://www.bing.com/");
    }
}