package kotlin.test;

import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import id.dana.data.profilemenu.MyProfileMenuAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00032#\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\b¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f*\f\u0012\u0004\u0012\u0002H\f\u0012\u0002\b\u00030\b2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u000e\"\u0002H\fH\u0007¢\u0006\u0002\u0010\u000f\u001a=\u0010\u0010\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f*\f\u0012\u0004\u0012\u0002H\f\u0012\u0002\b\u00030\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u0002H\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001aV\u0010\u0017\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\f0\u0004*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00190\u0007H\u0007\u001a5\u0010\u001a\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f*\f\u0012\u0004\u0012\u0002H\f\u0012\u0002\b\u00030\b2\u0006\u0010\u0013\u001a\u0002H\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u001b\u001a\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\f0\u001d\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u001eH\u0002\u001aH\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\f0\u0004*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\f0\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007\u001aG\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\f0\"*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00030\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u000e\"\u0002H\fH\u0007¢\u0006\u0002\u0010\u000f\u001aH\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\f0\"*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\f0\"2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007\u001a8\u0010$\u001a\u00020\u0001\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030%*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010&\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¨\u0006'"}, d2 = {"assert", "", "E", "C", "", "collection", "block", "Lkotlin/Function1;", "Lkotlin/test/CollectionAssertionSession;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)V", "containsAll", "T", "elements", "", "(Lkotlin/test/CollectionAssertionSession;[Ljava/lang/Object;)V", "elementAtShouldBe", "position", "", "expected", "message", "", "(Lkotlin/test/CollectionAssertionSession;ILjava/lang/Object;Ljava/lang/String;)V", "elementAtShouldComply", "predicate", "", "lastElementShouldBe", "(Lkotlin/test/CollectionAssertionSession;Ljava/lang/Object;Ljava/lang/String;)V", "remaining", "", "", "shouldBe", "expectedElements", "shouldBeSet", "", "other", "sizeShouldBe", "", "expectedSize", "kotlin-test"}, k = 2, mv = {1, 1, 15})
public final class CollectionAssertionsKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    /* renamed from: assert  reason: not valid java name */
    public static final <E, C extends Iterable<? extends E>> void m1099assert(@NotNull C c, @NotNull Function1<? super CollectionAssertionSession<E, C>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(c, MyProfileMenuAction.COLLECTION);
        Intrinsics.checkParameterIsNotNull(function1, "block");
        function1.invoke(new CollectionAssertionSession(c));
    }

    public static /* synthetic */ void sizeShouldBe$default(CollectionAssertionSession collectionAssertionSession, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        sizeShouldBe(collectionAssertionSession, i, str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    public static final <C extends Collection<?>> void sizeShouldBe(@NotNull CollectionAssertionSession<?, C> collectionAssertionSession, int i, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(collectionAssertionSession, "$this$sizeShouldBe");
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(((Collection) collectionAssertionSession.getCollection()).size());
        if (str == null) {
            StringBuilder sb = new StringBuilder("collection should have size ");
            sb.append(i);
            sb.append(" but it is ");
            sb.append(((Collection) collectionAssertionSession.getCollection()).size());
            str = sb.toString();
        }
        AssertionsKt.assertEquals(valueOf, valueOf2, str);
    }

    public static /* synthetic */ void elementAtShouldBe$default(CollectionAssertionSession collectionAssertionSession, int i, Object obj, String str, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        elementAtShouldBe(collectionAssertionSession, i, obj, str);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.test.CollectionAssertionSession, java.lang.Object, kotlin.test.CollectionAssertionSession<T, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void elementAtShouldBe(@org.jetbrains.annotations.NotNull kotlin.test.CollectionAssertionSession<T, ?> r1, int r2, T r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            java.lang.String r0 = "$this$elementAtShouldBe"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.Iterable r1 = r1.getCollection()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.elementAt(r1, (int) r2)
            if (r4 != 0) goto L_0x0025
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "element at "
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r2 = " should be "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
        L_0x0025:
            kotlin.test.AssertionsKt.assertEquals(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.test.CollectionAssertionsKt.elementAtShouldBe(kotlin.test.CollectionAssertionSession, int, java.lang.Object, java.lang.String):void");
    }

    public static /* synthetic */ void elementAtShouldComply$default(CollectionAssertionSession collectionAssertionSession, int i, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        elementAtShouldComply(collectionAssertionSession, i, str, function1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    public static final <T, C extends Iterable<? extends T>> void elementAtShouldComply(@NotNull CollectionAssertionSession<T, C> collectionAssertionSession, int i, @Nullable String str, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(collectionAssertionSession, "$this$elementAtShouldComply");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        AssertionsKt.assertTrue(str, (Function0<Boolean>) new CollectionAssertionsKt$elementAtShouldComply$1(collectionAssertionSession, function1, i));
    }

    public static /* synthetic */ void lastElementShouldBe$default(CollectionAssertionSession collectionAssertionSession, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        lastElementShouldBe(collectionAssertionSession, obj, str);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.test.CollectionAssertionSession, java.lang.Object, kotlin.test.CollectionAssertionSession<T, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void lastElementShouldBe(@org.jetbrains.annotations.NotNull kotlin.test.CollectionAssertionSession<T, ?> r1, T r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            java.lang.String r0 = "$this$lastElementShouldBe"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.Iterable r1 = r1.getCollection()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
            if (r3 != 0) goto L_0x0019
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "the last element should be "
            java.lang.String r3 = r0.concat(r3)
        L_0x0019:
            kotlin.test.AssertionsKt.assertEquals(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.test.CollectionAssertionsKt.lastElementShouldBe(kotlin.test.CollectionAssertionSession, java.lang.Object, java.lang.String):void");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    public static final <T> void containsAll(@NotNull CollectionAssertionSession<T, ?> collectionAssertionSession, @NotNull T... tArr) {
        Intrinsics.checkParameterIsNotNull(collectionAssertionSession, "$this$containsAll");
        Intrinsics.checkParameterIsNotNull(tArr, "elements");
        for (T t : tArr) {
            StringBuilder sb = new StringBuilder("Element ");
            sb.append(t);
            sb.append(" is missing in the collection");
            AssertionsKt.assertTrue(sb.toString(), (Function0<Boolean>) new CollectionAssertionsKt$containsAll$1(collectionAssertionSession, t));
        }
    }

    public static /* synthetic */ void shouldBe$default(CollectionAssertionSession collectionAssertionSession, Iterable iterable, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        shouldBe(collectionAssertionSession, iterable, str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    public static final <T, C extends Iterable<? extends T>> void shouldBe(@NotNull CollectionAssertionSession<T, C> collectionAssertionSession, @NotNull Iterable<? extends T> iterable, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(collectionAssertionSession, "$this$shouldBe");
        Intrinsics.checkParameterIsNotNull(iterable, "expectedElements");
        Iterator it = collectionAssertionSession.getCollection().iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        while (it.hasNext() && it2.hasNext()) {
            AssertionsKt.assertEquals(it2.next(), it.next(), str);
        }
        if (it.hasNext()) {
            StringBuilder sb = new StringBuilder("Actual collection is longer than expected. Extra elements are: ");
            sb.append(remaining(it));
            AssertionsKt.fail(sb.toString());
            throw null;
        } else if (it2.hasNext()) {
            StringBuilder sb2 = new StringBuilder("Actual collection is shorter than expected. Missing elements are: ");
            sb2.append(remaining(it2));
            AssertionsKt.fail(sb2.toString());
            throw null;
        }
    }

    public static /* synthetic */ void shouldBeSet$default(CollectionAssertionSession collectionAssertionSession, Set set, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        shouldBeSet(collectionAssertionSession, set, str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    public static final <T, C extends Set<? extends T>> void shouldBeSet(@NotNull CollectionAssertionSession<T, C> collectionAssertionSession, @NotNull Set<? extends T> set, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(collectionAssertionSession, "$this$shouldBeSet");
        Intrinsics.checkParameterIsNotNull(set, H5ResourceHandlerUtil.OTHER);
        for (Object next : set) {
            if (!((Set) collectionAssertionSession.getCollection()).contains(next)) {
                if (str == null) {
                    StringBuilder sb = new StringBuilder("Element ");
                    sb.append(next);
                    sb.append(" in not in the collection ");
                    sb.append((Set) collectionAssertionSession.getCollection());
                    str = sb.toString();
                }
                AssertionsKt.fail(str);
                throw null;
            }
        }
        for (Object next2 : (Set) collectionAssertionSession.getCollection()) {
            if (!set.contains(next2)) {
                if (str == null) {
                    StringBuilder sb2 = new StringBuilder("Element ");
                    sb2.append(next2);
                    sb2.append(" is not expected");
                    str = sb2.toString();
                }
                AssertionsKt.fail(str);
                throw null;
            }
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is an experimental part of the API. It may be changed or removed in newer releases.")
    public static final <T, C extends Set<? extends T>> void shouldBeSet(@NotNull CollectionAssertionSession<T, C> collectionAssertionSession, @NotNull T... tArr) {
        Intrinsics.checkParameterIsNotNull(collectionAssertionSession, "$this$shouldBeSet");
        Intrinsics.checkParameterIsNotNull(tArr, H5ResourceHandlerUtil.OTHER);
        HashSet hashSet = new HashSet();
        for (T add : tArr) {
            hashSet.add(add);
        }
        shouldBeSet$default(collectionAssertionSession, hashSet, (String) null, 2, (Object) null);
    }

    private static final <T> List<T> remaining(@NotNull Iterator<? extends T> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
