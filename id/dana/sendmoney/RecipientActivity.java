package id.dana.sendmoney;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.model.ThirdPartyService;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.view.RecipientHomeView;
import id.dana.splitbill.view.SplitBillIntroductionActivity;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.APEncodeResult;
import o.ConstraintTrackingWorker;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.IWorkManagerImplCallback;
import o.JSONArray;
import o.PhotoSelectListener;
import o.PhotoView;
import o.PrepareException;
import o.ResourceUtils;
import o.access$1402;
import o.dispatchOnCancelled;
import o.enqueueWorkRequests;
import o.getCacheId;
import o.getChildrenSkipCount;
import o.getCurrX;
import o.getDeployVersion;
import o.getDuration;
import o.getExtraDataParsers;
import o.getMaxTextureSize;
import o.getSelectedIndex;
import o.getUseSecurityGuard;
import o.initRect;
import o.isBaselineAligned;
import o.isPhotoSupport;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.queryWorkInfo;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import o.style;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RecipientActivity extends BaseActivity {
    private static final int setMax = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter IsOverlapping;
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    @Inject
    public getSelectedIndex.length bottomSheetOnBoardingPresenter;
    /* access modifiers changed from: private */
    public boolean getMax;
    private final getCacheId getMin = new getCacheId(this);
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    JSONArray recipientActivityComponent;
    @BindView(2131365938)
    RecipientHomeView recipientList;
    @Inject
    public enqueueWorkRequests.length recipientPresenter;
    private List<ContentOnBoardingModel> toIntRange;
    @BindView(2131364386)
    TextView tvHelpRightButton;

    static /* synthetic */ void access$500(RecipientActivity recipientActivity, SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(469841873, oncanceled);
            onCancelLoad.getMin(469841873, oncanceled);
        }
        if (!TextUtils.isEmpty(sendMoneyHomeMenuModel.setMax)) {
            String str = sendMoneyHomeMenuModel.setMax;
            Context baseContext = recipientActivity.getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
                onCanceled oncanceled2 = new onCanceled(length, min, 32);
                onCancelLoad.setMax(1051161268, oncanceled2);
                onCancelLoad.getMin(1051161268, oncanceled2);
            }
            if (isShowMenu.length(str)) {
                recipientActivity.readDeepLinkPropertiesPresenter.setMax(str);
            } else {
                DanaH5.startContainerFullUrl(str);
            }
        } else {
            Bundle bundleWithSource = recipientActivity.getBundleWithSource();
            bundleWithSource.putString("recipientType", sendMoneyHomeMenuModel.length);
            bundleWithSource.putString("iconUrl", sendMoneyHomeMenuModel.equals);
            recipientActivity.getMin.length(bundleWithSource);
        }
    }

    public static Intent createTransferIntent(Context context, QrTransferModel qrTransferModel, String str, String str2) {
        Intent intent = new Intent(context, RecipientActivity.class);
        intent.putExtra("scanner_data", qrTransferModel);
        intent.putExtra("transactionType", str);
        intent.putExtra("recipientType", BranchLinkConstant.ActionTarget.SEND_MONEY_PHONE);
        intent.putExtra("source", str2);
        return intent;
    }

    public static Intent createTransferIntent(Context context, QrTransferModel qrTransferModel, String str, String str2, String str3) {
        Intent intent = new Intent(context, RecipientActivity.class);
        intent.putExtra("scanner_data", qrTransferModel);
        intent.putExtra("transactionType", str);
        intent.putExtra("recipientType", str3);
        intent.putExtra("source", str2);
        return intent;
    }

    public static Intent createTransferSplitBillIntent(Context context, QrTransferModel qrTransferModel, String str, String str2) {
        Intent intent = new Intent(context, RecipientActivity.class);
        intent.putExtra("scanner_data", qrTransferModel);
        intent.putExtra("transactionType", "split_bill");
        intent.putExtra("splitBillId", str);
        intent.putExtra("recipientType", BranchLinkConstant.ActionTarget.SEND_MONEY_PHONE);
        intent.putExtra("source", str2);
        return intent;
    }

    private void setMin() {
        ArrayList arrayList = new ArrayList();
        this.toIntRange = arrayList;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1022665607, oncanceled);
            onCancelLoad.getMin(1022665607, oncanceled);
        }
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.on_boarding_enter_pin, getString(R.string.bottom_on_boarding_subtitle_send_money_first), getString(R.string.bottom_on_boarding_body_text_send_money_first)));
        this.toIntRange.add(new ContentOnBoardingModel((int) R.drawable.on_boarding_save_cards, getString(R.string.bottom_on_boarding_subtitle_send_money_second), getString(R.string.bottom_on_boarding_body_text_send_money_second)));
        this.toIntRange.add(new ContentOnBoardingModel((int) R.drawable.on_boarding_send_money, getString(R.string.bottom_on_boarding_subtitle_send_money_third), getString(R.string.bottom_on_boarding_body_text_send_money_third)));
        this.toIntRange.add(new ContentOnBoardingModel((int) R.drawable.on_boarding_secured_trx, getString(R.string.bottom_on_boarding_subtitle_send_money_fourth), getString(R.string.bottom_on_boarding_body_text_send_money_fourth)));
    }

    public int getLayout() {
        this.getMin.setMax(getIntent().getExtras());
        return R.layout.activity_recipient_home;
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_title));
        setMenuRightButton((int) R.drawable.ic_tooltip_help);
    }

    public void init() {
        int length;
        int min;
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        if (this.recipientActivityComponent == null) {
            ResourceUtils.getMin max = ResourceUtils.setMax();
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            Context context = null;
            if (applicationComponent != null) {
                max.toIntRange = applicationComponent;
                max.setMin = new RecipientActivityModule(new queryWorkInfo(this) {
                    public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
                        boolean unused = RecipientActivity.this.getMax = z;
                    }
                });
                Context baseContext = getBaseContext();
                if (baseContext != null) {
                    context = baseContext.getApplicationContext();
                }
                if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
                    onCanceled oncanceled = new onCanceled(length, min, 32);
                    onCancelLoad.setMax(-840174520, oncanceled);
                    onCancelLoad.getMin(-840174520, oncanceled);
                }
                max.getMax = new BottomSheetOnBoardingModule(new getSelectedIndex.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void setMax(boolean z, @Nullable String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
                        if (z) {
                            RecipientActivity.access$400(RecipientActivity.this);
                        }
                    }

                    public final void onError(String str) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getClass().getName());
                        sb.append("on Error: ");
                        sb.append(str);
                        updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
                    }
                });
                max.isInside = new ServicesModule((style.getMin) new style.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        Intrinsics.checkNotNullParameter(str, "authCode");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void getMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void length() {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    @JvmDefault
                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin() {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
                max2.getMax = this;
                max2.length = "Send Money";
                max.getMin = new DeepLinkModule(max2, (byte) 0);
                ScanQrModule.setMin max3 = ScanQrModule.getMax();
                max3.setMin = this;
                max.length = new ScanQrModule(max3, (byte) 0);
                RestoreUrlModule.setMin min2 = RestoreUrlModule.setMin();
                min2.getMax = this;
                max.setMax = new RestoreUrlModule(min2, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = this;
                max.toFloatRange = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min3 = OauthModule.setMin();
                min3.setMin = this;
                max.IsOverlapping = new OauthModule(min3, (byte) 0);
                max.equals = new BillerX2BModule(new IWorkManagerImplCallback.Stub.Proxy.getMax() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    public final void setMax(@NotNull List<getExtraDataParsers> list) {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "message");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }

                    public final void getMin(@NotNull getCurrX getcurrx) {
                        if (RecipientActivity.this.isClickable()) {
                            new getDeployVersion(RecipientActivity.this, new DialogInterface.OnClickListener(getcurrx) {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    RecipientActivity.this.billerX2BPresenter.length(r3);
                                }
                            }).setMax();
                        }
                    }

                    public final void setMax(@NotNull PhotoSelectListener photoSelectListener) {
                        if (RecipientActivity.this.isClickable() && (photoSelectListener instanceof RecipientModel)) {
                            RecipientModel recipientModel = (RecipientModel) photoSelectListener;
                            RecipientActivity.access$200(RecipientActivity.this, recipientModel);
                            RecipientActivity.this.setMax(recipientModel);
                        }
                    }

                    public final void getMin(@NotNull String str) {
                        DanaH5.startContainerFullUrl(str);
                    }

                    public final void getMin(@NotNull PhotoSelectListener photoSelectListener) {
                        RecipientActivity recipientActivity = RecipientActivity.this;
                        recipientActivity.addDisposable(ConstraintTrackingWorker.getMax(recipientActivity).subscribe(new APEncodeResult.EXTRA(this, photoSelectListener)));
                    }
                });
                stopIgnoring.setMin(max.setMin, RecipientActivityModule.class);
                stopIgnoring.setMin(max.getMax, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(max.getMin, DeepLinkModule.class);
                stopIgnoring.setMin(max.length, ScanQrModule.class);
                stopIgnoring.setMin(max.setMax, RestoreUrlModule.class);
                stopIgnoring.setMin(max.toFloatRange, FeatureModule.class);
                stopIgnoring.setMin(max.IsOverlapping, OauthModule.class);
                if (max.isInside == null) {
                    max.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(max.equals, BillerX2BModule.class);
                stopIgnoring.setMin(max.toIntRange, PrepareException.AnonymousClass1.class);
                this.recipientActivityComponent = new ResourceUtils(max.setMin, max.getMax, max.getMin, max.length, max.setMax, max.toFloatRange, max.IsOverlapping, max.isInside, max.equals, max.toIntRange, (byte) 0);
            } else {
                throw null;
            }
        }
        this.recipientActivityComponent.length(this);
        registerPresenter(this.recipientPresenter, this.bottomSheetOnBoardingPresenter, this.readDeepLinkPropertiesPresenter, this.billerX2BPresenter);
        this.recipientList.setListener(new isPhotoSupport() {
            public final void setMax(SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
                if (RecipientActivity.this.isClickable() && sendMoneyHomeMenuModel != null) {
                    RecipientActivity.access$500(RecipientActivity.this, sendMoneyHomeMenuModel);
                }
            }

            public final void setMin(RecipientModel recipientModel) {
                if (recipientModel.onNavigationEvent.equals("bank")) {
                    RecipientActivity.this.billerX2BPresenter.length((PhotoSelectListener) recipientModel);
                    return;
                }
                RecipientActivity.access$200(RecipientActivity.this, recipientModel);
                RecipientActivity.this.setMax(recipientModel);
            }
        });
        this.recipientList.getSendMoneyBannerContent();
        this.recipientPresenter.getMax();
        DecodeWrapper.getMin("Send Money");
        this.bottomSheetOnBoardingPresenter.setMin("send_money");
    }

    public void onResume() {
        super.onResume();
        if (getMax()) {
            getIntent().removeExtra("bundle_extra_for_resume");
            this.getMin.setMax(getIntent().getExtras());
        }
    }

    public void onClickRightMenuButton(View view) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(181297826, oncanceled);
            onCancelLoad.getMin(181297826, oncanceled);
        }
        super.onClickRightMenuButton(view);
        setMin();
        startActivity(BottomSheetHelpActivity.createBottomSheetHelpIntent(this, new OnBoardingModel(getString(R.string.bottom_on_boarding_title_send_money), BottomSheetType.LIST, this.toIntRange, "send_money")));
    }

    private boolean getMax() {
        return getIntent().getExtras() != null && getIntent().getExtras().getBoolean("bundle_extra_for_resume");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-789868208, oncanceled);
            onCancelLoad.getMin(-789868208, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == setMax) {
                setMax((RecipientModel) intent.getParcelableExtra("data"));
            } else if (i == DecodeWrapper.AnonymousClass2.length) {
                this.getMin.setMax(intent.getExtras());
            }
        }
        if (-1 == i2 && setMax == i) {
            setUseAmcsLite min2 = ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this).setMax((View) this.tvHelpRightButton)).setMin(new getUseSecurityGuard((float) SplitBillIntroductionActivity.SPOTLIGHT_SIZE))).getMin(new access$1402(getResources().getString(R.string.tooltip_highlight_title), getResources().getString(R.string.tooltip_highlight_description_send_money)))).getMin();
            if (this.IsOverlapping == null) {
                initRect initrect = new initRect(this);
                initrect.toString = min2;
                this.IsOverlapping = ((initRect) ((initRect) ((initRect) initrect.setMax((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f))).length(false)).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                    public final void onFinished(int i) {
                        PhotoView.PhotoInter unused = RecipientActivity.this.IsOverlapping = null;
                    }
                })).length();
            }
        }
    }

    /* access modifiers changed from: private */
    public void setMax(RecipientModel recipientModel) {
        recipientModel.ICustomTabsCallback = "send_money";
        if (!"bank".equals(recipientModel.onNavigationEvent) || CornerMarkingDataProvider.getMax() || !this.getMax) {
            Intent intentClassWithTracking = getIntentClassWithTracking(CalculatorActivity.class);
            intentClassWithTracking.putExtra("data", recipientModel);
            intentClassWithTracking.putExtra("transferScenario", getIntent().getStringExtra("transferScenario"));
            startActivity(intentClassWithTracking);
            return;
        }
        new isBaselineAligned(this, isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelable(false).message(Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton((Integer) null, (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
    }

    static /* synthetic */ void access$200(RecipientActivity recipientActivity, RecipientModel recipientModel) {
        if ("contact".equals(recipientModel.onNavigationEvent)) {
            recipientModel.getCause = "sendMoney";
        }
    }

    static /* synthetic */ void access$400(RecipientActivity recipientActivity) {
        recipientActivity.setMin();
        recipientActivity.startActivityForResult(BottomSheetOnBoardingActivity.createOnBoardingIntent(recipientActivity, new OnBoardingModel(recipientActivity.getString(R.string.bottom_on_boarding_title_send_money), BottomSheetType.VIEW_PAGER, recipientActivity.toIntRange, "send_money")), setMax);
    }
}
