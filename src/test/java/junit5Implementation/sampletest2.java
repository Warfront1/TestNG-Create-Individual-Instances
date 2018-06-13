package junit5Implementation;

public class sampletest2 extends AbstractValidator2 {
    public sampletest2(String url, acomplexclass a) {
        super(url, a);
    }
    @Override
    public boolean validate() {
        long t= System.currentTimeMillis();
        long end = t+15000;
        while(System.currentTimeMillis() < end) {
            System.out.println("I'm running on sampleTest2 with url"+ url);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}