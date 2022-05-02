package id.dana.sendmoney.remarks;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0002./B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u001a\u0010#\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020&J\u0010\u0010)\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lid/dana/sendmoney/remarks/NoteView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "listener", "Lid/dana/sendmoney/remarks/NoteView$Listener;", "getListener", "()Lid/dana/sendmoney/remarks/NoteView$Listener;", "setListener", "(Lid/dana/sendmoney/remarks/NoteView$Listener;)V", "maxNoteChar", "getMaxNoteChar", "()I", "setMaxNoteChar", "(I)V", "value", "", "remarks", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "remarksViewPadding", "", "getLayout", "onBtnActionClicked", "", "onSetRemarks", "parseAttrs", "setLabelVisibility", "isBlank", "", "setRemarksActionButtonVisible", "visible", "setTvNote", "setup", "setupViewPadding", "showRemarkInputDialog", "switchButtonText", "Companion", "Listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NoteView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private int getMax;
    @Nullable
    private length getMin;
    private HashMap length;
    private float setMax;
    @NotNull
    private String setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney/remarks/NoteView$Listener;", "", "onBtnActionClicked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void length();
    }

    @JvmOverloads
    public NoteView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NoteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_remarks;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/sendmoney/remarks/NoteView$showRemarkInputDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ NoteView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(NoteView noteView) {
            super(1);
            this.this$0 = noteView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.this$0.setRemarks(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NoteView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = "";
        this.getMax = 50;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NoteView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = "";
        this.getMax = 50;
    }

    @NotNull
    public final String getRemarks() {
        return this.setMin;
    }

    public final void setRemarks(@NotNull String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Intrinsics.checkNotNullParameter(str, "value");
        if (StringsKt.isBlank(str)) {
            str = "";
        }
        this.setMin = str;
        CharSequence charSequence3 = str;
        boolean isBlank = StringsKt.isBlank(charSequence3);
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (button != null) {
            if (isBlank) {
                charSequence2 = getContext().getString(R.string.sendmoney_remarks_empty_action);
            } else {
                charSequence2 = getContext().getString(R.string.fill_note_message_title_option);
            }
            button.setText(charSequence2);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
        int i = 0;
        if (textView != null) {
            if (StringsKt.isBlank(charSequence3)) {
                charSequence = getContext().getString(R.string.sendmoney_remarks_add);
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("\"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                charSequence = format;
            }
            textView.setText(charSequence);
        }
        boolean isBlank2 = StringsKt.isBlank(charSequence3);
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (textView2 != null) {
            if (isBlank2) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    @Nullable
    public final length getListener() {
        return this.getMin;
    }

    public final void setListener(@Nullable length length2) {
        this.getMin = length2;
    }

    public final int getMaxNoteChar() {
        return this.getMax;
    }

    public final void setMaxNoteChar(int i) {
        this.getMax = i;
    }

    /* JADX INFO: finally extract failed */
    public final void parseAttrs(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.ParcelableVolumeInfo);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext()\n           …is, R.styleable.NoteView)");
            try {
                float dimension = obtainStyledAttributes.getDimension(0, -99.0f);
                obtainStyledAttributes.recycle();
                this.setMax = dimension;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    @OnClick({2131362039})
    public final void onBtnActionClicked() {
        length length2 = this.getMin;
        if (length2 != null) {
            length2.length();
        }
        NoteBottomSheetDialogFragment noteBottomSheetDialogFragment = new NoteBottomSheetDialogFragment(this.setMin);
        Function1<? super String, Unit> getmax = new getMax(this);
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        noteBottomSheetDialogFragment.isInside = getmax;
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        noteBottomSheetDialogFragment.show(baseActivity.getSupportFragmentManager(), "");
    }

    public final void setRemarksActionButtonVisible(boolean z) {
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (button != null) {
            button.setVisibility(z ? 0 : 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney/remarks/NoteView$Companion;", "", "()V", "NOTE_STRING_FORMAT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setup() {
        ConstraintLayout constraintLayout;
        if (this.setMax > 0.0f && (constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.onRetainNonConfigurationInstance)) != null) {
            float f = this.setMax;
            constraintLayout.setPadding((int) f, (int) f, (int) f, (int) f);
        }
    }
}
