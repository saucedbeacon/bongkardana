package org.junit.validator;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.setSendAccessiBilityEventListener;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateWith {
    Class<? extends setSendAccessiBilityEventListener> value();
}
