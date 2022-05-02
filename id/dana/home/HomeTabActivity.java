package id.dana.home;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingPeriodicWorkPolicy;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.ViewPagerBaseActivity;
import id.dana.base.extension.WorkManagerFailure;
import id.dana.challenge.ChallengeControl;
import id.dana.common.IntentKeySource;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.danah5.DanaH5;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.DanaContactModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.KycAmlEddModule;
import id.dana.di.modules.KycRenewalModule;
import id.dana.di.modules.MiniProgramModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PaymentSettingModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.di.modules.ReferralDialogModule;
import id.dana.di.modules.TncSummaryModules;
import id.dana.di.modules.UserConfigModules;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.explore.model.TrackerExploreDanaOpen;
import id.dana.explore.view.ExploreDanaFragment;
import id.dana.globalnetwork.view.OnboardingGlobalNetworkSheetActivity;
import id.dana.globalsearch.model.TrackerGlobalSearchOpen;
import id.dana.globalsearch.view.GlobalSearchActivity;
import id.dana.globalsearch.view.GlobalSearchFragment;
import id.dana.googleplay.updates.DanaUpdateManager;
import id.dana.home.HomeFragment;
import id.dana.home.KycAmlEddActivity;
import id.dana.home.model.EddInfoModel;
import id.dana.home.tab.HomeTabFragment;
import id.dana.model.GnContentModel;
import id.dana.model.ThirdPartyService;
import id.dana.myprofile.MyProfileBundleKey;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.notificationcenter.views.NotificationCenterFragment;
import id.dana.oauth.activity.OauthGrantActivity;
import id.dana.pay.PayActivity;
import id.dana.popup.LockableViewPager;
import id.dana.referral.MyReferralDetailActivity;
import id.dana.scanner.ScannerActivity;
import id.dana.scanner.handler.ScannerFromViewType;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.social.FeedsFragment;
import id.dana.social.di.module.SocialCommonModule;
import id.dana.social.fragment.FriendsFeedsFragment;
import id.dana.social.fragment.MyFeedsFragment;
import id.dana.social.utils.PartialSyncContactWorker;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import id.dana.social.workmanager.SaveContactFullSyncWorker;
import id.dana.social.workmanager.SaveContactPartialSyncWorker;
import id.dana.tncsummary.TncSummaryActivity;
import id.dana.tracker.TrackerKey;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;
import id.dana.twilio.onboarding.TwilioIntroductionModule;
import id.dana.twilio.trusteddevice.TrustedDeviceActivity;
import id.dana.twilio.twiliodialog.TwilioDialogModule;
import id.dana.webview.WebViewActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AUIconDrawable;
import o.AboutInfoBridgeExtension;
import o.AboutInfoBridgeExtension$FastBitmap$CoordinateSystem;
import o.AboutInfoBridgeExtension$Grayscale$Algorithm;
import o.AppInfoDao;
import o.BLEBridgeExtension;
import o.BaseGriverRpcRequest;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.EmbedViewBridgeExtension;
import o.FileMangerBridgeExtension;
import o.FtsOptions$Order;
import o.GriverCloseButtonStyleExtension;
import o.GriverDefaultPromptExtension;
import o.GriverJSAPIPermission;
import o.GriverManifest;
import o.GriverProgressBar;
import o.IH5TinyPopMenu;
import o.InspectableProperty;
import o.IntRange;
import o.JSAPIMonitorExtension;
import o.ListMenuItemView;
import o.LogLiteManager;
import o.MemoryWarningBridgeExtension;
import o.MultilevelSelectActivity;
import o.MultilevelSelectCallBack;
import o.NebulaAuthDialogProxy;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PopupWindowToast;
import o.PrepareException;
import o.ResourceConstants;
import o.ScreenBrightnessBridgeExtension;
import o.StackBlurManager;
import o.TitleBarExtension;
import o.ToastBridgeExtension;
import o.ToolUtils;
import o.WindowBridgeExtension;
import o.WorkerManagerExtension;
import o.Workflow;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.f;
import o.f$2$FastBitmap$CoordinateSystem;
import o.genTextSelector;
import o.getDeviceName;
import o.getPagePathFromPageUrl;
import o.getPhotoRect;
import o.getProgressViewStartOffset;
import o.getSelectedIndex;
import o.getStartDelay;
import o.isBadgeViewShow;
import o.isBaselineAligned;
import o.isShowMenu;
import o.isShowTitleBarFavorite;
import o.moveToStart;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onFinishInflate;
import o.onNext;
import o.onReceivedIcon;
import o.onTextChanged;
import o.order;
import o.removeStateDidChangeHandler;
import o.remover;
import o.resetInternal;
import o.selectAllAppInfo;
import o.setCancelOnTouchOutside$core;
import o.setCancelText;
import o.setGroupDividerEnabled;
import o.setOnWheelViewListener;
import o.setProgressViewOffset;
import o.setPublishStatus;
import o.setStateOn;
import o.setTextAppearance;
import o.setTextSize;
import o.showTime;
import o.stopIgnoring;
import o.style;
import o.toJavaScript;
import o.updateActionSheetContent;
import o.vibrateLong;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ¶\u00022\u00020\u0001:\n¶\u0002·\u0002¸\u0002¹\u0002º\u0002B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u001d\u0010 \u0001\u001a\u00030\u00012\u0007\u0010¡\u0001\u001a\u00020\u001a2\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J\n\u0010¤\u0001\u001a\u00030\u0001H\u0002J\n\u0010¥\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010¦\u0001\u001a\u00030\u00012\u0007\u0010§\u0001\u001a\u00020gH\u0002J\n\u0010¨\u0001\u001a\u00030\u0001H\u0002J\n\u0010©\u0001\u001a\u00030\u0001H\u0002J\n\u0010ª\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010«\u0001\u001a\u00030\u00012\u0007\u0010¬\u0001\u001a\u00020gH\u0002J\u001d\u0010­\u0001\u001a\u00030®\u00012\b\u0010¯\u0001\u001a\u00030°\u00012\u0007\u0010±\u0001\u001a\u00020\u001aH\u0002J\b\u0010²\u0001\u001a\u00030\u0001J\n\u0010³\u0001\u001a\u00030\u0001H\u0002J\b\u0010´\u0001\u001a\u00030\u0001J\n\u0010µ\u0001\u001a\u00030¶\u0001H\u0002J\u001c\u0010·\u0001\u001a\u00030¸\u00012\u0007\u0010±\u0001\u001a\u00020\u001a2\u0007\u0010§\u0001\u001a\u00020gH\u0002J\u0015\u0010¹\u0001\u001a\u00020g2\n\u0010º\u0001\u001a\u0005\u0018\u00010°\u0001H\u0002J\t\u0010»\u0001\u001a\u00020\u0018H\u0002J\n\u0010¼\u0001\u001a\u00030½\u0001H\u0002J\n\u0010¾\u0001\u001a\u00030¿\u0001H\u0002J\n\u0010À\u0001\u001a\u00030Á\u0001H\u0002J\n\u0010Â\u0001\u001a\u00030Ã\u0001H\u0002J\n\u0010Ä\u0001\u001a\u00030Å\u0001H\u0016J\n\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0002J\n\u0010È\u0001\u001a\u00030\u0001H\u0002J\n\u0010É\u0001\u001a\u00030Ê\u0001H\u0002J\n\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0002J\n\u0010Í\u0001\u001a\u00030Î\u0001H\u0002J\n\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0002J\n\u0010Ñ\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Ò\u0001\u001a\u00030\u00012\b\u0010Ó\u0001\u001a\u00030£\u0001H\u0002J\n\u0010Ô\u0001\u001a\u00030\u0001H\u0016J\n\u0010Õ\u0001\u001a\u00030\u0001H\u0002J\n\u0010Ö\u0001\u001a\u00030\u0001H\u0002J\n\u0010×\u0001\u001a\u00030\u0001H\u0002J\n\u0010Ø\u0001\u001a\u00030\u0001H\u0002J\n\u0010Ù\u0001\u001a\u00030\u0001H\u0002J\n\u0010Ú\u0001\u001a\u00030Û\u0001H\u0002J\n\u0010Ü\u0001\u001a\u00030\u0001H\u0002J\u0011\u0010Ý\u0001\u001a\u00020\u001a2\b\u0010Þ\u0001\u001a\u00030Å\u0001J\t\u0010ß\u0001\u001a\u00020\u001aH\u0002J\t\u0010à\u0001\u001a\u00020\u001aH\u0002J\u0012\u0010á\u0001\u001a\u00020\u001a2\u0007\u0010â\u0001\u001a\u00020gH\u0002J\t\u0010ã\u0001\u001a\u00020\u001aH\u0002J\n\u0010ä\u0001\u001a\u00030\u0001H\u0002J\n\u0010å\u0001\u001a\u00030\u0001H\u0002J\b\u0010æ\u0001\u001a\u00030\u0001J*\u0010ç\u0001\u001a\u00030\u00012\b\u0010è\u0001\u001a\u00030Å\u00012\b\u0010é\u0001\u001a\u00030Å\u00012\n\u0010º\u0001\u001a\u0005\u0018\u00010°\u0001H\u0014J\n\u0010ê\u0001\u001a\u00030\u0001H\u0016J \u0010ë\u0001\u001a\u00030\u00012\b\u0010é\u0001\u001a\u00030Å\u00012\n\u0010º\u0001\u001a\u0005\u0018\u00010°\u0001H\u0002J \u0010ì\u0001\u001a\u00030\u00012\b\u0010é\u0001\u001a\u00030Å\u00012\n\u0010º\u0001\u001a\u0005\u0018\u00010°\u0001H\u0002J\u0016\u0010í\u0001\u001a\u00030\u00012\n\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001H\u0014J\n\u0010î\u0001\u001a\u00030\u0001H\u0014J\u0014\u0010ï\u0001\u001a\u00030\u00012\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0007J\n\u0010ò\u0001\u001a\u00030\u0001H\u0014J\u0014\u0010ó\u0001\u001a\u00030\u00012\b\u0010ð\u0001\u001a\u00030ô\u0001H\u0007J\u0013\u0010õ\u0001\u001a\u00030\u00012\u0007\u0010ö\u0001\u001a\u00020\u001aH\u0016J\u0014\u0010÷\u0001\u001a\u00030\u00012\b\u0010ø\u0001\u001a\u00030ù\u0001H\u0002J\n\u0010ú\u0001\u001a\u00030\u0001H\u0002J\u001d\u0010û\u0001\u001a\u00030\u00012\b\u0010¢\u0001\u001a\u00030£\u00012\u0007\u0010ü\u0001\u001a\u00020\u001aH\u0002J\n\u0010ý\u0001\u001a\u00030\u0001H\u0002J\n\u0010þ\u0001\u001a\u00030\u0001H\u0002J\n\u0010ÿ\u0001\u001a\u00030\u0001H\u0002J\u001c\u0010\u0002\u001a\u00030\u00012\u0007\u0010\u0002\u001a\u00020\u001a2\u0007\u0010\u0002\u001a\u00020\u0018H\u0002J\u0011\u0010\u0002\u001a\u00030\u00012\u0007\u0010\u0002\u001a\u00020\u001aJ\n\u0010\u0002\u001a\u00030\u0001H\u0002J\b\u0010\u0002\u001a\u00030\u0001J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\u001d\u0010\u0002\u001a\u00030\u00012\b\u0010\u0002\u001a\u00030\u00022\u0007\u0010\u0002\u001a\u00020gH\u0002J\u0014\u0010\u0002\u001a\u00030\u00012\b\u0010\u0002\u001a\u00030\u0002H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J'\u0010\u0002\u001a\u00030\u00012\u0007\u0010\u0002\u001a\u00020g2\t\b\u0002\u0010\u0002\u001a\u00020g2\t\b\u0002\u0010\u0002\u001a\u00020\u001aJ\n\u0010\u0002\u001a\u00030\u0001H\u0002J\u0012\u0010\u0002\u001a\u00030\u00012\u0006\u0010\t\u001a\u00020\nH\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\u001c\u0010\u0002\u001a\u00030\u00012\u0007\u0010\u0002\u001a\u00020\u001a2\u0007\u0010§\u0001\u001a\u00020gH\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\u001f\u0010 \u0002\u001a\u00030\u00012\u0007\u0010¡\u0001\u001a\u00020\u001a2\n\u0010¡\u0002\u001a\u0005\u0018\u00010¢\u0002H\u0002J\u0013\u0010£\u0002\u001a\u00030\u00012\u0007\u0010\u0002\u001a\u00020gH\u0002J%\u0010¤\u0002\u001a\u00030\u00012\u0007\u0010¥\u0002\u001a\u00020\u001a2\u0007\u0010§\u0001\u001a\u00020g2\u0007\u0010¦\u0002\u001a\u00020gH\u0002J\u0013\u0010§\u0002\u001a\u00030\u00012\u0007\u0010¨\u0002\u001a\u00020\u0018H\u0002J\n\u0010©\u0002\u001a\u00030\u0001H\u0002J\u0015\u0010ª\u0002\u001a\u00030\u00012\t\u0010«\u0002\u001a\u0004\u0018\u00010gH\u0002J)\u0010¬\u0002\u001a\u00030\u00012\n\u0010­\u0002\u001a\u0005\u0018\u00010®\u00022\u0007\u0010¯\u0002\u001a\u00020g2\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J1\u0010°\u0002\u001a\u00030\u00012\u0007\u0010±\u0002\u001a\u00020\u001a2\t\u0010«\u0002\u001a\u0004\u0018\u00010g2\u0007\u0010¯\u0002\u001a\u00020g2\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J1\u0010²\u0002\u001a\u00030\u00012\u0007\u0010±\u0002\u001a\u00020\u001a2\t\u0010«\u0002\u001a\u0004\u0018\u00010g2\u0007\u0010¯\u0002\u001a\u00020g2\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J\n\u0010³\u0002\u001a\u00030\u0001H\u0002J\u0015\u0010´\u0002\u001a\u00030\u00012\t\u0010µ\u0002\u001a\u0004\u0018\u00010gH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X.¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\u0004\u0018\u00010;8BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001dR\u000e\u0010?\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX.¢\u0006\u0002\n\u0000R\u001e\u0010H\u001a\u00020I8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020O8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u000e\u0010T\u001a\u00020UX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010V\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\u000e\u0010Y\u001a\u00020GX.¢\u0006\u0002\n\u0000R\u001e\u0010Z\u001a\u00020[8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010`\u001a\u00020a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u000e\u0010f\u001a\u00020gX.¢\u0006\u0002\n\u0000R\u001e\u0010h\u001a\u00020i8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u000e\u0010n\u001a\u00020oX.¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020qX.¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010sX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010t\u001a\u00020u8FX\u0002¢\u0006\f\n\u0004\bx\u0010\u000e\u001a\u0004\bv\u0010wR\u001e\u0010y\u001a\u00020z8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u000e\u0010\u001a\u00020*X.¢\u0006\u0002\n\u0000R$\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u000f\u0010\u0001\u001a\u00020GX.¢\u0006\u0002\n\u0000R$\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020GX.¢\u0006\u0002\n\u0000R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R$\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0002\n\u0000¨\u0006»\u0002"}, d2 = {"Lid/dana/home/HomeTabActivity;", "Lid/dana/base/ViewPagerBaseActivity;", "()V", "autoRouteListener", "Lid/dana/home/HomeTabActivity$PaymentSettingListener;", "getAutoRouteListener", "()Lid/dana/home/HomeTabActivity$PaymentSettingListener;", "setAutoRouteListener", "(Lid/dana/home/HomeTabActivity$PaymentSettingListener;)V", "bottomSheetPaymentSettingFragment", "Lid/dana/paymentsetting/BottomSheetPaymentSettingFragment;", "getBottomSheetPaymentSettingFragment", "()Lid/dana/paymentsetting/BottomSheetPaymentSettingFragment;", "bottomSheetPaymentSettingFragment$delegate", "Lkotlin/Lazy;", "danaContactPresenter", "Lid/dana/contract/contact/DanaContactContract$Presenter;", "getDanaContactPresenter", "()Lid/dana/contract/contact/DanaContactContract$Presenter;", "setDanaContactPresenter", "(Lid/dana/contract/contact/DanaContactContract$Presenter;)V", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "date", "", "value", "", "enableFeed", "getEnableFeed", "()Z", "setEnableFeed", "(Z)V", "enableGlobalSearch", "getEnableGlobalSearch", "setEnableGlobalSearch", "faceAuthPopUpConsultationPresenter", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$Presenter;", "getFaceAuthPopUpConsultationPresenter", "()Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$Presenter;", "setFaceAuthPopUpConsultationPresenter", "(Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$Presenter;)V", "faceLoginDialog", "Lid/dana/dialog/TwoButtonWithImageDialog;", "feedsContentAction", "Lid/dana/social/utils/FeedsContentAction;", "getFeedsContentAction", "()Lid/dana/social/utils/FeedsContentAction;", "setFeedsContentAction", "(Lid/dana/social/utils/FeedsContentAction;)V", "forHomeRevamp", "globalNetworkPresenter", "Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;", "getGlobalNetworkPresenter", "()Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;", "setGlobalNetworkPresenter", "(Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;)V", "homeFragmentPagerStateAdapter", "Lid/dana/home/HomeFragmentPagerStateAdapter;", "homeTabFragment", "Lid/dana/home/tab/HomeTabFragment;", "getHomeTabFragment", "()Lid/dana/home/tab/HomeTabFragment;", "isNotificationFragment", "isUserSwipe", "kycAmlEddPresenter", "Lid/dana/kycamledd/KycAmlEddPresenter;", "getKycAmlEddPresenter", "()Lid/dana/kycamledd/KycAmlEddPresenter;", "setKycAmlEddPresenter", "(Lid/dana/kycamledd/KycAmlEddPresenter;)V", "kycRenewalDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "kycRenewalPresenter", "Lid/dana/kycrenewal/KycRenewalPresenter;", "getKycRenewalPresenter", "()Lid/dana/kycrenewal/KycRenewalPresenter;", "setKycRenewalPresenter", "(Lid/dana/kycrenewal/KycRenewalPresenter;)V", "miniProgramPresenter", "Lid/dana/miniprogram/di/MiniProgramPresenter;", "getMiniProgramPresenter", "()Lid/dana/miniprogram/di/MiniProgramPresenter;", "setMiniProgramPresenter", "(Lid/dana/miniprogram/di/MiniProgramPresenter;)V", "onboardingOrchestrator", "Lid/dana/home/OnboardingOrchestrator;", "paymentAuthListener", "getPaymentAuthListener", "setPaymentAuthListener", "paymentSettingFailedDialog", "paymentSettingPresenter", "Lid/dana/paymentsetting/PaymentSettingContract$Presenter;", "getPaymentSettingPresenter", "()Lid/dana/paymentsetting/PaymentSettingContract$Presenter;", "setPaymentSettingPresenter", "(Lid/dana/paymentsetting/PaymentSettingContract$Presenter;)V", "playStoreReviewPresenter", "Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;", "getPlayStoreReviewPresenter", "()Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;", "setPlayStoreReviewPresenter", "(Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;)V", "pushToken", "", "referralDialogPresenter", "Lid/dana/onboarding/referral/ReferralDialogContract$Presenter;", "getReferralDialogPresenter", "()Lid/dana/onboarding/referral/ReferralDialogContract$Presenter;", "setReferralDialogPresenter", "(Lid/dana/onboarding/referral/ReferralDialogContract$Presenter;)V", "referralEngagementDialog", "Lid/dana/referral/view/ReferralEngagementDialog;", "referralEngagementDialogModel", "Lid/dana/onboarding/referral/model/ReferralEngagementDialogModel;", "referralEngagementDialogObserver", "Lio/reactivex/disposables/Disposable;", "swipeDelegateListener", "Lid/dana/home/SwipeDelegateListener;", "getSwipeDelegateListener", "()Lid/dana/home/SwipeDelegateListener;", "swipeDelegateListener$delegate", "tncSummaryPresenter", "Lid/dana/tncsummary/TncSummaryContract$Presenter;", "getTncSummaryPresenter", "()Lid/dana/tncsummary/TncSummaryContract$Presenter;", "setTncSummaryPresenter", "(Lid/dana/tncsummary/TncSummaryContract$Presenter;)V", "twilioDialog", "twilioDialogPresenter", "Lid/dana/twilio/twiliodialog/TwilioDialogContract$Presenter;", "getTwilioDialogPresenter", "()Lid/dana/twilio/twiliodialog/TwilioDialogContract$Presenter;", "setTwilioDialogPresenter", "(Lid/dana/twilio/twiliodialog/TwilioDialogContract$Presenter;)V", "twilioFailedDialog", "twilioIntroductionPresenter", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$Presenter;", "getTwilioIntroductionPresenter", "()Lid/dana/twilio/onboarding/TwilioIntroductionContract$Presenter;", "setTwilioIntroductionPresenter", "(Lid/dana/twilio/onboarding/TwilioIntroductionContract$Presenter;)V", "twilioSnackbar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "twilioSuccessDialog", "updateManager", "Lid/dana/googleplay/updates/DanaUpdateManager;", "getUpdateManager", "()Lid/dana/googleplay/updates/DanaUpdateManager;", "setUpdateManager", "(Lid/dana/googleplay/updates/DanaUpdateManager;)V", "userConfigPresenter", "Lid/dana/userconfig/UserConfigContract$Presenter;", "getUserConfigPresenter", "()Lid/dana/userconfig/UserConfigContract$Presenter;", "setUserConfigPresenter", "(Lid/dana/userconfig/UserConfigContract$Presenter;)V", "viewModel", "Lid/dana/home/HomeViewModel;", "activityResultAutoRoute", "", "activityResultPaymentControl", "authStatus", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "addOnPagerChangeListener", "checkIntentFriendshipDeeplink", "checkPushTokenReceived", "securityId", "checkReferralDialog", "checkSyncContactProcess", "checkUpdatesManually", "createKycRenewalUrl", "hideClose", "createNoUnderLineClickableSpan", "Landroid/text/style/ClickableSpan;", "intent", "Landroid/content/Intent;", "clickable", "dismissDanaLoadingDialog", "displayFaceLoginSuggestionDialog", "enableFeedFragment", "generateFaceLoginSuggestionFooterSpannable", "Landroid/text/Spannable;", "generateTwilioClickableDescription", "Landroid/text/SpannableString;", "getCancelReason", "data", "getCurrentUnixEpochTime", "getDanaContactModule", "Lid/dana/di/modules/DanaContactModule;", "getFaceAuthModule", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationModule;", "getKycAmlEddModule", "Lid/dana/di/modules/KycAmlEddModule;", "getKycRenewalModule", "Lid/dana/di/modules/KycRenewalModule;", "getLayout", "", "getPaymentSettingModule", "Lid/dana/di/modules/PaymentSettingModule;", "getPushToken", "getReferralDialogModule", "Lid/dana/di/modules/ReferralDialogModule;", "getTncSummaryModule", "Lid/dana/di/modules/TncSummaryModules;", "getTwilioDialogModule", "Lid/dana/twilio/twiliodialog/TwilioDialogModule;", "getTwilioIntroductionModule", "Lid/dana/twilio/onboarding/TwilioIntroductionModule;", "goToGoogleBinding", "goToProfileActivity", "setting", "init", "initAcCashierPayment", "initHomeFragmentPagerStateAdapter", "initHomeTabActivityData", "initInjector", "initScanSharedImages", "initSocialCommonComponent", "Lid/dana/social/di/component/SocialCommonComponent;", "initSwitchOffPaymentAuth", "isExploreDanaFragment", "position", "isFromDeeplinkPayment", "isFromGoogle", "isNeedReopenCashier", "codeValueLocal", "isNeedSkipOnBoarding", "isPopupKycQueryExceedLimit", "isPopupKycShowExceedLimit", "nextOnboardingStep", "onActivityResult", "requestCode", "resultCode", "onBackPressed", "onChallengeControlAutoRouteActivityResult", "onChallengeControlPaymentAuthActivityResult", "onNewIntent", "onPause", "onReceiveUpdateRequest", "event", "Lid/dana/danah5/DanaH5$CheckAppUpdatesMessageEvent;", "onResume", "onReturnToHomepage", "Lid/dana/home/HomeTabActivity$OnBackToHomepageMessageEvent;", "onWindowFocusChanged", "hasFocus", "openKycAmlEddActivity", "eddInfoModel", "Lid/dana/home/model/EddInfoModel;", "openKycRenewalContainer", "openSettingMoreActivity", "success", "reportNotificationPermission", "savePopupKycClick", "savePopupKycDismiss", "savePopupKycShow", "show", "timeStamp", "setSwipeable", "swipeable", "setupUpdateManager", "showDanaLoadingDialog", "showFaceLoginOnCancelEnrollDalog", "showForceKycRenewalDialog", "showGlobalNetworkDialog", "gnContentModel", "Lid/dana/model/GnContentModel;", "countryCode", "showKycAmlEddDialog", "eddConsultModel", "Lid/dana/home/model/EddConsultModel;", "showKycRenewalDialog", "showMerchantReview", "source", "shopId", "ignoreDismissRule", "showMyReferralPage", "showPaymentSettingBottomSheet", "showPaymentSettingFailedDialog", "showPaymentSettingSuccessDialog", "showReferralEngagementDialog", "showTermsAndConditionsDialog", "showTwilioDialog", "showCheckbox", "showTwilioFailedDialog", "showTwilioMaybeLaterSnackbar", "showTwilioSuccessDialog", "startAlwaysAskPinPasswordChallenge", "paymentSecuritySwitchModel", "Lid/dana/myprofile/model/PaymentSecuritySwitchModel;", "startGnOnBoarding", "startRecommendSecurityChallenge", "isChecked", "pubKey", "startReferralEngagementTimer", "timerDuration", "suggestEnrollFaceLogin", "switchAutoRouteState", "authenticationType", "switchPaymentAuth", "paymentSecurityInitModel", "Lid/dana/myprofile/model/PaymentSecurityInitModel;", "actionClick", "switchPaymentAuthOff", "isAuthenticationStatus", "switchPaymentAuthOn", "trackMixpanelAppReady", "trackMixpanelReferralEngagementDialog", "scenario", "Companion", "FinishSubActivitiesMessageEvent", "OnBackToHomepageMessageEvent", "PaymentSettingListener", "SwitchFragment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HomeTabActivity extends ViewPagerBaseActivity {
    @NotNull
    public static final String AC_CODE_VALUE = "ACCodeValue";
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    @NotNull
    public static final String DEEPLINK_PAYMENT_PATH = "/pay";
    @NotNull
    public static final String EXTRA_IGNORE_DISMISS_RULE = "ignoredismissrule";
    @NotNull
    public static final String EXTRA_SHOP_ID = "shopid";
    @NotNull
    public static final String EXTRA_SOURCE = "source";
    @NotNull
    public static final String OAUTH_LOADING_VALUE = "oauthvalue";
    private static boolean extraCallback;
    private GriverProgressBar.UpdateRunnable FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String Grayscale$Algorithm;
    /* access modifiers changed from: private */
    @Nullable
    public getMin ICustomTabsCallback;
    /* access modifiers changed from: private */
    public isBaselineAligned IsOverlapping;
    private final long Mean$Arithmetic = System.currentTimeMillis();
    @NotNull
    private final Lazy b = LazyKt.lazy(new IPostMessageService.Stub(this));
    private boolean create;
    @Inject
    public moveToStart.setMin danaContactPresenter;
    /* access modifiers changed from: private */
    public TwoButtonWithImageDialog equals;
    @Inject
    public remover.getMin faceAuthPopUpConsultationPresenter;
    @Inject
    public AUIconDrawable feedsContentAction;
    @Nullable
    private getMin getCause;
    private GriverManifest.AnonymousClass36 getMax;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass30 getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    /* access modifiers changed from: private */
    public setProgressViewOffset hashCode;
    /* access modifiers changed from: private */
    public boolean invoke;
    /* access modifiers changed from: private */
    public boolean invokeSuspend = true;
    /* access modifiers changed from: private */
    public TwoButtonWithImageDialog isInside;
    @Inject
    public JSAPIMonitorExtension kycAmlEddPresenter;
    @Inject
    public AboutInfoBridgeExtension kycRenewalPresenter;
    @Inject
    public EmbedViewBridgeExtension miniProgramPresenter;
    private boolean onNavigationEvent;
    private HashMap onPostMessage;
    private final GriverManifest.AnonymousClass47 onRelationshipValidationResult = new Object(new asBinder(this)) {
        public final LinkedList<f.AnonymousClass2> getMax = new LinkedList<>();
        private final AnonymousClass46 setMin;

        {
            Intrinsics.checkNotNullParameter(r2, "onBoardingEvent");
            this.setMin = r2;
        }

        @Nullable
        public final Unit getMax() {
            f.AnonymousClass2 pollFirst = this.getMax.pollFirst();
            if (pollFirst == null) {
                return null;
            }
            if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.equals.setMax)) {
                this.setMin.setMin();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.IsOverlapping.getMax)) {
                this.setMin.getMin();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.setMin.getMax)) {
                this.setMin.setMax();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.getMax.getMin)) {
                this.setMin.length();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.toString.getMax)) {
                this.setMin.getMax();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.length.length)) {
                this.setMin.equals();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.isInside.setMin)) {
                this.setMin.IsOverlapping();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.toFloatRange.length)) {
                this.setMin.toIntRange();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.getMin.getMin)) {
                this.setMin.isInside();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.setMax.getMin)) {
                this.setMin.toFloatRange();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f$2$FastBitmap$CoordinateSystem.setMax)) {
                this.setMin.values();
            } else if (Intrinsics.areEqual((Object) pollFirst, (Object) f.AnonymousClass2.toIntRange.setMin)) {
                this.setMin.toDoubleRange();
            }
            return Unit.INSTANCE;
        }

        public final boolean setMin() {
            return this.getMax.isEmpty();
        }
    };
    @Inject
    public FileMangerBridgeExtension.AnonymousClass1.getMax paymentSettingPresenter;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public MemoryWarningBridgeExtension.AnonymousClass1.setMax referralDialogPresenter;
    /* access modifiers changed from: private */
    public isBaselineAligned setMax;
    @Inject
    public ToolUtils.setMin tncSummaryPresenter;
    /* access modifiers changed from: private */
    public setPublishStatus toDoubleRange;
    /* access modifiers changed from: private */
    public isBaselineAligned toFloatRange;
    /* access modifiers changed from: private */
    public isBaselineAligned toIntRange;
    /* access modifiers changed from: private */
    public GriverJSAPIPermission toString;
    @Inject
    public MultilevelSelectActivity.AnonymousClass1.length twilioDialogPresenter;
    @Inject
    public TitleBarExtension.AnonymousClass1.getMin twilioIntroductionPresenter;
    public DanaUpdateManager updateManager;
    @Inject
    public MultilevelSelectCallBack.getMin userConfigPresenter;
    private final Lazy valueOf = LazyKt.lazy(IsOverlapping.INSTANCE);
    /* access modifiers changed from: private */
    public vibrateLong values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/home/HomeTabActivity$PaymentSettingListener;", "", "onCancelled", "", "reason", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMax();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/HomeTabActivity$FinishSubActivitiesMessageEvent;", "", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.onPostMessage;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.onPostMessage == null) {
            this.onPostMessage = new HashMap();
        }
        View view = (View) this.onPostMessage.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.onPostMessage.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_home_tab;
    }

    @NotNull
    public final GriverManifest.AnonymousClass53 getSwipeDelegateListener() {
        return (GriverManifest.AnonymousClass53) this.b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/base/callback/DanaH5CallbackKt$withDanaH5Callback$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerCreated", "", "bundle", "Landroid/os/Bundle;", "onContainerDestroyed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString implements setCancelOnTouchOutside$core {
        final /* synthetic */ HomeTabActivity getMax;

        public toString(HomeTabActivity homeTabActivity) {
            this.getMax = homeTabActivity;
        }

        public final void onContainerCreated(@Nullable Bundle bundle) {
            HomeTabActivity.access$savePopupKycDismiss(this.getMax);
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.getMax.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/home/HomeTabActivity$getTwilioDialogModule$1", "Lid/dana/twilio/twiliodialog/TwilioDialogContract$View;", "onError", "", "errorMessage", "", "onGetProfileSettingModelSuccess", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "onShowTwilioDialog", "showCheckBox", "", "securityId", "onSkipTwilioDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class ICustomTabsCallback implements MultilevelSelectActivity.AnonymousClass1.setMin {
        final /* synthetic */ HomeTabActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class Default extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ HomeTabActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Default(HomeTabActivity homeTabActivity) {
                super(1);
                this.this$0 = homeTabActivity;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.getFaceAuthPopUpConsultationPresenter().length();
                this.this$0.nextOnboardingStep();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/home/HomeTabActivity$setupUpdateManager$1", "Lid/dana/googleplay/updates/DanaUpdateManager$SilentUpdateCallback;", "onUpdatesError", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class Stub implements DanaUpdateManager.setMin {
            final /* synthetic */ HomeTabActivity getMax;

            @JvmDefault
            public final void getMax() {
            }

            public final void length() {
            }

            public final void setMin() {
            }

            Stub(HomeTabActivity homeTabActivity) {
                this.getMax = homeTabActivity;
            }

            public final void setMax() {
                HomeTabActivity.access$checkUpdatesManually(this.getMax);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            static final class Proxy implements View.OnClickListener {
                final /* synthetic */ HomeTabActivity getMax;
                final /* synthetic */ GriverManifest.AnonymousClass6 setMax;

                Proxy(HomeTabActivity homeTabActivity, GriverManifest.AnonymousClass6 r2) {
                    this.getMax = homeTabActivity;
                    this.setMax = r2;
                }

                public final void onClick(View view) {
                    HomeTabActivity homeTabActivity = this.getMax;
                    EddInfoModel eddInfoModel = this.setMax.getMin;
                    if (eddInfoModel != null) {
                        HomeTabActivity.access$openKycAmlEddActivity(homeTabActivity, eddInfoModel);
                    }
                }
            }
        }

        ICustomTabsCallback(HomeTabActivity homeTabActivity) {
            this.getMax = homeTabActivity;
        }

        public final void getMax(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            HomeTabActivity.access$showTwilioDialog(this.getMax, z, str);
        }

        public final void setMax() {
            this.getMax.nextOnboardingStep();
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, "setting");
            HomeTabActivity.access$goToProfileActivity(this.getMax, settingModel);
        }

        public final void onError(@Nullable String str) {
            this.getMax.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"id/dana/home/HomeTabActivity$showPaymentSettingBottomSheet$1$1", "Lid/dana/paymentsetting/BottomSheetPaymentSettingFragment$BottomSheetListener;", "onBottomSheetDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class ICustomTabsService implements FileMangerBridgeExtension.AnonymousClass2.setMin {
        final /* synthetic */ HomeTabActivity setMax;
        final /* synthetic */ FileMangerBridgeExtension.AnonymousClass2 setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/home/HomeTabActivity$showTwilioFailedDialog$1$2"}, k = 3, mv = {1, 4, 2})
        static final class Default extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ HomeTabActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Default(HomeTabActivity homeTabActivity) {
                super(1);
                this.this$0 = homeTabActivity;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.getTwilioDialogPresenter().getMax();
                HomeTabActivity.access$getTwilioFailedDialog$p(this.this$0).dismiss();
                HomeTabActivity.access$showTwilioMaybeLaterSnackbar(this.this$0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/home/HomeTabActivity$showTwilioSuccessDialog$1$1"}, k = 3, mv = {1, 4, 2})
        static final class Stub extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ HomeTabActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Stub(HomeTabActivity homeTabActivity) {
                super(1);
                this.this$0 = homeTabActivity;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                HomeTabActivity.access$getTwilioDialog$p(this.this$0).setMax();
                this.this$0.startActivity(new Intent(this.this$0, TrustedDeviceActivity.class));
                this.this$0.nextOnboardingStep();
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            static final class Proxy implements View.OnClickListener {
                final /* synthetic */ HomeTabActivity setMax;

                Proxy(HomeTabActivity homeTabActivity) {
                    this.setMax = homeTabActivity;
                }

                public final void onClick(View view) {
                    HomeTabActivity.access$getTwilioSnackbar$p(this.setMax).dismiss();
                }
            }
        }

        ICustomTabsService(FileMangerBridgeExtension.AnonymousClass2 r1, HomeTabActivity homeTabActivity) {
            this.setMin = r1;
            this.setMax = homeTabActivity;
        }

        public final void getMax() {
            this.setMin.dismiss();
            this.setMax.getPaymentSettingPresenter().length("SWITCH_AOUTOROUTE_ON");
        }

        public final void getMin() {
            this.setMin.dismiss();
            this.setMax.getPaymentSettingPresenter().length("SWITCH_PAYMENT_AUTH_ON");
        }

        public final void setMax() {
            this.setMax.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/home/HomeTabActivity$showPaymentSettingFailedDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class extraCommand extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ HomeTabActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        extraCommand(HomeTabActivity homeTabActivity) {
            super(1);
            this.this$0 = homeTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            HomeTabActivity.access$getPaymentSettingFailedDialog$p(this.this$0).dismiss();
            this.this$0.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getDefaultImpl extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ HomeTabActivity $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getDefaultImpl(HomeTabActivity homeTabActivity) {
            super(1);
            this.$this_run = homeTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            HomeTabActivity.access$getKycRenewalDialog$p(this.$this_run).dismiss();
            HomeTabActivity.access$savePopupKycClick(this.$this_run);
            HomeTabActivity.access$openKycRenewalContainer(this.$this_run);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getInterfaceDescriptor extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ HomeTabActivity $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(HomeTabActivity homeTabActivity) {
            super(1);
            this.$this_run = homeTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            HomeTabActivity.access$getKycRenewalDialog$p(this.$this_run).dismiss();
            HomeTabActivity.access$savePopupKycDismiss(this.$this_run);
            HomeTabActivity.access$savePopupKycClick(this.$this_run);
            this.$this_run.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/home/HomeTabActivity$showPaymentSettingFailedDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class mayLaunchUrl extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ HomeTabActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        mayLaunchUrl(HomeTabActivity homeTabActivity) {
            super(1);
            this.this$0 = homeTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            HomeTabActivity.access$getPaymentSettingFailedDialog$p(this.this$0).dismiss();
            this.this$0.getPaymentSettingPresenter().length("SWITCH_AOUTOROUTE_ON");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/home/HomeTabActivity$showTwilioFailedDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class postMessage extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ HomeTabActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        postMessage(HomeTabActivity homeTabActivity) {
            super(1);
            this.this$0 = homeTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            HomeTabActivity.access$getTwilioFailedDialog$p(this.this$0).dismiss();
            this.this$0.getTwilioDialogPresenter().getMax();
            this.this$0.getTwilioDialogPresenter().setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/home/HomeTabActivity$showTwilioSuccessDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class receiveFile extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ HomeTabActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        receiveFile(HomeTabActivity homeTabActivity) {
            super(1);
            this.this$0 = homeTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            HomeTabActivity.access$getTwilioDialog$p(this.this$0).setMax();
            HomeTabActivity.access$getTwilioSuccessDialog$p(this.this$0).dismiss();
            this.this$0.nextOnboardingStep();
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [o.setFavoriteBtnVisibility] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$checkReferralDialog(id.dana.home.HomeTabActivity r8) {
        /*
            android.content.Context r0 = r8.getBaseContext()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            r2 = 1364480097(0x51545061, float:5.69926E10)
            r3 = 0
            if (r0 == 0) goto L_0x0025
            int r0 = o.dispatchOnCancelled.length(r0, r3)
            if (r0 == 0) goto L_0x0025
            o.onCanceled r4 = new o.onCanceled
            r5 = 4
            r4.<init>(r3, r0, r5)
            o.onCancelLoad.setMax(r2, r4)
            o.onCancelLoad.getMin(r2, r4)
        L_0x0025:
            int r0 = o.dispatchOnCancelled.getMax(r3)
            if (r0 == 0) goto L_0x0038
            o.onCanceled r4 = new o.onCanceled
            r5 = 16
            r4.<init>(r3, r0, r5)
            o.onCancelLoad.setMax(r2, r4)
            o.onCancelLoad.getMin(r2, r4)
        L_0x0038:
            o.vibrateLong r0 = r8.values
            if (r0 != 0) goto L_0x0041
            java.lang.String r2 = "referralEngagementDialogModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0041:
            long r4 = r0.setMin
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004a
            r3 = 1
        L_0x004a:
            if (r3 != 0) goto L_0x004d
            r1 = r0
        L_0x004d:
            if (r1 == 0) goto L_0x00ad
            long r2 = r1.setMin
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            r8.length()
            return
        L_0x0059:
            long r4 = r1.setMin
            o.GriverProgressBar$UpdateRunnable r0 = r8.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0062
            r0.dispose()
        L_0x0062:
            id.dana.home.HomeTabActivity$IPostMessageService$Stub$Proxy r0 = id.dana.home.HomeTabActivity.IPostMessageService.Stub.Proxy.getMin
            o.isShowTitleBarFavorite r0 = (o.isShowTitleBarFavorite) r0
            o.setFavoriteBtnVisibility r3 = o.setFavoriteBtnVisibility.getMax((o.isShowTitleBarFavorite) r0)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            o.hasCornerMarking r7 = o.getSecureSignatureComp.getMin()
            java.lang.String r0 = "unit is null"
            o.setRefreshAnimation.getMax(r6, (java.lang.String) r0)
            java.lang.String r0 = "scheduler is null"
            o.setRefreshAnimation.getMax(r7, (java.lang.String) r0)
            o.enableTargetOffset r1 = new o.enableTargetOffset
            r2 = r1
            r2.<init>(r3, r4, r6, r7)
            o.RedDotDrawable<? super o.setFavoriteBtnVisibility, ? extends o.setFavoriteBtnVisibility> r2 = o.SecuritySignature.valueOf
            if (r2 == 0) goto L_0x008a
            java.lang.Object r1 = o.SecuritySignature.getMax(r2, r1)
            o.setFavoriteBtnVisibility r1 = (o.setFavoriteBtnVisibility) r1
        L_0x008a:
            o.hasCornerMarking r2 = o.hideProgress.length()
            o.setRefreshAnimation.getMax(r2, (java.lang.String) r0)
            o.setRefreshOffset r0 = new o.setRefreshOffset
            r0.<init>(r1, r2)
            o.RedDotDrawable<? super o.setFavoriteBtnVisibility, ? extends o.setFavoriteBtnVisibility> r1 = o.SecuritySignature.valueOf
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r0 = o.SecuritySignature.getMax(r1, r0)
            o.setFavoriteBtnVisibility r0 = (o.setFavoriteBtnVisibility) r0
        L_0x00a0:
            id.dana.home.HomeTabActivity$IPostMessageService$Default r1 = new id.dana.home.HomeTabActivity$IPostMessageService$Default
            r1.<init>(r8)
            o.removeStateDidChangeHandler r1 = (o.removeStateDidChangeHandler) r1
            o.GriverProgressBar$UpdateRunnable r0 = r0.getMin((o.removeStateDidChangeHandler) r1)
            r8.FastBitmap$CoordinateSystem = r0
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.home.HomeTabActivity.access$checkReferralDialog(id.dana.home.HomeTabActivity):void");
    }

    public static final /* synthetic */ void access$checkUpdatesManually(HomeTabActivity homeTabActivity) {
        int max;
        Context baseContext = homeTabActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1379908803 == (max = dispatchOnCancelled.getMax(applicationContext, -1379908803)))) {
            onCanceled oncanceled = new onCanceled(-1379908803, max, 512);
            onCancelLoad.setMax(-1379908803, oncanceled);
            onCancelLoad.getMin(-1379908803, oncanceled);
        }
        DanaUpdateManager danaUpdateManager = homeTabActivity.updateManager;
        if (danaUpdateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateManager");
        }
        DanaUpdateManager.setMax isinside = new isInside(homeTabActivity);
        Intrinsics.checkNotNullParameter(isinside, "callback");
        Function0 todoublerange = new DanaUpdateManager.toDoubleRange(danaUpdateManager, isinside);
        if (danaUpdateManager.getMin) {
            todoublerange.invoke();
            return;
        }
        List<Runnable> list = danaUpdateManager.length;
        if (list != null) {
            list.add(new DanaUpdateManager.hashCode(todoublerange));
        }
    }

    public static final /* synthetic */ setPublishStatus access$getDanaLoadingDialog$p(HomeTabActivity homeTabActivity) {
        setPublishStatus setpublishstatus = homeTabActivity.toDoubleRange;
        if (setpublishstatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaLoadingDialog");
        }
        return setpublishstatus;
    }

    public static final /* synthetic */ TwoButtonWithImageDialog access$getFaceLoginDialog$p(HomeTabActivity homeTabActivity) {
        TwoButtonWithImageDialog twoButtonWithImageDialog = homeTabActivity.equals;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceLoginDialog");
        }
        return twoButtonWithImageDialog;
    }

    public static final /* synthetic */ GriverManifest.AnonymousClass30 access$getHomeFragmentPagerStateAdapter$p(HomeTabActivity homeTabActivity) {
        GriverManifest.AnonymousClass30 r1 = homeTabActivity.getMin;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeFragmentPagerStateAdapter");
        }
        return r1;
    }

    public static final /* synthetic */ isBaselineAligned access$getKycRenewalDialog$p(HomeTabActivity homeTabActivity) {
        isBaselineAligned isbaselinealigned = homeTabActivity.toFloatRange;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalDialog");
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ isBaselineAligned access$getPaymentSettingFailedDialog$p(HomeTabActivity homeTabActivity) {
        isBaselineAligned isbaselinealigned = homeTabActivity.setMax;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentSettingFailedDialog");
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ String access$getPushToken$p(HomeTabActivity homeTabActivity) {
        String str = homeTabActivity.Grayscale$Algorithm;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushToken");
        }
        return str;
    }

    public static final /* synthetic */ GriverJSAPIPermission access$getReferralEngagementDialog$p(HomeTabActivity homeTabActivity) {
        GriverJSAPIPermission griverJSAPIPermission = homeTabActivity.toString;
        if (griverJSAPIPermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralEngagementDialog");
        }
        return griverJSAPIPermission;
    }

    public static final /* synthetic */ vibrateLong access$getReferralEngagementDialogModel$p(HomeTabActivity homeTabActivity) {
        vibrateLong vibratelong = homeTabActivity.values;
        if (vibratelong == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralEngagementDialogModel");
        }
        return vibratelong;
    }

    public static final /* synthetic */ TwoButtonWithImageDialog access$getTwilioDialog$p(HomeTabActivity homeTabActivity) {
        TwoButtonWithImageDialog twoButtonWithImageDialog = homeTabActivity.isInside;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioDialog");
        }
        return twoButtonWithImageDialog;
    }

    public static final /* synthetic */ isBaselineAligned access$getTwilioFailedDialog$p(HomeTabActivity homeTabActivity) {
        isBaselineAligned isbaselinealigned = homeTabActivity.toIntRange;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioFailedDialog");
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ setProgressViewOffset access$getTwilioSnackbar$p(HomeTabActivity homeTabActivity) {
        setProgressViewOffset setprogressviewoffset = homeTabActivity.hashCode;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioSnackbar");
        }
        return setprogressviewoffset;
    }

    public static final /* synthetic */ isBaselineAligned access$getTwilioSuccessDialog$p(HomeTabActivity homeTabActivity) {
        isBaselineAligned isbaselinealigned = homeTabActivity.IsOverlapping;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioSuccessDialog");
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ void access$goToProfileActivity(HomeTabActivity homeTabActivity, SettingModel settingModel) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(71815518, oncanceled);
            onCancelLoad.getMin(71815518, oncanceled);
        }
        Intent intent = new Intent(homeTabActivity, SettingMoreProfileActivity.class);
        intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
        setMin.getMax getmax = setMin.getMax;
        homeTabActivity.startActivityForResult(intent, setMin.getMax.length());
    }

    public static final /* synthetic */ void access$openKycAmlEddActivity(HomeTabActivity homeTabActivity, EddInfoModel eddInfoModel) {
        int length2;
        int min;
        Context baseContext = homeTabActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-2056990621, oncanceled);
            onCancelLoad.getMin(-2056990621, oncanceled);
        }
        Intent intent = new Intent(homeTabActivity, KycAmlEddActivity.class);
        intent.putExtra(KycAmlEddActivity.KYC_AML_EDD_INTENT, eddInfoModel);
        KycAmlEddActivity.getMin getmin = KycAmlEddActivity.Companion;
        homeTabActivity.startActivityForResult(intent, KycAmlEddActivity.getMin.setMax());
    }

    public static final /* synthetic */ void access$showGlobalNetworkDialog(HomeTabActivity homeTabActivity, GnContentModel gnContentModel, String str) {
        int max;
        Context baseContext = homeTabActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1245983783 == (max = dispatchOnCancelled.getMax(applicationContext, 1245983783)))) {
            onCanceled oncanceled = new onCanceled(1245983783, max, 512);
            onCancelLoad.setMax(1245983783, oncanceled);
            onCancelLoad.getMin(1245983783, oncanceled);
        }
        Intent intent = new Intent(homeTabActivity, OnboardingGlobalNetworkSheetActivity.class);
        intent.putExtra(OnboardingGlobalNetworkSheetActivity.EXTRA_GN_CONTENT, gnContentModel);
        intent.putExtra(OnboardingGlobalNetworkSheetActivity.EXTRA_GN_COUNTRY_CODE, str);
        homeTabActivity.startActivityForResult(intent, HomeFragment.setMin);
    }

    public static final /* synthetic */ void access$showKycRenewalDialog(HomeTabActivity homeTabActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(190938882, oncanceled);
            onCancelLoad.getMin(190938882, oncanceled);
        }
        HomeTabActivity homeTabActivity2 = homeTabActivity;
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(homeTabActivity2);
        getmax.setMax = R.drawable.ic_kyc_renewal_dialog;
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.toFloatRange = homeTabActivity2.getString(R.string.kyc_renewal_dialog_title);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.isInside = homeTabActivity2.getString(R.string.kyc_renewal_dialog_message);
        getProgressViewStartOffset.getMax IsOverlapping2 = getmax3.setMax(false).IsOverlapping();
        IsOverlapping2.toIntRange = 0;
        getProgressViewStartOffset.getMax max2 = IsOverlapping2.setMin(homeTabActivity2.getString(R.string.kyc_renewal_dialog_update_button_text), new getDefaultImpl(homeTabActivity2)).getMax(homeTabActivity2.getString(R.string.kyc_renewal_dialog_later_button_text), new getInterfaceDescriptor(homeTabActivity2));
        isBaselineAligned min = new getProgressViewStartOffset(max2.invoke, max2.length, max2, max2.equals, (byte) 0).getMin();
        homeTabActivity2.toFloatRange = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalDialog");
        }
        min.show();
        long j = homeTabActivity2.Mean$Arithmetic;
        AboutInfoBridgeExtension aboutInfoBridgeExtension = homeTabActivity2.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        aboutInfoBridgeExtension.getMax.execute(AboutInfoBridgeExtension.length(j), AboutInfoBridgeExtension$Grayscale$Algorithm.INSTANCE, AboutInfoBridgeExtension.ICustomTabsCallback.INSTANCE);
    }

    public static final /* synthetic */ void access$suggestEnrollFaceLogin(HomeTabActivity homeTabActivity) {
        int max;
        Context baseContext = homeTabActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 107611272 == (max = dispatchOnCancelled.getMax(applicationContext, 107611272)))) {
            onCanceled oncanceled = new onCanceled(107611272, max, 512);
            onCancelLoad.setMax(107611272, oncanceled);
            onCancelLoad.getMin(107611272, oncanceled);
        }
        if (extraCallback) {
            homeTabActivity.nextOnboardingStep();
            return;
        }
        remover.getMin getmin = homeTabActivity.faceAuthPopUpConsultationPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceAuthPopUpConsultationPresenter");
        }
        getmin.setMin();
    }

    @NotNull
    public final PdfImageSource.setMin getPlayStoreReviewPresenter() {
        PdfImageSource.setMin setmin = this.playStoreReviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playStoreReviewPresenter");
        }
        return setmin;
    }

    public final void setPlayStoreReviewPresenter(@NotNull PdfImageSource.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.playStoreReviewPresenter = setmin;
    }

    @NotNull
    public final moveToStart.setMin getDanaContactPresenter() {
        moveToStart.setMin setmin = this.danaContactPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaContactPresenter");
        }
        return setmin;
    }

    public final void setDanaContactPresenter(@NotNull moveToStart.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.danaContactPresenter = setmin;
    }

    @NotNull
    public final ToolUtils.setMin getTncSummaryPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(299678412, oncanceled);
            onCancelLoad.getMin(299678412, oncanceled);
        }
        ToolUtils.setMin setmin = this.tncSummaryPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tncSummaryPresenter");
        }
        return setmin;
    }

    public final void setTncSummaryPresenter(@NotNull ToolUtils.setMin setmin) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1641240242 == (max = dispatchOnCancelled.getMax(applicationContext, -1641240242)))) {
            onCanceled oncanceled = new onCanceled(-1641240242, max, 512);
            onCancelLoad.setMax(-1641240242, oncanceled);
            onCancelLoad.getMin(-1641240242, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.tncSummaryPresenter = setmin;
    }

    @NotNull
    public final FileMangerBridgeExtension.AnonymousClass1.getMax getPaymentSettingPresenter() {
        FileMangerBridgeExtension.AnonymousClass1.getMax getmax = this.paymentSettingPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentSettingPresenter");
        }
        return getmax;
    }

    public final void setPaymentSettingPresenter(@NotNull FileMangerBridgeExtension.AnonymousClass1.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.paymentSettingPresenter = getmax;
    }

    @NotNull
    public final remover.getMin getFaceAuthPopUpConsultationPresenter() {
        remover.getMin getmin = this.faceAuthPopUpConsultationPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceAuthPopUpConsultationPresenter");
        }
        return getmin;
    }

    public final void setFaceAuthPopUpConsultationPresenter(@NotNull remover.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.faceAuthPopUpConsultationPresenter = getmin;
    }

    @NotNull
    public final AboutInfoBridgeExtension getKycRenewalPresenter() {
        AboutInfoBridgeExtension aboutInfoBridgeExtension = this.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        return aboutInfoBridgeExtension;
    }

    public final void setKycRenewalPresenter(@NotNull AboutInfoBridgeExtension aboutInfoBridgeExtension) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(245035670, oncanceled);
            onCancelLoad.getMin(245035670, oncanceled);
        }
        Intrinsics.checkNotNullParameter(aboutInfoBridgeExtension, "<set-?>");
        this.kycRenewalPresenter = aboutInfoBridgeExtension;
    }

    @NotNull
    public final MultilevelSelectActivity.AnonymousClass1.length getTwilioDialogPresenter() {
        MultilevelSelectActivity.AnonymousClass1.length length2 = this.twilioDialogPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioDialogPresenter");
        }
        return length2;
    }

    public final void setTwilioDialogPresenter(@NotNull MultilevelSelectActivity.AnonymousClass1.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.twilioDialogPresenter = length2;
    }

    @NotNull
    public final TitleBarExtension.AnonymousClass1.getMin getTwilioIntroductionPresenter() {
        TitleBarExtension.AnonymousClass1.getMin getmin = this.twilioIntroductionPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
        }
        return getmin;
    }

    public final void setTwilioIntroductionPresenter(@NotNull TitleBarExtension.AnonymousClass1.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.twilioIntroductionPresenter = getmin;
    }

    @NotNull
    public final JSAPIMonitorExtension getKycAmlEddPresenter() {
        JSAPIMonitorExtension jSAPIMonitorExtension = this.kycAmlEddPresenter;
        if (jSAPIMonitorExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAmlEddPresenter");
        }
        return jSAPIMonitorExtension;
    }

    public final void setKycAmlEddPresenter(@NotNull JSAPIMonitorExtension jSAPIMonitorExtension) {
        Intrinsics.checkNotNullParameter(jSAPIMonitorExtension, "<set-?>");
        this.kycAmlEddPresenter = jSAPIMonitorExtension;
    }

    @NotNull
    public final onNext.setMin getGlobalNetworkPresenter() {
        onNext.setMin setmin = this.globalNetworkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
        }
        return setmin;
    }

    public final void setGlobalNetworkPresenter(@NotNull onNext.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.globalNetworkPresenter = setmin;
    }

    @NotNull
    public final EmbedViewBridgeExtension getMiniProgramPresenter() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1000257162, oncanceled);
            onCancelLoad.getMin(-1000257162, oncanceled);
        }
        EmbedViewBridgeExtension embedViewBridgeExtension = this.miniProgramPresenter;
        if (embedViewBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("miniProgramPresenter");
        }
        return embedViewBridgeExtension;
    }

    public final void setMiniProgramPresenter(@NotNull EmbedViewBridgeExtension embedViewBridgeExtension) {
        Intrinsics.checkNotNullParameter(embedViewBridgeExtension, "<set-?>");
        this.miniProgramPresenter = embedViewBridgeExtension;
    }

    @NotNull
    public final MultilevelSelectCallBack.getMin getUserConfigPresenter() {
        MultilevelSelectCallBack.getMin getmin = this.userConfigPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userConfigPresenter");
        }
        return getmin;
    }

    public final void setUserConfigPresenter(@NotNull MultilevelSelectCallBack.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.userConfigPresenter = getmin;
    }

    @NotNull
    public final AUIconDrawable getFeedsContentAction() {
        AUIconDrawable aUIconDrawable = this.feedsContentAction;
        if (aUIconDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedsContentAction");
        }
        return aUIconDrawable;
    }

    public final void setFeedsContentAction(@NotNull AUIconDrawable aUIconDrawable) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-325224694, oncanceled);
            onCancelLoad.getMin(-325224694, oncanceled);
        }
        Intrinsics.checkNotNullParameter(aUIconDrawable, "<set-?>");
        this.feedsContentAction = aUIconDrawable;
    }

    @NotNull
    public final MemoryWarningBridgeExtension.AnonymousClass1.setMax getReferralDialogPresenter() {
        MemoryWarningBridgeExtension.AnonymousClass1.setMax setmax = this.referralDialogPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralDialogPresenter");
        }
        return setmax;
    }

    public final void setReferralDialogPresenter(@NotNull MemoryWarningBridgeExtension.AnonymousClass1.setMax setmax) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1737029162 == (max = dispatchOnCancelled.getMax(applicationContext, 1737029162)))) {
            onCanceled oncanceled = new onCanceled(1737029162, max, 512);
            onCancelLoad.setMax(1737029162, oncanceled);
            onCancelLoad.getMin(1737029162, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.referralDialogPresenter = setmax;
    }

    @NotNull
    public final DanaUpdateManager getUpdateManager() {
        DanaUpdateManager danaUpdateManager = this.updateManager;
        if (danaUpdateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateManager");
        }
        return danaUpdateManager;
    }

    public final void setUpdateManager(@NotNull DanaUpdateManager danaUpdateManager) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-483230459, oncanceled);
            onCancelLoad.getMin(-483230459, oncanceled);
        }
        Intrinsics.checkNotNullParameter(danaUpdateManager, "<set-?>");
        this.updateManager = danaUpdateManager;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/paymentsetting/BottomSheetPaymentSettingFragment;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<FileMangerBridgeExtension.AnonymousClass2> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(0);
        }

        @NotNull
        public final FileMangerBridgeExtension.AnonymousClass2 invoke() {
            return new order() {
                private HashMap getMax;
                @Nullable
                public setMin getMin;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/paymentsetting/BottomSheetPaymentSettingFragment$BottomSheetListener;", "", "onBottomSheetDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.FileMangerBridgeExtension$2$setMin */
                public interface setMin {
                    void getMax();

                    void getMin();

                    void setMax();
                }

                private View setMax(int i) {
                    if (this.getMax == null) {
                        this.getMax = new HashMap();
                    }
                    View view = (View) this.getMax.get(Integer.valueOf(i));
                    if (view != null) {
                        return view;
                    }
                    View view2 = getView();
                    if (view2 == null) {
                        return null;
                    }
                    View findViewById = view2.findViewById(i);
                    this.getMax.put(Integer.valueOf(i), findViewById);
                    return findViewById;
                }

                public final int getMin() {
                    return R.layout.fragment_bottom_sheet_payment_setting;
                }

                public final float length() {
                    return 0.5f;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.FileMangerBridgeExtension$2$getMax */
                static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                    getMax(ViewPager2 viewPager2) {
                        super(1, viewPager2, ViewPager2.class, "setCurrentItem", "setCurrentItem(I)V", 0);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i) {
                        ((ViewPager2) this.receiver).setCurrentItem(i);
                    }
                }

                @Nullable
                public final FrameLayout getMax() {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) setMax(resetInternal.setMax.initViewTreeOwners);
                    if (coordinatorLayout != null) {
                        return (FrameLayout) coordinatorLayout.findViewById(R.id.f44242131362949);
                    }
                    return null;
                }

                public final void setMax() {
                    super.setMax();
                    ViewPager2 viewPager2 = (ViewPager2) setMax(resetInternal.setMax.setPivotX);
                    if (viewPager2 != null) {
                        Context context = viewPager2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                        viewPager2.setAdapter(new uploadFile(context, new getMax(viewPager2)));
                    }
                    TabLayout tabLayout = (TabLayout) setMax(resetInternal.setMax.getFixedWidthMajor);
                    if (tabLayout != null) {
                        ViewPager2 viewPager22 = (ViewPager2) setMax(resetInternal.setMax.setPivotX);
                        Intrinsics.checkNotNullExpressionValue(viewPager22, "view_pager");
                        BLEBridgeExtension.setMax(tabLayout, viewPager22, BLEBridgeExtension.length.INSTANCE);
                        Unit unit = Unit.INSTANCE;
                    }
                    DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMax(resetInternal.setMax.MediaMetadataCompat);
                    if (danaButtonPrimaryView != null) {
                        danaButtonPrimaryView.setOnClickListener(new length(this));
                    }
                    Button button = (Button) setMax(resetInternal.setMax.IPostMessageService$Stub);
                    if (button != null) {
                        button.setOnClickListener(new getMin(this));
                    }
                }

                public final void onCreate(@Nullable Bundle bundle) {
                    super.onCreate(bundle);
                    setStyle(0, R.style.f78532131951924);
                }

                public final void onStart() {
                    super.onStart();
                    getMax(getDialog());
                    length(getDialog());
                }

                public final void setMin() {
                    super.setMin();
                    setMin(setMin(getDialog()), 3);
                    Dialog dialog = getDialog();
                    if (dialog != null) {
                        BottomSheetBehavior<FrameLayout> behavior = ((BottomSheetDialog) dialog).getBehavior();
                        Intrinsics.checkNotNullExpressionValue(behavior, "(dialog as BottomSheetDialog).behavior");
                        behavior.addBottomSheetCallback(new setMax(this, behavior));
                        behavior.setDraggable(false);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.FileMangerBridgeExtension$2$length */
                static final class length implements View.OnClickListener {
                    final /* synthetic */ AnonymousClass2 setMin;

                    length(AnonymousClass2 r1) {
                        this.setMin = r1;
                    }

                    public final void onClick(View view) {
                        setMin setmin = this.setMin.getMin;
                        if (setmin != null) {
                            setmin.getMax();
                        }
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.FileMangerBridgeExtension$2$getMin */
                static final class getMin implements View.OnClickListener {
                    final /* synthetic */ AnonymousClass2 setMax;

                    getMin(AnonymousClass2 r1) {
                        this.setMax = r1;
                    }

                    public final void onClick(View view) {
                        setMin setmin = this.setMax.getMin;
                        if (setmin != null) {
                            setmin.getMin();
                        }
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"id/dana/paymentsetting/BottomSheetPaymentSettingFragment$setupBottomSheet$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "view", "Landroid/view/View;", "offset", "", "onStateChanged", "state", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.FileMangerBridgeExtension$2$setMax */
                public static final class setMax extends BottomSheetBehavior.BottomSheetCallback {
                    final /* synthetic */ BottomSheetBehavior setMax;
                    final /* synthetic */ AnonymousClass2 setMin;

                    public final void onSlide(@NotNull View view, float f) {
                        Intrinsics.checkNotNullParameter(view, "view");
                    }

                    setMax(AnonymousClass2 r1, BottomSheetBehavior bottomSheetBehavior) {
                        this.setMin = r1;
                        this.setMax = bottomSheetBehavior;
                    }

                    public final void onStateChanged(@NotNull View view, int i) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        if (i == 1) {
                            this.setMax.setState(3);
                        } else if (i == 5) {
                            setMin setmin = this.setMin.getMin;
                            if (setmin != null) {
                                setmin.setMax();
                            }
                            this.setMin.dismissAllowingStateLoss();
                        }
                    }
                }

                public final /* synthetic */ void onDestroyView() {
                    super.onDestroyView();
                    HashMap hashMap = this.getMax;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                }
            };
        }
    }

    @Nullable
    public final getMin getAutoRouteListener() {
        return this.getCause;
    }

    public final void setAutoRouteListener(@Nullable getMin getmin) {
        this.getCause = getmin;
    }

    @Nullable
    public final getMin getPaymentAuthListener() {
        return this.ICustomTabsCallback;
    }

    public final void setPaymentAuthListener(@Nullable getMin getmin) {
        this.ICustomTabsCallback = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/home/HomeTabActivity$showTwilioMaybeLaterSnackbar$2", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$BaseCallback;", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "onDismissed", "", "transientBottomBar", "event", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IPostMessageService extends BaseTransientBottomBar.BaseCallback<setProgressViewOffset> {
        final /* synthetic */ HomeTabActivity length;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/home/HomeTabActivity$swipeDelegateListener$2$1", "invoke", "()Lid/dana/home/HomeTabActivity$swipeDelegateListener$2$1;"}, k = 3, mv = {1, 4, 2})
        static final class Stub extends Lambda implements Function0<AnonymousClass4> {
            final /* synthetic */ HomeTabActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Stub(HomeTabActivity homeTabActivity) {
                super(0);
                this.this$0 = homeTabActivity;
            }

            @NotNull
            public final AnonymousClass4 invoke() {
                return new GriverManifest.AnonymousClass53(this) {
                    final /* synthetic */ Stub getMax;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/social/FeedsFragment;", "invoke"}, k = 3, mv = {1, 4, 2})
                    /* renamed from: id.dana.home.HomeTabActivity$IPostMessageService$Stub$4$getMax */
                    static final class getMax extends Lambda implements Function1<FeedsFragment, Unit> {
                        final /* synthetic */ String $source;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        getMax(String str) {
                            super(1);
                            this.$source = str;
                        }

                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FeedsFragment) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FeedsFragment feedsFragment) {
                            Intrinsics.checkNotNullParameter(feedsFragment, "it");
                            String str = this.$source;
                            if (feedsFragment.setMax != null) {
                                LogLiteManager logLiteManager = feedsFragment.setMax;
                                if (logLiteManager == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
                                }
                                if (logLiteManager.getCount() > 1 && (logLiteManager.getMin.get(1) instanceof FriendsFeedsFragment)) {
                                    ViewPager viewPager = (ViewPager) feedsFragment.getMin(resetInternal.setMax.setTransitionState);
                                    Intrinsics.checkNotNullExpressionValue(viewPager, "vp_feeds");
                                    viewPager.setCurrentItem(1);
                                    Fragment max = feedsFragment.getMax();
                                    if (max != null) {
                                        max.onResume();
                                    }
                                    feedsFragment.setMax(str, 1);
                                }
                                feedsFragment.equals();
                            }
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/social/FeedsFragment;", "invoke"}, k = 3, mv = {1, 4, 2})
                    /* renamed from: id.dana.home.HomeTabActivity$IPostMessageService$Stub$4$length */
                    static final class length extends Lambda implements Function1<FeedsFragment, Unit> {
                        final /* synthetic */ String $source;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        length(String str) {
                            super(1);
                            this.$source = str;
                        }

                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FeedsFragment) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FeedsFragment feedsFragment) {
                            Intrinsics.checkNotNullParameter(feedsFragment, "it");
                            String str = this.$source;
                            if (feedsFragment.setMax != null) {
                                LogLiteManager logLiteManager = feedsFragment.setMax;
                                if (logLiteManager == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
                                }
                                if (logLiteManager.getCount() > 1 && (logLiteManager.getMin.get(0) instanceof MyFeedsFragment)) {
                                    ViewPager viewPager = (ViewPager) feedsFragment.getMin(resetInternal.setMax.setTransitionState);
                                    Intrinsics.checkNotNullExpressionValue(viewPager, "vp_feeds");
                                    viewPager.setCurrentItem(0);
                                    Fragment max = feedsFragment.getMax();
                                    if (max != null) {
                                        max.onResume();
                                    }
                                    feedsFragment.setMax(str, 0);
                                }
                                feedsFragment.equals();
                            }
                        }
                    }

                    {
                        this.getMax = r1;
                    }

                    public final void getMin(@Nullable String str) {
                        this.getMax.this$0.invokeSuspend = false;
                        setMin(new getMax(str));
                    }

                    public final void getMin() {
                        this.getMax.this$0.invokeSuspend = false;
                        DecodeWrapper.getMin(this.getMax.this$0.getEnableGlobalSearch() ? "Home" : TrackerKey.SourceType.SWIPE);
                        Intent intent = new Intent(this.getMax.this$0, ScannerActivity.class);
                        if (this.getMax.this$0.getEnableGlobalSearch()) {
                            intent.putExtra(ScannerActivity.FROM_VIEW_TYPE, ScannerFromViewType.FOUR_KINGKONG);
                        }
                        this.getMax.this$0.startActivity(intent);
                    }

                    public final void length() {
                        this.getMax.this$0.invokeSuspend = false;
                        LockableViewPager lockableViewPager = (LockableViewPager) this.getMax.this$0._$_findCachedViewById(resetInternal.setMax.ActivityResult);
                        if (lockableViewPager != null) {
                            lockableViewPager.setCurrentItem(1);
                        }
                    }

                    public final void getMax(@NotNull String str, boolean z) {
                        Intrinsics.checkNotNullParameter(str, "source");
                        this.getMax.this$0.invokeSuspend = z;
                        setMin(new length(str));
                    }

                    public final void getMax(@Nullable String str) {
                        int length2 = str.length();
                        int max = dispatchOnCancelled.setMax(length2);
                        if (length2 != max) {
                            onCanceled oncanceled = new onCanceled(length2, max, 1);
                            onCancelLoad.setMax(1796676396, oncanceled);
                            onCancelLoad.getMin(1796676396, oncanceled);
                        }
                        if (this.getMax.this$0.getEnableGlobalSearch()) {
                            this.getMax.this$0.startActivity(new Intent(this.getMax.this$0.getApplicationContext(), GlobalSearchActivity.class));
                            TrackerGlobalSearchOpen.setGlobalSearchOpen(str);
                        }
                        if (this.getMax.this$0.isExploreDanaFragment(0)) {
                            TrackerExploreDanaOpen.setExploreDanaOpen(TrackerKey.SourceType.SWIPE_RIGHT);
                        }
                    }

                    private final void setMin(Function1<? super FeedsFragment, Unit> function1) {
                        LockableViewPager lockableViewPager = (LockableViewPager) this.getMax.this$0._$_findCachedViewById(resetInternal.setMax.ActivityResult);
                        if (lockableViewPager != null) {
                            if (this.getMax.this$0.getEnableFeed()) {
                                FtsOptions$Order length2 = HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.getMax.this$0).getMax(2);
                                if (length2 instanceof FeedsFragment) {
                                    function1.invoke(length2);
                                }
                            }
                            lockableViewPager.setCurrentItem(2);
                        }
                    }
                };
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/CompletableEmitter;", "subscribe"}, k = 3, mv = {1, 4, 2})
            static final class Proxy implements isShowTitleBarFavorite {
                public static final Proxy getMin = new Proxy();

                Proxy() {
                }

                public final void length(@NotNull isBadgeViewShow isbadgeviewshow) {
                    Intrinsics.checkNotNullParameter(isbadgeviewshow, "it");
                    isbadgeviewshow.onComplete();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
        static final class Default implements removeStateDidChangeHandler {
            final /* synthetic */ HomeTabActivity setMin;

            Default(HomeTabActivity homeTabActivity) {
                this.setMin = homeTabActivity;
            }

            public final void getMax() {
                this.setMin.length();
            }
        }

        IPostMessageService(HomeTabActivity homeTabActivity) {
            this.length = homeTabActivity;
        }

        public final /* synthetic */ void onDismissed(Object obj, int i) {
            super.onDismissed((setProgressViewOffset) obj, i);
            this.length.nextOnboardingStep();
        }
    }

    public final boolean getEnableFeed() {
        return this.create;
    }

    public final void setEnableFeed(boolean z) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1771921651 == (max = dispatchOnCancelled.getMax(applicationContext, -1771921651)))) {
            onCanceled oncanceled = new onCanceled(-1771921651, max, 512);
            onCancelLoad.setMax(-1771921651, oncanceled);
            onCancelLoad.getMin(-1771921651, oncanceled);
        }
        this.create = z;
        if (!setMin() && z) {
            enableFeedFragment();
        }
    }

    public final boolean getEnableGlobalSearch() {
        return this.onNavigationEvent;
    }

    public final void setEnableGlobalSearch(boolean z) {
        this.onNavigationEvent = z;
    }

    private final boolean setMin() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1779359739, oncanceled);
            onCancelLoad.getMin(-1779359739, oncanceled);
        }
        GriverManifest.AnonymousClass30 r0 = this.getMin;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeFragmentPagerStateAdapter");
        }
        LockableViewPager lockableViewPager = (LockableViewPager) _$_findCachedViewById(resetInternal.setMax.ActivityResult);
        Intrinsics.checkNotNullExpressionValue(lockableViewPager, BranchLinkConstant.PathTarget.CONTAINER);
        return r0.getMax(lockableViewPager.getCurrentItem()) instanceof NotificationCenterFragment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/home/HomeTabActivity$onboardingOrchestrator$1", "Lid/dana/home/OnboardingEvent;", "onEddStep", "", "onFaceLoginStep", "onGnOnboardingStep", "onInterstitialStep", "onKycRenewalStep", "onNormalTooltipStep", "onPaymentSettingStep", "onQcbOnboardingStep", "onReferralEngagementDialogStep", "onTnCStep", "onTwilioStep", "onUgcStep", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class asBinder implements GriverManifest.AnonymousClass46 {
        final /* synthetic */ HomeTabActivity getMax;

        asBinder(HomeTabActivity homeTabActivity) {
            this.getMax = homeTabActivity;
        }

        public final void setMin() {
            this.getMax.getTncSummaryPresenter().getMax();
        }

        public final void getMin() {
            this.getMax.getPaymentSettingPresenter().length();
        }

        public final void setMax() {
            HomeTabActivity.access$suggestEnrollFaceLogin(this.getMax);
        }

        public final void length() {
            HomeTabActivity.access$isPopupKycQueryExceedLimit(this.getMax);
            HomeTabActivity.access$isPopupKycShowExceedLimit(this.getMax);
        }

        public final void getMax() {
            this.getMax.getTwilioDialogPresenter().length();
        }

        public final void equals() {
            JSAPIMonitorExtension kycAmlEddPresenter = this.getMax.getKycAmlEddPresenter();
            kycAmlEddPresenter.getMax.execute(new JSAPIMonitorExtension.getMin(kycAmlEddPresenter));
        }

        public final void IsOverlapping() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.getMax);
            if (access$getHomeTabFragment$p == null) {
                this.getMax.nextOnboardingStep();
            } else if (access$getHomeTabFragment$p.firstTimePresenter != null) {
                access$getHomeTabFragment$p.firstTimePresenter.length();
            } else {
                HomeTabActivity homeTabActivity = (HomeTabActivity) access$getHomeTabFragment$p.getMax;
                if (homeTabActivity != null) {
                    homeTabActivity.nextOnboardingStep();
                }
            }
        }

        public final void toIntRange() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.getMax);
            if (access$getHomeTabFragment$p != null) {
                access$getHomeTabFragment$p.setMax(HomeTabFragment.LocationMode.QRIS_CROSS_BORDER);
            } else {
                this.getMax.nextOnboardingStep();
            }
        }

        public final void isInside() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.getMax);
            if (access$getHomeTabFragment$p != null) {
                access$getHomeTabFragment$p.setMax(HomeTabFragment.LocationMode.GLOBAL_NETWORK);
            } else {
                this.getMax.nextOnboardingStep();
            }
        }

        public final void toFloatRange() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.getMax);
            if (access$getHomeTabFragment$p == null) {
                this.getMax.nextOnboardingStep();
            } else if (access$getHomeTabFragment$p.interstitialPresenter != null) {
                access$getHomeTabFragment$p.interstitialPresenter.setMin();
            } else {
                HomeTabActivity homeTabActivity = (HomeTabActivity) access$getHomeTabFragment$p.getMax;
                if (homeTabActivity != null) {
                    homeTabActivity.nextOnboardingStep();
                }
            }
            HomeTabActivity.access$trackMixpanelAppReady(this.getMax);
        }

        public final void values() {
            try {
                HomeTabActivity.showMerchantReview$default(this.getMax, "Home", (String) null, false, 6, (Object) null);
            } catch (Exception e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.HOME_TAG, e.getMessage(), e);
                this.getMax.nextOnboardingStep();
            }
        }

        public final void toDoubleRange() {
            this.getMax.getReferralDialogPresenter().length(HomeTabActivity.access$getCurrentUnixEpochTime(this.getMax));
        }
    }

    public static /* synthetic */ void showMerchantReview$default(HomeTabActivity homeTabActivity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        homeTabActivity.showMerchantReview(str, str2, z);
    }

    public final void nextOnboardingStep() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1998551034, oncanceled);
            onCancelLoad.getMin(1998551034, oncanceled);
        }
        this.onRelationshipValidationResult.getMax();
    }

    public final void onResume() {
        super.onResume();
        GriverManifest.AnonymousClass47 r0 = this.onRelationshipValidationResult;
        if (r0.setMin()) {
            r0.getMax.add(f$2$FastBitmap$CoordinateSystem.setMax);
            r0.getMax.add(f.AnonymousClass2.toIntRange.setMin);
            r0.getMax();
        }
    }

    public final void onBackPressed() {
        FtsOptions$Order currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.n_()) {
            return;
        }
        if (getCurrentPosition() != 1) {
            LockableViewPager lockableViewPager = (LockableViewPager) _$_findCachedViewById(resetInternal.setMax.ActivityResult);
            Intrinsics.checkNotNullExpressionValue(lockableViewPager, BranchLinkConstant.PathTarget.CONTAINER);
            lockableViewPager.setCurrentItem(1);
            return;
        }
        finishAffinity();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            StackBlurManager.setMin();
            StackBlurManager.setMin(PerformanceConstant.SPLASH_TO_HOME_TIME);
        }
    }

    public final void setSwipeable(boolean z) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(83519010, oncanceled);
            onCancelLoad.getMin(83519010, oncanceled);
        }
        ((LockableViewPager) _$_findCachedViewById(resetInternal.setMax.ActivityResult)).setSwipeable(z);
    }

    public final void init() {
        int length2;
        int min;
        int length3;
        int min2;
        int length4;
        int max;
        Application application = getApplication();
        if (application != null) {
            Boolean homeRevamp = ((DanaApplication) application).getHomeRevamp();
            this.invoke = homeRevamp != null ? homeRevamp.booleanValue() : false;
            getPagePathFromPageUrl.setMax setmax = new getPagePathFromPageUrl.setMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                setmax.Grayscale$Algorithm = applicationComponent;
                Activity activity = this;
                setmax.getMin = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(activity));
                setmax.setMin = new DanaContactModule(new valueOf(this));
                setmax.setMax = new TncSummaryModules(new getCause(this));
                setmax.invoke = new PaymentSettingModule(new invokeSuspend(this));
                Context baseContext = getBaseContext();
                Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                if (!(applicationContext == null || -1043942338 == (max = dispatchOnCancelled.getMax(applicationContext, -1043942338)))) {
                    onCanceled oncanceled = new onCanceled(-1043942338, max, 512);
                    onCancelLoad.setMax(-1043942338, oncanceled);
                    onCancelLoad.getMin(-1043942338, oncanceled);
                }
                setmax.toString = new FaceAuthPopUpConsultationModule(new HomeTabActivity$Grayscale$Algorithm(this));
                setmax.hashCode = new KycRenewalModule(new invoke(this));
                int max2 = dispatchOnCancelled.getMax(0);
                if (max2 != 0) {
                    onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                    onCancelLoad.setMax(1577647264, oncanceled2);
                    onCancelLoad.getMin(1577647264, oncanceled2);
                }
                setmax.values = new TwilioDialogModule(new ICustomTabsCallback(this));
                setmax.valueOf = new TwilioIntroductionModule(new onNavigationEvent(this));
                setmax.toDoubleRange = new KycAmlEddModule(new HomeTabActivity$Mean$Arithmetic(this));
                setmax.Mean$Arithmetic = new MiniProgramModule(new onMessageChannelReady(this));
                setmax.IsOverlapping = new ServicesModule((style.getMin) new extraCallbackWithResult());
                DeepLinkModule.setMin max3 = DeepLinkModule.getMax();
                max3.getMax = activity;
                max3.length = TrackerKey.SourceType.CLICK;
                setmax.length = new DeepLinkModule(max3, (byte) 0);
                ScanQrModule.setMin max4 = ScanQrModule.getMax();
                max4.setMin = activity;
                setmax.toIntRange = new ScanQrModule(max4, (byte) 0);
                RestoreUrlModule.setMin min3 = RestoreUrlModule.setMin();
                min3.getMax = activity;
                setmax.equals = new RestoreUrlModule(min3, (byte) 0);
                FeatureModule.length length5 = FeatureModule.length();
                length5.setMax = activity;
                setmax.toFloatRange = new FeatureModule(length5, (byte) 0);
                OauthModule.getMax min4 = OauthModule.setMin();
                min4.setMin = activity;
                setmax.isInside = new OauthModule(min4, (byte) 0);
                setmax.FastBitmap$CoordinateSystem = new GlobalNetworkModule(new onRelationshipValidationResult(this));
                Context baseContext2 = getBaseContext();
                Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
                if (!(applicationContext2 == null || (length4 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                    onCanceled oncanceled3 = new onCanceled(0, length4, 4);
                    onCancelLoad.setMax(-1936909030, oncanceled3);
                    onCancelLoad.getMin(-1936909030, oncanceled3);
                }
                Context baseContext3 = getBaseContext();
                Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
                if (!(applicationContext3 == null || (length3 = applicationContext3.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext3, length3)))) {
                    onCanceled oncanceled4 = new onCanceled(length3, min2, 32);
                    onCancelLoad.setMax(-1936909030, oncanceled4);
                    onCancelLoad.getMin(-1936909030, oncanceled4);
                }
                setmax.invokeSuspend = new ReferralDialogModule(new b(this));
                stopIgnoring.setMin(setmax.getMin, PlayStoreReviewModules.class);
                stopIgnoring.setMin(setmax.setMin, DanaContactModule.class);
                stopIgnoring.setMin(setmax.setMax, TncSummaryModules.class);
                if (setmax.getMax == null) {
                    setmax.getMax = new UserConfigModules();
                }
                stopIgnoring.setMin(setmax.length, DeepLinkModule.class);
                stopIgnoring.setMin(setmax.toIntRange, ScanQrModule.class);
                stopIgnoring.setMin(setmax.equals, RestoreUrlModule.class);
                stopIgnoring.setMin(setmax.toFloatRange, FeatureModule.class);
                stopIgnoring.setMin(setmax.isInside, OauthModule.class);
                if (setmax.IsOverlapping == null) {
                    setmax.IsOverlapping = new ServicesModule();
                }
                stopIgnoring.setMin(setmax.hashCode, KycRenewalModule.class);
                stopIgnoring.setMin(setmax.toDoubleRange, KycAmlEddModule.class);
                stopIgnoring.setMin(setmax.toString, FaceAuthPopUpConsultationModule.class);
                stopIgnoring.setMin(setmax.FastBitmap$CoordinateSystem, GlobalNetworkModule.class);
                stopIgnoring.setMin(setmax.values, TwilioDialogModule.class);
                stopIgnoring.setMin(setmax.valueOf, TwilioIntroductionModule.class);
                stopIgnoring.setMin(setmax.Mean$Arithmetic, MiniProgramModule.class);
                stopIgnoring.setMin(setmax.invokeSuspend, ReferralDialogModule.class);
                stopIgnoring.setMin(setmax.invoke, PaymentSettingModule.class);
                stopIgnoring.setMin(setmax.Grayscale$Algorithm, PrepareException.AnonymousClass1.class);
                new getPagePathFromPageUrl(setmax.getMin, setmax.setMin, setmax.setMax, setmax.getMax, setmax.length, setmax.toIntRange, setmax.equals, setmax.toFloatRange, setmax.isInside, setmax.IsOverlapping, setmax.hashCode, setmax.toDoubleRange, setmax.toString, setmax.FastBitmap$CoordinateSystem, setmax.values, setmax.valueOf, setmax.Mean$Arithmetic, setmax.invokeSuspend, setmax.invoke, setmax.Grayscale$Algorithm, (byte) 0).setMax(this);
                Intrinsics.checkNotNullExpressionValue(getApplicationComponent().length(new SocialCommonModule(new extraCallback())), "applicationComponent.soc…   }\n        ))\n        )");
                onDelete.getMin[] getminArr = new onDelete.getMin[11];
                PdfImageSource.setMin setmin = this.playStoreReviewPresenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playStoreReviewPresenter");
                }
                getminArr[0] = setmin;
                moveToStart.setMin setmin2 = this.danaContactPresenter;
                if (setmin2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("danaContactPresenter");
                }
                getminArr[1] = setmin2;
                ToolUtils.setMin setmin3 = this.tncSummaryPresenter;
                if (setmin3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tncSummaryPresenter");
                }
                getminArr[2] = setmin3;
                remover.getMin getmin = this.faceAuthPopUpConsultationPresenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("faceAuthPopUpConsultationPresenter");
                }
                getminArr[3] = getmin;
                AboutInfoBridgeExtension aboutInfoBridgeExtension = this.kycRenewalPresenter;
                if (aboutInfoBridgeExtension == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
                }
                getminArr[4] = aboutInfoBridgeExtension;
                MultilevelSelectActivity.AnonymousClass1.length length6 = this.twilioDialogPresenter;
                if (length6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("twilioDialogPresenter");
                }
                getminArr[5] = length6;
                TitleBarExtension.AnonymousClass1.getMin getmin2 = this.twilioIntroductionPresenter;
                if (getmin2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
                }
                getminArr[6] = getmin2;
                JSAPIMonitorExtension jSAPIMonitorExtension = this.kycAmlEddPresenter;
                if (jSAPIMonitorExtension == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("kycAmlEddPresenter");
                }
                getminArr[7] = jSAPIMonitorExtension;
                onNext.setMin setmin4 = this.globalNetworkPresenter;
                if (setmin4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
                }
                getminArr[8] = setmin4;
                EmbedViewBridgeExtension embedViewBridgeExtension = this.miniProgramPresenter;
                if (embedViewBridgeExtension == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("miniProgramPresenter");
                }
                getminArr[9] = embedViewBridgeExtension;
                FileMangerBridgeExtension.AnonymousClass1.getMax getmax = this.paymentSettingPresenter;
                if (getmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentSettingPresenter");
                }
                getminArr[10] = getmax;
                registerPresenter(getminArr);
                FirebaseMessaging instance = FirebaseMessaging.getInstance();
                Intrinsics.checkNotNullExpressionValue(instance, "FirebaseMessaging.getInstance()");
                instance.getToken().addOnCompleteListener(new create(this));
                GriverManifest.AnonymousClass30 min5 = GriverManifest.AnonymousClass30.getMin(getSupportFragmentManager(), new onPostMessage(this));
                Intrinsics.checkNotNullExpressionValue(min5, "HomeFragmentPagerStateAd…         }\n            })");
                this.getMin = min5;
                LockableViewPager lockableViewPager = (LockableViewPager) _$_findCachedViewById(resetInternal.setMax.ActivityResult);
                GriverManifest.AnonymousClass30 r4 = this.getMin;
                if (r4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeFragmentPagerStateAdapter");
                }
                registerViewPager(lockableViewPager, r4);
                LockableViewPager lockableViewPager2 = (LockableViewPager) _$_findCachedViewById(resetInternal.setMax.ActivityResult);
                Intrinsics.checkNotNullExpressionValue(lockableViewPager2, BranchLinkConstant.PathTarget.CONTAINER);
                lockableViewPager2.setCurrentItem(1);
                int max5 = dispatchOnCancelled.getMax(0);
                if (max5 != 0) {
                    onCanceled oncanceled5 = new onCanceled(0, max5, 16);
                    onCancelLoad.setMax(-523451801, oncanceled5);
                    onCancelLoad.getMin(-523451801, oncanceled5);
                }
                ((LockableViewPager) _$_findCachedViewById(resetInternal.setMax.ActivityResult)).addOnPageChangeListener(new toFloatRange(this));
                Context context = this;
                String str = InspectableProperty.ValueType.getMin(context).length() ? DanaLogConstants.PushPermissionStatus.PUSH_ENABLED : DanaLogConstants.PushPermissionStatus.PUSH_DISABLED;
                updateActionSheetContent.behaviour(DanaLogConstants.SeedId.PUSH_PERMISSION, DanaLogConstants.BizType.PUSH_NOTIFICATION, MapsKt.mutableMapOf(TuplesKt.to("status", str)));
                updateActionSheetContent.d(DanaLogConstants.TAG.BEHAVIOR_TAG, "reportNotificationPermission status: ".concat(str));
                int max6 = dispatchOnCancelled.getMax(0);
                if (max6 != 0) {
                    onCanceled oncanceled6 = new onCanceled(0, max6, 16);
                    onCancelLoad.setMax(-1528106472, oncanceled6);
                    onCancelLoad.getMin(-1528106472, oncanceled6);
                }
                if (setStateOn.getMin(context, "android.permission.READ_CONTACTS")) {
                    moveToStart.setMin setmin5 = this.danaContactPresenter;
                    if (setmin5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaContactPresenter");
                    }
                    setmin5.length();
                }
                MultilevelSelectCallBack.getMin getmin3 = this.userConfigPresenter;
                if (getmin3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userConfigPresenter");
                }
                getmin3.length();
                MultilevelSelectCallBack.getMin getmin4 = this.userConfigPresenter;
                if (getmin4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userConfigPresenter");
                }
                getmin4.setMin();
                EmbedViewBridgeExtension embedViewBridgeExtension2 = this.miniProgramPresenter;
                if (embedViewBridgeExtension2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("miniProgramPresenter");
                }
                embedViewBridgeExtension2.setMax.execute(onReceivedIcon.INSTANCE, new EmbedViewBridgeExtension.equals(embedViewBridgeExtension2), new EmbedViewBridgeExtension.toIntRange(embedViewBridgeExtension2));
                Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                setTextAppearance.getMin getmin5 = (setTextAppearance.getMin) new setTextAppearance.getMin(PartialSyncContactWorker.class, 1, TimeUnit.DAYS).length(BackoffPolicy.EXPONENTIAL, TimeUnit.MINUTES);
                getmin5.getMax.add("PARTIAL_SYNC_KEYRECURRING_SYNC_KEY");
                onTextChanged min6 = ((setTextAppearance.getMin) getmin5.getMax()).setMin();
                Intrinsics.checkNotNullExpressionValue(min6, "PeriodicWorkRequest.Buil…EY\")\n            .build()");
                setTextAppearance settextappearance = (setTextAppearance) min6;
                try {
                    setTextSize max7 = setTextSize.getMax(context);
                    Intrinsics.checkNotNullExpressionValue(max7, "WorkManager.getInstance(this)");
                    max7.length("PARTIAL_SYNC_KEYRECURRING_SYNC_KEY", ExistingPeriodicWorkPolicy.KEEP, settextappearance);
                } catch (Exception e) {
                    try {
                        FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
                    } catch (Exception unused) {
                    }
                }
                Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                onTextChanged min7 = ((setTextAppearance.getMin) new setTextAppearance.getMin(SaveContactPartialSyncWorker.class, 1, TimeUnit.DAYS).length(BackoffPolicy.EXPONENTIAL, TimeUnit.MINUTES)).setMin();
                Intrinsics.checkNotNullExpressionValue(min7, "PeriodicWorkRequest.Buil…   )\n            .build()");
                setTextAppearance settextappearance2 = (setTextAppearance) min7;
                try {
                    setTextSize max8 = setTextSize.getMax(context);
                    Intrinsics.checkNotNullExpressionValue(max8, "WorkManager.getInstance(this)");
                    max8.length("SAVE_CONTACT_PERIODIC_PARTIAL_SYNC_KEY", ExistingPeriodicWorkPolicy.KEEP, settextappearance2);
                } catch (Exception e2) {
                    try {
                        FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e2));
                    } catch (Exception unused2) {
                    }
                }
                Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                onTextChanged min8 = ((setTextAppearance.getMin) new setTextAppearance.getMin(SaveContactFullSyncWorker.class, 1, TimeUnit.DAYS).length(BackoffPolicy.EXPONENTIAL, TimeUnit.MINUTES)).setMin();
                Intrinsics.checkNotNullExpressionValue(min8, "PeriodicWorkRequest.Buil…   )\n            .build()");
                setTextAppearance settextappearance3 = (setTextAppearance) min8;
                try {
                    setTextSize max9 = setTextSize.getMax(context);
                    Intrinsics.checkNotNullExpressionValue(max9, "WorkManager.getInstance(this)");
                    max9.length("SAVE_CONTACT_PERIODIC_FULL_SYNC_KEY", ExistingPeriodicWorkPolicy.KEEP, settextappearance3);
                } catch (Exception e3) {
                    try {
                        FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e3));
                    } catch (Exception unused3) {
                    }
                }
                if (!getMin()) {
                    GriverManifest.AnonymousClass47 r0 = this.onRelationshipValidationResult;
                    LinkedList<f.AnonymousClass2> linkedList = r0.getMax;
                    linkedList.addLast(f.AnonymousClass2.equals.setMax);
                    linkedList.addLast(f.AnonymousClass2.IsOverlapping.getMax);
                    linkedList.addLast(f.AnonymousClass2.setMin.getMax);
                    linkedList.addLast(f.AnonymousClass2.getMax.getMin);
                    linkedList.addLast(f.AnonymousClass2.toString.getMax);
                    linkedList.addLast(f.AnonymousClass2.length.length);
                    linkedList.addLast(f.AnonymousClass2.isInside.setMin);
                    linkedList.addLast(f.AnonymousClass2.toFloatRange.length);
                    linkedList.addLast(f.AnonymousClass2.getMin.getMin);
                    linkedList.addLast(f.AnonymousClass2.setMax.getMin);
                    linkedList.addLast(f$2$FastBitmap$CoordinateSystem.setMax);
                    linkedList.addLast(f.AnonymousClass2.toIntRange.setMin);
                    r0.getMax();
                }
                getPhotoRect length7 = getPhotoRect.length();
                Intrinsics.checkNotNullExpressionValue(length7, "SharePayManager.getInstance()");
                if (length7.setMax != null) {
                    startActivity(new Intent(context, ScannerActivity.class));
                }
                setGroupDividerEnabled max10 = new onFinishInflate((ListMenuItemView) this, (onFinishInflate.setMax) new onFinishInflate.setMin()).setMax(GriverManifest.AnonymousClass36.class);
                Intrinsics.checkNotNullExpressionValue(max10, "ViewModelProvider(this, …omeViewModel::class.java)");
                this.getMax = (GriverManifest.AnonymousClass36) max10;
                DanaUpdateManager danaUpdateManager = new DanaUpdateManager(this);
                this.updateManager = danaUpdateManager;
                if (danaUpdateManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("updateManager");
                }
                danaUpdateManager.setMax = new ICustomTabsCallback.Stub(this);
                getDeviceName.length().onNext(Boolean.TRUE);
                this.toDoubleRange = new setPublishStatus(activity);
                Context baseContext4 = getBaseContext();
                Context applicationContext4 = baseContext4 != null ? baseContext4.getApplicationContext() : null;
                if (!(applicationContext4 == null || (length2 = applicationContext4.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext4, length2)))) {
                    onCanceled oncanceled7 = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(-44224903, oncanceled7);
                    onCancelLoad.getMin(-44224903, oncanceled7);
                }
                String stringExtra = getIntent().getStringExtra(AC_CODE_VALUE);
                String str2 = getStartDelay.IsOverlapping.setMin().length;
                if (str2 == null) {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    onNext.setMin setmin6 = this.globalNetworkPresenter;
                    if (setmin6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
                    }
                    setmin6.getMax(stringExtra);
                } else if (setMin(str2)) {
                    onNext.setMin setmin7 = this.globalNetworkPresenter;
                    if (setmin7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
                    }
                    setmin7.getMax(str2);
                    getStartDelay.IsOverlapping.setMin().length = null;
                    getStartDelay.IsOverlapping.setMin().toIntRange = Boolean.FALSE;
                }
                if (setMax()) {
                    ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
                    ScreenBrightnessBridgeExtension.getMax(false);
                    ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
                    ScreenBrightnessBridgeExtension.setMin(false);
                    OauthGrantActivity.getMin getmin6 = OauthGrantActivity.Companion;
                    startActivity(OauthGrantActivity.getMin.setMin(context));
                }
                this.getCause = new equals(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    private final boolean getMin() {
        int length2;
        Context baseContext = getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1914980726, oncanceled);
            onCancelLoad.getMin(-1914980726, oncanceled);
        }
        String stringExtra = getIntent().getStringExtra(AC_CODE_VALUE);
        if (stringExtra == null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Uri data = intent.getData();
            if (data != null) {
                str = data.getQueryParameter(AC_CODE_VALUE);
            }
        } else {
            str = stringExtra;
        }
        String str2 = getStartDelay.IsOverlapping.setMin().length;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str) || setMin(str2) || getMax() || setMax()) {
            return true;
        }
        return false;
    }

    private final boolean setMax() {
        return getIntent().getBooleanExtra("fromGoogle", false);
    }

    private final boolean getMax() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Uri data = intent.getData();
        return Intrinsics.areEqual((Object) data != null ? data.getEncodedPath() : null, (Object) DEEPLINK_PAYMENT_PATH) || getStartDelay.IsOverlapping.setMin().getMax();
    }

    private static boolean setMin(String str) {
        return getStartDelay.IsOverlapping.setMin().getMin() && !TextUtils.isEmpty(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/home/HomeTabActivity$checkUpdatesManually$1", "Lid/dana/googleplay/updates/DanaUpdateManager$ManualCheckUpdateCallback;", "onCheckForUpdatesError", "", "onUpdatesNotFound", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements DanaUpdateManager.setMax {
        final /* synthetic */ HomeTabActivity setMin;

        isInside(HomeTabActivity homeTabActivity) {
            this.setMin = homeTabActivity;
        }

        public final void setMax() {
            this.setMin.getUpdateManager().getMin(R.string.no_updates_found, R.string.dismiss, -1, (View.OnClickListener) null);
        }

        public final void getMax() {
            this.setMin.getUpdateManager().getMin(R.string.error_check_updates, R.string.dismiss, -1, (View.OnClickListener) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/home/HomeTabActivity$onReceiveUpdateRequest$1", "Lid/dana/googleplay/updates/DanaUpdateManager$ManualCheckUpdateCallback;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onTransact implements DanaUpdateManager.setMax {
        public final void getMax() {
        }

        public final void setMax() {
        }

        onTransact() {
        }
    }

    @Subscribe
    public final void onReceiveUpdateRequest(@NotNull DanaH5.length length2) {
        Intrinsics.checkNotNullParameter(length2, "event");
        DanaUpdateManager danaUpdateManager = this.updateManager;
        if (danaUpdateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateManager");
        }
        danaUpdateManager.length(new onTransact());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0017\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/home/HomeTabActivity$initHomeFragmentPagerStateAdapter$1", "Lid/dana/home/HomeFragment$HomeFragmentListener;", "onExploreDanaBottomNavDisabled", "", "onGetGlobalSearchConfig", "isEnable", "", "(Ljava/lang/Boolean;)V", "onGlobalSearchEnabled", "onGlobalSearchHintClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onPostMessage implements HomeFragment.length {
        final /* synthetic */ HomeTabActivity setMax;

        onPostMessage(HomeTabActivity homeTabActivity) {
            this.setMax = homeTabActivity;
        }

        public final void length() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.setMax);
            if (access$getHomeTabFragment$p != null) {
                access$getHomeTabFragment$p.getMax();
            }
            this.setMax.getSwipeDelegateListener().getMax(TrackerKey.SourceType.SWIPE_RIGHT);
        }

        public final void getMax() {
            if (!this.setMax.invoke) {
                HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.setMax).getMin();
            }
            this.setMax.setEnableGlobalSearch(true);
        }

        public final void setMax() {
            if (this.setMax.invoke) {
                GriverManifest.AnonymousClass30 access$getHomeFragmentPagerStateAdapter$p = HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.setMax);
                if (!(access$getHomeFragmentPagerStateAdapter$p.length.get(0) instanceof ExploreDanaFragment)) {
                    access$getHomeFragmentPagerStateAdapter$p.length.remove(0);
                    access$getHomeFragmentPagerStateAdapter$p.length.add(0, ExploreDanaFragment.setMin(true));
                    access$getHomeFragmentPagerStateAdapter$p.notifyDataSetChanged();
                }
            }
        }
    }

    public final void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        enableFeedFragment();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/home/HomeTabActivity$addOnPagerChangeListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements ViewPager.setMax {
        final /* synthetic */ HomeTabActivity setMin;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        toFloatRange(HomeTabActivity homeTabActivity) {
            this.setMin = homeTabActivity;
        }

        public final void onPageSelected(int i) {
            if (i != 2) {
                this.setMin.invokeSuspend = true;
                if (this.setMin.getEnableFeed() && (HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.setMin).getMax(2) instanceof NotificationCenterFragment)) {
                    this.setMin.enableFeedFragment();
                }
            }
            if (i == 2 && this.setMin.getEnableFeed() && this.setMin.invokeSuspend) {
                this.setMin.getSwipeDelegateListener().getMax(TrackerKey.SourceType.SWIPE_HOME, true);
            }
            GlobalSearchFragment globalSearchFragment = null;
            if (this.setMin.isExploreDanaFragment(i)) {
                TrackerExploreDanaOpen.setExploreDanaOpen(TrackerKey.SourceType.SWIPE_RIGHT);
                FtsOptions$Order length = HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.setMin).getMax(i);
                if (!(length instanceof ExploreDanaFragment)) {
                    length = null;
                }
                ExploreDanaFragment exploreDanaFragment = (ExploreDanaFragment) length;
                if (exploreDanaFragment != null) {
                    GriverManifest.AnonymousClass11 r0 = exploreDanaFragment.globalSearchAnalyticTracker;
                    if (r0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
                    }
                    r0.getMax();
                }
            }
            if (this.setMin.getEnableGlobalSearch() && !this.setMin.invoke) {
                if (i == 0) {
                    TrackerGlobalSearchOpen.setGlobalSearchOpen(TrackerKey.SourceType.SWIPE_RIGHT);
                    HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.setMin).getMin();
                    HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.setMin);
                    if (access$getHomeTabFragment$p != null) {
                        access$getHomeTabFragment$p.getMax();
                    }
                    FtsOptions$Order length2 = HomeTabActivity.access$getHomeFragmentPagerStateAdapter$p(this.setMin).getMax(i);
                    if (length2 instanceof GlobalSearchFragment) {
                        globalSearchFragment = length2;
                    }
                    GlobalSearchFragment globalSearchFragment2 = globalSearchFragment;
                    if (globalSearchFragment2 != null) {
                        GriverManifest.AnonymousClass11 r6 = globalSearchFragment2.globalSearchAnalyticTracker;
                        if (r6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
                        }
                        r6.setMin();
                    }
                    if (globalSearchFragment2 != null) {
                        globalSearchFragment2.create();
                    }
                    if (globalSearchFragment2 != null) {
                        globalSearchFragment2.m_().length();
                        globalSearchFragment2.m_().getMin();
                        return;
                    }
                    return;
                }
                setOnWheelViewListener.getMax((Activity) this.setMin);
            }
        }
    }

    public final boolean isExploreDanaFragment(int i) {
        if (i != 0) {
            return false;
        }
        GriverManifest.AnonymousClass30 r0 = this.getMin;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeFragmentPagerStateAdapter");
        }
        return r0.getMax(i) instanceof ExploreDanaFragment;
    }

    public final void enableFeedFragment() {
        int length2;
        int min;
        int length3;
        GriverManifest.AnonymousClass30 r0 = this.getMin;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeFragmentPagerStateAdapter");
        }
        if (!(r0.length.get(2) instanceof FeedsFragment)) {
            r0.length.remove(2);
            r0.length.add(2, FeedsFragment.toDoubleRange());
            r0.notifyDataSetChanged();
        }
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1154475676, oncanceled);
            onCancelLoad.getMin(-1154475676, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1154475676, oncanceled2);
            onCancelLoad.getMin(-1154475676, oncanceled2);
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("target");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        String stringExtra2 = intent.getStringExtra("Source");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        intent.removeExtra("target");
        int hashCode2 = stringExtra.hashCode();
        if (hashCode2 != -600094315) {
            if (hashCode2 == 3480 && stringExtra.equals("me")) {
                getSwipeDelegateListener().getMax(str, false);
            }
        } else if (stringExtra.equals("friends")) {
            getSwipeDelegateListener().getMin(str);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        IH5TinyPopMenu viewPagerAdapter$app_productionRelease;
        FtsOptions$Order length2;
        Bundle extras;
        int min;
        Bundle extras2;
        if (TncSummaryActivity.DIALOG_TNC_REQUEST_CODE == i) {
            ToolUtils.setMin setmin = this.tncSummaryPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tncSummaryPresenter");
            }
            setmin.setMin();
            setCancelText setcanceltext = setCancelText.length;
            setCancelText.getMax(this, getString(R.string.tnc_custom_toast_text));
            nextOnboardingStep();
        } else {
            KycAmlEddActivity.getMin getmin = KycAmlEddActivity.Companion;
            if (KycAmlEddActivity.getMin.setMax() == i) {
                nextOnboardingStep();
            } else {
                setMin.getMax getmax = setMin.getMax;
                if (setMin.getMax.length() == i) {
                    nextOnboardingStep();
                } else {
                    SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
                    if (SocialActivityDetail.setMax.setMax() == i) {
                        getSwipeDelegateListener().getMin("");
                    } else if (1006 == i) {
                        if (i2 != -1) {
                            getMin getmin2 = this.getCause;
                            if (getmin2 != null) {
                                if (!(intent == null || (extras2 = intent.getExtras()) == null)) {
                                    extras2.getString(ChallengeControl.Key.CANCEL_REASON);
                                }
                                getmin2.getMax();
                            }
                        } else {
                            getMin getmin3 = this.getCause;
                            if (getmin3 != null) {
                                getmin3.setMin();
                            }
                        }
                    } else if (1001 == i) {
                        Context baseContext = getBaseContext();
                        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                        if (!(applicationContext == null || i2 == (min = dispatchOnCancelled.setMin(applicationContext, i2)))) {
                            onCanceled oncanceled = new onCanceled(i2, min, 8);
                            onCancelLoad.setMax(-132181785, oncanceled);
                            onCancelLoad.getMin(-132181785, oncanceled);
                        }
                        if (i2 != -1) {
                            getMin getmin4 = this.ICustomTabsCallback;
                            if (getmin4 != null) {
                                if (!(intent == null || (extras = intent.getExtras()) == null)) {
                                    extras.getString(ChallengeControl.Key.CANCEL_REASON);
                                }
                                getmin4.getMax();
                            }
                        } else {
                            getMin getmin5 = this.ICustomTabsCallback;
                            if (getmin5 != null) {
                                getmin5.setMin();
                            }
                        }
                    } else if (!(intent == null || (viewPagerAdapter$app_productionRelease = getViewPagerAdapter$app_productionRelease()) == null || (length2 = viewPagerAdapter$app_productionRelease.getMax.getMax(1)) == null)) {
                        length2.onActivityResult(i, i2, intent);
                    }
                }
            }
        }
        super.onActivityResult(i, i2, intent);
        DanaUpdateManager danaUpdateManager = this.updateManager;
        if (danaUpdateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateManager");
        }
        danaUpdateManager.getMin(i, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/home/HomeTabActivity$activityResultAutoRoute$1", "Lid/dana/home/HomeTabActivity$PaymentSettingListener;", "onCancelled", "", "reason", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements getMin {
        final /* synthetic */ HomeTabActivity setMax;

        equals(HomeTabActivity homeTabActivity) {
            this.setMax = homeTabActivity;
        }

        public final void setMin() {
            HomeTabActivity.access$initSwitchOffPaymentAuth(this.setMax);
        }

        public final void getMax() {
            HomeTabActivity homeTabActivity = this.setMax;
            HomeTabActivity.access$showPaymentSettingBottomSheet(homeTabActivity, HomeTabActivity.access$getBottomSheetPaymentSettingFragment$p(homeTabActivity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/home/HomeTabActivity$activityResultPaymentControl$1", "Lid/dana/home/HomeTabActivity$PaymentSettingListener;", "onCancelled", "", "reason", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements getMin {
        final /* synthetic */ SettingModel getMax;
        final /* synthetic */ boolean length;
        final /* synthetic */ HomeTabActivity setMax;

        toIntRange(HomeTabActivity homeTabActivity, boolean z, SettingModel settingModel) {
            this.setMax = homeTabActivity;
            this.length = z;
            this.getMax = settingModel;
        }

        public final void setMin() {
            if (this.length) {
                this.setMax.setMax(this.getMax, true);
            } else {
                this.setMax.IsOverlapping();
            }
        }

        public final void getMax() {
            HomeTabActivity homeTabActivity = this.setMax;
            HomeTabActivity.access$showPaymentSettingBottomSheet(homeTabActivity, HomeTabActivity.access$getBottomSheetPaymentSettingFragment$p(homeTabActivity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/home/HomeTabActivity$initSocialCommonComponent$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class extraCallback implements getSelectedIndex.setMax {
        public final void dismissProgress() {
        }

        public final void onError(@Nullable String str) {
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        public final void showProgress() {
        }

        extraCallback() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/home/HomeTabActivity$initInjector$1", "Lid/dana/miniprogram/di/MiniProgramContract$View;", "showOpenQRPay", "", "showOpenScan", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onMessageChannelReady implements GriverDefaultPromptExtension.AnonymousClass2.getMin {
        final /* synthetic */ HomeTabActivity setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void onFavoriteLimitExceeded(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "appId");
        }

        public final void onGetMiniPrograms(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
            Intrinsics.checkNotNullParameter(list, "miniPrograms");
        }

        public final void onLoadFavoriteMiniPrograms(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
            Intrinsics.checkNotNullParameter(list, "favoriteMiniPrograms");
        }

        public final void onLoadRecentMiniPrograms(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
            Intrinsics.checkNotNullParameter(list, "recentMiniPrograms");
        }

        public final void onSetFavoriteMiniPrograms(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "appId");
        }

        public final void onSetRecentMiniProgram(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "appId");
        }

        @JvmDefault
        public final void showProgress() {
        }

        onMessageChannelReady(HomeTabActivity homeTabActivity) {
            this.setMin = homeTabActivity;
        }

        public final void getMin() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.setMin);
            if (access$getHomeTabFragment$p != null) {
                access$getHomeTabFragment$p.setMax.length();
                Intent createPayActivityIntent = PayActivity.createPayActivityIntent(access$getHomeTabFragment$p.getMax, TrackerKey.SourceType.HOME_PAY_BUTTON);
                createPayActivityIntent.putExtra(PayActivity.MP_POSITION, 1);
                createPayActivityIntent.addFlags(67141632);
                access$getHomeTabFragment$p.startActivityForResult(createPayActivityIntent, HomeTabFragment.setMin);
                WindowBridgeExtension.AnonymousClass1.length();
            }
        }

        public final void length() {
            HomeTabFragment access$getHomeTabFragment$p = HomeTabActivity.access$getHomeTabFragment$p(this.setMin);
            if (access$getHomeTabFragment$p != null) {
                access$getHomeTabFragment$p.setMax.length();
                Intent createPayActivityIntent = PayActivity.createPayActivityIntent(access$getHomeTabFragment$p.getMax, TrackerKey.SourceType.HOME_PAY_BUTTON);
                createPayActivityIntent.putExtra(PayActivity.MP_POSITION, 0);
                createPayActivityIntent.addFlags(67141632);
                access$getHomeTabFragment$p.startActivityForResult(createPayActivityIntent, HomeTabFragment.setMin);
                WindowBridgeExtension.AnonymousClass1.length();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/home/HomeTabActivity$initInjector$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class extraCallbackWithResult implements style.getMin {
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

        extraCallbackWithResult() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"id/dana/home/HomeTabActivity$initInjector$3", "Lid/dana/globalnetwork/currency/GlobalNetworkListener;", "dismissProgressDialog", "", "onCountryCodeByLocation", "gnState", "", "countryCode", "", "onDecodeError", "throwable", "", "onGnWelcomeFirstTime", "gnContentModel", "Lid/dana/model/GnContentModel;", "showProgressDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onRelationshipValidationResult extends Workflow {
        final /* synthetic */ HomeTabActivity setMax;

        onRelationshipValidationResult(HomeTabActivity homeTabActivity) {
            this.setMax = homeTabActivity;
        }

        public final void setMin(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            if (z) {
                HomeTabActivity.access$startGnOnBoarding(this.setMax, str);
            }
        }

        public final void setMax(@NotNull GnContentModel gnContentModel, @NotNull String str) {
            Intrinsics.checkNotNullParameter(gnContentModel, "gnContentModel");
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            HomeTabActivity.access$showGlobalNetworkDialog(this.setMax, gnContentModel, str);
        }

        public final void length(@Nullable Throwable th) {
            HomeTabActivity homeTabActivity = this.setMax;
            homeTabActivity.showWarningDialog(homeTabActivity.getString(R.string.home_error));
        }

        public final void toIntRange() {
            setPublishStatus access$getDanaLoadingDialog$p = HomeTabActivity.access$getDanaLoadingDialog$p(this.setMax);
            if (!access$getDanaLoadingDialog$p.length.isShowing()) {
                access$getDanaLoadingDialog$p.length.show();
                access$getDanaLoadingDialog$p.getMax.startRefresh();
            }
        }

        public final void isInside() {
            HomeTabActivity.access$getDanaLoadingDialog$p(this.setMax).getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/home/HomeTabActivity$getDanaContactModule$1", "Lid/dana/contract/contact/DanaContactContract$View;", "dismissProgress", "", "onEnableContactSyncFeature", "onError", "errorMessage", "", "onGetContactSyncState", "completed", "", "onGetDanaUserContactSuccess", "phoneNumbers", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class valueOf implements moveToStart.getMin {
        final /* synthetic */ HomeTabActivity getMin;

        public final void dismissProgress() {
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void onGetContactSyncState(boolean z) {
        }

        public final void onGetDanaUserContactSuccess(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "phoneNumbers");
        }

        public final void showProgress() {
        }

        valueOf(HomeTabActivity homeTabActivity) {
            this.getMin = homeTabActivity;
        }

        public final void onEnableContactSyncFeature() {
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
            sb.append(getClass().getName());
            sb.append(":init");
            updateActionSheetContent.d(DanaLogConstants.TAG.SYNC_CONTACT_TAG, sb.toString());
            this.getMin.getDanaContactPresenter().getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/home/HomeTabActivity$getTncSummaryModule$1", "Lid/dana/tncsummary/TncSummaryContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetFeatureTncSummary", "tncSummaryEnabled", "", "onGetTncSummaryAvailability", "shouldShowDialog", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getCause implements ToolUtils.length {
        final /* synthetic */ HomeTabActivity setMax;

        public final void dismissProgress() {
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void showProgress() {
        }

        getCause(HomeTabActivity homeTabActivity) {
            this.setMax = homeTabActivity;
        }

        public final void getMin(boolean z) {
            if (z) {
                this.setMax.startActivityForResult(new Intent(this.setMax, TncSummaryActivity.class), TncSummaryActivity.DIALOG_TNC_REQUEST_CODE);
            } else {
                this.setMax.nextOnboardingStep();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016¨\u0006%"}, d2 = {"id/dana/home/HomeTabActivity$getPaymentSettingModule$1", "Lid/dana/paymentsetting/PaymentSettingContract$View;", "dismissProgress", "", "onAlwaysAskPin", "actionClick", "", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "success", "", "onAlwaysAskPinChallengePassword", "paymentSecuritySwitchModel", "Lid/dana/myprofile/model/PaymentSecuritySwitchModel;", "onCheckPaymentSettingRequired", "show", "onGetProfileSettingModelFail", "onGetProfileSettingModelSuccessForAutoRoute", "setting", "onGetProfileSettingModelSuccessForPin", "onInitAutoRouteDisabled", "onInitAutoRouteStateOff", "authenticationSettingOptions", "", "Lid/dana/domain/autoroute/model/AuthenticationTypeOption;", "onInitAutoRouteStateOn", "onInitPaymentAuthError", "onInitPaymentAuthSuccess", "paymentSecurityInitModel", "Lid/dana/myprofile/model/PaymentSecurityInitModel;", "onSwitchAutoRouteFailed", "onSwitchAutoRouteNeedRisk", "isChecked", "securityId", "pubKey", "onSwitchAutoRouteSuccess", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class invokeSuspend implements FileMangerBridgeExtension.AnonymousClass1.length {
        final /* synthetic */ HomeTabActivity length;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        invokeSuspend(HomeTabActivity homeTabActivity) {
            this.length = homeTabActivity;
        }

        public final void getMin(boolean z) {
            if (z) {
                HomeTabActivity homeTabActivity = this.length;
                HomeTabActivity.access$showPaymentSettingBottomSheet(homeTabActivity, HomeTabActivity.access$getBottomSheetPaymentSettingFragment$p(homeTabActivity));
                return;
            }
            this.length.nextOnboardingStep();
        }

        public final void getMin(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, "setting");
            this.length.getPaymentSettingPresenter().getMin();
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "actionClick");
            if (Intrinsics.areEqual((Object) str, (Object) "SWITCH_AOUTOROUTE_ON")) {
                HomeTabActivity.access$switchAutoRouteState(this.length, "");
            } else {
                this.length.getPaymentSettingPresenter().getMin(str, new SettingModel());
            }
        }

        public final void setMin(@Nullable List<GriverCloseButtonStyleExtension> list) {
            String str;
            GriverCloseButtonStyleExtension griverCloseButtonStyleExtension;
            if (list == null || (griverCloseButtonStyleExtension = (GriverCloseButtonStyleExtension) CollectionsKt.firstOrNull(list)) == null || (str = griverCloseButtonStyleExtension.getAuthenticationType()) == null) {
                str = "";
            }
            HomeTabActivity.access$switchAutoRouteState(this.length, str);
        }

        public final void getMax() {
            HomeTabActivity.access$initSwitchOffPaymentAuth(this.length);
        }

        public final void setMin() {
            HomeTabActivity.access$initSwitchOffPaymentAuth(this.length);
        }

        public final void getMin() {
            HomeTabActivity.access$initSwitchOffPaymentAuth(this.length);
        }

        public final void getMin(boolean z, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "pubKey");
            HomeTabActivity.access$startRecommendSecurityChallenge(this.length, z, str, str2);
        }

        public final void setMax() {
            HomeTabActivity.access$showPaymentSettingFailedDialog(this.length);
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
            this.length.getPaymentSettingPresenter().getMin("SWITCH_PAYMENT_AUTH_ON", settingModel);
        }

        public final void length(@Nullable showTime showtime, @NotNull String str, @NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(str, "actionClick");
            Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
            HomeTabActivity.access$switchPaymentAuth(this.length, showtime, str, settingModel);
        }

        public final void setMin(@NotNull String str, @NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(str, "actionClick");
            Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
            if (Intrinsics.areEqual((Object) str, (Object) "SWITCH_PAYMENT_AUTH_ON")) {
                HomeTabActivity.access$switchPaymentAuth(this.length, new showTime(), str, settingModel);
            } else {
                this.length.IsOverlapping();
            }
        }

        public final void length(@NotNull String str, @NotNull SettingModel settingModel, boolean z) {
            Intrinsics.checkNotNullParameter(str, "actionClick");
            Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
            if (Intrinsics.areEqual((Object) str, (Object) "SWITCH_PAYMENT_AUTH_ON")) {
                this.length.nextOnboardingStep();
                this.length.setMax(settingModel, z);
                return;
            }
            this.length.IsOverlapping();
        }

        public final void setMax(@Nullable PopupWindowToast popupWindowToast, @NotNull String str, @NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(str, "actionClick");
            Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
            boolean areEqual = Intrinsics.areEqual((Object) str, (Object) "SWITCH_PAYMENT_AUTH_ON");
            this.length.ICustomTabsCallback = new toIntRange(this.length, areEqual, settingModel);
            HomeTabActivity.access$startAlwaysAskPinPasswordChallenge(this.length, areEqual, popupWindowToast);
        }

        public final void showProgress() {
            HomeTabActivity homeTabActivity = this.length;
            homeTabActivity.toDoubleRange = new setPublishStatus(homeTabActivity);
            setPublishStatus access$getDanaLoadingDialog$p = HomeTabActivity.access$getDanaLoadingDialog$p(this.length);
            if (!access$getDanaLoadingDialog$p.length.isShowing()) {
                access$getDanaLoadingDialog$p.length.show();
                access$getDanaLoadingDialog$p.getMax.startRefresh();
            }
        }

        public final void dismissProgress() {
            HomeTabActivity.access$getDanaLoadingDialog$p(this.length).getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"id/dana/home/HomeTabActivity$getKycRenewalModule$1", "Lid/dana/kycrenewal/KycRenewalContract$View;", "onCheckKycRenewalRequired", "", "timeStamp", "", "queryKYCRenewalStatusResponseModel", "Lid/dana/kycrenewal/model/QueryKYCRenewalStatusResponseModel;", "onClickUpdate", "count", "", "onError", "errorMessage", "", "onShowForceKycRenewalDialog", "onShowKycRenewalDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class invoke implements NebulaAuthDialogProxy.getMax {
        final /* synthetic */ HomeTabActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void setMax(@NotNull WorkerManagerExtension.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "queryKYCRenewalStatusResponseModel");
        }

        @JvmDefault
        public final void showProgress() {
        }

        invoke(HomeTabActivity homeTabActivity) {
            this.length = homeTabActivity;
        }

        public final void setMax() {
            HomeTabActivity.access$showKycRenewalDialog(this.length);
        }

        public final void length() {
            HomeTabActivity.access$showForceKycRenewalDialog(this.length);
        }

        public final void getMin(int i) {
            if (i <= 0) {
                HomeTabActivity.access$createKycRenewalUrl(this.length, SummaryActivity.CHECKED);
            } else {
                HomeTabActivity.access$createKycRenewalUrl(this.length, "false");
            }
        }

        public final void onError(@Nullable String str) {
            this.length.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/home/HomeTabActivity$getTwilioIntroductionModule$1", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;", "onError", "", "errorMessage", "", "onFailedEnroll", "onShowChallenge", "securityId", "source", "challenge", "onSubmitEnroll", "onSuccessEnroll", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onNavigationEvent implements TitleBarExtension.AnonymousClass1.length {
        final /* synthetic */ HomeTabActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "source");
        }

        public final void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "source");
            Intrinsics.checkNotNullParameter(str3, PerformanceConstant.PAGE_CHALLENGE);
        }

        @JvmDefault
        public final void showProgress() {
        }

        onNavigationEvent(HomeTabActivity homeTabActivity) {
            this.setMax = homeTabActivity;
        }

        public final void getMax() {
            HomeTabActivity.access$getTwilioDialog$p(this.setMax).setMax();
            HomeTabActivity.access$showTwilioSuccessDialog(this.setMax);
        }

        public final void getMin() {
            HomeTabActivity.access$getTwilioDialog$p(this.setMax).setMax();
            this.setMax.toIntRange();
        }

        public final void onError(@Nullable String str) {
            HomeTabActivity.access$getTwilioDialog$p(this.setMax).setMax();
            this.setMax.toIntRange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/home/HomeTabActivity$getReferralDialogModule$1", "Lid/dana/onboarding/referral/ReferralDialogContract$View;", "onGetDialogError", "", "onGetDialogSuccess", "referralEngagementDialogModel", "Lid/dana/onboarding/referral/model/ReferralEngagementDialogModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class b implements MemoryWarningBridgeExtension.AnonymousClass1.getMin {
        final /* synthetic */ HomeTabActivity setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        b(HomeTabActivity homeTabActivity) {
            this.setMin = homeTabActivity;
        }

        public final void setMax(@NotNull vibrateLong vibratelong) {
            Intrinsics.checkNotNullParameter(vibratelong, "referralEngagementDialogModel");
            if (vibratelong.setMin()) {
                this.setMin.values = vibratelong;
                HomeTabActivity.access$checkReferralDialog(this.setMin);
                return;
            }
            this.setMin.nextOnboardingStep();
        }

        public final void getMax() {
            this.setMin.nextOnboardingStep();
        }
    }

    /* access modifiers changed from: private */
    public final void length() {
        GriverJSAPIPermission.getMax getmax = new GriverJSAPIPermission.getMax();
        Context context = this;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        getmax.setMax = context;
        vibrateLong vibratelong = this.values;
        if (vibratelong == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralEngagementDialogModel");
        }
        Intrinsics.checkNotNullParameter(vibratelong, "<set-?>");
        getmax.getMin = vibratelong;
        DialogInterface.OnDismissListener newsessionwithextras = new newSessionWithExtras(this);
        Intrinsics.checkNotNullParameter(newsessionwithextras, "<set-?>");
        getmax.getMax = newsessionwithextras;
        View.OnClickListener newsession = new newSession(this);
        Intrinsics.checkNotNullParameter(newsession, "<set-?>");
        getmax.length = newsession;
        DialogInterface.OnShowListener validaterelationship = new validateRelationship(getmax, this);
        Intrinsics.checkNotNullParameter(validaterelationship, "<set-?>");
        getmax.setMin = validaterelationship;
        Unit unit = Unit.INSTANCE;
        Context context2 = getmax.setMax;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        GriverJSAPIPermission griverJSAPIPermission = new GriverJSAPIPermission(context2, getmax, (byte) 0);
        this.toString = griverJSAPIPermission;
        if (griverJSAPIPermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralEngagementDialog");
        }
        griverJSAPIPermission.setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "id/dana/home/HomeTabActivity$showReferralEngagementDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class newSessionWithExtras implements DialogInterface.OnDismissListener {
        final /* synthetic */ HomeTabActivity setMin;

        newSessionWithExtras(HomeTabActivity homeTabActivity) {
            this.setMin = homeTabActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.setMin.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/home/HomeTabActivity$showReferralEngagementDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class newSession implements View.OnClickListener {
        final /* synthetic */ HomeTabActivity length;

        newSession(HomeTabActivity homeTabActivity) {
            this.length = homeTabActivity;
        }

        public final void onClick(View view) {
            HomeTabActivity.access$showMyReferralPage(this.length);
            HomeTabActivity.access$getReferralEngagementDialog$p(this.length).setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow", "id/dana/home/HomeTabActivity$showReferralEngagementDialog$1$3"}, k = 3, mv = {1, 4, 2})
    static final class validateRelationship implements DialogInterface.OnShowListener {
        final /* synthetic */ GriverJSAPIPermission.getMax getMax;
        final /* synthetic */ HomeTabActivity getMin;

        validateRelationship(GriverJSAPIPermission.getMax getmax, HomeTabActivity homeTabActivity) {
            this.getMax = getmax;
            this.getMin = homeTabActivity;
        }

        public final void onShow(DialogInterface dialogInterface) {
            vibrateLong vibratelong = this.getMax.getMin;
            if (vibratelong == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralEngagementDialogModel");
            }
            String str = vibratelong.setMax;
            this.getMin.getReferralDialogPresenter().setMax(str);
            HomeTabActivity.access$trackMixpanelReferralEngagementDialog(this.getMin, str);
        }
    }

    public final void onPause() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1244994671, oncanceled);
            onCancelLoad.getMin(-1244994671, oncanceled);
        }
        super.onPause();
        GriverProgressBar.UpdateRunnable updateRunnable = this.FastBitmap$CoordinateSystem;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
    }

    public final void showDanaLoadingDialog() {
        setPublishStatus setpublishstatus = this.toDoubleRange;
        if (setpublishstatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaLoadingDialog");
        }
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public final void dismissDanaLoadingDialog() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1438385578, oncanceled);
            onCancelLoad.getMin(1438385578, oncanceled);
        }
        setPublishStatus setpublishstatus = this.toDoubleRange;
        if (setpublishstatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaLoadingDialog");
        }
        setpublishstatus.getMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 2})
    static final class create<TResult> implements OnCompleteListener<String> {
        final /* synthetic */ HomeTabActivity getMin;

        create(HomeTabActivity homeTabActivity) {
            this.getMin = homeTabActivity;
        }

        public final void onComplete(@NotNull Task<String> task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isSuccessful()) {
                HomeTabActivity homeTabActivity = this.getMin;
                String result = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result, "task.result");
                homeTabActivity.Grayscale$Algorithm = result;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class warmup implements View.OnClickListener {
        final /* synthetic */ HomeTabActivity getMax;

        warmup(HomeTabActivity homeTabActivity) {
            this.getMax = homeTabActivity;
        }

        public final void onClick(View view) {
            new DialogInterface.OnDismissListener(this) {
                final /* synthetic */ warmup getMin;

                {
                    this.getMin = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    this.getMin.getMax.nextOnboardingStep();
                }
            };
            this.getMax.nextOnboardingStep();
        }
    }

    /* access modifiers changed from: private */
    public final void IsOverlapping() {
        selectAllAppInfo selectallappinfo = new selectAllAppInfo(this, new warmup(this));
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(selectallappinfo.getMax);
        setmax.equals = R.drawable.ic_payment_setting_success_dialog;
        setmax.setMin = selectallappinfo.getMax.getString(R.string.payment_setting_success_dialog_title);
        setmax.length = selectallappinfo.getMax.getString(R.string.payment_setting_success_dialog_message);
        TwoButtonWithImageDialog.setMax max = setmax.getMax(false).setMax(false);
        String string = selectallappinfo.getMax.getString(R.string.face_verification_info_button);
        View.OnClickListener onClickListener = selectallappinfo.length;
        max.values = string;
        max.toString = onClickListener;
        max.getMin().setMin();
    }

    /* access modifiers changed from: private */
    public final void setMax(SettingModel settingModel, boolean z) {
        Intent intent = new Intent(this, SettingMoreProfileActivity.class);
        intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
        intent.putExtra(MyProfileBundleKey.SHOW_ALWAYS_ASK_PIN_SUCCESS_DIALOG, z);
        startActivity(intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/home/HomeTabActivity$showTwilioDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class requestPostMessageChannelWithExtras implements View.OnClickListener {
        final /* synthetic */ boolean getMax;
        final /* synthetic */ TwoButtonWithImageDialog.setMax getMin;
        final /* synthetic */ HomeTabActivity length;
        final /* synthetic */ String setMax;

        requestPostMessageChannelWithExtras(TwoButtonWithImageDialog.setMax setmax, HomeTabActivity homeTabActivity, String str, boolean z) {
            this.getMin = setmax;
            this.length = homeTabActivity;
            this.setMax = str;
            this.getMax = z;
        }

        public final void onClick(View view) {
            HomeTabActivity.access$getTwilioDialog$p(this.length);
            this.getMin.toIntRange = this.length.getMax(false, this.setMax);
            HomeTabActivity.access$checkPushTokenReceived(this.length, this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/home/HomeTabActivity$showTwilioDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class requestPostMessageChannel implements View.OnClickListener {
        final /* synthetic */ boolean getMin;
        final /* synthetic */ HomeTabActivity setMax;
        final /* synthetic */ String setMin;

        requestPostMessageChannel(HomeTabActivity homeTabActivity, String str, boolean z) {
            this.setMax = homeTabActivity;
            this.setMin = str;
            this.getMin = z;
        }

        public final void onClick(View view) {
            this.setMax.getTwilioDialogPresenter().getMin();
            HomeTabActivity.access$showTwilioMaybeLaterSnackbar(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged", "id/dana/home/HomeTabActivity$showTwilioDialog$1$3"}, k = 3, mv = {1, 4, 2})
    static final class updateVisuals implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ HomeTabActivity getMin;
        final /* synthetic */ String setMax;
        final /* synthetic */ boolean setMin;

        updateVisuals(HomeTabActivity homeTabActivity, String str, boolean z) {
            this.getMin = homeTabActivity;
            this.setMax = str;
            this.setMin = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.getMin.getTwilioDialogPresenter().setMin(z);
        }
    }

    /* access modifiers changed from: private */
    public final void toIntRange() {
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.toFloatRange = getString(R.string.twilio_failed_dialog_title);
        getmax2.isInside = getString(R.string.twilio_failed_dialog_description);
        getmax2.setMax = R.drawable.ic_general_error_somethings_wrong;
        getmax.IsOverlapping();
        getmax.setMax(false);
        getmax2.toIntRange = 0;
        getmax.setMin(getString(R.string.twilio_failed_dialog_positive_button), new postMessage(this));
        getmax.getMax(getString(R.string.maybe_later), new ICustomTabsService.Default(this));
        Unit unit = Unit.INSTANCE;
        isBaselineAligned min = new getProgressViewStartOffset(getmax.invoke, getmax.length, getmax, getmax.equals, (byte) 0).getMin();
        this.toIntRange = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioFailedDialog");
        }
        min.show();
    }

    /* access modifiers changed from: private */
    public final SpannableString getMax(boolean z, String str) {
        int length2;
        int min;
        String string = getString(R.string.twilio_dialog_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.twilio_dialog_description)");
        String string2 = getString(R.string.twilio_dialog_description_highlight);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.twili…og_description_highlight)");
        CharSequence charSequence = string;
        int indexOf$default = StringsKt.indexOf$default(charSequence, string2, 0, false, 6, (Object) null);
        int length3 = string2.length() + indexOf$default;
        SpannableString spannableString = new SpannableString(charSequence);
        TwilioIntroductionActivity.setMin setmin = TwilioIntroductionActivity.Companion;
        Context context = this;
        Intent min2 = TwilioIntroductionActivity.setMin.setMin(context, TwilioIntroductionActivity.HOME_PAGE, str);
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1348474061, oncanceled);
            onCancelLoad.getMin(1348474061, oncanceled);
        }
        spannableString.setSpan(new values(this, z, min2), indexOf$default, length3, 33);
        spannableString.setSpan(new ForegroundColorSpan(IntRange.setMax(context, R.color.f18632131099744)), indexOf$default, length3, 33);
        return spannableString;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/home/HomeTabActivity$createNoUnderLineClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values extends ClickableSpan {
        final /* synthetic */ HomeTabActivity getMax;
        final /* synthetic */ Intent getMin;
        final /* synthetic */ boolean setMax;

        values(HomeTabActivity homeTabActivity, boolean z, Intent intent) {
            this.getMax = homeTabActivity;
            this.setMax = z;
            this.getMin = intent;
        }

        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "widget");
            if (this.setMax) {
                HomeTabActivity.access$getTwilioDialog$p(this.getMax).setMax();
                HomeTabActivity homeTabActivity = this.getMax;
                Intent intent = this.getMin;
                setMin.getMax getmax = setMin.getMax;
                homeTabActivity.startActivityForResult(intent, setMin.getMax.length());
            }
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/home/HomeTabActivity$OnBackToHomepageMessageEvent;", "", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getArgs", "()Landroid/os/Bundle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @Nullable
        final Bundle setMax;

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof length) && Intrinsics.areEqual((Object) this.setMax, (Object) ((length) obj).setMax);
            }
            return true;
        }

        public final int hashCode() {
            Bundle bundle = this.setMax;
            if (bundle != null) {
                return bundle.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBackToHomepageMessageEvent(args=");
            sb.append(this.setMax);
            sb.append(")");
            return sb.toString();
        }

        public length(@Nullable Bundle bundle) {
            this.setMax = bundle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class asInterface implements View.OnClickListener {
        final /* synthetic */ HomeTabActivity getMax;

        asInterface(HomeTabActivity homeTabActivity) {
            this.getMax = homeTabActivity;
        }

        public final void onClick(View view) {
            new DialogInterface.OnDismissListener(this) {
                final /* synthetic */ asInterface getMin;

                {
                    this.getMin = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    this.getMin.getMax.nextOnboardingStep();
                }
            };
            HomeTabActivity.access$savePopupKycClick(this.getMax);
            HomeTabActivity.access$openKycRenewalContainer(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 4, 2})
    static final class setDefaultImpl implements DialogInterface.OnCancelListener {
        final /* synthetic */ HomeTabActivity setMax;

        setDefaultImpl(HomeTabActivity homeTabActivity) {
            this.setMax = homeTabActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.setMax.nextOnboardingStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements View.OnClickListener {
        final /* synthetic */ HomeTabActivity length;

        toDoubleRange(HomeTabActivity homeTabActivity) {
            this.length = homeTabActivity;
        }

        public final void onClick(View view) {
            HomeTabActivity.access$getFaceLoginDialog$p(this.length).setMax();
            this.length.getFeedsContentAction().getMax("https://link.dana.id/setting-more");
            this.length.getGlobalNetworkPresenter().getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ HomeTabActivity getMax;

        hashCode(HomeTabActivity homeTabActivity) {
            this.getMax = homeTabActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.getMax.getFaceAuthPopUpConsultationPresenter().getMax(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/home/HomeTabActivity$Companion;", "", "()V", "AC_CODE_VALUE", "", "DEEPLINK_PAYMENT_PATH", "EXTRA_IGNORE_DISMISS_RULE", "EXTRA_SHOP_ID", "EXTRA_SOURCE", "HAS_SUGGEST_FACE_LOGIN", "", "OAUTH_LOADING_VALUE", "showMerchantReviewForm", "", "context", "Landroid/content/Context;", "source", "shopId", "ignoreDismissRule", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        public static void getMax(@NotNull Context context, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "source");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            Intent flags = new Intent(context, HomeTabActivity.class).putExtra("source", str).putExtra(HomeTabActivity.EXTRA_SHOP_ID, str2).putExtra(HomeTabActivity.EXTRA_IGNORE_DISMISS_RULE, true).setFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(flags, "Intent(context, HomeTabA…t.FLAG_ACTIVITY_NEW_TASK)");
            context.startActivity(flags);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/home/HomeTabActivity$SwitchFragment;", "", "switchTo", "", "fragmentIndex", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        @NotNull
        public static final getMax getMax = getMax.setMax;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lid/dana/home/HomeTabActivity$SwitchFragment$Companion;", "", "()V", "HOME_FRAGMENT", "", "INBOX_FRAGMENT", "SCANNER_FRAGMENT", "TWILIO_REQUEST_CODE", "getTWILIO_REQUEST_CODE", "()I", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private static final int length = CornerMarkingDataProvider.AnonymousClass2.setMax();
            static final /* synthetic */ getMax setMax = new getMax();

            private getMax() {
            }

            public static int length() {
                return length;
            }
        }
    }

    public final void showMerchantReview(@NotNull String str, @NotNull String str2, boolean z) {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1153431979, oncanceled);
            onCancelLoad.getMin(-1153431979, oncanceled);
        }
        Context baseContext = getBaseContext();
        FtsOptions$Order ftsOptions$Order = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1153431979, oncanceled2);
            onCancelLoad.getMin(-1153431979, oncanceled2);
        }
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        IH5TinyPopMenu viewPagerAdapter$app_productionRelease = getViewPagerAdapter$app_productionRelease();
        FtsOptions$Order length3 = viewPagerAdapter$app_productionRelease != null ? viewPagerAdapter$app_productionRelease.getMax.getMax(1) : null;
        if (length3 instanceof HomeTabFragment) {
            ftsOptions$Order = length3;
        }
        HomeTabFragment homeTabFragment = (HomeTabFragment) ftsOptions$Order;
        if (homeTabFragment != null) {
            Boolean valueOf2 = Boolean.valueOf(z);
            if (homeTabFragment.getMin == null) {
                if (homeTabFragment.getMax instanceof HomeTabActivity) {
                    ((HomeTabActivity) homeTabFragment.getMax).nextOnboardingStep();
                }
            } else if (homeTabFragment.getMin.getMax(0) instanceof NewHomeFragment) {
                NewHomeFragment newHomeFragment = (NewHomeFragment) homeTabFragment.getMin.getMax(0);
                if (newHomeFragment != null) {
                    newHomeFragment.getMin(str, str2, valueOf2);
                } else if (homeTabFragment.getMax instanceof HomeTabActivity) {
                    ((HomeTabActivity) homeTabFragment.getMax).nextOnboardingStep();
                }
            } else {
                HomeFragment homeFragment = (HomeFragment) homeTabFragment.getMin.getMax(0);
                if (homeFragment != null) {
                    homeFragment.getMin(str, str2, valueOf2);
                } else if (homeTabFragment.getMax instanceof HomeTabActivity) {
                    ((HomeTabActivity) homeTabFragment.getMax).nextOnboardingStep();
                }
            }
        } else {
            nextOnboardingStep();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReturnToHomepage(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "event");
        Bundle bundle = length2.setMax;
        if (bundle != null && bundle.getBoolean(IntentKeySource.TransactionKey.ON_TRANSACTION_SUCCESS, false)) {
            PdfImageSource.setMin setmin = this.playStoreReviewPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playStoreReviewPresenter");
            }
            setmin.length();
        }
    }

    public static final /* synthetic */ HomeTabFragment access$getHomeTabFragment$p(HomeTabActivity homeTabActivity) {
        IH5TinyPopMenu viewPagerAdapter$app_productionRelease = homeTabActivity.getViewPagerAdapter$app_productionRelease();
        FtsOptions$Order ftsOptions$Order = null;
        FtsOptions$Order length2 = viewPagerAdapter$app_productionRelease != null ? viewPagerAdapter$app_productionRelease.getMax.getMax(1) : null;
        if (length2 instanceof HomeTabFragment) {
            ftsOptions$Order = length2;
        }
        return (HomeTabFragment) ftsOptions$Order;
    }

    public static final /* synthetic */ void access$initSwitchOffPaymentAuth(HomeTabActivity homeTabActivity) {
        FileMangerBridgeExtension.AnonymousClass1.getMax getmax = homeTabActivity.paymentSettingPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentSettingPresenter");
        }
        getmax.getMin("SWITCH_PAYMENT_AUTH_OFF", new SettingModel());
    }

    public static final /* synthetic */ void access$showPaymentSettingBottomSheet(HomeTabActivity homeTabActivity, FileMangerBridgeExtension.AnonymousClass2 r3) {
        if (homeTabActivity.isActivityAvailable()) {
            r3.setCancelable(false);
            r3.show(homeTabActivity.getSupportFragmentManager(), "");
            r3.getMin = new ICustomTabsService(r3, homeTabActivity);
        }
    }

    public static final /* synthetic */ FileMangerBridgeExtension.AnonymousClass2 access$getBottomSheetPaymentSettingFragment$p(HomeTabActivity homeTabActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1232111767, oncanceled);
            onCancelLoad.getMin(1232111767, oncanceled);
        }
        return (FileMangerBridgeExtension.AnonymousClass2) homeTabActivity.valueOf.getValue();
    }

    public static final /* synthetic */ void access$startGnOnBoarding(HomeTabActivity homeTabActivity, String str) {
        GriverManifest.AnonymousClass36 r0 = homeTabActivity.getMax;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        r0.getMin.getMax(str);
        GriverManifest.AnonymousClass36 r2 = homeTabActivity.getMax;
        if (r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        r2.getMax.getMax(Boolean.TRUE);
    }

    public static final /* synthetic */ void access$switchAutoRouteState(HomeTabActivity homeTabActivity, String str) {
        FileMangerBridgeExtension.AnonymousClass1.getMax getmax = homeTabActivity.paymentSettingPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentSettingPresenter");
        }
        getmax.setMin(str);
    }

    public static final /* synthetic */ void access$startRecommendSecurityChallenge(HomeTabActivity homeTabActivity, boolean z, String str, String str2) {
        ChallengeControl.length length2 = new ChallengeControl.length((BaseActivity) homeTabActivity);
        length2.getMin = "auto_route";
        ChallengeControl.length length3 = length2;
        length3.setMax = "auto_route";
        new ChallengeControl(length3.getMax(z, str, str2), (byte) 0).getMin();
    }

    public static final /* synthetic */ void access$showPaymentSettingFailedDialog(HomeTabActivity homeTabActivity) {
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(homeTabActivity);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.toFloatRange = homeTabActivity.getString(R.string.payment_setting_failed_dialog_title);
        getmax2.isInside = homeTabActivity.getString(R.string.payment_setting_failed_dialog_message);
        getmax2.setMax = R.drawable.ic_payment_setting_failed_dialog;
        getmax.IsOverlapping();
        getmax.setMax(false);
        getmax2.toIntRange = 0;
        getmax.setMin(homeTabActivity.getString(R.string.try_again), new mayLaunchUrl(homeTabActivity));
        getmax.getMax(homeTabActivity.getString(R.string.option_cancel), new extraCommand(homeTabActivity));
        Unit unit = Unit.INSTANCE;
        isBaselineAligned min = new getProgressViewStartOffset(getmax.invoke, getmax.length, getmax, getmax.equals, (byte) 0).getMin();
        homeTabActivity.setMax = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentSettingFailedDialog");
        }
        min.show();
    }

    public static final /* synthetic */ void access$switchPaymentAuth(HomeTabActivity homeTabActivity, showTime showtime, String str, SettingModel settingModel) {
        boolean z;
        String str2;
        List<ToastBridgeExtension> list;
        ToastBridgeExtension toastBridgeExtension;
        if (showtime != null) {
            z = showtime.setMax();
        } else {
            z = true;
        }
        if (showtime == null || (list = showtime.getMax) == null || (toastBridgeExtension = (ToastBridgeExtension) CollectionsKt.first(list)) == null) {
            str2 = null;
        } else {
            str2 = toastBridgeExtension.getMin;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "SWITCH_PAYMENT_AUTH_ON")) {
            if (!z) {
                FileMangerBridgeExtension.AnonymousClass1.getMax getmax = homeTabActivity.paymentSettingPresenter;
                if (getmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentSettingPresenter");
                }
                getmax.length(true, str2, str, settingModel);
                return;
            }
            homeTabActivity.nextOnboardingStep();
            homeTabActivity.setMax(settingModel, false);
        } else if (z) {
            FileMangerBridgeExtension.AnonymousClass1.getMax getmax2 = homeTabActivity.paymentSettingPresenter;
            if (getmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentSettingPresenter");
            }
            getmax2.length(false, str2, str, settingModel);
        } else {
            homeTabActivity.IsOverlapping();
        }
    }

    public static final /* synthetic */ void access$startAlwaysAskPinPasswordChallenge(HomeTabActivity homeTabActivity, boolean z, PopupWindowToast popupWindowToast) {
        ChallengeControl.length length2 = new ChallengeControl.length((BaseActivity) homeTabActivity);
        length2.getMin = "payment_auth";
        ChallengeControl.length length3 = length2;
        length3.setMax = "payment_auth";
        Intrinsics.checkNotNull(popupWindowToast);
        new ChallengeControl(length3.getMax(z, popupWindowToast), (byte) 0).getMin();
    }

    public static final /* synthetic */ void access$displayFaceLoginSuggestionDialog(HomeTabActivity homeTabActivity) {
        Context context = homeTabActivity;
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(context);
        setmax.setMin = homeTabActivity.getString(R.string.login_with_face_verification);
        setmax.length = homeTabActivity.getString(R.string.login_with_face_description);
        setmax.equals = R.drawable.ic_face_scan;
        TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
        max.values = homeTabActivity.getString(R.string.activate);
        max.toString = new toDoubleRange(homeTabActivity);
        max.FastBitmap$CoordinateSystem = homeTabActivity.getString(R.string.later);
        max.hashCode = new HomeTabActivity$FastBitmap$CoordinateSystem(homeTabActivity);
        max.Mean$Arithmetic = homeTabActivity.getString(R.string.dont_show_this_message_again);
        max.invoke = new hashCode(homeTabActivity);
        String string = homeTabActivity.getString(R.string.lbl_face_auth_registration_info_footer);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.lbl_f…registration_info_footer)");
        String string2 = homeTabActivity.getString(R.string.lbl_face_auth_registration_info_footer_higlight);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.lbl_f…ion_info_footer_higlight)");
        CharSequence charSequence = string;
        int indexOf$default = StringsKt.indexOf$default(charSequence, string2, 0, false, 6, (Object) null);
        int length2 = string2.length() + indexOf$default;
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new toJavaScript(context, WebViewActivity.ContentBuilder(context, string2, isShowMenu.setMin("/m/standalone/tnc"))), indexOf$default, length2, 33);
        spannableString.setSpan(new ForegroundColorSpan(IntRange.setMax(context, R.color.f18632131099744)), indexOf$default, length2, 33);
        max.valueOf = spannableString;
        TwoButtonWithImageDialog min = max.getMin();
        Intrinsics.checkNotNullExpressionValue(min, "TwoButtonWithImageDialog…e())\n            .build()");
        homeTabActivity.equals = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceLoginDialog");
        }
        min.setMin();
        extraCallback = true;
    }

    public static final /* synthetic */ void access$showForceKycRenewalDialog(HomeTabActivity homeTabActivity) {
        ResourceConstants resourceConstants = new ResourceConstants(homeTabActivity, new asInterface(homeTabActivity));
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(resourceConstants.length);
        getmax.setMax = R.drawable.ic_kyc_renewal_dialog;
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.toFloatRange = resourceConstants.length.getString(R.string.kyc_renewal_dialog_title);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.isInside = resourceConstants.length.getString(R.string.kyc_renewal_dialog_message);
        getProgressViewStartOffset.getMax IsOverlapping2 = getmax3.setMax(false).IsOverlapping();
        IsOverlapping2.toIntRange = 0;
        View.OnClickListener onClickListener = resourceConstants.setMax;
        getProgressViewStartOffset.getMax getmax4 = IsOverlapping2;
        getmax4.toString = resourceConstants.length.getString(R.string.kyc_renewal_dialog_update_button_text);
        getmax4.FastBitmap$CoordinateSystem = onClickListener;
        new getProgressViewStartOffset(getmax4.invoke, getmax4.length, getmax4, getmax4.equals, (byte) 0).getMin().show();
    }

    public static final /* synthetic */ void access$createKycRenewalUrl(HomeTabActivity homeTabActivity, String str) {
        String obj = Uri.parse("https://m.dana.id/i/kyc/renewal-intro").buildUpon().appendQueryParameter("showCloseButton", str).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "uriBuilder\n            .…)\n            .toString()");
        DanaH5.startContainerFullUrl(obj, new toString(homeTabActivity));
    }

    public static final /* synthetic */ void access$showTwilioDialog(HomeTabActivity homeTabActivity, boolean z, String str) {
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(homeTabActivity);
        setmax.setMin = homeTabActivity.getString(R.string.twilio_dialog_title);
        setmax.toIntRange = homeTabActivity.getMax(true, str);
        setmax.equals = R.drawable.ic_twilio_dialog_icon;
        setmax.setMax(false);
        setmax.getMax(false);
        setmax.Grayscale$Algorithm = true;
        String string = homeTabActivity.getString(R.string.option_yes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.option_yes)");
        if (string != null) {
            String upperCase = string.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            setmax.values = upperCase;
            setmax.toString = new requestPostMessageChannelWithExtras(setmax, homeTabActivity, str, z);
            String string2 = homeTabActivity.getString(R.string.maybe_later);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.maybe_later)");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
                setmax.FastBitmap$CoordinateSystem = upperCase2;
                setmax.hashCode = new requestPostMessageChannel(homeTabActivity, str, z);
                if (z) {
                    setmax.Mean$Arithmetic = homeTabActivity.getString(R.string.dont_show_this_message_again);
                    setmax.invoke = new updateVisuals(homeTabActivity, str, z);
                }
                Unit unit = Unit.INSTANCE;
                TwoButtonWithImageDialog min = setmax.getMin();
                Intrinsics.checkNotNullExpressionValue(min, "TwoButtonWithImageDialog…      }\n        }.build()");
                homeTabActivity.isInside = min;
                if (min == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("twilioDialog");
                }
                min.setMin();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public static final /* synthetic */ void access$showTwilioSuccessDialog(HomeTabActivity homeTabActivity) {
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(homeTabActivity);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.toFloatRange = homeTabActivity.getString(R.string.twilio_success_dialog_title);
        getmax2.isInside = homeTabActivity.getString(R.string.twilio_success_dialog_description);
        getmax2.setMax = R.drawable.ic_trusted_device;
        getmax.IsOverlapping();
        getmax.setMax(false);
        getmax2.toIntRange = 0;
        getmax.setMin(homeTabActivity.getString(R.string.option_yes), new ICustomTabsService.Stub(homeTabActivity));
        getmax.getMax(homeTabActivity.getString(R.string.maybe_later), new receiveFile(homeTabActivity));
        Unit unit = Unit.INSTANCE;
        isBaselineAligned min = new getProgressViewStartOffset(getmax.invoke, getmax.length, getmax, getmax.equals, (byte) 0).getMin();
        homeTabActivity.IsOverlapping = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioSuccessDialog");
        }
        min.show();
    }

    public static final /* synthetic */ void access$showKycAmlEddDialog(HomeTabActivity homeTabActivity, GriverManifest.AnonymousClass6 r6) {
        AppInfoDao appInfoDao = new AppInfoDao(homeTabActivity, r6.getMin(), new setDefaultImpl(homeTabActivity), new ICustomTabsCallback.Stub.Proxy(homeTabActivity, r6));
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(appInfoDao.setMax);
        setmax.equals = R.drawable.ic_edd_dialog;
        setmax.setMin = appInfoDao.setMax.getString(R.string.kyc_aml_edd_dialog_title);
        setmax.length = appInfoDao.setMax.getString(R.string.kyc_aml_edd_dialog_message);
        TwoButtonWithImageDialog.setMax max = setmax.getMax(!appInfoDao.length).setMax(!appInfoDao.length);
        max.getMax = appInfoDao.getMin;
        String string = appInfoDao.setMax.getString(R.string.kyc_aml_edd_dialog_button_text);
        View.OnClickListener onClickListener = appInfoDao.setMin;
        max.values = string;
        max.toString = onClickListener;
        max.getMin().setMin();
    }

    public static final /* synthetic */ void access$showMyReferralPage(HomeTabActivity homeTabActivity) {
        Intent intent = new Intent(homeTabActivity, MyReferralDetailActivity.class);
        intent.putExtra(MyReferralDetailActivity.OPEN_BOTTOM_SHEET_DIRECTLY, true);
        Unit unit = Unit.INSTANCE;
        homeTabActivity.startActivity(intent);
    }

    public static final /* synthetic */ void access$trackMixpanelReferralEngagementDialog(HomeTabActivity homeTabActivity, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(homeTabActivity);
        length2.getMax = TrackerKey.Event.REFERRAL_ENGAGEMENT_POPUP;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.ONBOARDING_POPUP_SCENARIO, str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ void access$checkPushTokenReceived(HomeTabActivity homeTabActivity, String str) {
        if (homeTabActivity.Grayscale$Algorithm != null) {
            TitleBarExtension.AnonymousClass1.getMin getmin = homeTabActivity.twilioIntroductionPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
            }
            String str2 = homeTabActivity.Grayscale$Algorithm;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pushToken");
            }
            getmin.getMax(str, TwilioIntroductionActivity.HOME_PAGE, str2);
            return;
        }
        TitleBarExtension.AnonymousClass1.getMin getmin2 = homeTabActivity.twilioIntroductionPresenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
        }
        getmin2.getMax("Push notification token null", TwilioIntroductionActivity.HOME_PAGE);
        homeTabActivity.toIntRange();
    }

    public static final /* synthetic */ void access$showTwilioMaybeLaterSnackbar(HomeTabActivity homeTabActivity) {
        Window window = homeTabActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        View findViewById = window.getDecorView().findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "window.decorView.findVie…yId(android.R.id.content)");
        setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
        setmax.getMax = homeTabActivity.getString(R.string.twilio_maybe_later_snackbar_text);
        setmax.toIntRange = 0;
        setmax.getMin = R.drawable.bg_rounded_border_yellow_50;
        String string = homeTabActivity.getString(R.string.dismiss);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.dismiss)");
        if (string != null) {
            String upperCase = string.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            setmax.setMax = upperCase;
            setmax.length = new ICustomTabsService.Stub.Proxy(homeTabActivity);
            setProgressViewOffset max = setmax.getMax();
            homeTabActivity.hashCode = max;
            if (max == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioSnackbar");
            }
            max.addCallback(new IPostMessageService(homeTabActivity));
            setProgressViewOffset setprogressviewoffset = homeTabActivity.hashCode;
            if (setprogressviewoffset == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioSnackbar");
            }
            setprogressviewoffset.show();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public static final /* synthetic */ void access$savePopupKycClick(HomeTabActivity homeTabActivity) {
        AboutInfoBridgeExtension aboutInfoBridgeExtension = homeTabActivity.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        aboutInfoBridgeExtension.equals.execute(AboutInfoBridgeExtension.getMax(), AboutInfoBridgeExtension.hashCode.INSTANCE, AboutInfoBridgeExtension.toString.INSTANCE);
    }

    public static final /* synthetic */ void access$openKycRenewalContainer(HomeTabActivity homeTabActivity) {
        AboutInfoBridgeExtension aboutInfoBridgeExtension = homeTabActivity.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        aboutInfoBridgeExtension.setMin.execute(onReceivedIcon.INSTANCE, new AboutInfoBridgeExtension.setMax(aboutInfoBridgeExtension), AboutInfoBridgeExtension.getMin.INSTANCE);
    }

    public static final /* synthetic */ void access$savePopupKycDismiss(HomeTabActivity homeTabActivity) {
        AboutInfoBridgeExtension aboutInfoBridgeExtension = homeTabActivity.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        aboutInfoBridgeExtension.setMin.execute(onReceivedIcon.INSTANCE, new AboutInfoBridgeExtension.invoke(aboutInfoBridgeExtension), AboutInfoBridgeExtension.valueOf.INSTANCE);
    }

    public static final /* synthetic */ void access$showFaceLoginOnCancelEnrollDalog(HomeTabActivity homeTabActivity) {
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(homeTabActivity);
        getmax.toFloatRange = homeTabActivity.getString(R.string.want_to_activate_later);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = homeTabActivity.getString(R.string.dont_miss_out_face_login);
        getProgressViewStartOffset.getMax max = getmax2.IsOverlapping().setMax(false);
        max.toIntRange = 0;
        max.setMin(homeTabActivity.getString(R.string.got_it), new ICustomTabsCallback.Default(homeTabActivity)).equals();
    }

    public static final /* synthetic */ void access$isPopupKycQueryExceedLimit(HomeTabActivity homeTabActivity) {
        AboutInfoBridgeExtension aboutInfoBridgeExtension = homeTabActivity.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        aboutInfoBridgeExtension.length.execute(onReceivedIcon.INSTANCE, new AboutInfoBridgeExtension.equals(aboutInfoBridgeExtension), AboutInfoBridgeExtension.values.INSTANCE);
    }

    public static final /* synthetic */ void access$isPopupKycShowExceedLimit(HomeTabActivity homeTabActivity) {
        AboutInfoBridgeExtension aboutInfoBridgeExtension = homeTabActivity.kycRenewalPresenter;
        if (aboutInfoBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycRenewalPresenter");
        }
        aboutInfoBridgeExtension.setMax.execute(onReceivedIcon.INSTANCE, new AboutInfoBridgeExtension$FastBitmap$CoordinateSystem(aboutInfoBridgeExtension), AboutInfoBridgeExtension.toDoubleRange.INSTANCE);
    }

    public static final /* synthetic */ void access$trackMixpanelAppReady(HomeTabActivity homeTabActivity) {
        convertDipToPx.length length2 = new convertDipToPx.length(homeTabActivity);
        length2.getMax = TrackerKey.Event.APP_READY;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.START_TYPE, TrackerKey.AppStartProperty.APP_START_COLD);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ long access$getCurrentUnixEpochTime(HomeTabActivity homeTabActivity) {
        return System.currentTimeMillis() / 1000;
    }
}
