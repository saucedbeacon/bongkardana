package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ-\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ#\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u0002H\u000e¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/data/globalsearch/source/GlobalSearchPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getCachePopularSearch", "Lid/dana/data/globalsearch/model/PopularSearchCache;", "getCacheRecentSearch", "Ljava/util/HashMap;", "", "", "getObject", "T", "key", "classOfT", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "saveCacheRecentSearch", "", "hashMap", "saveData", "", "obj", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class pauseRender {
    @NotNull
    public static final length getMin;
    private static final String setMin;
    final onSingleFailed length;

    @Inject
    public pauseRender(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(setMin).setUseDrutherPreference(true).setSerializerFacade((compareVersion) null)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(mpBu….createData(Source.LOCAL)");
        this.length = createData;
    }

    public final <T> boolean length(@Nullable String str, T t) {
        try {
            this.length.saveData(str, t);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    public final <T> T setMin(@Nullable String str, @Nullable Class<T> cls) {
        try {
            return this.length.getObject(str, cls);
        } catch (Exception unused) {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/globalsearch/source/GlobalSearchPreference$Companion;", "", "()V", "GLOBAL_SEARCH_PREFERENCE", "", "GLOBAL_SEARCH_RECENT_SEARCH", "POPULAR_SEARCH_PLACEHOLDER", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    static {
        length length2 = new length((byte) 0);
        getMin = length2;
        setMin = Intrinsics.stringPlus(Reflection.getOrCreateKotlinClass(length2.getClass()).getSimpleName(), "production");
    }
}
