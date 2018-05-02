package test;

public class sampletest2 extends AbstractValidator2{
    public sampletest2(String url, acomplexclass a) {
        super(url, a);
    }
    @Override
    public boolean validate() {
        System.out.println("I'm running on sampleTest2 with url"+ url);
        return true;
    }
}