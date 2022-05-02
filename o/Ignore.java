package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import o.GriverProgressBar;
import o.IMultiInstanceInvalidationService;

public abstract class Ignore<T> extends RecyclerView.valueOf {
    private IRedDotManager getMax;
    public final Context length;
    private final View setMin;

    public interface setMin {
        void length(int i);
    }

    public void setMax(T t) {
    }

    public Ignore(Context context, int i, ViewGroup viewGroup) {
        this(context, LayoutInflater.from(context).inflate(i, viewGroup, false));
    }

    private Ignore(Context context, View view) {
        super(view);
        ButterKnife.setMax((Object) this, view);
        this.length = context;
        this.setMin = view;
    }

    public void setMin(setMin setmin) {
        View view = this.setMin;
        if (view != null && setmin != null) {
            view.setOnClickListener(new IMultiInstanceInvalidationService.Default(this, setmin));
        }
    }

    public final void getMin(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.getMax == null) {
            this.getMax = new IRedDotManager();
        }
        this.getMax.getMin(updateRunnable);
    }

    public void getMin() {
        IRedDotManager iRedDotManager = this.getMax;
        if (iRedDotManager != null && !iRedDotManager.isDisposed()) {
            this.getMax.dispose();
        }
    }

    static /* synthetic */ void setMin(Ignore ignore, setMin setmin) {
        if (ignore.getAbsoluteAdapterPosition() >= 0) {
            setmin.length(ignore.getAbsoluteAdapterPosition());
        }
    }
}
