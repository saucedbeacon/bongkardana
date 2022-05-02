package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/reflect/KClass;", "invoke", "(Lkotlin/reflect/KClass;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 1})
final class KClasses$isSubclassOf$2 extends Lambda implements Function1<KClass<?>, Boolean> {
    final /* synthetic */ KClass $base;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClasses$isSubclassOf$2(KClass kClass) {
        super(1);
        this.$base = kClass;
    }

    public final Boolean invoke(KClass<?> kClass) {
        return Boolean.valueOf(Intrinsics.areEqual((Object) kClass, (Object) this.$base));
    }
}
