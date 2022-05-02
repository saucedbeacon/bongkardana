package id.dana.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.GriverProgressBar;
import o.IRedDotManager;
import o.Junction;
import o.PrepareException;
import o.RawQuery;
import o.autoGenerate;
import o.observedEntities;
import o.onDelete;

public abstract class BaseRichView extends FrameLayout {
    private autoGenerate getMax;
    private observedEntities getMin;
    private List<onDelete.getMin> length;
    private IRedDotManager setMax;
    private TypedArray setMin;
    private View toFloatRange;
    /* access modifiers changed from: private */
    public Unbinder toIntRange;

    public abstract int getLayout();

    public void injectComponent(PrepareException.AnonymousClass1 r1) {
    }

    public void injected(boolean z) {
    }

    /* access modifiers changed from: protected */
    public boolean isForRecyclerViewholder() {
        return false;
    }

    public void onInjectedView(View view) {
    }

    /* access modifiers changed from: protected */
    public void onSingleClick(View view) {
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    public void setSingleClick() {
    }

    public void setup() {
    }

    public BaseRichView(@NonNull Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public BaseRichView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public BaseRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    @TargetApi(21)
    public BaseRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }

    public void init(Context context, AttributeSet attributeSet) {
        boolean z;
        if (isInEditMode()) {
            z = false;
        } else if (PrepareException.getMin != null) {
            injectComponent(PrepareException.getMin.setMax);
            z = true;
        } else {
            throw new IllegalStateException("Application components needs to be set in Application");
        }
        View inflate = View.inflate(context, getLayout(), this);
        this.toFloatRange = inflate;
        onInjectedView(inflate);
        this.toIntRange = ButterKnife.setMax((Object) this, this.toFloatRange);
        parseAttrs(context, attributeSet);
        setup(isInEditMode());
        if (!isInEditMode()) {
            injected(z);
        }
        this.getMax = getBaseActivity();
        setSingleClick();
    }

    public void setup(boolean z) {
        setup();
    }

    public BaseActivity getBaseActivity() {
        if (getContext() instanceof BaseActivity) {
            return (BaseActivity) getContext();
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.toIntRange == null) {
            this.toIntRange = ButterKnife.setMax((Object) this, this.toFloatRange);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispose();
        if (!isForRecyclerViewholder()) {
            disposePresenter();
        }
        Unbinder unbinder = this.toIntRange;
        if (unbinder != null) {
            RawQuery.getMax(unbinder, new Junction(this));
        }
    }

    public PrepareException.AnonymousClass1 getApplicationComponent() {
        if (getBaseActivity() != null) {
            return getBaseActivity().getApplicationComponent();
        }
        return null;
    }

    public boolean isViewBinded() {
        return this.toIntRange != null;
    }

    public void addDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.setMax == null) {
            this.setMax = new IRedDotManager();
        }
        if (updateRunnable != null) {
            IRedDotManager iRedDotManager = this.setMax;
            if (iRedDotManager != null) {
                iRedDotManager.getMin(updateRunnable);
                return;
            }
            throw null;
        }
        throw null;
    }

    public void dispose() {
        IRedDotManager iRedDotManager = this.setMax;
        if (iRedDotManager != null && !iRedDotManager.isDisposed()) {
            this.setMax.dispose();
        }
    }

    public void registerPresenter(onDelete.getMin... getminArr) {
        if (this.length == null) {
            this.length = new ArrayList();
        }
        if (getminArr != null && getminArr.length > 0) {
            this.length.addAll(Arrays.asList(getminArr));
        }
    }

    public void disposePresenter() {
        List<onDelete.getMin> list = this.length;
        if (list != null) {
            for (onDelete.getMin max : list) {
                max.setMax();
            }
        }
    }

    public void enableClick() {
        autoGenerate autogenerate = this.getMax;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
    }

    public void disableClick() {
        autoGenerate autogenerate = this.getMax;
        if (autogenerate != null) {
            autogenerate.disableClick();
        }
    }

    public boolean isRichViewClickable() {
        autoGenerate autogenerate = this.getMax;
        if (autogenerate != null) {
            return autogenerate.isClickable();
        }
        return true;
    }

    public observedEntities getSingleItemClickListener() {
        if (this.getMin == null) {
            this.getMin = new observedEntities(getBaseActivity()) {
                public final void getMin(View view) {
                    BaseRichView.this.onSingleClick(view);
                }
            };
        }
        return this.getMin;
    }

    public void showWarningDialog(String str) {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null && !TextUtils.isEmpty(str)) {
            baseActivity.showWarningDialog(str);
        }
    }

    public void showWarningDialog(String str, DialogInterface.OnDismissListener onDismissListener, boolean z, int i) {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null && !TextUtils.isEmpty(str)) {
            baseActivity.showWarningDialog(str, onDismissListener, z, i);
        }
    }

    /* access modifiers changed from: protected */
    public String getStyledAtrributesString(@StyleableRes int i) {
        return this.setMin.getString(i);
    }

    /* access modifiers changed from: protected */
    public TypedArray getStyledAttributes() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    public void setStyledAttributes(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr) {
        this.setMin = context.obtainStyledAttributes(attributeSet, iArr);
    }

    public View getView() {
        return this.toFloatRange;
    }
}
