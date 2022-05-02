package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TransientReceiver extends AbstractReceiverValue {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TransientReceiver(@NotNull KotlinType kotlinType) {
        this(kotlinType, (ReceiverValue) null);
        if (kotlinType == null) {
            $$$reportNull$$$0(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TransientReceiver(@NotNull KotlinType kotlinType, @Nullable ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Transient} : ");
        sb.append(getType());
        return sb.toString();
    }
}
