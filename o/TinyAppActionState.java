package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.tracker.mixpanel.RegistrationEvent;
import id.dana.util.media.MimeType;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.ConfirmPopup;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.TinyAppActionState;

public class TinyAppActionState {
    private final getMax getMax;
    private Uri length;

    public /* synthetic */ TinyAppActionState(getMax getmax, byte b) {
        this(getmax);
    }

    private TinyAppActionState(getMax getmax) {
        this.getMax = getmax;
        getmax.getMax = new decreaseCount(this);
    }

    private static void length(Context context, List<Intent> list, Intent intent) {
        if (context != null && intent != null) {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str);
                list.add(intent2);
            }
        }
    }

    private Intent setMax() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.getMax.getMin.getMax().getPackageManager()) != null) {
            try {
                Context max = this.getMax.getMin.getMax();
                String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                StringBuilder sb = new StringBuilder("JPEG_");
                sb.append(format);
                sb.append("_");
                File createTempFile = File.createTempFile(sb.toString(), ".jpg", ConfirmPopup.AnonymousClass2.getMin(max));
                try {
                    if (CornerMarkingDataProvider.equals()) {
                        this.length = FileProvider.getUriForFile(this.getMax.getMin.getMax(), "id.dana.provider", createTempFile);
                    } else {
                        this.length = Uri.fromFile(createTempFile);
                    }
                    this.length.toString();
                    intent.putExtra("return-data", true);
                    intent.putExtra(TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, this.length);
                    return intent;
                } catch (Exception unused) {
                }
            } catch (IOException e) {
                this.getMax.length.length(e);
            }
        }
        return null;
    }

    public final void length() {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        if (this.getMax.toFloatRange) {
            length(this.getMax.getMin.getMax(), arrayList, new Intent("android.intent.action.PICK").setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MimeType.IMAGE_ALL));
        }
        if (this.getMax.toIntRange) {
            length(this.getMax.getMin.getMax(), arrayList, setMax());
        }
        if (!arrayList.isEmpty()) {
            intent = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), this.getMax.setMin);
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        } else {
            intent = null;
        }
        if (intent != null) {
            this.getMax.setMax.getMin(intent, (name) null);
        }
    }

    public static class getMax {
        C0055getMax getMax;
        final getShowAnimationId getMin;
        public TinyAppActionStateController length;
        final ITrustedWebActivityCallback<Intent> setMax;
        public String setMin;
        public boolean toFloatRange;
        public boolean toIntRange;

        /* renamed from: o.TinyAppActionState$getMax$getMax  reason: collision with other inner class name */
        interface C0055getMax {
            void getMax(ActivityResult activityResult);
        }

        public getMax(Fragment fragment) {
            this.getMin = new onSystemUiVisibilityChange(fragment);
            this.setMax = fragment.registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new getIconUnicode(this));
        }

        public getMax(AppCompatActivity appCompatActivity) {
            this.getMin = new initMenuItemWidth(appCompatActivity);
            this.setMax = appCompatActivity.registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new IPostMessageService.Default(this) {
                private final TinyAppActionState.getMax getMax;

                public final void onActivityResult(
/*
Method generation error in method: o.LandScapeTinyMenuPopupWindow.2.onActivityResult(java.lang.Object):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LandScapeTinyMenuPopupWindow.2.onActivityResult(java.lang.Object):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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

    static /* synthetic */ void length(TinyAppActionState tinyAppActionState, ActivityResult activityResult) {
        Uri uri;
        int i = activityResult.getMax;
        Intent intent = activityResult.length;
        if (i == -1) {
            String str = RegistrationEvent.ProfilePhotoSource.CAMERA;
            if (intent != null) {
                intent.getAction();
                if (intent.getData() == null) {
                    uri = tinyAppActionState.length;
                } else {
                    uri = intent.getData();
                    str = "Gallery";
                }
                tinyAppActionState.getMax.length.length(uri, str);
                return;
            }
            tinyAppActionState.getMax.length.length(tinyAppActionState.length, str);
            return;
        }
        tinyAppActionState.getMax.length.length(new Exception("action_result_canceled"));
    }
}
