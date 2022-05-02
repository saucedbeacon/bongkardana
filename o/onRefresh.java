package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/tutorial/mapper/TutorialModelMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/promotion/CdpContent;", "Lid/dana/tutorial/model/TutorialModel;", "()V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onRefresh extends setSpeed<getDefaultProxy, onReachPullRefreshDistance> {
    public final /* synthetic */ Object map(Object obj) {
        return length((getDefaultProxy) obj);
    }

    @Nullable
    private static onReachPullRefreshDistance length(@NotNull getDefaultProxy getdefaultproxy) {
        Intrinsics.checkNotNullParameter(getdefaultproxy, "oldItem");
        try {
            PluginInstallCallback pluginInstallCallback = new PluginInstallCallback();
            String contentValue = getdefaultproxy.getContentValue();
            Intrinsics.checkNotNullExpressionValue(contentValue, "oldItem.contentValue");
            Object deserialize = pluginInstallCallback.deserialize(StringsKt.replace$default(contentValue, "[\n\r]", "", false, 4, (Object) null), onReachPullRefreshDistance.class);
            ((onReachPullRefreshDistance) deserialize).setMax = getdefaultproxy.getContentId();
            return (onReachPullRefreshDistance) deserialize;
        } catch (Exception unused) {
            return null;
        }
    }
}
