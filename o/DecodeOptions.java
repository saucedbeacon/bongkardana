package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.scanner.ScannerFragment;
import o.BindView;
import o.GriverManifest;
import o.PdfImageSource;
import o.R;
import o.callback;
import o.getDuration;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.onNext;

public final class DecodeOptions implements getBindingAdapter<ScannerFragment> {

    public final class FitRectMode implements runAnimators {
        private final ScannerFragment setMax;

        public FitRectMode(ScannerFragment scannerFragment) {
            this.setMax = scannerFragment;
        }

        public final void getMax(String str) {
            ScannerFragment.isInside(this.setMax, str);
        }
    }

    public final class MaxLenMode implements Runnable {
        private final ScannerFragment length;

        public MaxLenMode(ScannerFragment scannerFragment) {
            this.length = scannerFragment;
        }

        public final void run() {
            ScannerFragment.invokeSuspend(this.length);
        }
    }

    public final class MinLenMode implements GriverManifest.AnonymousClass22.length {
        private final ScannerFragment getMax;

        public MinLenMode(ScannerFragment scannerFragment) {
            this.getMax = scannerFragment;
        }

        public final void setMin(boolean z) {
            this.getMax.isInside = z;
        }
    }

    public final class Mode implements removeStateDidChangeHandler {
        private final ScannerFragment setMax;

        public Mode(ScannerFragment scannerFragment) {
            this.setMax = scannerFragment;
        }

        public final void getMax() {
            ScannerFragment.invokeSuspend(this.setMax);
        }
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.decodePresenter")
    public static void getMax(ScannerFragment scannerFragment, callback.setMax setmax) {
        scannerFragment.decodePresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.h5EventPresenter")
    public static void getMax(ScannerFragment scannerFragment, GriverManifest.AnonymousClass22.getMin getmin) {
        scannerFragment.h5EventPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.playStoreReviewPresenter")
    public static void getMin(ScannerFragment scannerFragment, PdfImageSource.setMin setmin) {
        scannerFragment.playStoreReviewPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.presenter")
    public static void length(ScannerFragment scannerFragment, R.id.getMax getmax) {
        scannerFragment.presenter = getmax;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.globalNetworkPresenter")
    public static void getMax(ScannerFragment scannerFragment, onNext.setMin setmin) {
        scannerFragment.globalNetworkPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.readDeepLinkPropertiesPresenter")
    public static void setMax(ScannerFragment scannerFragment, getDuration.length length) {
        scannerFragment.readDeepLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.restoreUrlPresenter")
    public static void setMin(ScannerFragment scannerFragment, BindView.setMin setmin) {
        scannerFragment.restoreUrlPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.featurePresenter")
    public static void length(ScannerFragment scannerFragment, getRunningAnimators.setMax setmax) {
        scannerFragment.featurePresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.scanQrPresenter")
    public static void setMax(ScannerFragment scannerFragment, R.id.getMax getmax) {
        scannerFragment.scanQrPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.timerUtil")
    public static void getMin(ScannerFragment scannerFragment, setH5Page seth5page) {
        scannerFragment.timerUtil = seth5page;
    }

    @InjectedFieldSignature("id.dana.scanner.ScannerFragment.bottomSheetOnBoardingPresenter")
    public static void setMin(ScannerFragment scannerFragment, getSelectedIndex.length length) {
        scannerFragment.bottomSheetOnBoardingPresenter = length;
    }
}
