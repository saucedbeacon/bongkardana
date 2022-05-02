package o;

import android.content.Context;
import id.dana.data.base.UnInitializedSecuredPreferencesException;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.BaseManifest;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;

@Singleton
public class CreatePageCallback extends setRepeatCount<setupProxy> implements BaseManifest.AnonymousClass1 {
    private final getFrameMarginVerticalLess$core accountPreferences;

    @Inject
    public CreatePageCallback(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, getFrameMarginVerticalLess$core getframemarginverticalless_core) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        this.accountPreferences = getframemarginverticalless_core;
    }

    public Class<setupProxy> getFacadeClass() {
        return setupProxy.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<setProjectManifest> changePayMethod(String str, String str2, String str3) {
        registerExtensionsForFinalExecute registerextensionsforfinalexecute = new registerExtensionsForFinalExecute();
        registerextensionsforfinalexecute.envInfo = generateMobileEnvInfo();
        registerextensionsforfinalexecute.payMethod = str;
        registerextensionsforfinalexecute.payOption = str2;
        registerextensionsforfinalexecute.cardIndexNo = str3;
        return wrapper(new addAnimatorUpdateListener.getMax(registerextensionsforfinalexecute) {
            private final registerExtensionsForFinalExecute setMin;

            {
                this.setMin = r1;
            }

            public final Object processFacade(Object obj) {
                return ((setupProxy) obj).changePayMethod(this.setMin);
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<RVMain> queryPayMethod(String str, String str2) {
        getProjectManifest getprojectmanifest = new getProjectManifest();
        getprojectmanifest.envInfo = generateMobileEnvInfo();
        getprojectmanifest.tid = str;
        getprojectmanifest.scene = str2;
        return wrapper(new addAnimatorUpdateListener.getMax(getprojectmanifest) {
            private final getProjectManifest length;

            {
                this.length = r1;
            }

            public final Object processFacade(Object obj) {
                return ((setupProxy) obj).queryPayMethod(this.length);
            }
        }).doOnNext(new RedDotManager(this, str2) {
            private final CreatePageCallback length;
            private final String setMax;

            {
                this.length = r1;
                this.setMax = r2;
            }

            public final void accept(Object obj) {
                this.length.lambda$queryPayMethod$2(this.setMax, (RVMain) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: saveQueryPayResult */
    public void lambda$queryPayMethod$2(String str, RVMain rVMain) throws UnInitializedSecuredPreferencesException {
        if (str == null) {
            this.accountPreferences.savePayMethodResult(rVMain);
        } else {
            this.accountPreferences.saveAssetCardResult(rVMain);
        }
    }
}
