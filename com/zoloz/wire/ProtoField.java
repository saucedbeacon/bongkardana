package com.zoloz.wire;

import com.zoloz.wire.Message;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ProtoField {
    boolean deprecated() default false;

    Message.Label label() default Message.Label.OPTIONAL;

    boolean redacted() default false;

    int tag();

    Message.Datatype type() default Message.Datatype.MESSAGE;
}
