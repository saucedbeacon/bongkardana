package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.html;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\"\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0018*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00170\u00170\u0010H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00170\u0010H\u0016J\u001e\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001b0\u001b0\u00102\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lid/dana/data/announcement/repository/source/local/LocalAnnouncementEntityData;", "Lid/dana/data/announcement/AnnouncementEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "announcementPreference", "Lid/dana/data/announcement/repository/source/local/AnnouncementPreference;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;Lid/dana/data/announcement/repository/source/local/AnnouncementPreference;)V", "getAnnouncementPreference", "()Lid/dana/data/announcement/repository/source/local/AnnouncementPreference;", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getAnnouncements", "Lio/reactivex/Observable;", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "type", "", "extendInfo", "", "getAnnouncementsIdGNSubscription", "", "kotlin.jvm.PlatformType", "getTrackedAnnouncementsIdGNSubscription", "setAnnouncementIdGNSubscription", "", "id", "setTrackedAnnouncementIdGNSubscription", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class adjustAlpha implements getItemSelector {
    @NotNull
    private final html.Cdefault announcementPreference;
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public adjustAlpha(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback, @NotNull html.Cdefault defaultR) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(defaultR, "announcementPreference");
        this.context = context2;
        this.serializer = pluginInstallCallback;
        this.announcementPreference = defaultR;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final PluginInstallCallback getSerializer() {
        return this.serializer;
    }

    @NotNull
    public final html.Cdefault getAnnouncementPreference() {
        return this.announcementPreference;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<populateText> getAnnouncements(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getAnnouncementsIdGNSubscription() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> just = TitleBarRightButtonView.AnonymousClass1.just(this.announcementPreference.getAnnouncementGnIds());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(announce…e.getAnnouncementGnIds())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setAnnouncementIdGNSubscription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.announcementPreference.saveAnnouncementGnId(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(announce…saveAnnouncementGnId(id))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getTrackedAnnouncementsIdGNSubscription() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> just = TitleBarRightButtonView.AnonymousClass1.just(this.announcementPreference.getTrackedAnnouncementGnIds());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(announce…ackedAnnouncementGnIds())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setTrackedAnnouncementIdGNSubscription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.announcementPreference.saveTrackedAnnouncementGnId(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(announce…ckedAnnouncementGnId(id))");
        return just;
    }
}
