package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;
import o.calculateDyToMakeVisible;

public class onExitLayoutOrScroll extends onEnterLayoutOrScroll<SurfaceView, SurfaceHolder> {
    /* access modifiers changed from: private */
    public static final CameraLogger toString = CameraLogger.setMin(onExitLayoutOrScroll.class.getSimpleName());
    private View hashCode;
    /* access modifiers changed from: private */
    public boolean toDoubleRange;

    public onExitLayoutOrScroll(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final View length() {
        return this.hashCode;
    }

    @NonNull
    public final Class<SurfaceHolder> getMax() {
        return SurfaceHolder.class;
    }

    @NonNull
    public final /* synthetic */ Object getMin() {
        return ((SurfaceView) this.getMax).getHolder();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final /* synthetic */ View setMin(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(calculateDyToMakeVisible.setMin.cameraview_surface_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        SurfaceView surfaceView = (SurfaceView) inflate.findViewById(calculateDyToMakeVisible.length.setMin);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new SurfaceHolder.Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                onExitLayoutOrScroll.toString.getMax(1, "callback:", "surfaceChanged", "w:", Integer.valueOf(i2), "h:", Integer.valueOf(i3), "dispatched:", Boolean.valueOf(onExitLayoutOrScroll.this.toDoubleRange));
                if (!onExitLayoutOrScroll.this.toDoubleRange) {
                    onExitLayoutOrScroll.this.getMax(i2, i3);
                    boolean unused = onExitLayoutOrScroll.this.toDoubleRange = true;
                    return;
                }
                onExitLayoutOrScroll.this.length(i2, i3);
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                onExitLayoutOrScroll.toString.getMax(1, "callback:", "surfaceDestroyed");
                onExitLayoutOrScroll onexitlayoutorscroll = onExitLayoutOrScroll.this;
                onexitlayoutorscroll.toIntRange = 0;
                onexitlayoutorscroll.IsOverlapping = 0;
                if (onexitlayoutorscroll.setMax != null) {
                    onexitlayoutorscroll.setMax.cancelNotification();
                }
                boolean unused = onExitLayoutOrScroll.this.toDoubleRange = false;
            }
        });
        this.hashCode = inflate;
        return surfaceView;
    }
}
