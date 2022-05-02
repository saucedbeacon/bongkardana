package o;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputEditText;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB*\u0012#\b\u0002\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0014J\b\u0010\u0018\u001a\u00020\bH\u0016J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bJ\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0002R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/bank/NickNameDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "onPositiveAction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "nickName", "", "(Lkotlin/jvm/functions/Function1;)V", "focusAndShowKeyboard", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "initViews", "invokeListenerAndFinish", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShow", "onStart", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "isValidLength", "", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class insertAndReturnId extends order {
    @NotNull
    public static final length getMin = new length((byte) 0);
    private Function1<? super String, Unit> getMax;
    private HashMap toIntRange;

    public insertAndReturnId() {
        this((byte) 0);
    }

    public final int getMin() {
        return R.layout.bottom_sheet_nick_name_coordinator;
    }

    public final float length() {
        return 0.48f;
    }

    public final View length(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private /* synthetic */ insertAndReturnId(byte b) {
        this((Function1<? super String, Unit>) AnonymousClass2.INSTANCE);
    }

    public insertAndReturnId(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onPositiveAction");
        this.getMax = function1;
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) length(resetInternal.setMax.enforcement);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "flContainer");
        return frameLayout;
    }

    public final void setMax() {
        super.setMax();
        AppCompatButton appCompatButton = (AppCompatButton) length(resetInternal.setMax.asInterface);
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new getMax(this));
        }
        TextInputEditText textInputEditText = (TextInputEditText) length(resetInternal.setMax.InspectableProperty$ValueType);
        if (textInputEditText != null) {
            textInputEditText.setOnEditorActionListener(new setMax(this));
            textInputEditText.addTextChangedListener(new getMin(this));
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
        TextInputEditText textInputEditText = (TextInputEditText) length(resetInternal.setMax.InspectableProperty$ValueType);
        if (textInputEditText != null) {
            textInputEditText.post(new setMin(this));
        }
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ insertAndReturnId setMin;

        getMax(insertAndReturnId insertandreturnid) {
            this.setMin = insertandreturnid;
        }

        public final void onClick(View view) {
            insertAndReturnId.getMax(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction", "id/dana/bank/NickNameDialogFragment$initViews$2$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements TextView.OnEditorActionListener {
        final /* synthetic */ insertAndReturnId getMin;

        setMax(insertAndReturnId insertandreturnid) {
            this.getMin = insertandreturnid;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            insertAndReturnId.getMax(this.getMin);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static boolean length(CharSequence charSequence) {
        return charSequence.length() > 4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "id/dana/bank/NickNameDialogFragment$$special$$inlined$addTextChangedListener$1"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class getMin implements TextWatcher {
        final /* synthetic */ insertAndReturnId setMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public getMin(insertAndReturnId insertandreturnid) {
            this.setMax = insertandreturnid;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            AppCompatButton appCompatButton = (AppCompatButton) this.setMax.length(resetInternal.setMax.asInterface);
            if (appCompatButton != null) {
                CharSequence charSequence = editable;
                boolean z = false;
                if (!(charSequence == null || StringsKt.isBlank(charSequence)) && insertAndReturnId.length(charSequence)) {
                    z = true;
                }
                appCompatButton.setEnabled(z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ insertAndReturnId length;

        setMin(insertAndReturnId insertandreturnid) {
            this.length = insertandreturnid;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r1 = r1.getApplicationContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                o.insertAndReturnId r0 = r4.length
                int r1 = o.resetInternal.setMax.InspectableProperty$ValueType
                android.view.View r0 = r0.length((int) r1)
                com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
                r0.requestFocus()
                android.content.Context r1 = r0.getContext()
                r2 = 0
                if (r1 == 0) goto L_0x0021
                android.content.Context r1 = r1.getApplicationContext()
                if (r1 == 0) goto L_0x0021
                java.lang.String r3 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r3)
                goto L_0x0022
            L_0x0021:
                r1 = r2
            L_0x0022:
                boolean r3 = r1 instanceof android.view.inputmethod.InputMethodManager
                if (r3 != 0) goto L_0x0027
                goto L_0x0028
            L_0x0027:
                r2 = r1
            L_0x0028:
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
                if (r2 == 0) goto L_0x0045
                android.view.View r0 = (android.view.View) r0
                r1 = 1
                r2.showSoftInput(r0, r1)
                o.insertAndReturnId r0 = r4.length
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0045
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L_0x0045
                r1 = 48
                r0.setSoftInputMode(r1)
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.insertAndReturnId.setMin.run():void");
        }
    }

    public final void length(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        super.show(fragmentManager, "NickNameDialogFragment");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/bank/NickNameDialogFragment$Companion;", "", "()V", "MINIMUM_DIGIT_PREFIX_CHECK", "", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMax(insertAndReturnId insertandreturnid) {
        Editable text;
        String obj;
        TextInputEditText textInputEditText = (TextInputEditText) insertandreturnid.length(resetInternal.setMax.InspectableProperty$ValueType);
        if (textInputEditText != null && (text = textInputEditText.getText()) != null && (obj = text.toString()) != null) {
            if (!length((CharSequence) obj)) {
                obj = null;
            }
            if (obj != null) {
                insertandreturnid.getMax.invoke(obj);
                insertandreturnid.dismiss();
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
