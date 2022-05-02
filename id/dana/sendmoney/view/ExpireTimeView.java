package id.dana.sendmoney.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.ExpiryModule;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.OptIn;
import o.PrepareException;
import o.getInEdited;
import o.getPhoto;
import o.getPhotoIndex;
import o.getSnapshotExtDir;
import o.onExecuted;
import o.stopIgnoring;

public class ExpireTimeView extends BaseRichView {
    @Inject
    public onExecuted.getMin expiryPresenter;
    private boolean getMax;
    @BindView(2131363030)
    Group groupChangeExpiry;
    @BindView(2131362427)
    Group groupExpiryOption;
    @BindView(2131364376)
    RadioGroup rgExpiry;
    private length setMax;
    @BindView(2131365195)
    TextView tvDescriptionExpire;

    public interface length {
        void setMax();

        void setMin();
    }

    public int getLayout() {
        return R.layout.view_expire_time;
    }

    public ExpireTimeView(@NonNull Context context) {
        super(context);
    }

    public ExpireTimeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpireTimeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExpireTimeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        getSnapshotExtDir.setMax setmax = new getSnapshotExtDir.setMax((byte) 0);
        if (r4 != null) {
            setmax.setMax = r4;
            setmax.getMin = new ExpiryModule(new getPhotoIndex(this));
            stopIgnoring.setMin(setmax.getMin, ExpiryModule.class);
            stopIgnoring.setMin(setmax.setMax, PrepareException.AnonymousClass1.class);
            new getSnapshotExtDir(setmax.getMin, setmax.setMax, (byte) 0).setMax(this);
            registerPresenter(this.expiryPresenter);
            return;
        }
        throw null;
    }

    public void injected(boolean z) {
        if (z) {
            this.expiryPresenter.getMax();
        }
    }

    public void setup() {
        this.rgExpiry.setOnCheckedChangeListener(new getInEdited(this));
    }

    public void addRadioButton(@DrawableRes int i, String str, boolean z) {
        RadioGroup radioGroup = this.rgExpiry;
        AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(getContext());
        if (CornerMarkingDataProvider.setMax()) {
            appCompatRadioButton.setId(View.generateViewId());
            appCompatRadioButton.setLayoutDirection(1);
            appCompatRadioButton.setTextAlignment(2);
        } else {
            appCompatRadioButton.setId(CornerMarkingDataProvider.AnonymousClass2.setMax());
            ViewCompat.IsOverlapping(appCompatRadioButton, 1);
        }
        appCompatRadioButton.setText(str);
        appCompatRadioButton.setChecked(z);
        appCompatRadioButton.setTypeface(OptIn.length(getContext(), R.font.f33532131296263));
        appCompatRadioButton.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        appCompatRadioButton.setCompoundDrawablePadding(40);
        appCompatRadioButton.setButtonDrawable(R.drawable.selector_button_radio);
        getResources();
        appCompatRadioButton.setTextColor(-11908534);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 10, 0, 70);
        appCompatRadioButton.setLayoutParams(layoutParams);
        radioGroup.addView(appCompatRadioButton);
    }

    @OnClick({2131365216})
    public void doneChangeExpiry() {
        length length2 = this.setMax;
        if (length2 != null && this.getMax) {
            length2.setMax();
        }
        showDefaultView();
    }

    @OnClick({2131362055})
    public void changeExpiry() {
        length length2 = this.setMax;
        if (length2 != null) {
            length2.setMin();
        }
        this.groupChangeExpiry.setVisibility(8);
        this.groupExpiryOption.setVisibility(0);
    }

    public void setListener(length length2) {
        this.setMax = length2;
    }

    public void showDefaultView() {
        this.groupChangeExpiry.setVisibility(0);
        this.groupExpiryOption.setVisibility(8);
        this.tvDescriptionExpire.setText(getMax());
    }

    private String getMax() {
        RadioButton radioButton = (RadioButton) this.rgExpiry.getChildAt(this.rgExpiry.indexOfChild(this.rgExpiry.findViewById(this.rgExpiry.getCheckedRadioButtonId())));
        return radioButton == null ? "" : radioButton.getText().toString();
    }

    public String getSelectedValue() {
        List asList = Arrays.asList(getMax().split(" "));
        return asList.isEmpty() ? "" : (String) asList.get(0);
    }

    public String getSelectedUnit() {
        List asList = Arrays.asList(getMax().split(" "));
        return (asList.isEmpty() || asList.size() < 2) ? "" : (String) asList.get(1);
    }

    public static /* synthetic */ void length(ExpireTimeView expireTimeView, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getPhoto getphoto = (getPhoto) it.next();
            int indexOf = list.indexOf(getphoto);
            int i = indexOf != 0 ? indexOf != 1 ? R.drawable.ic_timer_3 : R.drawable.ic_timer_2 : R.drawable.ic_timer_1;
            Context context = expireTimeView.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(getphoto.getMin);
            sb.append(" ");
            sb.append(getphoto.setMin(context));
            expireTimeView.addRadioButton(i, sb.toString(), getphoto.getMax());
        }
        expireTimeView.doneChangeExpiry();
        expireTimeView.getMax = true;
    }
}
