package com.alipay.iap.android.matamata.plugins.file.descriptor;

import android.content.Context;
import com.facebook.flipper.core.FlipperObject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RootDescriptor implements NodeDescriptor<Context> {
    public String getId(Context context) {
        return context.getPackageName();
    }

    public String getName(Context context) {
        return context.getPackageName();
    }

    public Object[] getChildren(Context context) {
        File file = new File(context.getApplicationInfo().dataDir);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        return file.listFiles();
    }

    public List<Named<FlipperObject>> getData(Context context) throws Exception {
        ArrayList arrayList = new ArrayList();
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        setmax.getMin("Target SDK", Integer.valueOf(context.getApplicationInfo().targetSdkVersion)).getMax("Data Dir", context.getApplicationInfo().dataDir).getMax("Native lib Dir", context.getApplicationInfo().nativeLibraryDir).getMax("Process Name", context.getApplicationInfo().processName);
        arrayList.add(new Named("App Info", new FlipperObject(setmax.getMax)));
        return arrayList;
    }
}
