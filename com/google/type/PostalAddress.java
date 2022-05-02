package com.google.type;

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

public final class PostalAddress extends GeneratedMessageLite<PostalAddress, Builder> implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser<PostalAddress> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private Internal.ProtobufList<String> addressLines_ = GeneratedMessageLite.emptyProtobufList();
    private String administrativeArea_ = "";
    private String languageCode_ = "";
    private String locality_ = "";
    private String organization_ = "";
    private String postalCode_ = "";
    private Internal.ProtobufList<String> recipients_ = GeneratedMessageLite.emptyProtobufList();
    private String regionCode_ = "";
    private int revision_;
    private String sortingCode_ = "";
    private String sublocality_ = "";

    private PostalAddress() {
    }

    public final int getRevision() {
        return this.revision_;
    }

    /* access modifiers changed from: private */
    public void setRevision(int i) {
        this.revision_ = i;
    }

    /* access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = 0;
    }

    public final String getRegionCode() {
        return this.regionCode_;
    }

    public final ByteString getRegionCodeBytes() {
        return ByteString.copyFromUtf8(this.regionCode_);
    }

    /* access modifiers changed from: private */
    public void setRegionCode(String str) {
        this.regionCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRegionCode() {
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* access modifiers changed from: private */
    public void setRegionCodeBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.regionCode_ = byteString.toStringUtf8();
    }

    public final String getLanguageCode() {
        return this.languageCode_;
    }

    public final ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    /* access modifiers changed from: private */
    public void setLanguageCode(String str) {
        this.languageCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* access modifiers changed from: private */
    public void setLanguageCodeBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    public final String getPostalCode() {
        return this.postalCode_;
    }

    public final ByteString getPostalCodeBytes() {
        return ByteString.copyFromUtf8(this.postalCode_);
    }

    /* access modifiers changed from: private */
    public void setPostalCode(String str) {
        this.postalCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPostalCode() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* access modifiers changed from: private */
    public void setPostalCodeBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.postalCode_ = byteString.toStringUtf8();
    }

    public final String getSortingCode() {
        return this.sortingCode_;
    }

    public final ByteString getSortingCodeBytes() {
        return ByteString.copyFromUtf8(this.sortingCode_);
    }

    /* access modifiers changed from: private */
    public void setSortingCode(String str) {
        this.sortingCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSortingCode() {
        this.sortingCode_ = getDefaultInstance().getSortingCode();
    }

    /* access modifiers changed from: private */
    public void setSortingCodeBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.sortingCode_ = byteString.toStringUtf8();
    }

    public final String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public final ByteString getAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8(this.administrativeArea_);
    }

    /* access modifiers changed from: private */
    public void setAdministrativeArea(String str) {
        this.administrativeArea_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAdministrativeArea() {
        this.administrativeArea_ = getDefaultInstance().getAdministrativeArea();
    }

    /* access modifiers changed from: private */
    public void setAdministrativeAreaBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.administrativeArea_ = byteString.toStringUtf8();
    }

    public final String getLocality() {
        return this.locality_;
    }

    public final ByteString getLocalityBytes() {
        return ByteString.copyFromUtf8(this.locality_);
    }

    /* access modifiers changed from: private */
    public void setLocality(String str) {
        this.locality_ = str;
    }

    /* access modifiers changed from: private */
    public void clearLocality() {
        this.locality_ = getDefaultInstance().getLocality();
    }

    /* access modifiers changed from: private */
    public void setLocalityBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.locality_ = byteString.toStringUtf8();
    }

    public final String getSublocality() {
        return this.sublocality_;
    }

    public final ByteString getSublocalityBytes() {
        return ByteString.copyFromUtf8(this.sublocality_);
    }

    /* access modifiers changed from: private */
    public void setSublocality(String str) {
        this.sublocality_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSublocality() {
        this.sublocality_ = getDefaultInstance().getSublocality();
    }

    /* access modifiers changed from: private */
    public void setSublocalityBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.sublocality_ = byteString.toStringUtf8();
    }

    public final List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    public final int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public final String getAddressLines(int i) {
        return (String) this.addressLines_.get(i);
    }

    public final ByteString getAddressLinesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.addressLines_.get(i));
    }

    private void ensureAddressLinesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.addressLines_;
        if (!protobufList.isModifiable()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setAddressLines(int i, String str) {
        ensureAddressLinesIsMutable();
        this.addressLines_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAddressLines(String str) {
        ensureAddressLinesIsMutable();
        this.addressLines_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAddressLines(Iterable<String> iterable) {
        ensureAddressLinesIsMutable();
        AbstractMessageLite.addAll(iterable, this.addressLines_);
    }

    /* access modifiers changed from: private */
    public void clearAddressLines() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAddressLinesBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(byteString.toStringUtf8());
    }

    public final List<String> getRecipientsList() {
        return this.recipients_;
    }

    public final int getRecipientsCount() {
        return this.recipients_.size();
    }

    public final String getRecipients(int i) {
        return (String) this.recipients_.get(i);
    }

    public final ByteString getRecipientsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.recipients_.get(i));
    }

    private void ensureRecipientsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.recipients_;
        if (!protobufList.isModifiable()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setRecipients(int i, String str) {
        ensureRecipientsIsMutable();
        this.recipients_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addRecipients(String str) {
        ensureRecipientsIsMutable();
        this.recipients_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllRecipients(Iterable<String> iterable) {
        ensureRecipientsIsMutable();
        AbstractMessageLite.addAll(iterable, this.recipients_);
    }

    /* access modifiers changed from: private */
    public void clearRecipients() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addRecipientsBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureRecipientsIsMutable();
        this.recipients_.add(byteString.toStringUtf8());
    }

    public final String getOrganization() {
        return this.organization_;
    }

    public final ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8(this.organization_);
    }

    /* access modifiers changed from: private */
    public void setOrganization(String str) {
        this.organization_ = str;
    }

    /* access modifiers changed from: private */
    public void clearOrganization() {
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* access modifiers changed from: private */
    public void setOrganizationBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.organization_ = byteString.toStringUtf8();
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PostalAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostalAddress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PostalAddress postalAddress) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(postalAddress);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PostalAddress, Builder> implements PostalAddressOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(PostalAddress.DEFAULT_INSTANCE);
        }

        public final int getRevision() {
            return ((PostalAddress) this.instance).getRevision();
        }

        public final Builder setRevision(int i) {
            copyOnWrite();
            ((PostalAddress) this.instance).setRevision(i);
            return this;
        }

        public final Builder clearRevision() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearRevision();
            return this;
        }

        public final String getRegionCode() {
            return ((PostalAddress) this.instance).getRegionCode();
        }

        public final ByteString getRegionCodeBytes() {
            return ((PostalAddress) this.instance).getRegionCodeBytes();
        }

        public final Builder setRegionCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setRegionCode(str);
            return this;
        }

        public final Builder clearRegionCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearRegionCode();
            return this;
        }

        public final Builder setRegionCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setRegionCodeBytes(byteString);
            return this;
        }

        public final String getLanguageCode() {
            return ((PostalAddress) this.instance).getLanguageCode();
        }

        public final ByteString getLanguageCodeBytes() {
            return ((PostalAddress) this.instance).getLanguageCodeBytes();
        }

        public final Builder setLanguageCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setLanguageCode(str);
            return this;
        }

        public final Builder clearLanguageCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearLanguageCode();
            return this;
        }

        public final Builder setLanguageCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setLanguageCodeBytes(byteString);
            return this;
        }

        public final String getPostalCode() {
            return ((PostalAddress) this.instance).getPostalCode();
        }

        public final ByteString getPostalCodeBytes() {
            return ((PostalAddress) this.instance).getPostalCodeBytes();
        }

        public final Builder setPostalCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setPostalCode(str);
            return this;
        }

        public final Builder clearPostalCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearPostalCode();
            return this;
        }

        public final Builder setPostalCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setPostalCodeBytes(byteString);
            return this;
        }

        public final String getSortingCode() {
            return ((PostalAddress) this.instance).getSortingCode();
        }

        public final ByteString getSortingCodeBytes() {
            return ((PostalAddress) this.instance).getSortingCodeBytes();
        }

        public final Builder setSortingCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setSortingCode(str);
            return this;
        }

        public final Builder clearSortingCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearSortingCode();
            return this;
        }

        public final Builder setSortingCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setSortingCodeBytes(byteString);
            return this;
        }

        public final String getAdministrativeArea() {
            return ((PostalAddress) this.instance).getAdministrativeArea();
        }

        public final ByteString getAdministrativeAreaBytes() {
            return ((PostalAddress) this.instance).getAdministrativeAreaBytes();
        }

        public final Builder setAdministrativeArea(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setAdministrativeArea(str);
            return this;
        }

        public final Builder clearAdministrativeArea() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearAdministrativeArea();
            return this;
        }

        public final Builder setAdministrativeAreaBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setAdministrativeAreaBytes(byteString);
            return this;
        }

        public final String getLocality() {
            return ((PostalAddress) this.instance).getLocality();
        }

        public final ByteString getLocalityBytes() {
            return ((PostalAddress) this.instance).getLocalityBytes();
        }

        public final Builder setLocality(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setLocality(str);
            return this;
        }

        public final Builder clearLocality() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearLocality();
            return this;
        }

        public final Builder setLocalityBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setLocalityBytes(byteString);
            return this;
        }

        public final String getSublocality() {
            return ((PostalAddress) this.instance).getSublocality();
        }

        public final ByteString getSublocalityBytes() {
            return ((PostalAddress) this.instance).getSublocalityBytes();
        }

        public final Builder setSublocality(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setSublocality(str);
            return this;
        }

        public final Builder clearSublocality() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearSublocality();
            return this;
        }

        public final Builder setSublocalityBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setSublocalityBytes(byteString);
            return this;
        }

        public final List<String> getAddressLinesList() {
            return Collections.unmodifiableList(((PostalAddress) this.instance).getAddressLinesList());
        }

        public final int getAddressLinesCount() {
            return ((PostalAddress) this.instance).getAddressLinesCount();
        }

        public final String getAddressLines(int i) {
            return ((PostalAddress) this.instance).getAddressLines(i);
        }

        public final ByteString getAddressLinesBytes(int i) {
            return ((PostalAddress) this.instance).getAddressLinesBytes(i);
        }

        public final Builder setAddressLines(int i, String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setAddressLines(i, str);
            return this;
        }

        public final Builder addAddressLines(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).addAddressLines(str);
            return this;
        }

        public final Builder addAllAddressLines(Iterable<String> iterable) {
            copyOnWrite();
            ((PostalAddress) this.instance).addAllAddressLines(iterable);
            return this;
        }

        public final Builder clearAddressLines() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearAddressLines();
            return this;
        }

        public final Builder addAddressLinesBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).addAddressLinesBytes(byteString);
            return this;
        }

        public final List<String> getRecipientsList() {
            return Collections.unmodifiableList(((PostalAddress) this.instance).getRecipientsList());
        }

        public final int getRecipientsCount() {
            return ((PostalAddress) this.instance).getRecipientsCount();
        }

        public final String getRecipients(int i) {
            return ((PostalAddress) this.instance).getRecipients(i);
        }

        public final ByteString getRecipientsBytes(int i) {
            return ((PostalAddress) this.instance).getRecipientsBytes(i);
        }

        public final Builder setRecipients(int i, String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setRecipients(i, str);
            return this;
        }

        public final Builder addRecipients(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).addRecipients(str);
            return this;
        }

        public final Builder addAllRecipients(Iterable<String> iterable) {
            copyOnWrite();
            ((PostalAddress) this.instance).addAllRecipients(iterable);
            return this;
        }

        public final Builder clearRecipients() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearRecipients();
            return this;
        }

        public final Builder addRecipientsBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).addRecipientsBytes(byteString);
            return this;
        }

        public final String getOrganization() {
            return ((PostalAddress) this.instance).getOrganization();
        }

        public final ByteString getOrganizationBytes() {
            return ((PostalAddress) this.instance).getOrganizationBytes();
        }

        public final Builder setOrganization(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).setOrganization(str);
            return this;
        }

        public final Builder clearOrganization() {
            copyOnWrite();
            ((PostalAddress) this.instance).clearOrganization();
            return this;
        }

        public final Builder setOrganizationBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).setOrganizationBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.type.PostalAddress$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.PostalAddress.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new PostalAddress();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PostalAddress> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (PostalAddress.class) {
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
        PostalAddress postalAddress = new PostalAddress();
        DEFAULT_INSTANCE = postalAddress;
        GeneratedMessageLite.registerDefaultInstance(PostalAddress.class, postalAddress);
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PostalAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
