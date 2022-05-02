package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import o.b;
import o.resolveColor;
import org.jetbrains.annotations.NotNull;

public final class html implements getAdapterPosition<getMessageTextView> {
    private final b.C0007b<adjustAlpha> localAnnouncementEntityDataProvider;
    private final b.C0007b<resolveColor.Cdefault> mockAnnouncementEntityDataProvider;
    private final b.C0007b<preShow> networkAnnouncementEntityDataProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/data/announcement/repository/source/local/AnnouncementPreference;", "", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "announcementPreference", "", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getAnnouncementGnIds", "", "getTrackedAnnouncementGnIds", "saveAnnouncementGnId", "", "announcementId", "saveTrackedAnnouncementGnId", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.html$default  reason: invalid class name */
    public final class Cdefault {
        private static final String ANNOUNCEMENT_GN_NOTIFICATION = "announcement_gn_notification";
        @NotNull
        public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
        private static final String TRACKED_ANNOUNCEMENT_GN_NOTIFICATION = "tracked_announcement_gn_notification";
        private final String announcementPreference = "AnnouncementPreferenceproduction";
        private final onSingleFailed preferenceFacade;

        @Inject
        public Cdefault(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
            onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(this.announcementPreference).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
            Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(it).createData(Source.LOCAL)");
            this.preferenceFacade = createData;
        }

        @NotNull
        public final List<String> getAnnouncementGnIds() {
            List<String> arrayList = new ArrayList<>();
            String string = this.preferenceFacade.getString(ANNOUNCEMENT_GN_NOTIFICATION);
            if (string == null) {
                return arrayList;
            }
            Type type = new length().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<String>>() {}.type");
            Object fromJson = new Gson().fromJson(string, type);
            if (fromJson != null) {
                return (List) fromJson;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"id/dana/data/announcement/repository/source/local/AnnouncementPreference$getAnnouncementGnIds$listType$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.html$default$length */
        public static final class length extends TypeToken<List<? extends String>> {
            length() {
            }
        }

        public final boolean saveAnnouncementGnId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "announcementId");
            List mutableList = CollectionsKt.toMutableList(getAnnouncementGnIds());
            mutableList.add(str);
            this.preferenceFacade.saveData(ANNOUNCEMENT_GN_NOTIFICATION, new Gson().toJson((Object) CollectionsKt.toList(mutableList)));
            return true;
        }

        @NotNull
        public final List<String> getTrackedAnnouncementGnIds() {
            List<String> arrayList = new ArrayList<>();
            String string = this.preferenceFacade.getString(TRACKED_ANNOUNCEMENT_GN_NOTIFICATION);
            if (string == null) {
                return arrayList;
            }
            Type type = new getMax().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<String>>() {}.type");
            Object fromJson = new Gson().fromJson(string, type);
            if (fromJson != null) {
                return (List) fromJson;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"id/dana/data/announcement/repository/source/local/AnnouncementPreference$getTrackedAnnouncementGnIds$listType$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.html$default$getMax */
        public static final class getMax extends TypeToken<List<? extends String>> {
            getMax() {
            }
        }

        public final boolean saveTrackedAnnouncementGnId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "announcementId");
            List mutableList = CollectionsKt.toMutableList(getAnnouncementGnIds());
            mutableList.add(str);
            this.preferenceFacade.saveData(TRACKED_ANNOUNCEMENT_GN_NOTIFICATION, new Gson().toJson((Object) CollectionsKt.toList(mutableList)));
            return true;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/announcement/repository/source/local/AnnouncementPreference$Companion;", "", "()V", "ANNOUNCEMENT_GN_NOTIFICATION", "", "TRACKED_ANNOUNCEMENT_GN_NOTIFICATION", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.html$default$setMax */
        public static final class setMax {
            private setMax() {
            }

            public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public html(b.C0007b<preShow> bVar, b.C0007b<resolveColor.Cdefault> bVar2, b.C0007b<adjustAlpha> bVar3) {
        this.networkAnnouncementEntityDataProvider = bVar;
        this.mockAnnouncementEntityDataProvider = bVar2;
        this.localAnnouncementEntityDataProvider = bVar3;
    }

    public final getMessageTextView get() {
        return newInstance(this.networkAnnouncementEntityDataProvider.get(), this.mockAnnouncementEntityDataProvider.get(), this.localAnnouncementEntityDataProvider.get());
    }

    public static html create(b.C0007b<preShow> bVar, b.C0007b<resolveColor.Cdefault> bVar2, b.C0007b<adjustAlpha> bVar3) {
        return new html(bVar, bVar2, bVar3);
    }

    public static getMessageTextView newInstance(preShow preshow, resolveColor.Cdefault defaultR, adjustAlpha adjustalpha) {
        return new getMessageTextView(preshow, defaultR, adjustalpha);
    }
}
