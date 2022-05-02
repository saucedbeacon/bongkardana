package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty2Impl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a.\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004 \u0005*\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
final class KMutableProperty2Impl$_setter$1 extends Lambda implements Function0<KMutableProperty2Impl.Setter<D, E, V>> {
    final /* synthetic */ KMutableProperty2Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KMutableProperty2Impl$_setter$1(KMutableProperty2Impl kMutableProperty2Impl) {
        super(0);
        this.this$0 = kMutableProperty2Impl;
    }

    public final KMutableProperty2Impl.Setter<D, E, V> invoke() {
        return new KMutableProperty2Impl.Setter<>(this.this$0);
    }
}
