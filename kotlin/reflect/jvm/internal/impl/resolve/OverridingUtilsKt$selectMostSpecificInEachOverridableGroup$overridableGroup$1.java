package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

final class OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 extends Lambda implements Function1<H, Unit> {
    final /* synthetic */ SmartSet<H> $conflictedHandles;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(SmartSet<H> smartSet) {
        super(1);
        this.$conflictedHandles = smartSet;
    }

    public final void invoke(H h) {
        SmartSet<H> smartSet = this.$conflictedHandles;
        Intrinsics.checkNotNullExpressionValue(h, "it");
        smartSet.add(h);
    }
}
