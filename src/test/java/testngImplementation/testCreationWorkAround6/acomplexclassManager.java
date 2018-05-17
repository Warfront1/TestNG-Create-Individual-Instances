package testngImplementation.testCreationWorkAround6;

public class acomplexclassManager {
    private static ThreadLocal<acomplexclass> webDriver = new ThreadLocal<>();

    public static acomplexclass getComplexClass() {
        return webDriver.get();
    }

    static void setComplexClass(acomplexclass a) {
        webDriver.set(a);
    }
}
