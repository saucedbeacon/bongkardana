package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0001\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\b\u0012\u0004\u0012\u00020\t0\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"ALPHABET", "", "RECENT", "sortingRecentBanks", "", "Lid/dana/domain/recentbank/model/RecentBank;", "recentBanks", "sortingBy", "filterAndSortRecentTransaction", "Lid/dana/data/recentrecipient/model/RecentRecipientEntity;", "", "maxRecentRecipient", "", "([Lid/dana/data/recentrecipient/model/RecentRecipientEntity;I)Ljava/util/List;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class RemoteCallResult {
    @NotNull
    public static final String ALPHABET = "ALPHABET";
    @NotNull
    public static final String RECENT = "RECENT";

    @NotNull
    public static final List<isRemoteExtension> filterAndSortRecentTransaction(@NotNull isRemoteExtension[] isremoteextensionArr, int i) {
        Intrinsics.checkNotNullParameter(isremoteextensionArr, "$this$filterAndSortRecentTransaction");
        Collection arrayList = new ArrayList();
        for (Object next : ArraysKt.sortedWith((T[]) isremoteextensionArr, new setMin(new setMax(), ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder())))) {
            if (((isRemoteExtension) next).isVisibleInQuickSend()) {
                arrayList.add(next);
            }
        }
        return CollectionsKt.take((List) arrayList, i);
    }

    @NotNull
    public static final List<ErrorPageUtils> sortingRecentBanks(@NotNull List<? extends ErrorPageUtils> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "recentBanks");
        Intrinsics.checkNotNullParameter(str, "sortingBy");
        int hashCode = str.hashCode();
        if (hashCode != -1881589157) {
            if (hashCode == -1591814541 && str.equals("ALPHABET")) {
                return CollectionsKt.sortedWith(list, new toIntRange(new getMin()));
            }
        } else if (str.equals("RECENT")) {
            return CollectionsKt.sortedWith(list, new getMax());
        }
        return CollectionsKt.sortedWith(list, new length());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String alias = ((ErrorPageUtils) t).getAlias();
            Intrinsics.checkNotNullExpressionValue(alias, "it.alias");
            if (alias != null) {
                String lowerCase = alias.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                Comparable comparable = lowerCase;
                String alias2 = ((ErrorPageUtils) t2).getAlias();
                Intrinsics.checkNotNullExpressionValue(alias2, "it.alias");
                if (alias2 != null) {
                    String lowerCase2 = alias2.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    return ComparisonsKt.compareValues(comparable, lowerCase2);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class getMax<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((ErrorPageUtils) t2).getLastUpdated()), Long.valueOf(((ErrorPageUtils) t).getLastUpdated()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class length<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ErrorPageUtils) t2).getTransactionCount()), Integer.valueOf(((ErrorPageUtils) t).getTransactionCount()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((isRemoteExtension) t2).getTransactionCount()), Integer.valueOf(((isRemoteExtension) t).getTransactionCount()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, k = 3, mv = {1, 4, 2})
    public static final class toIntRange<T> implements Comparator<T> {
        final /* synthetic */ Comparator $this_thenBy;

        public toIntRange(Comparator comparator) {
            this.$this_thenBy = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.$this_thenBy.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            String recipientName = ((ErrorPageUtils) t).getRecipientName();
            Intrinsics.checkNotNullExpressionValue(recipientName, "it.recipientName");
            if (recipientName != null) {
                String lowerCase = recipientName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                Comparable comparable = lowerCase;
                String recipientName2 = ((ErrorPageUtils) t2).getRecipientName();
                Intrinsics.checkNotNullExpressionValue(recipientName2, "it.recipientName");
                if (recipientName2 != null) {
                    String lowerCase2 = recipientName2.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    return ComparisonsKt.compareValues(comparable, lowerCase2);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<T> implements Comparator<T> {
        final /* synthetic */ Comparator $comparator;
        final /* synthetic */ Comparator $this_thenBy;

        public setMin(Comparator comparator, Comparator comparator2) {
            this.$this_thenBy = comparator;
            this.$comparator = comparator2;
        }

        public final int compare(T t, T t2) {
            int compare = this.$this_thenBy.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.$comparator.compare(((isRemoteExtension) t).getName(), ((isRemoteExtension) t2).getName());
        }
    }
}
