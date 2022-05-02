package id.dana.splitbill.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.SplitBillIntroductionModule;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.DefaultStepCreator;
import o.PhotoView;
import o.PrepareException;
import o.access$1402;
import o.access$2900;
import o.dispatchOnCancelled;
import o.getMaxTextureSize;
import o.getSelectedIndex;
import o.getUseSecurityGuard;
import o.initRect;
import o.onCancelLoad;
import o.onCanceled;
import o.peek;
import o.setBadgeInfo;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.Nullable;

public class SplitBillIntroductionActivity extends BaseActivity implements setBadgeInfo.setMin {
    public static final int SPOTLIGHT_SIZE = ((int) (Resources.getSystem().getDisplayMetrics().density * 20.0f));
    private static final int getMax = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    @BindView(2131362138)
    Button btnSplitBillEntry;
    peek component;
    private List<ContentOnBoardingModel> equals;
    private int getMin;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter isInside;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    @Inject
    public setBadgeInfo.getMax presenter;
    @BindView(2131364386)
    TextView rightButton;
    @BindView(2131364602)
    SplitBillHistoryView sbhvBillHistories;
    private access$2900 setMax;

    public void dismissProgress() {
    }

    public int getLayout() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            return R.layout.activity_split_bill_introduction;
        }
        onCanceled oncanceled = new onCanceled(length, min, 32);
        onCancelLoad.setMax(27381522, oncanceled);
        onCancelLoad.getMin(27381522, oncanceled);
        return R.layout.activity_split_bill_introduction;
    }

    public void onError(String str) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1291819942, oncanceled);
            onCancelLoad.getMin(-1291819942, oncanceled);
        }
    }

    public void showProgress() {
    }

    static /* synthetic */ void access$100(SplitBillIntroductionActivity splitBillIntroductionActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1454518034, oncanceled);
            onCancelLoad.getMin(-1454518034, oncanceled);
        }
        ArrayList arrayList = new ArrayList();
        splitBillIntroductionActivity.equals = arrayList;
        splitBillIntroductionActivity.setMin(arrayList);
        splitBillIntroductionActivity.startActivityForResult(BottomSheetOnBoardingActivity.createOnBoardingIntent(splitBillIntroductionActivity, new OnBoardingModel(splitBillIntroductionActivity.getString(R.string.bottom_on_boarding_title_split_bill), BottomSheetType.VIEW_PAGER, splitBillIntroductionActivity.equals, "split_bill")), getMax);
    }

    public void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(434680842, oncanceled);
            onCancelLoad.getMin(434680842, oncanceled);
        }
        setCenterTitle(getString(R.string.split_bill_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
        setMenuRightButton((int) R.drawable.ic_tooltip_help);
    }

    public void onResume() {
        super.onResume();
        this.sbhvBillHistories.getSplitBillHistories();
    }

    public void onFinishGetSplitBillConfig(int i, access$2900 access_2900) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1234793273, oncanceled);
            onCancelLoad.getMin(-1234793273, oncanceled);
        }
        this.getMin = i;
        this.setMax = access_2900;
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362138})
    public void onSplitBillEntryButtonClick() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1384412705, oncanceled);
            onCancelLoad.getMin(-1384412705, oncanceled);
        }
        startActivity(SplitBillActivity.createSplitBillIntent(this, this.setMax, 0, "", this.getMin));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (getMax == i && -1 == i2 && this.IsOverlapping) {
            setUseAmcsLite tooltipTarget = getTooltipTarget();
            if (tooltipTarget != null && this.isInside == null) {
                initRect initrect = new initRect(this);
                initrect.toString = tooltipTarget;
                initRect initrect2 = (initRect) initrect.length(false);
                initrect2.values = getResources().getString(R.string.btnQuestionOnboarding);
                this.isInside = ((initRect) initrect2.setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                    public final void onFinished(int i) {
                        PhotoView.PhotoInter unused = SplitBillIntroductionActivity.this.isInside = null;
                    }
                })).length();
            }
            this.IsOverlapping = false;
        }
        super.onActivityResult(i, i2, intent);
    }

    private void setMin(List<ContentOnBoardingModel> list) {
        list.add(setMin());
        list.add(new ContentOnBoardingModel((int) R.drawable.split_bill_on_boarding_input_amount, getString(R.string.bottom_on_boarding_subtitle_split_bill_second), getString(R.string.bottom_on_boarding_body_text_split_bill_second)));
        list.add(new ContentOnBoardingModel((int) R.drawable.split_bill_on_boarding_notes, getString(R.string.bottom_on_boarding_subtitle_split_bill_third), getString(R.string.bottom_on_boarding_body_text_split_bill_third)));
        list.add(new ContentOnBoardingModel((int) R.drawable.split_bill_on_boarding_check_status, getString(R.string.bottom_on_boarding_subtitle_split_bill_fourth), getString(R.string.bottom_on_boarding_body_text_split_bill_fourth)));
    }

    private ContentOnBoardingModel setMin() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1971082520 == (max = dispatchOnCancelled.getMax(applicationContext, -1971082520)))) {
            onCanceled oncanceled = new onCanceled(-1971082520, max, 512);
            onCancelLoad.setMax(-1971082520, oncanceled);
            onCancelLoad.getMin(-1971082520, oncanceled);
        }
        return new ContentOnBoardingModel((int) R.drawable.split_bill_on_boarding_split_bill, getString(R.string.bottom_on_boarding_subtitle_split_bill_first), getString(R.string.bottom_on_boarding_body_text_split_bill_first));
    }

    public setUseAmcsLite getTooltipTarget() {
        TextView textView = this.rightButton;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(397313993, oncanceled);
            onCancelLoad.getMin(397313993, oncanceled);
        }
        return ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this).setMax((View) textView)).setMin(new getUseSecurityGuard((float) SPOTLIGHT_SIZE))).getMin(new access$1402(getResources().getString(R.string.tooltip_split_bill_title), getResources().getString(R.string.tooltip_split_bill_desc)))).getMin();
    }

    public void init() {
        int max;
        if (this.component == null) {
            DefaultStepCreator.setMin min = DefaultStepCreator.getMin();
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            Context context = null;
            if (applicationComponent != null) {
                min.getMin = applicationComponent;
                Context baseContext = getBaseContext();
                if (baseContext != null) {
                    context = baseContext.getApplicationContext();
                }
                if (!(context == null || 359928510 == (max = dispatchOnCancelled.getMax(context, 359928510)))) {
                    onCanceled oncanceled = new onCanceled(359928510, max, 512);
                    onCancelLoad.setMax(359928510, oncanceled);
                    onCancelLoad.getMin(359928510, oncanceled);
                }
                min.setMax = new BottomSheetOnBoardingModule(new getSelectedIndex.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void setMax(boolean z, @Nullable String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
                        boolean unused = SplitBillIntroductionActivity.this.IsOverlapping = z;
                        if (z) {
                            SplitBillIntroductionActivity.access$100(SplitBillIntroductionActivity.this);
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
                min.length = new SplitBillIntroductionModule(this);
                stopIgnoring.setMin(min.length, SplitBillIntroductionModule.class);
                stopIgnoring.setMin(min.setMax, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(min.getMin, PrepareException.AnonymousClass1.class);
                this.component = new DefaultStepCreator(min.length, min.setMax, min.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.component.getMax(this);
        registerPresenter(this.presenter, this.onBoardingPresenter);
        this.presenter.getMin();
        this.onBoardingPresenter.setMin("split_bill");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131364386})
    public void onHelpClick() {
        ArrayList arrayList = new ArrayList();
        this.equals = arrayList;
        setMin(arrayList);
        startActivity(BottomSheetHelpActivity.createBottomSheetHelpIntent(this, new OnBoardingModel(getString(R.string.bottom_on_boarding_title_split_bill), BottomSheetType.LIST, this.equals, "split_bill")));
    }
}
