package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/data/config/mapper/SplashAnimationConfigMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/config/source/amcs/result/SplashAnimationConfigResult;", "Lid/dana/domain/featureconfig/model/SplashAnimationConfig;", "()V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShapeStroke$LineJoinType extends setSpeed<AppNode.AnonymousClass8.AnonymousClass1, onLoadResource> {
    /* access modifiers changed from: protected */
    @NotNull
    public final onLoadResource map(@NotNull AppNode.AnonymousClass8.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(r3, "oldItem");
        return new onLoadResource(r3.getEnable(), r3.getAnimationFile());
    }
}
