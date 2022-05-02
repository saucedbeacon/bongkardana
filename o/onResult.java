package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.AppNode;
import o.SavedStateHandleController;

public final class onResult extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController length;
    private SavedStateHandleController.AnonymousClass1 setMin;

    public onResult(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.setMin = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AppNode.AnonymousClass1 r7 = (AppNode.AnonymousClass1) obj;
        Gson gson = this.getMax;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        savedStateHandleController.setMax(jsonWriter, 26);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(r7.gapTime);
        onActivityPrePaused.setMin(gson, cls, valueOf).write(jsonWriter, valueOf);
        savedStateHandleController.setMax(jsonWriter, 20);
        Class cls2 = Long.TYPE;
        Long valueOf2 = Long.valueOf(r7.resetTime);
        onActivityPrePaused.setMin(gson, cls2, valueOf2).write(jsonWriter, valueOf2);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AppNode.AnonymousClass1 r0 = new Object() {
            long gapTime;
            long resetTime;

            public long getGapTime(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v1 'r0' o.AppNode$1) =  call: o.AppNode.1.<init>():void type: CONSTRUCTOR in method: o.onResult.read(com.google.gson.stream.JsonReader):java.lang.Object, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
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
                	... 33 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppNode.1.getGapTime():long, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	... 50 more
                */
            /*
                this = this;
                com.google.gson.stream.JsonToken r0 = r7.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto L_0x000d
                r7.skipValue()
                r7 = 0
                return r7
            L_0x000d:
                o.AppNode$1 r0 = new o.AppNode$1
                r0.<init>()
                com.google.gson.Gson r1 = r6.getMax
                o.SavedStateHandleController$1 r2 = r6.setMin
                r7.beginObject()
            L_0x0019:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto L_0x0068
                int r3 = r2.getMin(r7)
                com.google.gson.stream.JsonToken r4 = r7.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 == r5) goto L_0x002d
                r4 = 1
                goto L_0x002e
            L_0x002d:
                r4 = 0
            L_0x002e:
                r5 = 89
                if (r3 == r5) goto L_0x004f
                r5 = 112(0x70, float:1.57E-43)
                if (r3 == r5) goto L_0x003a
                r7.skipValue()
                goto L_0x0019
            L_0x003a:
                if (r4 == 0) goto L_0x0064
                java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
                com.google.gson.TypeAdapter r3 = r1.getAdapter(r3)
                java.lang.Object r3 = r3.read(r7)
                java.lang.Long r3 = (java.lang.Long) r3
                long r3 = r3.longValue()
                r0.resetTime = r3
                goto L_0x0019
            L_0x004f:
                if (r4 == 0) goto L_0x0064
                java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
                com.google.gson.TypeAdapter r3 = r1.getAdapter(r3)
                java.lang.Object r3 = r3.read(r7)
                java.lang.Long r3 = (java.lang.Long) r3
                long r3 = r3.longValue()
                r0.gapTime = r3
                goto L_0x0019
            L_0x0064:
                r7.nextNull()
                goto L_0x0019
            L_0x0068:
                r7.endObject()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onResult.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }
    }
