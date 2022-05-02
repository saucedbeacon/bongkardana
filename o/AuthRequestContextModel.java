package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J)\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002J)\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010$J)\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ1\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010)J)\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010+J \u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lid/dana/data/social/repository/source/local/PreferenceSocialSyncEntityData;", "Lid/dana/data/social/repository/SocialSyncEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "socialSyncContactPreference", "", "getFullSyncFinishedFlag", "", "phoneNumber", "fullSyncFinishedKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastSynchedTime", "lastSyncContactTimeKey", "getOffsetAtSpecificSyncTime", "", "specificTime", "offsetAtSpecificSyncTimeKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffsetLastSynchedContact", "lastOffsetSyncContactKey", "isFirstTimeInitFeedFinished", "firstTimeInitFeedKey", "returnZeroWhenIntNotFound", "it", "saveFullSyncFinishedFlag", "", "isFinished", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastSynchedTime", "lastSynchedTime", "saveOffsetAtSpecificSyncTime", "offsetToSave", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOffsetLastSynchedContact", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFirstTimeInitFeedFinished", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AuthRequestContextModel implements getAuthRequestContext {
    @NotNull
    private final Context context;
    private final onSingleFailed preferenceFacade;
    @NotNull
    private final PluginInstallCallback serializer;
    private final String socialSyncContactPreference;

    private final int returnZeroWhenIntNotFound(int i) {
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Inject
    public AuthRequestContextModel(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.context = context2;
        this.serializer = pluginInstallCallback;
        StringBuilder sb = new StringBuilder();
        sb.append(AuthRequestContextModel.class.getSimpleName());
        sb.append("production");
        this.socialSyncContactPreference = sb.toString();
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(this.context).setPreferenceGroup(this.socialSyncContactPreference).setUseDrutherPreference(true).setSerializerFacade(this.serializer)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(it).createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final PluginInstallCallback getSerializer() {
        return this.serializer;
    }

    @Nullable
    public final Object getLastSynchedTime(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super String> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String string = onsinglefailed.getString(sb.toString());
        return string == null ? "" : string;
    }

    @Nullable
    public final Object saveLastSynchedTime(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str3);
        onsinglefailed.saveData(sb.toString(), str);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object saveOffsetLastSynchedContact(int i, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        onsinglefailed.saveData(sb.toString(), Boxing.boxInt(i));
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object saveOffsetAtSpecificSyncTime(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        onsinglefailed.saveData(sb.toString(), Boxing.boxInt(i));
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getOffsetAtSpecificSyncTime(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Integer> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        Integer integer = onsinglefailed.getInteger(sb.toString());
        Intrinsics.checkNotNullExpressionValue(integer, "it");
        return Boxing.boxInt(returnZeroWhenIntNotFound(integer.intValue()));
    }

    @Nullable
    public final Object getOffsetLastSynchedContact(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Integer> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Integer integer = onsinglefailed.getInteger(sb.toString());
        Intrinsics.checkNotNullExpressionValue(integer, "it");
        return Boxing.boxInt(returnZeroWhenIntNotFound(integer.intValue()));
    }

    @Nullable
    public final Object getFullSyncFinishedFlag(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Boolean bool = onsinglefailed.getBoolean(sb.toString(), false);
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…lSyncFinishedKey\", false)");
        return bool;
    }

    @Nullable
    public final Object saveFullSyncFinishedFlag(boolean z, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        onsinglefailed.saveData(sb.toString(), Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }

    public final void setFirstTimeInitFeedFinished(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "firstTimeInitFeedKey");
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        onsinglefailed.saveData(sb.toString(), Boolean.valueOf(z));
    }

    public final boolean isFirstTimeInitFeedFinished(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "firstTimeInitFeedKey");
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Boolean bool = onsinglefailed.getBoolean(sb.toString());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
