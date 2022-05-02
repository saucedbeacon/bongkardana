package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.getInternalPopup;
import o.getLastBaselineToBottomHeight;
import o.onAttachedToWindow;
import o.setCompoundDrawables;
import o.setCustomSelectionActionModeCallback;
import o.setSupportBackgroundTintList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class setSupportCompoundDrawablesTintList extends setTextSize {
    private static setSupportCompoundDrawablesTintList toDoubleRange = null;
    private static final String toFloatRange = setSupportBackgroundTintList.length("WorkManagerImpl");
    private static final Object toString = new Object();
    private static setSupportCompoundDrawablesTintList values = null;
    private volatile getMinWidthMajor FastBitmap$CoordinateSystem;
    public getTextMetricsParamsCompat IsOverlapping;
    private boolean equals;
    public onAttachedToWindow getMax;
    public List<getAutoSizeMaxTextSize> getMin;
    private BroadcastReceiver.PendingResult isInside;
    public getMinWidthMinor length;
    public WorkDatabase setMax;
    public Context setMin;
    public getAutoSizeStepGranularity toIntRange;

    @Deprecated
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static setSupportCompoundDrawablesTintList setMax() {
        synchronized (toString) {
            if (values != null) {
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = values;
                return setsupportcompounddrawablestintlist;
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = toDoubleRange;
            return setsupportcompounddrawablestintlist2;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static setSupportCompoundDrawablesTintList length(@NonNull Context context) {
        setSupportCompoundDrawablesTintList max;
        synchronized (toString) {
            max = setMax();
            if (max == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof onAttachedToWindow.getMax) {
                    length(applicationContext, ((onAttachedToWindow.getMax) applicationContext).getWorkManagerConfiguration());
                    max = length(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return max;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void length(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow) {
        synchronized (toString) {
            if (values != null) {
                if (toDoubleRange != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (values == null) {
                Context applicationContext = context.getApplicationContext();
                if (toDoubleRange == null) {
                    toDoubleRange = new setSupportCompoundDrawablesTintList(applicationContext, onattachedtowindow, new dispatchFitSystemWindows(onattachedtowindow.setMax));
                }
                values = toDoubleRange;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private setSupportCompoundDrawablesTintList(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow, @NonNull getMinWidthMinor getminwidthminor) {
        this(context, onattachedtowindow, getminwidthminor, context.getResources().getBoolean(setCustomSelectionActionModeCallback.getMax.length));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private setSupportCompoundDrawablesTintList(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow, @NonNull getMinWidthMinor getminwidthminor, boolean z) {
        this(context, onattachedtowindow, getminwidthminor, WorkDatabase.getMin(context.getApplicationContext(), getminwidthminor.getMin(), z));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private setSupportCompoundDrawablesTintList(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow, @NonNull getMinWidthMinor getminwidthminor, @NonNull WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        setSupportBackgroundTintList.setMax(new setSupportBackgroundTintList.setMax(onattachedtowindow.toIntRange));
        List<getAutoSizeMaxTextSize> asList = Arrays.asList(new getAutoSizeMaxTextSize[]{getAutoSizeMinTextSize.setMax(applicationContext, this), new getSupportButtonTintList(applicationContext, onattachedtowindow, getminwidthminor, this)});
        getAutoSizeStepGranularity getautosizestepgranularity = new getAutoSizeStepGranularity(context, onattachedtowindow, getminwidthminor, workDatabase, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.setMin = applicationContext2;
        this.getMax = onattachedtowindow;
        this.length = getminwidthminor;
        this.setMax = workDatabase;
        this.getMin = asList;
        this.toIntRange = getautosizestepgranularity;
        this.IsOverlapping = new getTextMetricsParamsCompat(workDatabase);
        this.equals = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
            this.length.length(new ForceStopRunnable(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    @NonNull
    public final onCreateInputConnection length(@NonNull List<? extends onTextChanged> list) {
        if (!list.isEmpty()) {
            return new setSupportAllCaps(this, list).setMin();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @NonNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setMax(@NonNull List<setBackgroundDrawable> list) {
        if (!list.isEmpty()) {
            return new setSupportAllCaps(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    @NonNull
    public final setAutoSizeTextTypeUniformWithPresetSizes getMin(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<setBackgroundDrawable> list) {
        if (!list.isEmpty()) {
            return new setSupportAllCaps(this, str, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @NonNull
    public final onCreateInputConnection setMin(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<setBackgroundDrawable> list) {
        return new setSupportAllCaps(this, str, existingWorkPolicy, list).setMin();
    }

    @NonNull
    public final LiveData<List<WorkInfo>> getMin(@NonNull String str) {
        LiveData<List<getInternalPopup.length>> IsOverlapping2 = this.setMax.getMax().IsOverlapping(str);
        next<List<getInternalPopup.length>, List<WorkInfo>> next = getInternalPopup.invokeSuspend;
        getMinWidthMinor getminwidthminor = this.length;
        Object obj = new Object();
        onRestoreInstanceState onrestoreinstancestate = new onRestoreInstanceState();
        onrestoreinstancestate.setMax(IsOverlapping2, new onMeasure<In>(obj, next, onrestoreinstancestate) {
            final /* synthetic */ Object getMax;
            Out getMin;
            final /* synthetic */ next setMax;
            final /* synthetic */ onRestoreInstanceState setMin;

            public final void onChanged(
/*
Method generation error in method: o.setPrecomputedText.4.onChanged(java.lang.Object):void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setPrecomputedText.4.onChanged(java.lang.Object):void, class status: UNLOADED
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
        return onrestoreinstancestate;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|(2:14|(1:16)(2:17|18))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.getMinWidthMajor setMin() {
        /*
            r7 = this;
            o.getMinWidthMajor r0 = r7.FastBitmap$CoordinateSystem
            if (r0 != 0) goto L_0x0052
            java.lang.Object r0 = toString
            monitor-enter(r0)
            o.getMinWidthMajor r1 = r7.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = "androidx.work.multiprocess.RemoteWorkManagerClient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0033 }
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0033 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0033 }
            java.lang.Class<o.setSupportCompoundDrawablesTintList> r4 = o.setSupportCompoundDrawablesTintList.class
            r6 = 1
            r3[r6] = r4     // Catch:{ all -> 0x0033 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0033 }
            android.content.Context r3 = r7.setMin     // Catch:{ all -> 0x0033 }
            r2[r5] = r3     // Catch:{ all -> 0x0033 }
            r2[r6] = r7     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0033 }
            o.getMinWidthMajor r1 = (o.getMinWidthMajor) r1     // Catch:{ all -> 0x0033 }
            r7.FastBitmap$CoordinateSystem = r1     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x004f }
        L_0x0036:
            o.getMinWidthMajor r1 = r7.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004d
            o.onAttachedToWindow r1 = r7.getMax     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r1.IsOverlapping     // Catch:{ all -> 0x004f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            java.lang.String r1 = "Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
            r2.<init>(r1)     // Catch:{ all -> 0x004f }
            throw r2     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0052
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0052:
            o.getMinWidthMajor r0 = r7.FastBitmap$CoordinateSystem
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportCompoundDrawablesTintList.setMin():o.getMinWidthMajor");
    }

    public final void getMin() {
        if (Build.VERSION.SDK_INT >= 23) {
            setCheckMarkDrawable.setMax(this.setMin);
        }
        this.setMax.getMax().setMin();
        getAutoSizeMinTextSize.setMax(this.getMax, this.setMax, this.getMin);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void getMax() {
        synchronized (toString) {
            this.equals = true;
            if (this.isInside != null) {
                this.isInside.finish();
                this.isInside = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void getMin(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (toString) {
            this.isInside = pendingResult;
            if (this.equals) {
                pendingResult.finish();
                this.isInside = null;
            }
        }
    }

    @NonNull
    public final onCreateInputConnection length(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull setTextAppearance settextappearance) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new setSupportAllCaps(this, str, existingWorkPolicy, Collections.singletonList(settextappearance)).setMin();
    }

    @NonNull
    public final onCreateInputConnection getMax(@NonNull String str) {
        getLastBaselineToBottomHeight.AnonymousClass2 r0 = new getLastBaselineToBottomHeight(str, true) {
            final /* synthetic */ boolean getMax;
            final /* synthetic */ String setMin;

            public final void getMin(
/*
Method generation error in method: o.getLastBaselineToBottomHeight.2.getMin():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.getLastBaselineToBottomHeight.2.getMin():void, class status: UNLOADED
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
        };
        this.length.length(r0);
        return r0.length;
    }

    @NonNull
    public final ListenableFuture<List<WorkInfo>> setMin(@NonNull String str) {
        setCompoundDrawables.AnonymousClass2 r0 = new setCompoundDrawables<List<WorkInfo>>(str) {
            final /* synthetic */ String setMax;

            public final /* synthetic */ java.lang.Object length(
/*
Method generation error in method: o.setCompoundDrawables.2.length():java.lang.Object, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setCompoundDrawables.2.length():java.lang.Object, class status: UNLOADED
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
        };
        this.length.getMin().execute(r0);
        return r0.length;
    }
}
