package o;

import android.text.SpannableStringBuilder;

public final class getBLEDeviceServices extends SpannableStringBuilder {
    public String getMax;
    public String getMin;
    public String length;
    public String setMax;

    public getBLEDeviceServices(String str, String str2, String str3, String str4) {
        this.setMax = str;
        this.length = str2;
        this.getMin = str3;
        this.getMax = str4;
    }
}
