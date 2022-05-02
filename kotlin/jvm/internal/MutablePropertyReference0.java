package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    public MutablePropertyReference0() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public KCallable computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    public Object invoke() {
        return get();
    }

    public KProperty0.Getter getGetter() {
        return ((KMutableProperty0) getReflected()).getGetter();
    }

    public KMutableProperty0.Setter getSetter() {
        return ((KMutableProperty0) getReflected()).getSetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }
}
