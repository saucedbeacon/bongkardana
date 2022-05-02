package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.getPresetAppInfos;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.stopIgnoring;

public class DanaProtectionView extends BaseRichView {
    private String getMax;
    @BindView(2131363631)
    ImageView ivSecureBadge;

    public int getLayout() {
        return R.layout.view_dana_protection;
    }

    public DanaProtectionView(@NonNull Context context) {
        super(context);
    }

    public DanaProtectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaProtectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DanaProtectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(260972214, oncanceled);
            onCancelLoad.getMin(260972214, oncanceled);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.INotificationSideChannel$Stub, 0, 0);
            try {
                this.getMax = obtainStyledAttributes.getString(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        setImageDanaProtection(this.getMax);
    }

    public void setImageDanaProtection(String str) {
        if (str == null) {
            return;
        }
        if (str.equals("small_dark")) {
            this.ivSecureBadge.setImageResource(R.drawable.ic_dana_protection_small_dark);
        } else if (str.equals("small_light")) {
            this.ivSecureBadge.setImageResource(R.drawable.ic_dana_protection_small_light);
        }
    }

    @OnClick({2131362453})
    public void onMainParentClicked() {
        DanaH5.startContainerFullUrl("https://m.dana.id/m/standalone/protection");
    }

    public void injectComponent(PrepareException.AnonymousClass1 r3) {
        getPresetAppInfos.length length = new getPresetAppInfos.length((byte) 0);
        if (r3 != null) {
            length.length = r3;
            stopIgnoring.setMin(length.length, PrepareException.AnonymousClass1.class);
            return;
        }
        throw null;
    }
}
