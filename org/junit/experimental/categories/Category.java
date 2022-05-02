package org.junit.experimental.categories;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.NumKeyboard;
import org.junit.validator.ValidateWith;

@Inherited
@ValidateWith(NumKeyboard.KeyType.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Category {
    Class<?>[] value();
}
