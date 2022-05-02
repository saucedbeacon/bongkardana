package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class ContextRule extends GeneratedMessageLite<ContextRule, Builder> implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final ContextRule DEFAULT_INSTANCE;
    private static volatile Parser<ContextRule> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> provided_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> requested_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    private ContextRule() {
    }

    public final String getSelector() {
        return this.selector_;
    }

    public final ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    /* access modifiers changed from: private */
    public void setSelector(String str) {
        this.selector_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    /* access modifiers changed from: private */
    public void setSelectorBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.selector_ = byteString.toStringUtf8();
    }

    public final List<String> getRequestedList() {
        return this.requested_;
    }

    public final int getRequestedCount() {
        return this.requested_.size();
    }

    public final String getRequested(int i) {
        return (String) this.requested_.get(i);
    }

    public final ByteString getRequestedBytes(int i) {
        return ByteString.copyFromUtf8((String) this.requested_.get(i));
    }

    private void ensureRequestedIsMutable() {
        Internal.ProtobufList<String> protobufList = this.requested_;
        if (!protobufList.isModifiable()) {
            this.requested_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setRequested(int i, String str) {
        ensureRequestedIsMutable();
        this.requested_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addRequested(String str) {
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        AbstractMessageLite.addAll(iterable, this.requested_);
    }

    /* access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addRequestedBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureRequestedIsMutable();
        this.requested_.add(byteString.toStringUtf8());
    }

    public final List<String> getProvidedList() {
        return this.provided_;
    }

    public final int getProvidedCount() {
        return this.provided_.size();
    }

    public final String getProvided(int i) {
        return (String) this.provided_.get(i);
    }

    public final ByteString getProvidedBytes(int i) {
        return ByteString.copyFromUtf8((String) this.provided_.get(i));
    }

    private void ensureProvidedIsMutable() {
        Internal.ProtobufList<String> protobufList = this.provided_;
        if (!protobufList.isModifiable()) {
            this.provided_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setProvided(int i, String str) {
        ensureProvidedIsMutable();
        this.provided_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addProvided(String str) {
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        AbstractMessageLite.addAll(iterable, this.provided_);
    }

    /* access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addProvidedBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureProvidedIsMutable();
        this.provided_.add(byteString.toStringUtf8());
    }

    public final List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    public final int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    public final String getAllowedRequestExtensions(int i) {
        return (String) this.allowedRequestExtensions_.get(i);
    }

    public final ByteString getAllowedRequestExtensionsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.allowedRequestExtensions_.get(i));
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.allowedRequestExtensions_;
        if (!protobufList.isModifiable()) {
            this.allowedRequestExtensions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i, String str) {
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.allowedRequestExtensions_);
    }

    /* access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(byteString.toStringUtf8());
    }

    public final List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    public final int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    public final String getAllowedResponseExtensions(int i) {
        return (String) this.allowedResponseExtensions_.get(i);
    }

    public final ByteString getAllowedResponseExtensionsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.allowedResponseExtensions_.get(i));
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.allowedResponseExtensions_;
        if (!protobufList.isModifiable()) {
            this.allowedResponseExtensions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i, String str) {
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.allowedResponseExtensions_);
    }

    /* access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(byteString.toStringUtf8());
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ContextRule contextRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ContextRule, Builder> implements ContextRuleOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(ContextRule.DEFAULT_INSTANCE);
        }

        public final String getSelector() {
            return ((ContextRule) this.instance).getSelector();
        }

        public final ByteString getSelectorBytes() {
            return ((ContextRule) this.instance).getSelectorBytes();
        }

        public final Builder setSelector(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setSelector(str);
            return this;
        }

        public final Builder clearSelector() {
            copyOnWrite();
            ((ContextRule) this.instance).clearSelector();
            return this;
        }

        public final Builder setSelectorBytes(ByteString byteString) {
            copyOnWrite();
            ((ContextRule) this.instance).setSelectorBytes(byteString);
            return this;
        }

        public final List<String> getRequestedList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getRequestedList());
        }

        public final int getRequestedCount() {
            return ((ContextRule) this.instance).getRequestedCount();
        }

        public final String getRequested(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1121148490, oncanceled);
                onCancelLoad.getMin(1121148490, oncanceled);
            }
            return ((ContextRule) this.instance).getRequested(i);
        }

        public final ByteString getRequestedBytes(int i) {
            return ((ContextRule) this.instance).getRequestedBytes(i);
        }

        public final Builder setRequested(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setRequested(i, str);
            return this;
        }

        public final Builder addRequested(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addRequested(str);
            return this;
        }

        public final Builder addAllRequested(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllRequested(iterable);
            return this;
        }

        public final Builder clearRequested() {
            copyOnWrite();
            ((ContextRule) this.instance).clearRequested();
            return this;
        }

        public final Builder addRequestedBytes(ByteString byteString) {
            copyOnWrite();
            ((ContextRule) this.instance).addRequestedBytes(byteString);
            return this;
        }

        public final List<String> getProvidedList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getProvidedList());
        }

        public final int getProvidedCount() {
            return ((ContextRule) this.instance).getProvidedCount();
        }

        public final String getProvided(int i) {
            return ((ContextRule) this.instance).getProvided(i);
        }

        public final ByteString getProvidedBytes(int i) {
            return ((ContextRule) this.instance).getProvidedBytes(i);
        }

        public final Builder setProvided(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setProvided(i, str);
            return this;
        }

        public final Builder addProvided(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addProvided(str);
            return this;
        }

        public final Builder addAllProvided(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllProvided(iterable);
            return this;
        }

        public final Builder clearProvided() {
            copyOnWrite();
            ((ContextRule) this.instance).clearProvided();
            return this;
        }

        public final Builder addProvidedBytes(ByteString byteString) {
            copyOnWrite();
            ((ContextRule) this.instance).addProvidedBytes(byteString);
            return this;
        }

        public final List<String> getAllowedRequestExtensionsList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getAllowedRequestExtensionsList());
        }

        public final int getAllowedRequestExtensionsCount() {
            return ((ContextRule) this.instance).getAllowedRequestExtensionsCount();
        }

        public final String getAllowedRequestExtensions(int i) {
            return ((ContextRule) this.instance).getAllowedRequestExtensions(i);
        }

        public final ByteString getAllowedRequestExtensionsBytes(int i) {
            return ((ContextRule) this.instance).getAllowedRequestExtensionsBytes(i);
        }

        public final Builder setAllowedRequestExtensions(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setAllowedRequestExtensions(i, str);
            return this;
        }

        public final Builder addAllowedRequestExtensions(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedRequestExtensions(str);
            return this;
        }

        public final Builder addAllAllowedRequestExtensions(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllAllowedRequestExtensions(iterable);
            return this;
        }

        public final Builder clearAllowedRequestExtensions() {
            copyOnWrite();
            ((ContextRule) this.instance).clearAllowedRequestExtensions();
            return this;
        }

        public final Builder addAllowedRequestExtensionsBytes(ByteString byteString) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedRequestExtensionsBytes(byteString);
            return this;
        }

        public final List<String> getAllowedResponseExtensionsList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getAllowedResponseExtensionsList());
        }

        public final int getAllowedResponseExtensionsCount() {
            return ((ContextRule) this.instance).getAllowedResponseExtensionsCount();
        }

        public final String getAllowedResponseExtensions(int i) {
            return ((ContextRule) this.instance).getAllowedResponseExtensions(i);
        }

        public final ByteString getAllowedResponseExtensionsBytes(int i) {
            return ((ContextRule) this.instance).getAllowedResponseExtensionsBytes(i);
        }

        public final Builder setAllowedResponseExtensions(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setAllowedResponseExtensions(i, str);
            return this;
        }

        public final Builder addAllowedResponseExtensions(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedResponseExtensions(str);
            return this;
        }

        public final Builder addAllAllowedResponseExtensions(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllAllowedResponseExtensions(iterable);
            return this;
        }

        public final Builder clearAllowedResponseExtensions() {
            copyOnWrite();
            ((ContextRule) this.instance).clearAllowedResponseExtensions();
            return this;
        }

        public final Builder addAllowedResponseExtensionsBytes(ByteString byteString) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedResponseExtensionsBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.api.ContextRule$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ContextRule.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ContextRule();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContextRule> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ContextRule.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, contextRule);
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ContextRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
