package o;

import id.dana.di.modules.UserBankModule;
import id.dana.di.modules.UserBankQrModule;
import o.GriverCaptureActivity;
import o.ImageServiceImpl;
import o.b;
import o.publishImageAction;

public final class GriverAuthGuideContentExtension implements getAdapterPosition<GriverCaptureActivity.length> {
    private final UserBankQrModule getMin;
    private final b.C0007b<ImageServiceImpl.AnonymousClass2> setMax;

    public final class AuthGuideContent implements getAdapterPosition<publishImageAction.length> {
        private final UserBankModule setMin;

        public static publishImageAction.length setMin(UserBankModule userBankModule) {
            publishImageAction.length length = userBankModule.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            publishImageAction.length length = this.setMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static GriverCaptureActivity.length setMin(UserBankQrModule userBankQrModule, ImageServiceImpl.AnonymousClass2 r1) {
        GriverCaptureActivity.length max = userBankQrModule.getMax(r1);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverCaptureActivity.length max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
