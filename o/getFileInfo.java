package o;

import android.text.TextUtils;
import o.WheelView;

public final class getFileInfo {
    private final int getMax;
    private final WheelView.ScrollerTask.AnonymousClass1 getMin = new Object() {
        public static boolean length(String str) {
            try {
                double parseDouble = Double.parseDouble(str);
                if (str.isEmpty() || parseDouble < 0.0d) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                updateActionSheetContent.e("Luhn Algorithm", e.getMessage(), e);
                return true;
            }
        }

        public static int getMax(String str) {
            boolean z = true;
            int i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                int parseInt = Integer.parseInt(str.substring(length, length + 1));
                if (z && (parseInt = parseInt * 2) > 9) {
                    parseInt -= 9;
                }
                i += parseInt;
                z = !z;
            }
            return i;
        }
    };
    final String length;
    final String setMax;
    final String setMin;

    public getFileInfo(String str, String str2, int i, String str3) {
        String str4;
        String str5;
        if (!TextUtils.isEmpty(str) && !str.equals("https://m.dana.id")) {
            str = getSavedFileInfo.setMax(str);
        }
        this.length = str;
        this.setMin = getSavedFileInfo.setMax(str2);
        this.getMax = i;
        if (TextUtils.isEmpty(str3)) {
            StringBuilder sb = new StringBuilder("93600915");
            sb.append(this.getMax);
            sb.append("1234567897");
            str4 = sb.toString();
        } else {
            String substring = str3.substring(8);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3.substring(0, 8));
            sb2.append(this.getMax);
            String substring2 = substring.length() > 4 ? substring.substring(substring.length() - 4) : substring;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(substring);
            if (WheelView.ScrollerTask.AnonymousClass1.length(substring2)) {
                str5 = "";
            } else {
                String valueOf = String.valueOf(WheelView.ScrollerTask.AnonymousClass1.getMax(substring2));
                int parseInt = Integer.parseInt(valueOf.substring(valueOf.length() - 1));
                if (parseInt == 0) {
                    str5 = "0";
                } else {
                    str5 = String.valueOf(10 - parseInt);
                }
            }
            sb3.append(str5);
            sb2.append(sb3.toString());
            str4 = sb2.toString();
        }
        this.setMax = str4;
    }
}
