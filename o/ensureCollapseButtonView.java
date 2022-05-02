package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import o.ITrustedWebActivityCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R:\u0010\f\u001a.\u0012*\u0012(\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u0006 \u000e*\u0014\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/anggrayudi/storage/permission/FragmentPermissionRequest;", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "fragment", "Landroidx/fragment/app/Fragment;", "permissions", "", "", "options", "Landroidx/core/app/ActivityOptionsCompat;", "callback", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Landroidx/core/app/ActivityOptionsCompat;Lcom/anggrayudi/storage/permission/PermissionCallback;)V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "check", "", "continueToPermissionRequest", "onRequestPermissionsResult", "result", "", "", "Builder", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ensureCollapseButtonView implements layoutChildLeft {
    @NotNull
    private final String[] getMax;
    @NotNull
    private final ITrustedWebActivityCallback<String[]> getMin;
    @NotNull
    private final measureChildCollapseMargins length;
    @NotNull
    private final Fragment setMax;
    @Nullable
    private final name setMin;

    public /* synthetic */ ensureCollapseButtonView(Fragment fragment, String[] strArr, name name, measureChildCollapseMargins measurechildcollapsemargins, byte b) {
        this(fragment, strArr, name, measurechildcollapsemargins);
    }

    private ensureCollapseButtonView(Fragment fragment, String[] strArr, name name, measureChildCollapseMargins measurechildcollapsemargins) {
        this.setMax = fragment;
        this.getMax = strArr;
        this.setMin = name;
        this.length = measurechildcollapsemargins;
        ITrustedWebActivityCallback<String[]> registerForActivityResult = fragment.registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.setMin(), new measureChildConstrained(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {\n        onRequestPermissionsResult(it)\n    }");
        this.getMin = registerForActivityResult;
    }

    public final void setMax() {
        Context requireContext = this.setMax.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "fragment.requireContext()");
        for (String length2 : this.getMax) {
            if (IntRange.length(requireContext, length2) != 0) {
                this.length.onDisplayConsentDialog(this);
                return;
            }
        }
        measureChildCollapseMargins measurechildcollapsemargins = this.length;
        String[] strArr = this.getMax;
        Collection arrayList = new ArrayList(strArr.length);
        for (String ensurenavbuttonview : strArr) {
            arrayList.add(new ensureNavButtonView(ensurenavbuttonview, true, false));
        }
        measurechildcollapsemargins.onPermissionsChecked(new layoutChildRight((List) arrayList), false);
    }

    public final void length() {
        FragmentActivity requireActivity = this.setMax.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
        for (String length2 : this.getMax) {
            if (IntRange.length((Context) requireActivity, length2) != 0) {
                this.getMin.getMin(this.getMax, this.setMin);
                return;
            }
        }
        measureChildCollapseMargins measurechildcollapsemargins = this.length;
        String[] strArr = this.getMax;
        Collection arrayList = new ArrayList(strArr.length);
        for (String ensurenavbuttonview : strArr) {
            arrayList.add(new ensureNavButtonView(ensurenavbuttonview, true, false));
        }
        measurechildcollapsemargins.onPermissionsChecked(new layoutChildRight((List) arrayList), false);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u001f\u0010\u0012\u001a\u00020\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000b¢\u0006\u0002\u0010\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/anggrayudi/storage/permission/FragmentPermissionRequest$Builder;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "callback", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "options", "Landroidx/core/app/ActivityOptionsCompat;", "permissions", "", "", "build", "Lcom/anggrayudi/storage/permission/FragmentPermissionRequest;", "check", "", "withActivityOptions", "withCallback", "withPermissions", "", "([Ljava/lang/String;)Lcom/anggrayudi/storage/permission/FragmentPermissionRequest$Builder;", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class getMax {
        @Nullable
        public measureChildCollapseMargins getMax;
        @Nullable
        private name getMin;
        @NotNull
        public Set<String> setMax = SetsKt.emptySet();
        @NotNull
        private final Fragment setMin;

        public getMax(@NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.setMin = fragment;
        }

        @NotNull
        public final ensureCollapseButtonView setMin() {
            Fragment fragment = this.setMin;
            Object[] array = this.setMax.toArray(new String[0]);
            if (array != null) {
                name name = this.getMin;
                measureChildCollapseMargins measurechildcollapsemargins = this.getMax;
                Intrinsics.checkNotNull(measurechildcollapsemargins);
                return new ensureCollapseButtonView(fragment, (String[]) array, name, measurechildcollapsemargins, (byte) 0);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static /* synthetic */ void getMin(ensureCollapseButtonView ensurecollapsebuttonview, Map map) {
        Intrinsics.checkNotNullParameter(ensurecollapsebuttonview, "this$0");
        Intrinsics.checkNotNullExpressionValue(map, "it");
        FragmentActivity requireActivity = ensurecollapsebuttonview.setMax.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
        Collection arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (((Boolean) entry.getValue()).booleanValue() || FontRes.getMax(requireActivity, (String) entry.getKey())) {
                z = false;
            }
            arrayList.add(new ensureNavButtonView(str, booleanValue, z));
        }
        List list = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : list) {
            if (((ensureNavButtonView) next).setMax()) {
                arrayList2.add(next);
            }
        }
        List list2 = (List) arrayList2;
        if (list2.isEmpty()) {
            ensurecollapsebuttonview.length.onPermissionsChecked(new layoutChildRight(list), true);
        } else {
            ensurecollapsebuttonview.length.onShouldRedirectToSystemSettings(list2);
        }
    }
}
