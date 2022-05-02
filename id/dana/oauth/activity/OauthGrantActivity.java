package id.dana.oauth.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.component.buttoncomponent.BaseDanaButton;
import id.dana.danah5.DanaH5;
import id.dana.oauth.OauthConstant;
import id.dana.oauth.model.OauthParamsModel;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.ArcMotion;
import o.IntRange;
import o.ScreenBrightnessBridgeExtension;
import o.ScreenShotObserver;
import o.SnapshotBridgeExtension;
import o.WheelView;
import o.captureNXView;
import o.dispatchOnCancelled;
import o.dispatchOnPageScrolled;
import o.evaluate;
import o.getDuration;
import o.getErrMsg;
import o.getInsetDodgeRect;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.saveImageToGallery;
import o.setH5MenuList;
import o.setH5OptionMenuTextFlag;
import o.setH5ShowOptionMenuFlag;
import o.setPublishStatus;
import o.setScreenAutolock;
import o.setStateOff;
import o.shouldOverrideUrlLoading;
import o.showSoftInput;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020LH\u0002J\b\u0010N\u001a\u00020LH\u0002J\b\u0010O\u001a\u00020LH\u0002J\b\u0010P\u001a\u00020LH\u0014J\u0018\u0010Q\u001a\u00020A2\u0006\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u0010H\u0002J\b\u0010T\u001a\u00020LH\u0016J\b\u0010U\u001a\u00020LH\u0016J\b\u0010V\u001a\u00020LH\u0002J\b\u0010W\u001a\u00020LH\u0002J\b\u0010X\u001a\u00020LH\u0002J\b\u0010Y\u001a\u00020LH\u0002J\b\u0010Z\u001a\u00020LH\u0002J\u0012\u0010[\u001a\u00020\u00182\b\u0010\\\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010]\u001a\u00020\u0010H\u0016J\b\u0010^\u001a\u00020\u0018H\u0002J\b\u0010_\u001a\u00020\u0018H\u0002J\u0012\u0010`\u001a\u00020L2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002J\u0010\u0010c\u001a\u00020L2\u0006\u0010a\u001a\u00020\u0018H\u0002J\b\u0010d\u001a\u00020LH\u0002J\b\u0010e\u001a\u00020LH\u0002J\b\u0010f\u001a\u00020LH\u0002J\b\u0010g\u001a\u00020LH\u0016J\b\u0010h\u001a\u00020LH\u0002J\b\u0010i\u001a\u00020LH\u0002J\b\u0010j\u001a\u00020LH\u0002J\b\u0010k\u001a\u00020LH\u0002J\u0016\u0010l\u001a\u00020L2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020o0nH\u0002J\u0016\u0010p\u001a\u00020L2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020r0nH\u0002J\b\u0010s\u001a\u00020LH\u0002J\b\u0010t\u001a\u00020LH\u0002J\b\u0010u\u001a\u00020\u0005H\u0002J\b\u0010v\u001a\u00020LH\u0016J\u0012\u0010w\u001a\u00020L2\b\u0010R\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010x\u001a\u00020L2\b\u0010y\u001a\u0004\u0018\u00010\u00182\b\u0010z\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010{\u001a\u00020L2\b\u0010|\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010}\u001a\u00020L2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010nH\u0016J\u0012\u0010~\u001a\u00020L2\b\u0010\u001a\u0004\u0018\u00010\u0018H\u0016J\u001f\u0010\u0001\u001a\u00020L2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010\u0001\u001a\u0004\u0018\u00010\u0018H\u0016J\u0015\u0010\u0001\u001a\u00020L2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0014\u0010\u0001\u001a\u00020L2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0018H\u0016J(\u0010\u0001\u001a\u00020L2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016J\t\u0010\u0001\u001a\u00020LH\u0014J\u0007\u0010\u0001\u001a\u00020LJ\u0014\u0010\u0001\u001a\u00020L2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0018H\u0002J\u001f\u0010\u0001\u001a\u00020L2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020LH\u0016J\t\u0010\u0001\u001a\u00020LH\u0002J\t\u0010\u0001\u001a\u00020LH\u0016J\t\u0010\u0001\u001a\u00020LH\u0002J\t\u0010\u0001\u001a\u00020LH\u0002J\t\u0010\u0001\u001a\u00020LH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000206X.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001e\u00109\u001a\u00020:8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010A\u0018\u00010@X\u000e¢\u0006\u0004\n\u0002\u0010BR\u000e\u0010C\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/oauth/activity/OauthGrantActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/contract/oauth/OauthGrantContract$View;", "()V", "benefitShow", "", "btnAllow", "Lid/dana/component/buttoncomponent/BaseDanaButton;", "btnDropdown", "Landroidx/appcompat/widget/AppCompatImageView;", "btnNo", "btnTryAgainOauth", "Landroid/widget/Button;", "containerGoogle", "Landroid/widget/LinearLayout;", "countTryAgainOauthRequest", "", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "errorCode", "", "errorDescription", "errorPath", "ivBannerAgreement", "Landroid/widget/ImageView;", "layoutAgreementOauth", "Landroid/view/View;", "layoutFailedOauth", "layoutPhoneNumber", "llBenefitTitle", "loadingType", "oauthAgreed", "oauthGrantComponent", "Lid/dana/di/component/OauthGrantComponent;", "oauthParamsModel", "Lid/dana/oauth/model/OauthParamsModel;", "oauthType", "presenter", "Lid/dana/contract/oauth/OauthGrantContract$Presenter;", "getPresenter", "()Lid/dana/contract/oauth/OauthGrantContract$Presenter;", "setPresenter", "(Lid/dana/contract/oauth/OauthGrantContract$Presenter;)V", "readLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "rvBindingBenefit", "Landroidx/recyclerview/widget/RecyclerView;", "rvScope", "scheme", "scopeAdapter", "Lid/dana/oauth/ScopeAdapter;", "getScopeAdapter", "()Lid/dana/oauth/ScopeAdapter;", "setScopeAdapter", "(Lid/dana/oauth/ScopeAdapter;)V", "skeletonScreens", "", "Lcom/ethanhua/skeleton/SkeletonScreen;", "[Lcom/ethanhua/skeleton/SkeletonScreen;", "tvAgreementDetail", "Landroid/widget/TextView;", "tvErrorDescription", "tvErrorTitle", "tvPhoneNumber", "tvTnc", "vDivider1", "vDividerPhoneNumber", "cancelOauth", "", "changeViewToGnAgreementPage", "checkButtonDropdown", "checkFailedPageDesign", "configToolbar", "createSkeleton", "view", "skeletonId", "dismissConfirmProgress", "dismissProgress", "doAllowClick", "doBenefitDropdownClick", "doDenyClick", "doTryAgainOauthClick", "errorPathSdkAction", "formatWhitespaceWithPlus", "value", "getLayout", "getWordingAgreementDetail", "getWordingGnTermsAndCondition", "goToRedirectUrl", "target", "Landroid/net/Uri;", "goToUriScheme", "handleErrorAction", "handleErrorWhenSignatureIsEmpty", "hideShimmerAnimation", "init", "initGnTermsAndCondition", "initInjector", "initIntentData", "initOauth", "initRecyclerBindingBenefit", "bindingBenefitModelList", "", "Lid/dana/oauth/model/BindingBenefitModel;", "initRecyclerViewScope", "scopeModels", "Lid/dana/oauth/model/ScopeModel;", "initTermsAndCondition", "initView", "isGoogleMerchant", "onBackPressed", "onClickLeftMenuButton", "onConfirmOauthScopeSuccess", "mobileAuthCode", "serverAuthCode", "onError", "errorMessage", "onGetBindingBenefitsSuccess", "onGetGnAuthCodeRiskFailed", "securityId", "onGetGnAuthCodeSuccess", "gnAuthCode", "state", "onGetOauthScopeSuccess", "oauthInitModel", "Lid/dana/oauth/model/OauthInitModel;", "onGetPhoneNumberSuccess", "phoneNumber", "onOauthError", "description", "onPause", "readLinkPropertiesGoogleAc", "setMerchantName", "merchantName", "showAlipayConnectBrand", "showAlipayConnectBrandConfig", "Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "showConfirmProgress", "showGoogleDesign", "showProgress", "showShimmerAnimation", "submitGnAuthApply", "viewListener", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OauthGrantActivity extends BaseActivity implements dispatchOnPageScrolled.getMax {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private static final String ICustomTabsCallback$Default = OauthGrantActivity.class.getSimpleName();
    private LinearLayout FastBitmap$CoordinateSystem;
    private AppCompatImageView Grayscale$Algorithm;
    private TextView ICustomTabsCallback;
    private boolean ICustomTabsCallback$Stub;
    private View IsOverlapping;
    private ImageView Mean$Arithmetic;
    private int asBinder;
    private boolean asInterface;
    private TextView b;
    private TextView create;
    private final Lazy equals = LazyKt.lazy(new getMax(this));
    private String extraCallback;
    private String extraCallbackWithResult = "";
    private TextView getCause;
    private getErrMsg getMax;
    /* access modifiers changed from: private */
    public OauthParamsModel getMin;
    private LinearLayout hashCode;
    private BaseDanaButton invoke;
    private BaseDanaButton invokeSuspend;
    private View isInside;
    private String onMessageChannelReady;
    private TextView onNavigationEvent;
    private String onPostMessage;
    private String onRelationshipValidationResult = "";
    private boolean onTransact;
    @Inject
    public dispatchOnPageScrolled.length presenter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    @Inject
    public ScreenShotObserver.H5ScreenShotListener scopeAdapter;
    private HashMap setDefaultImpl;
    private onDetachedFromLayoutParams[] setMax;
    private RecyclerView toDoubleRange;
    private View toFloatRange;
    private View toIntRange;
    private RecyclerView toString;
    private Button valueOf;
    private View values;

    @JvmStatic
    @NotNull
    public static final Intent createOauthGrantIntent(@Nullable Context context, @Nullable OauthParamsModel oauthParamsModel) {
        return getMin.setMax(context, oauthParamsModel);
    }

    @JvmStatic
    @NotNull
    public static final Intent createOauthGrantLoadingIntent(@Nullable Context context) {
        return getMin.setMin(context);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setDefaultImpl;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1414236716, oncanceled);
            onCancelLoad.getMin(-1414236716, oncanceled);
        }
        if (this.setDefaultImpl == null) {
            this.setDefaultImpl = new HashMap();
        }
        View view = (View) this.setDefaultImpl.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setDefaultImpl.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_oauth_grant;
    }

    public final void onError(@Nullable String str) {
    }

    public static final /* synthetic */ void access$doTryAgainOauthClick(OauthGrantActivity oauthGrantActivity) {
        int length2;
        int min;
        Context baseContext = oauthGrantActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-918868776, oncanceled);
            onCancelLoad.getMin(-918868776, oncanceled);
        }
        oauthGrantActivity.setCenterTitle(oauthGrantActivity.getString(R.string.confirmation_oauth));
        View view = oauthGrantActivity.toFloatRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutFailedOauth");
        }
        view.setVisibility(8);
        View view2 = oauthGrantActivity.isInside;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutAgreementOauth");
        }
        view2.setVisibility(0);
        if (oauthGrantActivity.asInterface) {
            oauthGrantActivity.setMin();
        } else {
            oauthGrantActivity.length();
        }
        int i = oauthGrantActivity.asBinder + 1;
        oauthGrantActivity.asBinder = i;
        if (i >= 3) {
            Button button = oauthGrantActivity.valueOf;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnTryAgainOauth");
            }
            button.setVisibility(8);
        }
    }

    @NotNull
    public final dispatchOnPageScrolled.length getPresenter() {
        dispatchOnPageScrolled.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2;
    }

    public final void setPresenter(@NotNull dispatchOnPageScrolled.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @NotNull
    public final getDuration.length getReadLinkPropertiesPresenter() {
        getDuration.length length2 = this.readLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
        }
        return length2;
    }

    public final void setReadLinkPropertiesPresenter(@NotNull getDuration.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.readLinkPropertiesPresenter = length2;
    }

    @NotNull
    public final ScreenShotObserver.H5ScreenShotListener getScopeAdapter() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-738205979, oncanceled);
            onCancelLoad.getMin(-738205979, oncanceled);
        }
        ScreenShotObserver.H5ScreenShotListener h5ScreenShotListener = this.scopeAdapter;
        if (h5ScreenShotListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scopeAdapter");
        }
        return h5ScreenShotListener;
    }

    public final void setScopeAdapter(@NotNull ScreenShotObserver.H5ScreenShotListener h5ScreenShotListener) {
        Intrinsics.checkNotNullParameter(h5ScreenShotListener, "<set-?>");
        this.scopeAdapter = h5ScreenShotListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ OauthGrantActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(OauthGrantActivity oauthGrantActivity) {
            super(0);
            this.this$0 = oauthGrantActivity;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0);
        }
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.confirmation_oauth));
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0393  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            int r0 = o.dispatchOnCancelled.getMax(r2)
            r3 = 16
            if (r0 == 0) goto L_0x0019
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r2, r0, r3)
            r0 = 1401358651(0x5387093b, float:1.15995089E12)
            o.onCancelLoad.setMax(r0, r4)
            o.onCancelLoad.getMin(r0, r4)
        L_0x0019:
            int r0 = o.dispatchOnCancelled.getMax(r2)
            if (r0 == 0) goto L_0x002d
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r2, r0, r3)
            r0 = -405326201(0xffffffffe7d73687, float:-2.0326293E24)
            o.onCancelLoad.setMax(r0, r4)
            o.onCancelLoad.getMin(r0, r4)
        L_0x002d:
            o.getErrMsg r0 = r1.getMax
            r4 = 0
            if (r0 != 0) goto L_0x00fc
            o.onParseDone$length r0 = new o.onParseDone$length
            r0.<init>(r2)
            o.PrepareException$1 r5 = r17.getApplicationComponent()
            if (r5 == 0) goto L_0x00fb
            o.PrepareException$1 r5 = (o.PrepareException.AnonymousClass1) r5
            r0.IsOverlapping = r5
            id.dana.di.modules.OauthGrantModule r5 = new id.dana.di.modules.OauthGrantModule
            r6 = r1
            o.dispatchOnPageScrolled$getMax r6 = (o.dispatchOnPageScrolled.getMax) r6
            r5.<init>(r6)
            id.dana.di.modules.OauthGrantModule r5 = (id.dana.di.modules.OauthGrantModule) r5
            r0.setMax = r5
            id.dana.contract.deeplink.DeepLinkModule$setMin r5 = id.dana.contract.deeplink.DeepLinkModule.getMax()
            r6 = r1
            android.app.Activity r6 = (android.app.Activity) r6
            r5.getMax = r6
            id.dana.oauth.activity.OauthGrantActivity$setMin r7 = new id.dana.oauth.activity.OauthGrantActivity$setMin
            r7.<init>()
            o.ArcMotion r7 = (o.ArcMotion) r7
            r5.setMin = r7
            id.dana.contract.deeplink.DeepLinkModule r7 = new id.dana.contract.deeplink.DeepLinkModule
            r7.<init>(r5, r2)
            id.dana.contract.deeplink.DeepLinkModule r7 = (id.dana.contract.deeplink.DeepLinkModule) r7
            r0.setMin = r7
            id.dana.contract.staticqr.ScanQrModule$setMin r5 = id.dana.contract.staticqr.ScanQrModule.getMax()
            r5.setMin = r6
            id.dana.contract.staticqr.ScanQrModule r7 = new id.dana.contract.staticqr.ScanQrModule
            r7.<init>(r5, r2)
            id.dana.contract.staticqr.ScanQrModule r7 = (id.dana.contract.staticqr.ScanQrModule) r7
            r0.length = r7
            id.dana.contract.shortener.RestoreUrlModule$setMin r5 = id.dana.contract.shortener.RestoreUrlModule.setMin()
            r5.getMax = r6
            id.dana.contract.shortener.RestoreUrlModule r7 = new id.dana.contract.shortener.RestoreUrlModule
            r7.<init>(r5, r2)
            id.dana.contract.shortener.RestoreUrlModule r7 = (id.dana.contract.shortener.RestoreUrlModule) r7
            r0.getMax = r7
            id.dana.contract.deeplink.FeatureModule$length r5 = id.dana.contract.deeplink.FeatureModule.length()
            r5.setMax = r6
            id.dana.contract.deeplink.FeatureModule r7 = new id.dana.contract.deeplink.FeatureModule
            r7.<init>(r5, r2)
            id.dana.contract.deeplink.FeatureModule r7 = (id.dana.contract.deeplink.FeatureModule) r7
            r0.getMin = r7
            id.dana.di.modules.OauthModule$getMax r5 = id.dana.di.modules.OauthModule.setMin()
            r5.setMin = r6
            id.dana.di.modules.OauthModule r6 = new id.dana.di.modules.OauthModule
            r6.<init>(r5, r2)
            id.dana.di.modules.OauthModule r6 = (id.dana.di.modules.OauthModule) r6
            r0.toIntRange = r6
            id.dana.di.modules.OauthGrantModule r5 = r0.setMax
            java.lang.Class<id.dana.di.modules.OauthGrantModule> r6 = id.dana.di.modules.OauthGrantModule.class
            o.stopIgnoring.setMin(r5, r6)
            id.dana.contract.deeplink.DeepLinkModule r5 = r0.setMin
            java.lang.Class<id.dana.contract.deeplink.DeepLinkModule> r6 = id.dana.contract.deeplink.DeepLinkModule.class
            o.stopIgnoring.setMin(r5, r6)
            id.dana.contract.staticqr.ScanQrModule r5 = r0.length
            java.lang.Class<id.dana.contract.staticqr.ScanQrModule> r6 = id.dana.contract.staticqr.ScanQrModule.class
            o.stopIgnoring.setMin(r5, r6)
            id.dana.contract.shortener.RestoreUrlModule r5 = r0.getMax
            java.lang.Class<id.dana.contract.shortener.RestoreUrlModule> r6 = id.dana.contract.shortener.RestoreUrlModule.class
            o.stopIgnoring.setMin(r5, r6)
            id.dana.contract.deeplink.FeatureModule r5 = r0.getMin
            java.lang.Class<id.dana.contract.deeplink.FeatureModule> r6 = id.dana.contract.deeplink.FeatureModule.class
            o.stopIgnoring.setMin(r5, r6)
            id.dana.di.modules.OauthModule r5 = r0.toIntRange
            java.lang.Class<id.dana.di.modules.OauthModule> r6 = id.dana.di.modules.OauthModule.class
            o.stopIgnoring.setMin(r5, r6)
            id.dana.contract.services.ServicesModule r5 = r0.equals
            if (r5 != 0) goto L_0x00d9
            id.dana.contract.services.ServicesModule r5 = new id.dana.contract.services.ServicesModule
            r5.<init>()
            r0.equals = r5
        L_0x00d9:
            o.PrepareException$1 r5 = r0.IsOverlapping
            java.lang.Class<o.PrepareException$1> r6 = o.PrepareException.AnonymousClass1.class
            o.stopIgnoring.setMin(r5, r6)
            o.onParseDone r5 = new o.onParseDone
            id.dana.di.modules.OauthGrantModule r8 = r0.setMax
            id.dana.contract.deeplink.DeepLinkModule r9 = r0.setMin
            id.dana.contract.staticqr.ScanQrModule r10 = r0.length
            id.dana.contract.shortener.RestoreUrlModule r11 = r0.getMax
            id.dana.contract.deeplink.FeatureModule r12 = r0.getMin
            id.dana.di.modules.OauthModule r13 = r0.toIntRange
            id.dana.contract.services.ServicesModule r14 = r0.equals
            o.PrepareException$1 r15 = r0.IsOverlapping
            r16 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.getMax = r5
            goto L_0x00fc
        L_0x00fb:
            throw r4
        L_0x00fc:
            o.getErrMsg r0 = r1.getMax
            if (r0 == 0) goto L_0x0103
            r0.getMax(r1)
        L_0x0103:
            r0 = 2
            o.onDelete$getMin[] r0 = new o.onDelete.getMin[r0]
            o.dispatchOnPageScrolled$length r5 = r1.presenter
            if (r5 != 0) goto L_0x010f
            java.lang.String r6 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x010f:
            o.onDelete$getMin r5 = (o.onDelete.getMin) r5
            r0[r2] = r5
            o.getDuration$length r5 = r1.readLinkPropertiesPresenter
            if (r5 != 0) goto L_0x011c
            java.lang.String r6 = "readLinkPropertiesPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x011c:
            o.onDelete$getMin r5 = (o.onDelete.getMin) r5
            r6 = 1
            r0[r6] = r5
            r1.registerPresenter(r0)
            android.content.pm.PackageManager r0 = r17.getPackageManager()     // Catch:{ NameNotFoundException -> 0x014e }
            java.lang.String r5 = r17.getPackageName()     // Catch:{ NameNotFoundException -> 0x014e }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r5, r7)     // Catch:{ NameNotFoundException -> 0x014e }
            java.lang.String r5 = "packageManager\n         …ageManager.GET_META_DATA)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ NameNotFoundException -> 0x014e }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x014e }
            java.lang.String r5 = "deeplink_scheme"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ NameNotFoundException -> 0x014e }
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NameNotFoundException -> 0x014e }
            r1.onRelationshipValidationResult = r0     // Catch:{ NameNotFoundException -> 0x014e }
            goto L_0x0158
        L_0x0146:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ NameNotFoundException -> 0x014e }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r5)     // Catch:{ NameNotFoundException -> 0x014e }
            throw r0     // Catch:{ NameNotFoundException -> 0x014e }
        L_0x014e:
            r0 = move-exception
            java.lang.String r5 = ICustomTabsCallback$Default
            java.lang.String r0 = r0.getMessage()
            o.updateActionSheetContent.e(r5, r0)
        L_0x0158:
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r5 = "oauth_loading"
            boolean r0 = r0.getBooleanExtra(r5, r2)
            r1.onTransact = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r5 = "oauth"
            android.os.Parcelable r0 = r0.getParcelableExtra(r5)
            id.dana.oauth.model.OauthParamsModel r0 = (id.dana.oauth.model.OauthParamsModel) r0
            r1.getMin = r0
            if (r0 == 0) goto L_0x017b
            o.ScreenBrightnessBridgeExtension r0 = o.ScreenBrightnessBridgeExtension.getMin
            id.dana.oauth.model.OauthParamsModel r0 = r1.getMin
            o.ScreenBrightnessBridgeExtension.getMin((id.dana.oauth.model.OauthParamsModel) r0)
        L_0x017b:
            int r0 = o.dispatchOnCancelled.getMax(r2)
            if (r0 == 0) goto L_0x018f
            o.onCanceled r5 = new o.onCanceled
            r5.<init>(r2, r0, r3)
            r0 = -2116797048(0xffffffff81d43d88, float:-7.7964794E-38)
            o.onCancelLoad.setMax(r0, r5)
            o.onCancelLoad.getMin(r0, r5)
        L_0x018f:
            r0 = 2131363732(0x7f0a0794, float:1.8347281E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.layout_agreement_oauth)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r1.isInside = r0
            r0 = 2131365730(0x7f0a0f62, float:1.8351334E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.v_divider_phone_number)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r1.IsOverlapping = r0
            r0 = 2131363903(0x7f0a083f, float:1.8347628E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.ll_phone_number)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r1.toIntRange = r0
            r0 = 2131363741(0x7f0a079d, float:1.83473E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.layout_failed_oauth)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r1.toFloatRange = r0
            r0 = 2131363837(0x7f0a07fd, float:1.8347494E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.ll_benefit_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.FastBitmap$CoordinateSystem = r0
            r0 = 2131362586(0x7f0a031a, float:1.8344957E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.container_google)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.hashCode = r0
            r0 = 2131365727(0x7f0a0f5f, float:1.8351327E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.v_divider1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r1.values = r0
            r0 = 2131364565(0x7f0a0ad5, float:1.834897E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.rv_scope)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.toDoubleRange = r0
            r0 = 2131364495(0x7f0a0a8f, float:1.8348829E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.rv_binding_benefit)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.toString = r0
            r0 = 2131363363(0x7f0a0623, float:1.8346533E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.iv_banner_agreement)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.Mean$Arithmetic = r0
            r0 = 2131362077(0x7f0a011d, float:1.8343924E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.btn_dropdown)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r1.Grayscale$Algorithm = r0
            r0 = 2131362050(0x7f0a0102, float:1.834387E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.btn_allow)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            id.dana.component.buttoncomponent.BaseDanaButton r0 = (id.dana.component.buttoncomponent.BaseDanaButton) r0
            r1.invoke = r0
            r0 = 2131362102(0x7f0a0136, float:1.8343975E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.btn_no)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            id.dana.component.buttoncomponent.BaseDanaButton r0 = (id.dana.component.buttoncomponent.BaseDanaButton) r0
            r1.invokeSuspend = r0
            r0 = 2131362148(0x7f0a0164, float:1.8344068E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.btn_try_again_oauth)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.valueOf = r0
            r0 = 2131365096(0x7f0a0ce8, float:1.8350048E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.tv_agreement_detail)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.onNavigationEvent = r0
            r0 = 2131365631(0x7f0a0eff, float:1.8351133E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.tv_tnc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.b = r0
            r0 = 2131365241(0x7f0a0d79, float:1.8350342E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.tv_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.ICustomTabsCallback = r0
            r0 = 2131365236(0x7f0a0d74, float:1.8350332E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.tv_error_description)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.create = r0
            r0 = 2131365442(0x7f0a0e42, float:1.835075E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r5 = "findViewById(R.id.tv_phone_number)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.getCause = r0
            boolean r0 = r17.setMax()
            if (r0 == 0) goto L_0x02bf
            r0 = 2131231316(0x7f080254, float:1.807871E38)
            goto L_0x02c2
        L_0x02bf:
            r0 = 2131231816(0x7f080448, float:1.8079724E38)
        L_0x02c2:
            r1.setMenuLeftButton((int) r0)
            boolean r0 = r1.onTransact
            if (r0 == 0) goto L_0x02f5
            o.ScreenBrightnessBridgeExtension r0 = o.ScreenBrightnessBridgeExtension.getMin
            boolean r0 = o.ScreenBrightnessBridgeExtension.IsOverlapping()
            if (r0 != 0) goto L_0x02f5
            r0 = 2131363760(0x7f0a07b0, float:1.8347338E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r4 = "findViewById(R.id.layout_toolbar)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r4 = 8
            r0.setVisibility(r4)
            android.view.View r0 = r1.isInside
            if (r0 != 0) goto L_0x02eb
            java.lang.String r5 = "layoutAgreementOauth"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x02eb:
            r0.setVisibility(r4)
            r17.showConfirmProgress()
            r17.readLinkPropertiesGoogleAc()
            goto L_0x0342
        L_0x02f5:
            boolean r0 = r1.onTransact
            if (r0 == 0) goto L_0x0312
            o.ScreenBrightnessBridgeExtension r0 = o.ScreenBrightnessBridgeExtension.getMin
            boolean r0 = o.ScreenBrightnessBridgeExtension.IsOverlapping()
            if (r0 == 0) goto L_0x0312
            android.content.Intent r0 = new android.content.Intent
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<id.dana.onboarding.splash.SplashActivity> r3 = id.dana.onboarding.splash.SplashActivity.class
            r0.<init>(r2, r3)
            r1.startActivity(r0)
            r17.finish()
            return
        L_0x0312:
            r17.length()
            id.dana.oauth.model.OauthParamsModel r0 = r1.getMin
            if (r0 == 0) goto L_0x031b
            java.lang.String r4 = r0.values
        L_0x031b:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0327
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0326
            goto L_0x0327
        L_0x0326:
            r6 = 0
        L_0x0327:
            if (r6 == 0) goto L_0x0342
            java.lang.String r0 = r1.extraCallbackWithResult
            java.lang.String r4 = "global_network"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x0342
            r0 = r1
            android.content.Context r0 = (android.content.Context) r0
            r4 = 2131887132(0x7f12041c, float:1.9408862E38)
            java.lang.String r0 = r0.getString(r4)
            java.lang.String r4 = ""
            r1.onOauthError(r0, r4, r4)
        L_0x0342:
            int r0 = o.dispatchOnCancelled.getMax(r2)
            if (r0 == 0) goto L_0x0356
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r2, r0, r3)
            r0 = 2062514606(0x7aef79ae, float:6.2171345E35)
            o.onCancelLoad.setMax(r0, r4)
            o.onCancelLoad.getMin(r0, r4)
        L_0x0356:
            androidx.appcompat.widget.AppCompatImageView r0 = r1.Grayscale$Algorithm
            if (r0 != 0) goto L_0x035f
            java.lang.String r2 = "btnDropdown"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x035f:
            id.dana.oauth.activity.OauthGrantActivity$IsOverlapping r2 = new id.dana.oauth.activity.OauthGrantActivity$IsOverlapping
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            id.dana.component.buttoncomponent.BaseDanaButton r0 = r1.invoke
            if (r0 != 0) goto L_0x0372
            java.lang.String r2 = "btnAllow"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0372:
            id.dana.oauth.activity.OauthGrantActivity$equals r2 = new id.dana.oauth.activity.OauthGrantActivity$equals
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            id.dana.component.buttoncomponent.BaseDanaButton r0 = r1.invokeSuspend
            if (r0 != 0) goto L_0x0385
            java.lang.String r2 = "btnNo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0385:
            id.dana.oauth.activity.OauthGrantActivity$toFloatRange r2 = new id.dana.oauth.activity.OauthGrantActivity$toFloatRange
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r1.valueOf
            if (r0 != 0) goto L_0x0398
            java.lang.String r2 = "btnTryAgainOauth"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0398:
            id.dana.oauth.activity.OauthGrantActivity$isInside r2 = new id.dana.oauth.activity.OauthGrantActivity$isInside
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.oauth.activity.OauthGrantActivity.init():void");
    }

    public final void onClickLeftMenuButton(@Nullable View view) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(622178388, oncanceled);
            onCancelLoad.getMin(622178388, oncanceled);
        }
        super.onClickLeftMenuButton(view);
        this.asBinder = 0;
    }

    public final void onPause() {
        super.onPause();
        if (this.onTransact) {
            finish();
        }
    }

    public final void onOauthError(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        int max;
        this.extraCallback = str2;
        this.onPostMessage = str;
        this.onMessageChannelReady = str3;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 775552637 == (max = dispatchOnCancelled.getMax(applicationContext, 775552637)))) {
            onCanceled oncanceled = new onCanceled(775552637, max, 512);
            onCancelLoad.setMax(775552637, oncanceled);
            onCancelLoad.getMin(775552637, oncanceled);
        }
        if (setMax()) {
            setMenuLeftButton((int) R.drawable.ic_close);
        }
        setCenterTitle(getString(setMax() ? R.string.google_error_title_page : R.string.oauth_failed));
        TextView textView = this.ICustomTabsCallback;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvErrorTitle");
        }
        textView.setText(getString(setMax() ? R.string.error_google_oauth_title : R.string.error_oauth_title));
        TextView textView2 = this.create;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvErrorDescription");
        }
        textView2.setText(getString(setMax() ? R.string.error_google_oauth_description : R.string.error_oauth_description));
        View view = this.toFloatRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutFailedOauth");
        }
        view.setVisibility(0);
        View view2 = this.isInside;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutAgreementOauth");
        }
        view2.setVisibility(8);
    }

    public final void onConfirmOauthScopeSuccess(@Nullable String str, @Nullable String str2) {
        setScreenAutolock setscreenautolock = new setScreenAutolock(this.onRelationshipValidationResult);
        OauthParamsModel oauthParamsModel = this.getMin;
        StringBuilder sb = new StringBuilder();
        sb.append(oauthParamsModel.getMax(setscreenautolock.setMax));
        sb.append(setH5OptionMenuTextFlag.setMin("?mobileAuthCode={mobileAuthCode}&serverAuthCode={serverAuthCode}&state={stateCode}").setMax(OauthConstant.PathParams.MOBILE_AUTH_CODE, str).setMax(OauthConstant.PathParams.SERVER_AUTH_CODE, str2).setMax(OauthConstant.PathParams.STATE_CODE, oauthParamsModel.setMin).getMax());
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "OauthTargetManager(schem…AuthCode, serverAuthCode)");
        getMax(obj);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:55|56|57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        onOauthError("", "", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00df, code lost:
        r7 = o.ScreenBrightnessBridgeExtension.getMin;
        o.ScreenBrightnessBridgeExtension.setMax(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGetGnAuthCodeSuccess(@org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            boolean r1 = r5.setMax()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0065
            o.ScreenBrightnessBridgeExtension r1 = o.ScreenBrightnessBridgeExtension.getMin
            boolean r1 = o.ScreenBrightnessBridgeExtension.toIntRange()
            if (r1 == 0) goto L_0x0013
            goto L_0x0065
        L_0x0013:
            id.dana.oauth.model.OauthParamsModel r0 = r5.getMin
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r0.IsOverlapping
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x002f
            int r1 = r1.length()
            if (r1 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r1 = 0
            goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            if (r1 != 0) goto L_0x0053
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x003f
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            java.lang.String r1 = "authCode"
            android.net.Uri$Builder r6 = r0.appendQueryParameter(r1, r6)
            java.lang.String r0 = "authState"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r0, r7)
            android.net.Uri r6 = r6.build()
            goto L_0x0057
        L_0x0053:
            android.net.Uri r6 = r0.build()
        L_0x0057:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r7.<init>(r0, r6)
            r5.startActivity(r7)
            r5.finish()
            return
        L_0x0065:
            com.alipay.iap.android.wallet.acl.oauth.OAuthResult r1 = new com.alipay.iap.android.wallet.acl.oauth.OAuthResult
            r1.<init>()
            id.dana.oauth.model.OauthParamsModel r4 = r5.getMin
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = r4.IsOverlapping
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r1.setAuthRedirectUrl(r4)
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0083
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r4 = 0
            goto L_0x0084
        L_0x0083:
            r4 = 1
        L_0x0084:
            if (r4 != 0) goto L_0x00e5
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0094
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r4 = 0
            goto L_0x0095
        L_0x0094:
            r4 = 1
        L_0x0095:
            if (r4 != 0) goto L_0x00e5
            r1.setAuthCode(r6)
            r1.setAuthState(r7)
            com.alipay.iap.android.wallet.acl.WalletServiceManager r6 = com.alipay.iap.android.wallet.acl.WalletServiceManager.getInstance()     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            java.lang.Class<com.alipay.iap.android.wallet.acl.oauth.OAuthService> r7 = com.alipay.iap.android.wallet.acl.oauth.OAuthService.class
            com.alipay.iap.android.wallet.acl.base.BaseService r6 = r6.getService(r7)     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            if (r6 == 0) goto L_0x00cc
            id.dana.miniprogram.provider.OauthServiceProvider r6 = (id.dana.miniprogram.provider.OauthServiceProvider) r6     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            java.lang.String r7 = "authResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            com.alipay.iap.android.wallet.acl.base.Callback<com.alipay.iap.android.wallet.acl.oauth.OAuthResult> r6 = r6.setMax     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            if (r6 != 0) goto L_0x00b9
            java.lang.String r7 = "gnCallbackResult"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)     // Catch:{ ServiceNotFoundException -> 0x00d6 }
        L_0x00b9:
            com.alipay.iap.android.wallet.acl.base.Result r1 = (com.alipay.iap.android.wallet.acl.base.Result) r1     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            r6.result(r1)     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            o.ScreenBrightnessBridgeExtension r6 = o.ScreenBrightnessBridgeExtension.getMin     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            o.ScreenBrightnessBridgeExtension.setMin((boolean) r2)     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            r5.finish()     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            o.ScreenBrightnessBridgeExtension r6 = o.ScreenBrightnessBridgeExtension.getMin
            o.ScreenBrightnessBridgeExtension.setMax((boolean) r3)
            return
        L_0x00cc:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            java.lang.String r7 = "null cannot be cast to non-null type id.dana.miniprogram.provider.OauthServiceProvider"
            r6.<init>(r7)     // Catch:{ ServiceNotFoundException -> 0x00d6 }
            throw r6     // Catch:{ ServiceNotFoundException -> 0x00d6 }
        L_0x00d4:
            r6 = move-exception
            goto L_0x00df
        L_0x00d6:
            r5.onOauthError(r0, r0, r0)     // Catch:{ all -> 0x00d4 }
            o.ScreenBrightnessBridgeExtension r6 = o.ScreenBrightnessBridgeExtension.getMin
            o.ScreenBrightnessBridgeExtension.setMax((boolean) r3)
            return
        L_0x00df:
            o.ScreenBrightnessBridgeExtension r7 = o.ScreenBrightnessBridgeExtension.getMin
            o.ScreenBrightnessBridgeExtension.setMax((boolean) r3)
            throw r6
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.oauth.activity.OauthGrantActivity.onGetGnAuthCodeSuccess(java.lang.String, java.lang.String):void");
    }

    public final void onGetGnAuthCodeRiskFailed(@Nullable String str) {
        ChallengeControl.length length2 = new ChallengeControl.length((BaseActivity) this);
        length2.getMin = "auth_agreement";
        ChallengeControl.length length3 = length2;
        length3.setMax = "auth_agreement";
        ChallengeControl.length length4 = length3;
        length4.IsOverlapping = str == null ? "" : str;
        ChallengeControl.length length5 = length4;
        length5.toString = new toIntRange(this, str);
        new ChallengeControl(length5, (byte) 0).getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/oauth/activity/OauthGrantActivity$onGetGnAuthCodeRiskFailed$1", "Lid/dana/challenge/ChallengeControl$Listener;", "onChallengeCanceled", "", "challengeScenario", "", "cancelReason", "data", "Landroid/os/Bundle;", "onChallengeCompleted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements ChallengeControl.getMin {
        final /* synthetic */ OauthGrantActivity length;
        final /* synthetic */ String setMin;

        toIntRange(OauthGrantActivity oauthGrantActivity, String str) {
            this.length = oauthGrantActivity;
            this.setMin = str;
        }

        public final void getMax() {
            String str;
            String str2;
            List<String> list;
            String str3;
            String str4;
            dispatchOnPageScrolled.length presenter = this.length.getPresenter();
            OauthParamsModel access$getOauthParamsModel$p = this.length.getMin;
            String str5 = null;
            if (access$getOauthParamsModel$p != null) {
                str = access$getOauthParamsModel$p.setMin;
            } else {
                str = null;
            }
            OauthParamsModel access$getOauthParamsModel$p2 = this.length.getMin;
            if (access$getOauthParamsModel$p2 != null) {
                str2 = access$getOauthParamsModel$p2.getMin;
            } else {
                str2 = null;
            }
            OauthParamsModel access$getOauthParamsModel$p3 = this.length.getMin;
            if (access$getOauthParamsModel$p3 != null) {
                list = access$getOauthParamsModel$p3.length;
            } else {
                list = null;
            }
            OauthParamsModel access$getOauthParamsModel$p4 = this.length.getMin;
            if (access$getOauthParamsModel$p4 != null) {
                str3 = access$getOauthParamsModel$p4.IsOverlapping;
            } else {
                str3 = null;
            }
            OauthParamsModel access$getOauthParamsModel$p5 = this.length.getMin;
            if (access$getOauthParamsModel$p5 != null) {
                str4 = access$getOauthParamsModel$p5.FastBitmap$CoordinateSystem;
            } else {
                str4 = null;
            }
            OauthParamsModel access$getOauthParamsModel$p6 = this.length.getMin;
            if (access$getOauthParamsModel$p6 != null) {
                str5 = access$getOauthParamsModel$p6.equals;
            }
            presenter.getMin(str, str2, list, str3, str4, str5, this.setMin);
        }

        public final void getMin(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
            this.length.onOauthError(str2, "", "");
        }
    }

    public final void onGetBindingBenefitsSuccess(@Nullable List<SnapshotBridgeExtension.AnonymousClass2> list) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            isInside();
            RecyclerView recyclerView = this.toString;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvBindingBenefit");
            }
            ScreenShotObserver screenShotObserver = new ScreenShotObserver();
            screenShotObserver.getMin(list);
            Unit unit = Unit.INSTANCE;
            recyclerView.setAdapter(screenShotObserver);
        }
    }

    public final void readLinkPropertiesGoogleAc() {
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        String max = ScreenBrightnessBridgeExtension.getMax();
        DanaApplication danaApplication = getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "danaApplication");
        if (danaApplication.getOauthGrantActivity() == null) {
            CharSequence charSequence = max;
            if (charSequence == null || charSequence.length() == 0) {
                DanaApplication danaApplication2 = getDanaApplication();
                Intrinsics.checkNotNullExpressionValue(danaApplication2, "danaApplication");
                danaApplication2.setOauthGrantActivity(this);
                return;
            }
        }
        DanaApplication danaApplication3 = getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication3, "danaApplication");
        danaApplication3.setOauthGrantActivity((OauthGrantActivity) null);
        if (isWarmStart()) {
            getDuration.length length2 = this.readLinkPropertiesPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
            }
            Intrinsics.checkNotNull(max);
            length2.getMin(max);
        }
        if (max != null) {
            getDuration.length length3 = this.readLinkPropertiesPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
            }
            length3.getMin(max);
        }
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
        ScreenBrightnessBridgeExtension.setMax((String) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/oauth/activity/OauthGrantActivity$initInjector$1", "Lid/dana/contract/deeplink/DeepLinkCallback;", "onError", "", "errorMessage", "", "onSessionInitialized", "deepLinkPayloadModel", "Lid/dana/model/DeepLinkPayloadModel;", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements ArcMotion {
        public final void getMin(@NotNull showSoftInput showsoftinput) {
            Intrinsics.checkNotNullParameter(showsoftinput, "deepLinkPayloadModel");
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void setMax() {
        }

        setMin() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ OauthGrantActivity setMin;

        IsOverlapping(OauthGrantActivity oauthGrantActivity) {
            this.setMin = oauthGrantActivity;
        }

        public final void onClick(View view) {
            OauthGrantActivity.access$doBenefitDropdownClick(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ OauthGrantActivity getMin;

        equals(OauthGrantActivity oauthGrantActivity) {
            this.getMin = oauthGrantActivity;
        }

        public final void onClick(View view) {
            this.getMin.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ OauthGrantActivity length;

        toFloatRange(OauthGrantActivity oauthGrantActivity) {
            this.length = oauthGrantActivity;
        }

        public final void onClick(View view) {
            OauthGrantActivity.access$doDenyClick(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ OauthGrantActivity getMin;

        isInside(OauthGrantActivity oauthGrantActivity) {
            this.getMin = oauthGrantActivity;
        }

        public final void onClick(View view) {
            OauthGrantActivity.access$doTryAgainOauthClick(this.getMin);
        }
    }

    private final boolean setMax() {
        OauthParamsModel oauthParamsModel = this.getMin;
        if (oauthParamsModel != null) {
            return oauthParamsModel.getMin();
        }
        return false;
    }

    private final void length() {
        boolean z;
        OauthParamsModel oauthParamsModel = this.getMin;
        if (oauthParamsModel != null) {
            if (!Intrinsics.areEqual((Object) oauthParamsModel.toIntRange, (Object) "gn")) {
                CharSequence charSequence = oauthParamsModel.isInside;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    this.extraCallbackWithResult = "sdk";
                    dispatchOnPageScrolled.length length2 = this.presenter;
                    if (length2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    String str = oauthParamsModel.isInside;
                    String str2 = oauthParamsModel.getMin;
                    List<String> list = oauthParamsModel.length;
                    String str3 = oauthParamsModel.IsOverlapping;
                    Boolean bool = oauthParamsModel.toFloatRange;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    length2.setMin(str, str2, list, str3, z);
                }
            }
            this.extraCallbackWithResult = "global_network";
            dispatchOnPageScrolled.length length3 = this.presenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length3.setMax(oauthParamsModel.getMin, oauthParamsModel.length, oauthParamsModel.IsOverlapping, oauthParamsModel.FastBitmap$CoordinateSystem, oauthParamsModel.equals, setMax(oauthParamsModel.values), oauthParamsModel.hashCode);
            if (setMax()) {
                toIntRange();
            }
        }
        dispatchOnPageScrolled.length length4 = this.presenter;
        if (length4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length4.getMin();
        dispatchOnPageScrolled.length length5 = this.presenter;
        if (length5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length5.setMin();
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        String str;
        String str2;
        List<String> list;
        boolean z;
        Boolean bool;
        int max;
        Context baseContext = getBaseContext();
        String str3 = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1487972697 == (max = dispatchOnCancelled.getMax(applicationContext, -1487972697)))) {
            onCanceled oncanceled = new onCanceled(-1487972697, max, 512);
            onCancelLoad.setMax(-1487972697, oncanceled);
            onCancelLoad.getMin(-1487972697, oncanceled);
        }
        if (this.onMessageChannelReady == null) {
            this.asInterface = true;
            if (Intrinsics.areEqual((Object) this.extraCallbackWithResult, (Object) "global_network")) {
                getMax();
                return;
            }
            dispatchOnPageScrolled.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            OauthParamsModel oauthParamsModel = this.getMin;
            if (oauthParamsModel != null) {
                str = oauthParamsModel.isInside;
            } else {
                str = null;
            }
            OauthParamsModel oauthParamsModel2 = this.getMin;
            if (oauthParamsModel2 != null) {
                str2 = oauthParamsModel2.getMin;
            } else {
                str2 = null;
            }
            OauthParamsModel oauthParamsModel3 = this.getMin;
            if (oauthParamsModel3 != null) {
                list = oauthParamsModel3.length;
            } else {
                list = null;
            }
            OauthParamsModel oauthParamsModel4 = this.getMin;
            if (oauthParamsModel4 != null) {
                str3 = oauthParamsModel4.IsOverlapping;
            }
            String str4 = str3;
            OauthParamsModel oauthParamsModel5 = this.getMin;
            if (oauthParamsModel5 == null || (bool = oauthParamsModel5.toFloatRange) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            length2.setMax(str, str2, list, str4, z);
        } else if (Intrinsics.areEqual((Object) this.extraCallbackWithResult, (Object) "sdk")) {
            getMin();
        } else {
            getMax();
        }
    }

    private final void getMax() {
        OauthParamsModel oauthParamsModel = this.getMin;
        if (oauthParamsModel != null) {
            dispatchOnPageScrolled.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.setMax(oauthParamsModel.setMin, oauthParamsModel.getMin, oauthParamsModel.length, oauthParamsModel.IsOverlapping, oauthParamsModel.FastBitmap$CoordinateSystem, oauthParamsModel.equals);
        }
    }

    private final void getMin() {
        String str = this.onMessageChannelReady;
        if (str != null && str.hashCode() == 577032369 && str.equals(OauthConstant.ErrorPathOauth.CANCEL)) {
            String min = new setScreenAutolock(this.onRelationshipValidationResult).setMin(this.getMin, OauthConstant.LocalErrorCode.ACCESS_CANCEL, getString(R.string.cancel_message));
            Intrinsics.checkNotNullExpressionValue(min, "OauthTargetManager(schem…ge)\n                    )");
            getMax(min);
            return;
        }
        String min2 = new setScreenAutolock(this.onRelationshipValidationResult).setMin(this.getMin, this.extraCallback, this.onPostMessage);
        Intrinsics.checkNotNullExpressionValue(min2, "OauthTargetManager(schem…orCode, errorDescription)");
        getMax(min2);
    }

    private final String setMax(String str) {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        boolean z = false;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1959349705, oncanceled);
            onCancelLoad.getMin(-1959349705, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1959349705, oncanceled2);
            onCancelLoad.getMin(-1959349705, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1959349705, oncanceled3);
            onCancelLoad.getMin(-1959349705, oncanceled3);
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        return z ? "" : StringsKt.replace$default(str, " ", "+", false, 4, (Object) null);
    }

    private final void toIntRange() {
        ImageView imageView = this.Mean$Arithmetic;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivBannerAgreement");
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout = this.FastBitmap$CoordinateSystem;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llBenefitTitle");
        }
        linearLayout.setVisibility(8);
        View view = this.IsOverlapping;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vDividerPhoneNumber");
        }
        view.setVisibility(0);
        View view2 = this.toIntRange;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPhoneNumber");
        }
        view2.setBackgroundColor(IntRange.setMax(this, R.color.f20332131099945));
        TextView textView = this.onNavigationEvent;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAgreementDetail");
        }
        textView.setTextAlignment(4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/oauth/activity/OauthGrantActivity$initTermsAndCondition$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends ClickableSpan {
        setMax() {
        }

        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "widget");
            String min = isShowMenu.setMin("/m/standalone/tnc");
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(DanaUrl.TERMS_AND_CONDITION)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/oauth/activity/OauthGrantActivity$initGnTermsAndCondition$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends ClickableSpan {
        length() {
        }

        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "widget");
            String min = isShowMenu.setMin("/m/standalone/tnc");
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(DanaUrl.TERMS_AND_CONDITION)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    private final void getMax(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            finish();
        } catch (ActivityNotFoundException e) {
            setStateOff.length(ICustomTabsCallback$Default, e.getMessage(), e);
            showWarningDialog(getString(R.string.redirect_not_found));
        }
    }

    private final void isInside() {
        AppCompatImageView appCompatImageView = this.Grayscale$Algorithm;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnDropdown");
        }
        appCompatImageView.setImageResource(this.ICustomTabsCallback$Stub ? R.drawable.ic_up_chevron : R.drawable.ic_down_chevron);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/oauth/activity/OauthGrantActivity$Companion;", "", "()V", "BIND_GN_TYPE", "", "GLOBAL_NETWORK_TYPE", "LIMIT_TRY_AGAIN_OAUTH_REQUEST", "", "SDK_TYPE", "SHIMMER_DURATION", "TAG", "kotlin.jvm.PlatformType", "createOauthGrantIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "oauthParamsModel", "Lid/dana/oauth/model/OauthParamsModel;", "createOauthGrantLoadingIntent", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent setMax(@Nullable Context context, @Nullable OauthParamsModel oauthParamsModel) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.onNavigationEvent();
            Intent intent = new Intent(context, OauthGrantActivity.class);
            intent.putExtra("oauth", oauthParamsModel);
            intent.setFlags(268468224);
            return intent;
        }

        @JvmStatic
        @NotNull
        public static Intent setMin(@Nullable Context context) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.onNavigationEvent();
            Intent intent = new Intent(context, OauthGrantActivity.class);
            intent.putExtra("oauth_loading", true);
            intent.setFlags(268468224);
            return intent;
        }
    }

    public final void onBackPressed() {
        this.onMessageChannelReady = OauthConstant.ErrorPathOauth.CANCEL;
        if (Intrinsics.areEqual((Object) this.extraCallbackWithResult, (Object) "sdk")) {
            getMin();
        } else {
            finishAffinity();
        }
        this.asBinder = 0;
        if (this.onTransact) {
            finishAffinity();
        }
        super.onBackPressed();
    }

    public final void onGetOauthScopeSuccess(@Nullable captureNXView capturenxview) {
        List<saveImageToGallery> list;
        int length2;
        int min;
        String str = null;
        if (capturenxview != null) {
            list = capturenxview.setMin;
        } else {
            list = null;
        }
        if (list != null) {
            List<saveImageToGallery> list2 = capturenxview.setMin;
            Intrinsics.checkNotNullExpressionValue(list2, "oauthInitModel.availableScope");
            if (!list2.isEmpty()) {
                dispatchOnPageScrolled.length length3 = this.presenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length3.setMax(capturenxview);
                List<saveImageToGallery> list3 = capturenxview.setMin;
                Intrinsics.checkNotNullExpressionValue(list3, "oauthInitModel.availableScope");
                int max = dispatchOnCancelled.getMax(0);
                if (max != 0) {
                    onCanceled oncanceled = new onCanceled(0, max, 16);
                    onCancelLoad.setMax(1512221436, oncanceled);
                    onCancelLoad.getMin(1512221436, oncanceled);
                }
                RecyclerView recyclerView = this.toDoubleRange;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rvScope");
                }
                Context context = this;
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                RecyclerView recyclerView2 = this.toDoubleRange;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rvScope");
                }
                ScreenShotObserver.H5ScreenShotListener h5ScreenShotListener = this.scopeAdapter;
                if (h5ScreenShotListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scopeAdapter");
                }
                recyclerView2.setAdapter(h5ScreenShotListener);
                ScreenShotObserver.H5ScreenShotListener h5ScreenShotListener2 = this.scopeAdapter;
                if (h5ScreenShotListener2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scopeAdapter");
                }
                h5ScreenShotListener2.getMin(list3);
                if (Intrinsics.areEqual((Object) this.extraCallbackWithResult, (Object) "global_network")) {
                    updateMessageMenuItem<Drawable> min2 = ((updateCornerMarking) Glide.getMax(getApplicationContext())).setMax("https://a.m.dana.id/resource/imgs/ipg/ipg-banner-agreement.png").setMax(evaluate.length).onPostMessage().setMax((int) R.drawable.ipg_banner_agreement).setMin((int) R.drawable.ipg_banner_agreement);
                    ImageView imageView = this.Mean$Arithmetic;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivBannerAgreement");
                    }
                    min2.length(imageView);
                    Context baseContext = getBaseContext();
                    Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                    if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                        onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                        onCancelLoad.setMax(-1304517771, oncanceled2);
                        onCancelLoad.getMin(-1304517771, oncanceled2);
                    }
                    TextView textView = this.b;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvTnc");
                    }
                    ClickableSpan length4 = new length();
                    int max2 = IntRange.setMax(context, R.color.f18392131099713);
                    String string = getString(setMax() ? R.string.gn_google_tnc_oauth : R.string.gn_tnc_oauth);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(\n        if (i…string.gn_tnc_oauth\n    )");
                    setH5MenuList.getMin(textView, length4, max2, string, getString(R.string.gn_tnc_span));
                } else {
                    TextView textView2 = this.b;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvTnc");
                    }
                    setH5MenuList.getMin(textView2, new setMax(), IntRange.setMax(context, R.color.f18392131099713), getString(R.string.tnc_oauth), getString(R.string.tnc_span));
                }
            }
        }
        if (capturenxview != null) {
            str = capturenxview.getMax;
        }
        if (str != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = getString(setMax() ? R.string.oauth_linking_merchant : R.string.oauth_connect_merchant);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(\n        if (i…th_connect_merchant\n    )");
            String format = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            String[] strArr = {str, getString(R.string.dana_name_oauth)};
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i = 0; i < 2; i++) {
                String str2 = strArr[i];
                setH5ShowOptionMenuFlag seth5showoptionmenuflag = new setH5ShowOptionMenuFlag();
                seth5showoptionmenuflag.getMin = format;
                seth5showoptionmenuflag.setMax = str2;
                StyleSpan styleSpan = new StyleSpan(1);
                int i2 = seth5showoptionmenuflag.getMax().getMax;
                setH5ShowOptionMenuFlag max3 = seth5showoptionmenuflag.getMax();
                spannableStringBuilder.setSpan(styleSpan, i2, max3.getMax + max3.setMax.length(), 33);
            }
            TextView textView3 = this.onNavigationEvent;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAgreementDetail");
            }
            textView3.setText(spannableStringBuilder);
        }
    }

    public final void onGetPhoneNumberSuccess(@Nullable String str) {
        String max = WheelView.ScrollerTask.AnonymousClass2.getMax(str, "****");
        TextView textView = this.getCause;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumber");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.dana_id_s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.dana_id_s)");
        String format = String.format(string, Arrays.copyOf(new Object[]{max}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        textView.setText(format);
    }

    public final void showAlipayConnectBrand(@Nullable captureNXView capturenxview, @NotNull shouldOverrideUrlLoading shouldoverrideurlloading) {
        List<saveImageToGallery> list;
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1205206953, oncanceled);
            onCancelLoad.getMin(-1205206953, oncanceled);
        }
        Intrinsics.checkNotNullParameter(shouldoverrideurlloading, "showAlipayConnectBrandConfig");
        if (capturenxview != null && (list = capturenxview.setMin) != null && (!list.isEmpty()) && setMax() && shouldoverrideurlloading.getShow()) {
            list.add(new saveImageToGallery("Item Powered By Alipay", shouldoverrideurlloading.getImageUrl()));
        }
    }

    public final void showProgress() {
        if (setMax()) {
            LinearLayout linearLayout = this.hashCode;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerGoogle");
            }
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.FastBitmap$CoordinateSystem;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llBenefitTitle");
        }
        linearLayout2.setVisibility(8);
        onDetachedFromLayoutParams[] ondetachedfromlayoutparamsArr = new onDetachedFromLayoutParams[5];
        BaseDanaButton baseDanaButton = this.invoke;
        if (baseDanaButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnAllow");
        }
        ondetachedfromlayoutparamsArr[0] = setMin(baseDanaButton, R.layout.view_skeleton_btn_submit);
        View view = this.toIntRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPhoneNumber");
        }
        ondetachedfromlayoutparamsArr[1] = setMin(view, R.layout.view_skeleton_header);
        ImageView imageView = this.Mean$Arithmetic;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivBannerAgreement");
        }
        ondetachedfromlayoutparamsArr[2] = setMin(imageView, R.layout.view_skeleton_square_banner);
        TextView textView = this.onNavigationEvent;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAgreementDetail");
        }
        ondetachedfromlayoutparamsArr[3] = setMin(textView, R.layout.view_skeleton_details_header);
        RecyclerView recyclerView = this.toDoubleRange;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvScope");
        }
        ondetachedfromlayoutparamsArr[4] = setMin(recyclerView, R.layout.view_skeleton_details);
        this.setMax = ondetachedfromlayoutparamsArr;
    }

    public final void dismissProgress() {
        if (setMax()) {
            LinearLayout linearLayout = this.FastBitmap$CoordinateSystem;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("llBenefitTitle");
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.hashCode;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerGoogle");
            }
            linearLayout2.setVisibility(0);
        } else {
            LinearLayout linearLayout3 = this.FastBitmap$CoordinateSystem;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("llBenefitTitle");
            }
            linearLayout3.setVisibility(0);
        }
        onDetachedFromLayoutParams[] ondetachedfromlayoutparamsArr = this.setMax;
        if (ondetachedfromlayoutparamsArr != null) {
            for (onDetachedFromLayoutParams ondetachedfromlayoutparams : ondetachedfromlayoutparamsArr) {
                if (ondetachedfromlayoutparams != null) {
                    ondetachedfromlayoutparams.length();
                }
            }
        }
    }

    public final void showConfirmProgress() {
        setPublishStatus setpublishstatus = (setPublishStatus) this.equals.getValue();
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public final void dismissConfirmProgress() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(974727940, oncanceled);
            onCancelLoad.getMin(974727940, oncanceled);
        }
        ((setPublishStatus) this.equals.getValue()).getMax();
    }

    private static onDetachedFromLayoutParams setMin(View view, int i) {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(view);
        setmax.getMax = i;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 20;
        Intrinsics.checkNotNullExpressionValue(setmax, "Skeleton.bind(view)\n    …0)\n            .angle(20)");
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        Intrinsics.checkNotNullExpressionValue(getinsetdodgerect, "skeletonSendMoneyBuilder.show()");
        return getinsetdodgerect;
    }

    public static final /* synthetic */ void access$doBenefitDropdownClick(OauthGrantActivity oauthGrantActivity) {
        oauthGrantActivity.ICustomTabsCallback$Stub = !oauthGrantActivity.ICustomTabsCallback$Stub;
        View view = oauthGrantActivity.values;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vDivider1");
        }
        int i = 0;
        view.setVisibility(oauthGrantActivity.ICustomTabsCallback$Stub ? 0 : 8);
        RecyclerView recyclerView = oauthGrantActivity.toString;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvBindingBenefit");
        }
        if (!oauthGrantActivity.ICustomTabsCallback$Stub) {
            i = 8;
        }
        recyclerView.setVisibility(i);
        oauthGrantActivity.isInside();
    }

    public static final /* synthetic */ void access$doDenyClick(OauthGrantActivity oauthGrantActivity) {
        oauthGrantActivity.onMessageChannelReady = OauthConstant.ErrorPathOauth.CANCEL;
        if (Intrinsics.areEqual((Object) oauthGrantActivity.extraCallbackWithResult, (Object) "sdk")) {
            oauthGrantActivity.getMin();
        } else {
            oauthGrantActivity.finishAffinity();
        }
    }
}
