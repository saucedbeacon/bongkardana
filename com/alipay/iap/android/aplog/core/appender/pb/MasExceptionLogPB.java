package com.alipay.iap.android.aplog.core.appender.pb;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;

public final class MasExceptionLogPB {
    /* access modifiers changed from: private */
    public static Descriptors.FileDescriptor descriptor;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_protocobuff_log_MasExceptionLog_descriptor = ((Descriptors.Descriptor) getDescriptor().getMessageTypes().get(0));
    /* access modifiers changed from: private */
    public static GeneratedMessage.FieldAccessorTable internal_static_protocobuff_log_MasExceptionLog_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_protocobuff_log_MasExceptionLog_descriptor, new String[]{"AppID", "AppVersion", "Messages"});

    public interface MasExceptionLogOrBuilder extends MessageOrBuilder {
        String getAppID();

        ByteString getAppIDBytes();

        String getAppVersion();

        ByteString getAppVersionBytes();

        String getMessages();

        ByteString getMessagesBytes();

        boolean hasAppID();

        boolean hasAppVersion();

        boolean hasMessages();
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015MasExceptionLog.proto\u0012\u000fprotocobuff_log\"F\n\u000fMasExceptionLog\u0012\r\n\u0005appID\u0018\u0001 \u0002(\t\u0012\u0012\n\nappVersion\u0018\u0002 \u0001(\t\u0012\u0010\n\bmessages\u0018\u0003 \u0002(\tBB\n-com.alipay.iap.android.aplog.core.appender.pbB\u0011MasExceptionLogPB"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public final ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = MasExceptionLogPB.descriptor = fileDescriptor;
                return null;
            }
        });
    }

    private MasExceptionLogPB() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static final class MasExceptionLog extends GeneratedMessage implements MasExceptionLogOrBuilder {
        public static final int APPID_FIELD_NUMBER = 1;
        public static final int APPVERSION_FIELD_NUMBER = 2;
        public static final int MESSAGES_FIELD_NUMBER = 3;
        public static Parser<MasExceptionLog> PARSER = new AbstractParser<MasExceptionLog>() {
            public final MasExceptionLog parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MasExceptionLog(codedInputStream, extensionRegistryLite);
            }
        };
        private static final MasExceptionLog defaultInstance;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Object appID_;
        /* access modifiers changed from: private */
        public Object appVersion_;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public Object messages_;
        private final UnknownFieldSet unknownFields;

        static {
            MasExceptionLog masExceptionLog = new MasExceptionLog(true);
            defaultInstance = masExceptionLog;
            masExceptionLog.initFields();
        }

        private MasExceptionLog(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private MasExceptionLog(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [com.google.protobuf.MessageLite, com.alipay.iap.android.aplog.core.appender.pb.MasExceptionLogPB$MasExceptionLog] */
        private MasExceptionLog(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 1;
                            this.appID_ = readBytes;
                        } else if (readTag == 18) {
                            ByteString readBytes2 = codedInputStream.readBytes();
                            this.bitField0_ |= 2;
                            this.appVersion_ = readBytes2;
                        } else if (readTag == 26) {
                            ByteString readBytes3 = codedInputStream.readBytes();
                            this.bitField0_ |= 4;
                            this.messages_ = readBytes3;
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static MasExceptionLog getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MasExceptionLogPB.internal_static_protocobuff_log_MasExceptionLog_descriptor;
        }

        public static MasExceptionLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static MasExceptionLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MasExceptionLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static MasExceptionLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MasExceptionLog parseFrom(InputStream inputStream) throws IOException {
            return PARSER.parseFrom(inputStream);
        }

        public static MasExceptionLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static MasExceptionLog parseDelimitedFrom(InputStream inputStream) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream);
        }

        public static MasExceptionLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static MasExceptionLog parseFrom(CodedInputStream codedInputStream) throws IOException {
            return PARSER.parseFrom(codedInputStream);
        }

        public static MasExceptionLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(MasExceptionLog masExceptionLog) {
            return newBuilder().mergeFrom(masExceptionLog);
        }

        public final MasExceptionLog getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MasExceptionLogPB.internal_static_protocobuff_log_MasExceptionLog_fieldAccessorTable.ensureFieldAccessorsInitialized(MasExceptionLog.class, Builder.class);
        }

        public final Parser<MasExceptionLog> getParserForType() {
            return PARSER;
        }

        public final boolean hasAppID() {
            return (this.bitField0_ & 1) == 1;
        }

        public final String getAppID() {
            Object obj = this.appID_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appID_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getAppIDBytes() {
            Object obj = this.appID_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appID_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasAppVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        public final String getAppVersion() {
            Object obj = this.appVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getAppVersionBytes() {
            Object obj = this.appVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasMessages() {
            return (this.bitField0_ & 4) == 4;
        }

        public final String getMessages() {
            Object obj = this.messages_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.messages_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getMessagesBytes() {
            Object obj = this.messages_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.messages_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private void initFields() {
            this.appID_ = "";
            this.appVersion_ = "";
            this.messages_ = "";
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasAppID()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasMessages()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, getAppIDBytes());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, getAppVersionBytes());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, getMessagesBytes());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeBytesSize(1, getAppIDBytes());
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeBytesSize(2, getAppVersionBytes());
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeBytesSize(3, getMessagesBytes());
            }
            int serializedSize = i2 + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        /* access modifiers changed from: protected */
        public final Object writeReplace() throws ObjectStreamException {
            return MasExceptionLogPB.super.writeReplace();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements MasExceptionLogOrBuilder {
            private Object appID_;
            private Object appVersion_;
            private int bitField0_;
            private Object messages_;

            private Builder() {
                this.appID_ = "";
                this.appVersion_ = "";
                this.messages_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent builderParent) {
                super(builderParent);
                this.appID_ = "";
                this.appVersion_ = "";
                this.messages_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MasExceptionLogPB.internal_static_protocobuff_log_MasExceptionLog_descriptor;
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            /* access modifiers changed from: protected */
            public final GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MasExceptionLogPB.internal_static_protocobuff_log_MasExceptionLog_fieldAccessorTable.ensureFieldAccessorsInitialized(MasExceptionLog.class, Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = MasExceptionLog.alwaysUseFieldBuilders;
            }

            public final Builder clear() {
                MasExceptionLog.super.clear();
                this.appID_ = "";
                int i = this.bitField0_ & -2;
                this.bitField0_ = i;
                this.appVersion_ = "";
                int i2 = i & -3;
                this.bitField0_ = i2;
                this.messages_ = "";
                this.bitField0_ = i2 & -5;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return MasExceptionLogPB.internal_static_protocobuff_log_MasExceptionLog_descriptor;
            }

            public final MasExceptionLog getDefaultInstanceForType() {
                return MasExceptionLog.getDefaultInstance();
            }

            public final MasExceptionLog build() {
                MasExceptionLog buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final MasExceptionLog buildPartial() {
                MasExceptionLog masExceptionLog = new MasExceptionLog((GeneratedMessage.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                Object unused = masExceptionLog.appID_ = this.appID_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                Object unused2 = masExceptionLog.appVersion_ = this.appVersion_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                Object unused3 = masExceptionLog.messages_ = this.messages_;
                int unused4 = masExceptionLog.bitField0_ = i2;
                onBuilt();
                return masExceptionLog;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof MasExceptionLog) {
                    return mergeFrom((MasExceptionLog) message);
                }
                MasExceptionLog.super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(MasExceptionLog masExceptionLog) {
                if (masExceptionLog == MasExceptionLog.getDefaultInstance()) {
                    return this;
                }
                if (masExceptionLog.hasAppID()) {
                    this.bitField0_ |= 1;
                    this.appID_ = masExceptionLog.appID_;
                    onChanged();
                }
                if (masExceptionLog.hasAppVersion()) {
                    this.bitField0_ |= 2;
                    this.appVersion_ = masExceptionLog.appVersion_;
                    onChanged();
                }
                if (masExceptionLog.hasMessages()) {
                    this.bitField0_ |= 4;
                    this.messages_ = masExceptionLog.messages_;
                    onChanged();
                }
                mergeUnknownFields(masExceptionLog.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (hasAppID() && hasMessages()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                MasExceptionLog masExceptionLog;
                MasExceptionLog masExceptionLog2 = null;
                try {
                    MasExceptionLog parsePartialFrom = MasExceptionLog.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    masExceptionLog = (MasExceptionLog) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    masExceptionLog2 = masExceptionLog;
                }
                if (masExceptionLog2 != null) {
                    mergeFrom(masExceptionLog2);
                }
                throw th;
            }

            public final boolean hasAppID() {
                return (this.bitField0_ & 1) == 1;
            }

            public final String getAppID() {
                Object obj = this.appID_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appID_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final Builder setAppID(String str) {
                if (str != null) {
                    this.bitField0_ |= 1;
                    this.appID_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final ByteString getAppIDBytes() {
                Object obj = this.appID_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appID_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setAppIDBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 1;
                    this.appID_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder clearAppID() {
                this.bitField0_ &= -2;
                this.appID_ = MasExceptionLog.getDefaultInstance().getAppID();
                onChanged();
                return this;
            }

            public final boolean hasAppVersion() {
                return (this.bitField0_ & 2) == 2;
            }

            public final String getAppVersion() {
                Object obj = this.appVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final Builder setAppVersion(String str) {
                if (str != null) {
                    this.bitField0_ |= 2;
                    this.appVersion_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final ByteString getAppVersionBytes() {
                Object obj = this.appVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appVersion_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setAppVersionBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 2;
                    this.appVersion_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder clearAppVersion() {
                this.bitField0_ &= -3;
                this.appVersion_ = MasExceptionLog.getDefaultInstance().getAppVersion();
                onChanged();
                return this;
            }

            public final boolean hasMessages() {
                return (this.bitField0_ & 4) == 4;
            }

            public final String getMessages() {
                Object obj = this.messages_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.messages_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final Builder setMessages(String str) {
                if (str != null) {
                    this.bitField0_ |= 4;
                    this.messages_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final ByteString getMessagesBytes() {
                Object obj = this.messages_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.messages_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setMessagesBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 4;
                    this.messages_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder clearMessages() {
                this.bitField0_ &= -5;
                this.messages_ = MasExceptionLog.getDefaultInstance().getMessages();
                onChanged();
                return this;
            }
        }
    }
}
