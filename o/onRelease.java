package o;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient;
import id.dana.data.foundation.logger.rds.RDSConstant;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class onRelease {
    private static Context context;
    private static RDSClient rdsClient;

    @Inject
    public onRelease(Context context2) {
        context = context2;
        rdsClient = new RDSClient();
    }

    public String onPageEndAndZip(String str) {
        try {
            return rdsClient.onPageEndAndZip(context, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void track(o.onAgreementClick r14) {
        /*
            java.lang.String r0 = r14.getAction()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1832046799: goto L_0x0039;
                case -728703201: goto L_0x002f;
                case -401273308: goto L_0x0025;
                case 1027841476: goto L_0x001b;
                case 2094732302: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0043
        L_0x0011:
            java.lang.String r1 = "rds_on_touch_screen"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 4
            goto L_0x0044
        L_0x001b:
            java.lang.String r1 = "rds_on_control_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "rds_on_key_down"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 2
            goto L_0x0044
        L_0x002f:
            java.lang.String r1 = "rds_on_lost_focus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 3
            goto L_0x0044
        L_0x0039:
            java.lang.String r1 = "rds_on_page"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = -1
        L_0x0044:
            if (r0 == 0) goto L_0x0097
            if (r0 == r6) goto L_0x0089
            if (r0 == r5) goto L_0x0077
            if (r0 == r4) goto L_0x0065
            if (r0 == r3) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient r7 = rdsClient
            java.lang.String r8 = r14.getPageName()
            java.lang.String r9 = r14.getControlName()
            double r10 = r14.getTouchX()
            double r12 = r14.getTouchY()
            r7.onTouchScreen(r8, r9, r10, r12)
        L_0x0064:
            return
        L_0x0065:
            com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient r0 = rdsClient
            java.lang.String r1 = r14.getPageName()
            java.lang.String r2 = r14.getControlName()
            boolean r14 = r14.isFocus()
            r0.onLostFocus(r1, r2, r14)
            return
        L_0x0077:
            com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient r0 = rdsClient
            java.lang.String r1 = r14.getPageName()
            java.lang.String r2 = r14.getControlName()
            java.lang.String r14 = r14.getText()
            r0.onKeyDown(r1, r2, r14)
            return
        L_0x0089:
            com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient r0 = rdsClient
            java.lang.String r1 = r14.getPageName()
            java.lang.String r14 = r14.getControlName()
            r0.onControlClick(r1, r14)
            return
        L_0x0097:
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            onPage(r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRelease.track(o.onAgreementClick):void");
    }

    private static void onPage(Map<String, String> map, boolean z) {
        String str;
        String str2;
        try {
            str2 = context.getPackageName();
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str2 = "";
            str = "";
            map.put("page", "Onboarding");
            map.put("appname", str2);
            map.put("appver", str);
            map.put("user", "");
            map.put(RDSConstant.KEY_PAGE_SRC, "");
            map.put(RDSConstant.KEY_PRE_PAGE, "");
            map.put("appkey", RDSConstant.APP_KEY);
            map.put(RDSConstant.KEY_PB_SWITCH, RDSConstant.PB_SWITCH);
            rdsClient.onPage(context, map, z);
        }
        map.put("page", "Onboarding");
        map.put("appname", str2);
        map.put("appver", str);
        map.put("user", "");
        map.put(RDSConstant.KEY_PAGE_SRC, "");
        map.put(RDSConstant.KEY_PRE_PAGE, "");
        map.put("appkey", RDSConstant.APP_KEY);
        map.put(RDSConstant.KEY_PB_SWITCH, RDSConstant.PB_SWITCH);
        rdsClient.onPage(context, map, z);
    }
}
