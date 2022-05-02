package id.dana.referral.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.referral.view.ReferralPopupDialog;
import o.IMultiInstanceInvalidationService;
import o.getJSApiPermissionConfig;
import o.inWhitelist;
import o.isBannedJSAPI;

public class ReferralPopupDialog extends IMultiInstanceInvalidationService<length> {
    @BindView(2131362115)
    Button btnPrimaryAction;
    @BindView(2131362128)
    Button btnSecondaryAction;
    @BindView(2131362224)
    CheckBox cbDialogReferral;
    @BindView(2131365144)
    TextView tvCheckboxDescription;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365600)
    TextView tvTitle;

    public interface getMax {
        void getMax();

        void getMax(boolean z);

        void setMin();
    }

    public /* synthetic */ ReferralPopupDialog(Context context, DialogInterface.OnDismissListener onDismissListener, length length2, byte b) {
        this(context, onDismissListener, length2);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        length length2 = (length) obj;
        String str = length2.getMax;
        if (!TextUtils.isEmpty(str)) {
            this.tvTitle.setText(str);
        }
        String str2 = length2.getMin;
        if (!TextUtils.isEmpty(str2)) {
            this.tvDescription.setText(str2);
        }
        String str3 = length2.length;
        if (!TextUtils.isEmpty(str3)) {
            this.tvCheckboxDescription.setText(str3);
            this.tvCheckboxDescription.setOnClickListener(new isBannedJSAPI(this));
        }
        this.btnPrimaryAction.setOnClickListener(new inWhitelist(length2));
        this.btnSecondaryAction.setOnClickListener(new View.OnClickListener(length2) {
            private final ReferralPopupDialog.length length;

            public final void onClick(
/*
Method generation error in method: o.GriverJSAPIPermission.1.onClick(android.view.View):void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverJSAPIPermission.1.onClick(android.view.View):void, class status: UNLOADED
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
        this.cbDialogReferral.setOnCheckedChangeListener(new getJSApiPermissionConfig(length2));
    }

    private ReferralPopupDialog(Context context, DialogInterface.OnDismissListener onDismissListener, length length2) {
        super(context, onDismissListener, Integer.valueOf(R.layout.dialog_referral), length2);
    }

    public static class length extends IMultiInstanceInvalidationService.setMin {
        public String getMax;
        public String getMin;
        public String length;
        public Context setMax;
        public DialogInterface.OnDismissListener setMin;
        public getMax toFloatRange;

        public length(Context context) {
            this.setMax = context;
            length(false);
            setMin(false);
        }
    }

    public static /* synthetic */ void setMax(length length2, boolean z) {
        if (length2.toFloatRange != null) {
            length2.toFloatRange.getMax(z);
        }
    }

    public static /* synthetic */ void setMax(length length2) {
        if (length2.toFloatRange != null) {
            length2.toFloatRange.setMin();
        }
    }

    public static /* synthetic */ void length(length length2) {
        if (length2.toFloatRange != null) {
            length2.toFloatRange.getMax();
        }
    }

    public static /* synthetic */ void length(ReferralPopupDialog referralPopupDialog) {
        CheckBox checkBox = referralPopupDialog.cbDialogReferral;
        checkBox.setChecked(!checkBox.isChecked());
    }
}
