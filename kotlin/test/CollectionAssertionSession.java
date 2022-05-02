package kotlin.test;

import id.dana.data.profilemenu.MyProfileMenuAction;
import java.lang.Iterable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/test/CollectionAssertionSession;", "E", "C", "", "", "collection", "(Ljava/lang/Iterable;)V", "getCollection", "()Ljava/lang/Iterable;", "Ljava/lang/Iterable;", "kotlin-test"}, k = 1, mv = {1, 1, 15})
@Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
public final class CollectionAssertionSession<E, C extends Iterable<? extends E>> {
    @NotNull
    private final C collection;

    public CollectionAssertionSession(@NotNull C c) {
        Intrinsics.checkParameterIsNotNull(c, MyProfileMenuAction.COLLECTION);
        this.collection = c;
    }

    @NotNull
    public final C getCollection() {
        return this.collection;
    }
}
