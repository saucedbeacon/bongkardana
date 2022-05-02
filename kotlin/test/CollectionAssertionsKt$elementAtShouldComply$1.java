package kotlin.test;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "C", "", "invoke"}, k = 3, mv = {1, 1, 15})
final class CollectionAssertionsKt$elementAtShouldComply$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ int $position;
    final /* synthetic */ Function1 $predicate;
    final /* synthetic */ CollectionAssertionSession $this_elementAtShouldComply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CollectionAssertionsKt$elementAtShouldComply$1(CollectionAssertionSession collectionAssertionSession, Function1 function1, int i) {
        super(0);
        this.$this_elementAtShouldComply = collectionAssertionSession;
        this.$predicate = function1;
        this.$position = i;
    }

    public final boolean invoke() {
        return ((Boolean) this.$predicate.invoke(CollectionsKt.elementAt(this.$this_elementAtShouldComply.getCollection(), this.$position))).booleanValue();
    }
}
