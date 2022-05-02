package id.dana.promoquest.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.MissionModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.RedeemQuestModule;
import id.dana.di.modules.RedeemUserMissionModule;
import id.dana.di.modules.TrackQuestModule;
import id.dana.model.ThirdPartyService;
import id.dana.promoquest.model.MissionModel;
import id.dana.promoquest.model.QuestModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ActionBar$LayoutParams;
import o.AppxResourcePackage;
import o.ConfirmPopup;
import o.GriverAMCSAppUpdater;
import o.ImageBridgeExtension;
import o.IntRange;
import o.PrepareException;
import o.RxWorker;
import o.UrlMapExtension;
import o.checkFilePath;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.encodeImageBytesToString;
import o.genTextSelector;
import o.getDuration;
import o.getLineColor;
import o.getScrimColor;
import o.getShortName;
import o.getWorkerFactory;
import o.isUsed;
import o.loadLocalImageInternal;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.restorePresenterStates;
import o.setForegroundAsync;
import o.setShadowResourceRight;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 p2\u00020\u0001:\u0001pB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0012\u0010@\u001a\u00020A2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010B\u001a\u00020\u001bH\u0016J\b\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020=H\u0002J\b\u0010R\u001a\u00020=H\u0016J\b\u0010S\u001a\u00020=H\u0002J\b\u0010T\u001a\u00020=H\u0002J\b\u0010U\u001a\u00020?H\u0002J\u0012\u0010V\u001a\u00020=2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\b\u0010Y\u001a\u00020=H\u0002J\u0010\u0010Z\u001a\u00020=2\u0006\u0010[\u001a\u00020?H\u0002J\u0016\u0010\\\u001a\u00020=2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^H\u0002J\b\u0010`\u001a\u00020=H\u0002J\b\u0010a\u001a\u00020=H\u0002J\u0018\u0010b\u001a\u00020=2\u0006\u0010c\u001a\u00020?2\u0006\u0010d\u001a\u00020?H\u0002J\b\u0010e\u001a\u00020=H\u0002J\u001a\u0010f\u001a\u00020=2\u0006\u0010g\u001a\u00020?2\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\b\u0010j\u001a\u00020=H\u0002J\b\u0010k\u001a\u00020=H\u0002J\u0016\u0010k\u001a\u00020=2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^H\u0002J\u0016\u0010l\u001a\u00020=2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^H\u0002J\u0018\u0010m\u001a\u00020=2\u0006\u0010n\u001a\u00020A2\u0006\u0010o\u001a\u00020AH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006q"}, d2 = {"Lid/dana/promoquest/activity/MissionDetailActivity;", "Lid/dana/base/BaseActivity;", "()V", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "date", "Ljava/util/Date;", "expiresIn", "setExpiresIn", "(Ljava/util/Date;)V", "missionDetailQuestAdapter", "Lid/dana/promoquest/adapter/MissionDetailQuestAdapter;", "missionModel", "Lid/dana/promoquest/model/MissionModel;", "missionPresenter", "Lid/dana/contract/promoquest/quest/MissionContract$Presenter;", "getMissionPresenter", "()Lid/dana/contract/promoquest/quest/MissionContract$Presenter;", "setMissionPresenter", "(Lid/dana/contract/promoquest/quest/MissionContract$Presenter;)V", "promoQuestActionFactory", "Lid/dana/promoquest/handler/PromoQuestActionFactory;", "questPosition", "", "readLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "redeemMissionListener", "Lid/dana/promoquest/PromoQuestListener$RedeemMissionResultListener;", "redeemMissionPresenter", "Lid/dana/contract/promoquest/redeem/RedeemMissionContract$Presenter;", "getRedeemMissionPresenter", "()Lid/dana/contract/promoquest/redeem/RedeemMissionContract$Presenter;", "setRedeemMissionPresenter", "(Lid/dana/contract/promoquest/redeem/RedeemMissionContract$Presenter;)V", "redeemQuestListener", "Lid/dana/promoquest/PromoQuestListener$RedeemQuestResult;", "redeemQuestPresenter", "Lid/dana/contract/promoquest/redeem/RedeemQuestContract$Presenter;", "getRedeemQuestPresenter", "()Lid/dana/contract/promoquest/redeem/RedeemQuestContract$Presenter;", "setRedeemQuestPresenter", "(Lid/dana/contract/promoquest/redeem/RedeemQuestContract$Presenter;)V", "ssQuestView", "Lcom/ethanhua/skeleton/SkeletonScreen;", "trackListener", "Lid/dana/promoquest/PromoQuestListener$TrackQuestResultListener;", "trackPresenter", "Lid/dana/contract/promoquest/track/TrackQuestContract$Presenter;", "getTrackPresenter", "()Lid/dana/contract/promoquest/track/TrackQuestContract$Presenter;", "setTrackPresenter", "(Lid/dana/contract/promoquest/track/TrackQuestContract$Presenter;)V", "broadcastMission", "", "isNeedRefreshWholeList", "", "getExpireTime", "", "getLayout", "getMissionModule", "Lid/dana/di/modules/MissionModule;", "getPromoQuestDeeplinkActionListener", "Lid/dana/promoquest/handler/deeplink/PromoQuestDeeplinkActionListener;", "getQuestActionListener", "Lid/dana/promoquest/PromoQuestListener$QuestAction;", "getRedeemQuestListener", "Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;", "getRedeemQuestModule", "Lid/dana/di/modules/RedeemQuestModule;", "getRedeemUserMissionModule", "Lid/dana/di/modules/RedeemUserMissionModule;", "getTrackModule", "Lid/dana/di/modules/TrackQuestModule;", "hideSkeleton", "init", "initViews", "injectComponent", "isScrollViewFullyVisible", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "refreshMissionDetail", "setMissionPrizeView", "isHasPrize", "setQuests", "questModels", "", "Lid/dana/promoquest/model/QuestModel;", "setScrollBehaviour", "setupAppBarLayout", "setupMissionViewHasTnC", "hasTnC", "hasTncButton", "setupViews", "showRedeemDialog", "isSuccessClaimed", "prize", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "showSkeleton", "trackMissionFinish", "trackUncompletedTasks", "updateCurrentQuest", "questId", "status", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissionDetailActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    public static final int getMax = 116;
    public static final byte[] setMax = {111, 92, Byte.MAX_VALUE, 119, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private encodeImageBytesToString FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public int IsOverlapping;
    @Inject
    public getShortName dynamicUrlWrapper;
    /* access modifiers changed from: private */
    public UrlMapExtension.getMin equals;
    /* access modifiers changed from: private */
    public UrlMapExtension.length getMin;
    private onDetachedFromLayoutParams isInside;
    @Inject
    public setForegroundAsync.getMin missionPresenter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    @Inject
    public isUsed.length redeemMissionPresenter;
    @Inject
    public RxWorker.setMin redeemQuestPresenter;
    private Date toDoubleRange;
    /* access modifiers changed from: private */
    public UrlMapExtension.setMin toFloatRange;
    /* access modifiers changed from: private */
    public MissionModel toIntRange;
    private HashMap toString;
    @Inject
    public getWorkerFactory.setMax trackPresenter;
    /* access modifiers changed from: private */
    public loadLocalImageInternal values;

    @JvmStatic
    @NotNull
    public static final Intent generateIntent(@NotNull Context context, @NotNull MissionModel missionModel) {
        return length.setMin(context, missionModel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r0 = setMax
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r4 = r8
            r3 = 0
            r8 = r7
            goto L_0x002c
        L_0x0017:
            r3 = 0
        L_0x0018:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x0025
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0025:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + -2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.promoquest.activity.MissionDetailActivity.length(int, int, byte):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.layout_mission_detail;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(-252855238, oncanceled);
        onCancelLoad.getMin(-252855238, oncanceled);
        return R.layout.layout_mission_detail;
    }

    public static final /* synthetic */ MissionModel access$getMissionModel$p(MissionDetailActivity missionDetailActivity) {
        MissionModel missionModel = missionDetailActivity.toIntRange;
        if (missionModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        return missionModel;
    }

    public static final /* synthetic */ UrlMapExtension.getMin access$getRedeemQuestListener$p(MissionDetailActivity missionDetailActivity) {
        UrlMapExtension.getMin getmin = missionDetailActivity.equals;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("redeemQuestListener");
        }
        return getmin;
    }

    public static final /* synthetic */ UrlMapExtension.length access$getTrackListener$p(MissionDetailActivity missionDetailActivity) {
        UrlMapExtension.length length2 = missionDetailActivity.getMin;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackListener");
        }
        return length2;
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
        int length3;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min, 32);
            onCancelLoad.setMax(-150810539, oncanceled);
            onCancelLoad.getMin(-150810539, oncanceled);
        }
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.readLinkPropertiesPresenter = length2;
    }

    @NotNull
    public final getWorkerFactory.setMax getTrackPresenter() {
        getWorkerFactory.setMax setmax = this.trackPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackPresenter");
        }
        return setmax;
    }

    public final void setTrackPresenter(@NotNull getWorkerFactory.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.trackPresenter = setmax;
    }

    @NotNull
    public final RxWorker.setMin getRedeemQuestPresenter() {
        RxWorker.setMin setmin = this.redeemQuestPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("redeemQuestPresenter");
        }
        return setmin;
    }

    public final void setRedeemQuestPresenter(@NotNull RxWorker.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.redeemQuestPresenter = setmin;
    }

    @NotNull
    public final setForegroundAsync.getMin getMissionPresenter() {
        setForegroundAsync.getMin getmin = this.missionPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionPresenter");
        }
        return getmin;
    }

    public final void setMissionPresenter(@NotNull setForegroundAsync.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.missionPresenter = getmin;
    }

    @NotNull
    public final isUsed.length getRedeemMissionPresenter() {
        isUsed.length length2 = this.redeemMissionPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("redeemMissionPresenter");
        }
        return length2;
    }

    public final void setRedeemMissionPresenter(@NotNull isUsed.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.redeemMissionPresenter = length2;
    }

    @NotNull
    public final getShortName getDynamicUrlWrapper() {
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        return getshortname;
    }

    public final void setDynamicUrlWrapper(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "<set-?>");
        this.dynamicUrlWrapper = getshortname;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte[] bArr = setMax;
        byte b = (byte) bArr[96];
        String length4 = length((short) bArr[85], b, (byte) b);
        byte b2 = (byte) setMax[8];
        String length5 = length(174, b2, (byte) b2);
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
            onCancelLoad.setMax(913250392, oncanceled);
            onCancelLoad.getMin(913250392, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(913250392, oncanceled2);
            onCancelLoad.getMin(913250392, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(913250392, oncanceled3);
            onCancelLoad.getMin(913250392, oncanceled3);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        startBeaconDiscovery.length(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/promoquest/activity/MissionDetailActivity$setupViews$1$1"}, k = 3, mv = {1, 4, 2})
    static final class values implements View.OnClickListener {
        final /* synthetic */ MissionDetailActivity setMax;

        values(MissionDetailActivity missionDetailActivity) {
            this.setMax = missionDetailActivity;
        }

        public final void onClick(View view) {
            this.setMax.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f3, code lost:
        if (r3.equals("FINISH") != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0124, code lost:
        if (r3.equals("COMPLETE") != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0126, code lost:
        ((android.widget.ImageView) _$_findCachedViewById(o.resetInternal.setMax.setTintList)).setImageResource(id.dana.R.drawable.ic_promo_quest_mission_completed);
        r0.setText(r0.getResources().getString(id.dana.R.string.mission_completed));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r10 = this;
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            java.lang.String r1 = "missionModel"
            if (r0 != 0) goto L_0x0009
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            java.util.Date r0 = r0.length
            r10.length(r0)
            int r0 = o.resetInternal.setMax.addIntentOptions
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "left_button_mission"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r2 = 8
            r0.setVisibility(r2)
            int r0 = o.resetInternal.setMax.setContentInsetStartWithNavigation
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "tv_missiontitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            id.dana.promoquest.model.MissionModel r3 = r10.toIntRange
            if (r3 != 0) goto L_0x0034
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0034:
            java.lang.String r3 = r3.getMax
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            if (r0 != 0) goto L_0x0042
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0042:
            java.util.List<id.dana.promoquest.model.QuestModel> r0 = r0.toIntRange
            int r0 = r0.size()
            int r3 = o.resetInternal.setMax.addChildrenForExpandedActionView
            android.view.View r3 = r10._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = "tv_questtitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.content.res.Resources r4 = r10.getResources()
            r5 = 2131755024(0x7f100010, float:1.9140916E38)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 0
            r7[r9] = r8
            java.lang.String r0 = r4.getQuantityString(r5, r0, r7)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            int r0 = o.resetInternal.setMax.ImmLeaksCleaner
            android.view.View r0 = r10._$_findCachedViewById(r0)
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = (com.google.android.material.appbar.CollapsingToolbarLayout) r0
            id.dana.promoquest.model.MissionModel r3 = r10.toIntRange
            if (r3 != 0) goto L_0x007e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x007e:
            java.lang.String r3 = r3.getMax
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setTitle(r3)
            android.content.Context r3 = r0.getContext()
            r4 = 2131100441(0x7f060319, float:1.7813264E38)
            int r3 = o.IntRange.setMax(r3, r4)
            r0.setExpandedTitleColor(r3)
            android.content.Context r3 = r0.getContext()
            r4 = 2131100430(0x7f06030e, float:1.7813241E38)
            int r3 = o.IntRange.setMax(r3, r4)
            r0.setCollapsedTitleTextColor((int) r3)
            int r0 = o.resetInternal.setMax.onLevelChange
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            o.setHorizontalGap r3 = com.bumptech.glide.Glide.setMin((android.view.View) r3)
            o.updateCornerMarking r3 = (o.updateCornerMarking) r3
            id.dana.promoquest.model.MissionModel r4 = r10.toIntRange
            if (r4 != 0) goto L_0x00b9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00b9:
            java.lang.String r4 = r4.IsOverlapping
            o.updateMessageMenuItem r3 = r3.setMax((java.lang.String) r4)
            r4 = 2131231051(0x7f08014b, float:1.8078172E38)
            o.updateMessageMenuItem r3 = r3.setMax((int) r4)
            o.updateMessageMenuItem r3 = r3.setMin((int) r4)
            r3.length((android.widget.ImageView) r0)
            int r0 = o.resetInternal.setMax.getContentInsetRight
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            id.dana.promoquest.model.MissionModel r3 = r10.toIntRange
            if (r3 != 0) goto L_0x00dc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00dc:
            java.lang.String r3 = r3.getMin
            java.lang.String r4 = "FINISH"
            java.lang.String r5 = "COMPLETE"
            if (r3 != 0) goto L_0x00e6
            goto L_0x016b
        L_0x00e6:
            int r7 = r3.hashCode()
            switch(r7) {
                case 64218584: goto L_0x0145;
                case 183181625: goto L_0x0120;
                case 1925346054: goto L_0x00f6;
                case 2073854099: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x016b
        L_0x00ef:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x016b
            goto L_0x0126
        L_0x00f6:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x016b
            int r0 = o.resetInternal.setMax.setTintList
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3 = 2131232213(0x7f0805d5, float:1.8080529E38)
            r0.setImageResource(r3)
            java.util.Date r0 = new java.util.Date
            java.util.Date r3 = r10.toDoubleRange
            if (r3 == 0) goto L_0x0117
            long r7 = r3.getTime()
            goto L_0x0119
        L_0x0117:
            r7 = 0
        L_0x0119:
            r0.<init>(r7)
            r10.length(r0)
            goto L_0x016b
        L_0x0120:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x016b
        L_0x0126:
            int r3 = o.resetInternal.setMax.setTintList
            android.view.View r3 = r10._$_findCachedViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r7 = 2131232214(0x7f0805d6, float:1.808053E38)
            r3.setImageResource(r7)
            android.content.res.Resources r3 = r0.getResources()
            r7 = 2131887976(0x7f120768, float:1.9410574E38)
            java.lang.String r3 = r3.getString(r7)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            goto L_0x016b
        L_0x0145:
            java.lang.String r7 = "CLOSE"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x016b
            int r3 = o.resetInternal.setMax.setTintList
            android.view.View r3 = r10._$_findCachedViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r7 = 2131232215(0x7f0805d7, float:1.8080533E38)
            r3.setImageResource(r7)
            android.content.res.Resources r3 = r0.getResources()
            r7 = 2131887978(0x7f12076a, float:1.9410578E38)
            java.lang.String r3 = r3.getString(r7)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x016b:
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            if (r0 != 0) goto L_0x0172
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0172:
            boolean r0 = r0.setMin()
            int r3 = o.resetInternal.setMax.AppCompatCheckBox
            android.view.View r3 = r10._$_findCachedViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            java.lang.String r7 = "rv_missionprize"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            if (r0 == 0) goto L_0x0187
            r7 = 0
            goto L_0x0189
        L_0x0187:
            r7 = 8
        L_0x0189:
            r3.setVisibility(r7)
            if (r0 == 0) goto L_0x0265
            int r0 = o.resetInternal.setMax.getContentInsetStartWithNavigation
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "tv_missionprize_description"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            id.dana.promoquest.model.MissionModel r3 = r10.toIntRange
            if (r3 != 0) goto L_0x01a2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01a2:
            java.lang.String r3 = r3.getMax
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            int r0 = o.resetInternal.setMax.getContentInsetLeft
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "tv_missionprize_subdescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            id.dana.promoquest.model.MissionModel r3 = r10.toIntRange
            if (r3 != 0) goto L_0x01bd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01bd:
            java.lang.String r3 = r3.setMin
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            int r0 = o.resetInternal.setMax.remove
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r3 = "vg_missiondetail_action"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r0.setVisibility(r2)
            int r0 = o.resetInternal.setMax.ITrustedWebActivityService$Stub
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r2 = "btn_missionprize_action"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r0.setEnabled(r6)
            int r0 = o.resetInternal.setMax.ITrustedWebActivityService$Stub
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            id.dana.promoquest.activity.MissionDetailActivity$equals r2 = new id.dana.promoquest.activity.MissionDetailActivity$equals
            r2.<init>(r10)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            if (r0 != 0) goto L_0x01fd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01fd:
            java.lang.String r0 = r0.getMin
            if (r0 != 0) goto L_0x0202
            goto L_0x0257
        L_0x0202:
            int r2 = r0.hashCode()
            r7 = 183181625(0xaeb2139, float:2.2642174E-32)
            if (r2 == r7) goto L_0x0226
            r3 = 2073854099(0x7b9c8093, float:1.6252122E36)
            if (r2 == r3) goto L_0x0211
            goto L_0x0257
        L_0x0211:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0257
            int r0 = o.resetInternal.setMax.isAutoMirrored
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131232208(0x7f0805d0, float:1.8080519E38)
            r0.setImageResource(r2)
            goto L_0x0265
        L_0x0226:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0257
            int r0 = o.resetInternal.setMax.isAutoMirrored
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131232211(0x7f0805d3, float:1.8080525E38)
            r0.setImageResource(r2)
            int r0 = o.resetInternal.setMax.ITrustedWebActivityService$Stub
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r2 = 2131888488(0x7f120968, float:1.9411613E38)
            r0.setText(r2)
            int r0 = o.resetInternal.setMax.remove
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r0.setVisibility(r9)
            goto L_0x0265
        L_0x0257:
            int r0 = o.resetInternal.setMax.isAutoMirrored
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131232210(0x7f0805d2, float:1.8080523E38)
            r0.setImageResource(r2)
        L_0x0265:
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            if (r0 != 0) goto L_0x026c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x026c:
            java.lang.String r0 = r0.setMax
            if (r0 == 0) goto L_0x0292
            java.lang.String r2 = "REFERRAL_MISSION_ID"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x027c
            r10.setMin(r6, r6)
            goto L_0x0292
        L_0x027c:
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            if (r0 != 0) goto L_0x0283
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0283:
            java.lang.String r0 = r0.equals
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x028e
            goto L_0x028f
        L_0x028e:
            r6 = 0
        L_0x028f:
            r10.setMin(r6, r9)
        L_0x0292:
            id.dana.promoquest.model.MissionModel r0 = r10.toIntRange
            if (r0 != 0) goto L_0x0299
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0299:
            java.util.List<id.dana.promoquest.model.QuestModel> r0 = r0.toIntRange
            android.content.Context r1 = r10.getBaseContext()
            r2 = 0
            if (r1 == 0) goto L_0x02a7
            android.content.Context r1 = r1.getApplicationContext()
            goto L_0x02a8
        L_0x02a7:
            r1 = r2
        L_0x02a8:
            if (r1 == 0) goto L_0x02c0
            r3 = 478689059(0x1c883723, float:9.013978E-22)
            int r1 = o.dispatchOnCancelled.getMax(r1, r3)
            if (r3 == r1) goto L_0x02c0
            o.onCanceled r4 = new o.onCanceled
            r5 = 512(0x200, float:7.175E-43)
            r4.<init>(r3, r1, r5)
            o.onCancelLoad.setMax(r3, r4)
            o.onCancelLoad.getMin(r3, r4)
        L_0x02c0:
            o.onDetachedFromLayoutParams r1 = r10.isInside
            if (r1 == 0) goto L_0x02c7
            r1.length()
        L_0x02c7:
            r10.isInside = r2
            o.encodeImageBytesToString r1 = r10.FastBitmap$CoordinateSystem
            if (r1 == 0) goto L_0x02d0
            r1.getMin(r0)
        L_0x02d0:
            r10.getMax(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.promoquest.activity.MissionDetailActivity.setMax():void");
    }

    private final void length(Date date) {
        this.toDoubleRange = date;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetRight);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_missiontime");
        textView.setText(getMin(date));
    }

    private final String getMin(Date date) {
        String str;
        int max = (int) ConfirmPopup.AnonymousClass1.setMax(date);
        if (max > 0) {
            String quantityString = getResources().getQuantityString(R.plurals.f75212131755010, max, new Object[]{Integer.valueOf(max)});
            Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…ires_in_days, days, days)");
            return quantityString;
        }
        if (date == null) {
            date = new Date();
        }
        long convert = TimeUnit.HOURS.convert(date.getTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        int i = convert <= 0 ? -1 : (int) convert;
        if (i > 0) {
            str = getResources().getQuantityString(R.plurals.f75222131755011, i, new Object[]{Integer.valueOf(i)});
        } else if (i >= 0) {
            str = getResources().getString(R.string.expiring_soon);
        } else {
            str = getResources().getString(R.string.mission_expired);
        }
        Intrinsics.checkNotNullExpressionValue(str, "when {\n                h…on_expired)\n            }");
        return str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ MissionDetailActivity setMax;

        equals(MissionDetailActivity missionDetailActivity) {
            this.setMax = missionDetailActivity;
        }

        public final void onClick(View view) {
            isUsed.length redeemMissionPresenter = this.setMax.getRedeemMissionPresenter();
            String str = MissionDetailActivity.access$getMissionModel$p(this.setMax).setMax;
            if (str != null) {
                redeemMissionPresenter.length(str);
            }
        }
    }

    private final void setMin(boolean z, boolean z2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.AppCompatCheckedTextView);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "rv_missiontnc");
        int i = 8;
        constraintLayout.setVisibility(z ? 0 : 8);
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onCustomTabsServiceConnected);
        if (textView != null) {
            MissionModel missionModel = this.toIntRange;
            if (missionModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionModel");
            }
            if (!(missionModel.equals.length() > 0)) {
                textView = null;
            }
            if (textView != null) {
                textView.setVisibility(0);
                MissionModel missionModel2 = this.toIntRange;
                if (missionModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("missionModel");
                }
                textView.setText(ActionBar$LayoutParams.length(missionModel2.equals, 0).toString());
                return;
            }
        }
        MissionDetailActivity missionDetailActivity = this;
        Button button = (Button) missionDetailActivity._$_findCachedViewById(resetInternal.setMax.notifyNotificationWithChannel);
        Intrinsics.checkNotNullExpressionValue(button, "btn_mission_tnc");
        View view = button;
        if (z2) {
            i = 0;
        }
        view.setVisibility(i);
        if (z2) {
            ((Button) missionDetailActivity._$_findCachedViewById(resetInternal.setMax.notifyNotificationWithChannel)).setOnClickListener(new hashCode(missionDetailActivity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ MissionDetailActivity length;

        hashCode(MissionDetailActivity missionDetailActivity) {
            this.length = missionDetailActivity;
        }

        public final void onClick(View view) {
            this.length.getMissionPresenter().getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$getQuestActionListener$1", "Lid/dana/promoquest/PromoQuestListener$QuestAction;", "redeemQuest", "", "questId", "", "position", "", "redeemResult", "Lid/dana/promoquest/PromoQuestListener$RedeemQuestResult;", "trackUserQuest", "hasPrize", "", "resultListener", "Lid/dana/promoquest/PromoQuestListener$TrackQuestResultListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements UrlMapExtension.getMax {
        final /* synthetic */ MissionDetailActivity setMax;

        setMax(MissionDetailActivity missionDetailActivity) {
            this.setMax = missionDetailActivity;
        }

        public final void setMin(@NotNull String str, boolean z, @Nullable UrlMapExtension.length length) {
            Intrinsics.checkNotNullParameter(str, "questId");
            this.setMax.getMin = length;
            getWorkerFactory.setMax trackPresenter = this.setMax.getTrackPresenter();
            String str2 = MissionDetailActivity.access$getMissionModel$p(this.setMax).setMax;
            if (str2 != null) {
                trackPresenter.getMax(str2, str, z);
            }
        }

        public final void length(@NotNull String str, int i, @Nullable UrlMapExtension.getMin getmin) {
            Intrinsics.checkNotNullParameter(str, "questId");
            this.setMax.equals = getmin;
            this.setMax.IsOverlapping = i;
            RxWorker.setMin redeemQuestPresenter = this.setMax.getRedeemQuestPresenter();
            String str2 = MissionDetailActivity.access$getMissionModel$p(this.setMax).setMax;
            if (str2 != null) {
                redeemQuestPresenter.length(str2, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "startDeepLinkAction"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements checkFilePath {
        final /* synthetic */ MissionDetailActivity getMax;

        getMin(MissionDetailActivity missionDetailActivity) {
            this.getMax = missionDetailActivity;
        }

        public final void getMin(String str) {
            getDuration.length readLinkPropertiesPresenter = this.getMax.getReadLinkPropertiesPresenter();
            Intrinsics.checkNotNullExpressionValue(str, "it");
            readLinkPropertiesPresenter.setMax(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$getRedeemQuestListener$1", "Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;", "onSuccessRedeem", "", "questId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements encodeImageBytesToString.getMin {
        final /* synthetic */ MissionDetailActivity setMin;

        getMax(MissionDetailActivity missionDetailActivity) {
            this.setMin = missionDetailActivity;
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "questId");
            MissionDetailActivity.access$updateCurrentQuest(this.setMin, str, "FINISH");
            this.setMin.length();
            MissionDetailActivity.access$broadcastMission(this.setMin, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$injectComponent$1", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements style.getMin {
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

        IsOverlapping() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$getMissionModule$1", "Lid/dana/contract/promoquest/quest/MissionContract$View;", "dismissProgress", "", "onGetMissionFail", "onGetMissionSuccess", "missionModel", "Lid/dana/promoquest/model/MissionModel;", "onGetTnCReferralMission", "tncLink", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setForegroundAsync.length {
        final /* synthetic */ MissionDetailActivity setMax;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        setMin(MissionDetailActivity missionDetailActivity) {
            this.setMax = missionDetailActivity;
        }

        public final void getMin(@NotNull MissionModel missionModel) {
            Intrinsics.checkNotNullParameter(missionModel, "missionModel");
            this.setMax.toIntRange = missionModel;
            CharSequence charSequence = missionModel.setMax;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                Collection collection = missionModel.toIntRange;
                if (!(collection == null || collection.isEmpty())) {
                    z = true;
                }
            }
            if (!z) {
                missionModel = null;
            }
            this.setMax.setMax();
            if (missionModel == null) {
                this.setMax.finish();
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void getMin() {
            this.setMax.finish();
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "tncLink");
            DanaH5.startContainerFullUrl(str);
        }

        public final void showProgress() {
            this.setMax.setMin();
        }

        public final void dismissProgress() {
            MissionDetailActivity.access$hideSkeleton(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isSuccessClaimed;
        final /* synthetic */ GriverAMCSAppUpdater $prize;
        final /* synthetic */ MissionDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(MissionDetailActivity missionDetailActivity, boolean z, GriverAMCSAppUpdater griverAMCSAppUpdater) {
            super(0);
            this.this$0 = missionDetailActivity;
            this.$isSuccessClaimed = z;
            this.$prize = griverAMCSAppUpdater;
        }

        public final void invoke() {
            if (this.$isSuccessClaimed) {
                GriverAMCSAppUpdater griverAMCSAppUpdater = this.$prize;
                if (griverAMCSAppUpdater != null) {
                    ImageBridgeExtension.AnonymousClass1.setMax(griverAMCSAppUpdater, this.this$0.getDynamicUrlWrapper());
                    return;
                }
                return;
            }
            MissionDetailActivity missionDetailActivity = this.this$0;
            String string = missionDetailActivity.getString(R.string.customer_support_email);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_support_email)");
            getLineColor.length(missionDetailActivity, new String[]{string});
        }
    }

    private final void getMax(List<QuestModel> list) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (Intrinsics.areEqual((Object) ((QuestModel) next).getMax, (Object) "ACTIVE")) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        convertDipToPx.length length2 = new convertDipToPx.length(this);
        length2.getMax = TrackerKey.Event.PROMO_QUEST_DETAILS_OPEN;
        MissionModel missionModel = this.toIntRange;
        if (missionModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.PROMO_QUEST_NAME, missionModel.getMax).getMax(TrackerKey.Property.NUMBER_OF_UNCOMPLETED_TASKS, list2.size());
        max.setMin();
        genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1854908575, oncanceled);
            onCancelLoad.getMin(-1854908575, oncanceled);
        }
        convertDipToPx.length length3 = new convertDipToPx.length(this);
        length3.getMax = TrackerKey.Event.PROMO_QUEST_FINISH;
        MissionModel missionModel = this.toIntRange;
        if (missionModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        convertDipToPx.length max = length3.setMax(TrackerKey.PromoQuestProperties.MISSION_ID, missionModel.setMax);
        MissionModel missionModel2 = this.toIntRange;
        if (missionModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        convertDipToPx.length max2 = max.setMax(TrackerKey.PromoQuestProperties.MISSION_TITLE, missionModel2.getMax);
        max2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max2, (byte) 0);
        List length4 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements View.OnLayoutChangeListener {
        final /* synthetic */ MissionDetailActivity getMin;

        toDoubleRange(MissionDetailActivity missionDetailActivity) {
            this.getMin = missionDetailActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.ImmLeaksCleaner);
            Intrinsics.checkNotNullExpressionValue(collapsingToolbarLayout, "collapsing_toolbar_missiondetail");
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
            if (layoutParams != null) {
                AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
                layoutParams2.setScrollFlags(this.getMin.getMin() ? 0 : 3);
                CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.ImmLeaksCleaner);
                Intrinsics.checkNotNullExpressionValue(collapsingToolbarLayout2, "collapsing_toolbar_missiondetail");
                collapsingToolbarLayout2.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMin() {
        Rect rect = new Rect();
        ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.getSubtitle)).getDrawingRect(rect);
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(resetInternal.setMax.getSubtitle);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nsv_mission_detail");
        float y = nestedScrollView.getY();
        NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(resetInternal.setMax.getSubtitle);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "nsv_mission_detail");
        return ((float) rect.top) <= y && ((float) rect.bottom) >= ((float) nestedScrollView2.getHeight()) + y;
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setImageBitmap));
        getmax.length = this.FastBitmap$CoordinateSystem;
        getmax.getMax = R.layout.view_quest_skeleton;
        getmax.IsOverlapping = 1500;
        getmax.setMin = 3;
        getmax.getMin = true;
        getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
        getmax.toIntRange = 0;
        getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
        getscrimcolor.getMin();
        this.isInside = getscrimcolor;
    }

    /* access modifiers changed from: private */
    public final void length() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1339515239 == (max = dispatchOnCancelled.getMax(applicationContext, 1339515239)))) {
            onCanceled oncanceled = new onCanceled(1339515239, max, 512);
            onCancelLoad.setMax(1339515239, oncanceled);
            onCancelLoad.getMin(1339515239, oncanceled);
        }
        MissionModel missionModel = this.toIntRange;
        if (missionModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        String str = missionModel.setMax;
        if (str != null) {
            setMin();
            setForegroundAsync.getMin getmin = this.missionPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionPresenter");
            }
            getmin.setMin(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$getRedeemQuestModule$1", "Lid/dana/contract/promoquest/redeem/RedeemQuestContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onRedeemQuestFailed", "onRedeemQuestSuccess", "prize", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements RxWorker.getMin {
        final /* synthetic */ MissionDetailActivity getMin;

        isInside(MissionDetailActivity missionDetailActivity) {
            this.getMin = missionDetailActivity;
        }

        public final void length(@NotNull GriverAMCSAppUpdater griverAMCSAppUpdater) {
            Intrinsics.checkNotNullParameter(griverAMCSAppUpdater, "prize");
            MissionDetailActivity.access$getRedeemQuestListener$p(this.getMin).setMin();
            new ImageBridgeExtension.CheckFilePathResult(true, new toString(this.getMin, true, griverAMCSAppUpdater)).show(this.getMin.getSupportFragmentManager(), "PromoQuestRewardDialogFragment");
        }

        public final void getMax() {
            new ImageBridgeExtension.CheckFilePathResult(false, new toString(this.getMin, false, (GriverAMCSAppUpdater) null)).show(this.getMin.getSupportFragmentManager(), "PromoQuestRewardDialogFragment");
            MissionDetailActivity.access$getRedeemQuestListener$p(this.getMin).getMin();
        }

        public final void showProgress() {
            UrlMapExtension.setMin unused = this.getMin.toFloatRange;
        }

        public final void dismissProgress() {
            UrlMapExtension.setMin unused = this.getMin.toFloatRange;
        }

        public final void onError(@Nullable String str) {
            UrlMapExtension.setMin unused = this.getMin.toFloatRange;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$getRedeemUserMissionModule$1", "Lid/dana/contract/promoquest/redeem/RedeemMissionContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onRedeemMissionFailed", "onRedeemMissionSuccess", "prize", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements isUsed.getMax {
        final /* synthetic */ MissionDetailActivity getMax;

        toIntRange(MissionDetailActivity missionDetailActivity) {
            this.getMax = missionDetailActivity;
        }

        public final void getMin(@NotNull GriverAMCSAppUpdater griverAMCSAppUpdater) {
            Intrinsics.checkNotNullParameter(griverAMCSAppUpdater, "prize");
            Button button = (Button) this.getMax._$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityService$Stub);
            if (button != null) {
                button.setVisibility(8);
            }
            ((ImageView) this.getMax._$_findCachedViewById(resetInternal.setMax.isAutoMirrored)).setImageResource(R.drawable.ic_promo_quest_item_claimed);
            new ImageBridgeExtension.CheckFilePathResult(true, new toString(this.getMax, true, griverAMCSAppUpdater)).show(this.getMax.getSupportFragmentManager(), "PromoQuestRewardDialogFragment");
            this.getMax.getMax();
            MissionDetailActivity.access$broadcastMission(this.getMax, true);
        }

        public final void setMin() {
            new ImageBridgeExtension.CheckFilePathResult(false, new toString(this.getMax, false, (GriverAMCSAppUpdater) null)).show(this.getMax.getSupportFragmentManager(), "PromoQuestRewardDialogFragment");
            MissionDetailActivity.access$getRedeemQuestListener$p(this.getMax).getMin();
        }

        public final void showProgress() {
            UrlMapExtension.setMin unused = this.getMax.toFloatRange;
        }

        public final void dismissProgress() {
            UrlMapExtension.setMin unused = this.getMax.toFloatRange;
        }

        public final void onError(@Nullable String str) {
            UrlMapExtension.setMin unused = this.getMax.toFloatRange;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"id/dana/promoquest/activity/MissionDetailActivity$getTrackModule$1", "Lid/dana/contract/promoquest/track/TrackQuestContract$View;", "goToActionHandler", "", "redirectType", "", "redirectValue", "onError", "errorMessage", "onTrackUserQuestFailed", "showRedeemButton", "hasPrize", "", "questId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements getWorkerFactory.length {
        final /* synthetic */ MissionDetailActivity setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        toFloatRange(MissionDetailActivity missionDetailActivity) {
            this.setMin = missionDetailActivity;
        }

        public final void getMin(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "questId");
            if (z) {
                MissionDetailActivity.access$getTrackListener$p(this.setMin).setMin();
                MissionDetailActivity.access$updateCurrentQuest(this.setMin, str, "COMPLETE");
                return;
            }
            MissionDetailActivity.access$getTrackListener$p(this.setMin).setMax();
            MissionDetailActivity.access$updateCurrentQuest(this.setMin, str, "FINISH");
            this.setMin.length();
        }

        public final void getMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "redirectType");
            Intrinsics.checkNotNullParameter(str2, "redirectValue");
            loadLocalImageInternal access$getPromoQuestActionFactory$p = this.setMin.values;
            if (access$getPromoQuestActionFactory$p != null) {
                access$getPromoQuestActionFactory$p.getMin(str, str2).getMin();
            }
            MissionDetailActivity.access$getTrackListener$p(this.setMin).getMax();
        }

        public final void setMax() {
            UrlMapExtension.length access$getTrackListener$p = MissionDetailActivity.access$getTrackListener$p(this.setMin);
            this.setMin.getBaseContext().getString(R.string.general_error_msg);
            access$getTrackListener$p.getMin();
        }

        public final void onError(@Nullable String str) {
            this.setMin.showWarningDialog(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/promoquest/activity/MissionDetailActivity$Companion;", "", "()V", "APP_BAR_NO_FLAG", "", "MISSION_KEY", "", "REFERRAL_MISSION_ID", "SKELETON_DURATION", "generateIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "mission", "Lid/dana/promoquest/model/MissionModel;", "open", "", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent setMin(@NotNull Context context, @NotNull MissionModel missionModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(missionModel, "mission");
            Intent intent = new Intent(context, MissionDetailActivity.class);
            intent.putExtra("MissionDetail.mission", missionModel);
            return intent;
        }
    }

    public final void init() {
        int length2;
        int min;
        int length3;
        int min2;
        Context baseContext = getBaseContext();
        MissionModel missionModel = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(613344895, oncanceled);
            onCancelLoad.getMin(613344895, oncanceled);
        }
        boolean z = false;
        AppxResourcePackage.setMax setmax = new AppxResourcePackage.setMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmax.toString = applicationComponent;
            setmax.length = new MissionModule(new setMin(this));
            setmax.setMin = new RedeemQuestModule(new isInside(this));
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
                onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(301857111, oncanceled2);
                onCancelLoad.getMin(301857111, oncanceled2);
            }
            setmax.equals = new RedeemUserMissionModule(new toIntRange(this));
            setmax.setMax = new TrackQuestModule(new toFloatRange(this));
            setmax.IsOverlapping = new ServicesModule((style.getMin) new IsOverlapping());
            setmax.getMax = new DeepLinkModule(DeepLinkModule.getMax(), (byte) 0);
            ScanQrModule.setMin max = ScanQrModule.getMax();
            Activity activity = this;
            max.setMin = activity;
            setmax.getMin = new ScanQrModule(max, (byte) 0);
            RestoreUrlModule.setMin min3 = RestoreUrlModule.setMin();
            min3.getMax = activity;
            setmax.toIntRange = new RestoreUrlModule(min3, (byte) 0);
            FeatureModule.length length4 = FeatureModule.length();
            length4.setMax = activity;
            setmax.toFloatRange = new FeatureModule(length4, (byte) 0);
            OauthModule.getMax min4 = OauthModule.setMin();
            min4.setMin = activity;
            setmax.isInside = new OauthModule(min4, (byte) 0);
            stopIgnoring.setMin(setmax.length, MissionModule.class);
            stopIgnoring.setMin(setmax.setMin, RedeemQuestModule.class);
            stopIgnoring.setMin(setmax.setMax, TrackQuestModule.class);
            stopIgnoring.setMin(setmax.getMax, DeepLinkModule.class);
            stopIgnoring.setMin(setmax.getMin, ScanQrModule.class);
            stopIgnoring.setMin(setmax.toIntRange, RestoreUrlModule.class);
            stopIgnoring.setMin(setmax.toFloatRange, FeatureModule.class);
            stopIgnoring.setMin(setmax.isInside, OauthModule.class);
            if (setmax.IsOverlapping == null) {
                setmax.IsOverlapping = new ServicesModule();
            }
            stopIgnoring.setMin(setmax.equals, RedeemUserMissionModule.class);
            stopIgnoring.setMin(setmax.toString, PrepareException.AnonymousClass1.class);
            new AppxResourcePackage(setmax.length, setmax.setMin, setmax.setMax, setmax.getMax, setmax.getMin, setmax.toIntRange, setmax.toFloatRange, setmax.isInside, setmax.IsOverlapping, setmax.equals, setmax.toString, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[4];
            RxWorker.setMin setmin = this.redeemQuestPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("redeemQuestPresenter");
            }
            getminArr[0] = setmin;
            getWorkerFactory.setMax setmax2 = this.trackPresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackPresenter");
            }
            getminArr[1] = setmax2;
            getDuration.length length5 = this.readLinkPropertiesPresenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
            }
            getminArr[2] = length5;
            setForegroundAsync.getMin getmin = this.missionPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionPresenter");
            }
            getminArr[3] = getmin;
            registerPresenter(getminArr);
            Parcelable parcelableExtra = getIntent().getParcelableExtra("MissionDetail.mission");
            Intrinsics.checkNotNull(parcelableExtra);
            this.toIntRange = (MissionModel) parcelableExtra;
            Context baseContext3 = getBaseContext();
            checkFilePath getmin2 = new getMin(this);
            getShortName getshortname = this.dynamicUrlWrapper;
            if (getshortname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
            }
            this.values = new loadLocalImageInternal(baseContext3, getmin2, getshortname);
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(972697366, oncanceled3);
                onCancelLoad.getMin(972697366, oncanceled3);
            }
            AppBarLayout appBarLayout = (AppBarLayout) _$_findCachedViewById(resetInternal.setMax.getMax);
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "appbarlayout_missiondetail");
            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams != null) {
                    AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
                    behavior.setDragCallback(new MissionDetailActivity$FastBitmap$CoordinateSystem());
                    ((CoordinatorLayout.length) layoutParams).getMax(behavior);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                }
            }
            ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.getSubtitle)).addOnLayoutChangeListener(new toDoubleRange(this));
            Context baseContext4 = getBaseContext();
            checkFilePath getmin3 = new getMin(this);
            getShortName getshortname2 = this.dynamicUrlWrapper;
            if (getshortname2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
            }
            loadLocalImageInternal loadlocalimageinternal = new loadLocalImageInternal(baseContext4, getmin3, getshortname2);
            int max3 = dispatchOnCancelled.getMax(0);
            if (max3 != 0) {
                onCanceled oncanceled4 = new onCanceled(0, max3, 16);
                onCancelLoad.setMax(1828972070, oncanceled4);
                onCancelLoad.getMin(1828972070, oncanceled4);
            }
            UrlMapExtension.getMax setmax3 = new setMax(this);
            int max4 = dispatchOnCancelled.getMax(0);
            if (max4 != 0) {
                onCanceled oncanceled5 = new onCanceled(0, max4, 16);
                onCancelLoad.setMax(1029712205, oncanceled5);
                onCancelLoad.getMin(1029712205, oncanceled5);
            }
            encodeImageBytesToString.getMin getmax = new getMax(this);
            MissionModel missionModel2 = this.toIntRange;
            if (missionModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionModel");
            }
            this.FastBitmap$CoordinateSystem = new encodeImageBytesToString(loadlocalimageinternal, setmax3, getmax, missionModel2.setMax());
            Toolbar toolbar = (Toolbar) _$_findCachedViewById(resetInternal.setMax.setSelector);
            toolbar.setNavigationIcon((int) R.drawable.arrow_left_white);
            toolbar.setNavigationOnClickListener(new values(this));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setImageBitmap);
            recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
            recyclerView.addItemDecoration(new setShadowResourceRight(getBaseContext(), R.dimen.f26272131165275));
            recyclerView.setAdapter(this.FastBitmap$CoordinateSystem);
            MissionModel missionModel3 = this.toIntRange;
            if (missionModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionModel");
            }
            CharSequence charSequence = missionModel3.setMax;
            if (charSequence == null || charSequence.length() == 0) {
                finish();
            }
            MissionModel missionModel4 = this.toIntRange;
            if (missionModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionModel");
            }
            Collection collection = missionModel4.toIntRange;
            if (collection == null || collection.isEmpty()) {
                z = true;
            }
            if (!z) {
                missionModel = missionModel4;
            }
            setMax();
            if (missionModel == null) {
                length();
                Unit unit = Unit.INSTANCE;
                return;
            }
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$updateCurrentQuest(MissionDetailActivity missionDetailActivity, String str, String str2) {
        List max;
        encodeImageBytesToString encodeimagebytestostring = missionDetailActivity.FastBitmap$CoordinateSystem;
        if (!(encodeimagebytestostring == null || (max = encodeimagebytestostring.getMax()) == null)) {
            int i = 0;
            for (Object next : max) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                QuestModel questModel = (QuestModel) next;
                if (Intrinsics.areEqual((Object) questModel.getMin, (Object) str)) {
                    questModel.getMax = str2;
                    encodeImageBytesToString encodeimagebytestostring2 = missionDetailActivity.FastBitmap$CoordinateSystem;
                    if (encodeimagebytestostring2 != null) {
                        encodeimagebytestostring2.notifyItemChanged(i);
                    }
                }
                i = i2;
            }
        }
        encodeImageBytesToString encodeimagebytestostring3 = missionDetailActivity.FastBitmap$CoordinateSystem;
        List max2 = encodeimagebytestostring3 != null ? encodeimagebytestostring3.getMax() : null;
        if (max2 == null) {
            max2 = CollectionsKt.emptyList();
        }
        int max3 = dispatchOnCancelled.getMax(0);
        if (max3 != 0) {
            onCanceled oncanceled = new onCanceled(0, max3, 16);
            onCancelLoad.setMax(-679074218, oncanceled);
            onCancelLoad.getMin(-679074218, oncanceled);
        }
        Collection arrayList = new ArrayList();
        for (Object next2 : max2) {
            QuestModel questModel2 = (QuestModel) next2;
            if (Intrinsics.areEqual((Object) questModel2.getMax, (Object) "ACTIVE") || Intrinsics.areEqual((Object) questModel2.getMax, (Object) "COMPLETE")) {
                arrayList.add(next2);
            }
        }
        List list = (List) arrayList;
        MissionModel missionModel = missionDetailActivity.toIntRange;
        if (missionModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        if (!missionModel.setMin() && list.isEmpty()) {
            missionDetailActivity.getMax();
        }
    }

    public static final /* synthetic */ void access$broadcastMission(MissionDetailActivity missionDetailActivity, boolean z) {
        MissionModel missionModel = missionDetailActivity.toIntRange;
        if (missionModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        encodeImageBytesToString encodeimagebytestostring = missionDetailActivity.FastBitmap$CoordinateSystem;
        List<QuestModel> max = encodeimagebytestostring != null ? encodeimagebytestostring.getMax() : null;
        if (max == null) {
            max = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNullParameter(max, "<set-?>");
        missionModel.toIntRange = max;
        restorePresenterStates length2 = restorePresenterStates.length(missionDetailActivity);
        Intent putExtra = new Intent("PromoQuest.RECEIVE_MISSION").putExtra("PromoQuest.isNeedRefreshWholeList", z);
        MissionModel missionModel2 = missionDetailActivity.toIntRange;
        if (missionModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionModel");
        }
        length2.setMin(putExtra.putExtra("PromoQuest.mission", missionModel2));
    }

    public static final /* synthetic */ void access$hideSkeleton(MissionDetailActivity missionDetailActivity) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = missionDetailActivity.isInside;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        missionDetailActivity.isInside = null;
    }

    @JvmStatic
    public static final void open(@NotNull Activity activity, @NotNull MissionModel missionModel) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(missionModel, "mission");
        activity.startActivity(length.setMin(activity, missionModel));
    }
}
