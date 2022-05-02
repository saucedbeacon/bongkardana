package id.dana.referral;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.BindViews;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import o.CornerMarkingDataProvider;
import o.IntRange;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getInsetDodgeRect;
import o.getLineColor;
import o.handlePerformanceLog;
import o.observedEntities;
import o.onDetachedFromLayoutParams;

public class ReferralCodeSectionView extends BaseRichView {
    @BindViews({2131362081, 2131362126})
    List<Button> buttons;
    @BindView(2131362503)
    ConstraintLayout clReferralContainer;
    private String equals = "";
    private String getMax;
    private String getMin;
    private onDetachedFromLayoutParams length;
    @BindView(2131363926)
    LinearLayout llShareAction;
    private getMin setMax;
    private onDetachedFromLayoutParams setMin;
    @BindView(2131365498)
    TextView tvReferralCode;

    public interface getMin {
        void length(String str);
    }

    public int getLayout() {
        return R.layout.cardview_referral_code;
    }

    public ReferralCodeSectionView(@NonNull Context context) {
        super(context);
    }

    public ReferralCodeSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReferralCodeSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReferralCodeSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        this.llShareAction.setOnClickListener(new observedEntities(getBaseActivity()) {
            public final void getMin(View view) {
                ReferralCodeSectionView.this.onShareReferralCodeClicked();
            }
        });
    }

    public void setListener(getMin getmin) {
        this.setMax = getmin;
    }

    public void setReferralCode(String str) {
        this.getMin = str;
        if (!TextUtils.isEmpty(str)) {
            this.tvReferralCode.setVisibility(0);
            this.tvReferralCode.setText(str);
            this.llShareAction.setVisibility(0);
            return;
        }
        this.tvReferralCode.setVisibility(8);
        this.llShareAction.setVisibility(8);
    }

    public void setDeepLinkReferral(String str) {
        this.getMax = str;
    }

    public void setReferralButtons(List<handlePerformanceLog> list) {
        LinearLayout.LayoutParams layoutParams;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                handlePerformanceLog handleperformancelog = list.get(i);
                if (handleperformancelog != null) {
                    Button button = this.buttons.get(i);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f32282131165978);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f32272131165977);
                    if (this.buttons.size() == 1) {
                        layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f32262131165976), 2.0f);
                        layoutParams.setMargins(0, dimensionPixelSize, 0, 0);
                    } else {
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f32262131165976), 1.0f);
                        layoutParams2.setMargins(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, 0);
                        layoutParams = layoutParams2;
                    }
                    button.setLayoutParams(layoutParams);
                    button.setVisibility(handleperformancelog.setMin() ? 0 : 8);
                    if (!TextUtils.isEmpty(handleperformancelog.setMax)) {
                        button.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(getContext(), handleperformancelog.setMax, handleperformancelog.setMax.replace("_", " ").toUpperCase()));
                    }
                    final String str = handleperformancelog.length;
                    if (!TextUtils.isEmpty(str)) {
                        button.setOnClickListener(new observedEntities(getBaseActivity()) {
                            public final void getMin(View view) {
                                ReferralCodeSectionView.access$000(ReferralCodeSectionView.this, str);
                            }
                        });
                    }
                }
            }
        }
    }

    public void setReferralContainerBottomPadding(boolean z) {
        ConstraintLayout constraintLayout = this.clReferralContainer;
        Resources resources = getResources();
        int i = R.dimen.f26212131165267;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f26212131165267);
        Resources resources2 = getResources();
        if (z) {
            i = R.dimen.f26222131165268;
        }
        constraintLayout.setPadding(0, dimensionPixelSize, 0, resources2.getDimensionPixelSize(i));
    }

    public void hideSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.setMin.length();
        }
    }

    public void showSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.tvReferralCode);
            setmax.getMax = R.layout.view_referral_code_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.length = getinsetdodgerect;
            getInsetDodgeRect.setMax setmax2 = new getInsetDodgeRect.setMax(this.llShareAction);
            setmax2.getMax = R.layout.view_referral_code_skeleton;
            setmax2.setMax = 1500;
            setmax2.length = true;
            setmax2.setMin = IntRange.setMax(setmax2.getMin.getContext(), R.color.f24782131100433);
            setmax2.isInside = 0;
            getInsetDodgeRect getinsetdodgerect2 = new getInsetDodgeRect(setmax2, (byte) 0);
            getinsetdodgerect2.getMin();
            this.setMin = getinsetdodgerect2;
            return;
        }
        ondetachedfromlayoutparams.getMin();
        this.setMin.getMin();
    }

    public void setMessage(String str) {
        this.equals = str;
    }

    public void onShareReferralCodeClicked() {
        convertDipToPx.length length2 = new convertDipToPx.length(getBaseActivity().getApplicationContext());
        length2.getMax = TrackerKey.Event.REFERRER_INVITE_ATTEMPT;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.INVITE_TYPE, TrackerKey.InviteType.SHARE_BUTTON);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        getContext().startActivity(Intent.createChooser(getLineColor.getMin(String.format(this.equals, new Object[]{this.getMax, this.getMin})), getContext().getString(R.string.share_via)));
    }

    static /* synthetic */ void access$000(ReferralCodeSectionView referralCodeSectionView, String str) {
        getMin getmin = referralCodeSectionView.setMax;
        if (getmin != null) {
            getmin.length(str);
        }
    }
}
