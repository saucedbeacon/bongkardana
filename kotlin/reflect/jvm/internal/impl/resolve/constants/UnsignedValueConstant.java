package kotlin.reflect.jvm.internal.impl.resolve.constants;

public abstract class UnsignedValueConstant<T> extends ConstantValue<T> {
    protected UnsignedValueConstant(T t) {
        super(t);
    }
}
