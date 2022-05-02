package com.alibaba.ariver.kernel.common.network;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NetworkUtil {
    public static final String NETWORK_TYPE_2G = "2G";
    public static final String NETWORK_TYPE_3G = "3G";
    public static final String NETWORK_TYPE_4G = "4G";
    public static final String NETWORK_TYPE_NOTREACHABLE = "NotReachable";
    public static final String NETWORK_TYPE_UNKNOWN = "UNKNOWN";
    public static final String NETWORK_TYPE_WIFI = "WIFI";
    public static final String TAG = "NetworkUtil";

    /* renamed from: a  reason: collision with root package name */
    private static Network f9022a;
    private static final List<NetworkListener> b = new CopyOnWriteArrayList();
    private static boolean c = false;
    @VisibleForTesting
    protected static BroadcastReceiver sBroadcastReceiver = null;

    public interface NetworkListener {
        void onNetworkChanged(Network network, Network network2);
    }

    public enum Network {
        NETWORK_WIFI,
        NETWORK_MOBILE_FAST,
        NETWORK_MOBILE_MIDDLE,
        NETWORK_MOBILE_SLOW,
        NETWORK_NO_CONNECTION,
        NETWORK_TYPE_UNKNOWN
    }

    public static Network getCurrentNetworkType(Context context, boolean z) {
        Network network = f9022a;
        if (network != null && z) {
            return network;
        }
        c(context);
        return f9022a;
    }

    public static String getSimpleNetworkType(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            RVLogger.e(TAG, "Exception", th);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return "fail";
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 9) ? "wifi" : "wwan";
    }

    public static String getDetailNetworkType(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            RVLogger.e(TAG, "get network info exception.", th);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return NETWORK_TYPE_NOTREACHABLE;
        }
        int type = networkInfo.getType();
        if (type == 1 || type == 9) {
            return "WIFI";
        }
        int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
        if (networkType == 18) {
            return "3G";
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r3) {
        /*
            java.lang.Class<com.alibaba.ariver.kernel.common.network.NetworkUtil> r0 = com.alibaba.ariver.kernel.common.network.NetworkUtil.class
            monitor-enter(r0)
            boolean r1 = c     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038
            if (r3 != 0) goto L_0x000a
            goto L_0x0038
        L_0x000a:
            r1 = 1
            c = r1     // Catch:{ all -> 0x003a }
            android.content.BroadcastReceiver r1 = sBroadcastReceiver     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0019
            com.alibaba.ariver.kernel.common.network.NetworkUtil$MyBroadcastReceiver r1 = new com.alibaba.ariver.kernel.common.network.NetworkUtil$MyBroadcastReceiver     // Catch:{ all -> 0x002e }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x002e }
            sBroadcastReceiver = r1     // Catch:{ all -> 0x002e }
        L_0x0019:
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x002e }
            r1.<init>()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r2)     // Catch:{ all -> 0x002e }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x002e }
            android.content.BroadcastReceiver r2 = sBroadcastReceiver     // Catch:{ all -> 0x002e }
            r3.registerReceiver(r2, r1)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)
            return
        L_0x002e:
            r3 = move-exception
            java.lang.String r1 = "NetworkUtil"
            java.lang.String r2 = "registerReceiver error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)
            return
        L_0x0038:
            monitor-exit(r0)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.network.NetworkUtil.a(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void b(android.content.Context r3) {
        /*
            java.lang.Class<com.alibaba.ariver.kernel.common.network.NetworkUtil> r0 = com.alibaba.ariver.kernel.common.network.NetworkUtil.class
            monitor-enter(r0)
            r1 = 0
            c = r1     // Catch:{ all -> 0x0027 }
            android.content.BroadcastReceiver r1 = sBroadcastReceiver     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x000d
            goto L_0x0025
        L_0x000d:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x001b }
            android.content.BroadcastReceiver r1 = sBroadcastReceiver     // Catch:{ all -> 0x001b }
            r3.unregisterReceiver(r1)     // Catch:{ all -> 0x001b }
            r3 = 0
            sBroadcastReceiver = r3     // Catch:{ all -> 0x001b }
            monitor-exit(r0)
            return
        L_0x001b:
            r3 = move-exception
            java.lang.String r1 = "NetworkUtil"
            java.lang.String r2 = "unRegisterReceiver error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r3)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)
            return
        L_0x0025:
            monitor-exit(r0)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.network.NetworkUtil.b(android.content.Context):void");
    }

    public static void addListener(Context context, NetworkListener networkListener) {
        if (networkListener != null && !b.contains(networkListener)) {
            a(context);
            b.add(networkListener);
        }
    }

    public static void removeListener(Context context, NetworkListener networkListener) {
        if (networkListener != null) {
            b.remove(networkListener);
            if (b.size() == 0) {
                b(context);
            }
        }
    }

    /* renamed from: com.alibaba.ariver.kernel.common.network.NetworkUtil$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alibaba.ariver.kernel.common.network.NetworkUtil$Network[] r0 = com.alibaba.ariver.kernel.common.network.NetworkUtil.Network.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network = r0
                com.alibaba.ariver.kernel.common.network.NetworkUtil$Network r1 = com.alibaba.ariver.kernel.common.network.NetworkUtil.Network.NETWORK_NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.kernel.common.network.NetworkUtil$Network r1 = com.alibaba.ariver.kernel.common.network.NetworkUtil.Network.NETWORK_MOBILE_SLOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.kernel.common.network.NetworkUtil$Network r1 = com.alibaba.ariver.kernel.common.network.NetworkUtil.Network.NETWORK_MOBILE_MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.ariver.kernel.common.network.NetworkUtil$Network r1 = com.alibaba.ariver.kernel.common.network.NetworkUtil.Network.NETWORK_MOBILE_FAST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alibaba.ariver.kernel.common.network.NetworkUtil$Network r1 = com.alibaba.ariver.kernel.common.network.NetworkUtil.Network.NETWORK_WIFI     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.network.NetworkUtil.AnonymousClass1.<clinit>():void");
        }
    }

    public static String transferNetworkType(Network network) {
        int i = AnonymousClass1.$SwitchMap$com$alibaba$ariver$kernel$common$network$NetworkUtil$Network[network.ordinal()];
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "2g";
        }
        if (i == 3) {
            return "3g";
        }
        if (i != 4) {
            return i != 5 ? "unknown" : "wifi";
        }
        return "4g";
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public static void c(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            RVLogger.e(TAG, "exception detail", th);
            networkInfo = null;
        }
        Network network = f9022a;
        Network a2 = a(networkInfo);
        f9022a = a2;
        if (network != null && a2 != network && b != null) {
            RVLogger.d(TAG, "onNetworkChanged");
            synchronized (b) {
                for (NetworkListener next : b) {
                    if (next != null) {
                        next.onNetworkChanged(network, f9022a);
                    }
                }
            }
        }
    }

    private static Network a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            try {
                return Network.NETWORK_NO_CONNECTION;
            } catch (Exception e) {
                RVLogger.e(TAG, "detectNetwork error!", e);
                return Network.NETWORK_TYPE_UNKNOWN;
            }
        } else if (!networkInfo.isConnected()) {
            return Network.NETWORK_NO_CONNECTION;
        } else {
            int type = networkInfo.getType();
            int subtype = networkInfo.getSubtype();
            StringBuilder sb = new StringBuilder("type: ");
            sb.append(type);
            sb.append(" subType: ");
            sb.append(subtype);
            RVLogger.d(TAG, sb.toString());
            if (type != 1) {
                if (type != 9) {
                    if (type != 0) {
                        return Network.NETWORK_TYPE_UNKNOWN;
                    }
                    if (subtype == 0) {
                        return Network.NETWORK_TYPE_UNKNOWN;
                    }
                    if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                        return Network.NETWORK_MOBILE_SLOW;
                    }
                    if (subtype != 13) {
                        return Network.NETWORK_MOBILE_MIDDLE;
                    }
                    return Network.NETWORK_MOBILE_FAST;
                }
            }
            return Network.NETWORK_WIFI;
        }
    }

    static class MyBroadcastReceiver extends BroadcastReceiver {
        private MyBroadcastReceiver() {
        }

        /* synthetic */ MyBroadcastReceiver(AnonymousClass1 r1) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            NetworkUtil.c(context);
        }
    }
}
