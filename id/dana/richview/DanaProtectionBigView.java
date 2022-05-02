package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import o.PrepareException;
import o.getPresetAppInfos;
import o.stopIgnoring;

public class DanaProtectionBigView extends BaseRichView {
    public int getLayout() {
        return R.layout.view_dana_protection_big;
    }

    public void setup() {
    }

    public DanaProtectionBigView(@NonNull Context context) {
        super(context);
    }

    public DanaProtectionBigView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaProtectionBigView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DanaProtectionBigView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
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
