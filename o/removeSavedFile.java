package o;

import android.text.TextUtils;
import android.util.Base64;

public final class removeSavedFile {
    private final String length;
    private final getFileInfo setMax;

    public removeSavedFile(getFileInfo getfileinfo) {
        String str;
        this.setMax = getfileinfo;
        StringBuilder sb = new StringBuilder("4F07A000000602202050077172697363706d");
        String str2 = this.setMax.setMax;
        if (str2.length() % 2 != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("F");
            str2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("5A");
        sb3.append(String.format("%02X", new Object[]{Integer.valueOf(str2.length() / 2)}));
        sb3.append(str2);
        sb.append(sb3.toString());
        if (setMax()) {
            str = "";
        } else {
            StringBuilder sb4 = new StringBuilder("5F20");
            sb4.append(String.format("%02X", new Object[]{Integer.valueOf(this.setMax.setMin.length() / 2)}));
            sb4.append(this.setMax.setMin);
            str = sb4.toString();
        }
        sb.append(str);
        sb.append("5F2D0269645F500744414e412e4944");
        StringBuilder sb5 = new StringBuilder("9F74");
        sb5.append(String.format("%02X", new Object[]{Integer.valueOf(this.setMax.length.length() / 2)}));
        sb5.append(this.setMax.length);
        String obj = sb5.toString();
        StringBuilder sb6 = new StringBuilder("63");
        sb6.append(String.format("%02X", new Object[]{Integer.valueOf(obj.length() / 2)}));
        sb6.append(obj);
        sb.append(sb6.toString());
        String obj2 = sb.toString();
        StringBuilder sb7 = new StringBuilder("8505435056303161");
        sb7.append(String.format("%02X", new Object[]{Integer.valueOf(obj2.length() / 2)}));
        sb7.append(obj2);
        this.length = sb7.toString();
    }

    private boolean setMax() {
        return TextUtils.isEmpty(this.setMax.setMin);
    }

    public final String getMax() {
        try {
            if (!length()) {
                if (!setMin()) {
                    return Base64.encodeToString(getSavedFileInfo.length(this.length), 2);
                }
            }
            return this.setMax.length;
        } catch (Exception e) {
            updateActionSheetContent.e("Error get QRIS Code BASE64 %s", e.getMessage());
            return "";
        }
    }

    private boolean setMin() {
        return this.setMax.length.equals("https://m.dana.id");
    }

    private boolean length() {
        return TextUtils.isEmpty(this.setMax.length);
    }
}
