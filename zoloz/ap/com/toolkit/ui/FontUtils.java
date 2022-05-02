package zoloz.ap.com.toolkit.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.griver.ui.ant.utils.IconfontConstants;
import o.OptIn;

public class FontUtils {
    public static boolean setFont(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(IconfontConstants.ICONFONT_FILE_SUFFIX)) {
            try {
                Typeface createFromAsset = Typeface.createFromAsset(textView.getContext().getAssets(), str);
                if (createFromAsset != null) {
                    textView.setTypeface(createFromAsset, 0);
                }
            } catch (Exception unused) {
            }
            return true;
        }
        int identifier = textView.getResources().getIdentifier(str, "font", textView.getContext().getPackageName());
        if (identifier == 0) {
            return false;
        }
        textView.setTypeface(OptIn.length(textView.getContext(), identifier), 0);
        return true;
    }
}
