package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class StarProjectionImpl$_type$2 extends Lambda implements Function0<KotlinType> {
    final /* synthetic */ StarProjectionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StarProjectionImpl$_type$2(StarProjectionImpl starProjectionImpl) {
        super(0);
        this.this$0 = starProjectionImpl;
    }

    @NotNull
    public final KotlinType invoke() {
        return StarProjectionImplKt.starProjectionType(this.this$0.typeParameter);
    }
}
