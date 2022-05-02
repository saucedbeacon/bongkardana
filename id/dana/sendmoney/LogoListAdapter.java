package id.dana.sendmoney;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import id.dana.R;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.LandScapeTinyMenuPopupWindow;
import o.drawDividersHorizontal;
import o.getDefaultProxy;
import o.setOnMenuWindowDismissListener;

public class LogoListAdapter extends IMultiInstanceInvalidationCallback.Stub<LogoViewHolder, getDefaultProxy> {

    public class LogoViewHolder_ViewBinding implements Unbinder {
        private LogoViewHolder setMin;

        @UiThread
        public LogoViewHolder_ViewBinding(LogoViewHolder logoViewHolder, View view) {
            this.setMin = logoViewHolder;
            logoViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        }

        @CallSuper
        public final void setMax() {
            LogoViewHolder logoViewHolder = this.setMin;
            if (logoViewHolder != null) {
                this.setMin = null;
                logoViewHolder.ivLogo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class LogoViewHolder extends Ignore<getDefaultProxy> {
        private final LandScapeTinyMenuPopupWindow.AnonymousClass1 getMin = new LandScapeTinyMenuPopupWindow.AnonymousClass1((byte) 0);
        @BindView(2131363519)
        ImageView ivLogo;

        public final /* synthetic */ void setMax(Object obj) {
            getDefaultProxy getdefaultproxy = (getDefaultProxy) obj;
            if (getdefaultproxy != null) {
                this.getMin.getMax(this.length, this.ivLogo, getdefaultproxy.getContentValue(), 0, (setOnMenuWindowDismissListener.length) null);
            }
        }

        LogoViewHolder(ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_logo, viewGroup);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LogoViewHolder(viewGroup);
    }
}
