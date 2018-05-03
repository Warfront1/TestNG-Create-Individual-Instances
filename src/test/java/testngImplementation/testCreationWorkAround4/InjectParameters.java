package testngImplementation.testCreationWorkAround4;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({METHOD, TYPE})
public @interface InjectParameters {
    String url() default "";

    String getComplexClass() default "testngImplementation.testCreationWorkAround4.acomplexclass";
}