package id.dana.savings.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import id.dana.base.BaseActivity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.getSelectedIndex;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0004J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lid/dana/savings/activity/OnBoardingActivity;", "Lid/dana/base/BaseActivity;", "()V", "onBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingPresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingPresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "configToolbar", "", "getBottomOnBoardingModule", "Lid/dana/di/modules/BottomSheetOnBoardingModule;", "getOnBoardingContents", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "getOnBoardingListViewTitleStringRes", "", "getOnBoardingPageViewTitleStringRes", "getOnBoardingScenario", "init", "savedInstanceState", "Landroid/os/Bundle;", "onClickRightMenuButton", "view", "Landroid/view/View;", "openBottomOnBoardingListView", "openBottomOnBoardingPageView", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class OnBoardingActivity extends BaseActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    public static final int REQUEST_CODE_ON_BOARDING_BOTTOM_SHEET = 1007;
    public static final int SPOTLIGHT_SIZE = 20;
    private HashMap getMax;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;

    public void _$_clearFindViewByIdCache() {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(874754602, oncanceled);
            onCancelLoad.getMin(874754602, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(874754602, oncanceled2);
            onCancelLoad.getMin(874754602, oncanceled2);
        }
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1646607678, oncanceled);
            onCancelLoad.getMin(1646607678, oncanceled);
        }
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void configToolbar() {
    }

    @NotNull
    public abstract List<ContentOnBoardingModel> getOnBoardingContents();

    @NotNull
    public abstract String getOnBoardingListViewTitleStringRes();

    @NotNull
    public abstract String getOnBoardingPageViewTitleStringRes();

    @NotNull
    public abstract String getOnBoardingScenario();

    @NotNull
    public final getSelectedIndex.length getOnBoardingPresenter() {
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        return length2;
    }

    public final void setOnBoardingPresenter(@NotNull getSelectedIndex.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.onBoardingPresenter = length2;
    }

    public void onClickRightMenuButton(@Nullable View view) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-99734070, oncanceled);
            onCancelLoad.getMin(-99734070, oncanceled);
        }
        BottomSheetHelpActivity.getMin getmin = BottomSheetHelpActivity.Companion;
        startActivity(BottomSheetHelpActivity.getMin.length(this, new OnBoardingModel(getOnBoardingListViewTitleStringRes(), BottomSheetType.LIST, getOnBoardingContents(), getOnBoardingScenario()), true));
    }

    public void init(@Nullable Bundle bundle) {
        super.init(bundle);
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        getminArr[0] = length2;
        registerPresenter(getminArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/savings/activity/OnBoardingActivity$getBottomOnBoardingModule$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onError", "", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getSelectedIndex.setMax {
        final /* synthetic */ OnBoardingActivity setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(OnBoardingActivity onBoardingActivity) {
            this.setMin = onBoardingActivity;
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
            if (z) {
                this.setMin.startActivityForResult(BottomSheetOnBoardingActivity.createOnBoardingIntent(this.setMin, new OnBoardingModel(this.setMin.getOnBoardingPageViewTitleStringRes(), BottomSheetType.VIEW_PAGER, this.setMin.getOnBoardingContents(), this.setMin.getOnBoardingScenario())), 1007);
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

    /* access modifiers changed from: protected */
    @NotNull
    public final BottomSheetOnBoardingModule getBottomOnBoardingModule() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 470557512 == (max = dispatchOnCancelled.getMax(applicationContext, 470557512)))) {
            onCanceled oncanceled = new onCanceled(470557512, max, 512);
            onCancelLoad.setMax(470557512, oncanceled);
            onCancelLoad.getMin(470557512, oncanceled);
        }
        return new BottomSheetOnBoardingModule(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/savings/activity/OnBoardingActivity$Companion;", "", "()V", "REQUEST_CODE_ON_BOARDING_BOTTOM_SHEET", "", "SPOTLIGHT_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
