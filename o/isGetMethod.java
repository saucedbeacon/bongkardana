package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lid/dana/data/saving/repository/source/local/DefaultSavingConfigEntityData;", "Lid/dana/data/saving/repository/SavingConfigEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getSavingEmptyState", "Lio/reactivex/Observable;", "Lid/dana/data/saving/model/SavingEmptyStateEntity;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isGetMethod implements getStatusCode {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String DEFAULT_SAVING_CONFIG = "split/default-saving-empty-state.json";
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public isGetMethod(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/saving/model/SavingEmptyStateEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<url> {
        final /* synthetic */ isGetMethod getMax;

        length(isGetMethod isgetmethod) {
            this.getMax = isgetmethod;
        }

        /* access modifiers changed from: private */
        /* renamed from: getMin */
        public url call() {
            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.getMax.getContext(), "split/default-saving-empty-state.json");
            Object obj = null;
            if (loadJSONFromAsset == null) {
                return null;
            }
            if (loadJSONFromAsset != null) {
                try {
                    obj = new Gson().fromJson(new JSONObject(loadJSONFromAsset).toString(), url.class);
                } catch (Exception unused) {
                }
            }
            return (url) obj;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<url> getSavingEmptyState() {
        TitleBarRightButtonView.AnonymousClass1<url> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …          }\n            }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/saving/repository/source/local/DefaultSavingConfigEntityData$Companion;", "", "()V", "DEFAULT_SAVING_CONFIG", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
