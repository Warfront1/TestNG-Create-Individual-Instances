package junit5Implementation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public abstract class AbstractValidator2 implements Executable {
    protected String url;
    protected acomplexclass a;

    public AbstractValidator2(String url, acomplexclass a) {
        this.url = url;
        this.a = a;
        //more common setups reports, selenium, utilities, etc...
    }

//    @BeforeClass
//    public void beforeI(){
//        System.out.println("before each has ran");
//    }

    @Test
    public void run() {
        System.out.println("We made it to run on the Abstract Validator 2");
        setup();
        validate();
        tearDown();
    }
    public void execute(){
        run();
    }
    public void setup() {}
    public void tearDown() {}
    public abstract boolean validate();
}