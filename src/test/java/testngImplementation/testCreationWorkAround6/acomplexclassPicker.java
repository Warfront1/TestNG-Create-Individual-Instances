package testngImplementation.testCreationWorkAround6;


import com.google.inject.Provider;

public class acomplexclassPicker implements Provider<acomplexclass> {

    @Override
    public acomplexclass get() {
        return new acomplexclass();
    }
}
