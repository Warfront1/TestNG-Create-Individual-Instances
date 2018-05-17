package testngImplementation.testCreationWorkAround6;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class acomplexclassListener implements IInvokedMethodListener {
    // What is interesting is I can't use DI/Guice here easily. As posted in the blog it is much easier to use a Factory.
    // The picker (which is a guice construct), provides little to no value here, I may as well chance it to a factory...
    private final acomplexclassPicker acomplexclassGenerator = new acomplexclassPicker();

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if (iInvokedMethod.isTestMethod()) {
            acomplexclass a = acomplexclassGenerator.get();
            acomplexclassManager.setComplexClass(a);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //spin down acomplexclass, ie imagine acomplexclass is a webdriver for example.
    }
}
