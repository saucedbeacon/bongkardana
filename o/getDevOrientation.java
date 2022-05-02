package o;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import id.dana.model.ThirdPartyService;
import id.dana.richview.CurrencyTextView;
import java.util.Locale;
import o.CornerMarkingDataProvider;
import o.LandScapeTinyMenuPopupWindow;

public abstract class getDevOrientation extends Ignore<ThirdPartyService> {
    final doDismissWithAnimation setMin = new LandScapeTinyMenuPopupWindow.AnonymousClass1();

    public getDevOrientation(Context context, int i, ViewGroup viewGroup) {
        super(context, i, viewGroup);
    }

    /* access modifiers changed from: protected */
    public final String getMax(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.replaceAll(" ", "_").toLowerCase();
        if (this.length == null || TextUtils.isEmpty(lowerCase)) {
            i = 0;
        } else {
            i = this.length.getResources().getIdentifier(lowerCase, "string", this.length.getPackageName());
        }
        return i > 0 ? this.length.getString(i) : str;
    }

    /* access modifiers changed from: protected */
    public final String setMin(ThirdPartyService thirdPartyService) {
        String str;
        if (!Locale.getDefault().getLanguage().equals(new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE).getLanguage()) || thirdPartyService.equals == null) {
            str = CornerMarkingDataProvider.AnonymousClass3.setMin(this.length, thirdPartyService.isInside, thirdPartyService.isInside);
        } else {
            str = thirdPartyService.equals;
        }
        return getMax(str);
    }

    /* access modifiers changed from: protected */
    @DrawableRes
    public final int setMax(String str) {
        StringBuilder sb = new StringBuilder("icon_");
        sb.append(str.replaceAll(" ", "_").toLowerCase());
        String obj = sb.toString();
        if (TextUtils.isEmpty(obj)) {
            return 0;
        }
        return this.length.getResources().getIdentifier(obj, "drawable", this.length.getPackageName());
    }
}
