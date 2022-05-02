package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class ClassicTypeSystemContextKt {
    /* access modifiers changed from: private */
    public static final UnwrappedType makeDefinitelyNotNullOrNotNullInternal(UnwrappedType unwrappedType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(unwrappedType, false, 1, (Object) null);
    }
}
