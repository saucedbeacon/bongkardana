package id.dana.sendmoney.remarks;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.R;
import id.dana.di.modules.NoteModule;
import java.util.Arrays;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.PrepareException;
import o.afterParsePackage;
import o.order;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.setPhotoSize;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 >2\u00020\u0001:\u0001>B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020(H\u0014J\n\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u0005H\u0014J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0013H\u0014J\b\u0010/\u001a\u00020\u0013H\u0002J\u0012\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u0013H\u0016J\b\u00104\u001a\u00020\u0013H\u0014J\b\u00105\u001a\u00020\u0013H\u0016J\f\u00106\u001a\u00020\u0013*\u000207H\u0002J\f\u00108\u001a\u00020\u0013*\u000207H\u0002J\f\u00109\u001a\u00020\u0013*\u00020:H\u0003J\f\u0010;\u001a\u00020\u0013*\u00020<H\u0002J\f\u0010=\u001a\u00020\u0013*\u00020:H\u0002R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00130\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R5\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00130\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006?"}, d2 = {"Lid/dana/sendmoney/remarks/NoteBottomSheetDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "remarks", "", "maxChar", "", "(Ljava/lang/String;I)V", "actionNegativeText", "getActionNegativeText", "()I", "setActionNegativeText", "(I)V", "actionPositiveText", "getActionPositiveText", "setActionPositiveText", "onActionNegative", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnActionNegative", "()Lkotlin/jvm/functions/Function1;", "setOnActionNegative", "(Lkotlin/jvm/functions/Function1;)V", "onActionPositive", "getOnActionPositive", "setOnActionPositive", "presenter", "Lid/dana/sendmoney/remarks/NoteContract$Presenter;", "getPresenter", "()Lid/dana/sendmoney/remarks/NoteContract$Presenter;", "setPresenter", "(Lid/dana/sendmoney/remarks/NoteContract$Presenter;)V", "getRemarks", "()Ljava/lang/String;", "focusAndShowKeyboard", "getActionButtonText", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getKeyboardVisibilityListener", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "getLayout", "getNoteView", "Lid/dana/sendmoney/remarks/NoteContract$View;", "init", "initComponent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onShow", "onStart", "initActionNegativeButton", "Landroid/widget/Button;", "initActionPositiveButton", "initEditText", "Landroid/widget/EditText;", "setHint", "Landroid/widget/TextView;", "setMaxChar", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NoteBottomSheetDialogFragment extends order {
    @NotNull
    public static final getMin toIntRange = new getMin((byte) 0);
    @NotNull
    public Function1<? super String, Unit> IsOverlapping;
    @NotNull
    final String equals;
    @StringRes
    public int getMax;
    @StringRes
    public int getMin;
    @NotNull
    public Function1<? super String, Unit> isInside;
    @Inject
    public setPhotoSize.setMin presenter;
    /* access modifiers changed from: private */
    public int toFloatRange;
    private HashMap toString;

    public final View getMax(int i) {
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.view_add_remark_container;
    }

    public final float length() {
        return 0.5f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<String, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<String, Unit> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(1);
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NoteBottomSheetDialogFragment(String str) {
        this(str, (byte) 0);
    }

    public NoteBottomSheetDialogFragment(@NotNull String str, byte b) {
        Intrinsics.checkNotNullParameter(str, "remarks");
        this.equals = str;
        this.toFloatRange = 50;
        this.isInside = IsOverlapping.INSTANCE;
        this.IsOverlapping = isInside.INSTANCE;
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) getMax(resetInternal.setMax.anyOf);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_container");
        return frameLayout;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    public final void setMax() {
        CharSequence charSequence;
        String str;
        super.setMax();
        Button button = (Button) getMax(resetInternal.setMax.INotificationSideChannel$Stub$Proxy);
        if (button != null) {
            button.setOnClickListener(new equals(this));
            button.setEnabled(false);
            int i = this.getMin;
            if (i == 0) {
                if (StringsKt.isBlank(this.equals)) {
                    str = getString(R.string.sendmoney_remarks_add);
                } else {
                    str = getString(R.string.sendmoney_remarks_edit);
                }
                Intrinsics.checkNotNullExpressionValue(str, "when {\n        remarks.i…money_remarks_edit)\n    }");
                charSequence = str;
            } else {
                charSequence = getString(i);
            }
            button.setText(charSequence);
        }
        Button button2 = (Button) getMax(resetInternal.setMax.ITrustedWebActivityService$Default);
        if (!(button2 == null || this.getMax == 0)) {
            button2.setVisibility(0);
            button2.setOnClickListener(new getMax(this));
            button2.setText(getString(this.getMax));
        }
        EditText editText = (EditText) getMax(resetInternal.setMax.InterpolatorRes);
        if (editText != null) {
            editText.setVerticalScrollBarEnabled(true);
            if (true ^ StringsKt.isBlank(this.equals)) {
                editText.setText(this.equals);
                editText.setSelection(this.equals.length());
            }
            editText.addTextChangedListener(new toIntRange(this));
            editText.setOnTouchListener(toFloatRange.getMax);
        }
        TextView textView = (TextView) getMax(resetInternal.setMax.setTitleMarginStart);
        if (textView != null) {
            length(textView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class toIntRange implements TextWatcher {
        final /* synthetic */ NoteBottomSheetDialogFragment setMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public toIntRange(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
            this.setMax = noteBottomSheetDialogFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
            if ((r5 == null || kotlin.text.StringsKt.isBlank(r5)) == false) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(@org.jetbrains.annotations.Nullable android.text.Editable r5) {
            /*
                r4 = this;
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r4.setMax
                int r1 = o.resetInternal.setMax.INotificationSideChannel$Stub$Proxy
                android.view.View r0 = r0.getMax((int) r1)
                android.widget.Button r0 = (android.widget.Button) r0
                if (r0 == 0) goto L_0x003c
                if (r5 == 0) goto L_0x0013
                java.lang.String r1 = r5.toString()
                goto L_0x0014
            L_0x0013:
                r1 = 0
            L_0x0014:
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r2 = r4.setMax
                java.lang.String r2 = r2.equals
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                r2 = 1
                r1 = r1 ^ r2
                r3 = 0
                if (r1 != 0) goto L_0x0039
                boolean r1 = r0.isEnabled()
                if (r1 != 0) goto L_0x0038
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0034
                boolean r5 = kotlin.text.StringsKt.isBlank(r5)
                if (r5 == 0) goto L_0x0032
                goto L_0x0034
            L_0x0032:
                r5 = 0
                goto L_0x0035
            L_0x0034:
                r5 = 1
            L_0x0035:
                if (r5 != 0) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r2 = 0
            L_0x0039:
                r0.setEnabled(r2)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment.toIntRange.afterTextChanged(android.text.Editable):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/sendmoney/remarks/NoteBottomSheetDialogFragment$getKeyboardVisibilityListener$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setOnWheelViewListener.length {
        final /* synthetic */ NoteBottomSheetDialogFragment getMin;

        public final void setMax() {
        }

        setMax(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
            this.getMin = noteBottomSheetDialogFragment;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment$setMax$setMax  reason: collision with other inner class name */
        static final class C0049setMax implements Runnable {
            final /* synthetic */ setMax length;

            C0049setMax(setMax setmax) {
                this.length = setmax;
            }

            public final void run() {
                this.length.getMin.length.setState(3);
            }
        }

        public final void length() {
            this.getMin.setMin.post(new C0049setMax(this));
        }
    }

    @Nullable
    public final setOnWheelViewListener.length s_() {
        return new setMax(this);
    }

    public final void setMin() {
        super.setMin();
        afterParsePackage.getMin getmin = new afterParsePackage.getMin((byte) 0);
        if (PrepareException.getMin != null) {
            PrepareException.AnonymousClass1 r2 = PrepareException.getMin.setMax;
            if (r2 != null) {
                getmin.length = r2;
                getmin.setMin = new NoteModule(new length(this));
                stopIgnoring.setMin(getmin.setMin, NoteModule.class);
                stopIgnoring.setMin(getmin.length, PrepareException.AnonymousClass1.class);
                new afterParsePackage(getmin.setMin, getmin.length, (byte) 0).setMin(this);
                setPhotoSize.setMin setmin = this.presenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmin.getMin();
                setMin(setMin(getDialog()), 3);
                EditText editText = (EditText) getMax(resetInternal.setMax.InterpolatorRes);
                if (editText != null) {
                    editText.post(new setMin(this));
                    return;
                }
                return;
            }
            throw null;
        }
        throw new IllegalStateException("Application components needs to be set in Application");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney/remarks/NoteBottomSheetDialogFragment$getNoteView$1", "Lid/dana/sendmoney/remarks/NoteContract$View;", "onGetNoteMaxChar", "", "maxChar", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements setPhotoSize.getMin {
        final /* synthetic */ NoteBottomSheetDialogFragment setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
            this.setMin = noteBottomSheetDialogFragment;
        }

        public final void getMin(int i) {
            this.setMin.toFloatRange = i;
            EditText editText = (EditText) this.setMin.getMax(resetInternal.setMax.InterpolatorRes);
            if (editText != null) {
                NoteBottomSheetDialogFragment.setMax(this.setMin, editText);
            }
            TextView textView = (TextView) this.setMin.getMax(resetInternal.setMax.setTitleMarginStart);
            if (textView != null) {
                this.setMin.length(textView);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ NoteBottomSheetDialogFragment setMax;

        setMin(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
            this.setMax = noteBottomSheetDialogFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r0 = r0.getApplicationContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r3.setMax
                int r1 = o.resetInternal.setMax.InterpolatorRes
                android.view.View r0 = r0.getMax((int) r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                r0.requestFocus()
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r3.setMax
                android.content.Context r0 = r0.getContext()
                r1 = 0
                if (r0 == 0) goto L_0x0023
                android.content.Context r0 = r0.getApplicationContext()
                if (r0 == 0) goto L_0x0023
                java.lang.String r2 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r2)
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                boolean r2 = r0 instanceof android.view.inputmethod.InputMethodManager
                if (r2 != 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = r0
            L_0x002a:
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                if (r1 == 0) goto L_0x004f
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r3.setMax
                int r2 = o.resetInternal.setMax.InterpolatorRes
                android.view.View r0 = r0.getMax((int) r2)
                android.widget.EditText r0 = (android.widget.EditText) r0
                r2 = 1
                r1.showSoftInput(r0, r2)
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r3.setMax
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto L_0x004f
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L_0x004f
                r1 = 48
                r0.setSoftInputMode(r1)
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment.setMin.run():void");
        }
    }

    /* access modifiers changed from: private */
    public final void length(TextView textView) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.sendmoney_remarks_add_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendmoney_remarks_add_hint)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.toFloatRange)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        textView.setText(format);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ NoteBottomSheetDialogFragment setMax;

        equals(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
            this.setMax = noteBottomSheetDialogFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r0 = r0.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r3 = r2.setMax
                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r3 = r3.isInside
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r2.setMax
                int r1 = o.resetInternal.setMax.InterpolatorRes
                android.view.View r0 = r0.getMax((int) r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                if (r0 == 0) goto L_0x001b
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = r0.toString()
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                if (r0 != 0) goto L_0x0020
                java.lang.String r0 = ""
            L_0x0020:
                r3.invoke(r0)
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r3 = r2.setMax
                r3.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment.equals.onClick(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ NoteBottomSheetDialogFragment setMax;

        getMax(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
            this.setMax = noteBottomSheetDialogFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r0 = r0.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r3 = r2.setMax
                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r3 = r3.IsOverlapping
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r0 = r2.setMax
                int r1 = o.resetInternal.setMax.InterpolatorRes
                android.view.View r0 = r0.getMax((int) r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                if (r0 == 0) goto L_0x001b
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = r0.toString()
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                if (r0 != 0) goto L_0x0020
                java.lang.String r0 = ""
            L_0x0020:
                r3.invoke(r0)
                id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment r3 = r2.setMax
                r3.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment.getMax.onClick(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnTouchListener {
        public static final toFloatRange getMax = new toFloatRange();

        toFloatRange() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullExpressionValue(view, SecurityConstants.KEY_VALUE);
            view.getParent().requestDisallowInterceptTouchEvent(true);
            Intrinsics.checkNotNullExpressionValue(motionEvent, "event");
            if ((motionEvent.getAction() & 255) == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        setPhotoSize.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmin.setMax();
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney/remarks/NoteBottomSheetDialogFragment$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMax(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment, EditText editText) {
        if (noteBottomSheetDialogFragment.toFloatRange > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(noteBottomSheetDialogFragment.toFloatRange)});
        }
    }
}
