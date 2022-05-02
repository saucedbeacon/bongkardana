package o;

import android.content.Context;
import com.alipay.mobile.verifyidentity.base.OnClickUrl;
import id.dana.danah5.DanaH5;

final class getCommonDatas implements OnClickUrl {
    public static final getCommonDatas setMin = new getCommonDatas();

    public final void onClickHttpUrl(Context context, String str) {
        DanaH5.startContainerFullUrl(str);
    }
}
