package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import o.populateText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u000eH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u000eH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¨\u0006\u001d"}, d2 = {"Lid/dana/data/announcement/repository/source/network/NetworkAnnouncementEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/announcement/repository/source/network/AnnouncementFacade;", "Lid/dana/data/announcement/AnnouncementEntityData;", "context", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "getAnnouncements", "Lio/reactivex/Observable;", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "type", "", "extendInfo", "", "getAnnouncementsIdGNSubscription", "", "getFacadeClass", "Ljava/lang/Class;", "getTrackedAnnouncementsIdGNSubscription", "setAnnouncementIdGNSubscription", "", "id", "setTrackedAnnouncementIdGNSubscription", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class preShow extends setRepeatCount<resolveColors> implements getItemSelector {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/announcement/repository/source/network/AnnouncementFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<resolveColors, populateText> {
        final /* synthetic */ populateText.Cdefault getMax;

        getMin(populateText.Cdefault defaultR) {
            this.getMax = defaultR;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((resolveColors) obj).getAnnouncements(this.getMax);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public preShow(@NotNull Context context, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
    }

    @NotNull
    public final Class<resolveColors> getFacadeClass() {
        return resolveColors.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<populateText> getAnnouncements(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        populateText.Cdefault defaultR = new populateText.Cdefault(str, map);
        defaultR.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<populateText> wrapper = wrapper(new getMin(defaultR));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.getAnnouncements(request) }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getAnnouncementsIdGNSubscription() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setAnnouncementIdGNSubscription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getTrackedAnnouncementsIdGNSubscription() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setTrackedAnnouncementIdGNSubscription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        throw new UnsupportedOperationException();
    }
}
