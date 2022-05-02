package kotlin.test;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0000\"\u001c\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"contributors", "", "Lkotlin/test/AsserterContributor;", "kotlin.jvm.PlatformType", "lookupAsserter", "Lkotlin/test/Asserter;", "kotlin-test"}, k = 2, mv = {1, 1, 15})
public final class AsserterLookupKt {
    private static final List<AsserterContributor> contributors;

    static {
        ServiceLoader<S> load = ServiceLoader.load(AsserterContributor.class);
        Intrinsics.checkExpressionValueIsNotNull(load, "ServiceLoader.load(Asser…rContributor::class.java)");
        contributors = CollectionsKt.toList(load);
    }

    @NotNull
    public static final Asserter lookupAsserter() {
        for (AsserterContributor contribute : contributors) {
            Asserter contribute2 = contribute.contribute();
            if (contribute2 != null) {
                return contribute2;
            }
        }
        return DefaultAsserter.INSTANCE;
    }
}
