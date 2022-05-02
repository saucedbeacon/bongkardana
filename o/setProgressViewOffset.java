package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.ContentViewCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.setBackgroundColorRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001:\u0002\u0013\u0014B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar;", "parent", "Landroid/view/ViewGroup;", "content", "Landroid/view/View;", "contentViewCallback", "Lcom/google/android/material/snackbar/ContentViewCallback;", "datas", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar$Builder;", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;Lid/dana/component/customsnackbarcomponent/CustomSnackbar$Builder;)V", "initSnackbar", "", "setAction", "setBorder", "setButtonText", "setIcon", "setText", "setup", "Builder", "Callback", "design_release"}, k = 1, mv = {1, 4, 2})
public final class setProgressViewOffset extends BaseTransientBottomBar<setProgressViewOffset> {
    private final setMax setMin;

    public /* synthetic */ setProgressViewOffset(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback, setMax setmax, byte b) {
        this(viewGroup, view, contentViewCallback, setmax);
    }

    private setProgressViewOffset(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback, setMax setmax) {
        super(viewGroup, view, contentViewCallback);
        this.setMin = setmax;
        getView().setBackgroundColor(IntRange.setMax(viewGroup.getContext(), 17170445));
        getView().setPadding(0, 0, 0, 0);
        setDuration(this.setMin.toIntRange);
        String str = this.setMin.getMax;
        if (str != null) {
            View view2 = getView();
            Intrinsics.checkNotNullExpressionValue(view2, "getView()");
            TextView textView = (TextView) view2.findViewById(setBackgroundColorRes.length.newSessionWithExtras);
            if (textView != null) {
                textView.setText(str);
            }
        }
        View.OnClickListener onClickListener = this.setMin.length;
        if (onClickListener != null) {
            View view3 = getView();
            Intrinsics.checkNotNullExpressionValue(view3, "getView()");
            Button button = (Button) view3.findViewById(setBackgroundColorRes.length.setMin);
            if (button != null) {
                button.setOnClickListener(onClickListener);
            }
        }
        String str2 = this.setMin.setMax;
        if (str2 != null) {
            View view4 = getView();
            Intrinsics.checkNotNullExpressionValue(view4, "getView()");
            Button button2 = (Button) view4.findViewById(setBackgroundColorRes.length.setMin);
            if (button2 != null) {
                button2.setVisibility(0);
                button2.setText(str2);
            }
        }
        if (this.setMin.setMin != 0) {
            View view5 = getView();
            Intrinsics.checkNotNullExpressionValue(view5, "getView()");
            ImageView imageView = (ImageView) view5.findViewById(setBackgroundColorRes.length.valueOf);
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(cancelAll.getMin(imageView.getContext(), this.setMin.setMin));
            }
        }
        View view6 = getView();
        Intrinsics.checkNotNullExpressionValue(view6, "getView()");
        ConstraintLayout constraintLayout = (ConstraintLayout) view6.findViewById(setBackgroundColorRes.length.IsOverlapping);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            constraintLayout.setBackgroundResource(this.setMin.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/component/customsnackbarcomponent/CustomSnackbar$Callback;", "Lcom/google/android/material/snackbar/ContentViewCallback;", "content", "Landroid/view/View;", "(Landroid/view/View;)V", "animateContentIn", "", "delay", "", "duration", "animateContentOut", "design_release"}, k = 1, mv = {1, 4, 2})
    static final class getMin implements ContentViewCallback {
        private final View setMin;

        public getMin(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "content");
            this.setMin = view;
        }

        public final void animateContentIn(int i, int i2) {
            ViewCompat.length(this.setMin, 0.0f);
            invalidateOptionsMenu min = ViewCompat.Grayscale$Algorithm(this.setMin).setMax(1.0f).getMin((long) i2);
            Intrinsics.checkNotNullExpressionValue(min, "ViewCompat.animate(conte…ration(duration.toLong())");
            min.setMin((long) i);
        }

        public final void animateContentOut(int i, int i2) {
            ViewCompat.length(this.setMin, 1.0f);
            invalidateOptionsMenu min = ViewCompat.Grayscale$Algorithm(this.setMin).setMax(0.0f).getMin((long) i2);
            Intrinsics.checkNotNullExpressionValue(min, "ViewCompat.animate(conte…ration(duration.toLong())");
            min.setMin((long) i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u0006J\u0010\u0010+\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010,\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u001e\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lid/dana/component/customsnackbarcomponent/CustomSnackbar$Builder;", "", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "layout", "", "getLayout", "()I", "setLayout", "(I)V", "snackbarBorder", "getSnackbarBorder", "setSnackbarBorder", "snackbarButtonText", "", "getSnackbarButtonText", "()Ljava/lang/String;", "setSnackbarButtonText", "(Ljava/lang/String;)V", "snackbarDuration", "getSnackbarDuration$design_release$annotations", "()V", "getSnackbarDuration$design_release", "setSnackbarDuration$design_release", "snackbarIcon", "getSnackbarIcon", "setSnackbarIcon", "snackbarOnClickListener", "Landroid/view/View$OnClickListener;", "getSnackbarOnClickListener", "()Landroid/view/View$OnClickListener;", "setSnackbarOnClickListener", "(Landroid/view/View$OnClickListener;)V", "snackbarText", "getSnackbarText$design_release", "setSnackbarText$design_release", "build", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "setBorder", "setButtonText", "setDuration", "setIcon", "setOnClickListener", "setText", "design_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @Nullable
        public String getMax;
        @DrawableRes
        public int getMin;
        @LayoutRes
        private int isInside = setBackgroundColorRes.toIntRange.view_custom_overlays_snackbar;
        @Nullable
        public View.OnClickListener length;
        @Nullable
        public String setMax;
        @DrawableRes
        public int setMin;
        private final ViewGroup toFloatRange;
        public int toIntRange = -2;

        public setMax(@NotNull ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            this.toFloatRange = viewGroup;
        }

        @NotNull
        public final setProgressViewOffset getMax() {
            View inflate = LayoutInflater.from(this.toFloatRange.getContext()).inflate(this.isInside, this.toFloatRange, false);
            ViewGroup viewGroup = this.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(inflate, "content");
            return new setProgressViewOffset(viewGroup, inflate, new getMin(inflate), this, (byte) 0);
        }
    }
}
