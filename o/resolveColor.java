package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DialogRecyclerView;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class resolveColor implements getAdapterPosition<Cdefault> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public resolveColor(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0012H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\fH\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/announcement/repository/source/mock/MockAnnouncementEntityData;", "Lid/dana/data/announcement/AnnouncementEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getAnnouncements", "Lio/reactivex/Observable;", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "kotlin.jvm.PlatformType", "type", "", "extendInfo", "", "getAnnouncementsIdGNSubscription", "", "getTrackedAnnouncementsIdGNSubscription", "setAnnouncementIdGNSubscription", "", "id", "setTrackedAnnouncementIdGNSubscription", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.resolveColor$default  reason: invalid class name */
    public final class Cdefault implements getItemSelector {
        @NotNull
        private final Context context;
        @NotNull
        private final PluginInstallCallback serializer;

        @Inject
        public Cdefault(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
            this.context = context2;
            this.serializer = pluginInstallCallback;
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
        public final TitleBarRightButtonView.AnonymousClass1<populateText> getAnnouncements(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "type");
            Intrinsics.checkNotNullParameter(map, "extendInfo");
            TitleBarRightButtonView.AnonymousClass1<populateText> just = TitleBarRightButtonView.AnonymousClass1.just(this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.setMin), populateText.class));
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(serializ…ementResult::class.java))");
            return just;
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

    public final Cdefault get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static resolveColor create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new resolveColor(bVar, bVar2);
    }

    public static Cdefault newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new Cdefault(context, pluginInstallCallback);
    }
}
