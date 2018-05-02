package testngImplementation;

// This approach allows me to integrate with testng closer, however you make a bunch of dummy classes.
// Also it is easy to run from within intellij one off, just click the run button!
// View the following for why this is a bad idea:
// https://softwareengineering.stackexchange.com/questions/257562/is-creating-subclasses-for-specific-instances-a-bad-practice
public class testCreationWorkAround2 {
    public static class sampletest2Google extends sampletest2{
        public sampletest2Google() { super("https://www.google.com/", new acomplexclass()); }
    }

    public static class sampletest2Bing extends sampletest2{
        public sampletest2Bing() { super("https://www.bing.com/", new acomplexclass()); }
    }
}
