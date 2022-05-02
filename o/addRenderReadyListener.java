package o;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import io.branch.referral.Branch;
import io.branch.referral.ServerRequest;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.R;
import o.TinyBlurMenu;
import o.TinyMenuPopupWindow;
import o.TitleBarRightButtonView;
import org.json.JSONObject;

@Singleton
public class addRenderReadyListener implements setExitListener {
    private final Branch branch;
    private final getVisitUrl branchIoDeepLinkEntityMapper;
    private final Context context;

    @Inject
    public addRenderReadyListener(Context context2, Branch branch2, getVisitUrl getvisiturl) {
        this.context = context2;
        this.branch = branch2;
        this.branchIoDeepLinkEntityMapper = getvisiturl;
    }

    public TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> initSession(Activity activity) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new isUseForEmbed(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$initSession$2() throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.create(new onVisitStart(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initSession$1(TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        this.branch.getMax((Branch.getMax) new Branch.getMax(this, r3) {
            private final addRenderReadyListener getMax;
            private final TitleBarRightButtonView.AnonymousClass2 setMin;

            {
                this.getMax = r1;
                this.setMin = r2;
            }

            public final void getMax(JSONObject jSONObject, TinyBlurMenu.AnonymousClass8 r4) {
                this.getMax.lambda$initSession$0(this.setMin, jSONObject, r4);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initSession$0(TitleBarRightButtonView.AnonymousClass2 r1, JSONObject jSONObject, TinyBlurMenu.AnonymousClass8 r3) {
        if (r3 == null) {
            r1.onNext((DeepLinkPayloadEntity) this.branchIoDeepLinkEntityMapper.apply(jSONObject));
            r1.onComplete();
            return;
        }
        r1.onError(new Error(createErrorDesc(r3)));
    }

    public TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> getDeepLinkPayload() {
        return TitleBarRightButtonView.AnonymousClass1.defer(new Callable(this) {
            private final addRenderReadyListener length;

            {
                this.length = r1;
            }

            public final Object call() {
                return this.length.lambda$getDeepLinkPayload$3();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getDeepLinkPayload$3() throws Exception {
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(this.branch.getMax(Branch.setMax(startTinyAppAndCloseCurrent.setMin("bnc_session_params"))));
        getVisitUrl getvisiturl = this.branchIoDeepLinkEntityMapper;
        Objects.requireNonNull(getvisiturl);
        return just.map(new R.anim(getvisiturl));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> completeRegistration(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new setPageURI(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$completeRegistration$4(String str, String str2) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(new TinyMenuPopupWindow.TinyAppImageLoader(BRANCH_STANDARD_EVENT.COMPLETE_REGISTRATION).getMax("isUsingReferral", Boolean.toString(!TextUtils.isEmpty(str))).getMax("UserID", str2).getMax("referralCode", str).getMin(this.context)));
    }

    public TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> login(String str) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new setEmbedPage(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$login$7(String str) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.create(new afterProcess(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$login$6(String str, TitleBarRightButtonView.AnonymousClass2 r5) throws Exception {
        Branch branch2 = this.branch;
        TinyMenuPopupWindow.AnonymousClass6 r52 = new TinyMenuPopupWindow.AnonymousClass6(branch2.getMin, (Branch.getMax) new Branch.getMax(this, r5) {
            private final addRenderReadyListener getMin;
            private final TitleBarRightButtonView.AnonymousClass2 length;

            {
                this.getMin = r1;
                this.length = r2;
            }

            public final void getMax(JSONObject jSONObject, TinyBlurMenu.AnonymousClass8 r4) {
                this.getMin.lambda$login$5(this.length, jSONObject, r4);
            }
        }, str);
        if (r52.equals || r52.getMin(branch2.getMin)) {
            TinyMenuPopupWindow.AnonymousClass6 r53 = r52;
            if (r53.Grayscale$Algorithm()) {
                Branch branch3 = Branch.setMin;
                if (r53.toFloatRange != null) {
                    r53.toFloatRange.getMax(branch3.getMax(Branch.setMax(startTinyAppAndCloseCurrent.setMin("bnc_install_params"))), (TinyBlurMenu.AnonymousClass8) null);
                    return;
                }
                return;
            }
            return;
        }
        branch2.setMin((ServerRequest) r52);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$login$5(TitleBarRightButtonView.AnonymousClass2 r1, JSONObject jSONObject, TinyBlurMenu.AnonymousClass8 r3) {
        if (r3 == null) {
            r1.onNext((DeepLinkPayloadEntity) this.branchIoDeepLinkEntityMapper.apply(jSONObject));
            r1.onComplete();
            return;
        }
        r1.onError(new Error(createErrorDesc(r3)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> logout() {
        return TitleBarRightButtonView.AnonymousClass1.defer(new Callable(this) {
            private final addRenderReadyListener getMin;

            {
                this.getMin = r1;
            }

            public final Object call() {
                return this.getMin.lambda$logout$10();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$logout$10() throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.create(new TitleBarRightButtonView.AnonymousClass2.AnonymousClass1(this) {
            private final addRenderReadyListener length;

            {
                this.length = r1;
            }

            public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r2) {
                this.length.lambda$logout$9(r2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$logout$9(TitleBarRightButtonView.AnonymousClass2 r4) throws Exception {
        Branch branch2 = this.branch;
        TinyMenuPopupWindow.AnonymousClass3 r42 = new TinyMenuPopupWindow.AnonymousClass3(branch2.getMin, new Branch.equals(this, r4) {
            private final addRenderReadyListener getMax;
            private final TitleBarRightButtonView.AnonymousClass2 getMin;

            {
                this.getMax = r1;
                this.getMin = r2;
            }

            public final void setMax(boolean z, TinyBlurMenu.AnonymousClass8 r4) {
                this.getMax.lambda$logout$8(this.getMin, z, r4);
            }
        });
        if (!r42.equals && !r42.getMin(branch2.getMin)) {
            branch2.setMin((ServerRequest) r42);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$logout$8(TitleBarRightButtonView.AnonymousClass2 r1, boolean z, TinyBlurMenu.AnonymousClass8 r3) {
        if (r3 == null) {
            r1.onNext(Boolean.valueOf(z));
            r1.onComplete();
            return;
        }
        r1.onError(new Error(createErrorDesc(r3)));
    }

    private String createErrorDesc(TinyBlurMenu.AnonymousClass8 r3) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PREFIX);
        sb.append(r3.getMin);
        sb.append("-");
        sb.append(r3.setMin);
        String obj = sb.toString();
        updateActionSheetContent.i(DanaLogConstants.TAG.DEEPLINK_TAG, obj);
        return obj;
    }
}
