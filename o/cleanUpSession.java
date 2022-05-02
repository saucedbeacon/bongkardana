package o;

import com.bca.xco.widget.connection.httpclient.p;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import o.getPreventCornerOverlap;
import o.setCardElevation;

public final class cleanUpSession implements ScreenOrientation$LockType {
    final put getMax;
    int getMin = 0;
    final getCardElevation length;
    final onBind setMax;
    public final resize setMin;

    public cleanUpSession(getCardElevation getcardelevation, onBind onbind, put put, resize resize) {
        this.length = getcardelevation;
        this.setMax = onbind;
        this.getMax = put;
        this.setMin = resize;
    }

    public final void getMin(getRadius getradius) {
        Proxy.Type type = this.setMax.getMin().setMax.getMax.type();
        StringBuilder sb = new StringBuilder();
        sb.append(getradius.setMax);
        sb.append(' ');
        if (onExtraCommand.setMin(getradius, type)) {
            sb.append(getradius.length);
        } else {
            sb.append(onExtraCommand.getMin(getradius.length));
        }
        sb.append(" HTTP/1.1");
        length(getradius.setMin, sb.toString());
    }

    public final getPreventCornerOverlap.setMax setMax() {
        return setMin();
    }

    public final void getMax() {
        this.setMin.flush();
    }

    public final void length(setCardElevation setcardelevation, String str) {
        if (this.getMin == 0) {
            this.setMin.getMin(str).getMin("\r\n");
            int length2 = setcardelevation.setMin.length / 2;
            for (int i = 0; i < length2; i++) {
                int i2 = i * 2;
                this.setMin.getMin(setcardelevation.setMin[i2]).getMin(": ").getMin(setcardelevation.setMin[i2 + 1]).getMin("\r\n");
            }
            this.setMin.getMin("\r\n");
            this.getMin = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.getMin);
        throw new IllegalStateException(sb.toString());
    }

    public final getPreventCornerOverlap.setMax setMin() {
        TrustedWebActivityServiceConnection$1 length2;
        getPreventCornerOverlap.setMax setmax;
        int i = this.getMin;
        if (i == 1 || i == 3) {
            do {
                try {
                    length2 = TrustedWebActivityServiceConnection$1.length(this.getMax.values());
                    setmax = new getPreventCornerOverlap.setMax();
                    setmax.setMin = length2.setMax;
                    setmax.getMax = length2.getMax;
                    setmax.getMin = length2.getMin;
                    setCardElevation length3 = length();
                    setCardElevation.setMax setmax2 = new setCardElevation.setMax();
                    Collections.addAll(setmax2.getMax, length3.setMin);
                    setmax.IsOverlapping = setmax2;
                } catch (EOFException e) {
                    StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                    sb.append(this.setMax);
                    IOException iOException = new IOException(sb.toString());
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (length2.getMax == 100);
            this.getMin = 4;
            return setmax;
        }
        StringBuilder sb2 = new StringBuilder("state: ");
        sb2.append(this.getMin);
        throw new IllegalStateException(sb2.toString());
    }

    public final setCardElevation length() {
        setCardElevation.setMax setmax = new setCardElevation.setMax();
        while (true) {
            String values = this.getMax.values();
            if (values.length() == 0) {
                return new setCardElevation(setmax, (byte) 0);
            }
            setOnInflateListener.getMax.setMax(setmax, values);
        }
    }

    public final safeSizeOf setMin(long j) {
        if (this.getMin == 4) {
            this.getMin = 5;
            return new setMax(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.getMin);
        throw new IllegalStateException(sb.toString());
    }

    final class length implements entryRemoved {
        private final hitCount getMax;
        private long length;
        private boolean setMin;

        /* synthetic */ length(cleanUpSession cleanupsession, long j, byte b) {
            this(j);
        }

        private length(long j) {
            this.getMax = new hitCount(cleanUpSession.this.setMin.setMin());
            this.length = j;
        }

        public final loadParameters setMin() {
            return this.getMax;
        }

        public final void setMax(maxSize maxsize, long j) {
            if (!this.setMin) {
                CustomTabsIntent$ShareState.getMax(maxsize.setMax, j);
                if (j <= this.length) {
                    cleanUpSession.this.setMin.setMax(maxsize, j);
                    this.length -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.length);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        public final void flush() {
            if (!this.setMin) {
                cleanUpSession.this.setMin.flush();
            }
        }

        public final void close() {
            if (!this.setMin) {
                this.setMin = true;
                if (this.length <= 0) {
                    cleanUpSession.setMin(this.getMax);
                    cleanUpSession.this.getMin = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    final class getMin implements entryRemoved {
        private final hitCount getMin;
        private boolean setMax;

        private getMin() {
            this.getMin = new hitCount(cleanUpSession.this.setMin.setMin());
        }

        /* synthetic */ getMin(cleanUpSession cleanupsession, byte b) {
            this();
        }

        public final loadParameters setMin() {
            return this.getMin;
        }

        public final void setMax(maxSize maxsize, long j) {
            if (this.setMax) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                cleanUpSession.this.setMin.setMax(j);
                cleanUpSession.this.setMin.getMin("\r\n");
                cleanUpSession.this.setMin.setMax(maxsize, j);
                cleanUpSession.this.setMin.getMin("\r\n");
            }
        }

        public final synchronized void flush() {
            if (!this.setMax) {
                cleanUpSession.this.setMin.flush();
            }
        }

        public final synchronized void close() {
            if (!this.setMax) {
                this.setMax = true;
                cleanUpSession.this.setMin.getMin("0\r\n\r\n");
                cleanUpSession.setMin(this.getMin);
                cleanUpSession.this.getMin = 3;
            }
        }
    }

    abstract class setMin implements safeSizeOf {
        protected final hitCount getMin;
        protected boolean setMax;

        private setMin() {
            this.getMin = new hitCount(cleanUpSession.this.getMax.setMin());
        }

        /* synthetic */ setMin(cleanUpSession cleanupsession, byte b) {
            this();
        }

        public final loadParameters setMin() {
            return this.getMin;
        }

        /* access modifiers changed from: protected */
        public final void setMin(boolean z) {
            if (cleanUpSession.this.getMin != 6) {
                if (cleanUpSession.this.getMin == 5) {
                    cleanUpSession.setMin(this.getMin);
                    cleanUpSession.this.getMin = 6;
                    if (cleanUpSession.this.setMax != null) {
                        cleanUpSession.this.setMax.getMax(!z, cleanUpSession.this);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(cleanUpSession.this.getMin);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    class setMax extends setMin {
        private long setMin;

        public setMax(long j) {
            super(cleanUpSession.this, (byte) 0);
            this.setMin = j;
            if (j == 0) {
                setMin(true);
            }
        }

        public final long length(maxSize maxsize, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.setMax) {
                throw new IllegalStateException("closed");
            } else if (this.setMin == 0) {
                return -1;
            } else {
                long length = cleanUpSession.this.getMax.length(maxsize, Math.min(this.setMin, j));
                if (length != -1) {
                    long j2 = this.setMin - length;
                    this.setMin = j2;
                    if (j2 == 0) {
                        setMin(true);
                    }
                    return length;
                }
                setMin(false);
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public final void close() {
            if (!this.setMax) {
                if (this.setMin != 0 && !CustomTabsIntent$ShareState.length((safeSizeOf) this, TimeUnit.MILLISECONDS)) {
                    setMin(false);
                }
                this.setMax = true;
            }
        }
    }

    class getMax extends setMin {
        private long IsOverlapping = -1;
        private final p setMin;
        private boolean toFloatRange = true;

        getMax(p pVar) {
            super(cleanUpSession.this, (byte) 0);
            this.setMin = pVar;
        }

        public final long length(maxSize maxsize, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.setMax) {
                throw new IllegalStateException("closed");
            } else if (!this.toFloatRange) {
                return -1;
            } else {
                long j2 = this.IsOverlapping;
                if (j2 == 0 || j2 == -1) {
                    if (this.IsOverlapping != -1) {
                        cleanUpSession.this.getMax.values();
                    }
                    try {
                        this.IsOverlapping = cleanUpSession.this.getMax.toFloatRange();
                        String trim = cleanUpSession.this.getMax.values().trim();
                        if (this.IsOverlapping < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb.append(this.IsOverlapping);
                            sb.append(trim);
                            sb.append("\"");
                            throw new ProtocolException(sb.toString());
                        }
                        if (this.IsOverlapping == 0) {
                            this.toFloatRange = false;
                            setInflatedId setinflatedid = cleanUpSession.this.length.toFloatRange;
                            p pVar = this.setMin;
                            setCardElevation length = cleanUpSession.this.length();
                            if (setinflatedid != setInflatedId.setMax) {
                                BrowserActionsFallbackMenuView.setMin(pVar, length).isEmpty();
                            }
                            setMin(true);
                        }
                        if (!this.toFloatRange) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long length2 = cleanUpSession.this.getMax.length(maxsize, Math.min(j, this.IsOverlapping));
                if (length2 != -1) {
                    this.IsOverlapping -= length2;
                    return length2;
                }
                setMin(false);
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public final void close() {
            if (!this.setMax) {
                if (this.toFloatRange && !CustomTabsIntent$ShareState.length((safeSizeOf) this, TimeUnit.MILLISECONDS)) {
                    setMin(false);
                }
                this.setMax = true;
            }
        }
    }

    class toIntRange extends setMin {
        private boolean getMax;

        private toIntRange() {
            super(cleanUpSession.this, (byte) 0);
        }

        /* synthetic */ toIntRange(cleanUpSession cleanupsession, byte b) {
            this();
        }

        public final long length(maxSize maxsize, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.setMax) {
                throw new IllegalStateException("closed");
            } else if (this.getMax) {
                return -1;
            } else {
                long length = cleanUpSession.this.getMax.length(maxsize, j);
                if (length != -1) {
                    return length;
                }
                this.getMax = true;
                setMin(true);
                return -1;
            }
        }

        public final void close() {
            if (!this.setMax) {
                if (!this.getMax) {
                    setMin(false);
                }
                this.setMax = true;
            }
        }
    }

    public final entryRemoved getMax(getRadius getradius, long j) {
        if ("chunked".equalsIgnoreCase(setCardElevation.setMax(getradius.setMin.setMin, HttpHeaders.TRANSFER_ENCODING))) {
            if (this.getMin == 1) {
                this.getMin = 2;
                return new getMin(this, (byte) 0);
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.getMin);
            throw new IllegalStateException(sb.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.getMin == 1) {
            this.getMin = 2;
            return new length(this, j, (byte) 0);
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.getMin);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final setPreventCornerOverlap setMax(getPreventCornerOverlap getpreventcorneroverlap) {
        safeSizeOf safesizeof;
        if (!onCancelNotification.setMin(getpreventcorneroverlap)) {
            safesizeof = setMin(0);
        } else {
            String max = setCardElevation.setMax(getpreventcorneroverlap.toFloatRange.setMin, HttpHeaders.TRANSFER_ENCODING);
            if (max == null) {
                max = null;
            }
            if ("chunked".equalsIgnoreCase(max)) {
                p pVar = getpreventcorneroverlap.getMin.length;
                if (this.getMin == 4) {
                    this.getMin = 5;
                    safesizeof = new getMax(pVar);
                } else {
                    StringBuilder sb = new StringBuilder("state: ");
                    sb.append(this.getMin);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                long max2 = onCancelNotification.getMax(getpreventcorneroverlap.toFloatRange.setMax("Content-Length"));
                if (max2 != -1) {
                    safesizeof = setMin(max2);
                } else if (this.getMin == 4) {
                    onBind onbind = this.setMax;
                    if (onbind != null) {
                        this.getMin = 5;
                        onbind.getMax(true, false, false);
                        safesizeof = new toIntRange(this, (byte) 0);
                    } else {
                        throw new IllegalStateException("streamAllocation == null");
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("state: ");
                    sb2.append(this.getMin);
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
        return new setPreventCornerOverlap(getpreventcorneroverlap.toFloatRange, putCount.getMax(safesizeof)) {
            private final setCardElevation getMin;
            private final put setMax;

            public final o.getMaxCardElevation setMax(
/*
Method generation error in method: o.TrustedWebActivityService.1.setMax():o.getMaxCardElevation, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TrustedWebActivityService.1.setMax():o.getMaxCardElevation, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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

            public final long getMax(
/*
Method generation error in method: o.TrustedWebActivityService.1.getMax():long, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TrustedWebActivityService.1.getMax():long, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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

            public final o.put getMin(
/*
Method generation error in method: o.TrustedWebActivityService.1.getMin():o.put, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TrustedWebActivityService.1.getMin():o.put, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
    }

    static /* synthetic */ void setMin(hitCount hitcount) {
        loadParameters loadparameters = hitcount.setMin;
        loadParameters loadparameters2 = loadParameters.getMax;
        if (loadparameters2 != null) {
            hitcount.setMin = loadparameters2;
            loadparameters.setMax();
            loadparameters.i_();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
