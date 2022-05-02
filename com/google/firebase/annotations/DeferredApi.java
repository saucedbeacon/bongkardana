package com.google.firebase.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface DeferredApi {
}
