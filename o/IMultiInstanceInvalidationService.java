package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.LayoutRes;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import o.Ignore;

public abstract class IMultiInstanceInvalidationService<E> {
    public Context length;
    private isBaselineAligned setMax;
    Unbinder setMin;

    final class Default implements View.OnClickListener {
        private final Ignore length;
        private final Ignore.setMin setMax;

        public Default(Ignore ignore, Ignore.setMin setmin) {
            this.length = ignore;
            this.setMax = setmin;
        }

        public final void onClick(View view) {
            Ignore.setMin(this.length, this.setMax);
        }
    }

    /* access modifiers changed from: protected */
    public void setMin(View view, E e) {
    }

    public class Stub {
        private String errorCode;
        private String errorMessage;
        private boolean success;

        public final class Proxy implements getAdapterPosition<broadcastInvalidation> {

            static final class setMax {
                /* access modifiers changed from: private */
                public static final Proxy getMax = new Proxy();
            }

            public static Proxy getMax() {
                return setMax.getMax;
            }

            public final /* synthetic */ Object get() {
                return new broadcastInvalidation();
            }
        }

        public boolean isSuccess() {
            return this.success;
        }

        public void setSuccess(boolean z) {
            this.success = z;
        }

        public String getErrorCode() {
            return this.errorCode;
        }

        public void setErrorCode(String str) {
            this.errorCode = str;
        }

        public String getErrorMessage() {
            return this.errorMessage;
        }

        public void setErrorMessage(String str) {
            this.errorMessage = str;
        }
    }

    public IMultiInstanceInvalidationService(Context context, DialogInterface.OnDismissListener onDismissListener, @LayoutRes Integer num, E e) {
        this(context, onDismissListener, (DialogInterface.OnCancelListener) null, num, e);
    }

    public IMultiInstanceInvalidationService(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener, @LayoutRes Integer num, E e) {
        View inflate = View.inflate(context, num.intValue(), (ViewGroup) null);
        this.length = context;
        isBaselineAligned isbaselinealigned = new isBaselineAligned(context, isBaselineAligned.getDEFAULT_BEHAVIOR());
        this.setMax = isbaselinealigned;
        isbaselinealigned.setOnDismissListener(onDismissListener);
        this.setMax.setOnCancelListener(onCancelListener);
        setBaselineAlignedChildIndex.customView(this.setMax, (Integer) null, inflate, false, false, false, false);
        if (e instanceof setMin) {
            setMin setmin = (setMin) e;
            this.setMax.cancelable(setmin.setMax).cancelOnTouchOutside(setmin.getMax);
        }
        this.setMin = ButterKnife.setMax((Object) this, (Dialog) this.setMax);
        Window window = this.setMax.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setMin(inflate, e);
    }

    public void setMin() {
        if (this.setMin == null) {
            this.setMin = ButterKnife.setMax((Object) this, (Dialog) this.setMax);
        }
        if (!this.setMax.isShowing()) {
            this.setMax.show();
        }
    }

    public final void setMax() {
        if (setTopBackgroundColor.getMin(this.length)) {
            this.setMax.dismiss();
            Unbinder unbinder = this.setMin;
            if (unbinder != null) {
                RawQuery.getMax(unbinder, new unregisterCallback(this));
            }
        }
    }

    public final boolean getMin() {
        isBaselineAligned isbaselinealigned = this.setMax;
        return isbaselinealigned != null && isbaselinealigned.isShowing();
    }

    public final isBaselineAligned getMax() {
        return this.setMax;
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public boolean getMax = true;
        /* access modifiers changed from: private */
        public boolean setMax = true;

        /* access modifiers changed from: protected */
        public final void setMin(boolean z) {
            this.getMax = z;
        }

        /* access modifiers changed from: protected */
        public final void length(boolean z) {
            this.setMax = z;
        }
    }
}
