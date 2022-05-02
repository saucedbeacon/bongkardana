package o;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CheckResult;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.isMeasureWithLargestChildEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 q2\u00020\u0001:\u0001qB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bJ\u0006\u0010H\u001a\u00020\u0000J\b\u0010I\u001a\u00020\u0000H\u0007J\u0006\u0010J\u001a\u00020\u0000J\u0019\u0010$\u001a\u0002HK\"\u0004\b\u0000\u0010K2\u0006\u0010L\u001a\u00020&¢\u0006\u0002\u0010MJ#\u0010+\u001a\u00020\u00002\n\b\u0002\u0010N\u001a\u0004\u0018\u00010*2\n\b\u0003\u0010O\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010PJ\u0012\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010Q\u001a\u00020\bH\u0007J\b\u0010R\u001a\u00020\u001aH\u0016J#\u0010S\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U¢\u0006\u0002\u0010VJ\b\u0010W\u001a\u00020\u001aH\u0002J#\u00105\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0003\u0010X\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010YJ@\u0010Z\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001b\b\u0002\u0010]\u001a\u0015\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0002\b_¢\u0006\u0002\u0010`JA\u0010a\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001c\b\u0002\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b¢\u0006\u0002\u0010`JC\u0010c\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001c\b\u0002\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001bH\u0007¢\u0006\u0002\u0010`J\b\u0010d\u001a\u00020\u0000H\u0007J\u0015\u0010e\u001a\u00020\u001a2\u0006\u0010f\u001a\u00020gH\u0000¢\u0006\u0002\bhJA\u0010i\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001c\b\u0002\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b¢\u0006\u0002\u0010`J\u0010\u0010j\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\bH\u0017J\u0010\u0010k\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\bH\u0017J\b\u0010l\u001a\u00020\u001aH\u0002J\b\u0010m\u001a\u00020\u001aH\u0016J\"\u0010m\u001a\u00020\u00002\u0017\u0010n\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b_H\bJ#\u0010o\u001a\u00020\u00002\n\b\u0003\u0010O\u001a\u0004\u0018\u0001062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010&¢\u0006\u0002\u0010pR$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR$\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R*\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0007\u001a\u0004\u0018\u00010*@@X\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R*\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0016\u00105\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0004\n\u0002\u00107R$\u00108\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\u0002\n\u0000R$\u00109\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\u0002\n\u0000R$\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\u0002\n\u0000R*\u0010;\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001dR*\u0010=\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001dR(\u0010?\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0011\"\u0004\bA\u0010\u0013R\u0011\u0010B\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006r"}, d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "Landroid/app/Dialog;", "windowContext", "Landroid/content/Context;", "dialogBehavior", "Lcom/afollestad/materialdialogs/DialogBehavior;", "(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;)V", "<set-?>", "", "autoDismissEnabled", "getAutoDismissEnabled", "()Z", "setAutoDismissEnabled$core", "(Z)V", "Landroid/graphics/Typeface;", "bodyFont", "getBodyFont", "()Landroid/graphics/Typeface;", "setBodyFont$core", "(Landroid/graphics/Typeface;)V", "buttonFont", "getButtonFont", "setButtonFont$core", "cancelListeners", "", "Lkotlin/Function1;", "", "Lcom/afollestad/materialdialogs/DialogCallback;", "getCancelListeners$core", "()Ljava/util/List;", "cancelOnTouchOutside", "getCancelOnTouchOutside", "setCancelOnTouchOutside$core", "cancelable", "getCancelable", "setCancelable$core", "config", "", "", "", "getConfig", "()Ljava/util/Map;", "", "cornerRadius", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius$core", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDialogBehavior", "()Lcom/afollestad/materialdialogs/DialogBehavior;", "dismissListeners", "getDismissListeners$core", "maxWidth", "", "Ljava/lang/Integer;", "negativeListeners", "neutralListeners", "positiveListeners", "preShowListeners", "getPreShowListeners$core", "showListeners", "getShowListeners$core", "titleFont", "getTitleFont", "setTitleFont$core", "view", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getWindowContext", "()Landroid/content/Context;", "clearNegativeListeners", "clearNeutralListeners", "clearPositiveListeners", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "literalDp", "res", "(Ljava/lang/Float;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;", "debugMode", "dismiss", "icon", "drawable", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Lcom/afollestad/materialdialogs/MaterialDialog;", "invalidateBackgroundColorAndRadius", "literal", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;", "message", "text", "", "applySettings", "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;", "negativeButton", "click", "neutralButton", "noAutoDismiss", "onActionButtonClicked", "which", "Lcom/afollestad/materialdialogs/WhichButton;", "onActionButtonClicked$core", "positiveButton", "setCancelable", "setCanceledOnTouchOutside", "setWindowConstraints", "show", "func", "title", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/afollestad/materialdialogs/MaterialDialog;", "Companion", "core"}, k = 1, mv = {1, 1, 16})
public final class isBaselineAligned extends Dialog {
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public static drawHorizontalDivider DEFAULT_BEHAVIOR = setBaselineAligned.INSTANCE;
    private boolean autoDismissEnabled;
    @Nullable
    private Typeface bodyFont;
    @Nullable
    private Typeface buttonFont;
    @NotNull
    private final List<Function1<isBaselineAligned, Unit>> cancelListeners;
    private boolean cancelOnTouchOutside;
    private boolean cancelable;
    @NotNull
    private final Map<String, Object> config;
    @Nullable
    private Float cornerRadius;
    @NotNull
    private final drawHorizontalDivider dialogBehavior;
    @NotNull
    private final List<Function1<isBaselineAligned, Unit>> dismissListeners;
    @Px
    private Integer maxWidth;
    private final List<Function1<isBaselineAligned, Unit>> negativeListeners;
    private final List<Function1<isBaselineAligned, Unit>> neutralListeners;
    private final List<Function1<isBaselineAligned, Unit>> positiveListeners;
    @NotNull
    private final List<Function1<isBaselineAligned, Unit>> preShowListeners;
    @NotNull
    private final List<Function1<isBaselineAligned, Unit>> showListeners;
    @Nullable
    private Typeface titleFont;
    @NotNull
    private final DialogLayout view;
    @NotNull
    private final Context windowContext;

    @NotNull
    public static final drawHorizontalDivider getDEFAULT_BEHAVIOR() {
        return DEFAULT_BEHAVIOR;
    }

    public static final void setDEFAULT_BEHAVIOR(@NotNull drawHorizontalDivider drawhorizontaldivider) {
        DEFAULT_BEHAVIOR = drawhorizontaldivider;
    }

    @NotNull
    public final Context getWindowContext() {
        return this.windowContext;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isBaselineAligned(Context context, drawHorizontalDivider drawhorizontaldivider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? DEFAULT_BEHAVIOR : drawhorizontaldivider);
    }

    @NotNull
    public final drawHorizontalDivider getDialogBehavior() {
        return this.dialogBehavior;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isBaselineAligned(@NotNull Context context, @NotNull drawHorizontalDivider drawhorizontaldivider) {
        super(context, setMeasureWithLargestChildEnabled.inferTheme(context, drawhorizontaldivider));
        Intrinsics.checkParameterIsNotNull(context, "windowContext");
        Intrinsics.checkParameterIsNotNull(drawhorizontaldivider, "dialogBehavior");
        this.windowContext = context;
        this.dialogBehavior = drawhorizontaldivider;
        this.config = new LinkedHashMap();
        this.autoDismissEnabled = true;
        this.cancelOnTouchOutside = true;
        this.cancelable = true;
        this.preShowListeners = new ArrayList();
        this.showListeners = new ArrayList();
        this.dismissListeners = new ArrayList();
        this.cancelListeners = new ArrayList();
        this.positiveListeners = new ArrayList();
        this.negativeListeners = new ArrayList();
        this.neutralListeners = new ArrayList();
        LayoutInflater from = LayoutInflater.from(this.windowContext);
        drawHorizontalDivider drawhorizontaldivider2 = this.dialogBehavior;
        Context context2 = this.windowContext;
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(window, "window!!");
        Intrinsics.checkExpressionValueIsNotNull(from, "layoutInflater");
        ViewGroup createView = drawhorizontaldivider2.createView(context2, window, from, this);
        setContentView(createView);
        DialogLayout dialogLayout = this.dialogBehavior.getDialogLayout(createView);
        dialogLayout.attachDialog(this);
        this.view = dialogLayout;
        this.titleFont = forceUniformHeight.font$default(this, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_font_title), 1, (Object) null);
        this.bodyFont = forceUniformHeight.font$default(this, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_font_body), 1, (Object) null);
        this.buttonFont = forceUniformHeight.font$default(this, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_font_button), 1, (Object) null);
        invalidateBackgroundColorAndRadius();
    }

    @NotNull
    public final Map<String, Object> getConfig() {
        return this.config;
    }

    public final <T> T config(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.config.get(str);
    }

    public final boolean getAutoDismissEnabled() {
        return this.autoDismissEnabled;
    }

    public final void setAutoDismissEnabled$core(boolean z) {
        this.autoDismissEnabled = z;
    }

    @Nullable
    public final Typeface getTitleFont() {
        return this.titleFont;
    }

    public final void setTitleFont$core(@Nullable Typeface typeface) {
        this.titleFont = typeface;
    }

    @Nullable
    public final Typeface getBodyFont() {
        return this.bodyFont;
    }

    public final void setBodyFont$core(@Nullable Typeface typeface) {
        this.bodyFont = typeface;
    }

    @Nullable
    public final Typeface getButtonFont() {
        return this.buttonFont;
    }

    public final void setButtonFont$core(@Nullable Typeface typeface) {
        this.buttonFont = typeface;
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final void setCancelOnTouchOutside$core(boolean z) {
        this.cancelOnTouchOutside = z;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final void setCancelable$core(boolean z) {
        this.cancelable = z;
    }

    @Nullable
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius$core(@Nullable Float f) {
        this.cornerRadius = f;
    }

    @NotNull
    public final DialogLayout getView() {
        return this.view;
    }

    @NotNull
    public final List<Function1<isBaselineAligned, Unit>> getPreShowListeners$core() {
        return this.preShowListeners;
    }

    @NotNull
    public final List<Function1<isBaselineAligned, Unit>> getShowListeners$core() {
        return this.showListeners;
    }

    @NotNull
    public final List<Function1<isBaselineAligned, Unit>> getDismissListeners$core() {
        return this.dismissListeners;
    }

    @NotNull
    public final List<Function1<isBaselineAligned, Unit>> getCancelListeners$core() {
        return this.cancelListeners;
    }

    public static /* synthetic */ isBaselineAligned icon$default(isBaselineAligned isbaselinealigned, Integer num, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        return isbaselinealigned.icon(num, drawable);
    }

    @NotNull
    public final isBaselineAligned icon(@Nullable @DrawableRes Integer num, @Nullable Drawable drawable) {
        isBaselineAligned isbaselinealigned = this;
        layoutVertical.INSTANCE.assertOneSet("icon", drawable, num);
        measureChildBeforeLayout.populateIcon(isbaselinealigned, isbaselinealigned.view.getTitleLayout().getIconView$core(), num, drawable);
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned title$default(isBaselineAligned isbaselinealigned, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return isbaselinealigned.title(num, str);
    }

    @NotNull
    public final isBaselineAligned title(@Nullable @StringRes Integer num, @Nullable String str) {
        isBaselineAligned isbaselinealigned = this;
        layoutVertical.INSTANCE.assertOneSet("title", str, num);
        measureChildBeforeLayout.populateText$default(isbaselinealigned, isbaselinealigned.view.getTitleLayout().getTitleView$core(), num, str, 0, isbaselinealigned.titleFont, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_color_title), 8, (Object) null);
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned message$default(isBaselineAligned isbaselinealigned, Integer num, CharSequence charSequence, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isbaselinealigned.message(num, charSequence, function1);
    }

    @NotNull
    public final isBaselineAligned message(@Nullable @StringRes Integer num, @Nullable CharSequence charSequence, @Nullable Function1<? super getChildrenSkipCount, Unit> function1) {
        isBaselineAligned isbaselinealigned = this;
        layoutVertical.INSTANCE.assertOneSet("message", charSequence, num);
        isbaselinealigned.view.getContentLayout().setMessage(isbaselinealigned, num, charSequence, isbaselinealigned.bodyFont, function1);
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned positiveButton$default(isBaselineAligned isbaselinealigned, Integer num, CharSequence charSequence, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isbaselinealigned.positiveButton(num, charSequence, function1);
    }

    @NotNull
    public final isBaselineAligned positiveButton(@Nullable @StringRes Integer num, @Nullable CharSequence charSequence, @Nullable Function1<? super isBaselineAligned, Unit> function1) {
        isBaselineAligned isbaselinealigned = this;
        if (function1 != null) {
            isbaselinealigned.positiveListeners.add(function1);
        }
        DialogActionButton actionButton = getBaselineAlignedChildIndex.getActionButton(isbaselinealigned, WhichButton.POSITIVE);
        if (num == null && charSequence == null && layoutHorizontal.isVisible(actionButton)) {
            return isbaselinealigned;
        }
        measureChildBeforeLayout.populateText$default(isbaselinealigned, actionButton, num, charSequence, 17039370, isbaselinealigned.buttonFont, (Integer) null, 32, (Object) null);
        return isbaselinealigned;
    }

    @NotNull
    public final isBaselineAligned clearPositiveListeners() {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.positiveListeners.clear();
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned negativeButton$default(isBaselineAligned isbaselinealigned, Integer num, CharSequence charSequence, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isbaselinealigned.negativeButton(num, charSequence, function1);
    }

    @NotNull
    public final isBaselineAligned negativeButton(@Nullable @StringRes Integer num, @Nullable CharSequence charSequence, @Nullable Function1<? super isBaselineAligned, Unit> function1) {
        isBaselineAligned isbaselinealigned = this;
        if (function1 != null) {
            isbaselinealigned.negativeListeners.add(function1);
        }
        DialogActionButton actionButton = getBaselineAlignedChildIndex.getActionButton(isbaselinealigned, WhichButton.NEGATIVE);
        if (!(num == null && charSequence == null && layoutHorizontal.isVisible(actionButton))) {
            measureChildBeforeLayout.populateText$default(isbaselinealigned, actionButton, num, charSequence, 17039360, isbaselinealigned.buttonFont, (Integer) null, 32, (Object) null);
        }
        return isbaselinealigned;
    }

    @NotNull
    public final isBaselineAligned clearNegativeListeners() {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.negativeListeners.clear();
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned neutralButton$default(isBaselineAligned isbaselinealigned, Integer num, CharSequence charSequence, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isbaselinealigned.neutralButton(num, charSequence, function1);
    }

    @NotNull
    @Deprecated(message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions.")
    public final isBaselineAligned neutralButton(@Nullable @StringRes Integer num, @Nullable CharSequence charSequence, @Nullable Function1<? super isBaselineAligned, Unit> function1) {
        isBaselineAligned isbaselinealigned = this;
        if (function1 != null) {
            isbaselinealigned.neutralListeners.add(function1);
        }
        DialogActionButton actionButton = getBaselineAlignedChildIndex.getActionButton(isbaselinealigned, WhichButton.NEUTRAL);
        if (!(num == null && charSequence == null && layoutHorizontal.isVisible(actionButton))) {
            measureChildBeforeLayout.populateText$default(isbaselinealigned, actionButton, num, charSequence, 0, isbaselinealigned.buttonFont, (Integer) null, 40, (Object) null);
        }
        return isbaselinealigned;
    }

    @NotNull
    @Deprecated(message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions.")
    public final isBaselineAligned clearNeutralListeners() {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.neutralListeners.clear();
        return isbaselinealigned;
    }

    @CheckResult
    @NotNull
    public final isBaselineAligned noAutoDismiss() {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.autoDismissEnabled = false;
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned maxWidth$default(isBaselineAligned isbaselinealigned, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return isbaselinealigned.maxWidth(num, num2);
    }

    @NotNull
    public final isBaselineAligned maxWidth(@Nullable @DimenRes Integer num, @Px @Nullable Integer num2) {
        isBaselineAligned isbaselinealigned = this;
        layoutVertical.INSTANCE.assertOneSet("maxWidth", num, num2);
        Integer num3 = isbaselinealigned.maxWidth;
        boolean z = (num3 == null || num3 == null || num3.intValue() != 0) ? false : true;
        if (num != null) {
            num2 = Integer.valueOf(isbaselinealigned.windowContext.getResources().getDimensionPixelSize(num.intValue()));
        } else if (num2 == null) {
            Intrinsics.throwNpe();
        }
        isbaselinealigned.maxWidth = num2;
        if (z) {
            isbaselinealigned.setWindowConstraints();
        }
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned cornerRadius$default(isBaselineAligned isbaselinealigned, Float f, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return isbaselinealigned.cornerRadius(f, num);
    }

    @NotNull
    public final isBaselineAligned cornerRadius(@Nullable Float f, @Nullable @DimenRes Integer num) {
        Float f2;
        isBaselineAligned isbaselinealigned = this;
        layoutVertical.INSTANCE.assertOneSet("cornerRadius", f, num);
        if (num != null) {
            f2 = Float.valueOf(isbaselinealigned.windowContext.getResources().getDimension(num.intValue()));
        } else {
            Resources resources = isbaselinealigned.windowContext.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "windowContext.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            f2 = Float.valueOf(TypedValue.applyDimension(1, f.floatValue(), displayMetrics));
        }
        isbaselinealigned.cornerRadius = f2;
        isbaselinealigned.invalidateBackgroundColorAndRadius();
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned debugMode$default(isBaselineAligned isbaselinealigned, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return isbaselinealigned.debugMode(z);
    }

    @CheckResult
    @NotNull
    public final isBaselineAligned debugMode(boolean z) {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.view.setDebugMode(z);
        return isbaselinealigned;
    }

    public final void show() {
        setWindowConstraints();
        measureChildBeforeLayout.preShow(this);
        this.dialogBehavior.onPreShow(this);
        super.show();
        this.dialogBehavior.onPostShow(this);
    }

    @NotNull
    public final isBaselineAligned show(@NotNull Function1<? super isBaselineAligned, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "func");
        isBaselineAligned isbaselinealigned = this;
        function1.invoke(isbaselinealigned);
        isbaselinealigned.show();
        return isbaselinealigned;
    }

    @NotNull
    public final isBaselineAligned cancelable(boolean z) {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.setCancelable(z);
        return isbaselinealigned;
    }

    @Deprecated(message = "Use fluent cancelable(Boolean) instead.", replaceWith = @ReplaceWith(expression = "cancelable(cancelable)", imports = {}))
    public final void setCancelable(boolean z) {
        this.cancelable = z;
        super.setCancelable(z);
    }

    @NotNull
    public final isBaselineAligned cancelOnTouchOutside(boolean z) {
        isBaselineAligned isbaselinealigned = this;
        isbaselinealigned.setCanceledOnTouchOutside(z);
        return isbaselinealigned;
    }

    @Deprecated(message = "Use fluent cancelOnTouchOutside(Boolean) instead.", replaceWith = @ReplaceWith(expression = "cancelOnTouchOutside(cancelOnTouchOutside)", imports = {}))
    public final void setCanceledOnTouchOutside(boolean z) {
        this.cancelOnTouchOutside = z;
        super.setCanceledOnTouchOutside(z);
    }

    public final void dismiss() {
        if (!this.dialogBehavior.onDismiss()) {
            measureChildBeforeLayout.hideKeyboard(this);
            super.dismiss();
        }
    }

    public final void onActionButtonClicked$core(@NotNull WhichButton whichButton) {
        Intrinsics.checkParameterIsNotNull(whichButton, "which");
        int i = getBaseline.$EnumSwitchMapping$0[whichButton.ordinal()];
        if (i == 1) {
            getVirtualChildAt.invokeAll(this.positiveListeners, this);
            RecyclerView.Adapter<?> listAdapter = forceUniformWidth.getListAdapter(this);
            if (!(listAdapter instanceof hasDividerBeforeChildAt)) {
                listAdapter = null;
            }
            hasDividerBeforeChildAt hasdividerbeforechildat = (hasDividerBeforeChildAt) listAdapter;
            if (hasdividerbeforechildat != null) {
                hasdividerbeforechildat.positiveButtonClicked();
            }
        } else if (i == 2) {
            getVirtualChildAt.invokeAll(this.negativeListeners, this);
        } else if (i == 3) {
            getVirtualChildAt.invokeAll(this.neutralListeners, this);
        }
        if (this.autoDismissEnabled) {
            dismiss();
        }
    }

    private final void setWindowConstraints() {
        drawHorizontalDivider drawhorizontaldivider = this.dialogBehavior;
        Context context = this.windowContext;
        Integer num = this.maxWidth;
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(window, "window!!");
        drawhorizontaldivider.setWindowConstraints(context, window, this.view, num);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function0<Integer> {
        final /* synthetic */ isBaselineAligned this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isBaselineAligned isbaselinealigned) {
            super(0);
            this.this$0 = isbaselinealigned;
        }

        public final int invoke() {
            return getLocationOffset.resolveColor$default(this.this$0, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.colorBackgroundFloating), (Function0) null, 5, (Object) null);
        }
    }

    private final void invalidateBackgroundColorAndRadius() {
        int resolveColor$default = getLocationOffset.resolveColor$default(this, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_background_color), new setMin(this), 1, (Object) null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        drawHorizontalDivider drawhorizontaldivider = this.dialogBehavior;
        DialogLayout dialogLayout = this.view;
        Float f = this.cornerRadius;
        drawhorizontaldivider.setBackgroundColor(dialogLayout, resolveColor$default, f != null ? f.floatValue() : layoutVertical.INSTANCE.resolveDimen(this.windowContext, isMeasureWithLargestChildEnabled.getMax.md_corner_radius, new getMin(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function0<Float> {
        final /* synthetic */ isBaselineAligned this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(isBaselineAligned isbaselinealigned) {
            super(0);
            this.this$0 = isbaselinealigned;
        }

        public final float invoke() {
            Context context = this.this$0.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, HummerConstants.CONTEXT);
            return context.getResources().getDimension(isMeasureWithLargestChildEnabled.setMax.md_dialog_default_corner_radius);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog$Companion;", "", "()V", "DEFAULT_BEHAVIOR", "Lcom/afollestad/materialdialogs/DialogBehavior;", "DEFAULT_BEHAVIOR$annotations", "getDEFAULT_BEHAVIOR", "()Lcom/afollestad/materialdialogs/DialogBehavior;", "setDEFAULT_BEHAVIOR", "(Lcom/afollestad/materialdialogs/DialogBehavior;)V", "core"}, k = 1, mv = {1, 1, 16})
    public static final class getMax {
        @JvmStatic
        public static /* synthetic */ void DEFAULT_BEHAVIOR$annotations() {
        }

        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final drawHorizontalDivider getDEFAULT_BEHAVIOR() {
            return isBaselineAligned.DEFAULT_BEHAVIOR;
        }

        public final void setDEFAULT_BEHAVIOR(@NotNull drawHorizontalDivider drawhorizontaldivider) {
            Intrinsics.checkParameterIsNotNull(drawhorizontaldivider, "<set-?>");
            isBaselineAligned.DEFAULT_BEHAVIOR = drawhorizontaldivider;
        }
    }
}
