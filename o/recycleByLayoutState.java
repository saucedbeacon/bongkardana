package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.google.firebase.iid.ServiceStarter;
import com.mixpanel.android.mpmetrics.MixpanelFCMMessagingService;
import com.mixpanel.android.takeoverinapp.TakeoverInAppActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class recycleByLayoutState {
    private static Boolean getMin = null;
    public static String length = "MixpanelAPI.ConfigurationChecker";

    recycleByLayoutState() {
    }

    public static boolean setMin(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager == null || packageName == null) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            return false;
        } else if (packageManager.checkPermission("android.permission.INTERNET", packageName) == 0) {
            return true;
        } else {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
            return false;
        }
    }

    public static boolean setMax(Context context) {
        if (getMin == null) {
            if (Build.VERSION.SDK_INT < 16) {
                Boolean bool = Boolean.FALSE;
                getMin = bool;
                return bool.booleanValue();
            }
            Intent intent = new Intent(context, TakeoverInAppActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(131072);
            if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0) {
                Class<TakeoverInAppActivity> cls = TakeoverInAppActivity.class;
                findOnePartiallyOrCompletelyInvisibleChild.isInside();
                findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                Boolean bool2 = Boolean.FALSE;
                getMin = bool2;
                return bool2.booleanValue();
            }
            getMin = Boolean.TRUE;
        }
        return getMin.booleanValue();
    }

    public static boolean length(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (!(packageManager == null || packageName == null)) {
            if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                findOnePartiallyOrCompletelyInvisibleChild.isInside();
                findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                return false;
            }
            try {
                ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(packageName, 4).services;
                if (!(serviceInfoArr == null || serviceInfoArr.length == 0)) {
                    Intent intent = new Intent(ServiceStarter.ACTION_MESSAGING_EVENT);
                    intent.setPackage(packageName);
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        try {
                            if (!MixpanelFCMMessagingService.class.isAssignableFrom(Class.forName(it.next().serviceInfo.name))) {
                                it.remove();
                            }
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    if (!(queryIntentServices == null || queryIntentServices.size() == 0)) {
                        ArrayList arrayList = new ArrayList();
                        for (ResolveInfo next : queryIntentServices) {
                            for (ServiceInfo serviceInfo : serviceInfoArr) {
                                if (serviceInfo.name.equals(next.serviceInfo.name) && serviceInfo.isEnabled()) {
                                    arrayList.add(next.serviceInfo);
                                }
                            }
                        }
                        if (arrayList.size() > 1) {
                            findOnePartiallyOrCompletelyInvisibleChild.isInside();
                        }
                        try {
                            Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
                        } catch (ClassNotFoundException unused2) {
                            findOnePartiallyOrCompletelyInvisibleChild.isInside();
                            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                        }
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
        }
        return false;
    }

    public static boolean length(Future<SharedPreferences> future) {
        try {
            Class.forName("o.inflateMenu");
            if (future == null || future.get().getAll().size() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.length();
            return false;
        } catch (InterruptedException unused2) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            return false;
        } catch (ExecutionException unused3) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            return false;
        }
    }
}
