package o;

import com.alibaba.griver.bluetooth.ble.ErrorConstants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import id.co.bri.sdk.exception.BrizziException;
import java.util.Formatter;

public final class setScrapContainer {
    public static BrizziException getMax(String str) {
        return str.compareTo("03") == 0 ? new BrizziException("03", "Card read failed") : str.compareTo("04") == 0 ? new BrizziException("04", "Zero Balance") : str.compareTo("05") == 0 ? new BrizziException("05", "Failed over top up") : str.compareTo("06") == 0 ? new BrizziException("06", "Inactive card") : str.compareTo("07") == 0 ? new BrizziException("07", "Closed card") : str.compareTo("08") == 0 ? new BrizziException("08", "Expired card") : str.compareTo("09") == 0 ? new BrizziException("09", "Card not found") : str.compareTo("17") == 0 ? new BrizziException("17", "Username not set") : str.compareTo("14") == 0 ? new BrizziException("14", "Reff Number not set") : str.compareTo(ErrorConstants.ERROR_CODE_15) == 0 ? new BrizziException(ErrorConstants.ERROR_CODE_15, "Account not set") : str.compareTo("16") == 0 ? new BrizziException("16", "Amount not set") : str.compareTo("12") == 0 ? new BrizziException("12", "KeySAM not set") : str.compareTo("13") == 0 ? new BrizziException("13", "Random not set") : str.compareTo("21") == 0 ? new BrizziException("21", "Can't Read Card's Specs") : str.compareTo("61") == 0 ? new BrizziException("61", "Token expired") : str.compareTo("62") == 0 ? new BrizziException("62", "Invalid key") : str.compareTo("63") == 0 ? new BrizziException("63", "Invalid token or secret") : str.compareTo(MonitorUtil.ERROR_CODE_EMPTY) == 0 ? new BrizziException(MonitorUtil.ERROR_CODE_EMPTY, "Card Error and reversal error, please try reversal with reversal API") : str.compareTo("18") == 0 ? new BrizziException("18", "Card Error and reversal success") : str.compareTo(TabBarItemColorModel.LIMIT) == 0 ? new BrizziException(TabBarItemColorModel.LIMIT, "Reversal data empty") : (str.compareTo("93") == 0 || str.compareTo("98") == 0) ? new BrizziException("98", "Invalid Response") : (str.compareTo("91") == 0 || str.compareTo("92") == 0 || str.compareTo("90") == 0) ? new BrizziException("90", "Connection Timeout") : new BrizziException("03", "Card read failed");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMax(java.io.InputStream r5) {
        /*
            java.lang.String r0 = "03"
            java.lang.String r1 = "MD5"
            r2 = 0
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0056 }
            if (r5 != 0) goto L_0x000c
            return r2
        L_0x000c:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]
        L_0x0010:
            int r3 = r5.read(r2)     // Catch:{ IOException -> 0x0048 }
            r4 = 0
            if (r3 <= 0) goto L_0x001b
            r1.update(r2, r4, r3)     // Catch:{ IOException -> 0x0048 }
            goto L_0x0010
        L_0x001b:
            byte[] r1 = r1.digest()     // Catch:{ IOException -> 0x0048 }
            java.math.BigInteger r2 = new java.math.BigInteger     // Catch:{ IOException -> 0x0048 }
            r3 = 1
            r2.<init>(r3, r1)     // Catch:{ IOException -> 0x0048 }
            r1 = 16
            java.lang.String r1 = r2.toString(r1)     // Catch:{ IOException -> 0x0048 }
            java.lang.String r2 = "%32s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0048 }
            r3[r4] = r1     // Catch:{ IOException -> 0x0048 }
            java.lang.String r1 = java.lang.String.format(r2, r3)     // Catch:{ IOException -> 0x0048 }
            r2 = 32
            r3 = 48
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ IOException -> 0x0048 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            return r1
        L_0x0041:
            id.co.bri.sdk.exception.BrizziException r5 = getMax((java.lang.String) r0)
            throw r5
        L_0x0046:
            r1 = move-exception
            goto L_0x004d
        L_0x0048:
            id.co.bri.sdk.exception.BrizziException r1 = getMax((java.lang.String) r0)     // Catch:{ all -> 0x0046 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x004d:
            r5.close()     // Catch:{ IOException -> 0x0051 }
            throw r1
        L_0x0051:
            id.co.bri.sdk.exception.BrizziException r5 = getMax((java.lang.String) r0)
            throw r5
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setScrapContainer.getMax(java.io.InputStream):java.lang.String");
    }

    static String setMax(byte[] bArr) {
        StringBuilder sb = new StringBuilder(2);
        Formatter formatter = new Formatter(sb);
        for (int i = 0; i <= 0; i++) {
            formatter.format("%02X", new Object[]{Byte.valueOf(bArr[0])});
        }
        return sb.toString();
    }
}
