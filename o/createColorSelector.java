package o;

import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class createColorSelector extends setMinProgress implements enableBackButton {
    private final assertOneSet authEntityDataFactory;
    private final getWidthAndHeight mapper;

    /* renamed from: o.createColorSelector$default  reason: invalid class name */
    public final class Cdefault implements getAdapterPosition<getWidthAndHeight> {

        /* renamed from: o.createColorSelector$default$length */
        static final class length {
            /* access modifiers changed from: private */
            public static final Cdefault getMax = new Cdefault();
        }

        public final getWidthAndHeight get() {
            return newInstance();
        }

        public static Cdefault create() {
            return length.getMax;
        }

        public static getWidthAndHeight newInstance() {
            return new getWidthAndHeight();
        }
    }

    @Inject
    public createColorSelector(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, assertOneSet assertoneset, getWidthAndHeight getwidthandheight, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.authEntityDataFactory = assertoneset;
        this.mapper = getwidthandheight;
    }

    private updatePadding createAuthData() {
        return this.authEntityDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> getAuthCode(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2) {
        TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> authenticatedRequest = authenticatedRequest(createAuthData().getAuthCode(str, str2, str3, z, str4, str5, z2));
        getWidthAndHeight getwidthandheight = this.mapper;
        Objects.requireNonNull(getwidthandheight);
        return authenticatedRequest.map(new waitForHeight(getwidthandheight));
    }
}
