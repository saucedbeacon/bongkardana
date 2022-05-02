package o;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import id.dana.nearbyme.MerchantViewType;
import java.util.LinkedHashMap;
import java.util.List;
import o.IMultiInstanceInvalidationService;

final class g implements RedDotDrawable {
    private final List getMin;
    private final notNeedInitUc setMin;

    public g(notNeedInitUc notneedinituc, List list) {
        this.setMin = notneedinituc;
        this.getMin = list;
    }

    public final Object apply(Object obj) {
        return new waitIpcIfNeed(this.setMin, this.getMin).getSettings((LinkedHashMap) obj);
    }

    /* renamed from: o.g$1  reason: invalid class name */
    public class AnonymousClass1 extends IMultiInstanceInvalidationService.Stub {
        public static final AnonymousClass1 setMin = new AnonymousClass1(MerchantViewType.MERCHANT_CAT_ALL, "All");
        public String getMax;
        public String getMin;

        public AnonymousClass1() {
        }

        private AnonymousClass1(String str, String str2) {
            this.getMax = str;
            this.getMin = str2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AnonymousClass1) {
                return TextUtils.equals(this.getMax, ((AnonymousClass1) obj).getMax);
            }
            return false;
        }

        public int hashCode() {
            return this.getMax.hashCode();
        }
    }
}
