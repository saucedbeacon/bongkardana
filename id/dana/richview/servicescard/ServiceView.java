package id.dana.richview.servicescard;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import id.dana.base.BaseRichView;

public class ServiceView extends BaseRichView {
    public int getLayout() {
        return R.layout.view_service;
    }

    public void setup() {
    }

    public ServiceView(@NonNull Context context) {
        super(context);
    }

    public ServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
