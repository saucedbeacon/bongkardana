package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.AppNode;
import o.SavedStateHandleController;

public final class setupResult extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 length;
    private Gson setMin;

    public setupResult(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.length = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 r4 = (AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1) obj;
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        if (r4 != r4.buttonIconUrl) {
            savedStateHandleController.setMax(jsonWriter, 119);
            jsonWriter.value(r4.buttonIconUrl);
        }
        if (r4 != r4.buttonTitle) {
            savedStateHandleController.setMax(jsonWriter, 179);
            jsonWriter.value(r4.buttonTitle);
        }
        if (r4 != r4.description) {
            savedStateHandleController.setMax(jsonWriter, 48);
            jsonWriter.value(r4.description);
        }
        savedStateHandleController.setMax(jsonWriter, 98);
        jsonWriter.value(r4.enable);
        if (r4 != r4.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(r4.title);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 r0 = new Object() {
            String buttonIconUrl;
            String buttonTitle;
            String description;
            boolean enable;
            String title;

            private java.lang.String getStringOrEmpty(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v1 'r0' o.AppNode$6$1$1) =  call: o.AppNode.6.1.1.<init>():void type: CONSTRUCTOR in method: o.setupResult.read(com.google.gson.stream.JsonReader):java.lang.Object, dex: classes2.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppNode.6.1.1.getStringOrEmpty(java.lang.String):java.lang.String, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	... 50 more
                */
            /*
                this = this;
                com.google.gson.stream.JsonToken r0 = r8.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r8.skipValue()
                return r2
            L_0x000d:
                o.AppNode$6$1$1 r0 = new o.AppNode$6$1$1
                r0.<init>()
                com.google.gson.Gson r1 = r7.setMin
                o.SavedStateHandleController$1 r3 = r7.length
                r8.beginObject()
            L_0x0019:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L_0x00d5
                int r4 = r3.getMin(r8)
                com.google.gson.stream.JsonToken r5 = r8.peek()
                com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                if (r5 == r6) goto L_0x002d
                r5 = 1
                goto L_0x002e
            L_0x002d:
                r5 = 0
            L_0x002e:
                r6 = 45
                if (r4 == r6) goto L_0x00b3
                r6 = 144(0x90, float:2.02E-43)
                if (r4 == r6) goto L_0x0095
                r6 = 149(0x95, float:2.09E-43)
                if (r4 == r6) goto L_0x0078
                r6 = 180(0xb4, float:2.52E-43)
                if (r4 == r6) goto L_0x005b
                r6 = 184(0xb8, float:2.58E-43)
                if (r4 == r6) goto L_0x0046
                r8.skipValue()
                goto L_0x0019
            L_0x0046:
                if (r5 == 0) goto L_0x00d0
                java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r0.enable = r4
                goto L_0x0019
            L_0x005b:
                if (r5 == 0) goto L_0x0075
                com.google.gson.stream.JsonToken r4 = r8.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
                if (r4 == r5) goto L_0x006a
                java.lang.String r4 = r8.nextString()
                goto L_0x0072
            L_0x006a:
                boolean r4 = r8.nextBoolean()
                java.lang.String r4 = java.lang.Boolean.toString(r4)
            L_0x0072:
                r0.buttonIconUrl = r4
                goto L_0x0019
            L_0x0075:
                r0.buttonIconUrl = r2
                goto L_0x00d0
            L_0x0078:
                if (r5 == 0) goto L_0x0092
                com.google.gson.stream.JsonToken r4 = r8.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
                if (r4 == r5) goto L_0x0087
                java.lang.String r4 = r8.nextString()
                goto L_0x008f
            L_0x0087:
                boolean r4 = r8.nextBoolean()
                java.lang.String r4 = java.lang.Boolean.toString(r4)
            L_0x008f:
                r0.description = r4
                goto L_0x0019
            L_0x0092:
                r0.description = r2
                goto L_0x00d0
            L_0x0095:
                if (r5 == 0) goto L_0x00b0
                com.google.gson.stream.JsonToken r4 = r8.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
                if (r4 == r5) goto L_0x00a4
                java.lang.String r4 = r8.nextString()
                goto L_0x00ac
            L_0x00a4:
                boolean r4 = r8.nextBoolean()
                java.lang.String r4 = java.lang.Boolean.toString(r4)
            L_0x00ac:
                r0.buttonTitle = r4
                goto L_0x0019
            L_0x00b0:
                r0.buttonTitle = r2
                goto L_0x00d0
            L_0x00b3:
                if (r5 == 0) goto L_0x00ce
                com.google.gson.stream.JsonToken r4 = r8.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
                if (r4 == r5) goto L_0x00c2
                java.lang.String r4 = r8.nextString()
                goto L_0x00ca
            L_0x00c2:
                boolean r4 = r8.nextBoolean()
                java.lang.String r4 = java.lang.Boolean.toString(r4)
            L_0x00ca:
                r0.title = r4
                goto L_0x0019
            L_0x00ce:
                r0.title = r2
            L_0x00d0:
                r8.nextNull()
                goto L_0x0019
            L_0x00d5:
                r8.endObject()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setupResult.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }
    }
