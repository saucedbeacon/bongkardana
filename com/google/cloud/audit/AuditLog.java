package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class AuditLog extends GeneratedMessageLite<AuditLog, Builder> implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    /* access modifiers changed from: private */
    public static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser<AuditLog> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private Internal.ProtobufList<AuthorizationInfo> authorizationInfo_ = emptyProtobufList();
    private String methodName_ = "";
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private String resourceName_ = "";
    private Struct response_;
    private Any serviceData_;
    private String serviceName_ = "";
    private Status status_;

    private AuditLog() {
    }

    public final String getServiceName() {
        return this.serviceName_;
    }

    public final ByteString getServiceNameBytes() {
        return ByteString.copyFromUtf8(this.serviceName_);
    }

    /* access modifiers changed from: private */
    public void setServiceName(String str) {
        this.serviceName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearServiceName() {
        this.serviceName_ = getDefaultInstance().getServiceName();
    }

    /* access modifiers changed from: private */
    public void setServiceNameBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.serviceName_ = byteString.toStringUtf8();
    }

    public final String getMethodName() {
        return this.methodName_;
    }

    public final ByteString getMethodNameBytes() {
        return ByteString.copyFromUtf8(this.methodName_);
    }

    /* access modifiers changed from: private */
    public void setMethodName(String str) {
        this.methodName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearMethodName() {
        this.methodName_ = getDefaultInstance().getMethodName();
    }

    /* access modifiers changed from: private */
    public void setMethodNameBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.methodName_ = byteString.toStringUtf8();
    }

    public final String getResourceName() {
        return this.resourceName_;
    }

    public final ByteString getResourceNameBytes() {
        return ByteString.copyFromUtf8(this.resourceName_);
    }

    /* access modifiers changed from: private */
    public void setResourceName(String str) {
        this.resourceName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* access modifiers changed from: private */
    public void setResourceNameBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.resourceName_ = byteString.toStringUtf8();
    }

    public final long getNumResponseItems() {
        return this.numResponseItems_;
    }

    /* access modifiers changed from: private */
    public void setNumResponseItems(long j) {
        this.numResponseItems_ = j;
    }

    /* access modifiers changed from: private */
    public void clearNumResponseItems() {
        this.numResponseItems_ = 0;
    }

    public final boolean hasStatus() {
        return this.status_ != null;
    }

    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    /* access modifiers changed from: private */
    public void setStatus(Status status) {
        this.status_ = status;
    }

    /* access modifiers changed from: private */
    public void mergeStatus(Status status) {
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.Builder) Status.newBuilder(this.status_).mergeFrom(status)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
    }

    public final boolean hasAuthenticationInfo() {
        return this.authenticationInfo_ != null;
    }

    public final AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
    }

    /* access modifiers changed from: private */
    public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        this.authenticationInfo_ = authenticationInfo;
    }

    /* access modifiers changed from: private */
    public void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        AuthenticationInfo authenticationInfo2 = this.authenticationInfo_;
        if (authenticationInfo2 == null || authenticationInfo2 == AuthenticationInfo.getDefaultInstance()) {
            this.authenticationInfo_ = authenticationInfo;
        } else {
            this.authenticationInfo_ = (AuthenticationInfo) ((AuthenticationInfo.Builder) AuthenticationInfo.newBuilder(this.authenticationInfo_).mergeFrom(authenticationInfo)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
    }

    public final List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public final List<? extends AuthorizationInfoOrBuilder> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    public final int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    public final AuthorizationInfo getAuthorizationInfo(int i) {
        return (AuthorizationInfo) this.authorizationInfo_.get(i);
    }

    public final AuthorizationInfoOrBuilder getAuthorizationInfoOrBuilder(int i) {
        return (AuthorizationInfoOrBuilder) this.authorizationInfo_.get(i);
    }

    private void ensureAuthorizationInfoIsMutable() {
        Internal.ProtobufList<AuthorizationInfo> protobufList = this.authorizationInfo_;
        if (!protobufList.isModifiable()) {
            this.authorizationInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(i, authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(i, authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        ensureAuthorizationInfoIsMutable();
        AbstractMessageLite.addAll(iterable, this.authorizationInfo_);
    }

    /* access modifiers changed from: private */
    public void clearAuthorizationInfo() {
        this.authorizationInfo_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeAuthorizationInfo(int i) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(i);
    }

    public final boolean hasRequestMetadata() {
        return this.requestMetadata_ != null;
    }

    public final RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
    }

    /* access modifiers changed from: private */
    public void setRequestMetadata(RequestMetadata requestMetadata) {
        this.requestMetadata_ = requestMetadata;
    }

    /* access modifiers changed from: private */
    public void mergeRequestMetadata(RequestMetadata requestMetadata) {
        RequestMetadata requestMetadata2 = this.requestMetadata_;
        if (requestMetadata2 == null || requestMetadata2 == RequestMetadata.getDefaultInstance()) {
            this.requestMetadata_ = requestMetadata;
        } else {
            this.requestMetadata_ = (RequestMetadata) ((RequestMetadata.Builder) RequestMetadata.newBuilder(this.requestMetadata_).mergeFrom(requestMetadata)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRequestMetadata() {
        this.requestMetadata_ = null;
    }

    public final boolean hasRequest() {
        return this.request_ != null;
    }

    public final Struct getRequest() {
        Struct struct = this.request_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    /* access modifiers changed from: private */
    public void setRequest(Struct struct) {
        this.request_ = struct;
    }

    /* access modifiers changed from: private */
    public void mergeRequest(Struct struct) {
        Struct struct2 = this.request_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.request_ = struct;
        } else {
            this.request_ = (Struct) ((Struct.Builder) Struct.newBuilder(this.request_).mergeFrom(struct)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    public final boolean hasResponse() {
        return this.response_ != null;
    }

    public final Struct getResponse() {
        Struct struct = this.response_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    /* access modifiers changed from: private */
    public void setResponse(Struct struct) {
        this.response_ = struct;
    }

    /* access modifiers changed from: private */
    public void mergeResponse(Struct struct) {
        Struct struct2 = this.response_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.response_ = struct;
        } else {
            this.response_ = (Struct) ((Struct.Builder) Struct.newBuilder(this.response_).mergeFrom(struct)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    public final boolean hasServiceData() {
        return this.serviceData_ != null;
    }

    public final Any getServiceData() {
        Any any = this.serviceData_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    /* access modifiers changed from: private */
    public void setServiceData(Any any) {
        this.serviceData_ = any;
    }

    /* access modifiers changed from: private */
    public void mergeServiceData(Any any) {
        Any any2 = this.serviceData_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.serviceData_ = any;
        } else {
            this.serviceData_ = (Any) ((Any.Builder) Any.newBuilder(this.serviceData_).mergeFrom(any)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearServiceData() {
        this.serviceData_ = null;
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuditLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AuditLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuditLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuditLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditLog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuditLog auditLog) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(auditLog);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuditLog, Builder> implements AuditLogOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(AuditLog.DEFAULT_INSTANCE);
        }

        public final String getServiceName() {
            return ((AuditLog) this.instance).getServiceName();
        }

        public final ByteString getServiceNameBytes() {
            return ((AuditLog) this.instance).getServiceNameBytes();
        }

        public final Builder setServiceName(String str) {
            copyOnWrite();
            ((AuditLog) this.instance).setServiceName(str);
            return this;
        }

        public final Builder clearServiceName() {
            copyOnWrite();
            ((AuditLog) this.instance).clearServiceName();
            return this;
        }

        public final Builder setServiceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AuditLog) this.instance).setServiceNameBytes(byteString);
            return this;
        }

        public final String getMethodName() {
            return ((AuditLog) this.instance).getMethodName();
        }

        public final ByteString getMethodNameBytes() {
            return ((AuditLog) this.instance).getMethodNameBytes();
        }

        public final Builder setMethodName(String str) {
            copyOnWrite();
            ((AuditLog) this.instance).setMethodName(str);
            return this;
        }

        public final Builder clearMethodName() {
            copyOnWrite();
            ((AuditLog) this.instance).clearMethodName();
            return this;
        }

        public final Builder setMethodNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AuditLog) this.instance).setMethodNameBytes(byteString);
            return this;
        }

        public final String getResourceName() {
            return ((AuditLog) this.instance).getResourceName();
        }

        public final ByteString getResourceNameBytes() {
            return ((AuditLog) this.instance).getResourceNameBytes();
        }

        public final Builder setResourceName(String str) {
            copyOnWrite();
            ((AuditLog) this.instance).setResourceName(str);
            return this;
        }

        public final Builder clearResourceName() {
            copyOnWrite();
            ((AuditLog) this.instance).clearResourceName();
            return this;
        }

        public final Builder setResourceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AuditLog) this.instance).setResourceNameBytes(byteString);
            return this;
        }

        public final long getNumResponseItems() {
            return ((AuditLog) this.instance).getNumResponseItems();
        }

        public final Builder setNumResponseItems(long j) {
            copyOnWrite();
            ((AuditLog) this.instance).setNumResponseItems(j);
            return this;
        }

        public final Builder clearNumResponseItems() {
            copyOnWrite();
            ((AuditLog) this.instance).clearNumResponseItems();
            return this;
        }

        public final boolean hasStatus() {
            return ((AuditLog) this.instance).hasStatus();
        }

        public final Status getStatus() {
            return ((AuditLog) this.instance).getStatus();
        }

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((AuditLog) this.instance).setStatus(status);
            return this;
        }

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).setStatus((Status) builder.build());
            return this;
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((AuditLog) this.instance).mergeStatus(status);
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((AuditLog) this.instance).clearStatus();
            return this;
        }

        public final boolean hasAuthenticationInfo() {
            return ((AuditLog) this.instance).hasAuthenticationInfo();
        }

        public final AuthenticationInfo getAuthenticationInfo() {
            return ((AuditLog) this.instance).getAuthenticationInfo();
        }

        public final Builder setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            copyOnWrite();
            ((AuditLog) this.instance).setAuthenticationInfo(authenticationInfo);
            return this;
        }

        public final Builder setAuthenticationInfo(AuthenticationInfo.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).setAuthenticationInfo((AuthenticationInfo) builder.build());
            return this;
        }

        public final Builder mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            copyOnWrite();
            ((AuditLog) this.instance).mergeAuthenticationInfo(authenticationInfo);
            return this;
        }

        public final Builder clearAuthenticationInfo() {
            copyOnWrite();
            ((AuditLog) this.instance).clearAuthenticationInfo();
            return this;
        }

        public final List<AuthorizationInfo> getAuthorizationInfoList() {
            return Collections.unmodifiableList(((AuditLog) this.instance).getAuthorizationInfoList());
        }

        public final int getAuthorizationInfoCount() {
            return ((AuditLog) this.instance).getAuthorizationInfoCount();
        }

        public final AuthorizationInfo getAuthorizationInfo(int i) {
            return ((AuditLog) this.instance).getAuthorizationInfo(i);
        }

        public final Builder setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
            copyOnWrite();
            ((AuditLog) this.instance).setAuthorizationInfo(i, authorizationInfo);
            return this;
        }

        public final Builder setAuthorizationInfo(int i, AuthorizationInfo.Builder builder) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-779484480, oncanceled);
                onCancelLoad.getMin(-779484480, oncanceled);
            }
            copyOnWrite();
            ((AuditLog) this.instance).setAuthorizationInfo(i, (AuthorizationInfo) builder.build());
            return this;
        }

        public final Builder addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
            copyOnWrite();
            ((AuditLog) this.instance).addAuthorizationInfo(authorizationInfo);
            return this;
        }

        public final Builder addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
            copyOnWrite();
            ((AuditLog) this.instance).addAuthorizationInfo(i, authorizationInfo);
            return this;
        }

        public final Builder addAuthorizationInfo(AuthorizationInfo.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).addAuthorizationInfo((AuthorizationInfo) builder.build());
            return this;
        }

        public final Builder addAuthorizationInfo(int i, AuthorizationInfo.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).addAuthorizationInfo(i, (AuthorizationInfo) builder.build());
            return this;
        }

        public final Builder addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
            copyOnWrite();
            ((AuditLog) this.instance).addAllAuthorizationInfo(iterable);
            return this;
        }

        public final Builder clearAuthorizationInfo() {
            copyOnWrite();
            ((AuditLog) this.instance).clearAuthorizationInfo();
            return this;
        }

        public final Builder removeAuthorizationInfo(int i) {
            copyOnWrite();
            ((AuditLog) this.instance).removeAuthorizationInfo(i);
            return this;
        }

        public final boolean hasRequestMetadata() {
            return ((AuditLog) this.instance).hasRequestMetadata();
        }

        public final RequestMetadata getRequestMetadata() {
            return ((AuditLog) this.instance).getRequestMetadata();
        }

        public final Builder setRequestMetadata(RequestMetadata requestMetadata) {
            copyOnWrite();
            ((AuditLog) this.instance).setRequestMetadata(requestMetadata);
            return this;
        }

        public final Builder setRequestMetadata(RequestMetadata.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).setRequestMetadata((RequestMetadata) builder.build());
            return this;
        }

        public final Builder mergeRequestMetadata(RequestMetadata requestMetadata) {
            copyOnWrite();
            ((AuditLog) this.instance).mergeRequestMetadata(requestMetadata);
            return this;
        }

        public final Builder clearRequestMetadata() {
            copyOnWrite();
            ((AuditLog) this.instance).clearRequestMetadata();
            return this;
        }

        public final boolean hasRequest() {
            return ((AuditLog) this.instance).hasRequest();
        }

        public final Struct getRequest() {
            return ((AuditLog) this.instance).getRequest();
        }

        public final Builder setRequest(Struct struct) {
            copyOnWrite();
            ((AuditLog) this.instance).setRequest(struct);
            return this;
        }

        public final Builder setRequest(Struct.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).setRequest((Struct) builder.build());
            return this;
        }

        public final Builder mergeRequest(Struct struct) {
            copyOnWrite();
            ((AuditLog) this.instance).mergeRequest(struct);
            return this;
        }

        public final Builder clearRequest() {
            copyOnWrite();
            ((AuditLog) this.instance).clearRequest();
            return this;
        }

        public final boolean hasResponse() {
            return ((AuditLog) this.instance).hasResponse();
        }

        public final Struct getResponse() {
            return ((AuditLog) this.instance).getResponse();
        }

        public final Builder setResponse(Struct struct) {
            copyOnWrite();
            ((AuditLog) this.instance).setResponse(struct);
            return this;
        }

        public final Builder setResponse(Struct.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).setResponse((Struct) builder.build());
            return this;
        }

        public final Builder mergeResponse(Struct struct) {
            copyOnWrite();
            ((AuditLog) this.instance).mergeResponse(struct);
            return this;
        }

        public final Builder clearResponse() {
            copyOnWrite();
            ((AuditLog) this.instance).clearResponse();
            return this;
        }

        public final boolean hasServiceData() {
            return ((AuditLog) this.instance).hasServiceData();
        }

        public final Any getServiceData() {
            return ((AuditLog) this.instance).getServiceData();
        }

        public final Builder setServiceData(Any any) {
            copyOnWrite();
            ((AuditLog) this.instance).setServiceData(any);
            return this;
        }

        public final Builder setServiceData(Any.Builder builder) {
            copyOnWrite();
            ((AuditLog) this.instance).setServiceData((Any) builder.build());
            return this;
        }

        public final Builder mergeServiceData(Any any) {
            copyOnWrite();
            ((AuditLog) this.instance).mergeServiceData(any);
            return this;
        }

        public final Builder clearServiceData() {
            copyOnWrite();
            ((AuditLog) this.instance).clearServiceData();
            return this;
        }
    }

    /* renamed from: com.google.cloud.audit.AuditLog$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.cloud.audit.AuditLog.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AuditLog();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000f\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuditLog> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (AuditLog.class) {
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
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        GeneratedMessageLite.registerDefaultInstance(AuditLog.class, auditLog);
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuditLog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
