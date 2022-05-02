package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.component.formcomponent.DanaCheckboxButtonView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.StartupException;
import o.setBackgroundColorRes;
import o.setSlingshotDistance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0017\u0010(\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010-\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0017\u0010.\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010)J\u0010\u0010/\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0017\u00101\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010)J\u0017\u00102\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010)J\u0018\u00103\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0017\u00104\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010)J&\u00105\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lid/dana/component/dialogcomponent/CustomDialog;", "Lid/dana/component/BaseMaterialDialog;", "Lid/dana/component/dialogcomponent/CustomDialog$Builder;", "context", "Landroid/content/Context;", "resource", "", "builder", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "(Landroid/content/Context;ILid/dana/component/dialogcomponent/CustomDialog$Builder;Landroid/content/DialogInterface$OnDismissListener;)V", "btnCustomNegative", "Landroid/widget/Button;", "btnCustomPositive", "btnSingleSpace", "cbNeverShowAgain", "Lid/dana/component/formcomponent/DanaCheckboxButtonView;", "clActionDialog", "Landroidx/constraintlayout/widget/ConstraintLayout;", "etCustomEditText", "Landroid/widget/EditText;", "ivCustomIcon", "Landroid/widget/ImageView;", "ivCustomImage", "rlCustomIcon", "Landroid/widget/RelativeLayout;", "rlCustomImage", "rlSingleSpace", "tvMessage", "Landroid/widget/TextView;", "tvTitle", "changeButtonToHorizontal", "", "marginInDp", "changeButtonToVertical", "init", "dialogView", "Landroid/view/View;", "setButtonOrientation", "setDismissActionTo", "setEditText", "(Lid/dana/component/dialogcomponent/CustomDialog$Builder;)Lkotlin/Unit;", "setIcon", "setImage", "setImageByUrl", "setImageLocal", "setMessage", "setNegativeButton", "setPositiveButton", "setSingleButton", "setTitle", "setup", "setupNeverShowDialogAgainCheckBox", "showActionDialogButton", "button", "textInButton", "", "listener", "Landroid/view/View$OnClickListener;", "Builder", "design_release"}, k = 1, mv = {1, 4, 2})
public final class getProgressViewStartOffset extends StartupException<getMax> {
    private ImageView FastBitmap$CoordinateSystem;
    private ConstraintLayout IsOverlapping;
    private Button equals;
    private Button hashCode;
    private RelativeLayout invoke;
    private RelativeLayout isInside;
    private RelativeLayout length;
    private ImageView setMax;
    private EditText toDoubleRange;
    private TextView toFloatRange;
    private TextView toIntRange;
    private Button toString;
    private DanaCheckboxButtonView values;

    public /* synthetic */ getProgressViewStartOffset(Context context, int i, getMax getmax, DialogInterface.OnDismissListener onDismissListener, byte b) {
        this(context, i, getmax, onDismissListener);
    }

    public final /* synthetic */ void getMin(View view, Object obj) {
        View findViewById;
        getMax getmax = (getMax) obj;
        Intrinsics.checkNotNullParameter(view, "dialogView");
        Intrinsics.checkNotNullParameter(getmax, "builder");
        this.setMax = (ImageView) view.findViewById(setBackgroundColorRes.length.ICustomTabsCallback);
        this.length = (RelativeLayout) view.findViewById(setBackgroundColorRes.length.setDefaultImpl);
        this.isInside = (RelativeLayout) view.findViewById(setBackgroundColorRes.length.getDefaultImpl);
        this.IsOverlapping = (ConstraintLayout) view.findViewById(setBackgroundColorRes.length.toFloatRange);
        this.toIntRange = (TextView) view.findViewById(16908310);
        this.toFloatRange = (TextView) view.findViewById(16908304);
        this.equals = (Button) view.findViewById(setBackgroundColorRes.length.length);
        this.hashCode = (Button) view.findViewById(setBackgroundColorRes.length.setMax);
        this.toDoubleRange = (EditText) view.findViewById(16908297);
        this.FastBitmap$CoordinateSystem = (ImageView) view.findViewById(setBackgroundColorRes.length.create);
        this.toString = (Button) view.findViewById(setBackgroundColorRes.length.getMin);
        this.invoke = (RelativeLayout) view.findViewById(setBackgroundColorRes.length.ICustomTabsService);
        this.values = (DanaCheckboxButtonView) view.findViewById(setBackgroundColorRes.length.isInside);
        ImageView imageView = this.setMax;
        int i = 8;
        if (imageView != null) {
            if (getmax.getMin != 0) {
                int i2 = getmax.getMin;
                Intrinsics.checkNotNullParameter(imageView, "$this$setSupportImageResource");
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                Intrinsics.checkNotNullParameter(context, "$this$getSupportDrawable");
                imageView.setImageDrawable(cancelAll.getMin(context, i2));
            } else {
                RelativeLayout relativeLayout = this.length;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
            }
        }
        TextView textView = this.toFloatRange;
        if (textView != null) {
            if (getmax.isInside != null) {
                textView.setText(getmax.isInside);
            } else {
                textView.setVisibility(8);
            }
            Unit unit = Unit.INSTANCE;
        }
        TextView textView2 = this.toIntRange;
        if (textView2 != null) {
            if (getmax.toFloatRange != null) {
                textView2.setText(getmax.toFloatRange);
            } else {
                textView2.setVisibility(8);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        EditText editText = this.toDoubleRange;
        if (editText != null) {
            if (getmax.invokeSuspend != null) {
                editText.setHint(getmax.invokeSuspend);
            } else {
                editText.setVisibility(8);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!(this.isInside == null || this.FastBitmap$CoordinateSystem == null)) {
            if (getmax.valueOf != null) {
                CharSequence charSequence = getmax.valueOf;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    if (getmax.getMax == 0) {
                        setFirstVerticalBias<Drawable> max = Glide.getMax(this.getMax).getMax(getmax.valueOf);
                        ImageView imageView2 = this.FastBitmap$CoordinateSystem;
                        Intrinsics.checkNotNull(imageView2);
                        max.length(imageView2);
                    } else {
                        ImageView imageView3 = this.FastBitmap$CoordinateSystem;
                        Intrinsics.checkNotNull(imageView3);
                        ((setFirstVerticalBias) Glide.getMax(this.getMax).getMax(getmax.valueOf).length(getmax.getMax)).length(imageView3);
                    }
                }
            } else if (getmax.setMax == 0) {
                RelativeLayout relativeLayout2 = this.isInside;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
            } else if (getmax.setMax != 0) {
                ImageView imageView4 = this.FastBitmap$CoordinateSystem;
                if (imageView4 != null) {
                    int i3 = getmax.setMax;
                    Intrinsics.checkNotNullParameter(imageView4, "$this$setSupportImageResource");
                    Context context2 = imageView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                    Intrinsics.checkNotNullParameter(context2, "$this$getSupportDrawable");
                    imageView4.setImageDrawable(cancelAll.getMin(context2, i3));
                }
            } else {
                RelativeLayout relativeLayout3 = this.isInside;
                if (relativeLayout3 != null) {
                    relativeLayout3.setVisibility(8);
                }
            }
        }
        RelativeLayout relativeLayout4 = this.invoke;
        if (relativeLayout4 != null) {
            if (getmax.Grayscale$Algorithm != null) {
                Button button = this.toString;
                if (button != null) {
                    button.setText(getmax.Grayscale$Algorithm);
                }
                Button button2 = this.toString;
                if (button2 != null) {
                    button2.setOnClickListener(getmax.hashCode);
                    Unit unit4 = Unit.INSTANCE;
                }
            } else {
                relativeLayout4.setVisibility(8);
                Unit unit5 = Unit.INSTANCE;
            }
        }
        length(this.equals, getmax.toDoubleRange, getmax.values);
        length(this.hashCode, getmax.toString, getmax.FastBitmap$CoordinateSystem);
        if (!(getmax.setMin == 0 || (findViewById = view.findViewById(getmax.setMin)) == null)) {
            findViewById.setOnClickListener(new setMin(this));
        }
        int i4 = 4;
        if (getmax.invoke instanceof Activity) {
            Context context3 = getmax.invoke;
            if (context3 != null) {
                i4 = setRefreshing.setMax((Activity) context3, 4.0f);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        if (getmax.setMax()) {
            if (!(this.IsOverlapping == null || this.equals == null || this.hashCode == null)) {
                from from = new from();
                from.setMax(this.IsOverlapping);
                from.length(setBackgroundColorRes.length.length, 1, 1);
                from.length(setBackgroundColorRes.length.length, 2, 2);
                from.length(setBackgroundColorRes.length.length, 3, 3);
                from.length(setBackgroundColorRes.length.setMax, 1, 1);
                from.length(setBackgroundColorRes.length.setMax, 2, 2);
                from.length(setBackgroundColorRes.length.setMax, 3, setBackgroundColorRes.length.length, 4, i4);
                from.setMin(this.IsOverlapping);
            }
        } else if (!(this.IsOverlapping == null || this.equals == null || this.hashCode == null)) {
            from from2 = new from();
            from2.setMax(this.IsOverlapping);
            from2.length(setBackgroundColorRes.length.length, 1, 1);
            from from3 = from2;
            int i5 = i4;
            from3.length(setBackgroundColorRes.length.length, 2, setBackgroundColorRes.length.setMax, 1, i5);
            from2.length(setBackgroundColorRes.length.length, 3, 3);
            from3.length(setBackgroundColorRes.length.setMax, 1, setBackgroundColorRes.length.length, 2, i5);
            from2.length(setBackgroundColorRes.length.setMax, 2, 2);
            from2.length(setBackgroundColorRes.length.setMax, 3, 3);
            from2.setMin(this.IsOverlapping);
        }
        DanaCheckboxButtonView danaCheckboxButtonView = this.values;
        if (danaCheckboxButtonView != null) {
            View view2 = danaCheckboxButtonView;
            if (getmax.getMax()) {
                i = 0;
            }
            view2.setVisibility(i);
            danaCheckboxButtonView.setChecked(getmax.setMin());
            danaCheckboxButtonView.setOnCheckedChangeListener(getmax.IsOverlapping);
            Unit unit6 = Unit.INSTANCE;
        }
    }

    private getProgressViewStartOffset(Context context, int i, getMax getmax, DialogInterface.OnDismissListener onDismissListener) {
        super(context, i, getmax, onDismissListener);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ getProgressViewStartOffset getMin;

        setMin(getProgressViewStartOffset getprogressviewstartoffset) {
            this.getMin = getprogressviewstartoffset;
        }

        public final void onClick(View view) {
            isBaselineAligned isbaselinealigned;
            getProgressViewStartOffset getprogressviewstartoffset = this.getMin;
            if (setProgressViewEndTarget.setMax(getprogressviewstartoffset.getMax) && (isbaselinealigned = getprogressviewstartoffset.setMin) != null) {
                isbaselinealigned.dismiss();
            }
        }
    }

    private final void length(Button button, CharSequence charSequence, View.OnClickListener onClickListener) {
        ConstraintLayout constraintLayout = this.IsOverlapping;
        if (constraintLayout != null && button != null && charSequence != null) {
            Intrinsics.checkNotNull(constraintLayout);
            constraintLayout.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new getMin(this, onClickListener));
        } else if (button != null) {
            button.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ getProgressViewStartOffset getMin;
        final /* synthetic */ View.OnClickListener setMax;

        getMin(getProgressViewStartOffset getprogressviewstartoffset, View.OnClickListener onClickListener) {
            this.getMin = getprogressviewstartoffset;
            this.setMax = onClickListener;
        }

        public final void onClick(View view) {
            isBaselineAligned isbaselinealigned;
            getProgressViewStartOffset getprogressviewstartoffset = this.getMin;
            if (setProgressViewEndTarget.setMax(getprogressviewstartoffset.getMax) && (isbaselinealigned = getprogressviewstartoffset.setMin) != null) {
                isbaselinealigned.dismiss();
            }
            View.OnClickListener onClickListener = this.setMax;
            if (onClickListener != null) {
                onClickListener.onClick(this.getMin.getMax());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010W\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u000204H\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u000204H\u0016J\u0010\u0010]\u001a\u00020\u00002\b\b\u0001\u0010H\u001a\u00020\u0016J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010_\u001a\u00020\u00002\b\b\u0001\u0010T\u001a\u00020\u0016J\u001a\u0010`\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0aJ\u0010\u0010`\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010d\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010\"J\u0010\u0010f\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u0016J\u0010\u0010g\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\u0016J\u0010\u0010h\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u0016J\u0010\u0010i\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010j\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0006J$\u0010k\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u00062\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020c0aJ\u001a\u0010k\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010.J$\u0010m\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020c0aJ\u001a\u0010m\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010E\u001a\u0004\u0018\u00010.J$\u0010n\u001a\u00020\u00002\b\u0010o\u001a\u0004\u0018\u00010\u00062\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020c0aJ\u001a\u0010n\u001a\u00020\u00002\b\u0010o\u001a\u0004\u0018\u00010\u00062\b\u0010K\u001a\u0004\u0018\u00010.J\u0010\u0010p\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010\u0006J\u000e\u0010q\u001a\u00020\u00002\u0006\u0010Q\u001a\u000204J\u0006\u0010r\u001a\u00020XJ\u001c\u0010s\u001a\u00020\u00002\b\b\u0002\u0010t\u001a\u0002042\n\b\u0002\u0010u\u001a\u0004\u0018\u00010:R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001c\u0010*\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u001c\u0010B\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\b\"\u0004\bD\u0010\nR\u001c\u0010E\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00100\"\u0004\bG\u00102R\u001e\u0010H\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0018\"\u0004\bJ\u0010\u001aR\u001c\u0010K\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00100\"\u0004\bM\u00102R\u001c\u0010N\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\b\"\u0004\bP\u0010\nR\u001a\u0010Q\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00106\"\u0004\bS\u00108R\u001e\u0010T\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u0010\u001a¨\u0006v"}, d2 = {"Lid/dana/component/dialogcomponent/CustomDialog$Builder;", "Lid/dana/component/BaseMaterialDialog$Cancellation;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buttonSingleSpace", "", "getButtonSingleSpace$design_release", "()Ljava/lang/CharSequence;", "setButtonSingleSpace$design_release", "(Ljava/lang/CharSequence;)V", "getContext", "()Landroid/content/Context;", "setContext", "delay", "", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "editTextHint", "getEditTextHint$design_release", "setEditTextHint$design_release", "icon", "", "getIcon$design_release", "()I", "setIcon$design_release", "(I)V", "imageLocal", "getImageLocal$design_release", "setImageLocal$design_release", "imagePlaceholder", "getImagePlaceholder$design_release", "setImagePlaceholder$design_release", "imageUrl", "", "getImageUrl$design_release", "()Ljava/lang/String;", "setImageUrl$design_release", "(Ljava/lang/String;)V", "message", "getMessage$design_release", "setMessage$design_release", "negativeButton", "getNegativeButton$design_release", "setNegativeButton$design_release", "negativeClickListener", "Landroid/view/View$OnClickListener;", "getNegativeClickListener$design_release", "()Landroid/view/View$OnClickListener;", "setNegativeClickListener$design_release", "(Landroid/view/View$OnClickListener;)V", "neverShowDialogAgain", "", "getNeverShowDialogAgain$design_release", "()Z", "setNeverShowDialogAgain$design_release", "(Z)V", "neverShowDialogAgainCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getNeverShowDialogAgainCheckedChangeListener$design_release", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setNeverShowDialogAgainCheckedChangeListener$design_release", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "neverShowDialogAgainInitialCheckedState", "getNeverShowDialogAgainInitialCheckedState$design_release", "setNeverShowDialogAgainInitialCheckedState$design_release", "positiveButton", "getPositiveButton$design_release", "setPositiveButton$design_release", "positiveClickListener", "getPositiveClickListener$design_release", "setPositiveClickListener$design_release", "resource", "getResource$design_release", "setResource$design_release", "singleButtonClickListener", "getSingleButtonClickListener$design_release", "setSingleButtonClickListener$design_release", "title", "getTitle$design_release", "setTitle$design_release", "verticalButton", "getVerticalButton$design_release", "setVerticalButton$design_release", "viewId", "getViewId$design_release", "setViewId$design_release", "build", "Lcom/afollestad/materialdialogs/MaterialDialog;", "setCancelOutside", "cancelOutside", "setCancelable", "cancelable", "setCustomLayout", "setDelay", "setDismissActionTo", "setDismissListener", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "", "setEditTextPlaceholder", "placeholder", "setIcon", "setImageLocal", "setImagePlacholder", "setImageUrl", "setMessage", "setNegativeButton", "Landroid/view/View;", "setPositiveButton", "setSingleSpaceButton", "singleSpaceButton", "setTitle", "setVerticalButton", "show", "withOptionNeverShowDialogAgain", "initialState", "checkedChangeListener", "design_release"}, k = 1, mv = {1, 4, 2})
    public static class getMax extends StartupException.getMin {
        @Nullable
        public View.OnClickListener FastBitmap$CoordinateSystem;
        @Nullable
        CharSequence Grayscale$Algorithm;
        private boolean ICustomTabsCallback;
        @Nullable
        CompoundButton.OnCheckedChangeListener IsOverlapping;
        private boolean Mean$Arithmetic;
        public DialogInterface.OnDismissListener equals;
        private boolean getCause;
        @DrawableRes
        int getMax;
        @DrawableRes
        int getMin;
        @Nullable
        View.OnClickListener hashCode;
        @NotNull
        public Context invoke;
        @Nullable
        CharSequence invokeSuspend;
        @Nullable
        public CharSequence isInside;
        @LayoutRes
        public int length = setBackgroundColorRes.toIntRange.view_custom_dialog;
        @DrawableRes
        public int setMax;
        @IdRes
        int setMin;
        @Nullable
        public CharSequence toDoubleRange;
        @Nullable
        public CharSequence toFloatRange;
        public long toIntRange = 3000;
        @Nullable
        public CharSequence toString;
        @Nullable
        String valueOf;
        @Nullable
        public View.OnClickListener values;

        public getMax(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            this.invoke = context;
        }

        public final boolean getMax() {
            return this.Mean$Arithmetic;
        }

        public final boolean setMin() {
            return this.getCause;
        }

        public final boolean setMax() {
            return this.ICustomTabsCallback;
        }

        @NotNull
        public final getMax setMin(@Nullable CharSequence charSequence, @NotNull Function1<? super View, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "positiveClickListener");
            getMax getmax = this;
            getmax.toString = charSequence;
            getmax.FastBitmap$CoordinateSystem = new setOnRefreshListener(function1);
            return getmax;
        }

        @NotNull
        public final getMax getMax(@Nullable CharSequence charSequence, @NotNull Function1<? super View, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "negativeClickListener");
            getMax getmax = this;
            getmax.toDoubleRange = charSequence;
            getmax.values = new setOnRefreshListener(function1);
            return getmax;
        }

        @NotNull
        public final getMax setMax(boolean z) {
            StartupException.getMin max = super.getMax(z);
            if (max != null) {
                return (getMax) max;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.component.dialogcomponent.CustomDialog.Builder");
        }

        @NotNull
        public final getMax IsOverlapping() {
            StartupException.getMin min = super.getMin(false);
            if (min != null) {
                return (getMax) min;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.component.dialogcomponent.CustomDialog.Builder");
        }

        public final /* synthetic */ StartupException.getMin getMax(boolean z) {
            StartupException.getMin max = super.getMax(z);
            if (max != null) {
                return (getMax) max;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.component.dialogcomponent.CustomDialog.Builder");
        }

        public final /* synthetic */ StartupException.getMin getMin(boolean z) {
            StartupException.getMin min = super.getMin(z);
            if (min != null) {
                return (getMax) min;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.component.dialogcomponent.CustomDialog.Builder");
        }

        @NotNull
        public final isBaselineAligned equals() {
            isBaselineAligned min = new getProgressViewStartOffset(this.invoke, this.length, this, this.equals, (byte) 0).getMin();
            long j = this.toIntRange;
            Intrinsics.checkNotNullParameter(min, "$this$show");
            min.show();
            if (j > 0) {
                new Handler().postDelayed(new setSlingshotDistance.setMin(min), j);
            }
            return min;
        }
    }
}
