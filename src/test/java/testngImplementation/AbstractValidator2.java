package testngImplementation;

import org.testng.annotations.Test;

public abstract class AbstractValidator2{
    protected String url;
    protected acomplexclass a;

    public AbstractValidator2(String url, acomplexclass a) {
        this.url = url;
        this.a = a;
        //more common setups reports, selenium, utilities, etc...
    }
    @Test
    public void run() {
        System.out.println("We made it to run on the Abstract Validator 2");
        setup();
        validate();
        tearDown();
    }
    public void setup() {}
    public void tearDown() {}
    public abstract boolean validate();
}