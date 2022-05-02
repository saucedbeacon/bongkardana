package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.Page;
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

public final class Documentation extends GeneratedMessageLite<Documentation, Builder> implements DocumentationOrBuilder {
    /* access modifiers changed from: private */
    public static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser<Documentation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_ = "";
    private String overview_ = "";
    private Internal.ProtobufList<Page> pages_ = emptyProtobufList();
    private Internal.ProtobufList<DocumentationRule> rules_ = emptyProtobufList();
    private String summary_ = "";

    private Documentation() {
    }

    public final String getSummary() {
        return this.summary_;
    }

    public final ByteString getSummaryBytes() {
        return ByteString.copyFromUtf8(this.summary_);
    }

    /* access modifiers changed from: private */
    public void setSummary(String str) {
        this.summary_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    /* access modifiers changed from: private */
    public void setSummaryBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.summary_ = byteString.toStringUtf8();
    }

    public final List<Page> getPagesList() {
        return this.pages_;
    }

    public final List<? extends PageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    public final int getPagesCount() {
        return this.pages_.size();
    }

    public final Page getPages(int i) {
        return (Page) this.pages_.get(i);
    }

    public final PageOrBuilder getPagesOrBuilder(int i) {
        return (PageOrBuilder) this.pages_.get(i);
    }

    private void ensurePagesIsMutable() {
        Internal.ProtobufList<Page> protobufList = this.pages_;
        if (!protobufList.isModifiable()) {
            this.pages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setPages(int i, Page page) {
        ensurePagesIsMutable();
        this.pages_.set(i, page);
    }

    /* access modifiers changed from: private */
    public void addPages(Page page) {
        ensurePagesIsMutable();
        this.pages_.add(page);
    }

    /* access modifiers changed from: private */
    public void addPages(int i, Page page) {
        ensurePagesIsMutable();
        this.pages_.add(i, page);
    }

    /* access modifiers changed from: private */
    public void addAllPages(Iterable<? extends Page> iterable) {
        ensurePagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.pages_);
    }

    /* access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    public final List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public final List<? extends DocumentationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final DocumentationRule getRules(int i) {
        return (DocumentationRule) this.rules_.get(i);
    }

    public final DocumentationRuleOrBuilder getRulesOrBuilder(int i) {
        return (DocumentationRuleOrBuilder) this.rules_.get(i);
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<DocumentationRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setRules(int i, DocumentationRule documentationRule) {
        ensureRulesIsMutable();
        this.rules_.set(i, documentationRule);
    }

    /* access modifiers changed from: private */
    public void addRules(DocumentationRule documentationRule) {
        ensureRulesIsMutable();
        this.rules_.add(documentationRule);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, DocumentationRule documentationRule) {
        ensureRulesIsMutable();
        this.rules_.add(i, documentationRule);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends DocumentationRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    public final String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    public final ByteString getDocumentationRootUrlBytes() {
        return ByteString.copyFromUtf8(this.documentationRootUrl_);
    }

    /* access modifiers changed from: private */
    public void setDocumentationRootUrl(String str) {
        this.documentationRootUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = getDefaultInstance().getDocumentationRootUrl();
    }

    /* access modifiers changed from: private */
    public void setDocumentationRootUrlBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.documentationRootUrl_ = byteString.toStringUtf8();
    }

    public final String getOverview() {
        return this.overview_;
    }

    public final ByteString getOverviewBytes() {
        return ByteString.copyFromUtf8(this.overview_);
    }

    /* access modifiers changed from: private */
    public void setOverview(String str) {
        this.overview_ = str;
    }

    /* access modifiers changed from: private */
    public void clearOverview() {
        this.overview_ = getDefaultInstance().getOverview();
    }

    /* access modifiers changed from: private */
    public void setOverviewBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.overview_ = byteString.toStringUtf8();
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Documentation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Documentation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Documentation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Documentation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Documentation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Documentation documentation) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(documentation);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Documentation, Builder> implements DocumentationOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(Documentation.DEFAULT_INSTANCE);
        }

        public final String getSummary() {
            return ((Documentation) this.instance).getSummary();
        }

        public final ByteString getSummaryBytes() {
            return ((Documentation) this.instance).getSummaryBytes();
        }

        public final Builder setSummary(String str) {
            copyOnWrite();
            ((Documentation) this.instance).setSummary(str);
            return this;
        }

        public final Builder clearSummary() {
            copyOnWrite();
            ((Documentation) this.instance).clearSummary();
            return this;
        }

        public final Builder setSummaryBytes(ByteString byteString) {
            copyOnWrite();
            ((Documentation) this.instance).setSummaryBytes(byteString);
            return this;
        }

        public final List<Page> getPagesList() {
            return Collections.unmodifiableList(((Documentation) this.instance).getPagesList());
        }

        public final int getPagesCount() {
            return ((Documentation) this.instance).getPagesCount();
        }

        public final Page getPages(int i) {
            return ((Documentation) this.instance).getPages(i);
        }

        public final Builder setPages(int i, Page page) {
            copyOnWrite();
            ((Documentation) this.instance).setPages(i, page);
            return this;
        }

        public final Builder setPages(int i, Page.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).setPages(i, (Page) builder.build());
            return this;
        }

        public final Builder addPages(Page page) {
            copyOnWrite();
            ((Documentation) this.instance).addPages(page);
            return this;
        }

        public final Builder addPages(int i, Page page) {
            copyOnWrite();
            ((Documentation) this.instance).addPages(i, page);
            return this;
        }

        public final Builder addPages(Page.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addPages((Page) builder.build());
            return this;
        }

        public final Builder addPages(int i, Page.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addPages(i, (Page) builder.build());
            return this;
        }

        public final Builder addAllPages(Iterable<? extends Page> iterable) {
            copyOnWrite();
            ((Documentation) this.instance).addAllPages(iterable);
            return this;
        }

        public final Builder clearPages() {
            copyOnWrite();
            ((Documentation) this.instance).clearPages();
            return this;
        }

        public final Builder removePages(int i) {
            copyOnWrite();
            ((Documentation) this.instance).removePages(i);
            return this;
        }

        public final List<DocumentationRule> getRulesList() {
            return Collections.unmodifiableList(((Documentation) this.instance).getRulesList());
        }

        public final int getRulesCount() {
            return ((Documentation) this.instance).getRulesCount();
        }

        public final DocumentationRule getRules(int i) {
            return ((Documentation) this.instance).getRules(i);
        }

        public final Builder setRules(int i, DocumentationRule documentationRule) {
            copyOnWrite();
            ((Documentation) this.instance).setRules(i, documentationRule);
            return this;
        }

        public final Builder setRules(int i, DocumentationRule.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).setRules(i, (DocumentationRule) builder.build());
            return this;
        }

        public final Builder addRules(DocumentationRule documentationRule) {
            copyOnWrite();
            ((Documentation) this.instance).addRules(documentationRule);
            return this;
        }

        public final Builder addRules(int i, DocumentationRule documentationRule) {
            copyOnWrite();
            ((Documentation) this.instance).addRules(i, documentationRule);
            return this;
        }

        public final Builder addRules(DocumentationRule.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addRules((DocumentationRule) builder.build());
            return this;
        }

        public final Builder addRules(int i, DocumentationRule.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addRules(i, (DocumentationRule) builder.build());
            return this;
        }

        public final Builder addAllRules(Iterable<? extends DocumentationRule> iterable) {
            copyOnWrite();
            ((Documentation) this.instance).addAllRules(iterable);
            return this;
        }

        public final Builder clearRules() {
            copyOnWrite();
            ((Documentation) this.instance).clearRules();
            return this;
        }

        public final Builder removeRules(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-565322951, oncanceled);
                onCancelLoad.getMin(-565322951, oncanceled);
            }
            copyOnWrite();
            ((Documentation) this.instance).removeRules(i);
            return this;
        }

        public final String getDocumentationRootUrl() {
            return ((Documentation) this.instance).getDocumentationRootUrl();
        }

        public final ByteString getDocumentationRootUrlBytes() {
            return ((Documentation) this.instance).getDocumentationRootUrlBytes();
        }

        public final Builder setDocumentationRootUrl(String str) {
            copyOnWrite();
            ((Documentation) this.instance).setDocumentationRootUrl(str);
            return this;
        }

        public final Builder clearDocumentationRootUrl() {
            copyOnWrite();
            ((Documentation) this.instance).clearDocumentationRootUrl();
            return this;
        }

        public final Builder setDocumentationRootUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Documentation) this.instance).setDocumentationRootUrlBytes(byteString);
            return this;
        }

        public final String getOverview() {
            return ((Documentation) this.instance).getOverview();
        }

        public final ByteString getOverviewBytes() {
            return ((Documentation) this.instance).getOverviewBytes();
        }

        public final Builder setOverview(String str) {
            copyOnWrite();
            ((Documentation) this.instance).setOverview(str);
            return this;
        }

        public final Builder clearOverview() {
            copyOnWrite();
            ((Documentation) this.instance).clearOverview();
            return this;
        }

        public final Builder setOverviewBytes(ByteString byteString) {
            copyOnWrite();
            ((Documentation) this.instance).setOverviewBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.api.Documentation$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Documentation.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Documentation();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Documentation> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Documentation.class) {
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
        Documentation documentation = new Documentation();
        DEFAULT_INSTANCE = documentation;
        GeneratedMessageLite.registerDefaultInstance(Documentation.class, documentation);
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Documentation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
