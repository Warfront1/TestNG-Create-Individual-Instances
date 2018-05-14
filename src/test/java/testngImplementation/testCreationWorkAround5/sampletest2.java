package testngImplementation.testCreationWorkAround5;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;


@Guice
public class sampletest2 extends AbstractValidator2{
    private acomplexclassPicker apicker;

    @Inject
    public sampletest2(acomplexclassPicker acomplexclassPicker1){
        this.apicker = acomplexclassPicker1;
    }

    public void validate(String url, acomplexclass a) {
        System.out.println("I'm running on sampleTest2 with url"+ url + a.hashCode());
    }

    @Test
    public void testGoogle(){
        validate("https://www.google.com/",  apicker.get());
    }

    @Test
    public void testBing(){
        validate("https://www.bing.com/",  apicker.get());
    }
}