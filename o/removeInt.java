package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Process;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.split.android.client.dtos.Split;
import io.split.android.client.localhost.LocalhostFileParser;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public final class removeInt implements LocalhostFileParser {
    private static int getMin = 1;
    private static int setMax;
    Context mContext;

    public removeInt(Context context) {
        this.mContext = context;
    }

    public final Map<String, Split> parse(String str) {
        HashMap hashMap = null;
        try {
            Properties properties = new Properties();
            AssetManager assets = this.mContext.getAssets();
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = assets;
            properties.load((InputStream) ((Class) upFrom.setMax(18 - MotionEvent.axisFromString(""), Process.getGidForName("") + 1, (char) (56348 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr));
            HashMap hashMap2 = new HashMap();
            try {
                Iterator it = properties.keySet().iterator();
                try {
                    int i = setMax + 59;
                    getMin = i % 128;
                    while (true) {
                        int i2 = i % 2;
                        if (it.hasNext()) {
                            Object next = it.next();
                            Split split = new Split();
                            split.name = (String) next;
                            split.defaultTreatment = properties.getProperty((String) next);
                            hashMap2.put(split.name, split);
                            i = getMin + 49;
                            setMax = i % 128;
                        } else {
                            int i3 = getMin + 115;
                            try {
                                setMax = i3 % 128;
                                int i4 = i3 % 2;
                                return hashMap2;
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (FileNotFoundException unused) {
                hashMap = hashMap2;
                createLoadingDialog.e("Localhost property file not found. Add split.properties in your application assets");
                return hashMap;
            } catch (Exception unused2) {
                hashMap = hashMap2;
                createLoadingDialog.e("Error loading localhost property file");
                return hashMap;
            }
        } catch (FileNotFoundException unused3) {
            createLoadingDialog.e("Localhost property file not found. Add split.properties in your application assets");
            return hashMap;
        } catch (Exception unused4) {
            createLoadingDialog.e("Error loading localhost property file");
            return hashMap;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
