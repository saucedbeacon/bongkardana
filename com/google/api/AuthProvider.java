package com.google.api;

import com.google.api.JwtLocation;
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

public final class AuthProvider extends GeneratedMessageLite<AuthProvider, Builder> implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser<AuthProvider> PARSER;
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private Internal.ProtobufList<JwtLocation> jwtLocations_ = emptyProtobufList();

    private AuthProvider() {
    }

    public final String getId() {
        return this.id_;
    }

    public final ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    /* access modifiers changed from: private */
    public void setId(String str) {
        this.id_ = str;
    }

    /* access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    public final String getIssuer() {
        return this.issuer_;
    }

    public final ByteString getIssuerBytes() {
        return ByteString.copyFromUtf8(this.issuer_);
    }

    /* access modifiers changed from: private */
    public void setIssuer(String str) {
        this.issuer_ = str;
    }

    /* access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* access modifiers changed from: private */
    public void setIssuerBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.issuer_ = byteString.toStringUtf8();
    }

    public final String getJwksUri() {
        return this.jwksUri_;
    }

    public final ByteString getJwksUriBytes() {
        return ByteString.copyFromUtf8(this.jwksUri_);
    }

    /* access modifiers changed from: private */
    public void setJwksUri(String str) {
        this.jwksUri_ = str;
    }

    /* access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* access modifiers changed from: private */
    public void setJwksUriBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.jwksUri_ = byteString.toStringUtf8();
    }

    public final String getAudiences() {
        return this.audiences_;
    }

    public final ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    /* access modifiers changed from: private */
    public void setAudiences(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(980648333, oncanceled);
            onCancelLoad.getMin(980648333, oncanceled);
        }
        this.audiences_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* access modifiers changed from: private */
    public void setAudiencesBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.audiences_ = byteString.toStringUtf8();
    }

    public final String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    public final ByteString getAuthorizationUrlBytes() {
        return ByteString.copyFromUtf8(this.authorizationUrl_);
    }

    /* access modifiers changed from: private */
    public void setAuthorizationUrl(String str) {
        this.authorizationUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* access modifiers changed from: private */
    public void setAuthorizationUrlBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.authorizationUrl_ = byteString.toStringUtf8();
    }

    public final List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public final List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public final int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    public final JwtLocation getJwtLocations(int i) {
        return (JwtLocation) this.jwtLocations_.get(i);
    }

    public final JwtLocationOrBuilder getJwtLocationsOrBuilder(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1232999344, oncanceled);
            onCancelLoad.getMin(-1232999344, oncanceled);
        }
        return (JwtLocationOrBuilder) this.jwtLocations_.get(i);
    }

    private void ensureJwtLocationsIsMutable() {
        Internal.ProtobufList<JwtLocation> protobufList = this.jwtLocations_;
        if (!protobufList.isModifiable()) {
            this.jwtLocations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setJwtLocations(int i, JwtLocation jwtLocation) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i, jwtLocation);
    }

    /* access modifiers changed from: private */
    public void addJwtLocations(JwtLocation jwtLocation) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    /* access modifiers changed from: private */
    public void addJwtLocations(int i, JwtLocation jwtLocation) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i, jwtLocation);
    }

    /* access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.jwtLocations_);
    }

    /* access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeJwtLocations(int i) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuthProvider authProvider) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthProvider, Builder> implements AuthProviderOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }

        public final String getId() {
            return ((AuthProvider) this.instance).getId();
        }

        public final ByteString getIdBytes() {
            return ((AuthProvider) this.instance).getIdBytes();
        }

        public final Builder setId(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setId(str);
            return this;
        }

        public final Builder clearId() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearId();
            return this;
        }

        public final Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIdBytes(byteString);
            return this;
        }

        public final String getIssuer() {
            return ((AuthProvider) this.instance).getIssuer();
        }

        public final ByteString getIssuerBytes() {
            return ((AuthProvider) this.instance).getIssuerBytes();
        }

        public final Builder setIssuer(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIssuer(str);
            return this;
        }

        public final Builder clearIssuer() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearIssuer();
            return this;
        }

        public final Builder setIssuerBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIssuerBytes(byteString);
            return this;
        }

        public final String getJwksUri() {
            return ((AuthProvider) this.instance).getJwksUri();
        }

        public final ByteString getJwksUriBytes() {
            return ((AuthProvider) this.instance).getJwksUriBytes();
        }

        public final Builder setJwksUri(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwksUri(str);
            return this;
        }

        public final Builder clearJwksUri() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearJwksUri();
            return this;
        }

        public final Builder setJwksUriBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwksUriBytes(byteString);
            return this;
        }

        public final String getAudiences() {
            return ((AuthProvider) this.instance).getAudiences();
        }

        public final ByteString getAudiencesBytes() {
            return ((AuthProvider) this.instance).getAudiencesBytes();
        }

        public final Builder setAudiences(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAudiences(str);
            return this;
        }

        public final Builder clearAudiences() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearAudiences();
            return this;
        }

        public final Builder setAudiencesBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAudiencesBytes(byteString);
            return this;
        }

        public final String getAuthorizationUrl() {
            return ((AuthProvider) this.instance).getAuthorizationUrl();
        }

        public final ByteString getAuthorizationUrlBytes() {
            return ((AuthProvider) this.instance).getAuthorizationUrlBytes();
        }

        public final Builder setAuthorizationUrl(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAuthorizationUrl(str);
            return this;
        }

        public final Builder clearAuthorizationUrl() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearAuthorizationUrl();
            return this;
        }

        public final Builder setAuthorizationUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAuthorizationUrlBytes(byteString);
            return this;
        }

        public final List<JwtLocation> getJwtLocationsList() {
            return Collections.unmodifiableList(((AuthProvider) this.instance).getJwtLocationsList());
        }

        public final int getJwtLocationsCount() {
            return ((AuthProvider) this.instance).getJwtLocationsCount();
        }

        public final JwtLocation getJwtLocations(int i) {
            return ((AuthProvider) this.instance).getJwtLocations(i);
        }

        public final Builder setJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwtLocations(i, jwtLocation);
            return this;
        }

        public final Builder setJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwtLocations(i, (JwtLocation) builder.build());
            return this;
        }

        public final Builder addJwtLocations(JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(jwtLocation);
            return this;
        }

        public final Builder addJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(i, jwtLocation);
            return this;
        }

        public final Builder addJwtLocations(JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations((JwtLocation) builder.build());
            return this;
        }

        public final Builder addJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(i, (JwtLocation) builder.build());
            return this;
        }

        public final Builder addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
            copyOnWrite();
            ((AuthProvider) this.instance).addAllJwtLocations(iterable);
            return this;
        }

        public final Builder clearJwtLocations() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearJwtLocations();
            return this;
        }

        public final Builder removeJwtLocations(int i) {
            copyOnWrite();
            ((AuthProvider) this.instance).removeJwtLocations(i);
            return this;
        }
    }

    /* renamed from: com.google.api.AuthProvider$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.AuthProvider.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuthProvider> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (AuthProvider.class) {
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
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuthProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
