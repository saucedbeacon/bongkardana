package id.dana.lib.gcontainer.app.extension;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.api.common.activity.ActivityHelperExtension;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.onInput;
import o.pushWindow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016¨\u0006!"}, d2 = {"Lid/dana/lib/gcontainer/app/extension/ActivityHelperExtensionImpl;", "Lcom/alibaba/griver/api/common/activity/ActivityHelperExtension;", "()V", "bindActivity", "", "activity", "Landroid/app/Activity;", "dispatchTouchEvent", "motionEvent", "Landroid/view/MotionEvent;", "finish", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "onPause", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStop", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public class ActivityHelperExtensionImpl implements ActivityHelperExtension {
    public void bindActivity(@Nullable Activity activity) {
    }

    public void dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    public void finish() {
    }

    public void onCreate(@Nullable Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStop() {
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        List arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                break;
            }
            String str = strArr[i2];
            int i4 = i3 + 1;
            if (iArr[i3] != 0) {
                z = false;
            }
            arrayList.add(new pushWindow(str, z));
            i2++;
            i3 = i4;
        }
        if (!arrayList.isEmpty()) {
            onInput.getDefault().post(new BaseBridge.getMin(i, arrayList));
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        onInput.getDefault().post(new BaseBridge.setMin(i, i2, intent));
    }
}
