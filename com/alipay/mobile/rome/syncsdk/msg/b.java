package com.alipay.mobile.rome.syncsdk.msg;

import android.content.Context;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import o.getTabbarModel;

public class b extends a {
    private static final String b = b.class.getSimpleName();

    public b(Context context) {
        super(context);
    }

    public final void a(String str) {
        this.f9411a = str;
    }

    private String[] b() {
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(this.f9411a);
        String obj = sb.toString();
        c.a(b, "getMsgList() perMsgName=".concat(String.valueOf(obj)));
        File file = new File(obj);
        String[] strArr = null;
        if (!file.exists() || file.length() <= 0) {
            c.a(b, "getMsgList() perMsgName isn't find!");
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str = new String(bArr, getTabbarModel.ENC);
                c.a(b, "getMsgList() listMsgId:".concat(str));
                if (str.trim().length() > 0) {
                    String[] a2 = g.a(str);
                    try {
                        Arrays.sort(a2);
                        strArr = a2;
                    } catch (Exception e) {
                        e = e;
                        strArr = a2;
                        c.d(b, "getMsgList() perMsgName isn't find! e=".concat(String.valueOf(e)));
                        return strArr;
                    }
                }
                fileInputStream.close();
            } catch (Exception e2) {
                e = e2;
            }
        }
        return strArr;
    }

    public final boolean a(MsgInfo msgInfo) {
        String str = b;
        StringBuilder sb = new StringBuilder("isContainMsg() newPerMsgId=");
        sb.append(msgInfo.getPerMsgId());
        c.a(str, sb.toString());
        String[] b2 = b();
        if (b2 != null) {
            return g.a(b2, msgInfo.getPerMsgId());
        }
        return false;
    }

    private String[] b(String str) {
        String[] b2 = b();
        if (b2 == null || b2.length <= 0) {
            b2 = new String[]{str};
        } else if (b2.length >= 50) {
            b2[0] = str;
        } else {
            if (b2 == null) {
                b2 = new String[0];
            }
            int i = str == null ? 0 : 1;
            int length = b2.length;
            String[] strArr = new String[(length + i)];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = b2[i2];
            }
            if (i == 1) {
                strArr[length] = str;
            }
            b2 = strArr;
        }
        c.a(b, "updatePerMsgList() perMsgId=".concat(String.valueOf(str)));
        return b2;
    }

    public final void b(MsgInfo msgInfo) {
        String perMsgId = msgInfo.getPerMsgId();
        c.a(b, "saveMsgRecord() perMsgId=".concat(String.valueOf(perMsgId)));
        if (perMsgId == null || perMsgId.length() <= 0) {
            c.c(b, "saveMsgRecord() perMsgId is invalid!");
            return;
        }
        String a2 = g.a(b(perMsgId));
        c.a(b, "saveMsgRecord() listMsgId:".concat(String.valueOf(a2)));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            sb.append(this.f9411a);
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(a2.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
            c.a(b, "saveMsgRecord() encounter exception!");
        }
    }
}
