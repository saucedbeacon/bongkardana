package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    Class<? extends Throwable> expected() default length.class;

    long timeout() default 0;

    public static class length extends Throwable {
        private static final long serialVersionUID = 1;

        private length() {
        }
    }
}
