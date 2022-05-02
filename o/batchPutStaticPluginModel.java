package o;

import android.content.Context;
import id.dana.di.modules.MerchantDetailActionInfoModule;
import id.dana.nearbyrevamp.view.MerchantActionListView;
import o.PrepareException;
import o.SettingMenu;
import o.ShareMenu;
import o.b;
import o.d;

public final class batchPutStaticPluginModel implements isDegrade {
    private b.C0007b<t> getMax;
    private b.C0007b<Context> getMin;
    private b.C0007b<ShareMenu.AnonymousClass1> length;
    private b.C0007b<ShareMenu> setMax;
    private b.C0007b<s> setMin;

    public /* synthetic */ batchPutStaticPluginModel(MerchantDetailActionInfoModule merchantDetailActionInfoModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(merchantDetailActionInfoModule, r2);
    }

    private batchPutStaticPluginModel(MerchantDetailActionInfoModule merchantDetailActionInfoModule, PrepareException.AnonymousClass1 r3) {
        length length2 = new length(r3);
        this.getMin = length2;
        SettingMenu.AnonymousClass1.AnonymousClass1 min = SettingMenu.AnonymousClass1.AnonymousClass1.setMin(length2);
        this.setMax = min;
        this.length = isScrap.getMin(getAnnotation.getMax(merchantDetailActionInfoModule, min));
        d.AnonymousClass3.AnonymousClass1 length3 = d.AnonymousClass3.AnonymousClass1.length(this.getMin);
        this.setMin = length3;
        this.getMax = isScrap.getMin(FieldInfo.length(merchantDetailActionInfoModule, length3));
    }

    public static final class setMax {
        public MerchantDetailActionInfoModule getMax;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(MerchantActionListView merchantActionListView) {
        AddPhoneContactTrigger.setMax(merchantActionListView, this.length.get());
        AddPhoneContactTrigger.getMin(merchantActionListView, this.getMax.get());
    }
}
