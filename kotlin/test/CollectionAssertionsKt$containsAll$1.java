package kotlin.test;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 1, 15})
final class CollectionAssertionsKt$containsAll$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Object $e;
    final /* synthetic */ CollectionAssertionSession $this_containsAll;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CollectionAssertionsKt$containsAll$1(CollectionAssertionSession collectionAssertionSession, Object obj) {
        super(0);
        this.$this_containsAll = collectionAssertionSession;
        this.$e = obj;
    }

    public final boolean invoke() {
        return CollectionsKt.contains(this.$this_containsAll.getCollection(), this.$e);
    }
}
