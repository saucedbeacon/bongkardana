package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/richview/moreforyou/MoreForYouModelMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/promotion/CdpContent;", "Lid/dana/richview/moreforyou/model/MoreForYouModel;", "()V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isKeepPreview extends setSpeed<getDefaultProxy, CameraParams> {
    public final /* synthetic */ Object map(Object obj) {
        return setMin((getDefaultProxy) obj);
    }

    @NotNull
    private static CameraParams setMin(@NotNull getDefaultProxy getdefaultproxy) {
        Intrinsics.checkNotNullParameter(getdefaultproxy, "oldItem");
        try {
            PluginInstallCallback pluginInstallCallback = new PluginInstallCallback();
            String contentValue = getdefaultproxy.getContentValue();
            Intrinsics.checkNotNullExpressionValue(contentValue, "oldItem.contentValue");
            Object deserialize = pluginInstallCallback.deserialize(StringsKt.replace$default(contentValue, "[\n\r]", "", false, 4, (Object) null), CameraParams.class);
            CameraParams cameraParams = (CameraParams) deserialize;
            cameraParams.getMax = getdefaultproxy.getRedirectUrl();
            cameraParams.getMin = getdefaultproxy.getContentId();
            cameraParams.toIntRange = getdefaultproxy.getSpaceCode();
            cameraParams.isInside = Integer.valueOf(getdefaultproxy.getPriority());
            Intrinsics.checkNotNullExpressionValue(deserialize, "Serializer()\n           …riority\n                }");
            return (CameraParams) deserialize;
        } catch (Exception unused) {
            return new CameraParams((byte) 0);
        }
    }
}
