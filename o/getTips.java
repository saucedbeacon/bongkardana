package o;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/utils/permission/FragmentPermissionCheck;", "Lid/dana/utils/permission/PermissionCheckFacade;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "check", "", "permissions", "", "", "requestCode", "", "([Ljava/lang/String;I)V", "getActivity", "Landroid/app/Activity;", "getContext", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTips implements registerStateListener {
    private final Fragment setMax;

    public getTips(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.setMax = fragment;
    }

    public final void getMin(@NotNull String[] strArr, int i) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        this.setMax.requestPermissions(strArr, i);
    }

    @NotNull
    public final Context length() {
        Context requireContext = this.setMax.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "fragment.requireContext()");
        return requireContext;
    }

    @NotNull
    public final Activity setMin() {
        FragmentActivity requireActivity = this.setMax.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
        return requireActivity;
    }
}
