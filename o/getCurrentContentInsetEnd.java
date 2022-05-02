package o;

import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import o.ITrustedWebActivityCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J)\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0016\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R<\u0010\f\u001a0\u0012*\u0012(\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u0006 \u000e*\u0014\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006 "}, d2 = {"Lcom/anggrayudi/storage/permission/ActivityPermissionRequest;", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "activity", "Landroid/app/Activity;", "permissions", "", "", "requestCode", "", "callback", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/Integer;Lcom/anggrayudi/storage/permission/PermissionCallback;)V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "Ljava/lang/Integer;", "check", "", "continueToPermissionRequest", "onRequestPermissionsResult", "grantResults", "", "(I[Ljava/lang/String;[I)V", "result", "", "", "reportResult", "reports", "", "Lcom/anggrayudi/storage/permission/PermissionReport;", "Builder", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getCurrentContentInsetEnd implements layoutChildLeft {
    @NotNull
    private final measureChildCollapseMargins getMax;
    @NotNull
    private final String[] getMin;
    @Nullable
    private final Integer length;
    @Nullable
    private final ITrustedWebActivityCallback<String[]> setMax;
    @NotNull
    private final Activity setMin;

    public /* synthetic */ getCurrentContentInsetEnd(Activity activity, String[] strArr, Integer num, measureChildCollapseMargins measurechildcollapsemargins, byte b) {
        this(activity, strArr, num, measurechildcollapsemargins);
    }

    private getCurrentContentInsetEnd(Activity activity, String[] strArr, Integer num, measureChildCollapseMargins measurechildcollapsemargins) {
        this.setMin = activity;
        this.getMin = strArr;
        this.length = num;
        this.getMax = measurechildcollapsemargins;
        this.setMax = activity instanceof ComponentActivity ? ((ComponentActivity) activity).registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.setMin(), new addSystemView(this)) : null;
    }

    public final void setMax() {
        for (String length2 : this.getMin) {
            if (IntRange.length((Context) this.setMin, length2) != 0) {
                this.getMax.onDisplayConsentDialog(this);
                return;
            }
        }
        measureChildCollapseMargins measurechildcollapsemargins = this.getMax;
        String[] strArr = this.getMin;
        Collection arrayList = new ArrayList(strArr.length);
        for (String ensurenavbuttonview : strArr) {
            arrayList.add(new ensureNavButtonView(ensurenavbuttonview, true, false));
        }
        measurechildcollapsemargins.onPermissionsChecked(new layoutChildRight((List) arrayList), false);
    }

    private final void getMax(List<ensureNavButtonView> list) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((ensureNavButtonView) next).setMax()) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        if (list2.isEmpty()) {
            this.getMax.onPermissionsChecked(new layoutChildRight(list), true);
        } else {
            this.getMax.onShouldRedirectToSystemSettings(list2);
        }
    }

    public final void length() {
        for (String length2 : this.getMin) {
            if (IntRange.length((Context) this.setMin, length2) != 0) {
                ITrustedWebActivityCallback<String[]> iTrustedWebActivityCallback = this.setMax;
                if (iTrustedWebActivityCallback != null) {
                    iTrustedWebActivityCallback.getMin(this.getMin, (name) null);
                    return;
                }
                Activity activity = this.setMin;
                String[] strArr = this.getMin;
                Integer num = this.length;
                if (num != null) {
                    FontRes.getMin(activity, strArr, num.intValue());
                    return;
                }
                throw new IllegalStateException("Request code hasn't been set yet");
            }
        }
        measureChildCollapseMargins measurechildcollapsemargins = this.getMax;
        String[] strArr2 = this.getMin;
        Collection arrayList = new ArrayList(strArr2.length);
        for (String ensurenavbuttonview : strArr2) {
            arrayList.add(new ensureNavButtonView(ensurenavbuttonview, true, false));
        }
        measurechildcollapsemargins.onPermissionsChecked(new layoutChildRight((List) arrayList), false);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0015\"\u00020\r¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/anggrayudi/storage/permission/ActivityPermissionRequest$Builder;", "", "activity", "Landroid/app/Activity;", "requestCode", "", "(Landroid/app/Activity;I)V", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;)V", "callback", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "permissions", "", "", "Ljava/lang/Integer;", "build", "Lcom/anggrayudi/storage/permission/ActivityPermissionRequest;", "check", "", "withCallback", "withPermissions", "", "([Ljava/lang/String;)Lcom/anggrayudi/storage/permission/ActivityPermissionRequest$Builder;", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setMax {
        @NotNull
        private final Activity getMax;
        @NotNull
        public Set<String> getMin = SetsKt.emptySet();
        @Nullable
        private final Integer setMax;
        @Nullable
        public measureChildCollapseMargins setMin;

        public setMax(@NotNull ComponentActivity componentActivity) {
            Intrinsics.checkNotNullParameter(componentActivity, AkuEventParamsKey.KEY_ACTIVITY);
            this.getMax = componentActivity;
            this.setMax = null;
        }

        @NotNull
        public final getCurrentContentInsetEnd setMin() {
            Activity activity = this.getMax;
            Object[] array = this.getMin.toArray(new String[0]);
            if (array != null) {
                Integer num = this.setMax;
                measureChildCollapseMargins measurechildcollapsemargins = this.setMin;
                Intrinsics.checkNotNull(measurechildcollapsemargins);
                return new getCurrentContentInsetEnd(activity, (String[]) array, num, measurechildcollapsemargins, (byte) 0);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static /* synthetic */ void length(getCurrentContentInsetEnd getcurrentcontentinsetend, Map map) {
        Intrinsics.checkNotNullParameter(getcurrentcontentinsetend, "this$0");
        Intrinsics.checkNotNullExpressionValue(map, "it");
        Collection arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ensureNavButtonView((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue(), !((Boolean) entry.getValue()).booleanValue() && !FontRes.getMax(getcurrentcontentinsetend.setMin, (String) entry.getKey())));
        }
        getcurrentcontentinsetend.getMax((List) arrayList);
    }
}
