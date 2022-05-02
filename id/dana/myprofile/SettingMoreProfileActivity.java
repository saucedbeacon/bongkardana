package id.dana.myprofile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.danah5.DanaH5;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.SubMenuModule;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.home.HomeTabActivity;
import id.dana.merchantmanagement.view.MerchantManagementActivity;
import id.dana.myprofile.viewholder.ProfileMenuFaceAuthViewHolder;
import id.dana.onboarding.OnboardingActivity;
import id.dana.richview.BlueSwitchView;
import id.dana.social.RestrictedContactActivity;
import id.dana.social.view.activity.AccountDeactivationActivity;
import id.dana.social.view.activity.ChangeUsernameActivity;
import id.dana.tracker.TrackerKey;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;
import id.dana.twilio.trusteddevice.TrustedDeviceActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AUHorizontalListView;
import o.ConfirmPopup;
import o.CopyUrlShareItem;
import o.GriverManifest;
import o.Ignore;
import o.IntRange;
import o.LogCustomizeControl;
import o.PhotoView;
import o.PrepareException;
import o.Timer;
import o.TinyAppActionState;
import o.TinyAppActionStateController;
import o.captureScreen;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getAppPerfKey;
import o.getImageResId;
import o.getProgressViewStartOffset;
import o.inTransaction;
import o.isBaselineAligned;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.readBefore;
import o.registerOnLoadCanceledListener;
import o.remover;
import o.resetInternal;
import o.setAppIntro;
import o.setBuildNumber;
import o.setCancelOnTouchOutside$core;
import o.setShadowResourceLeft;
import o.setStateOn;
import o.stopIgnoring;
import o.updateFavoriteMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b1\u0018\u0000 À\u00012\u00020\u00012\u00020\u0002:\u0004À\u0001Á\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020[H\u0002J\b\u0010]\u001a\u00020[H\u0002J\b\u0010^\u001a\u00020[H\u0002J\u0010\u0010_\u001a\u00020[2\u0006\u0010`\u001a\u00020\u0005H\u0002J\b\u0010a\u001a\u00020[H\u0002J\b\u0010b\u001a\u00020[H\u0002J\n\u0010c\u001a\u0004\u0018\u00010dH\u0002J\b\u0010e\u001a\u00020[H\u0016J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u000207H\u0002J\n\u0010i\u001a\u0004\u0018\u00010jH\u0002J\u0012\u0010k\u001a\u0002072\b\u0010l\u001a\u0004\u0018\u00010mH\u0002J\b\u0010n\u001a\u000207H\u0002J\n\u0010o\u001a\u0004\u0018\u00010$H\u0002J\b\u0010p\u001a\u00020gH\u0016J\u0012\u0010q\u001a\u00020g2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\b\u0010r\u001a\u00020[H\u0016J\b\u0010s\u001a\u00020[H\u0016J\b\u0010t\u001a\u00020[H\u0002J\b\u0010u\u001a\u00020[H\u0002J\"\u0010v\u001a\u00020[2\u0006\u0010w\u001a\u00020g2\u0006\u0010x\u001a\u00020g2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\b\u0010y\u001a\u00020[H\u0016J\b\u0010z\u001a\u00020[H\u0016J\u0010\u0010{\u001a\u00020[2\u0006\u0010x\u001a\u00020gH\u0002J\u001a\u0010|\u001a\u00020[2\u0006\u0010x\u001a\u00020g2\b\u0010l\u001a\u0004\u0018\u00010mH\u0002J\u0010\u0010}\u001a\u00020[2\u0006\u0010~\u001a\u00020\u0005H\u0002J\u0014\u0010\u001a\u00020[2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020[H\u0014J\u0014\u0010\u0001\u001a\u00020[2\t\u0010\u0001\u001a\u0004\u0018\u000107H\u0016J&\u0010\u0001\u001a\u00020[2\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00052\t\u0010\u0001\u001a\u0004\u0018\u000107H\u0016J\u001b\u0010\u0001\u001a\u00020[2\u0010\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u00020V\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020[H\u0016J1\u0010\u0001\u001a\u00020[2\u0006\u0010w\u001a\u00020g2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u0002070\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0003\u0010\u0001J\t\u0010\u0001\u001a\u00020[H\u0014J\t\u0010\u0001\u001a\u00020[H\u0016J\u001b\u0010\u0001\u001a\u00020[2\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00105\u001a\u00020\u0005H\u0016J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\u0012\u0010\u0001\u001a\u00020[2\u0007\u0010\u0001\u001a\u000207H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J!\u0010 \u0001\u001a\u00020[2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J#\u0010¡\u0001\u001a\u00020[2\u0007\u0010¢\u0001\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0007\u0010£\u0001\u001a\u00020\u0005H\u0016J\u001d\u0010¤\u0001\u001a\u00020[2\u0007\u0010¥\u0001\u001a\u00020g2\t\u0010¦\u0001\u001a\u0004\u0018\u00010dH\u0002J\u0014\u0010§\u0001\u001a\u00020[2\t\u0010¨\u0001\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010©\u0001\u001a\u00020[2\u0007\u0010ª\u0001\u001a\u000207H\u0016J\t\u0010«\u0001\u001a\u00020[H\u0016J\t\u0010¬\u0001\u001a\u00020[H\u0016J\u0011\u0010­\u0001\u001a\u00020[2\u0006\u0010h\u001a\u000207H\u0016J\u0012\u0010®\u0001\u001a\u00020[2\u0007\u0010¯\u0001\u001a\u000207H\u0016J\t\u0010°\u0001\u001a\u00020[H\u0016J\t\u0010±\u0001\u001a\u00020[H\u0016J\t\u0010²\u0001\u001a\u00020[H\u0016J\u0012\u0010³\u0001\u001a\u00020[2\u0007\u0010´\u0001\u001a\u000207H\u0002J\t\u0010µ\u0001\u001a\u00020[H\u0016J\t\u0010¶\u0001\u001a\u00020[H\u0016J\u0012\u0010·\u0001\u001a\u00020[2\u0007\u0010¸\u0001\u001a\u000207H\u0016J\u0011\u0010¹\u0001\u001a\u00020[2\u0006\u0010U\u001a\u00020VH\u0016J\u0011\u0010º\u0001\u001a\u00020[2\u0006\u0010U\u001a\u00020VH\u0016J\u0012\u0010»\u0001\u001a\u00020[2\u0007\u0010¼\u0001\u001a\u000207H\u0002J\u001b\u0010½\u0001\u001a\u00020[2\u0007\u0010¾\u0001\u001a\u0002072\u0007\u0010¿\u0001\u001a\u000207H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u0012\u0010 \u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\n \u0018*\u0004\u0018\u00010,0,X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010.\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b<\u0010\u001c\u001a\u0004\b:\u0010;R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010F\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\r\"\u0004\bH\u0010\u000fR#\u0010I\u001a\n \u0018*\u0004\u0018\u00010J0J8BX\u0002¢\u0006\f\n\u0004\bM\u0010\u001c\u001a\u0004\bK\u0010LR\u001e\u0010N\u001a\u00020O8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u000e\u0010T\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020VX.¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u000e¢\u0006\u0002\n\u0000¨\u0006Â\u0001"}, d2 = {"Lid/dana/myprofile/SettingMoreProfileActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/myprofile/SettingMoreContract$View;", "()V", "alreadyKycPremium", "", "getAlreadyKycPremium", "()Z", "alwaysAskPinSuccessDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "autoRouteListener", "Lid/dana/myprofile/SettingMoreProfileActivity$Listener;", "getAutoRouteListener", "()Lid/dana/myprofile/SettingMoreProfileActivity$Listener;", "setAutoRouteListener", "(Lid/dana/myprofile/SettingMoreProfileActivity$Listener;)V", "changePhoneNumberH5EventPresenter", "Lid/dana/h5event/ChangePhoneNumberH5EventContract$Presenter;", "getChangePhoneNumberH5EventPresenter", "()Lid/dana/h5event/ChangePhoneNumberH5EventContract$Presenter;", "setChangePhoneNumberH5EventPresenter", "(Lid/dana/h5event/ChangePhoneNumberH5EventContract$Presenter;)V", "component", "Lid/dana/di/component/SubMenuComponent;", "kotlin.jvm.PlatformType", "getComponent", "()Lid/dana/di/component/SubMenuComponent;", "component$delegate", "Lkotlin/Lazy;", "faceAuthListener", "getFaceAuthListener", "setFaceAuthListener", "faceLoginEnabled", "Ljava/lang/Boolean;", "faceLoginReady", "faceLoginViewHolder", "Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder;", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "handPicked", "Lid/dana/utils/handpick/HandPicked;", "hasEnrolled", "isShowcaseShowing", "knowledgeBasedInfoManager", "Lid/dana/myprofile/KnowledgeBasedInfoManager;", "getKnowledgeBasedInfoManager", "()Lid/dana/myprofile/KnowledgeBasedInfoManager;", "setKnowledgeBasedInfoManager", "(Lid/dana/myprofile/KnowledgeBasedInfoManager;)V", "kycCertified", "kycLevel", "", "loadingDialog", "Lid/dana/dialog/LoadingDialog;", "getLoadingDialog", "()Lid/dana/dialog/LoadingDialog;", "loadingDialog$delegate", "logoutPresenter", "Lid/dana/challenge/pin/LogoutContract$Presenter;", "getLogoutPresenter", "()Lid/dana/challenge/pin/LogoutContract$Presenter;", "setLogoutPresenter", "(Lid/dana/challenge/pin/LogoutContract$Presenter;)V", "myProfileAdapter", "Lid/dana/myprofile/adapter/MyProfileAdapter;", "needToRefetchOnResume", "paymentAuthListener", "getPaymentAuthListener", "setPaymentAuthListener", "permission", "Lid/dana/utils/permission/Permission;", "getPermission", "()Lid/dana/utils/permission/Permission;", "permission$delegate", "presenter", "Lid/dana/myprofile/SettingMoreContract$Presenter;", "getPresenter", "()Lid/dana/myprofile/SettingMoreContract$Presenter;", "setPresenter", "(Lid/dana/myprofile/SettingMoreContract$Presenter;)V", "securityQuestionClicked", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "showAutoRoutingHighlight", "showcase", "Lid/dana/showcase/Showcase;", "applyHighlightAutoRoutingFeature", "", "applySettingModel", "applyShowAlwaysAskPinSuccessDialog", "checkAndUpdateFaceLoginViewHolder", "checkShowAlwaysAskPinSuccessDalog", "show", "checkToShowAutoRoutingHighlight", "checkTwilioEnrollmentStatus", "createTooltipView", "Landroid/view/View;", "dismissProgress", "findSettingPosition", "", "name", "getAutoSwitchViewHolder", "Lid/dana/myprofile/viewholder/ProfileMenuAutoSwitchViewHolder;", "getCancelReason", "data", "Landroid/content/Intent;", "getDeviceModel", "getFaceLoginViewHolder", "getLayout", "getVerifyButtonTitle", "hideNickname", "init", "initComponent", "initProfileAdapter", "onActivityResult", "requestCode", "resultCode", "onAlreadyEnrolled", "onBackPressed", "onBottomSheetAutoRoutingInfoActivityResult", "onChallengeControlAutoRouteActivityResult", "onChangePhoneNumberSuccess", "success", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onError", "errorMessage", "onGetAutoSwitchInitialState", "isVisible", "isSwitchActive", "authenticationType", "onGetSettingCollectionSuccess", "settings", "", "onGetUserInfoFailed", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onUnenrolled", "onUserKycInfo", "openAccountDeactivateActivity", "openCameraOrGallery", "openChangeUsernameActivity", "openH5Container", "url", "openKnowledgeBasedAuthPage", "openRestrictedContactsPage", "openSecuritySettingsPage", "openTrustedDevicePage", "openTwillioIntroPage", "saveFaceLoginConditionToTemp", "setFaceLoginState", "isFaceLoginEnabled", "isFaceLoginReady", "showAutoSwitchTooltip", "position", "view", "showAvatar", "imageUrl", "showEmailAddress", "emailAddress", "showEmailAddressUnset", "showErrorToast", "showNickname", "showPhoneNumber", "phoneNumber", "showProgress", "showSecurityQuestionStateOff", "showSecurityQuestionStateOn", "showSuccessBorderedToastMsgOnTop", "msg", "showTrustedDevice", "showTrustedDeviceUnset", "showUsername", "username", "toggleShareFeedConsentFailed", "toggleShareFeedConsentSuccess", "trackLogoutEvent", "logoutType", "updateListItem", "menu", "subtitle", "Companion", "Listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SettingMoreProfileActivity extends BaseActivity implements captureScreen.setMax {
    public static final int AUTO_ROUTE_BOTTOM_SHEET_REQUEST_CODE = 2001;
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    @NotNull
    public static final String PARAM_USERNAME_SUCCESS = "USERNAME_SUCCESS";
    public static final long TOAST_DURATION = 4000;
    public static final int TOAST_MAX_TEXT_LINES = 3;
    public static final int getMin = 27;
    public static final byte[] setMax = {53, -120, -1, -63, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    @Nullable
    private setMax FastBitmap$CoordinateSystem;
    private Boolean Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter ICustomTabsCallback;
    /* access modifiers changed from: private */
    public isBaselineAligned IsOverlapping;
    private Boolean Mean$Arithmetic;
    /* access modifiers changed from: private */
    public boolean b;
    @Inject
    public GriverManifest.AnonymousClass16.setMax changePhoneNumberH5EventPresenter;
    /* access modifiers changed from: private */
    public final TinyAppActionState create;
    private boolean equals;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private final Lazy getCause = LazyKt.lazy(new values(this));
    /* access modifiers changed from: private */
    public SettingModel getMax;
    @Nullable
    private setMax hashCode;
    private boolean invoke;
    private boolean invokeSuspend = true;
    private String isInside;
    @Inject
    public getAppPerfKey knowledgeBasedInfoManager;
    @Inject
    public inTransaction.getMax logoutPresenter;
    private final Lazy onNavigationEvent = LazyKt.lazy(new setMin(this));
    private HashMap onRelationshipValidationResult;
    @Inject
    public captureScreen.length presenter;
    @Nullable
    private setMax toDoubleRange;
    private boolean toFloatRange;
    /* access modifiers changed from: private */
    public final getImageResId toIntRange = new getImageResId();
    private final Lazy toString = LazyKt.lazy(new IsOverlapping(this));
    private ProfileMenuFaceAuthViewHolder valueOf;
    private Boolean values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/myprofile/SettingMoreProfileActivity$Listener;", "", "onCancelled", "", "reason", "", "onPhonePermissionGranted", "permissionGranted", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMin();

        void setMax(@Nullable String str);

        void setMin();
    }

    private final setStateOn getMin() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1414325886, oncanceled);
            onCancelLoad.getMin(1414325886, oncanceled);
        }
        return (setStateOn) this.getCause.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 175
            int r6 = 178 - r6
            byte[] r0 = setMax
            int r8 = r8 * 45
            int r8 = r8 + 56
            int r7 = r7 * 165
            int r7 = 176 - r7
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0034
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0029:
            byte r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0034:
            int r7 = -r7
            int r0 = r0 + r7
            int r7 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.myprofile.SettingMoreProfileActivity.length(byte, byte, byte):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.onRelationshipValidationResult;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(883064205, oncanceled);
            onCancelLoad.getMin(883064205, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(883064205, oncanceled2);
            onCancelLoad.getMin(883064205, oncanceled2);
        }
        if (this.onRelationshipValidationResult == null) {
            this.onRelationshipValidationResult = new HashMap();
        }
        View view = (View) this.onRelationshipValidationResult.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.onRelationshipValidationResult.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_sub_menu;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/base/callback/DanaH5CallbackKt$withDanaH5Callback$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerCreated", "", "bundle", "Landroid/os/Bundle;", "onContainerDestroyed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements setCancelOnTouchOutside$core {
        final /* synthetic */ SettingMoreProfileActivity setMax;

        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        public isInside(SettingMoreProfileActivity settingMoreProfileActivity) {
            this.setMax = settingMoreProfileActivity;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.setMax.getPresenter().getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SettingMoreProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(SettingMoreProfileActivity settingMoreProfileActivity) {
            super(1);
            this.this$0 = settingMoreProfileActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            SettingMoreProfileActivity.access$getAlwaysAskPinSuccessDialog$p(this.this$0).dismiss();
        }
    }

    public SettingMoreProfileActivity() {
        TinyAppActionState.getMax getmax = new TinyAppActionState.getMax((AppCompatActivity) this);
        getmax.setMin = GriverEnv.getApplicationContext().getString(R.string.pick_profile_photo_title);
        getmax.length = new equals(this);
        getmax.toIntRange = setStateOn.getMin(GriverEnv.getApplicationContext(), "android.permission.CAMERA");
        getmax.toFloatRange = setStateOn.getMin(GriverEnv.getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        this.create = new TinyAppActionState(getmax, (byte) 0);
    }

    public static final /* synthetic */ void access$checkAndUpdateFaceLoginViewHolder(SettingMoreProfileActivity settingMoreProfileActivity) {
        Boolean bool;
        int length2;
        int min;
        boolean z = false;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1450676165, oncanceled);
            onCancelLoad.getMin(1450676165, oncanceled);
        }
        Context baseContext = settingMoreProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1450676165, oncanceled2);
            onCancelLoad.getMin(1450676165, oncanceled2);
        }
        if (settingMoreProfileActivity.setMax() != null && (bool = settingMoreProfileActivity.values) != null && settingMoreProfileActivity.Grayscale$Algorithm != null && settingMoreProfileActivity.Mean$Arithmetic != null) {
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = settingMoreProfileActivity.Grayscale$Algorithm;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = settingMoreProfileActivity.Mean$Arithmetic;
            if (bool3 != null) {
                z = bool3.booleanValue();
            }
            settingMoreProfileActivity.setFaceLoginState(booleanValue, booleanValue2, z);
        }
    }

    public static final /* synthetic */ isBaselineAligned access$getAlwaysAskPinSuccessDialog$p(SettingMoreProfileActivity settingMoreProfileActivity) {
        isBaselineAligned isbaselinealigned = settingMoreProfileActivity.IsOverlapping;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MyProfileBundleKey.SHOW_ALWAYS_ASK_PIN_SUCCESS_DIALOG);
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ SettingModel access$getSettingModel$p(SettingMoreProfileActivity settingMoreProfileActivity) {
        SettingModel settingModel = settingMoreProfileActivity.getMax;
        if (settingModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MyProfileBundleKey.SETTING_MODEL);
        }
        return settingModel;
    }

    public static final /* synthetic */ void access$openH5Container(SettingMoreProfileActivity settingMoreProfileActivity, String str) {
        int length2;
        int min;
        Context baseContext = settingMoreProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1011998564, oncanceled);
            onCancelLoad.getMin(1011998564, oncanceled);
        }
        String min2 = isShowMenu.setMin(str);
        Intrinsics.checkNotNullExpressionValue(min2, "UrlUtil.getCleanUrl(url)");
        DanaH5.startContainerFullUrl(min2, new isInside(settingMoreProfileActivity));
    }

    public static final /* synthetic */ void access$openKnowledgeBasedAuthPage(SettingMoreProfileActivity settingMoreProfileActivity) {
        int max;
        Context baseContext = settingMoreProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 972923222 == (max = dispatchOnCancelled.getMax(applicationContext, 972923222)))) {
            onCanceled oncanceled = new onCanceled(972923222, max, 512);
            onCancelLoad.setMax(972923222, oncanceled);
            onCancelLoad.getMin(972923222, oncanceled);
        }
        getAppPerfKey getappperfkey = settingMoreProfileActivity.knowledgeBasedInfoManager;
        if (getappperfkey == null) {
            Intrinsics.throwUninitializedPropertyAccessException("knowledgeBasedInfoManager");
        }
        getappperfkey.setMin(settingMoreProfileActivity);
    }

    public static final /* synthetic */ void access$openRestrictedContactsPage(SettingMoreProfileActivity settingMoreProfileActivity) {
        int max;
        Context baseContext = settingMoreProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1340689819 == (max = dispatchOnCancelled.getMax(applicationContext, -1340689819)))) {
            onCanceled oncanceled = new onCanceled(-1340689819, max, 512);
            onCancelLoad.setMax(-1340689819, oncanceled);
            onCancelLoad.getMin(-1340689819, oncanceled);
        }
        settingMoreProfileActivity.startActivity(new Intent(settingMoreProfileActivity, RestrictedContactActivity.class));
    }

    public static final /* synthetic */ void access$openSecuritySettingsPage(SettingMoreProfileActivity settingMoreProfileActivity) {
        int max;
        Context baseContext = settingMoreProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1958995672 == (max = dispatchOnCancelled.getMax(applicationContext, -1958995672)))) {
            onCanceled oncanceled = new onCanceled(-1958995672, max, 512);
            onCancelLoad.setMax(-1958995672, oncanceled);
            onCancelLoad.getMin(-1958995672, oncanceled);
        }
        settingMoreProfileActivity.toFloatRange = true;
        getAppPerfKey getappperfkey = settingMoreProfileActivity.knowledgeBasedInfoManager;
        if (getappperfkey == null) {
            Intrinsics.throwUninitializedPropertyAccessException("knowledgeBasedInfoManager");
        }
        getappperfkey.getMax((Context) settingMoreProfileActivity);
    }

    @NotNull
    public final captureScreen.length getPresenter() {
        captureScreen.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2;
    }

    public final void setPresenter(@NotNull captureScreen.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @NotNull
    public final AUHorizontalListView.SelectionNotifier getFriendshipAnalyticTracker() {
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        return selectionNotifier;
    }

    public final void setFriendshipAnalyticTracker(@NotNull AUHorizontalListView.SelectionNotifier selectionNotifier) {
        Intrinsics.checkNotNullParameter(selectionNotifier, "<set-?>");
        this.friendshipAnalyticTracker = selectionNotifier;
    }

    @NotNull
    public final getAppPerfKey getKnowledgeBasedInfoManager() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-185357038, oncanceled);
            onCancelLoad.getMin(-185357038, oncanceled);
        }
        getAppPerfKey getappperfkey = this.knowledgeBasedInfoManager;
        if (getappperfkey == null) {
            Intrinsics.throwUninitializedPropertyAccessException("knowledgeBasedInfoManager");
        }
        return getappperfkey;
    }

    public final void setKnowledgeBasedInfoManager(@NotNull getAppPerfKey getappperfkey) {
        Intrinsics.checkNotNullParameter(getappperfkey, "<set-?>");
        this.knowledgeBasedInfoManager = getappperfkey;
    }

    @NotNull
    public final inTransaction.getMax getLogoutPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1250084588, oncanceled);
            onCancelLoad.getMin(1250084588, oncanceled);
        }
        inTransaction.getMax getmax = this.logoutPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logoutPresenter");
        }
        return getmax;
    }

    public final void setLogoutPresenter(@NotNull inTransaction.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.logoutPresenter = getmax;
    }

    @NotNull
    public final GriverManifest.AnonymousClass16.setMax getChangePhoneNumberH5EventPresenter() {
        GriverManifest.AnonymousClass16.setMax setmax = this.changePhoneNumberH5EventPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("changePhoneNumberH5EventPresenter");
        }
        return setmax;
    }

    public final void setChangePhoneNumberH5EventPresenter(@NotNull GriverManifest.AnonymousClass16.setMax setmax) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-50471038, oncanceled);
            onCancelLoad.getMin(-50471038, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.changePhoneNumberH5EventPresenter = setmax;
    }

    @Nullable
    public final setMax getPaymentAuthListener() {
        return this.toDoubleRange;
    }

    public final void setPaymentAuthListener(@Nullable setMax setmax) {
        this.toDoubleRange = setmax;
    }

    @Nullable
    public final setMax getFaceAuthListener() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final void setFaceAuthListener(@Nullable setMax setmax) {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(2136801432, oncanceled);
            onCancelLoad.getMin(2136801432, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2136801432, oncanceled2);
            onCancelLoad.getMin(2136801432, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(2136801432, oncanceled3);
            onCancelLoad.getMin(2136801432, oncanceled3);
        }
        this.FastBitmap$CoordinateSystem = setmax;
    }

    @Nullable
    public final setMax getAutoRouteListener() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(95613957, oncanceled);
            onCancelLoad.getMin(95613957, oncanceled);
        }
        return this.hashCode;
    }

    public final void setAutoRouteListener(@Nullable setMax setmax) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-2018546535, oncanceled);
            onCancelLoad.getMin(-2018546535, oncanceled);
        }
        this.hashCode = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/LoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<deleteAppInfoById> {
        final /* synthetic */ SettingMoreProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SettingMoreProfileActivity settingMoreProfileActivity) {
            super(0);
            this.this$0 = settingMoreProfileActivity;
        }

        @NotNull
        public final deleteAppInfoById invoke() {
            return new deleteAppInfoById(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/di/component/SubMenuComponent;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<readBefore> {
        final /* synthetic */ SettingMoreProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SettingMoreProfileActivity settingMoreProfileActivity) {
            super(0);
            this.this$0 = settingMoreProfileActivity;
        }

        public final readBefore invoke() {
            Timer.HandlerExecutor.setMin max = Timer.HandlerExecutor.setMax();
            PrepareException.AnonymousClass1 applicationComponent = this.this$0.getApplicationComponent();
            if (applicationComponent != null) {
                max.getMin = applicationComponent;
                max.setMin = new SubMenuModule(this.this$0);
                max.length = new ChangePhoneNumberH5EventModule(new CopyUrlShareItem(new Function1<Boolean, Unit>(this.this$0) {
                    public final /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        SettingMoreProfileActivity.access$onChangePhoneNumberSuccess((SettingMoreProfileActivity) this.receiver, z);
                    }
                }));
                max.getMax = new LogoutModule(new inTransaction.getMin(this) {
                    final /* synthetic */ setMin setMax;

                    {
                        this.setMax = r1;
                    }

                    public final void getMin() {
                        this.setMax.this$0.dismissProgress();
                    }

                    public final void dismissProgress() {
                        this.setMax.this$0.dismissProgress();
                    }

                    public final void setMax() {
                        this.setMax.this$0.showProgress();
                    }

                    public final void getMax() {
                        SettingMoreProfileActivity.access$trackLogoutEvent(this.setMax.this$0, "Normal");
                        Intent intent = new Intent(this.setMax.this$0, OnboardingActivity.class);
                        updateFavoriteMenuItem.getMin((Activity) null);
                        intent.setFlags(268468224);
                        this.setMax.this$0.startActivity(intent);
                        this.setMax.this$0.finish();
                    }

                    public final void onError(@Nullable String str) {
                        dismissProgress();
                        this.setMax.this$0.showErrorToast();
                    }

                    public final void showProgress() {
                        this.setMax.this$0.showProgress();
                    }
                });
                new FaceAuthPopUpConsultationModule(new remover.setMax() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    public final void length(boolean z) {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                stopIgnoring.setMin(max.setMin, SubMenuModule.class);
                stopIgnoring.setMin(max.length, ChangePhoneNumberH5EventModule.class);
                stopIgnoring.setMin(max.getMax, LogoutModule.class);
                stopIgnoring.setMin(max.getMin, PrepareException.AnonymousClass1.class);
                return new Timer.HandlerExecutor(max.setMin, max.length, max.getMax, max.getMin, (byte) 0);
            }
            throw null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ SettingMoreProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(SettingMoreProfileActivity settingMoreProfileActivity) {
            super(0);
            this.this$0 = settingMoreProfileActivity;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) this.this$0);
            Collections.addAll(getmin.length, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
            getmin.getMin = new setStateOn.getMax(this) {
                final /* synthetic */ values getMax;

                {
                    this.getMax = r1;
                }

                public final void setMax(List<setStateOn.setMin> list) {
                    if (list != null && (!list.isEmpty())) {
                        this.getMax.this$0.create.length();
                    }
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte[] bArr = setMax;
        String length4 = length((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = setMax;
        String length5 = length((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length4, length5);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length6 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length6) {
            onCanceled oncanceled = new onCanceled(nextInt, length6, 1);
            onCancelLoad.setMax(-1231363781, oncanceled);
            onCancelLoad.getMin(-1231363781, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1231363781, oncanceled2);
            onCancelLoad.getMin(-1231363781, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-1231363781, oncanceled3);
            onCancelLoad.getMin(-1231363781, oncanceled3);
        }
        super.onCreate(bundle);
    }

    public final void onDestroy() {
        ProfileMenuFaceAuthViewHolder profileMenuFaceAuthViewHolder = this.valueOf;
        if (profileMenuFaceAuthViewHolder != null) {
            profileMenuFaceAuthViewHolder.getMin();
        }
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        SettingModel settingModel = (SettingModel) getIntent().getParcelableExtra(MyProfileBundleKey.SETTING_MODEL);
        if (settingModel != null) {
            Intrinsics.checkNotNullExpressionValue(settingModel, "it");
            CharSequence collection = settingModel.getCollection();
            if (collection == null || collection.length() == 0) {
                settingModel.setCollection("setting_collection_settings");
            }
            Unit unit = Unit.INSTANCE;
            this.getMax = settingModel;
            setTitle(settingModel.getTitle());
            setMenuLeftButton((int) R.drawable.btn_arrow_left);
        }
        if (this.getMax != null && this.invokeSuspend) {
            captureScreen.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            SettingModel settingModel2 = this.getMax;
            if (settingModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(MyProfileBundleKey.SETTING_MODEL);
            }
            String collection2 = settingModel2.getCollection();
            Intrinsics.checkNotNullExpressionValue(collection2, "settingModel.collection");
            length2.setMax(collection2);
        }
        this.invokeSuspend = true;
        captureScreen.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length3.getMax();
        GriverManifest.AnonymousClass16.setMax setmax = this.changePhoneNumberH5EventPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("changePhoneNumberH5EventPresenter");
        }
        setmax.setMin();
        if (this.toFloatRange) {
            captureScreen.length length4 = this.presenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length4.equals();
            this.toFloatRange = false;
        }
    }

    public final void showPhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        if (str.length() >= 3) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" ");
            sb.append(getString(R.string.hide_value_with_space));
            sb.append(" ");
            String substring2 = str.substring(str.length() - 4);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            setMin(MyProfileMenuAction.SETTING_CHANGE_MOBILE_NUMBER, sb.toString());
        }
    }

    public final void showUsername(@NotNull String str) {
        List max;
        SettingModel settingModel;
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        int max2 = setMax(MyProfileMenuAction.SETTING_USERNAME_CHANGE);
        if (max2 >= 0 && (max = this.toIntRange.getMax()) != null && (settingModel = (SettingModel) max.get(max2)) != null) {
            settingModel.setUsername(str);
            this.toIntRange.notifyItemChanged(max2);
        }
    }

    public final void showNickname(@NotNull String str) {
        List max;
        SettingModel settingModel;
        Intrinsics.checkNotNullParameter(str, "name");
        int max2 = setMax("setting_change_name");
        if (max2 >= 0 && (max = this.toIntRange.getMax()) != null && (settingModel = (SettingModel) max.get(max2)) != null) {
            String str2 = this.isInside;
            if (str2 == null || (Intrinsics.areEqual((Object) "KYC2", (Object) str2) && this.equals)) {
                settingModel.setTitle(getString(R.string.change_name));
                settingModel.setViewType(4);
            } else {
                settingModel.setTitle(getString(R.string.change_name_non_kyc));
                settingModel.setViewType(2);
            }
            settingModel.setSubtitle(str);
            this.toIntRange.notifyItemChanged(max2);
        }
    }

    public final void hideNickname() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-564717772, oncanceled);
            onCancelLoad.getMin(-564717772, oncanceled);
        }
        int max = setMax("setting_change_name");
        if (max >= 0) {
            getImageResId getimageresid = this.toIntRange;
            if (!getimageresid.setMax(max)) {
                getimageresid.getMax().remove(max);
                getimageresid.notifyItemRemoved(max);
            }
        }
    }

    public final void showAvatar(@Nullable String str) {
        int max = setMax(MyProfileMenuAction.SETTING_CHANGE_PROFILE_PICTURE);
        if (max >= 0) {
            getImageResId getimageresid = this.toIntRange;
            Object obj = getimageresid.getMax().get(max);
            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
            ((SettingModel) obj).setAvatarUrl(str);
            getimageresid.notifyItemChanged(max);
        }
    }

    public final void showEmailAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "emailAddress");
        if (str.length() >= 3 && StringsKt.contains$default((CharSequence) str, (CharSequence) AUScreenAdaptTool.PREFIX_ID, false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1));
            sb.append(" ");
            sb.append(getString(R.string.hide_value_with_space));
            sb.append(" ");
            sb.append(str.substring(str.indexOf(64)));
            String obj = sb.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "TextUtil.generateHiddenE…dress(this, emailAddress)");
            setMin(MyProfileMenuAction.SETTING_CHANGE_EMAIL, obj);
        }
    }

    public final void showEmailAddressUnset() {
        String string = getString(R.string.security_setting_email_unset);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.security_setting_email_unset)");
        setMin(MyProfileMenuAction.SETTING_CHANGE_EMAIL, string);
    }

    public final void showSecurityQuestionStateOn() {
        String string = getString(R.string.security_setting_question_state_on);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.secur…etting_question_state_on)");
        setMin(MyProfileMenuAction.SETTING_SECURITY_QUESTIONS, string);
    }

    public final void showSecurityQuestionStateOff() {
        String string = getString(R.string.security_setting_question_state_off);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.secur…tting_question_state_off)");
        setMin(MyProfileMenuAction.SETTING_SECURITY_QUESTIONS, string);
    }

    private final setAppIntro length() {
        List max = this.toIntRange.getMax();
        int i = -1;
        if (max != null) {
            int i2 = 0;
            Iterator it = max.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SettingModel settingModel = (SettingModel) it.next();
                Intrinsics.checkNotNullExpressionValue(settingModel, "it");
                if (Intrinsics.areEqual((Object) settingModel.getAction(), (Object) MyProfileMenuAction.AUTO_ROUTING_SETTING_PARAM)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        RecyclerView.valueOf findViewHolderForLayoutPosition = ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatSpinner)).findViewHolderForLayoutPosition(i);
        if (!(findViewHolderForLayoutPosition instanceof setAppIntro)) {
            findViewHolderForLayoutPosition = null;
        }
        return (setAppIntro) findViewHolderForLayoutPosition;
    }

    private final ProfileMenuFaceAuthViewHolder setMax() {
        List max = this.toIntRange.getMax();
        int i = -1;
        if (max != null) {
            int i2 = 0;
            Iterator it = max.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SettingModel settingModel = (SettingModel) it.next();
                Intrinsics.checkNotNullExpressionValue(settingModel, "it");
                if (Intrinsics.areEqual((Object) settingModel.getAction(), (Object) MyProfileMenuAction.SETTING_FACE_VERIFICATION)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        RecyclerView.valueOf findViewHolderForLayoutPosition = ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatSpinner)).findViewHolderForLayoutPosition(i);
        if (!(findViewHolderForLayoutPosition instanceof ProfileMenuFaceAuthViewHolder)) {
            findViewHolderForLayoutPosition = null;
        }
        return (ProfileMenuFaceAuthViewHolder) findViewHolderForLayoutPosition;
    }

    public final void setFaceLoginState(boolean z, boolean z2, boolean z3) {
        ProfileMenuFaceAuthViewHolder.EnrolmentState enrolmentState;
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-839633659, oncanceled);
            onCancelLoad.getMin(-839633659, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-839633659, oncanceled2);
            onCancelLoad.getMin(-839633659, oncanceled2);
        }
        this.values = Boolean.valueOf(z);
        this.Grayscale$Algorithm = Boolean.valueOf(z2);
        this.Mean$Arithmetic = Boolean.valueOf(z3);
        ProfileMenuFaceAuthViewHolder max = setMax();
        if (max != null) {
            this.valueOf = max;
            if (z2) {
                enrolmentState = ProfileMenuFaceAuthViewHolder.EnrolmentState.ENROLLED;
            } else {
                enrolmentState = ProfileMenuFaceAuthViewHolder.EnrolmentState.NOT_ENROLLED;
            }
            max.length(enrolmentState);
            max.getMax = z;
            View view = max.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            BlueSwitchView blueSwitchView = (BlueSwitchView) view.findViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView, "itemView.sv_enable_face_auth");
            blueSwitchView.setChecked(z);
            ProfileMenuFaceAuthViewHolder.setMin todoublerange = new toDoubleRange(this);
            Intrinsics.checkNotNullParameter(todoublerange, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            max.getMin = todoublerange;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/myprofile/SettingMoreProfileActivity$setFaceLoginState$1", "Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$CheckedListener;", "checkedValueListener", "", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements ProfileMenuFaceAuthViewHolder.setMin {
        final /* synthetic */ SettingMoreProfileActivity getMin;

        toDoubleRange(SettingMoreProfileActivity settingMoreProfileActivity) {
            this.getMin = settingMoreProfileActivity;
        }

        public final void setMin() {
            this.getMin.getPresenter().getMin();
        }
    }

    public final void onError(@Nullable String str) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1276025513 == (max = dispatchOnCancelled.getMax(applicationContext, 1276025513)))) {
            onCanceled oncanceled = new onCanceled(1276025513, max, 512);
            onCancelLoad.setMax(1276025513, oncanceled);
            onCancelLoad.getMin(1276025513, oncanceled);
        }
        Context context = this;
        Toast.makeText(context, context.getString(R.string.general_error_msg), 0).show();
    }

    public final void onGetUserInfoFailed() {
        ProfileMenuFaceAuthViewHolder max = setMax();
        if (max != null) {
            max.length(ProfileMenuFaceAuthViewHolder.EnrolmentState.ERROR_FETCH);
        }
    }

    public final void onUserKycInfo(@Nullable String str, boolean z) {
        this.equals = z;
        this.isInside = str;
        String string = getString(setMin() ? R.string.dana_premium : R.string.dana_user);
        Intrinsics.checkNotNullExpressionValue(string, "getString(getVerifyButtonTitle(kycLevel))");
        setMin(MyProfileMenuAction.SETTING_ACCOUNT_TYPE, string);
    }

    public final void onGetSettingCollectionSuccess(@Nullable List<? extends SettingModel> list) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1292278443, oncanceled);
            onCancelLoad.getMin(-1292278443, oncanceled);
        }
        this.toIntRange.getMin(list);
        captureScreen.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.length();
        captureScreen.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length3.setMin();
        onUserKycInfo(this.isInside, this.equals);
    }

    public final void onGetAutoSwitchInitialState(boolean z, boolean z2, @Nullable String str) {
        View view;
        View view2;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1366306635, oncanceled);
            onCancelLoad.getMin(-1366306635, oncanceled);
        }
        int max2 = setMax(MyProfileMenuAction.AUTO_ROUTING_SETTING_PARAM);
        if (max2 >= 0) {
            getImageResId getimageresid = this.toIntRange;
            Object obj = getimageresid.getMax().get(max2);
            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
            ((SettingModel) obj).setAutoRouteSwitch(z2);
            Object obj2 = getimageresid.getMax().get(max2);
            Intrinsics.checkNotNullExpressionValue(obj2, "items[position]");
            ((SettingModel) obj2).setNeedToShow(z);
            Object obj3 = getimageresid.getMax().get(max2);
            Intrinsics.checkNotNullExpressionValue(obj3, "items[position]");
            ((SettingModel) obj3).setAutoRouteAuthenticationType(str);
            getimageresid.notifyItemChanged(max2);
            if (z) {
                int max3 = setMax(MyProfileMenuAction.AUTO_ROUTING_SETTING_PARAM);
                if (this.b) {
                    ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatSpinner)).scrollToPosition(max3);
                }
                if (this.invoke) {
                    setAppIntro length2 = length();
                    if (length2 == null || (view2 = length2.itemView) == null || (view = view2.findViewById(R.id.f72062131365841)) == null) {
                        view = null;
                    }
                    if (view == null) {
                        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatSpinner)).addOnScrollListener(new getMin(this, max3));
                        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatSpinner)).scrollToPosition(max3);
                        return;
                    }
                    length(max3, view);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"id/dana/myprofile/SettingMoreProfileActivity$checkToShowAutoRoutingHighlight$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.toIntRange {
        final /* synthetic */ SettingMoreProfileActivity length;
        final /* synthetic */ int setMax;

        getMin(SettingMoreProfileActivity settingMoreProfileActivity, int i) {
            this.length = settingMoreProfileActivity;
            this.setMax = i;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            ((RecyclerView) this.length._$_findCachedViewById(resetInternal.setMax.AppCompatSpinner)).removeOnScrollListener(this);
            SettingMoreProfileActivity settingMoreProfileActivity = this.length;
            settingMoreProfileActivity.length(this.setMax, SettingMoreProfileActivity.access$createTooltipView(settingMoreProfileActivity));
        }
    }

    /* access modifiers changed from: private */
    public final void length(int i, View view) {
        if (view != null && this.ICustomTabsCallback == null) {
            this.invoke = false;
            view.post(new SettingMoreProfileActivity$FastBitmap$CoordinateSystem(this, view, i));
        }
    }

    public final void toggleShareFeedConsentSuccess(@NotNull SettingModel settingModel) {
        Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        selectionNotifier.setMin(settingModel.isShareFeed());
    }

    public final void showErrorToast() {
        showToast(getString(R.string.system_is_busy));
    }

    public final void showTrustedDeviceUnset() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(930422661, oncanceled);
            onCancelLoad.getMin(930422661, oncanceled);
        }
        String string = getString(R.string.security_setting_twilio_set);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.security_setting_twilio_set)");
        setMin(MyProfileMenuAction.SETTING_TWILLIO_ENROLLMENT, string);
    }

    public final void onAlreadyEnrolled() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-776012248, oncanceled);
            onCancelLoad.getMin(-776012248, oncanceled);
        }
        startActivity(new Intent(this, TrustedDeviceActivity.class));
    }

    public final void toggleShareFeedConsentFailed(@NotNull SettingModel settingModel) {
        Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        selectionNotifier.setMin(settingModel.isShareFeed());
        int max = setMax(MyProfileMenuAction.SHARE_FEED);
        if (max >= 0) {
            getImageResId getimageresid = this.toIntRange;
            Object obj = getimageresid.getMax().get(max);
            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
            ((SettingModel) obj).setShareFeed(settingModel.isShareFeed());
            getimageresid.notifyItemChanged(max);
        }
    }

    private final void setMin(String str, String str2) {
        int max = setMax(str);
        if (max >= 0) {
            getImageResId getimageresid = this.toIntRange;
            Object obj = getimageresid.getMax().get(max);
            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
            ((SettingModel) obj).setSubtitle(str2);
            getimageresid.notifyItemChanged(max, RVParams.LONG_SUB_TITLE);
        }
    }

    private final boolean setMin() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1905168422, oncanceled);
            onCancelLoad.getMin(1905168422, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1905168422, oncanceled2);
            onCancelLoad.getMin(1905168422, oncanceled2);
        }
        String str = this.isInside;
        return str != null && (Intrinsics.areEqual((Object) "KYC0", (Object) str) ^ true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r18, int r19, @org.jetbrains.annotations.Nullable android.content.Intent r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            android.content.Context r4 = r17.getBaseContext()
            r5 = 0
            if (r4 == 0) goto L_0x0014
            android.content.Context r4 = r4.getApplicationContext()
            goto L_0x0015
        L_0x0014:
            r4 = r5
        L_0x0015:
            r6 = 8
            if (r4 == 0) goto L_0x002d
            int r4 = o.dispatchOnCancelled.setMin(r4, r1)
            if (r1 == r4) goto L_0x002d
            o.onCanceled r7 = new o.onCanceled
            r7.<init>(r1, r4, r6)
            r4 = -1746287872(0xffffffff97e9c300, float:-1.5106497E-24)
            o.onCancelLoad.setMax(r4, r7)
            o.onCancelLoad.getMin(r4, r7)
        L_0x002d:
            super.onActivityResult(r18, r19, r20)
            r4 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r7 = "cancel_reason"
            java.lang.String r8 = ""
            r9 = -1
            if (r1 == r4) goto L_0x0159
            r4 = 1002(0x3ea, float:1.404E-42)
            if (r1 == r4) goto L_0x0127
            r4 = 1006(0x3ee, float:1.41E-42)
            if (r1 == r4) goto L_0x00e3
            r4 = 1007(0x3ef, float:1.411E-42)
            if (r1 == r4) goto L_0x009a
            r3 = 2001(0x7d1, float:2.804E-42)
            if (r1 == r3) goto L_0x004a
            return
        L_0x004a:
            android.content.Context r1 = r17.getBaseContext()
            if (r1 == 0) goto L_0x0054
            android.content.Context r5 = r1.getApplicationContext()
        L_0x0054:
            r1 = -133010583(0xfffffffff8126b69, float:-1.1878967E34)
            if (r5 == 0) goto L_0x006a
            int r3 = o.dispatchOnCancelled.setMin(r5, r2)
            if (r2 == r3) goto L_0x006a
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r2, r3, r6)
            o.onCancelLoad.setMax(r1, r4)
            o.onCancelLoad.getMin(r1, r4)
        L_0x006a:
            r3 = 0
            int r4 = o.dispatchOnCancelled.getMax(r3)
            if (r4 == 0) goto L_0x007e
            o.onCanceled r5 = new o.onCanceled
            r6 = 16
            r5.<init>(r3, r4, r6)
            o.onCancelLoad.setMax(r1, r5)
            o.onCancelLoad.getMin(r1, r5)
        L_0x007e:
            r0.invokeSuspend = r3
            if (r2 == r9) goto L_0x008e
            o.setAppIntro r1 = r17.length()
            if (r1 == 0) goto L_0x008d
            id.dana.richview.profile.switchautoroute.SwitchAutoRouteView r1 = r1.setMin
            r1.revertChecked()
        L_0x008d:
            return
        L_0x008e:
            o.setAppIntro r1 = r17.length()
            if (r1 == 0) goto L_0x0099
            id.dana.richview.profile.switchautoroute.SwitchAutoRouteView r1 = r1.setMin
            r1.onProceedSwitchOn()
        L_0x0099:
            return
        L_0x009a:
            if (r2 == r9) goto L_0x009d
            return
        L_0x009d:
            if (r3 == 0) goto L_0x00a6
            java.lang.String r1 = "accountDeactivationResult"
            java.lang.String r1 = r3.getStringExtra(r1)
            goto L_0x00a7
        L_0x00a6:
            r1 = r5
        L_0x00a7:
            if (r1 != 0) goto L_0x00ab
            r12 = r8
            goto L_0x00ac
        L_0x00ab:
            r12 = r1
        L_0x00ac:
            android.content.Context r1 = r17.getBaseContext()
            if (r1 == 0) goto L_0x00b6
            android.content.Context r5 = r1.getApplicationContext()
        L_0x00b6:
            if (r5 == 0) goto L_0x00ce
            r1 = 350683427(0x14e70123, float:2.3325488E-26)
            int r2 = o.dispatchOnCancelled.getMax(r5, r1)
            if (r1 == r2) goto L_0x00ce
            o.onCanceled r3 = new o.onCanceled
            r4 = 512(0x200, float:7.175E-43)
            r3.<init>(r1, r2, r4)
            o.onCancelLoad.setMax(r1, r3)
            o.onCancelLoad.getMin(r1, r3)
        L_0x00ce:
            o.setAnimationStyle r1 = o.setAnimationStyle.setMax
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            r10 = 2131232746(0x7f0807ea, float:1.808161E38)
            r11 = 2131099937(0x7f060121, float:1.7812241E38)
            r13 = 48
            r14 = 4000(0xfa0, double:1.9763E-320)
            r16 = 3
            o.setAnimationStyle.getMax(r9, r10, r11, r12, r13, r14, r16)
            return
        L_0x00e3:
            android.content.Context r1 = r17.getBaseContext()
            if (r1 == 0) goto L_0x00ee
            android.content.Context r1 = r1.getApplicationContext()
            goto L_0x00ef
        L_0x00ee:
            r1 = r5
        L_0x00ef:
            if (r1 == 0) goto L_0x0105
            int r1 = o.dispatchOnCancelled.setMin(r1, r2)
            if (r2 == r1) goto L_0x0105
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r2, r1, r6)
            r1 = -823151193(0xffffffffceefb5a7, float:-2.0108297E9)
            o.onCancelLoad.setMax(r1, r4)
            o.onCancelLoad.getMin(r1, r4)
        L_0x0105:
            if (r2 == r9) goto L_0x011f
            id.dana.myprofile.SettingMoreProfileActivity$setMax r1 = r0.hashCode
            if (r1 == 0) goto L_0x011e
            if (r3 == 0) goto L_0x0117
            android.os.Bundle r2 = r20.getExtras()
            if (r2 == 0) goto L_0x0117
            java.lang.String r5 = r2.getString(r7)
        L_0x0117:
            if (r5 != 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r8 = r5
        L_0x011b:
            r1.setMax(r8)
        L_0x011e:
            return
        L_0x011f:
            id.dana.myprofile.SettingMoreProfileActivity$setMax r1 = r0.hashCode
            if (r1 == 0) goto L_0x0126
            r1.setMin()
        L_0x0126:
            return
        L_0x0127:
            if (r2 == r9) goto L_0x0143
            id.dana.myprofile.SettingMoreProfileActivity$setMax r1 = r0.FastBitmap$CoordinateSystem
            if (r1 == 0) goto L_0x014c
            if (r3 == 0) goto L_0x0139
            android.os.Bundle r2 = r20.getExtras()
            if (r2 == 0) goto L_0x0139
            java.lang.String r5 = r2.getString(r7)
        L_0x0139:
            if (r5 != 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r8 = r5
        L_0x013d:
            r1.setMax(r8)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x014c
        L_0x0143:
            id.dana.myprofile.SettingMoreProfileActivity$setMax r1 = r0.FastBitmap$CoordinateSystem
            if (r1 == 0) goto L_0x014c
            r1.setMin()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x014c:
            o.captureScreen$length r1 = r0.presenter
            if (r1 != 0) goto L_0x0155
            java.lang.String r2 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0155:
            r1.getMax()
            return
        L_0x0159:
            if (r2 == r9) goto L_0x0173
            id.dana.myprofile.SettingMoreProfileActivity$setMax r1 = r0.toDoubleRange
            if (r1 == 0) goto L_0x0172
            if (r3 == 0) goto L_0x016b
            android.os.Bundle r2 = r20.getExtras()
            if (r2 == 0) goto L_0x016b
            java.lang.String r5 = r2.getString(r7)
        L_0x016b:
            if (r5 != 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r8 = r5
        L_0x016f:
            r1.setMax(r8)
        L_0x0172:
            return
        L_0x0173:
            id.dana.myprofile.SettingMoreProfileActivity$setMax r1 = r0.toDoubleRange
            if (r1 == 0) goto L_0x017a
            r1.setMin()
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.myprofile.SettingMoreProfileActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        setMax setmax;
        setMax setmax2;
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (!getMin().getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (1002 == i && iArr[0] == 0 && (setmax2 = this.toDoubleRange) != null) {
                setmax2.getMin();
            }
            if (1005 == i && iArr[0] == 0 && (setmax = this.FastBitmap$CoordinateSystem) != null) {
                setmax.getMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"id/dana/myprofile/SettingMoreProfileActivity$handPicked$1", "Lid/dana/utils/handpick/HandPickedResultHandler;", "onError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onResult", "imageUri", "Landroid/net/Uri;", "source", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements TinyAppActionStateController {
        final /* synthetic */ SettingMoreProfileActivity setMin;

        equals(SettingMoreProfileActivity settingMoreProfileActivity) {
            this.setMin = settingMoreProfileActivity;
        }

        public final void length(@NotNull Uri uri, @NotNull String str) {
            Intrinsics.checkNotNullParameter(uri, "imageUri");
            Intrinsics.checkNotNullParameter(str, "source");
            this.setMin.getPresenter().getMin(ConfirmPopup.AnonymousClass2.setMax(this.setMin.getApplicationContext(), uri.toString()));
        }

        public final void length(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "e");
            Throwable th = exc;
            if (!TextUtils.isEmpty("uploadAvatar")) {
                if (LogCustomizeControl.getMin() > 0) {
                    LogCustomizeControl.length("uploadAvatar").getMin(th);
                }
                LoggerWrapper.w("uploadAvatar", th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements Ignore.setMin {
        final /* synthetic */ SettingMoreProfileActivity length;

        toFloatRange(SettingMoreProfileActivity settingMoreProfileActivity) {
            this.length = settingMoreProfileActivity;
        }

        public final void length(int i) {
            SettingModel settingModel = (SettingModel) this.length.toIntRange.setMin(i);
            if (settingModel != null) {
                String action = settingModel.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1942416943:
                            if (action.equals(MyProfileMenuAction.PAYMENT_AUTHENTICATION)) {
                                return;
                            }
                            break;
                        case -1051859947:
                            if (action.equals(MyProfileMenuAction.SETTING_ACCOUNT_DEACTIVATE)) {
                                this.length.startActivityForResult(new Intent(this.length, AccountDeactivationActivity.class), 1007);
                                return;
                            }
                            break;
                        case -1019381144:
                            if (action.equals(MyProfileMenuAction.SETTING_TWILLIO_ENROLLMENT)) {
                                SettingMoreProfileActivity.access$checkTwilioEnrollmentStatus(this.length);
                                return;
                            }
                            break;
                        case -719054499:
                            if (action.equals(MyProfileMenuAction.SETTING_SECURITY_QUESTIONS)) {
                                SettingMoreProfileActivity.access$openSecuritySettingsPage(this.length);
                                return;
                            }
                            break;
                        case -576998321:
                            if (action.equals(MyProfileMenuAction.SETTING_SECURITY)) {
                                SettingMoreProfileActivity.access$openKnowledgeBasedAuthPage(this.length);
                                return;
                            }
                            break;
                        case -35919189:
                            if (action.equals(MyProfileMenuAction.SETTING_MERCHANT_MANAGEMENT)) {
                                this.length.startActivity(new Intent(this.length, MerchantManagementActivity.class));
                                return;
                            }
                            break;
                        case 315215690:
                            if (action.equals(MyProfileMenuAction.SETTING_USERNAME_CHANGE)) {
                                this.length.startActivity(new Intent(this.length, ChangeUsernameActivity.class));
                                return;
                            }
                            break;
                        case 487954253:
                            if (action.equals(MyProfileMenuAction.SHARE_FEED)) {
                                return;
                            }
                            break;
                        case 948354699:
                            if (action.equals(MyProfileMenuAction.SETTING_RESTRICTED_CONTACT)) {
                                SettingMoreProfileActivity.access$openRestrictedContactsPage(this.length);
                                return;
                            }
                            break;
                        case 1350426073:
                            if (action.equals(MyProfileMenuAction.CHANGE_PROFILE_PICTURE)) {
                                this.length.getMin().setMin();
                                return;
                            }
                            break;
                        case 1741450382:
                            if (action.equals(MyProfileMenuAction.SETTING_FACE_VERIFICATION)) {
                                return;
                            }
                            break;
                    }
                }
                SettingMoreProfileActivity settingMoreProfileActivity = this.length;
                String redirectUrl = settingModel.getRedirectUrl();
                if (redirectUrl != null) {
                    SettingMoreProfileActivity.access$openH5Container(settingMoreProfileActivity, redirectUrl);
                }
            }
        }
    }

    private final void getMax() {
        this.toIntRange.getMax((Ignore.setMin) new toFloatRange(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatSpinner);
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.ItemAnimator) null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.toIntRange);
            recyclerView.setNestedScrollingEnabled(false);
            setShadowResourceLeft setshadowresourceleft = new setShadowResourceLeft(recyclerView.getContext());
            Drawable length2 = IntRange.length(recyclerView.getContext(), (int) R.drawable.divider_drawable);
            if (length2 != null) {
                if (length2 != null) {
                    setshadowresourceleft.length = length2;
                    recyclerView.addItemDecoration(setshadowresourceleft);
                    recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new toIntRange(this));
                    return;
                }
                throw new IllegalArgumentException("Drawable cannot be null.");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onGlobalLayout", "id/dana/myprofile/SettingMoreProfileActivity$initProfileAdapter$2$2"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ SettingMoreProfileActivity getMin;

        toIntRange(SettingMoreProfileActivity settingMoreProfileActivity) {
            this.getMin = settingMoreProfileActivity;
        }

        public final void onGlobalLayout() {
            SettingMoreProfileActivity.access$checkAndUpdateFaceLoginViewHolder(this.getMin);
        }
    }

    private final int setMax(String str) {
        List<SettingModel> max = this.toIntRange.getMax();
        if (max != null) {
            int i = 0;
            for (SettingModel settingModel : max) {
                Intrinsics.checkNotNullExpressionValue(settingModel, "it");
                if (Intrinsics.areEqual((Object) settingModel.getName(), (Object) str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final void onBackPressed() {
        if (isTaskRoot()) {
            Intent addFlags = new Intent(this, HomeTabActivity.class).addFlags(335544320);
            Intrinsics.checkNotNullExpressionValue(addFlags, "Intent(this, HomeTabActi…t.FLAG_ACTIVITY_NEW_TASK)");
            startActivity(addFlags);
            finish();
            return;
        }
        super.onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/myprofile/SettingMoreProfileActivity$Companion;", "", "()V", "AUTO_ROUTE_BOTTOM_SHEET_REQUEST_CODE", "", "COLLECTION", "", "PARAM_USERNAME_SUCCESS", "SETTING_PAGE", "SUB_TITLE", "TOAST_DURATION", "", "TOAST_MAX_TEXT_LINES", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void init() {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2112023526, oncanceled);
            onCancelLoad.getMin(-2112023526, oncanceled);
        }
        ((readBefore) this.onNavigationEvent.getValue()).getMin(this);
        onDelete.getMin[] getminArr = new onDelete.getMin[2];
        captureScreen.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = length3;
        GriverManifest.AnonymousClass16.setMax setmax = this.changePhoneNumberH5EventPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("changePhoneNumberH5EventPresenter");
        }
        getminArr[1] = setmax;
        registerPresenter(getminArr);
        getMax();
        this.invoke = getIntent().getBooleanExtra(MyProfileBundleKey.HIGHLIGHT_AUTO_ROUTING_FEATURE, false);
        boolean booleanExtra = getIntent().getBooleanExtra(MyProfileBundleKey.SHOW_ALWAYS_ASK_PIN_SUCCESS_DIALOG, false);
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-962922096, oncanceled2);
            onCancelLoad.getMin(-962922096, oncanceled2);
        }
        if (booleanExtra) {
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
            getmax.toFloatRange = getString(R.string.payment_setting_always_ask_pin_dialog_title);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = getString(R.string.payment_setting_always_ask_pin_dialog_message);
            getProgressViewStartOffset.getMax max2 = getmax2.IsOverlapping().setMax(false);
            max2.toIntRange = 0;
            getProgressViewStartOffset.getMax min2 = max2.setMin(getString(R.string.got_it), new length(this));
            isBaselineAligned min3 = new getProgressViewStartOffset(min2.invoke, min2.length, min2, min2.equals, (byte) 0).getMin();
            this.IsOverlapping = min3;
            if (min3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(MyProfileBundleKey.SHOW_ALWAYS_ASK_PIN_SUCCESS_DIALOG);
            }
            min3.show();
        }
    }

    public final void showProgress() {
        deleteAppInfoById deleteappinfobyid = (deleteAppInfoById) this.toString.getValue();
        if (!deleteappinfobyid.length.isShowing()) {
            try {
                deleteappinfobyid.length.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void dismissProgress() {
        ((deleteAppInfoById) this.toString.getValue()).getMin();
    }

    public final void showTrustedDevice() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1533108996, oncanceled);
            onCancelLoad.getMin(1533108996, oncanceled);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        setMin(MyProfileMenuAction.SETTING_TWILLIO_ENROLLMENT, sb.toString());
    }

    public final void onUnenrolled() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -657614707 == (max = dispatchOnCancelled.getMax(applicationContext, -657614707)))) {
            onCanceled oncanceled = new onCanceled(-657614707, max, 512);
            onCancelLoad.setMax(-657614707, oncanceled);
            onCancelLoad.getMin(-657614707, oncanceled);
        }
        TwilioIntroductionActivity.setMin setmin = TwilioIntroductionActivity.Companion;
        startActivity(TwilioIntroductionActivity.setMin.setMin(this, TwilioIntroductionActivity.SETTING_PAGE, ""));
    }

    public static final /* synthetic */ View access$createTooltipView(SettingMoreProfileActivity settingMoreProfileActivity) {
        View view;
        View findViewById;
        setAppIntro length2 = settingMoreProfileActivity.length();
        if (length2 == null || (view = length2.itemView) == null || (findViewById = view.findViewById(R.id.f72062131365841)) == null) {
            return null;
        }
        return findViewById;
    }

    public static final /* synthetic */ void access$checkTwilioEnrollmentStatus(SettingMoreProfileActivity settingMoreProfileActivity) {
        captureScreen.length length2 = settingMoreProfileActivity.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.IsOverlapping();
    }

    public static final /* synthetic */ void access$onChangePhoneNumberSuccess(SettingMoreProfileActivity settingMoreProfileActivity, boolean z) {
        if (z) {
            inTransaction.getMax getmax = settingMoreProfileActivity.logoutPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logoutPresenter");
            }
            getmax.length();
        }
    }

    public static final /* synthetic */ void access$trackLogoutEvent(SettingMoreProfileActivity settingMoreProfileActivity, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(settingMoreProfileActivity);
        length2.getMax = TrackerKey.Event.LOGOUT;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.LOGOUT_TYPE, str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }
}
