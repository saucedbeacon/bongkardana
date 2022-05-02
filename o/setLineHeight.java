package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.reflect.Method;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setLineHeight {
    private static final String length = setSupportBackgroundTintList.length("ProcessUtils");

    public static boolean getMax(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow) {
        String max = setMax(context);
        if (!TextUtils.isEmpty(onattachedtowindow.IsOverlapping)) {
            return TextUtils.equals(max, onattachedtowindow.IsOverlapping);
        }
        return TextUtils.equals(max, context.getApplicationInfo().processName);
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    @Nullable
    private static String setMax(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, getSupportButtonTintList.class.getClassLoader());
            if (Build.VERSION.SDK_INT >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                obj = declaredMethod.invoke((Object) null, new Object[0]);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]);
                declaredMethod3.setAccessible(true);
                obj = declaredMethod3.invoke(declaredMethod2.invoke((Object) null, new Object[0]), new Object[0]);
            }
            if (obj instanceof String) {
                return (String) obj;
            }
        } catch (Throwable unused) {
            setSupportBackgroundTintList.getMax();
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }
}
