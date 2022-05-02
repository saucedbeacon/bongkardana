package o;

import id.dana.di.modules.MerchantLatestReviewModule;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantLatestReviewView;
import o.H5PromptDialog;
import o.PrepareException;
import o.SubPackageBridgeExtension;
import o.b;
import o.getMsg;

public final class onGetData implements SubPackageBridgeExtension.AnonymousClass2 {
    private b.C0007b<getMsg.length> equals;
    private b.C0007b<getDownloadFile> getMax;
    private b.C0007b<H5PromptDialog.AnonymousClass1> getMin;
    private b.C0007b<getMsg.getMax> length;
    private b.C0007b<getCommonResources> setMax;
    private b.C0007b<setStorageProxy> setMin;

    public /* synthetic */ onGetData(MerchantLatestReviewModule merchantLatestReviewModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(merchantLatestReviewModule, r2);
    }

    private onGetData(MerchantLatestReviewModule merchantLatestReviewModule, PrepareException.AnonymousClass1 r3) {
        this.length = isScrap.getMin(isKotlin.getMax(merchantLatestReviewModule));
        this.setMin = new getMin(r3);
        setMin setmin = new setMin(r3);
        this.setMax = setmin;
        isInstalled create = isInstalled.create(this.setMin, setmin);
        this.getMax = create;
        getDialogBg length2 = getDialogBg.length(this.length, create);
        this.getMin = length2;
        this.equals = isScrap.getMin(castToString.getMin(merchantLatestReviewModule, length2));
    }

    public static final class setMax {
        public MerchantLatestReviewModule getMax;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class getMin implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.getMin.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.getMax.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(MerchantLatestReviewView merchantLatestReviewView) {
        getEnsureBtn.getMin(merchantLatestReviewView, this.equals.get());
    }
}
