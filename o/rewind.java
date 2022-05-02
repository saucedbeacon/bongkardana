package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsService;

public class rewind {
    private final Context getMax;
    private final ComponentName getMin;
    private final ICustomTabsService length;

    rewind(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.length = iCustomTabsService;
        this.getMin = componentName;
        this.getMax = context;
    }

    public static boolean setMax(@NonNull Context context, @Nullable String str, @NonNull rateWithExtras ratewithextras) {
        ratewithextras.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, ratewithextras, 33);
    }

    public final boolean setMin() {
        try {
            return this.length.warmup(0);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
