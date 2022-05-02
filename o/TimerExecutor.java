package o;

import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.SwitchFaceAuthenticationModule;
import id.dana.richview.profile.switchfaceauth.SwitchFaceAuthenticationView;
import o.GriverSplashFragmentExtension;
import o.MediaInfo;
import o.PrepareException;
import o.b;
import o.replaceLayoutParam;

public final class TimerExecutor implements JSONStreamAware {
    private b.C0007b<adptApPadding> IsOverlapping;
    private b.C0007b<getCommonResources> equals;
    private b.C0007b<getScheme> getMax;
    private b.C0007b<GriverShareSchemeExtension> getMin;
    private b.C0007b<GriverCreateDialogParam> isInside;
    private b.C0007b<GriverSplashFragmentExtension> length;
    private b.C0007b<replaceLayoutParam.length> setMax;
    private b.C0007b<appxLoadFailed> setMin;
    private b.C0007b<Embedded> toIntRange;

    public /* synthetic */ TimerExecutor(SwitchFaceAuthenticationModule switchFaceAuthenticationModule, AuthenticationModule authenticationModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(switchFaceAuthenticationModule, authenticationModule, r3);
    }

    private TimerExecutor(SwitchFaceAuthenticationModule switchFaceAuthenticationModule, AuthenticationModule authenticationModule, PrepareException.AnonymousClass1 r4) {
        this.setMax = GriverChooseFileExtension.setMin(switchFaceAuthenticationModule);
        length length2 = new length(r4);
        this.length = length2;
        this.getMin = GriverSplashFragmentExtension.AbstractSplashFragment.create(length2);
        this.setMin = new setMax(r4);
        this.getMax = new setMin(r4);
        getMax getmax = new getMax(r4);
        this.equals = getmax;
        this.isInside = GVLoadingView.create(this.setMin, this.getMax, getmax);
        b.C0007b<Embedded> min = isScrap.getMin(CollectionCodec.getMax(authenticationModule));
        this.toIntRange = min;
        this.IsOverlapping = isScrap.getMin(getApFromAttrsStr.setMin(this.setMax, this.getMin, this.isInside, min));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMin;
        public SwitchFaceAuthenticationModule length;
        public AuthenticationModule setMax;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class length implements b.C0007b<GriverSplashFragmentExtension> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverSplashFragmentExtension MediaDescriptionCompat = this.length.MediaDescriptionCompat();
            if (MediaDescriptionCompat != null) {
                return MediaDescriptionCompat;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length2 = this.length.length();
            if (length2 != null) {
                return length2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.setMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.setMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
        MediaInfo.Bounds.getMax(switchFaceAuthenticationView, this.IsOverlapping.get());
    }
}
