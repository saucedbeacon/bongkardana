package o;

import id.dana.di.modules.SplitBillHistoryModule;
import id.dana.splitbill.view.SplitBillHistoryView;
import o.AUNoticeDialog;
import o.PrepareException;

public final class interceptOnError implements readObject {
    private final PrepareException.AnonymousClass1 getMin;
    private final SplitBillHistoryModule length;

    public /* synthetic */ interceptOnError(SplitBillHistoryModule splitBillHistoryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(splitBillHistoryModule, r2);
    }

    private interceptOnError(SplitBillHistoryModule splitBillHistoryModule, PrepareException.AnonymousClass1 r2) {
        this.length = splitBillHistoryModule;
        this.getMin = r2;
    }

    public static setMax setMin() {
        return new setMax((byte) 0);
    }

    public static final class setMax {
        public SplitBillHistoryModule setMax;
        public PrepareException.AnonymousClass1 setMin;

        /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    public final void getMin(SplitBillHistoryView splitBillHistoryView) {
        SplitBillHistoryModule splitBillHistoryModule = this.length;
        AUNoticeDialog.AnonymousClass1.getMax min = GriverEncryptProxy.getMin(this.length);
        appxLoadFailed length2 = this.getMin.length();
        if (length2 != null) {
            appxLoadFailed appxloadfailed = length2;
            getScheme min2 = this.getMin.getMin();
            if (min2 != null) {
                getScheme getscheme = min2;
                getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.getMin.ITrustedWebActivityService$Default();
                if (ITrustedWebActivityService$Default != null) {
                    dumpBackgroundScanResultQueue dumpbackgroundscanresultqueue = new dumpBackgroundScanResultQueue(appxloadfailed, getscheme, ITrustedWebActivityService$Default);
                    appxLoadFailed length3 = this.getMin.length();
                    if (length3 != null) {
                        appxLoadFailed appxloadfailed2 = length3;
                        getScheme min3 = this.getMin.getMin();
                        if (min3 != null) {
                            getScheme getscheme2 = min3;
                            getCommonResources Grayscale$Algorithm = this.getMin.Grayscale$Algorithm();
                            if (Grayscale$Algorithm != null) {
                                getTTFFilePath.setMin(splitBillHistoryView, decrypt.getMin(splitBillHistoryModule, new AUNoticeDialog.OnClickPositiveListener(min, dumpbackgroundscanresultqueue, new AppStatus(appxloadfailed2, getscheme2, Grayscale$Algorithm))));
                                getTTFFilePath.getMin(splitBillHistoryView, new IconfontInfo());
                                return;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
