package com.alibaba.griver.core.utils;

import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.R;

public class g {
    public static String a(int i, boolean z) {
        String string;
        if (i == -6 || i == -7 || i == -80 || i == 1 || i == -8 || i == 3 || i == 4) {
            string = GriverEnv.getResources() == null ? z ? "Please check the network connection" : "Not Connected To Internet" : z ? GriverEnv.getResources().getString(R.string.griver_core_error_page_network_unavailable_sub) : GriverEnv.getResources().getString(R.string.griver_core_error_page_network_unavailable);
        } else if (i == 400 || i == 503 || i == 401 || i == 409 || i == 410 || i == 411 || i == 412 || i == 500 || i == 501 || i == 502 || i == -9 || i == -2 || i == 9 || i == -4 || i == -12 || i == -5 || i == -10 || i == -11 || i == 10 || i == 8 || i == 7 || i == -1 || i == -3 || i == -13 || i == -14 || i == -15 || i == 0 || i == 5 || i == 6 || i == 11 || i == 13 || i == 2) {
            if (GriverEnv.getResources() != null) {
                string = z ? GriverEnv.getResources().getString(R.string.griver_core_error_page_site_error_sub) : GriverEnv.getResources().getString(R.string.griver_core_error_page_site_error);
            } else if (z) {
                return "Please refresh later";
            } else {
                return "Failed to open this page";
            }
        } else if (GriverEnv.getResources() == null) {
            return z ? "Please refresh later" : "Unknown Error";
        } else {
            if (z) {
                string = GriverEnv.getResources().getString(R.string.griver_core_error_page_unknown_error_sub);
            } else {
                string = GriverEnv.getResources().getString(R.string.griver_core_error_page_unknown_error);
            }
        }
        return string;
    }
}
