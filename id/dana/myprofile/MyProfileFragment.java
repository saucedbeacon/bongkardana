package id.dana.myprofile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.C;
import id.dana.R;
import id.dana.appwidget.DanaIncomeWidgetProvider;
import id.dana.appwidget.DanaStatementWidgetProvider;
import id.dana.base.BaseActivity;
import id.dana.base.BaseWithToolbarFragment;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.staticqr.GetStaticQrModule;
import id.dana.contract.user.GetBalanceModule;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.data.profilemenu.MyProfileMenuCategories;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.InvestmentModule;
import id.dana.di.modules.MyProfileModule;
import id.dana.di.modules.SavingModule;
import id.dana.di.modules.UserStatementModule;
import id.dana.domain.profilemenu.model.ProfileCompletion;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.statement.StatementType;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.home.HomeTabActivity;
import id.dana.model.CurrencyAmountModel;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.OnboardingParams;
import id.dana.pay.PayCardInfo;
import id.dana.promocode.views.RedeemPromoCodeActivity;
import id.dana.promoquest.activity.MissionListActivity;
import id.dana.referral.MyReferralDetailActivity;
import id.dana.richview.SimpleProfileWithQrView;
import id.dana.savings.activity.SavingsActivity;
import id.dana.social.view.activity.ChangeUsernameActivity;
import id.dana.statement.TimeUnitInterval;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import id.dana.utils.CustomLinearLayoutManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import o.AUTextView;
import o.AutoMigration;
import o.BottomPopup;
import o.CameraView;
import o.ConfirmPopup;
import o.CustomPopMenuExtension;
import o.DefaultToastImplExtension;
import o.GriverAppLanguageExtensionImpl;
import o.GriverGeoLocationExtensionImpl;
import o.OnTouch;
import o.PhotoView;
import o.PrepareException;
import o.SightCameraView;
import o.SubPackageDownloader;
import o.TinyAppActionState;
import o.TinyAppActionStateController;
import o.TrackerConfigBridgeExtension;
import o.Workflow;
import o.access$1402;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.drawableToBitmap;
import o.fakeDragBy;
import o.fillAppInfo;
import o.genTextSelector;
import o.getAppPerfKey;
import o.getChildrenSkipCount;
import o.getCurrentTheme;
import o.getEvents;
import o.getInitScene;
import o.getMaxTextureSize;
import o.getPagePerfKey;
import o.getPerformanceStages;
import o.getSelectedIndex;
import o.getTransitionProperties;
import o.getUseAmcsLite;
import o.getWorkSpaceId;
import o.initRect;
import o.initUC7zSo;
import o.isBaselineAligned;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.onNext;
import o.onSwitchToWhiteTheme;
import o.parameters;
import o.prepareAppModel;
import o.setButtonStyle;
import o.setCancelOnTouchOutside$core;
import o.setH5OptionMenuTextFlag;
import o.setInitScene;
import o.setLineVisible;
import o.setResult;
import o.setStateOn;
import o.setTinyLocalStorage;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.startPullDownRefresh;
import o.stopIgnoring;
import o.trackerConfig;
import o.updateActionSheetContent;
import o.updateCornerMarking;
import o.updateFavoriteMenuItem;
import o.updateScreenRotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ValidFragment"})
public class MyProfileFragment extends BaseWithToolbarFragment implements setInitScene.setMax {
    private static final int setMax = ((int) (Resources.getSystem().getDisplayMetrics().density * 0.0f));
    private static final int setMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 6.0f));
    /* access modifiers changed from: private */
    public setStateOn FastBitmap$CoordinateSystem;
    private deleteAppInfoById IsOverlapping;
    /* access modifiers changed from: private */
    public boolean Mean$Arithmetic;
    @Inject
    public getSelectedIndex.length bottomSheetOnBoardingPresenter;
    @BindView(2131362155)
    Button buttonVerify;
    private onDetachedFromLayoutParams equals;
    @Inject
    public parameters.setMax getBalancePresenter;
    /* access modifiers changed from: private */
    public final TinyAppActionState getMin;
    @Inject
    public OnTouch.setMin getStaticQrPresenter;
    @Inject
    public AUTextView.OnVisibilityChangeListener.setMax getUserStatementPresenter;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    private boolean hashCode;
    @Inject
    public GriverAppLanguageExtensionImpl.length investmentPresenter;
    private boolean invoke;
    /* access modifiers changed from: private */
    public boolean invokeSuspend;
    private DefaultToastImplExtension isInside;
    @Inject
    public getAppPerfKey knowledgeBasedInfoManager;
    @Inject
    public setInitScene.setMin myProfilePresenter;
    @BindView(2131364178)
    NestedScrollView nsvProfile;
    @Inject
    public getTransitionProperties.setMin profileQrDeepLinkPresenter;
    @BindView(2131364274)
    SimpleProfileWithQrView profileView;
    @BindView(2131363593)
    TextView qrTapInfo;
    @Inject
    public fakeDragBy.length queryPayPresenter;
    @BindView(2131364545)
    RecyclerView rvProfileSetting;
    @Inject
    public updateScreenRotation.setMin savingPresenter;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter toDoubleRange;
    /* access modifiers changed from: private */
    public String toFloatRange;
    private SubPackageDownloader.Callback toIntRange;
    private Handler toString = new Handler();
    private boolean valueOf;
    private setStateOn values;

    public void dismissProgress() {
    }

    public void onClickLeftMenuButton(View view) {
    }

    public final int setMin() {
        return R.layout.fragment_myprofile;
    }

    public void showProgress() {
    }

    public MyProfileFragment() {
        TinyAppActionState.getMax getmax = new TinyAppActionState.getMax((Fragment) this);
        getmax.setMin = GriverEnv.getApplicationContext().getString(R.string.pick_profile_photo_title);
        getmax.length = new TinyAppActionStateController() {
            public final void length(Exception exc) {
            }

            public final void length(Uri uri, String str) {
                MyProfileFragment.this.myProfilePresenter.setMax(ConfirmPopup.AnonymousClass2.setMax(MyProfileFragment.this.getActivity().getApplicationContext(), uri.toString()));
            }
        };
        getmax.toIntRange = setStateOn.getMin(GriverEnv.getApplicationContext(), "android.permission.CAMERA");
        getmax.toFloatRange = setStateOn.getMin(GriverEnv.getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        this.getMin = new TinyAppActionState(getmax, (byte) 0);
    }

    public static MyProfileFragment values() {
        return new MyProfileFragment();
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        String string = getResources().getString(R.string.my_account);
        if (this.toolbarTitle != null) {
            this.toolbarTitle.setText(string);
        }
        if (this.toIntRange == null) {
            prepareAppModel.length length = new prepareAppModel.length((byte) 0);
            if (this.getMax != null) {
                r3 = this.getMax.getApplicationComponent();
            } else {
                r3 = null;
            }
            if (r3 != null) {
                length.FastBitmap$CoordinateSystem = r3;
                length.setMin = new MyProfileModule(this);
                length.length = new GetStaticQrModule(new OnTouch.length() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void getMin(String str) {
                        String unused = MyProfileFragment.this.toFloatRange = str;
                        if (!MyProfileFragment.toIntRange(str)) {
                            MyProfileFragment.this.equals(str);
                        } else {
                            MyProfileFragment.getMax(MyProfileFragment.this, str);
                        }
                    }

                    public final void setMin(boolean z) {
                        boolean unused = MyProfileFragment.this.Mean$Arithmetic = z;
                        if (z) {
                            MyProfileFragment.this.equals("https://link.dana.id/QRISProfile");
                            MyProfileFragment.this.qrTapInfo.setVisibility(0);
                            return;
                        }
                        MyProfileFragment.this.getStaticQrPresenter.length();
                        MyProfileFragment.this.qrTapInfo.setVisibility(8);
                    }
                });
                length.getMin = new GetBalanceModule(new parameters.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void length(Boolean bool) {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void setMax(CurrencyAmountModel currencyAmountModel) {
                        MyProfileFragment.this.getMax(setLineVisible.length(currencyAmountModel));
                    }

                    public final void getMax() {
                        CustomPopMenuExtension customPopMenuExtension = MyProfileFragment.this.sessionExpiredManager;
                        BaseActivity baseActivity = MyProfileFragment.this.getMax;
                        customPopMenuExtension.setMax = baseActivity;
                        customPopMenuExtension.length = new deleteAppInfoById(customPopMenuExtension.setMax);
                        baseActivity.showWarningDialog(baseActivity.getString(R.string.session_expired_desc), (DialogInterface.OnDismissListener) new onSwitchToWhiteTheme(customPopMenuExtension), false);
                    }
                });
                length.setMax = new QueryPayMethodModule(new fakeDragBy.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void getMax() {
                    }

                    public final void length() {
                    }

                    public final void length(String str, String str2, List<PayCardInfo> list, boolean z, boolean z2) {
                    }

                    public final void setMax(String str, List<PayCardInfo> list) {
                    }

                    public final void setMin(Boolean bool) {
                    }

                    public final void showProgress() {
                    }

                    public final void length(int i) {
                        int max = dispatchOnCancelled.setMax(i);
                        if (i != max) {
                            onCanceled oncanceled = new onCanceled(i, max, 1);
                            onCancelLoad.setMax(1994655087, oncanceled);
                            onCancelLoad.getMin(1994655087, oncanceled);
                        }
                        MyProfileFragment.getMax(MyProfileFragment.this, i);
                    }

                    public final void onError(String str) {
                        MyProfileFragment.this.setMin("-");
                        updateActionSheetContent.exception(DanaLogConstants.TAG.QRCODE_TAG, DanaLogConstants.Prefix.QRCODE_QUERY_PAY_METHOD_PREFIX, str);
                    }
                });
                length.getMax = new GenerateDeepLinkModule((getTransitionProperties.setMax) new getTransitionProperties.setMax() {
                    public final void setMax(String str) {
                        MyProfileFragment.setMax(MyProfileFragment.this, str);
                    }

                    public final void getMin() {
                        if (MyProfileFragment.this.getStaticQrPresenter != null) {
                            MyProfileFragment.this.getStaticQrPresenter.length();
                        }
                    }

                    public final void showProgress() {
                        if (MyProfileFragment.this.profileView != null) {
                            MyProfileFragment.this.profileView.showSkeleton();
                        }
                    }

                    public final void dismissProgress() {
                        if (MyProfileFragment.this.profileView != null) {
                            MyProfileFragment.this.profileView.hideSkeleton();
                        }
                    }

                    public final void onError(String str) {
                        Toast.makeText(MyProfileFragment.this.getActivity(), str, 0).show();
                    }
                });
                length.toIntRange = new BottomSheetOnBoardingModule(new getSelectedIndex.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void setMax(boolean z, @Nullable String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
                        MyProfileFragment.length(MyProfileFragment.this, z, str);
                    }

                    public final void onError(String str) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getClass().getName());
                        sb.append(", on Error: ");
                        sb.append(str);
                        updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
                    }
                });
                length.IsOverlapping = new GlobalNetworkModule(new Workflow() {
                    public final void setMax(boolean z, String str) {
                        MyProfileFragment.setMin(MyProfileFragment.this, z, str);
                    }

                    public final void setMax(initUC7zSo inituc7zso) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(inituc7zso.getCurrencySymbol());
                        sb.append(inituc7zso.getForexAmount());
                        MyProfileFragment.this.getMax(sb.toString());
                    }
                });
                length.equals = new UserStatementModule(new AUTextView.OnTvGlobalLayoutListener() {
                    public final void getMin(@NotNull String str, @NotNull String str2) {
                        MyProfileFragment myProfileFragment = MyProfileFragment.this;
                        MyProfileFragment.setMax(myProfileFragment, MyProfileFragment.length(myProfileFragment), str, str2);
                    }

                    public final void length(@NotNull String str, @NotNull String str2) {
                        MyProfileFragment myProfileFragment = MyProfileFragment.this;
                        MyProfileFragment.length(myProfileFragment, MyProfileFragment.length(myProfileFragment), str, str2);
                    }
                });
                length.isInside = new SavingModule(new CameraView.AnonymousClass2() {
                    public final void getMax(@NotNull SightCameraView sightCameraView) {
                        MyProfileFragment.getMax(MyProfileFragment.this, sightCameraView);
                    }
                });
                length.toFloatRange = new InvestmentModule(new GriverAppLanguageExtensionImpl.getMax() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    public final void setMin(boolean z) {
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }

                    public final void setMax(@NotNull GriverGeoLocationExtensionImpl.AnonymousClass3 r2) {
                        MyProfileFragment.setMax(MyProfileFragment.this, r2);
                    }
                });
                stopIgnoring.setMin(length.setMin, MyProfileModule.class);
                stopIgnoring.setMin(length.getMin, GetBalanceModule.class);
                stopIgnoring.setMin(length.length, GetStaticQrModule.class);
                stopIgnoring.setMin(length.getMax, GenerateDeepLinkModule.class);
                stopIgnoring.setMin(length.setMax, QueryPayMethodModule.class);
                stopIgnoring.setMin(length.toIntRange, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(length.IsOverlapping, GlobalNetworkModule.class);
                stopIgnoring.setMin(length.equals, UserStatementModule.class);
                stopIgnoring.setMin(length.isInside, SavingModule.class);
                stopIgnoring.setMin(length.toFloatRange, InvestmentModule.class);
                stopIgnoring.setMin(length.FastBitmap$CoordinateSystem, PrepareException.AnonymousClass1.class);
                this.toIntRange = new prepareAppModel(length.setMin, length.getMin, length.length, length.getMax, length.setMax, length.toIntRange, length.IsOverlapping, length.equals, length.isInside, length.toFloatRange, length.FastBitmap$CoordinateSystem, (byte) 0);
            } else {
                throw null;
            }
        }
        this.toIntRange.getMin(this);
        getMin(this.myProfilePresenter, this.getStaticQrPresenter, this.profileQrDeepLinkPresenter, this.bottomSheetOnBoardingPresenter, this.globalNetworkPresenter, this.savingPresenter, this.investmentPresenter);
        this.profileView.setQrImageListener(new getPerformanceStages(this));
        setStateOn.getMin getmin = new setStateOn.getMin((Fragment) this);
        getmin.length.add("android.permission.CAMERA");
        getmin.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                MyProfileFragment.this.getMin.length();
            }
        };
        this.FastBitmap$CoordinateSystem = new setStateOn(getmin, (byte) 0);
        setStateOn.getMin getmin2 = new setStateOn.getMin((Fragment) this);
        getmin2.length.add("android.permission.WRITE_EXTERNAL_STORAGE");
        getmin2.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                MyProfileFragment.this.FastBitmap$CoordinateSystem.setMin();
            }
        };
        this.values = new setStateOn(getmin2, (byte) 0);
        DefaultToastImplExtension defaultToastImplExtension = new DefaultToastImplExtension();
        this.isInside = defaultToastImplExtension;
        defaultToastImplExtension.length = new getEvents(this);
        this.rvProfileSetting.setLayoutManager(new CustomLinearLayoutManager(getContext()));
        this.rvProfileSetting.setNestedScrollingEnabled(false);
        this.rvProfileSetting.setAdapter(this.isInside);
        this.nsvProfile.setOnScrollChangeListener(new fillAppInfo(this));
    }

    public void onResume() {
        super.onResume();
        if (getActivity() instanceof HomeTabActivity) {
            ((HomeTabActivity) getActivity()).setSwipeable(false);
        }
        setInitScene.setMin setmin = this.myProfilePresenter;
        if (setmin != null) {
            setmin.getMin();
        }
    }

    public final void o_() {
        this.hashCode = true;
        if (this.myProfilePresenter != null) {
            if (this.isInside.setMax()) {
                this.myProfilePresenter.length("setting_collection_me");
            } else {
                setInitScene.setMin setmin = this.myProfilePresenter;
                if (setmin != null) {
                    setmin.getMin();
                }
                this.globalNetworkPresenter.setMin();
                GriverAppLanguageExtensionImpl.length length = this.investmentPresenter;
                if (length != null) {
                    length.setMin();
                }
            }
            this.myProfilePresenter.length();
        }
        fakeDragBy.length length2 = this.queryPayPresenter;
        if (length2 != null) {
            length2.getMax();
        }
        OnTouch.setMin setmin2 = this.getStaticQrPresenter;
        if (setmin2 != null) {
            setmin2.getMin();
        }
        updateScreenRotation.setMin setmin3 = this.savingPresenter;
        if (setmin3 != null) {
            setmin3.setMin();
        }
    }

    public final void IsOverlapping() {
        SimpleProfileWithQrView simpleProfileWithQrView = this.profileView;
        if (simpleProfileWithQrView != null) {
            simpleProfileWithQrView.hideSkeleton();
        }
        setInitScene.setMin setmin = this.myProfilePresenter;
        if (setmin != null) {
            setmin.IsOverlapping();
        }
        fakeDragBy.length length = this.queryPayPresenter;
        if (length != null) {
            length.setMax();
        }
        this.toString.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    public void equals(String str) {
        SimpleProfileWithQrView simpleProfileWithQrView = this.profileView;
        if (simpleProfileWithQrView != null && simpleProfileWithQrView.getQrImageView() != null) {
            this.profileView.showSkeleton();
            length(BottomPopup.getMin(str).subscribe(new trackerConfig(this), new TrackerConfigBridgeExtension(this)));
        }
    }

    /* access modifiers changed from: private */
    public static boolean toIntRange(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("http");
        }
        return false;
    }

    public final void length(String str) {
        SimpleProfileWithQrView simpleProfileWithQrView = this.profileView;
        if (simpleProfileWithQrView != null) {
            simpleProfileWithQrView.setUserName(str);
        }
    }

    public final void setMax(String str) {
        SimpleProfileWithQrView simpleProfileWithQrView = this.profileView;
        if (simpleProfileWithQrView != null) {
            simpleProfileWithQrView.setPhoneNumber(str);
        }
    }

    public final void getMax(String str) {
        DefaultToastImplExtension defaultToastImplExtension;
        SettingModel settingModel;
        if (!TextUtils.isEmpty(str) && (defaultToastImplExtension = this.isInside) != null) {
            int length = defaultToastImplExtension.length("setting_balance");
            if (defaultToastImplExtension.getMin(length)) {
                settingModel = (SettingModel) defaultToastImplExtension.getMax.getMin.get(length);
            } else {
                settingModel = SettingModel.empty();
            }
            if (!settingModel.isNullObject()) {
                settingModel.setSubtitle(str);
                this.isInside.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r5 = r4.isInside;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            o.DefaultToastImplExtension r0 = r4.isInside
            java.lang.String r1 = "setting_my_payment_cards"
            int r2 = r0.length(r1)
            boolean r3 = r0.getMin(r2)
            if (r3 == 0) goto L_0x0020
            o.isQwertyMode<id.dana.domain.profilemenu.model.SettingModel> r0 = r0.getMax
            java.util.List<T> r0 = r0.getMin
            java.lang.Object r0 = r0.get(r2)
            id.dana.domain.profilemenu.model.SettingModel r0 = (id.dana.domain.profilemenu.model.SettingModel) r0
            goto L_0x0024
        L_0x0020:
            id.dana.domain.profilemenu.model.SettingModel r0 = id.dana.domain.profilemenu.model.SettingModel.empty()
        L_0x0024:
            boolean r2 = r0.isNullObject()
            if (r2 == 0) goto L_0x002b
            return
        L_0x002b:
            r0.setSubtitle(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r4.rvProfileSetting
            if (r5 == 0) goto L_0x0048
            o.DefaultToastImplExtension r0 = r4.isInside
            if (r0 == 0) goto L_0x0048
            boolean r5 = r5.isComputingLayout()
            if (r5 != 0) goto L_0x0048
            o.DefaultToastImplExtension r5 = r4.isInside
            int r0 = r5.length(r1)
            r1 = -1
            if (r0 == r1) goto L_0x0048
            r5.notifyItemChanged(r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.myprofile.MyProfileFragment.setMin(java.lang.String):void");
    }

    public final void getMin(String str) {
        if (!TextUtils.isEmpty(str) && this.isInside != null && getContext() != null && this.profileView != null) {
            ((updateCornerMarking) Glide.getMax(getContext())).equals().length(str).setMin((int) R.drawable.avatar_placeholder).length(this.profileView.getUserProfileImageView());
            this.profileView.stopRefreshAnimation();
        }
    }

    public void onError(String str) {
        Toast.makeText(getActivity(), this.getMax.getString(R.string.general_error_msg), 0).show();
    }

    public final void getMin(List<SettingModel> list) {
        DefaultToastImplExtension defaultToastImplExtension = this.isInside;
        defaultToastImplExtension.getMax.setMax(new ArrayList(list));
        setInitScene.setMin setmin = this.myProfilePresenter;
        if (setmin != null) {
            setmin.getMin();
        }
        this.globalNetworkPresenter.setMin();
        GriverAppLanguageExtensionImpl.length length = this.investmentPresenter;
        if (length != null) {
            length.setMin();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00b3
            boolean r8 = toFloatRange((java.lang.String) r8)
            r7.invoke = r8
            if (r8 == 0) goto L_0x0021
            android.widget.Button r8 = r7.buttonVerify
            if (r8 == 0) goto L_0x0017
            r9 = 8
            r8.setVisibility(r9)
        L_0x0017:
            id.dana.richview.SimpleProfileWithQrView r8 = r7.profileView
            if (r8 == 0) goto L_0x009d
            r9 = 1
            r8.onPremiumUser(r9)
            goto L_0x009d
        L_0x0021:
            android.widget.Button r8 = r7.buttonVerify
            r0 = 0
            if (r8 == 0) goto L_0x0096
            r8.setVisibility(r0)
            android.widget.Button r8 = r7.buttonVerify
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = "FAILED"
            java.lang.String r3 = "WAITING_DOC"
            r4 = 2131232501(0x7f0806f5, float:1.8081113E38)
            java.lang.String r5 = "MANUAL_REVIEW"
            java.lang.String r6 = "IN_PROGRESS"
            if (r1 != 0) goto L_0x005a
            boolean r1 = r6.equals(r9)
            if (r1 == 0) goto L_0x0043
            goto L_0x005d
        L_0x0043:
            boolean r1 = r5.equals(r9)
            if (r1 != 0) goto L_0x005d
            boolean r1 = r3.equals(r9)
            if (r1 == 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            boolean r1 = r2.equals(r9)
            if (r1 == 0) goto L_0x005a
            r4 = 2131232500(0x7f0806f4, float:1.808111E38)
            goto L_0x005d
        L_0x005a:
            r4 = 2131232498(0x7f0806f2, float:1.8081107E38)
        L_0x005d:
            r8.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r4, r0)
            android.widget.Button r8 = r7.buttonVerify
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x0090
            boolean r1 = r6.equals(r9)
            if (r1 == 0) goto L_0x0072
            r9 = 2131887683(0x7f120643, float:1.940998E38)
            goto L_0x0093
        L_0x0072:
            boolean r1 = r3.equals(r9)
            if (r1 == 0) goto L_0x007c
            r9 = 2131887694(0x7f12064e, float:1.9410002E38)
            goto L_0x0093
        L_0x007c:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0086
            r9 = 2131887681(0x7f120641, float:1.9409976E38)
            goto L_0x0093
        L_0x0086:
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x0090
            r9 = 2131887680(0x7f120640, float:1.9409974E38)
            goto L_0x0093
        L_0x0090:
            r9 = 2131887671(0x7f120637, float:1.9409956E38)
        L_0x0093:
            r8.setText(r9)
        L_0x0096:
            id.dana.richview.SimpleProfileWithQrView r8 = r7.profileView
            if (r8 == 0) goto L_0x009d
            r8.onPremiumUser(r0)
        L_0x009d:
            boolean r8 = r7.hashCode
            if (r8 == 0) goto L_0x00b3
            android.os.Handler r8 = r7.toString
            r9 = 0
            r8.removeCallbacksAndMessages(r9)
            android.os.Handler r8 = r7.toString
            o.RVPerformanceTrackerImpl r9 = new o.RVPerformanceTrackerImpl
            r9.<init>(r7)
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.postDelayed(r9, r0)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.myprofile.MyProfileFragment.getMax(java.lang.String, java.lang.String):void");
    }

    public final void getMax(getPagePerfKey getpageperfkey) {
        SettingModel settingModel;
        DefaultToastImplExtension defaultToastImplExtension = this.isInside;
        if (defaultToastImplExtension != null) {
            int length = defaultToastImplExtension.length("setting_kyb");
            if (defaultToastImplExtension.getMin(length)) {
                settingModel = (SettingModel) defaultToastImplExtension.getMax.getMin.get(length);
            } else {
                settingModel = SettingModel.empty();
            }
            if (!settingModel.isNullObject()) {
                this.myProfilePresenter.setMax(settingModel, getpageperfkey);
                DefaultToastImplExtension defaultToastImplExtension2 = this.isInside;
                defaultToastImplExtension2.getMax.setMax(new ArrayList(defaultToastImplExtension2.getMax.getMin));
            }
        }
    }

    public final void getMin() {
        if (getContext() != null) {
            setButtonStyle.setMax(getContext());
            drawableToBitmap.length(getContext());
        }
        convertDipToPx.length length = new convertDipToPx.length(this.getMax);
        length.getMax = TrackerKey.Event.LOGOUT;
        convertDipToPx.length max = length.setMax(TrackerKey.Property.LOGOUT_TYPE, "Normal");
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        updateFavoriteMenuItem.getMin((Activity) null);
        if (this.getMax != null) {
            AutoMigration.setMax(this.getMax.getApplication());
        }
        OnboardingActivity.openAfterLogout(this.getMax);
    }

    public final void equals() {
        deleteAppInfoById deleteappinfobyid = new deleteAppInfoById(this.getMax);
        this.IsOverlapping = deleteappinfobyid;
        if (!deleteappinfobyid.length.isShowing()) {
            try {
                deleteappinfobyid.length.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void toIntRange() {
        this.IsOverlapping.getMin();
    }

    public final void getMin(boolean z) {
        this.invokeSuspend = z;
        if (!z) {
            return;
        }
        if (!this.valueOf) {
            getMax(toDoubleRange());
            return;
        }
        NestedScrollView nestedScrollView = this.nsvProfile;
        if (nestedScrollView != null) {
            nestedScrollView.smoothScrollTo(0, 0);
        }
    }

    public final void getMax(SettingModel settingModel) {
        if (!FastBitmap$CoordinateSystem()) {
            DefaultToastImplExtension defaultToastImplExtension = this.isInside;
            ArrayList arrayList = new ArrayList(defaultToastImplExtension.getMax.getMin);
            arrayList.add(0, settingModel);
            defaultToastImplExtension.getMax.setMax(arrayList);
        } else if (FastBitmap$CoordinateSystem()) {
            settingModel.setKycRevoked(!this.invoke);
            DefaultToastImplExtension defaultToastImplExtension2 = this.isInside;
            ArrayList arrayList2 = new ArrayList(defaultToastImplExtension2.getMax.getMin);
            arrayList2.set(0, settingModel);
            defaultToastImplExtension2.getMax.setMax(arrayList2);
        }
        if (this.hashCode) {
            this.toString.removeCallbacksAndMessages((Object) null);
            this.toString.postDelayed(new getInitScene(this), 500);
        }
    }

    private static boolean toFloatRange(String str) {
        return "KYC2".equals(str);
    }

    private void isInside(String str) {
        String min = isShowMenu.setMin(str);
        if (min.contains(DanaLogConstants.BizType.TOPUP)) {
            min = setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/portal/topup?entryPoint={entryPoint}").getMin(UrlTag.ENTRY_POINT, TopupSource.PROFILE_PAGE).getMax();
        }
        DanaH5.startContainerFullUrl(min, new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                MyProfileFragment.setMax(MyProfileFragment.this);
                MyProfileFragment.setMin(MyProfileFragment.this);
            }
        });
    }

    public final void getMax() {
        CustomPopMenuExtension customPopMenuExtension = this.sessionExpiredManager;
        BaseActivity baseActivity = this.getMax;
        customPopMenuExtension.setMax = baseActivity;
        customPopMenuExtension.length = new deleteAppInfoById(customPopMenuExtension.setMax);
        baseActivity.showWarningDialog(baseActivity.getString(R.string.session_expired_desc), (DialogInterface.OnDismissListener) new onSwitchToWhiteTheme(customPopMenuExtension), false);
    }

    private boolean FastBitmap$CoordinateSystem() {
        return this.isInside.getItemViewType(0) == 13;
    }

    @androidx.annotation.Nullable
    private setUseAmcsLite toDoubleRange() {
        View findViewById;
        RecyclerView recyclerView = this.rvProfileSetting;
        RecyclerView.valueOf findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(0) : null;
        if (findViewHolderForLayoutPosition == null || (findViewById = findViewHolderForLayoutPosition.itemView.findViewById(R.id.f71482131365781)) == null) {
            return null;
        }
        int i = setMin;
        int i2 = setMax;
        return ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(getActivity()).getMax(findViewById)).setMin(new getUseAmcsLite(findViewById, (float) i, (float) i, i2, i2, i2, i2))).getMin(new access$1402(getString(R.string.lbl_profile_completion_tooltip_title), getString(R.string.lbl_profile_completion_tooltip_message)))).getMin();
    }

    private void getMax(setUseAmcsLite setuseamcslite) {
        if (setuseamcslite != null && this.toDoubleRange == null) {
            initRect initrect = new initRect(this.getMax);
            initrect.toString = setuseamcslite;
            this.toDoubleRange = ((initRect) ((initRect) ((initRect) initrect.setMin((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)))).length(false)).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    PhotoView.PhotoInter unused = MyProfileFragment.this.toDoubleRange = null;
                    boolean unused2 = MyProfileFragment.this.invokeSuspend = false;
                    MyProfileFragment.this.myProfilePresenter.FastBitmap$CoordinateSystem();
                }
            })).length();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (!setMax(i, strArr, iArr) && !setMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    private boolean setMax(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.FastBitmap$CoordinateSystem;
        return setstateon != null && setstateon.getMin(i, strArr, iArr);
    }

    private boolean setMin(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.values;
        return setstateon != null && setstateon.getMin(i, strArr, iArr);
    }

    public void onPause() {
        if (getActivity() instanceof HomeTabActivity) {
            ((HomeTabActivity) getActivity()).setSwipeable(true);
        }
        super.onPause();
    }

    public final void length() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.equals = null;
        }
    }

    public final void getMax(boolean z) {
        convertDipToPx.length length = new convertDipToPx.length(this.getMax.getApplicationContext());
        length.getMax = TrackerKey.Event.REFERRER_PAGE_OPEN;
        convertDipToPx.length max = length.setMax("Source", TrackerKey.SourceType.ME_PAGE);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        Intent intent = new Intent(this.getMax, MyReferralDetailActivity.class);
        intent.putExtra(MyReferralDetailActivity.BundleKey.BUNDLE_REFERRAL_CONSULT, this.myProfilePresenter.getMax());
        intent.putExtra(MyReferralDetailActivity.BundleKey.BUNDLE_REFERRAL_DEEPLINK, this.myProfilePresenter.setMin());
        intent.putExtra(MyReferralDetailActivity.BundleKey.BUNDLE_SHOW_REFERRAL, z);
        startActivity(intent);
    }

    @OnClick({2131362155})
    public void onKycClick(View view) {
        isInside("https://m.dana.id/m/kyc/landingPage?entryPoint=profile");
    }

    static /* synthetic */ void setMax(MyProfileFragment myProfileFragment, GriverGeoLocationExtensionImpl.AnonymousClass3 r4) {
        SettingModel settingModel;
        DefaultToastImplExtension defaultToastImplExtension = myProfileFragment.isInside;
        if (defaultToastImplExtension != null) {
            int length = defaultToastImplExtension.length("setting_investment");
            if (defaultToastImplExtension.getMin(length)) {
                settingModel = (SettingModel) defaultToastImplExtension.getMax.getMin.get(length);
            } else {
                settingModel = SettingModel.empty();
            }
            if (!settingModel.isNullObject()) {
                String collection = settingModel.getCollection();
                if (!TextUtils.isEmpty(collection) || MyProfileMenuCategories.PROFILE_USER_SERVICE.equalsIgnoreCase(collection) || MyProfileMenuCategories.PROFILE_FEATURES.equalsIgnoreCase(collection)) {
                    settingModel.setUserInvestmentInfo(new getWorkSpaceId(r4.setMax));
                }
                myProfileFragment.isInside.notifyDataSetChanged();
            }
        }
    }

    static /* synthetic */ void getMax(MyProfileFragment myProfileFragment, SightCameraView sightCameraView) {
        DefaultToastImplExtension defaultToastImplExtension;
        SettingModel settingModel;
        if (sightCameraView != null && (defaultToastImplExtension = myProfileFragment.isInside) != null) {
            int length = defaultToastImplExtension.length(ProfileUserServiceType.SAVING);
            if (defaultToastImplExtension.getMin(length)) {
                settingModel = (SettingModel) defaultToastImplExtension.getMax.getMin.get(length);
            } else {
                settingModel = SettingModel.empty();
            }
            if (!settingModel.isNullObject()) {
                setResult setresult = setResult.setMax;
                settingModel.setSubtitle(setResult.setMax(sightCameraView));
                DefaultToastImplExtension defaultToastImplExtension2 = myProfileFragment.isInside;
                int length2 = defaultToastImplExtension2.length(ProfileUserServiceType.SAVING);
                if (length2 != -1) {
                    defaultToastImplExtension2.notifyItemChanged(length2);
                }
            }
        }
    }

    static /* synthetic */ SettingModel length(MyProfileFragment myProfileFragment) {
        DefaultToastImplExtension defaultToastImplExtension = myProfileFragment.isInside;
        int length = defaultToastImplExtension.length(MyProfileMenuAction.SETTING_STATEMENT);
        if (defaultToastImplExtension.getMin(length)) {
            return (SettingModel) defaultToastImplExtension.getMax.getMin.get(length);
        }
        return SettingModel.empty();
    }

    static /* synthetic */ void setMax(MyProfileFragment myProfileFragment, SettingModel settingModel, String str, String str2) {
        if (settingModel != null) {
            settingModel.setIncome(str);
            settingModel.setCurrency(str2);
            myProfileFragment.isInside.notifyDataSetChanged();
            Context context = myProfileFragment.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            DanaIncomeWidgetProvider.updateIncomeBalance(context, sb.toString());
        }
    }

    static /* synthetic */ void length(MyProfileFragment myProfileFragment, SettingModel settingModel, String str, String str2) {
        if (settingModel != null) {
            settingModel.setExpense(str);
            settingModel.setCurrency(str2);
            myProfileFragment.isInside.notifyDataSetChanged();
            Context context = myProfileFragment.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            DanaStatementWidgetProvider.updateExpenseBalance(context, sb.toString());
        }
    }

    static /* synthetic */ void setMin(MyProfileFragment myProfileFragment, boolean z, String str) {
        if (z) {
            myProfileFragment.globalNetworkPresenter.setMax(str);
            return;
        }
        parameters.setMax setmax = myProfileFragment.getBalancePresenter;
        if (setmax != null) {
            setmax.getMin();
        }
        AUTextView.OnVisibilityChangeListener.setMax setmax2 = myProfileFragment.getUserStatementPresenter;
        if (setmax2 != null) {
            setmax2.getMin(new getCurrentTheme(Calendar.getInstance().getTimeInMillis(), TimeUnitInterval.MONTH, StatementType.ALL));
        }
    }

    static /* synthetic */ void length(MyProfileFragment myProfileFragment, boolean z, String str) {
        if (z) {
            str = isShowMenu.getMin(str, OnboardingParams.FIRST_TIME_TOP_UP);
        }
        myProfileFragment.isInside(str);
    }

    static /* synthetic */ void setMax(MyProfileFragment myProfileFragment, String str) {
        myProfileFragment.toFloatRange = str;
        myProfileFragment.equals(str);
    }

    static /* synthetic */ void getMax(MyProfileFragment myProfileFragment, int i) {
        if (myProfileFragment.getContext() != null && myProfileFragment.isAdded()) {
            myProfileFragment.setMin(myProfileFragment.getResources().getQuantityString(R.plurals.f75192131755008, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    static /* synthetic */ void getMax(MyProfileFragment myProfileFragment, String str) {
        getTransitionProperties.setMin setmin = myProfileFragment.profileQrDeepLinkPresenter;
        if (setmin != null) {
            setmin.getMin(str, myProfileFragment.getString(R.string.deeplink_title_request_money), myProfileFragment.getString(R.string.deeplink_description_request_money), true);
        }
    }

    static /* synthetic */ void setMax(MyProfileFragment myProfileFragment) {
        setInitScene.setMin setmin = myProfileFragment.myProfilePresenter;
        if (setmin != null) {
            setmin.getMin();
        }
    }

    static /* synthetic */ void setMin(MyProfileFragment myProfileFragment) {
        fakeDragBy.length length = myProfileFragment.queryPayPresenter;
        if (length != null) {
            length.getMax();
        }
    }

    public static /* synthetic */ void getMax(MyProfileFragment myProfileFragment, Bitmap bitmap) {
        myProfileFragment.profileView.hideSkeleton();
        myProfileFragment.profileView.getQrImageView().setImageBitmap(bitmap);
    }

    public static /* synthetic */ void toIntRange(MyProfileFragment myProfileFragment) {
        setInitScene.setMin setmin = myProfileFragment.myProfilePresenter;
        if (setmin != null) {
            setmin.valueOf();
        }
    }

    public static /* synthetic */ void length(MyProfileFragment myProfileFragment, int i) {
        myProfileFragment.valueOf = true;
        if (i == 0) {
            myProfileFragment.valueOf = false;
            if (myProfileFragment.invokeSuspend) {
                myProfileFragment.getMax(myProfileFragment.toDoubleRange());
            }
        }
    }

    public static /* synthetic */ void equals(MyProfileFragment myProfileFragment) {
        Intent intent;
        if (myProfileFragment.Mean$Arithmetic) {
            intent = new Intent(myProfileFragment.getMax, ProfileQrisDialogActivity.class);
        } else {
            intent = new Intent(myProfileFragment.getMax, ShareQrDialog.class);
        }
        intent.putExtra("USER_ID", myProfileFragment.myProfilePresenter.toIntRange());
        intent.putExtra("QR_CODE", myProfileFragment.toFloatRange);
        intent.putExtra(ShareQrDialog.KYC_STATUS, myProfileFragment.myProfilePresenter.toFloatRange());
        intent.putExtra(ShareQrDialog.AVATAR_URL, myProfileFragment.myProfilePresenter.toDoubleRange());
        intent.setFlags(C.ENCODING_PCM_A_LAW);
        myProfileFragment.startActivity(intent);
    }

    public static /* synthetic */ void values(MyProfileFragment myProfileFragment) {
        myProfileFragment.profileView.hideSkeleton();
        myProfileFragment.profileView.getQrImageView().setImageBitmap((Bitmap) null);
    }

    public static /* synthetic */ void getMin(MyProfileFragment myProfileFragment, int i) {
        SettingModel settingModel;
        SettingModel settingModel2;
        DefaultToastImplExtension defaultToastImplExtension = myProfileFragment.isInside;
        if (defaultToastImplExtension.getMin(i)) {
            settingModel = (SettingModel) defaultToastImplExtension.getMax.getMin.get(i);
        } else {
            settingModel = SettingModel.empty();
        }
        if (!settingModel.isNullObject()) {
            String action = settingModel.getAction();
            char c = 65535;
            switch (action.hashCode()) {
                case -1872601359:
                    if (action.equals("profile_completion_widget")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1741312354:
                    if (action.equals(MyProfileMenuAction.COLLECTION)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1097329270:
                    if (action.equals("logout")) {
                        c = 1;
                        break;
                    }
                    break;
                case -776144932:
                    if (action.equals("redirect")) {
                        c = 10;
                        break;
                    }
                    break;
                case -722568291:
                    if (action.equals(MyProfileMenuAction.REFERRAL)) {
                        c = 5;
                        break;
                    }
                    break;
                case -576998321:
                    if (action.equals(MyProfileMenuAction.SETTING_SECURITY)) {
                        c = 2;
                        break;
                    }
                    break;
                case 162397618:
                    if (action.equals(MyProfileMenuAction.PROMO_QUEST)) {
                        c = 3;
                        break;
                    }
                    break;
                case 974647069:
                    if (action.equals(MyProfileMenuAction.PROMO_CODE)) {
                        c = 4;
                        break;
                    }
                    break;
                case 1399590762:
                    if (action.equals(MyProfileMenuAction.CLOSE_PROFILE_COMPLETION_WIDGET)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1872948409:
                    if (action.equals(MyProfileMenuAction.SAVING)) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Intent intent = new Intent(myProfileFragment.getMax, SettingMoreProfileActivity.class);
                    intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
                    myProfileFragment.startActivity(intent);
                    return;
                case 1:
                    new isBaselineAligned(myProfileFragment.requireContext(), isBaselineAligned.getDEFAULT_BEHAVIOR()).message(Integer.valueOf(R.string.logout_dialog_message), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.dialog_positive), (CharSequence) null, new startPullDownRefresh(myProfileFragment)).negativeButton(Integer.valueOf(R.string.dialog_negative), (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
                    return;
                case 2:
                    myProfileFragment.knowledgeBasedInfoManager.setMin(myProfileFragment.getContext());
                    return;
                case 3:
                    myProfileFragment.startActivity(myProfileFragment.setMax(MissionListActivity.class, TrackerKey.SourceType.ME_PAGE));
                    return;
                case 4:
                    myProfileFragment.startActivity(myProfileFragment.setMax(RedeemPromoCodeActivity.class, TrackerKey.SourceType.ME_PAGE));
                    return;
                case 5:
                    myProfileFragment.myProfilePresenter.equals();
                    return;
                case 6:
                    DefaultToastImplExtension defaultToastImplExtension2 = myProfileFragment.isInside;
                    if (defaultToastImplExtension2.getMin(i)) {
                        settingModel2 = (SettingModel) defaultToastImplExtension2.getMax.getMin.get(i);
                    } else {
                        settingModel2 = SettingModel.empty();
                    }
                    String currentTaskTitle = ((ProfileCompletion) settingModel2).getCurrentTaskTitle();
                    if (currentTaskTitle.equals(myProfileFragment.getString(R.string.profile_completion_task_email))) {
                        DanaH5.startContainerFullUrl(isShowMenu.setMin("/m/portal/emailSettings"), new setCancelOnTouchOutside$core() {
                            public final void onContainerCreated(Bundle bundle) {
                            }

                            public final void onContainerDestroyed(Bundle bundle) {
                                MyProfileFragment.setMax(MyProfileFragment.this);
                            }
                        });
                        return;
                    } else if (currentTaskTitle.equals(myProfileFragment.getString(R.string.profile_completion_task_username))) {
                        myProfileFragment.startActivity(new Intent(myProfileFragment.getMax, ChangeUsernameActivity.class));
                        return;
                    } else if (currentTaskTitle.equals(myProfileFragment.getString(R.string.profile_completion_task_security_question))) {
                        myProfileFragment.knowledgeBasedInfoManager.getMax((Context) myProfileFragment.getActivity());
                        return;
                    } else if (currentTaskTitle.equals(myProfileFragment.getString(R.string.profile_completion_task_profile_picture))) {
                        myProfileFragment.values.setMin();
                        return;
                    } else if (currentTaskTitle.equals(myProfileFragment.getString(R.string.profile_completion_task_nickname))) {
                        DanaH5.startContainerFullUrl(isShowMenu.setMin("/m/portal/settings/editNickname"), new setCancelOnTouchOutside$core() {
                            public final void onContainerCreated(Bundle bundle) {
                            }

                            public final void onContainerDestroyed(Bundle bundle) {
                                MyProfileFragment.setMax(MyProfileFragment.this);
                            }
                        });
                        return;
                    } else {
                        return;
                    }
                case 7:
                    DefaultToastImplExtension defaultToastImplExtension3 = myProfileFragment.isInside;
                    ArrayList arrayList = new ArrayList(defaultToastImplExtension3.getMax.getMin);
                    arrayList.remove(0);
                    defaultToastImplExtension3.getMax.setMax(arrayList);
                    myProfileFragment.myProfilePresenter.invoke();
                    return;
                case 8:
                    Intent max = myProfileFragment.setMax(SavingsActivity.class, TrackerKey.SourceType.ME_PAGE);
                    convertDipToPx.length length = new convertDipToPx.length(myProfileFragment.getContext());
                    length.getMax = TrackerKey.Event.SAVINGS_GOAL_OPEN;
                    convertDipToPx.length max2 = length.setMax("Source", TrackerKey.SourceType.PROFILE_PAGE);
                    max2.setMin();
                    genTextSelector.getMax(new convertDipToPx(max2, (byte) 0));
                    myProfileFragment.startActivity(max);
                    return;
                default:
                    if (settingModel.getName().equals("setting_kyb")) {
                        if (settingModel.isKycRevoked()) {
                            myProfileFragment.isInside("https://m.dana.id/m/kyb?entryPoint=profile");
                            return;
                        } else {
                            myProfileFragment.isInside(settingModel.getRedirectUrl());
                            return;
                        }
                    } else if (settingModel.getName().equals("setting_tnc")) {
                        DanaH5.startContainerFullUrl(isShowMenu.setMin("/m/standalone/tnc"));
                        return;
                    } else if (settingModel.getName().equals("setting_aku")) {
                        Bundle bundle = new Bundle();
                        bundle.putString("url", DanaH5.correctedUrl(isShowMenu.getMax(isShowMenu.setMin(settingModel.getRedirectUrl()), TrackerKey.SourceType.ME_PAGE)));
                        bundle.putString("adjustResize", "YES");
                        DanaH5.startContainerActivity(bundle, new setCancelOnTouchOutside$core() {
                            public final void onContainerCreated(Bundle bundle) {
                            }

                            public final void onContainerDestroyed(Bundle bundle) {
                                MyProfileFragment.setMax(MyProfileFragment.this);
                                MyProfileFragment.setMin(MyProfileFragment.this);
                            }
                        });
                        return;
                    } else if (settingModel.getName().equals("setting_my_bills")) {
                        myProfileFragment.bottomSheetOnBoardingPresenter.setMax(BottomSheetOnBoardingScenario.MY_BILLS, setTinyLocalStorage.getMax(settingModel.getRedirectUrl()));
                        return;
                    } else if (settingModel.getName().equals("setting_investment")) {
                        StringBuilder sb = new StringBuilder("https://m.dana.id");
                        sb.append(settingModel.getRedirectUrl());
                        DanaH5.startContainerFullUrl(isShowMenu.setMin(sb.toString()));
                        return;
                    } else {
                        myProfileFragment.isInside(settingModel.getRedirectUrl());
                        return;
                    }
            }
        }
    }
}
