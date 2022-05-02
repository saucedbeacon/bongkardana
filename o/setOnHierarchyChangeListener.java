package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class setOnHierarchyChangeListener {
    private final Context getMin;

    public setOnHierarchyChangeListener(Context context) {
        this.getMin = context;
    }

    public final List<VirtualLayout> getMax() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.getMin.getPackageManager().getApplicationInfo(this.getMin.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Bundle bundle = applicationInfo.metaData;
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(getMin(str));
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    private static VirtualLayout getMin(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof VirtualLayout) {
                    return (VirtualLayout) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(newInstance)));
            } catch (InstantiationException e) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }
}
