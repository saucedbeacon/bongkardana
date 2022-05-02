package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBannerConfig", "Lid/dana/domain/sendmoney/x2l/model/BannerConfig;", "Lid/dana/data/sendmoney/x2l/model/BannerConfigEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getSingletonIPCContextManager {
    @NotNull
    public static final fromUuid toBannerConfig(@NotNull IPCCallManager iPCCallManager) {
        Intrinsics.checkNotNullParameter(iPCCallManager, "$this$toBannerConfig");
        String title = iPCCallManager.getTitle();
        String str = "";
        if (title == null) {
            title = str;
        }
        String subtitle = iPCCallManager.getSubtitle();
        if (subtitle == null) {
            subtitle = str;
        }
        String image = iPCCallManager.getImage();
        if (image != null) {
            str = image;
        }
        return new fromUuid(title, subtitle, str);
    }
}
