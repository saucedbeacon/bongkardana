package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.ContentViewCallback;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001:\u0002\u0015\u0016B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/social/view/ModifyRelationshipSnackbar;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar;", "parent", "Landroid/view/ViewGroup;", "content", "Landroid/view/View;", "contentViewCallback", "Lcom/google/android/material/snackbar/ContentViewCallback;", "datas", "Lid/dana/social/view/ModifyRelationshipSnackbar$Builder;", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;Lid/dana/social/view/ModifyRelationshipSnackbar$Builder;)V", "initSnackbar", "", "setAction", "setButtonText", "setDescription", "description", "", "setIcon", "setText", "setup", "Builder", "Callback", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getButtonItem extends BaseTransientBottomBar<getButtonItem> {
    private final setMin getMax;

    public /* synthetic */ getButtonItem(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback, setMin setmin, byte b) {
        this(viewGroup, view, contentViewCallback, setmin);
    }

    private getButtonItem(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback, setMin setmin) {
        super(viewGroup, view, contentViewCallback);
        ImageView imageView;
        Button button;
        Button button2;
        Button button3;
        TextView textView;
        this.getMax = setmin;
        getView().setBackgroundColor(IntRange.setMax(viewGroup.getContext(), R.color.f24462131100394));
        View view2 = getView();
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        view2.setPadding(0, 0, 0, setRecentUseTinyAppList.setMin(context));
        setDuration(this.getMax.equals);
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.view;
        if (!(snackbarBaseLayout == null || (textView = (TextView) snackbarBaseLayout.findViewById(resetInternal.setMax.setThumbTintMode)) == null)) {
            textView.setText(this.getMax.length);
        }
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout2 = this.view;
        if (!(snackbarBaseLayout2 == null || (button3 = (Button) snackbarBaseLayout2.findViewById(resetInternal.setMax.write)) == null)) {
            button3.setOnClickListener(this.getMax.getMin);
        }
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout3 = this.view;
        if (!(snackbarBaseLayout3 == null || (button2 = (Button) snackbarBaseLayout3.findViewById(resetInternal.setMax.write)) == null)) {
            button2.setVisibility(0);
        }
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout4 = this.view;
        if (!(snackbarBaseLayout4 == null || (button = (Button) snackbarBaseLayout4.findViewById(resetInternal.setMax.write)) == null)) {
            button.setText(this.getMax.setMax);
        }
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout5 = this.view;
        if (snackbarBaseLayout5 != null && (imageView = (ImageView) snackbarBaseLayout5.findViewById(resetInternal.setMax.setDither)) != null) {
            imageView.setImageResource(this.getMax.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J0\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/social/view/ModifyRelationshipSnackbar$Callback;", "Lcom/google/android/material/snackbar/ContentViewCallback;", "content", "Landroid/view/View;", "(Landroid/view/View;)V", "animateContentIn", "", "delay", "", "duration", "animateContentOut", "setScaleAnimation", "startScale", "", "endScale", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements ContentViewCallback {
        private final View length;

        public getMax(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "content");
            this.length = view;
        }

        public final void animateContentIn(int i, int i2) {
            View view = this.length;
            ViewCompat.length(view, 0.0f);
            invalidateOptionsMenu min = ViewCompat.Grayscale$Algorithm(view).setMax(1.0f).getMin((long) i2);
            Intrinsics.checkNotNullExpressionValue(min, "ViewCompat.animate(conte…ration(duration.toLong())");
            min.setMin((long) i);
        }

        public final void animateContentOut(int i, int i2) {
            View view = this.length;
            ViewCompat.length(view, 1.0f);
            invalidateOptionsMenu min = ViewCompat.Grayscale$Algorithm(view).setMax(0.0f).getMin((long) i2);
            Intrinsics.checkNotNullExpressionValue(min, "ViewCompat.animate(conte…ration(duration.toLong())");
            min.setMin((long) i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/social/view/ModifyRelationshipSnackbar$Builder;", "", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "layout", "", "getLayout", "()I", "setLayout", "(I)V", "snackbarButtonText", "", "getSnackbarButtonText", "()Ljava/lang/String;", "setSnackbarButtonText", "(Ljava/lang/String;)V", "snackbarDuration", "getSnackbarDuration", "setSnackbarDuration", "snackbarIcon", "getSnackbarIcon", "setSnackbarIcon", "snackbarOnClickListener", "Landroid/view/View$OnClickListener;", "getSnackbarOnClickListener", "()Landroid/view/View$OnClickListener;", "setSnackbarOnClickListener", "(Landroid/view/View$OnClickListener;)V", "snackbarText", "getSnackbarText", "setSnackbarText", "build", "Lid/dana/social/view/ModifyRelationshipSnackbar;", "setDuration", "setIcon", "setOnClickListener", "setText", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        public int equals = -2;
        int getMax;
        @NotNull
        public View.OnClickListener getMin = C0058setMin.setMin;
        @NotNull
        public String length = "";
        @NotNull
        public String setMax = "";
        public int setMin = R.layout.view_modify_relationship_snackbar;
        public final ViewGroup toFloatRange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.getButtonItem$setMin$setMin  reason: collision with other inner class name */
        static final class C0058setMin implements View.OnClickListener {
            public static final C0058setMin setMin = new C0058setMin();

            C0058setMin() {
            }

            public final void onClick(View view) {
            }
        }

        public setMin(@NotNull ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            this.toFloatRange = viewGroup;
        }
    }
}
