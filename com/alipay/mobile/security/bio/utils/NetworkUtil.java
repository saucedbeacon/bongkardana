package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NetworkUtil {
    private static final String ETH0_MAC_ADDR = "/sys/class/net/eth0/address";

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
            for (NetworkInfo state : allNetworkInfo) {
                if (state.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getNetworkType(Context context) {
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                    if ("wifi".equals(activeNetworkInfo.getTypeName().toLowerCase())) {
                        return "wifi";
                    }
                    try {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 11:
                                return "2g";
                            case 3:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                return "3g";
                            case 13:
                                return "4g";
                            default:
                                return "2g";
                        }
                    } catch (Exception unused) {
                        return "2g";
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    public static String getMacAddress() {
        try {
            return loadFileAsString(ETH0_MAC_ADDR).substring(0, 17);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String loadFileAsString(String str) throws IOException {
        StringBuffer stringBuffer = new StringBuffer(1000);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        char[] cArr = new char[1024];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                stringBuffer.append(String.valueOf(cArr, 0, read));
            } else {
                bufferedReader.close();
                return stringBuffer.toString();
            }
        }
    }
}
