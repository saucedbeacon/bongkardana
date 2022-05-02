package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.google.android.material.textfield.TextInputLayout;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.CommonInputFieldView;
import o.ConfirmPopup;
import o.CornerMarkingDataProvider;
import o.onTap;
import o.resetInternal;

public class CommonInputFieldView extends BaseRichView {
    private int IsOverlapping;
    @BindView(2131362535)
    Button btnClear;
    length commonInputAction;
    private int equals;
    @BindView(2131362822)
    TextInputLayout etGroup;
    @BindView(2131362824)
    EditText etInputCommon;
    @BindView(2131362823)
    EditText etInputMaterial;
    private int getMax;
    private String getMin;
    @BindView(2131363217)
    TextInputLayout inputLayout;
    private boolean isInside;
    @BindView(2131363767)
    TextView lblTitle;
    private int length;
    EditText selectedEt;
    private String setMax;
    private int setMin;
    @BindView(2131364665)
    ImageView sideIcon;
    private int toFloatRange;
    private int toIntRange;

    public interface length {
    }

    public static /* synthetic */ void length() {
    }

    public int getLayout() {
        return R.layout.view_common_input_field;
    }

    public CommonInputFieldView(@NonNull Context context) {
        super(context);
    }

    public CommonInputFieldView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommonInputFieldView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CommonInputFieldView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.requestPostMessageChannel);
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.btnClear.getLayoutParams();
                String string = obtainStyledAttributes.getString(8);
                this.getMin = string;
                this.selectedEt = string == null ? this.etInputMaterial : this.etInputCommon;
                this.getMax = obtainStyledAttributes.getDimensionPixelSize(10, (int) this.lblTitle.getTextSize());
                this.length = obtainStyledAttributes.getColor(9, this.lblTitle.getCurrentTextColor());
                this.setMax = obtainStyledAttributes.getString(3);
                this.setMin = obtainStyledAttributes.getInt(7, 1);
                this.toIntRange = obtainStyledAttributes.getDimensionPixelSize(6, (int) this.selectedEt.getTextSize());
                this.equals = obtainStyledAttributes.getColor(5, this.selectedEt.getCurrentTextColor());
                this.IsOverlapping = obtainStyledAttributes.getInt(4, 1);
                this.isInside = obtainStyledAttributes.getBoolean(2, true);
                this.toFloatRange = obtainStyledAttributes.getDimensionPixelSize(0, layoutParams.topMargin);
                this.selectedEt.setOnKeyListener(new View.OnKeyListener(this) {
                    private final CommonInputFieldView length;

                    public final boolean onKey(
/*
Method generation error in method: o.GriverCaptureActivity.14.onKey(android.view.View, int, android.view.KeyEvent):boolean, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverCaptureActivity.14.onKey(android.view.View, int, android.view.KeyEvent):boolean, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public EditText getEditText() {
        return this.selectedEt;
    }

    public String getInputValue() {
        return this.selectedEt.getText().toString();
    }

    public void setInputValue(String str) {
        this.selectedEt.setText(str);
    }

    public void toggleClearButton(boolean z) {
        this.btnClear.setVisibility((!z || this.selectedEt.getText().length() <= 0) ? 4 : 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean getMin(int i) {
        if (i != 66) {
            return false;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.selectedEt.getWindowToken(), 0);
        return true;
    }

    public void setSideIcon(int i) {
        this.sideIcon.setImageResource(i);
        this.sideIcon.setVisibility(0);
    }

    public void setErrorMsg(String str) {
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null) {
            textInputLayout.setError(str);
            this.inputLayout.setErrorEnabled(!TextUtils.isEmpty(str));
        }
    }

    public void setColoredErrorMsg(String str, int i) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, str.length(), 0);
        this.inputLayout.setError(spannableStringBuilder);
    }

    public void setLabelTextColor(int i) {
        this.lblTitle.setTextColor(i);
    }

    public void setBackgroundInputColor(int i) {
        this.selectedEt.getBackground().setColorFilter(getResources().getColor(i), PorterDuff.Mode.SRC_ATOP);
    }

    public void setInputHint(String str) {
        if (this.getMin == null) {
            this.etGroup.setHint((CharSequence) str);
        } else {
            this.etInputCommon.setHint(str);
        }
    }

    public void isInputEnabled(boolean z) {
        this.selectedEt.setEnabled(true);
        this.selectedEt.setFocusable(z);
        this.selectedEt.setClickable(!z);
        this.selectedEt.setFocusableInTouchMode(z);
    }

    public void setCommonInputAction(length length2) {
        this.commonInputAction = length2;
    }

    public void setup() {
        this.btnClear.setVisibility(4);
        this.btnClear.setOnClickListener(new onTap(this));
        this.selectedEt.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CommonInputFieldView.this.toggleClearButton(charSequence.length() > 0);
            }
        });
        int i = 8;
        this.etInputMaterial.setVisibility(this.getMin == null ? 0 : 8);
        this.etInputCommon.setVisibility(this.getMin == null ? 8 : 0);
        String str = this.getMin;
        TextView textView = this.lblTitle;
        if (str != null) {
            i = 0;
        }
        textView.setVisibility(i);
        this.lblTitle.setText(str);
        this.lblTitle.setTextSize(0, (float) this.getMax);
        setLabelTextColor(this.length);
        if (CornerMarkingDataProvider.valueOf()) {
            this.selectedEt.setPaddingRelative(0, 0, 40, 0);
        }
        setInputHint(this.setMax);
        int i2 = this.setMin;
        if (i2 == 99) {
            i2 = 2;
        }
        this.selectedEt.setInputType(i2);
        this.selectedEt.setTextSize(0, (float) this.toIntRange);
        this.selectedEt.setTextColor(this.equals);
        this.selectedEt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.IsOverlapping)});
        ((RelativeLayout.LayoutParams) this.btnClear.getLayoutParams()).setMargins(0, this.toFloatRange, 0, 0);
        isInputEnabled(this.isInside);
        if (this.setMin == 99) {
            EditText editText = this.selectedEt;
            editText.addTextChangedListener(new ConfirmPopup(editText));
        }
        this.selectedEt.setOnClickListener(new View.OnClickListener(this) {
            private final CommonInputFieldView setMax;

            public final void onClick(
/*
Method generation error in method: o.GriverCaptureActivity.12.onClick(android.view.View):void, dex: classes6.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverCaptureActivity.12.onClick(android.view.View):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }
}
