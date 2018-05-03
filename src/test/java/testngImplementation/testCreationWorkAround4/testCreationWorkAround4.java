package testngImplementation.testCreationWorkAround4;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCreationWorkAround4 extends AbstractValidator2 {
    @Test
    @InjectParameters(url = "https://www.google.com/")
    // The @Parameters is being used just as a place holder here. To prevent TestNG from triggering
    // Validations saying that parameter required but not provided. I think this would be fixed
    // as part of fix for https://github.com/cbeust/testng/issues/564 which would be available in
    // TestNG 7.0.0

    @Parameters({"url", "a"})
    public void sampletest2google(@Optional String url, @Optional acomplexclass a) {
        System.err.println("URL is " + url);
        System.err.println("Complex object  is " + a.toString());
    }


    @Test
    @InjectParameters(url = "https://www.bing.com/")
    @Parameters({"url", "a"})
    public void sampletest3bing(@Optional String url, @Optional acomplexclass a) {
        System.err.println("URL is " + url);
        System.err.println("Complex object  is " + a.toString());
    }
}


