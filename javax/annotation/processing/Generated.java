package javax.annotation.processing;

public @interface Generated {
    String comments() default "";

    String date() default "";

    String[] value();
}
