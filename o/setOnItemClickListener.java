package o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.ap.zoloz.hummer.api.EkycFacade;

public class setOnItemClickListener {
    private static setOnItemClickListener setMax;

    private setOnItemClickListener() {
    }

    public static setOnItemClickListener length() {
        if (setMax == null) {
            synchronized (setOnItemClickListener.class) {
                if (setMax == null) {
                    setMax = new setOnItemClickListener();
                }
            }
        }
        return setMax;
    }

    public static void getMin(@NonNull Context context, @NonNull String str) {
        EkycFacade.init(context);
        ApSecurityService.setStaticApDidToken(str);
    }
}
