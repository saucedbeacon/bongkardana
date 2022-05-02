package id.dana.requestmoney;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.OnClick;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import id.dana.R;
import id.dana.bank.BankSelectorActivity;
import id.dana.base.ViewPagerBaseActivity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.UserBankModule;
import id.dana.popup.WrapContentHeightViewPager;
import id.dana.requestmoney.balance.RequestMoneyBalanceQrCardFragment;
import id.dana.requestmoney.model.UserBankModel;
import id.dana.sendmoney.model.BankModel;
import id.dana.splitbill.view.SplitBillIntroductionActivity;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.APImageDownloadRsp;
import o.CornerMarkingDataProvider;
import o.FtsOptions$Order;
import o.ImageServiceImpl;
import o.PackageParseUtils;
import o.PrepareException;
import o.access$1402;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getSelectedIndex;
import o.getUseSecurityGuard;
import o.initRect;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.publishImageAction;
import o.resetInternal;
import o.setProgressViewOffset;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 a2\u00020\u0001:\u0001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0002J\"\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u000e\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u000205J\u0012\u00106\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u001fH\u0002J\u0016\u0010<\u001a\u00020\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u0002050>H\u0002J\b\u0010?\u001a\u00020\u0019H\u0007J\b\u0010@\u001a\u00020\u0019H\u0007J\b\u0010A\u001a\u00020\u0019H\u0002J\b\u0010B\u001a\u00020\u0019H\u0002J\b\u0010C\u001a\u00020\u0019H\u0002J\u0010\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020FH\u0002J\u0006\u0010G\u001a\u00020\u0019J\u0016\u0010H\u001a\u00020\u00192\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00140JH\u0002J\b\u0010K\u001a\u00020\u0019H\u0002J\b\u0010L\u001a\u00020\u0019H\u0002J\u0010\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u000205H\u0002J\b\u0010O\u001a\u00020\u0019H\u0002J\b\u0010P\u001a\u00020\u0019H\u0002J\u0006\u0010Q\u001a\u00020\u0019J\u0010\u0010R\u001a\u00020\u00192\u0006\u0010S\u001a\u00020,H\u0002J\u0010\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\u001fH\u0002J\b\u0010V\u001a\u00020\u0019H\u0002J\b\u0010W\u001a\u00020\u0019H\u0002J\u0014\u0010X\u001a\n Z*\u0004\u0018\u00010Y0Y*\u000209H\u0002J\f\u0010[\u001a\u00020!*\u000205H\u0002J\f\u0010\\\u001a\u00020\u0019*\u000209H\u0002J\f\u0010]\u001a\u00020\u0019*\u00020^H\u0002J\u0016\u0010_\u001a\u00020\u0019*\u0004\u0018\u0001092\u0006\u0010`\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006b"}, d2 = {"Lid/dana/requestmoney/RequestMoneyActivity;", "Lid/dana/base/ViewPagerBaseActivity;", "()V", "customSnackbar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "onBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingPresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingPresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "requestMoneyStatePageAdapter", "Lid/dana/requestmoney/adapter/RequestMoneyStatePageAdapter;", "userBankPresenter", "Lid/dana/requestmoney/bank/UserBankContract$Presenter;", "getUserBankPresenter", "()Lid/dana/requestmoney/bank/UserBankContract$Presenter;", "setUserBankPresenter", "(Lid/dana/requestmoney/bank/UserBankContract$Presenter;)V", "addContentOnBoardingInputAmount", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "addContentOnBoardingReceiveToBalance", "addContentOnBoardingReceiveToBank", "addContentOnBoardingRequestMethod", "configToolbar", "", "createShowcaseContent", "Lid/dana/showcase/Content;", "getBottomOnBoardingModule", "Lid/dana/di/modules/BottomSheetOnBoardingModule;", "getLayout", "", "getLimitReachedFormattedWarningText", "", "getOnPageChangeListener", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "getUserBankModule", "Lid/dana/di/modules/UserBankModule;", "init", "initComponent", "initPresenter", "initViewListener", "initViewPager", "isLastPosition", "", "position", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBankDeleted", "deletedBank", "Lid/dana/requestmoney/model/UserBankModel;", "onBankSelectedResult", "onClickRightMenuButton", "view", "Landroid/view/View;", "onGetMaxBankAccount", "maxBankAccount", "onGetSavedUserBank", "userBanks", "", "onSlideLeftClick", "onSlideRightClick", "openAddBankAccount", "openBottomOnBoardingListView", "openBottomOnBoardingPageView", "preFillAmount", "amount", "Lid/dana/sendmoney/Amount;", "refreshSavedUserBank", "setContentOnBoarding", "contentOnBoardingModels", "", "setToolbarAccessibility", "showAddBankSuccessSnackBar", "showDeleteBankSuccessSnackbar", "userBankModel", "showLimitReachedDialog", "showUserBankExistSnackbar", "startAddBankAccountActivity", "toggleAddBankBannerVisibility", "visible", "toggleArrowVisibility", "selectedPagePosition", "trackOpenAddBankAccount", "trackRequestMoneyOpen", "createTarget", "Lid/dana/showcase/target/Target;", "kotlin.jvm.PlatformType", "getDeleteMessage", "launchShowcase", "prepareBundle", "Landroid/os/Bundle;", "setViewAccessibility", "contentDescription", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RequestMoneyActivity extends ViewPagerBaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private static final int getMax = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private static final int toFloatRange = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public ImageServiceImpl getMin;
    private HashMap isInside;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    /* access modifiers changed from: private */
    public setProgressViewOffset setMax;
    @Inject
    public publishImageAction.setMin userBankPresenter;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(1842562978, oncanceled);
            onCancelLoad.getMin(1842562978, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(1842562978, oncanceled2);
            onCancelLoad.getMin(1842562978, oncanceled2);
        }
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_request_money;
    }

    public static final /* synthetic */ setProgressViewOffset access$getCustomSnackbar$p(RequestMoneyActivity requestMoneyActivity) {
        setProgressViewOffset setprogressviewoffset = requestMoneyActivity.setMax;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackbar");
        }
        return setprogressviewoffset;
    }

    public static final /* synthetic */ ImageServiceImpl access$getRequestMoneyStatePageAdapter$p(RequestMoneyActivity requestMoneyActivity) {
        ImageServiceImpl imageServiceImpl = requestMoneyActivity.getMin;
        if (imageServiceImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyStatePageAdapter");
        }
        return imageServiceImpl;
    }

    public static final /* synthetic */ void access$onGetMaxBankAccount(RequestMoneyActivity requestMoneyActivity, int i) {
        int min;
        Context baseContext = requestMoneyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        int i2 = 8;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1544109016, oncanceled);
            onCancelLoad.getMin(-1544109016, oncanceled);
        }
        ImageServiceImpl imageServiceImpl = requestMoneyActivity.getMin;
        if (imageServiceImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyStatePageAdapter");
        }
        imageServiceImpl.getMax = i;
        imageServiceImpl.notifyDataSetChanged();
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) requestMoneyActivity._$_findCachedViewById(resetInternal.setMax.setInterpolatedProgress);
        if (wrapContentHeightViewPager != null) {
            wrapContentHeightViewPager.setOffscreenPageLimit(i + 2);
        }
        boolean z = i > 0;
        View _$_findCachedViewById = requestMoneyActivity._$_findCachedViewById(resetInternal.setMax.sizeOf);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(z ? 0 : 8);
        }
        TextView textView = (TextView) requestMoneyActivity._$_findCachedViewById(resetInternal.setMax.getShowDividers);
        if (textView != null) {
            View view = textView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
        requestMoneyActivity.setMin(requestMoneyActivity.getCurrentPosition());
    }

    @NotNull
    public final publishImageAction.setMin getUserBankPresenter() {
        publishImageAction.setMin setmin = this.userBankPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
        }
        return setmin;
    }

    public final void setUserBankPresenter(@NotNull publishImageAction.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.userBankPresenter = setmin;
    }

    @NotNull
    public final getSelectedIndex.length getOnBoardingPresenter() {
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        return length2;
    }

    public final void setOnBoardingPresenter(@NotNull getSelectedIndex.length length2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(360398711, oncanceled);
            onCancelLoad.getMin(360398711, oncanceled);
        }
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.onBoardingPresenter = length2;
    }

    public final void configToolbar() {
        int length2;
        int min;
        setCenterTitle(getString(R.string.request_money_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
        setMenuRightButton((int) R.drawable.ic_tooltip_help);
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-753126400, oncanceled);
            onCancelLoad.getMin(-753126400, oncanceled);
        }
        Toolbar toolbar = (Toolbar) _$_findCachedViewById(resetInternal.setMax.getFixedHeightMajor);
        if (toolbar != null) {
            toolbar.setContentDescription(getString(R.string.lblRequestMoney));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ RequestMoneyActivity getMax;

        setMin(RequestMoneyActivity requestMoneyActivity) {
            this.getMax = requestMoneyActivity;
        }

        public final void onClick(View view) {
            if (RequestMoneyActivity.access$getRequestMoneyStatePageAdapter$p(this.getMax).setMax()) {
                RequestMoneyActivity.access$openAddBankAccount(this.getMax);
            } else {
                RequestMoneyActivity.access$showLimitReachedDialog(this.getMax);
            }
        }
    }

    public final void onClickRightMenuButton(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickRightMenuButton(view);
        List arrayList = new ArrayList();
        getMin(arrayList);
        BottomSheetHelpActivity.getMin getmin = BottomSheetHelpActivity.Companion;
        String string = getString(R.string.bottom_on_boarding_title_request_money);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…ding_title_request_money)");
        startActivity(BottomSheetHelpActivity.getMin.length(this, new OnBoardingModel(string, BottomSheetType.LIST, arrayList, "request_money"), true));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/requestmoney/RequestMoneyActivity$getOnPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ViewPager.setMax {
        final /* synthetic */ RequestMoneyActivity length;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        getMin(RequestMoneyActivity requestMoneyActivity) {
            this.length = requestMoneyActivity;
        }

        public final void onPageSelected(int i) {
            this.length.setMin(i);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(int i) {
        int min;
        int length2;
        int min2;
        int min3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min3 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min3, 8);
            onCancelLoad.setMax(-1550354323, oncanceled);
            onCancelLoad.getMin(-1550354323, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min2, 32);
            onCancelLoad.setMax(-1550354323, oncanceled2);
            onCancelLoad.getMin(-1550354323, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled3 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-1550354323, oncanceled3);
            onCancelLoad.getMin(-1550354323, oncanceled3);
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) _$_findCachedViewById(resetInternal.setMax.MenuRes);
        if (floatingActionButton != null) {
            boolean z = i != 0;
            Intrinsics.checkNotNullParameter(floatingActionButton, "$this$toggleVisibility");
            if (z) {
                floatingActionButton.show();
            } else {
                floatingActionButton.hide();
            }
        }
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) _$_findCachedViewById(resetInternal.setMax.NonNull);
        if (floatingActionButton2 != null) {
            boolean max = getMax(i);
            Intrinsics.checkNotNullParameter(floatingActionButton2, "$this$toggleVisibility");
            if (max) {
                floatingActionButton2.show();
            } else {
                floatingActionButton2.hide();
            }
        }
    }

    private final boolean getMax(int i) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-799030693, oncanceled);
            onCancelLoad.getMin(-799030693, oncanceled);
        }
        return i != getChildCount() - 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"id/dana/requestmoney/RequestMoneyActivity$getUserBankModule$1", "Lid/dana/requestmoney/bank/UserBankContract$View;", "onAddUserBank", "", "success", "", "onDeleteUserBank", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "onGetMaxBankAccountSuccess", "maxBankAccount", "", "onGetSavedUserBanksSuccess", "userBanks", "", "onUserBankExist", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends publishImageAction.length {
        final /* synthetic */ RequestMoneyActivity length;

        setMax(RequestMoneyActivity requestMoneyActivity) {
            this.length = requestMoneyActivity;
        }

        public final void setMin(int i) {
            RequestMoneyActivity.access$onGetMaxBankAccount(this.length, i);
        }

        public final void setMin(@NotNull List<UserBankModel> list) {
            Intrinsics.checkNotNullParameter(list, "userBanks");
            RequestMoneyActivity.access$onGetSavedUserBank(this.length, list);
        }

        public final void setMin(boolean z) {
            if (z) {
                this.length.refreshSavedUserBank();
                RequestMoneyActivity.access$showAddBankSuccessSnackBar(this.length);
            }
        }

        public final void setMax() {
            RequestMoneyActivity.access$showUserBankExistSnackbar(this.length);
        }

        public final void setMax(boolean z, @NotNull UserBankModel userBankModel) {
            Intrinsics.checkNotNullParameter(userBankModel, "userBankModel");
            this.length.onBankDeleted(userBankModel);
        }
    }

    public final void refreshSavedUserBank() {
        publishImageAction.setMin setmin = this.userBankPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
        }
        setmin.getMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/requestmoney/RequestMoneyActivity$getBottomOnBoardingModule$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onError", "", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getSelectedIndex.setMax {
        final /* synthetic */ RequestMoneyActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(RequestMoneyActivity requestMoneyActivity) {
            this.getMax = requestMoneyActivity;
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
            if (z) {
                RequestMoneyActivity.access$openBottomOnBoardingPageView(this.getMax);
            }
        }

        public final void onError(@Nullable String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append("on Error: ");
            sb.append(str);
            updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
        }
    }

    private final void getMin(List<ContentOnBoardingModel> list) {
        list.add(setMax());
        list.add(getMax());
        list.add(setMin());
        list.add(getMin());
    }

    private final ContentOnBoardingModel setMax() {
        String string = getString(R.string.bottom_on_boarding_subtitle_request_money_first);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…itle_request_money_first)");
        String string2 = getString(R.string.bottom_on_boarding_body_text_request_money_first);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…text_request_money_first)");
        return new ContentOnBoardingModel((int) R.drawable.on_boarding_enter_pin, string, string2);
    }

    private final ContentOnBoardingModel getMax() {
        String string = getString(R.string.bottom_on_boarding_subtitle_request_money_second);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…tle_request_money_second)");
        String string2 = getString(R.string.bottom_on_boarding_body_text_request_money_second);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…ext_request_money_second)");
        return new ContentOnBoardingModel((int) R.drawable.onboarding_input_amount, string, string2);
    }

    private final ContentOnBoardingModel setMin() {
        String string = getString(R.string.bottom_on_boarding_subtitle_request_money_third);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…itle_request_money_third)");
        String string2 = getString(R.string.bottom_on_boarding_body_text_request_money_third);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…text_request_money_third)");
        return new ContentOnBoardingModel((int) R.drawable.on_boarding_finish_register, string, string2);
    }

    private final ContentOnBoardingModel getMin() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1122214903, oncanceled);
            onCancelLoad.getMin(-1122214903, oncanceled);
        }
        String string = getString(R.string.bottom_on_boarding_subtitle_request_money_fourth);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…tle_request_money_fourth)");
        String string2 = getString(R.string.bottom_on_boarding_body_text_request_money_fourth);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…ext_request_money_fourth)");
        return new ContentOnBoardingModel((int) R.drawable.on_boarding_bank_account, string, string2);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        BankModel bankModel;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-288637221, oncanceled);
            onCancelLoad.getMin(-288637221, oncanceled);
        }
        if (-1 == i2) {
            if (i == getMax) {
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getOverflowIcon);
                if (textView != null) {
                    Activity activity = this;
                    initRect initrect = new initRect(activity);
                    initrect.toString = ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(activity).setMax((View) textView)).setMin(new getUseSecurityGuard((float) SplitBillIntroductionActivity.SPOTLIGHT_SIZE))).getMin(new access$1402(getResources().getString(R.string.tooltip_highlight_title), getResources().getString(R.string.tooltip_highlight_description_request_money)))).getMin();
                    initRect initrect2 = (initRect) initrect.setMax((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f));
                    initrect2.values = getString(R.string.btnDismissOnboarding);
                    ((initRect) initrect2.length(false)).length();
                }
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getOverflowIcon);
                if (textView2 != null) {
                    View view = textView2;
                    String string = getString(R.string.btnDismissOnboarding);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.btnDismissOnboarding)");
                    if (view != null) {
                        view.setContentDescription(string);
                    }
                }
            } else if (!(i != toFloatRange || intent == null || (bankModel = (BankModel) intent.getParcelableExtra(BankSelectorActivity.EXTRA_SELECTED_BANK)) == null)) {
                publishImageAction.setMin setmin = this.userBankPresenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
                }
                Intrinsics.checkNotNullExpressionValue(bankModel, "this");
                Intrinsics.checkNotNullParameter(bankModel, "$this$toUserBankModel");
                String str6 = bankModel.length;
                String str7 = str6 == null ? "" : str6;
                String str8 = bankModel.isInside;
                if (str8 == null) {
                    str = "";
                } else {
                    str = str8;
                }
                String str9 = bankModel.hashCode;
                if (str9 == null) {
                    str2 = "";
                } else {
                    str2 = str9;
                }
                String str10 = bankModel.getMin;
                if (str10 == null) {
                    str3 = "";
                } else {
                    str3 = str10;
                }
                String str11 = bankModel.toFloatRange;
                if (str11 == null) {
                    str4 = "";
                } else {
                    str4 = str11;
                }
                String str12 = bankModel.IsOverlapping;
                if (str12 == null) {
                    str5 = "";
                } else {
                    str5 = str12;
                }
                String str13 = bankModel.setMin;
                if (str13 == null) {
                    str13 = "";
                }
                setmin.length(new UserBankModel(str7, str, str2, str3, str4, str5, str13));
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void startAddBankAccountActivity() {
        BankSelectorActivity.getMin getmin = BankSelectorActivity.Companion;
        startActivityForResult(BankSelectorActivity.getMin.getMin(this, (String) null, (String) null, true, true, false, (Bundle) null, 102), toFloatRange);
    }

    @OnClick({2131362870})
    public final void onSlideLeftClick() {
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) _$_findCachedViewById(resetInternal.setMax.setInterpolatedProgress);
        if (wrapContentHeightViewPager != null) {
            wrapContentHeightViewPager.arrowScroll(17);
        }
    }

    @OnClick({2131362871})
    public final void onSlideRightClick() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(248765871, oncanceled);
            onCancelLoad.getMin(248765871, oncanceled);
        }
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) _$_findCachedViewById(resetInternal.setMax.setInterpolatedProgress);
        if (wrapContentHeightViewPager != null) {
            wrapContentHeightViewPager.arrowScroll(66);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/requestmoney/RequestMoneyActivity$showAddBankSuccessSnackBar$1$1"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ RequestMoneyActivity getMax;

        IsOverlapping(RequestMoneyActivity requestMoneyActivity) {
            this.getMax = requestMoneyActivity;
        }

        public final void onClick(View view) {
            RequestMoneyActivity.access$getCustomSnackbar$p(this.getMax).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/requestmoney/RequestMoneyActivity$showDeleteBankSuccessSnackbar$1$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ UserBankModel length;
        final /* synthetic */ RequestMoneyActivity setMax;

        isInside(RequestMoneyActivity requestMoneyActivity, UserBankModel userBankModel) {
            this.setMax = requestMoneyActivity;
            this.length = userBankModel;
        }

        public final void onClick(View view) {
            RequestMoneyActivity.access$getCustomSnackbar$p(this.setMax).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/requestmoney/RequestMoneyActivity$showUserBankExistSnackbar$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ RequestMoneyActivity getMax;

        toFloatRange(RequestMoneyActivity requestMoneyActivity) {
            this.getMax = requestMoneyActivity;
        }

        public final void onClick(View view) {
            RequestMoneyActivity.access$getCustomSnackbar$p(this.getMax).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/requestmoney/RequestMoneyActivity$showLimitReachedDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ RequestMoneyActivity length;

        toIntRange(RequestMoneyActivity requestMoneyActivity) {
            this.length = requestMoneyActivity;
        }

        public final void onClick(View view) {
            RequestMoneyActivity.access$getCustomSnackbar$p(this.length).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/requestmoney/RequestMoneyActivity$Companion;", "", "()V", "REQUEST_CODE_ONBOARDING_BOTTOMSHEET", "", "REQUEST_CODE_SELECT_BANK", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void init() {
        Bundle extras;
        String string;
        FtsOptions$Order fragment;
        int length2;
        int length3;
        int length4;
        int min;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length4 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length4)))) {
            onCanceled oncanceled = new onCanceled(length4, min, 32);
            onCancelLoad.setMax(-1624005979, oncanceled);
            onCancelLoad.getMin(-1624005979, oncanceled);
        }
        PackageParseUtils.getMax getmax = new PackageParseUtils.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length3, 4);
                onCancelLoad.setMax(1926886491, oncanceled2);
                onCancelLoad.getMin(1926886491, oncanceled2);
            }
            getmax.setMin = new UserBankModule(new setMax(this));
            getmax.length = new BottomSheetOnBoardingModule(new getMax(this));
            stopIgnoring.setMin(getmax.setMin, UserBankModule.class);
            stopIgnoring.setMin(getmax.length, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new PackageParseUtils(getmax.setMin, getmax.length, getmax.setMax, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            publishImageAction.setMin setmin = this.userBankPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
            }
            getminArr[0] = setmin;
            getSelectedIndex.length length5 = this.onBoardingPresenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
            }
            getminArr[1] = length5;
            registerPresenter(getminArr);
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length2 = dispatchOnCancelled.length(context, 0)) == 0)) {
                onCanceled oncanceled3 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-1225190491, oncanceled3);
                onCancelLoad.getMin(-1225190491, oncanceled3);
            }
            WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) _$_findCachedViewById(resetInternal.setMax.setInterpolatedProgress);
            if (wrapContentHeightViewPager != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                this.getMin = new ImageServiceImpl(supportFragmentManager);
                int dimensionPixelSize = wrapContentHeightViewPager.getResources().getDimensionPixelSize(R.dimen.f32332131165986);
                wrapContentHeightViewPager.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                wrapContentHeightViewPager.setPageMargin(wrapContentHeightViewPager.getResources().getDimensionPixelSize(R.dimen.f32322131165985));
                wrapContentHeightViewPager.setClipToPadding(false);
                int max = dispatchOnCancelled.getMax(0);
                if (max != 0) {
                    onCanceled oncanceled4 = new onCanceled(0, max, 16);
                    onCancelLoad.setMax(-1046214082, oncanceled4);
                    onCancelLoad.getMin(-1046214082, oncanceled4);
                }
                wrapContentHeightViewPager.addOnPageChangeListener(new getMin(this));
                ViewPager viewPager = wrapContentHeightViewPager;
                ImageServiceImpl imageServiceImpl = this.getMin;
                if (imageServiceImpl == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestMoneyStatePageAdapter");
                }
                registerViewPager(viewPager, imageServiceImpl);
            }
            Intent intent = getIntent();
            if (!(intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("amount")) == null)) {
                APImageDownloadRsp aPImageDownloadRsp = new APImageDownloadRsp(string);
                if (aPImageDownloadRsp.length(new APImageDownloadRsp(0)) && (fragment = getFragment(0)) != null && (fragment instanceof RequestMoneyBalanceQrCardFragment)) {
                    RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment = (RequestMoneyBalanceQrCardFragment) fragment;
                    Intrinsics.checkNotNullParameter(aPImageDownloadRsp, "amount");
                    Intrinsics.checkNotNullParameter("", "remarks");
                    requestMoneyBalanceQrCardFragment.getMax(aPImageDownloadRsp);
                    requestMoneyBalanceQrCardFragment.setMin("");
                    requestMoneyBalanceQrCardFragment.values();
                }
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsFrameLayout);
            if (appCompatTextView != null) {
                appCompatTextView.setOnClickListener(new setMin(this));
            }
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled5 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(-12869203, oncanceled5);
                onCancelLoad.getMin(-12869203, oncanceled5);
            }
            getSelectedIndex.length length6 = this.onBoardingPresenter;
            if (length6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
            }
            length6.setMin("request_money");
            publishImageAction.setMin setmin2 = this.userBankPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
            }
            setmin2.getMin();
            convertDipToPx.length length7 = new convertDipToPx.length(getApplicationContext());
            length7.getMax = TrackerKey.Event.REQUEST_MONEY_OPEN;
            convertDipToPx.length max3 = length7.setMax("Source", getSource());
            max3.setMin();
            genTextSelector.getMax(new convertDipToPx(max3, (byte) 0));
            return;
        }
        throw null;
    }

    public final void onBankDeleted(@NotNull UserBankModel userBankModel) {
        View decorView;
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(userBankModel, "deletedBank");
        Window window = getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null || (viewGroup = (ViewGroup) decorView.findViewById(16908290)) == null)) {
            setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax(viewGroup);
            setmax.setMax = getString(R.string.close);
            String string = getString(R.string.request_money_success_delete_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…y_success_delete_message)");
            String format = String.format(string, Arrays.copyOf(new Object[]{userBankModel.equals, userBankModel.getMin}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            setmax.getMax = format;
            setmax.setMin = R.drawable.ic_warning_orange;
            setmax.toIntRange = 0;
            setmax.getMin = R.drawable.bg_rounded_border_yellow_50;
            setmax.length = new isInside(this, userBankModel);
            setProgressViewOffset max = setmax.getMax();
            this.setMax = max;
            if (max == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customSnackbar");
            }
            max.show();
        }
        refreshSavedUserBank();
    }

    public static final /* synthetic */ void access$openAddBankAccount(RequestMoneyActivity requestMoneyActivity) {
        int max;
        requestMoneyActivity.startAddBankAccountActivity();
        Context baseContext = requestMoneyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 88955766 == (max = dispatchOnCancelled.getMax(applicationContext, 88955766)))) {
            onCanceled oncanceled = new onCanceled(88955766, max, 512);
            onCancelLoad.setMax(88955766, oncanceled);
            onCancelLoad.getMin(88955766, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(requestMoneyActivity);
        length2.getMax = TrackerKey.Event.REQUEST_MONEY_QR_BANK_CREATE;
        convertDipToPx.length max2 = length2.setMax("Source", TrackerKey.SourceType.BANNER);
        max2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ void access$showLimitReachedDialog(RequestMoneyActivity requestMoneyActivity) {
        View decorView;
        ViewGroup viewGroup;
        Window window = requestMoneyActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewGroup = (ViewGroup) decorView.findViewById(16908290)) != null) {
            setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax(viewGroup);
            setmax.setMax = requestMoneyActivity.getString(R.string.close);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = requestMoneyActivity.getString(R.string.request_money_add_bank_limit_reached);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…y_add_bank_limit_reached)");
            Object[] objArr = new Object[1];
            ImageServiceImpl imageServiceImpl = requestMoneyActivity.getMin;
            if (imageServiceImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyStatePageAdapter");
            }
            objArr[0] = Integer.valueOf(imageServiceImpl.getMax);
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            setmax.getMax = format;
            setmax.setMin = R.drawable.ic_warning_24_yellow50;
            setmax.toIntRange = 0;
            setmax.getMin = R.drawable.bg_rounded_border_yellow_50;
            setmax.length = new toIntRange(requestMoneyActivity);
            setProgressViewOffset max = setmax.getMax();
            requestMoneyActivity.setMax = max;
            if (max == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customSnackbar");
            }
            max.show();
        }
    }

    public static final /* synthetic */ void access$onGetSavedUserBank(RequestMoneyActivity requestMoneyActivity, List list) {
        ImageServiceImpl imageServiceImpl = requestMoneyActivity.getMin;
        if (imageServiceImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyStatePageAdapter");
        }
        Intrinsics.checkNotNullParameter(list, "userBankModels");
        imageServiceImpl.setMin = CollectionsKt.toMutableList(list);
        imageServiceImpl.notifyDataSetChanged();
        requestMoneyActivity.setMin(requestMoneyActivity.getCurrentPosition());
    }

    public static final /* synthetic */ void access$showAddBankSuccessSnackBar(RequestMoneyActivity requestMoneyActivity) {
        View decorView;
        ViewGroup viewGroup;
        Window window = requestMoneyActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewGroup = (ViewGroup) decorView.findViewById(16908290)) != null) {
            setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax(viewGroup);
            setmax.setMax = requestMoneyActivity.getString(R.string.close);
            setmax.getMax = requestMoneyActivity.getString(R.string.request_money_add_bank_message_success);
            setmax.setMin = R.drawable.ic_check_24_green50_filled_circle;
            setmax.toIntRange = 0;
            setmax.getMin = R.drawable.bg_rounded_border_green_50;
            setmax.length = new IsOverlapping(requestMoneyActivity);
            setProgressViewOffset max = setmax.getMax();
            requestMoneyActivity.setMax = max;
            if (max == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customSnackbar");
            }
            max.show();
        }
    }

    public static final /* synthetic */ void access$showUserBankExistSnackbar(RequestMoneyActivity requestMoneyActivity) {
        View decorView;
        ViewGroup viewGroup;
        Window window = requestMoneyActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewGroup = (ViewGroup) decorView.findViewById(16908290)) != null) {
            setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax(viewGroup);
            setmax.setMax = requestMoneyActivity.getString(R.string.close);
            setmax.getMax = requestMoneyActivity.getString(R.string.request_money_add_bank_exist_error);
            setmax.setMin = R.drawable.ic_warning_orange;
            setmax.toIntRange = 0;
            setmax.getMin = R.drawable.bg_rounded_border_yellow_50;
            setmax.length = new toFloatRange(requestMoneyActivity);
            setProgressViewOffset max = setmax.getMax();
            requestMoneyActivity.setMax = max;
            if (max == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customSnackbar");
            }
            max.show();
        }
    }

    public static final /* synthetic */ void access$openBottomOnBoardingPageView(RequestMoneyActivity requestMoneyActivity) {
        List arrayList = new ArrayList();
        requestMoneyActivity.getMin(arrayList);
        String string = requestMoneyActivity.getString(R.string.bottom_on_boarding_title_request_money);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…ding_title_request_money)");
        requestMoneyActivity.startActivityForResult(BottomSheetOnBoardingActivity.createOnBoardingIntent(requestMoneyActivity, new OnBoardingModel(string, BottomSheetType.VIEW_PAGER, arrayList, "request_money")), getMax);
    }
}
