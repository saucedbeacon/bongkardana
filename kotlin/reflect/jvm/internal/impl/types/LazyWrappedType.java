package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class LazyWrappedType extends WrappedType {
    /* access modifiers changed from: private */
    @NotNull
    public final Function0<KotlinType> computation;
    @NotNull
    private final NotNullLazyValue<KotlinType> lazyValue;
    @NotNull
    private final StorageManager storageManager;

    public LazyWrappedType(@NotNull StorageManager storageManager2, @NotNull Function0<? extends KotlinType> function0) {
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(function0, "computation");
        this.storageManager = storageManager2;
        this.computation = function0;
        this.lazyValue = storageManager2.createLazyValue(function0);
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    public final boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @NotNull
    public final LazyWrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.storageManager, new LazyWrappedType$refine$1(kotlinTypeRefiner, this));
    }
}
