package org.junit.experimental.theories.suppliers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.onTouchUp;
import org.junit.experimental.theories.ParametersSuppliedBy;

@ParametersSuppliedBy(onTouchUp.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestedOn {
    int[] ints();
}
