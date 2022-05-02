package com.ta.audid.f;

import android.text.TextUtils;
import com.ta.audid.g.e;
import com.ta.audid.g.m;
import id.dana.data.constant.BranchLinkConstant;

public class b {
    public byte[] data = null;
    public String h = "";
    public int httpResponseCode = -1;
    public long rt = 0;
    public long timestamp = 0;

    public static boolean a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                m.a("", "result", str, BranchLinkConstant.OauthParams.SIGNATURE, str2);
                if (str2.equals(com.ta.utdid2.a.a.b.encodeToString(e.h(str).getBytes(), 2))) {
                    m.d("", "signature is ok");
                    return true;
                }
                m.d("", "signature is error");
            }
        } catch (Exception e) {
            m.d("", e);
        }
        return false;
    }
}
