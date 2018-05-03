package testngImplementation.testCreationWorkAround4;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.internal.ClassHelper;

import java.util.ArrayList;
import java.util.List;

public class AbstractValidator2 implements IHookable {

    public AbstractValidator2() {
        // more common setups reports, selenium, utilities, etc...
    }

    public void setup() {}

    public void tearDown() {}

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        System.out.println("We made it to run on the Abstract Validator 2");
        setup();
        Object[] parameters = callBack.getParameters();
        Object[] injected = getParametersToInject(testResult);
        for(Object i: injected){
            System.out.println(i.getClass());
        }
        if (parameters.length == injected.length) {
            System.arraycopy(injected, 0, parameters, 0, parameters.length);
        }
        callBack.runTestMethod(testResult);
        tearDown();
    }

    private Object[] getParametersToInject(ITestResult testResult) {
        List<Object> parameters = new ArrayList<>();
        InjectParameters toInject =
                testResult
                        .getMethod()
                        .getConstructorOrMethod()
                        .getMethod()
                        .getAnnotation(InjectParameters.class);
        if (toInject != null) {
            parameters.add(toInject.url());
            parameters.add(ClassHelper.newInstance(ClassHelper.forName(toInject.getComplexClass())));
        }
        return parameters.toArray(new Object[0]);
    }
}