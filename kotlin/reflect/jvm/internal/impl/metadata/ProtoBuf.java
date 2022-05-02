package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;
import net.sqlcipher.database.SQLiteDatabase;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);
        
        private static Internal.EnumLiteMap<Modality> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<Modality>() {
                public final Modality findValueByNumber(int i) {
                    return Modality.valueOf(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        private Modality(int i, int i2) {
            this.value = i2;
        }
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);
        
        private static Internal.EnumLiteMap<Visibility> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<Visibility>() {
                public final Visibility findValueByNumber(int i) {
                    return Visibility.valueOf(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        private Visibility(int i, int i2) {
            this.value = i2;
        }
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);
        
        private static Internal.EnumLiteMap<MemberKind> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<MemberKind>() {
                public final MemberKind findValueByNumber(int i) {
                    return MemberKind.valueOf(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        private MemberKind(int i, int i2) {
            this.value = i2;
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new AbstractParser<StringTable>() {
            public final StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public LazyStringList string_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private StringTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        public final StringTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            ByteString readBytes = codedInputStream.readBytes();
                            if (!z2 || !true) {
                                this.string_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.string_.add(readBytes);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.string_ = this.string_.getUnmodifiableView();
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.string_ = this.string_.getUnmodifiableView();
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            StringTable stringTable = new StringTable(true);
            defaultInstance = stringTable;
            stringTable.initFields();
        }

        public final Parser<StringTable> getParserForType() {
            return PARSER;
        }

        public final ProtocolStringList getStringList() {
            return this.string_;
        }

        public final String getString(int i) {
            return (String) this.string_.get(i);
        }

        private void initFields() {
            this.string_ = LazyStringArrayList.EMPTY;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.string_.size(); i++) {
                codedOutputStream.writeBytes(1, this.string_.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.string_.size(); i3++) {
                i2 += CodedOutputStream.computeBytesSizeNoTag(this.string_.getByteString(i3));
            }
            int size = i2 + 0 + (getStringList().size() * 1) + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
            private int bitField0_;
            private LazyStringList string_ = LazyStringArrayList.EMPTY;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            public final StringTable build() {
                StringTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final StringTable buildPartial() {
                StringTable stringTable = new StringTable((GeneratedMessageLite.Builder) this);
                if ((this.bitField0_ & 1) == 1) {
                    this.string_ = this.string_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused = stringTable.string_ = this.string_;
                return stringTable;
            }

            public final Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.string_.isEmpty()) {
                        this.string_ = stringTable.string_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureStringIsMutable();
                        this.string_.addAll(stringTable.string_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.unknownFields));
                return this;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                StringTable stringTable;
                StringTable stringTable2 = null;
                try {
                    StringTable parsePartialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTable = (StringTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    stringTable2 = stringTable;
                }
                if (stringTable2 != null) {
                    mergeFrom(stringTable2);
                }
                throw th;
            }

            private void ensureStringIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.string_ = new LazyStringArrayList(this.string_);
                    this.bitField0_ |= 1;
                }
            }
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new AbstractParser<QualifiedNameTable>() {
            public final QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<QualifiedName> qualifiedName_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private QualifiedNameTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        public final QualifiedNameTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.qualifiedName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.qualifiedName_.add(codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.initFields();
        }

        public final Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new AbstractParser<QualifiedName>() {
                public final QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            };
            private static final QualifiedName defaultInstance;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public int parentQualifiedName_;
            /* access modifiers changed from: private */
            public int shortName_;
            /* access modifiers changed from: private */
            public final ByteString unknownFields;

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private QualifiedName(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            public final QualifiedName getDefaultInstanceForType() {
                return defaultInstance;
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.parentQualifiedName_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.shortName_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                Kind valueOf = Kind.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = valueOf;
                                }
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                defaultInstance = qualifiedName;
                qualifiedName.initFields();
            }

            public final Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);
                
                private static Internal.EnumLiteMap<Kind> internalValueMap;
                private final int value;

                static {
                    internalValueMap = new Internal.EnumLiteMap<Kind>() {
                        public final Kind findValueByNumber(int i) {
                            return Kind.valueOf(i);
                        }
                    };
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                private Kind(int i, int i2) {
                    this.value = i2;
                }
            }

            public final boolean hasParentQualifiedName() {
                return (this.bitField0_ & 1) == 1;
            }

            public final int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            public final boolean hasShortName() {
                return (this.bitField0_ & 2) == 2;
            }

            public final int getShortName() {
                return this.shortName_;
            }

            public final boolean hasKind() {
                return (this.bitField0_ & 4) == 4;
            }

            public final Kind getKind() {
                return this.kind_;
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasShortName()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.kind_.getNumber());
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public final int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeInt32Size(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeInt32Size(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i2 += CodedOutputStream.computeEnumSize(3, this.kind_.getNumber());
                }
                int size = i2 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            public final Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                private int bitField0_;
                private Kind kind_ = Kind.PACKAGE;
                private int parentQualifiedName_ = -1;
                private int shortName_;

                private void maybeForceBuilderInitialization() {
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                public final Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public final QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                public final QualifiedName build() {
                    QualifiedName buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public final QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName((GeneratedMessageLite.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    int unused = qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    int unused2 = qualifiedName.shortName_ = this.shortName_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    Kind unused3 = qualifiedName.kind_ = this.kind_;
                    int unused4 = qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                public final Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    return hasShortName();
                }

                public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    QualifiedName qualifiedName;
                    QualifiedName qualifiedName2 = null;
                    try {
                        QualifiedName parsePartialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        qualifiedName = (QualifiedName) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        qualifiedName2 = qualifiedName;
                    }
                    if (qualifiedName2 != null) {
                        mergeFrom(qualifiedName2);
                    }
                    throw th;
                }

                public final Builder setParentQualifiedName(int i) {
                    this.bitField0_ |= 1;
                    this.parentQualifiedName_ = i;
                    return this;
                }

                public final boolean hasShortName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public final Builder setShortName(int i) {
                    this.bitField0_ |= 2;
                    this.shortName_ = i;
                    return this;
                }

                public final Builder setKind(Kind kind) {
                    if (kind != null) {
                        this.bitField0_ |= 4;
                        this.kind_ = kind;
                        return this;
                    }
                    throw null;
                }
            }
        }

        public final int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        public final QualifiedName getQualifiedName(int i) {
            return this.qualifiedName_.get(i);
        }

        private void initFields() {
            this.qualifiedName_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.qualifiedName_.size(); i++) {
                codedOutputStream.writeMessage(1, this.qualifiedName_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.qualifiedName_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.qualifiedName_.get(i3));
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
            private int bitField0_;
            private List<QualifiedName> qualifiedName_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            public final QualifiedNameTable build() {
                QualifiedNameTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable((GeneratedMessageLite.Builder) this);
                if ((this.bitField0_ & 1) == 1) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    this.bitField0_ &= -2;
                }
                List unused = qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                return qualifiedNameTable;
            }

            public final Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.qualifiedName_.isEmpty()) {
                        this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureQualifiedNameIsMutable();
                        this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                QualifiedNameTable qualifiedNameTable;
                QualifiedNameTable qualifiedNameTable2 = null;
                try {
                    QualifiedNameTable parsePartialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    qualifiedNameTable = (QualifiedNameTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    qualifiedNameTable2 = qualifiedNameTable;
                }
                if (qualifiedNameTable2 != null) {
                    mergeFrom(qualifiedNameTable2);
                }
                throw th;
            }

            private void ensureQualifiedNameIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.qualifiedName_ = new ArrayList(this.qualifiedName_);
                    this.bitField0_ |= 1;
                }
            }

            public final int getQualifiedNameCount() {
                return this.qualifiedName_.size();
            }

            public final QualifiedName getQualifiedName(int i) {
                return this.qualifiedName_.get(i);
            }
        }
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new AbstractParser<Annotation>() {
            public final Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Annotation defaultInstance;
        /* access modifiers changed from: private */
        public List<Argument> argument_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Annotation(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Annotation getDefaultInstance() {
            return defaultInstance;
        }

        public final Annotation getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = codedInputStream.readInt32();
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.argument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.argument_.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            Annotation annotation = new Annotation(true);
            defaultInstance = annotation;
            annotation.initFields();
        }

        public final Parser<Annotation> getParserForType() {
            return PARSER;
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AbstractParser<Argument>() {
                public final Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Argument defaultInstance;
            /* access modifiers changed from: private */
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public int nameId_;
            /* access modifiers changed from: private */
            public final ByteString unknownFields;
            /* access modifiers changed from: private */
            public Value value_;

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            public final Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.nameId_ = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                this.value_ = value;
                                if (builder != null) {
                                    builder.mergeFrom(value);
                                    this.value_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            public final Parser<Argument> getParserForType() {
                return PARSER;
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new AbstractParser<Value>() {
                    public final Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                };
                private static final Value defaultInstance;
                /* access modifiers changed from: private */
                public Annotation annotation_;
                /* access modifiers changed from: private */
                public int arrayDimensionCount_;
                /* access modifiers changed from: private */
                public List<Value> arrayElement_;
                /* access modifiers changed from: private */
                public int bitField0_;
                /* access modifiers changed from: private */
                public int classId_;
                /* access modifiers changed from: private */
                public double doubleValue_;
                /* access modifiers changed from: private */
                public int enumValueId_;
                /* access modifiers changed from: private */
                public int flags_;
                /* access modifiers changed from: private */
                public float floatValue_;
                /* access modifiers changed from: private */
                public long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                /* access modifiers changed from: private */
                public int stringValue_;
                /* access modifiers changed from: private */
                public Type type_;
                /* access modifiers changed from: private */
                public final ByteString unknownFields;

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private Value(boolean z) {
                    this.memoizedIsInitialized = -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Value getDefaultInstance() {
                    return defaultInstance;
                }

                public final Value getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.memoizedIsInitialized = -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    ByteString.Output newOutput = ByteString.newOutput();
                    CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    int readEnum = codedInputStream.readEnum();
                                    Type valueOf = Type.valueOf(readEnum);
                                    if (valueOf != null) {
                                        this.bitField0_ |= 1;
                                        this.type_ = valueOf;
                                        break;
                                    } else {
                                        newInstance.writeRawVarint32(readTag);
                                        newInstance.writeRawVarint32(readEnum);
                                        break;
                                    }
                                case 16:
                                    this.bitField0_ |= 2;
                                    this.intValue_ = codedInputStream.readSInt64();
                                    break;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = codedInputStream.readFloat();
                                    break;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = codedInputStream.readDouble();
                                    break;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = codedInputStream.readInt32();
                                    break;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = codedInputStream.readInt32();
                                    break;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = codedInputStream.readInt32();
                                    break;
                                case 66:
                                    Builder builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                    Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                    this.annotation_ = annotation;
                                    if (builder != null) {
                                        builder.mergeFrom(annotation);
                                        this.annotation_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    if (!(z2 & true)) {
                                        this.arrayElement_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.arrayElement_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                    break;
                                case 80:
                                    this.bitField0_ |= 512;
                                    this.flags_ = codedInputStream.readInt32();
                                    break;
                                case 88:
                                    this.bitField0_ |= 256;
                                    this.arrayDimensionCount_ = codedInputStream.readInt32();
                                    break;
                                default:
                                    if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        } catch (Throwable th) {
                            if (z2 & true) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            }
                            try {
                                newInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.unknownFields = newOutput.toByteString();
                                throw th2;
                            }
                            this.unknownFields = newOutput.toByteString();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 & true) {
                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.unknownFields = newOutput.toByteString();
                        throw th3;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                }

                static {
                    Value value = new Value(true);
                    defaultInstance = value;
                    value.initFields();
                }

                public final Parser<Value> getParserForType() {
                    return PARSER;
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);
                    
                    private static Internal.EnumLiteMap<Type> internalValueMap;
                    private final int value;

                    static {
                        internalValueMap = new Internal.EnumLiteMap<Type>() {
                            public final Type findValueByNumber(int i) {
                                return Type.valueOf(i);
                            }
                        };
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    private Type(int i, int i2) {
                        this.value = i2;
                    }
                }

                public final boolean hasType() {
                    return (this.bitField0_ & 1) == 1;
                }

                public final Type getType() {
                    return this.type_;
                }

                public final boolean hasIntValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public final long getIntValue() {
                    return this.intValue_;
                }

                public final boolean hasFloatValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public final float getFloatValue() {
                    return this.floatValue_;
                }

                public final boolean hasDoubleValue() {
                    return (this.bitField0_ & 8) == 8;
                }

                public final double getDoubleValue() {
                    return this.doubleValue_;
                }

                public final boolean hasStringValue() {
                    return (this.bitField0_ & 16) == 16;
                }

                public final int getStringValue() {
                    return this.stringValue_;
                }

                public final boolean hasClassId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public final int getClassId() {
                    return this.classId_;
                }

                public final boolean hasEnumValueId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public final int getEnumValueId() {
                    return this.enumValueId_;
                }

                public final boolean hasAnnotation() {
                    return (this.bitField0_ & 128) == 128;
                }

                public final Annotation getAnnotation() {
                    return this.annotation_;
                }

                public final List<Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public final int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                public final Value getArrayElement(int i) {
                    return this.arrayElement_.get(i);
                }

                public final boolean hasArrayDimensionCount() {
                    return (this.bitField0_ & 256) == 256;
                }

                public final int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public final boolean hasFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public final int getFlags() {
                    return this.flags_;
                }

                private void initFields() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0;
                    this.floatValue_ = 0.0f;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.getDefaultInstance();
                    this.arrayElement_ = Collections.emptyList();
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (!hasAnnotation() || getAnnotation().isInitialized()) {
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                this.memoizedIsInitialized = 0;
                                return false;
                            }
                        }
                        this.memoizedIsInitialized = 1;
                        return true;
                    }
                    this.memoizedIsInitialized = 0;
                    return false;
                }

                public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.writeMessage(9, this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public final int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int computeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_.getNumber()) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        computeEnumSize += CodedOutputStream.computeSInt64Size(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        computeEnumSize += CodedOutputStream.computeFloatSize(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        computeEnumSize += CodedOutputStream.computeDoubleSize(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        computeEnumSize += CodedOutputStream.computeMessageSize(8, this.annotation_);
                    }
                    for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                        computeEnumSize += CodedOutputStream.computeMessageSize(9, this.arrayElement_.get(i2));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(11, this.arrayDimensionCount_);
                    }
                    int size = computeEnumSize + this.unknownFields.size();
                    this.memoizedSerializedSize = size;
                    return size;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public final Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                public final Builder toBuilder() {
                    return newBuilder(this);
                }

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    private Annotation annotation_ = Annotation.getDefaultInstance();
                    private int arrayDimensionCount_;
                    private List<Value> arrayElement_ = Collections.emptyList();
                    private int bitField0_;
                    private int classId_;
                    private double doubleValue_;
                    private int enumValueId_;
                    private int flags_;
                    private float floatValue_;
                    private long intValue_;
                    private int stringValue_;
                    private Type type_ = Type.BYTE;

                    private void maybeForceBuilderInitialization() {
                    }

                    private Builder() {
                        maybeForceBuilderInitialization();
                    }

                    /* access modifiers changed from: private */
                    public static Builder create() {
                        return new Builder();
                    }

                    public final Builder clone() {
                        return create().mergeFrom(buildPartial());
                    }

                    public final Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    public final Value build() {
                        Value buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public final Value buildPartial() {
                        Value value = new Value((GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        Type unused = value.type_ = this.type_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        long unused2 = value.intValue_ = this.intValue_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        float unused3 = value.floatValue_ = this.floatValue_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        double unused4 = value.doubleValue_ = this.doubleValue_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        int unused5 = value.stringValue_ = this.stringValue_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        int unused6 = value.classId_ = this.classId_;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        int unused7 = value.enumValueId_ = this.enumValueId_;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        Annotation unused8 = value.annotation_ = this.annotation_;
                        if ((this.bitField0_ & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            this.bitField0_ &= -257;
                        }
                        List unused9 = value.arrayElement_ = this.arrayElement_;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        int unused10 = value.arrayDimensionCount_ = this.arrayDimensionCount_;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        int unused11 = value.flags_ = this.flags_;
                        int unused12 = value.bitField0_ = i2;
                        return value;
                    }

                    public final Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.arrayElement_.isEmpty()) {
                                this.arrayElement_ = value.arrayElement_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureArrayElementIsMutable();
                                this.arrayElement_.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Value value;
                        Value value2 = null;
                        try {
                            Value parsePartialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            value = (Value) e.getUnfinishedMessage();
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            value2 = value;
                        }
                        if (value2 != null) {
                            mergeFrom(value2);
                        }
                        throw th;
                    }

                    public final Builder setType(Type type) {
                        if (type != null) {
                            this.bitField0_ |= 1;
                            this.type_ = type;
                            return this;
                        }
                        throw null;
                    }

                    public final Builder setIntValue(long j) {
                        this.bitField0_ |= 2;
                        this.intValue_ = j;
                        return this;
                    }

                    public final Builder setFloatValue(float f) {
                        this.bitField0_ |= 4;
                        this.floatValue_ = f;
                        return this;
                    }

                    public final Builder setDoubleValue(double d) {
                        this.bitField0_ |= 8;
                        this.doubleValue_ = d;
                        return this;
                    }

                    public final Builder setStringValue(int i) {
                        this.bitField0_ |= 16;
                        this.stringValue_ = i;
                        return this;
                    }

                    public final Builder setClassId(int i) {
                        this.bitField0_ |= 32;
                        this.classId_ = i;
                        return this;
                    }

                    public final Builder setEnumValueId(int i) {
                        this.bitField0_ |= 64;
                        this.enumValueId_ = i;
                        return this;
                    }

                    public final boolean hasAnnotation() {
                        return (this.bitField0_ & 128) == 128;
                    }

                    public final Annotation getAnnotation() {
                        return this.annotation_;
                    }

                    public final Builder mergeAnnotation(Annotation annotation) {
                        if ((this.bitField0_ & 128) != 128 || this.annotation_ == Annotation.getDefaultInstance()) {
                            this.annotation_ = annotation;
                        } else {
                            this.annotation_ = Annotation.newBuilder(this.annotation_).mergeFrom(annotation).buildPartial();
                        }
                        this.bitField0_ |= 128;
                        return this;
                    }

                    private void ensureArrayElementIsMutable() {
                        if ((this.bitField0_ & 256) != 256) {
                            this.arrayElement_ = new ArrayList(this.arrayElement_);
                            this.bitField0_ |= 256;
                        }
                    }

                    public final int getArrayElementCount() {
                        return this.arrayElement_.size();
                    }

                    public final Value getArrayElement(int i) {
                        return this.arrayElement_.get(i);
                    }

                    public final Builder setArrayDimensionCount(int i) {
                        this.bitField0_ |= 512;
                        this.arrayDimensionCount_ = i;
                        return this;
                    }

                    public final Builder setFlags(int i) {
                        this.bitField0_ |= 1024;
                        this.flags_ = i;
                        return this;
                    }
                }
            }

            public final boolean hasNameId() {
                return (this.bitField0_ & 1) == 1;
            }

            public final int getNameId() {
                return this.nameId_;
            }

            public final boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            public final Value getValue() {
                return this.value_;
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!hasValue()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!getValue().isInitialized()) {
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
                    codedOutputStream.writeInt32(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.value_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public final int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeInt32Size(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeMessageSize(2, this.value_);
                }
                int size = i2 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            public final Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private int nameId_;
                private Value value_ = Value.getDefaultInstance();

                private void maybeForceBuilderInitialization() {
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                public final Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public final Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                public final Argument build() {
                    Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public final Argument buildPartial() {
                    Argument argument = new Argument((GeneratedMessageLite.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    int unused = argument.nameId_ = this.nameId_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    Value unused2 = argument.value_ = this.value_;
                    int unused3 = argument.bitField0_ = i2;
                    return argument;
                }

                public final Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    if (hasNameId() && hasValue() && getValue().isInitialized()) {
                        return true;
                    }
                    return false;
                }

                public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Argument argument;
                    Argument argument2 = null;
                    try {
                        Argument parsePartialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        argument = (Argument) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        argument2 = argument;
                    }
                    if (argument2 != null) {
                        mergeFrom(argument2);
                    }
                    throw th;
                }

                public final boolean hasNameId() {
                    return (this.bitField0_ & 1) == 1;
                }

                public final Builder setNameId(int i) {
                    this.bitField0_ |= 1;
                    this.nameId_ = i;
                    return this;
                }

                public final boolean hasValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public final Value getValue() {
                    return this.value_;
                }

                public final Builder mergeValue(Value value) {
                    if ((this.bitField0_ & 2) != 2 || this.value_ == Value.getDefaultInstance()) {
                        this.value_ = value;
                    } else {
                        this.value_ = Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }
            }
        }

        public final boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getId() {
            return this.id_;
        }

        public final List<Argument> getArgumentList() {
            return this.argument_;
        }

        public final int getArgumentCount() {
            return this.argument_.size();
        }

        public final Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        private void initFields() {
            this.id_ = 0;
            this.argument_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) + 0 : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, this.argument_.get(i2));
            }
            int size = computeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            private List<Argument> argument_ = Collections.emptyList();
            private int bitField0_;
            private int id_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            public final Annotation build() {
                Annotation buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Annotation buildPartial() {
                Annotation annotation = new Annotation((GeneratedMessageLite.Builder) this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                int unused = annotation.id_ = this.id_;
                if ((this.bitField0_ & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -3;
                }
                List unused2 = annotation.argument_ = this.argument_;
                int unused3 = annotation.bitField0_ = i;
                return annotation;
            }

            public final Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = annotation.argument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(annotation.argument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Annotation annotation;
                Annotation annotation2 = null;
                try {
                    Annotation parsePartialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    annotation = (Annotation) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    annotation2 = annotation;
                }
                if (annotation2 != null) {
                    mergeFrom(annotation2);
                }
                throw th;
            }

            public final boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public final Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 2;
                }
            }

            public final int getArgumentCount() {
                return this.argument_.size();
            }

            public final Argument getArgument(int i) {
                return this.argument_.get(i);
            }
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new AbstractParser<Type>() {
            public final Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Type defaultInstance;
        /* access modifiers changed from: private */
        public int abbreviatedTypeId_;
        /* access modifiers changed from: private */
        public Type abbreviatedType_;
        /* access modifiers changed from: private */
        public List<Argument> argument_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int className_;
        /* access modifiers changed from: private */
        public int flags_;
        /* access modifiers changed from: private */
        public int flexibleTypeCapabilitiesId_;
        /* access modifiers changed from: private */
        public int flexibleUpperBoundId_;
        /* access modifiers changed from: private */
        public Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public boolean nullable_;
        /* access modifiers changed from: private */
        public int outerTypeId_;
        /* access modifiers changed from: private */
        public Type outerType_;
        /* access modifiers changed from: private */
        public int typeAliasName_;
        /* access modifiers changed from: private */
        public int typeParameterName_;
        /* access modifiers changed from: private */
        public int typeParameter_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Type(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Type getDefaultInstance() {
            return defaultInstance;
        }

        public final Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    Builder builder = null;
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = codedInputStream.readInt32();
                            break;
                        case 18:
                            if (!z2 || !true) {
                                this.argument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.argument_.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            break;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = codedInputStream.readBool();
                            break;
                        case 32:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = codedInputStream.readInt32();
                            break;
                        case 42:
                            builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : builder;
                            Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                            this.flexibleUpperBound_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.flexibleUpperBound_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 48:
                            this.bitField0_ |= 16;
                            this.className_ = codedInputStream.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = codedInputStream.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = codedInputStream.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = codedInputStream.readInt32();
                            break;
                        case 82:
                            builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : builder;
                            Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                            this.outerType_ = type2;
                            if (builder != null) {
                                builder.mergeFrom(type2);
                                this.outerType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 256;
                            break;
                        case 88:
                            this.bitField0_ |= 512;
                            this.outerTypeId_ = codedInputStream.readInt32();
                            break;
                        case 96:
                            this.bitField0_ |= 128;
                            this.typeAliasName_ = codedInputStream.readInt32();
                            break;
                        case 106:
                            builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : builder;
                            Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                            this.abbreviatedType_ = type3;
                            if (builder != null) {
                                builder.mergeFrom(type3);
                                this.abbreviatedType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 1024;
                            break;
                        case 112:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = codedInputStream.readInt32();
                            break;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            Type type = new Type(true);
            defaultInstance = type;
            type.initFields();
        }

        public final Parser<Type> getParserForType() {
            return PARSER;
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AbstractParser<Argument>() {
                public final Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Argument defaultInstance;
            /* access modifiers changed from: private */
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public Projection projection_;
            /* access modifiers changed from: private */
            public int typeId_;
            /* access modifiers changed from: private */
            public Type type_;
            /* access modifiers changed from: private */
            public final ByteString unknownFields;

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            public final Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                int readEnum = codedInputStream.readEnum();
                                Projection valueOf = Projection.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.projection_ = valueOf;
                                }
                            } else if (readTag == 18) {
                                Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.type_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.type_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (readTag == 24) {
                                this.bitField0_ |= 4;
                                this.typeId_ = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            public final Parser<Argument> getParserForType() {
                return PARSER;
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);
                
                private static Internal.EnumLiteMap<Projection> internalValueMap;
                private final int value;

                static {
                    internalValueMap = new Internal.EnumLiteMap<Projection>() {
                        public final Projection findValueByNumber(int i) {
                            return Projection.valueOf(i);
                        }
                    };
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                private Projection(int i, int i2) {
                    this.value = i2;
                }
            }

            public final boolean hasProjection() {
                return (this.bitField0_ & 1) == 1;
            }

            public final Projection getProjection() {
                return this.projection_;
            }

            public final boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public final Type getType() {
                return this.type_;
            }

            public final boolean hasTypeId() {
                return (this.bitField0_ & 4) == 4;
            }

            public final int getTypeId() {
                return this.typeId_;
            }

            private void initFields() {
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
                this.memoizedIsInitialized = 0;
                return false;
            }

            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.typeId_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public final int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeEnumSize(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeMessageSize(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i2 += CodedOutputStream.computeInt32Size(3, this.typeId_);
                }
                int size = i2 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            public final Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private Projection projection_ = Projection.INV;
                private int typeId_;
                private Type type_ = Type.getDefaultInstance();

                private void maybeForceBuilderInitialization() {
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                public final Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public final Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                public final Argument build() {
                    Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public final Argument buildPartial() {
                    Argument argument = new Argument((GeneratedMessageLite.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    Projection unused = argument.projection_ = this.projection_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    Type unused2 = argument.type_ = this.type_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    int unused3 = argument.typeId_ = this.typeId_;
                    int unused4 = argument.bitField0_ = i2;
                    return argument;
                }

                public final Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Argument argument;
                    Argument argument2 = null;
                    try {
                        Argument parsePartialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        argument = (Argument) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        argument2 = argument;
                    }
                    if (argument2 != null) {
                        mergeFrom(argument2);
                    }
                    throw th;
                }

                public final Builder setProjection(Projection projection) {
                    if (projection != null) {
                        this.bitField0_ |= 1;
                        this.projection_ = projection;
                        return this;
                    }
                    throw null;
                }

                public final boolean hasType() {
                    return (this.bitField0_ & 2) == 2;
                }

                public final Type getType() {
                    return this.type_;
                }

                public final Builder mergeType(Type type) {
                    if ((this.bitField0_ & 2) != 2 || this.type_ == Type.getDefaultInstance()) {
                        this.type_ = type;
                    } else {
                        this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public final Builder setTypeId(int i) {
                    this.bitField0_ |= 4;
                    this.typeId_ = i;
                    return this;
                }
            }
        }

        public final List<Argument> getArgumentList() {
            return this.argument_;
        }

        public final int getArgumentCount() {
            return this.argument_.size();
        }

        public final Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        public final boolean hasNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean getNullable() {
            return this.nullable_;
        }

        public final boolean hasFlexibleTypeCapabilitiesId() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public final boolean hasFlexibleUpperBound() {
            return (this.bitField0_ & 4) == 4;
        }

        public final Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public final boolean hasFlexibleUpperBoundId() {
            return (this.bitField0_ & 8) == 8;
        }

        public final int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public final boolean hasClassName() {
            return (this.bitField0_ & 16) == 16;
        }

        public final int getClassName() {
            return this.className_;
        }

        public final boolean hasTypeParameter() {
            return (this.bitField0_ & 32) == 32;
        }

        public final int getTypeParameter() {
            return this.typeParameter_;
        }

        public final boolean hasTypeParameterName() {
            return (this.bitField0_ & 64) == 64;
        }

        public final int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public final boolean hasTypeAliasName() {
            return (this.bitField0_ & 128) == 128;
        }

        public final int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public final boolean hasOuterType() {
            return (this.bitField0_ & 256) == 256;
        }

        public final Type getOuterType() {
            return this.outerType_;
        }

        public final boolean hasOuterTypeId() {
            return (this.bitField0_ & 512) == 512;
        }

        public final int getOuterTypeId() {
            return this.outerTypeId_;
        }

        public final boolean hasAbbreviatedType() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public final Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public final boolean hasAbbreviatedTypeId() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public final int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public final int getFlags() {
            return this.flags_;
        }

        private void initFields() {
            this.argument_ = Collections.emptyList();
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeInt32(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.abbreviatedTypeId_);
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, this.argument_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                computeInt32Size += CodedOutputStream.computeBoolSize(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeInt32Size(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeInt32Size(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                computeInt32Size += CodedOutputStream.computeMessageSize(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                computeInt32Size += CodedOutputStream.computeInt32Size(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                computeInt32Size += CodedOutputStream.computeInt32Size(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                computeInt32Size += CodedOutputStream.computeMessageSize(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                computeInt32Size += CodedOutputStream.computeInt32Size(14, this.abbreviatedTypeId_);
            }
            int extensionsSerializedSize = computeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            private int abbreviatedTypeId_;
            private Type abbreviatedType_ = Type.getDefaultInstance();
            private List<Argument> argument_ = Collections.emptyList();
            private int bitField0_;
            private int className_;
            private int flags_;
            private int flexibleTypeCapabilitiesId_;
            private int flexibleUpperBoundId_;
            private Type flexibleUpperBound_ = Type.getDefaultInstance();
            private boolean nullable_;
            private int outerTypeId_;
            private Type outerType_ = Type.getDefaultInstance();
            private int typeAliasName_;
            private int typeParameterName_;
            private int typeParameter_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            public final Type build() {
                Type buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Type buildPartial() {
                Type type = new Type((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -2;
                }
                List unused = type.argument_ = this.argument_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                boolean unused2 = type.nullable_ = this.nullable_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                int unused3 = type.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                Type unused4 = type.flexibleUpperBound_ = this.flexibleUpperBound_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                int unused5 = type.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                int unused6 = type.className_ = this.className_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                int unused7 = type.typeParameter_ = this.typeParameter_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                int unused8 = type.typeParameterName_ = this.typeParameterName_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                int unused9 = type.typeAliasName_ = this.typeAliasName_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                Type unused10 = type.outerType_ = this.outerType_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                int unused11 = type.outerTypeId_ = this.outerTypeId_;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                Type unused12 = type.abbreviatedType_ = this.abbreviatedType_;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                int unused13 = type.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                int unused14 = type.flags_ = this.flags_;
                int unused15 = type.bitField0_ = i2;
                return type;
            }

            public final Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = type.argument_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (hasOuterType() && !getOuterType().isInitialized()) {
                    return false;
                }
                if ((!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Type type;
                Type type2 = null;
                try {
                    Type parsePartialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    type = (Type) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    type2 = type;
                }
                if (type2 != null) {
                    mergeFrom(type2);
                }
                throw th;
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 1;
                }
            }

            public final int getArgumentCount() {
                return this.argument_.size();
            }

            public final Argument getArgument(int i) {
                return this.argument_.get(i);
            }

            public final Builder setNullable(boolean z) {
                this.bitField0_ |= 2;
                this.nullable_ = z;
                return this;
            }

            public final Builder setFlexibleTypeCapabilitiesId(int i) {
                this.bitField0_ |= 4;
                this.flexibleTypeCapabilitiesId_ = i;
                return this;
            }

            public final boolean hasFlexibleUpperBound() {
                return (this.bitField0_ & 8) == 8;
            }

            public final Type getFlexibleUpperBound() {
                return this.flexibleUpperBound_;
            }

            public final Builder mergeFlexibleUpperBound(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.flexibleUpperBound_ == Type.getDefaultInstance()) {
                    this.flexibleUpperBound_ = type;
                } else {
                    this.flexibleUpperBound_ = Type.newBuilder(this.flexibleUpperBound_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setFlexibleUpperBoundId(int i) {
                this.bitField0_ |= 16;
                this.flexibleUpperBoundId_ = i;
                return this;
            }

            public final Builder setClassName(int i) {
                this.bitField0_ |= 32;
                this.className_ = i;
                return this;
            }

            public final Builder setTypeParameter(int i) {
                this.bitField0_ |= 64;
                this.typeParameter_ = i;
                return this;
            }

            public final Builder setTypeParameterName(int i) {
                this.bitField0_ |= 128;
                this.typeParameterName_ = i;
                return this;
            }

            public final Builder setTypeAliasName(int i) {
                this.bitField0_ |= 256;
                this.typeAliasName_ = i;
                return this;
            }

            public final boolean hasOuterType() {
                return (this.bitField0_ & 512) == 512;
            }

            public final Type getOuterType() {
                return this.outerType_;
            }

            public final Builder mergeOuterType(Type type) {
                if ((this.bitField0_ & 512) != 512 || this.outerType_ == Type.getDefaultInstance()) {
                    this.outerType_ = type;
                } else {
                    this.outerType_ = Type.newBuilder(this.outerType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 512;
                return this;
            }

            public final Builder setOuterTypeId(int i) {
                this.bitField0_ |= 1024;
                this.outerTypeId_ = i;
                return this;
            }

            public final boolean hasAbbreviatedType() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public final Type getAbbreviatedType() {
                return this.abbreviatedType_;
            }

            public final Builder mergeAbbreviatedType(Type type) {
                if ((this.bitField0_ & 2048) != 2048 || this.abbreviatedType_ == Type.getDefaultInstance()) {
                    this.abbreviatedType_ = type;
                } else {
                    this.abbreviatedType_ = Type.newBuilder(this.abbreviatedType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public final Builder setAbbreviatedTypeId(int i) {
                this.bitField0_ |= 4096;
                this.abbreviatedTypeId_ = i;
                return this;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 8192;
                this.flags_ = i;
                return this;
            }
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new AbstractParser<TypeParameter>() {
            public final TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeParameter defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public boolean reified_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> upperBoundId_;
        /* access modifiers changed from: private */
        public List<Type> upperBound_;
        /* access modifiers changed from: private */
        public Variance variance_;

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private TypeParameter(boolean z) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        public final TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = codedInputStream.readBool();
                        } else if (readTag == 32) {
                            int readEnum = codedInputStream.readEnum();
                            Variance valueOf = Variance.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = valueOf;
                            }
                        } else if (readTag == 42) {
                            if (!(z2 & true)) {
                                this.upperBound_ = new ArrayList();
                                z2 |= true;
                            }
                            this.upperBound_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                        } else if (readTag == 48) {
                            if (!(z2 & true)) {
                                this.upperBoundId_ = new ArrayList();
                                z2 |= true;
                            }
                            this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                        } else if (readTag == 50) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if (z2 & true) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if (z2 & true) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            defaultInstance = typeParameter;
            typeParameter.initFields();
        }

        public final Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);
            
            private static Internal.EnumLiteMap<Variance> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<Variance>() {
                    public final Variance findValueByNumber(int i) {
                        return Variance.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            private Variance(int i, int i2) {
                this.value = i2;
            }
        }

        public final boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getId() {
            return this.id_;
        }

        public final boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getName() {
            return this.name_;
        }

        public final boolean hasReified() {
            return (this.bitField0_ & 4) == 4;
        }

        public final boolean getReified() {
            return this.reified_;
        }

        public final boolean hasVariance() {
            return (this.bitField0_ & 8) == 8;
        }

        public final Variance getVariance() {
            return this.variance_;
        }

        public final List<Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public final int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        public final Type getUpperBound(int i) {
            return this.upperBound_.get(i);
        }

        public final List<Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        private void initFields() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            this.upperBound_ = Collections.emptyList();
            this.upperBoundId_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(4, this.variance_.getNumber());
            }
            for (int i = 0; i < this.upperBound_.size(); i++) {
                codedOutputStream.writeMessage(5, this.upperBound_.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
                codedOutputStream.writeInt32NoTag(this.upperBoundId_.get(i2).intValue());
            }
            newExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeBoolSize(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeEnumSize(4, this.variance_.getNumber());
            }
            for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.upperBound_.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.upperBoundId_.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(this.upperBoundId_.get(i4).intValue());
            }
            int i5 = computeInt32Size + i3;
            if (!getUpperBoundIdList().isEmpty()) {
                i5 = i5 + 1 + CodedOutputStream.computeInt32SizeNoTag(i3);
            }
            this.upperBoundIdMemoizedSerializedSize = i3;
            int extensionsSerializedSize = i5 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            private int bitField0_;
            private int id_;
            private int name_;
            private boolean reified_;
            private List<Integer> upperBoundId_ = Collections.emptyList();
            private List<Type> upperBound_ = Collections.emptyList();
            private Variance variance_ = Variance.INV;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            public final TypeParameter build() {
                TypeParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = typeParameter.id_ = this.id_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = typeParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                boolean unused3 = typeParameter.reified_ = this.reified_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                Variance unused4 = typeParameter.variance_ = this.variance_;
                if ((this.bitField0_ & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    this.bitField0_ &= -17;
                }
                List unused5 = typeParameter.upperBound_ = this.upperBound_;
                if ((this.bitField0_ & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    this.bitField0_ &= -33;
                }
                List unused6 = typeParameter.upperBoundId_ = this.upperBoundId_;
                int unused7 = typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            public final Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.upperBound_.isEmpty()) {
                        this.upperBound_ = typeParameter.upperBound_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureUpperBoundIsMutable();
                        this.upperBound_.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.upperBoundId_.isEmpty()) {
                        this.upperBoundId_ = typeParameter.upperBoundId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureUpperBoundIdIsMutable();
                        this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                TypeParameter typeParameter;
                TypeParameter typeParameter2 = null;
                try {
                    TypeParameter parsePartialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeParameter = (TypeParameter) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    typeParameter2 = typeParameter;
                }
                if (typeParameter2 != null) {
                    mergeFrom(typeParameter2);
                }
                throw th;
            }

            public final boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public final Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            public final boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public final Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public final Builder setReified(boolean z) {
                this.bitField0_ |= 4;
                this.reified_ = z;
                return this;
            }

            public final Builder setVariance(Variance variance) {
                if (variance != null) {
                    this.bitField0_ |= 8;
                    this.variance_ = variance;
                    return this;
                }
                throw null;
            }

            private void ensureUpperBoundIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.upperBound_ = new ArrayList(this.upperBound_);
                    this.bitField0_ |= 16;
                }
            }

            public final int getUpperBoundCount() {
                return this.upperBound_.size();
            }

            public final Type getUpperBound(int i) {
                return this.upperBound_.get(i);
            }

            private void ensureUpperBoundIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.upperBoundId_ = new ArrayList(this.upperBoundId_);
                    this.bitField0_ |= 32;
                }
            }
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new AbstractParser<Class>() {
            public final Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Class defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int companionObjectName_;
        /* access modifiers changed from: private */
        public List<Constructor> constructor_;
        /* access modifiers changed from: private */
        public List<EnumEntry> enumEntry_;
        /* access modifiers changed from: private */
        public int flags_;
        /* access modifiers changed from: private */
        public int fqName_;
        /* access modifiers changed from: private */
        public List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nestedClassNameMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> nestedClassName_;
        /* access modifiers changed from: private */
        public List<Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> supertypeId_;
        /* access modifiers changed from: private */
        public List<Type> supertype_;
        /* access modifiers changed from: private */
        public List<TypeAlias> typeAlias_;
        /* access modifiers changed from: private */
        public List<TypeParameter> typeParameter_;
        /* access modifiers changed from: private */
        public TypeTable typeTable_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public VersionRequirementTable versionRequirementTable_;
        /* access modifiers changed from: private */
        public List<Integer> versionRequirement_;

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Class(boolean z) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Class getDefaultInstance() {
            return defaultInstance;
        }

        public final Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX WARNING: type inference failed for: r16v5, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder] */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02cc, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d0, code lost:
            if (parseUnknownField(r0, r5, r2, r12) == false) goto L_0x02cc;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r18, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r19) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r17.<init>()
                r3 = -1
                r1.supertypeIdMemoizedSerializedSize = r3
                r1.nestedClassNameMemoizedSerializedSize = r3
                r1.sealedSubclassFqNameMemoizedSerializedSize = r3
                r1.memoizedIsInitialized = r3
                r1.memoizedSerializedSize = r3
                r17.initFields()
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString$Output r3 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput()
                r4 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r5 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r3, r4)
                r6 = 0
                r7 = 0
            L_0x0022:
                r8 = 2048(0x800, float:2.87E-42)
                r9 = 1024(0x400, float:1.435E-42)
                r10 = 512(0x200, float:7.175E-43)
                r13 = 16384(0x4000, float:2.2959E-41)
                r14 = 4096(0x1000, float:5.74E-42)
                r4 = 16
                r15 = 8
                if (r6 != 0) goto L_0x0392
                int r12 = r18.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r16 = 0
                switch(r12) {
                    case 0: goto L_0x02cb;
                    case 8: goto L_0x02be;
                    case 16: goto L_0x02a0;
                    case 18: goto L_0x026b;
                    case 24: goto L_0x025d;
                    case 32: goto L_0x0250;
                    case 42: goto L_0x0235;
                    case 50: goto L_0x0218;
                    case 56: goto L_0x01f9;
                    case 58: goto L_0x01c3;
                    case 66: goto L_0x01a6;
                    case 74: goto L_0x0189;
                    case 82: goto L_0x016e;
                    case 90: goto L_0x0153;
                    case 106: goto L_0x0138;
                    case 128: goto L_0x011b;
                    case 130: goto L_0x00e7;
                    case 242: goto L_0x00be;
                    case 248: goto L_0x00a1;
                    case 250: goto L_0x006b;
                    case 258: goto L_0x0042;
                    default: goto L_0x003b;
                }     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
            L_0x003b:
                r11 = 1
                boolean r4 = r1.parseUnknownField(r0, r5, r2, r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d0
            L_0x0042:
                int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r12 = r12 & r4
                if (r12 != r4) goto L_0x004d
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = r1.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder r16 = r12.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
            L_0x004d:
                r12 = r16
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.versionRequirementTable_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r12 == 0) goto L_0x0064
                r12.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r11 = r12.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.versionRequirementTable_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
            L_0x0064:
                int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11 = r11 | r4
                r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x0269
            L_0x006b:
                int r11 = r18.readRawVarint32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r11 = r0.pushLimit(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r12 = r7 & 16384(0x4000, float:2.2959E-41)
                if (r12 == r13) goto L_0x0086
                int r12 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r12 <= 0) goto L_0x0086
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.versionRequirement_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r7 = r7 | 16384(0x4000, float:2.2959E-41)
            L_0x0086:
                int r12 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r12 <= 0) goto L_0x009c
                java.util.List<java.lang.Integer> r12 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r16 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r12.add(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = 16
                goto L_0x0086
            L_0x009c:
                r0.popLimit(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x00a1:
                r4 = r7 & 16384(0x4000, float:2.2959E-41)
                if (r4 == r13) goto L_0x00af
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.versionRequirement_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 16384(0x4000, float:2.2959E-41)
                r7 = r4
            L_0x00af:
                java.util.List<java.lang.Integer> r4 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r11 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x00be:
                int r4 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r4 & r15
                if (r4 != r15) goto L_0x00c9
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = r1.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder r16 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
            L_0x00c9:
                r4 = r16
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.typeTable_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r4 == 0) goto L_0x00e0
                r4.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = r4.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.typeTable_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
            L_0x00e0:
                int r4 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r4 | r15
                r1.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x0269
            L_0x00e7:
                int r4 = r18.readRawVarint32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r4 = r0.pushLimit(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11 = r7 & 4096(0x1000, float:5.74E-42)
                if (r11 == r14) goto L_0x0102
                int r11 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r11 <= 0) goto L_0x0102
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.sealedSubclassFqName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r7 = r7 | 4096(0x1000, float:5.74E-42)
            L_0x0102:
                int r11 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r11 <= 0) goto L_0x0116
                java.util.List<java.lang.Integer> r11 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r12 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x0102
            L_0x0116:
                r0.popLimit(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x011b:
                r4 = r7 & 4096(0x1000, float:5.74E-42)
                if (r4 == r14) goto L_0x0129
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.sealedSubclassFqName_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 4096(0x1000, float:5.74E-42)
                r7 = r4
            L_0x0129:
                java.util.List<java.lang.Integer> r4 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r11 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x0138:
                r4 = r7 & 2048(0x800, float:2.87E-42)
                if (r4 == r8) goto L_0x0146
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.enumEntry_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 2048(0x800, float:2.87E-42)
                r7 = r4
            L_0x0146:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r4 = r1.enumEntry_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x0153:
                r4 = r7 & 1024(0x400, float:1.435E-42)
                if (r4 == r9) goto L_0x0161
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.typeAlias_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 1024(0x400, float:1.435E-42)
                r7 = r4
            L_0x0161:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r4 = r1.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x016e:
                r4 = r7 & 512(0x200, float:7.175E-43)
                if (r4 == r10) goto L_0x017c
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.property_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 512(0x200, float:7.175E-43)
                r7 = r4
            L_0x017c:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r4 = r1.property_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x0189:
                r4 = r7 & 256(0x100, float:3.59E-43)
                r11 = 256(0x100, float:3.59E-43)
                if (r4 == r11) goto L_0x0199
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.function_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 256(0x100, float:3.59E-43)
                r7 = r4
            L_0x0199:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r4 = r1.function_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x01a6:
                r4 = r7 & 128(0x80, float:1.794E-43)
                r11 = 128(0x80, float:1.794E-43)
                if (r4 == r11) goto L_0x01b6
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.constructor_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 128(0x80, float:1.794E-43)
                r7 = r4
            L_0x01b6:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r4 = r1.constructor_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x01c3:
                int r4 = r18.readRawVarint32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r4 = r0.pushLimit(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11 = r7 & 64
                r12 = 64
                if (r11 == r12) goto L_0x01e0
                int r11 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r11 <= 0) goto L_0x01e0
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.nestedClassName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r7 = r7 | 64
            L_0x01e0:
                int r11 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r11 <= 0) goto L_0x01f4
                java.util.List<java.lang.Integer> r11 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r12 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x01e0
            L_0x01f4:
                r0.popLimit(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x01f9:
                r4 = r7 & 64
                r11 = 64
                if (r4 == r11) goto L_0x0209
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.nestedClassName_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 64
                r7 = r4
            L_0x0209:
                java.util.List<java.lang.Integer> r4 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r11 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x0218:
                r4 = r7 & 16
                r11 = 16
                if (r4 == r11) goto L_0x0228
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.supertype_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 16
                r7 = r4
            L_0x0228:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r4 = r1.supertype_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x0235:
                r4 = r7 & 8
                if (r4 == r15) goto L_0x0243
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.typeParameter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 8
                r7 = r4
            L_0x0243:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r4 = r1.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11 = r0.readMessage(r11, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x0250:
                int r4 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r4 | 4
                r1.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r4 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.companionObjectName_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x0269
            L_0x025d:
                int r4 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r4 | 2
                r1.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r4 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.fqName_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
            L_0x0269:
                r11 = 1
                goto L_0x02d3
            L_0x026b:
                int r4 = r18.readRawVarint32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r4 = r0.pushLimit(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11 = r7 & 32
                r12 = 32
                if (r11 == r12) goto L_0x0288
                int r11 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r11 <= 0) goto L_0x0288
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.supertypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r7 = r7 | 32
            L_0x0288:
                int r11 = r18.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                if (r11 <= 0) goto L_0x029c
                java.util.List<java.lang.Integer> r11 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r12 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x0288
            L_0x029c:
                r0.popLimit(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x02a0:
                r4 = r7 & 32
                r11 = 32
                if (r4 == r11) goto L_0x02b0
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.supertypeId_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4 = r7 | 32
                r7 = r4
            L_0x02b0:
                java.util.List<java.lang.Integer> r4 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r11 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x02be:
                int r4 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r11 = 1
                r4 = r4 | r11
                r1.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                int r4 = r18.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                r1.flags_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x02e7, IOException -> 0x02d8 }
                goto L_0x02d3
            L_0x02cb:
                r11 = 1
            L_0x02cc:
                r4 = 1
                r6 = 1
                goto L_0x0022
            L_0x02d0:
                if (r4 != 0) goto L_0x02d3
                goto L_0x02cc
            L_0x02d3:
                r4 = 1
                goto L_0x0022
            L_0x02d6:
                r0 = move-exception
                goto L_0x02ed
            L_0x02d8:
                r0 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x02d6 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02d6 }
                r2.<init>(r0)     // Catch:{ all -> 0x02d6 }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = r2.setUnfinishedMessage(r1)     // Catch:{ all -> 0x02d6 }
                throw r0     // Catch:{ all -> 0x02d6 }
            L_0x02e7:
                r0 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = r0.setUnfinishedMessage(r1)     // Catch:{ all -> 0x02d6 }
                throw r0     // Catch:{ all -> 0x02d6 }
            L_0x02ed:
                r2 = r7 & 32
                r4 = 32
                if (r2 != r4) goto L_0x02fb
                java.util.List<java.lang.Integer> r2 = r1.supertypeId_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.supertypeId_ = r2
            L_0x02fb:
                r2 = r7 & 8
                if (r2 != r15) goto L_0x0307
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r2 = r1.typeParameter_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.typeParameter_ = r2
            L_0x0307:
                r2 = r7 & 16
                r4 = 16
                if (r2 != r4) goto L_0x0315
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r2 = r1.supertype_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.supertype_ = r2
            L_0x0315:
                r2 = r7 & 64
                r4 = 64
                if (r2 != r4) goto L_0x0323
                java.util.List<java.lang.Integer> r2 = r1.nestedClassName_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.nestedClassName_ = r2
            L_0x0323:
                r2 = r7 & 128(0x80, float:1.794E-43)
                r4 = 128(0x80, float:1.794E-43)
                if (r2 != r4) goto L_0x0331
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r2 = r1.constructor_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.constructor_ = r2
            L_0x0331:
                r2 = r7 & 256(0x100, float:3.59E-43)
                r4 = 256(0x100, float:3.59E-43)
                if (r2 != r4) goto L_0x033f
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r1.function_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.function_ = r2
            L_0x033f:
                r2 = r7 & 512(0x200, float:7.175E-43)
                if (r2 != r10) goto L_0x034b
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r2 = r1.property_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.property_ = r2
            L_0x034b:
                r2 = r7 & 1024(0x400, float:1.435E-42)
                if (r2 != r9) goto L_0x0357
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r2 = r1.typeAlias_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.typeAlias_ = r2
            L_0x0357:
                r2 = r7 & 2048(0x800, float:2.87E-42)
                if (r2 != r8) goto L_0x0363
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r2 = r1.enumEntry_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.enumEntry_ = r2
            L_0x0363:
                r2 = r7 & 4096(0x1000, float:5.74E-42)
                if (r2 != r14) goto L_0x036f
                java.util.List<java.lang.Integer> r2 = r1.sealedSubclassFqName_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.sealedSubclassFqName_ = r2
            L_0x036f:
                r2 = r7 & 16384(0x4000, float:2.2959E-41)
                if (r2 != r13) goto L_0x037b
                java.util.List<java.lang.Integer> r2 = r1.versionRequirement_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.versionRequirement_ = r2
            L_0x037b:
                r5.flush()     // Catch:{ IOException -> 0x037e, all -> 0x0385 }
            L_0x037e:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r2 = r3.toByteString()
                r1.unknownFields = r2
                goto L_0x038e
            L_0x0385:
                r0 = move-exception
                r2 = r0
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r0 = r3.toByteString()
                r1.unknownFields = r0
                throw r2
            L_0x038e:
                r17.makeExtensionsImmutable()
                throw r0
            L_0x0392:
                r0 = r7 & 32
                r2 = 32
                if (r0 != r2) goto L_0x03a0
                java.util.List<java.lang.Integer> r0 = r1.supertypeId_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.supertypeId_ = r0
            L_0x03a0:
                r0 = r7 & 8
                if (r0 != r15) goto L_0x03ac
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r0 = r1.typeParameter_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.typeParameter_ = r0
            L_0x03ac:
                r0 = r7 & 16
                r2 = 16
                if (r0 != r2) goto L_0x03ba
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r0 = r1.supertype_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.supertype_ = r0
            L_0x03ba:
                r0 = r7 & 64
                r2 = 64
                if (r0 != r2) goto L_0x03c8
                java.util.List<java.lang.Integer> r0 = r1.nestedClassName_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.nestedClassName_ = r0
            L_0x03c8:
                r0 = r7 & 128(0x80, float:1.794E-43)
                r2 = 128(0x80, float:1.794E-43)
                if (r0 != r2) goto L_0x03d6
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r0 = r1.constructor_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.constructor_ = r0
            L_0x03d6:
                r0 = r7 & 256(0x100, float:3.59E-43)
                r2 = 256(0x100, float:3.59E-43)
                if (r0 != r2) goto L_0x03e4
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r0 = r1.function_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.function_ = r0
            L_0x03e4:
                r0 = r7 & 512(0x200, float:7.175E-43)
                if (r0 != r10) goto L_0x03f0
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r0 = r1.property_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.property_ = r0
            L_0x03f0:
                r0 = r7 & 1024(0x400, float:1.435E-42)
                if (r0 != r9) goto L_0x03fc
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r0 = r1.typeAlias_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.typeAlias_ = r0
            L_0x03fc:
                r0 = r7 & 2048(0x800, float:2.87E-42)
                if (r0 != r8) goto L_0x0408
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r0 = r1.enumEntry_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.enumEntry_ = r0
            L_0x0408:
                r0 = r7 & 4096(0x1000, float:5.74E-42)
                if (r0 != r14) goto L_0x0414
                java.util.List<java.lang.Integer> r0 = r1.sealedSubclassFqName_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.sealedSubclassFqName_ = r0
            L_0x0414:
                r0 = r7 & 16384(0x4000, float:2.2959E-41)
                if (r0 != r13) goto L_0x0420
                java.util.List<java.lang.Integer> r0 = r1.versionRequirement_
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.versionRequirement_ = r0
            L_0x0420:
                r5.flush()     // Catch:{ IOException -> 0x0423, all -> 0x042a }
            L_0x0423:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r0 = r3.toByteString()
                r1.unknownFields = r0
                goto L_0x0433
            L_0x042a:
                r0 = move-exception
                r2 = r0
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r0 = r3.toByteString()
                r1.unknownFields = r0
                throw r2
            L_0x0433:
                r17.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            Class classR = new Class(true);
            defaultInstance = classR;
            classR.initFields();
        }

        public final Parser<Class> getParserForType() {
            return PARSER;
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);
            
            private static Internal.EnumLiteMap<Kind> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<Kind>() {
                    public final Kind findValueByNumber(int i) {
                        return Kind.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            private Kind(int i, int i2) {
                this.value = i2;
            }
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final boolean hasFqName() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getFqName() {
            return this.fqName_;
        }

        public final boolean hasCompanionObjectName() {
            return (this.bitField0_ & 4) == 4;
        }

        public final int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public final List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public final int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public final TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public final List<Type> getSupertypeList() {
            return this.supertype_;
        }

        public final int getSupertypeCount() {
            return this.supertype_.size();
        }

        public final Type getSupertype(int i) {
            return this.supertype_.get(i);
        }

        public final List<Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public final List<Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        public final List<Constructor> getConstructorList() {
            return this.constructor_;
        }

        public final int getConstructorCount() {
            return this.constructor_.size();
        }

        public final Constructor getConstructor(int i) {
            return this.constructor_.get(i);
        }

        public final List<Function> getFunctionList() {
            return this.function_;
        }

        public final int getFunctionCount() {
            return this.function_.size();
        }

        public final Function getFunction(int i) {
            return this.function_.get(i);
        }

        public final List<Property> getPropertyList() {
            return this.property_;
        }

        public final int getPropertyCount() {
            return this.property_.size();
        }

        public final Property getProperty(int i) {
            return this.property_.get(i);
        }

        public final List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public final int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public final TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        public final List<EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public final int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public final EnumEntry getEnumEntry(int i) {
            return this.enumEntry_.get(i);
        }

        public final List<Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        public final boolean hasTypeTable() {
            return (this.bitField0_ & 8) == 8;
        }

        public final TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public final List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public final boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 16) == 16;
        }

        public final VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.supertype_ = Collections.emptyList();
            this.supertypeId_ = Collections.emptyList();
            this.nestedClassName_ = Collections.emptyList();
            this.constructor_ = Collections.emptyList();
            this.function_ = Collections.emptyList();
            this.property_ = Collections.emptyList();
            this.typeAlias_ = Collections.emptyList();
            this.enumEntry_ = Collections.emptyList();
            this.sealedSubclassFqName_ = Collections.emptyList();
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = Collections.emptyList();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                if (!getConstructor(i3).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                if (!getFunction(i4).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                if (!getProperty(i5).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                if (!getTypeAlias(i6).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                if (!getEnumEntry(i7).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.writeInt32NoTag(this.supertypeId_.get(i).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(4, this.companionObjectName_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.writeMessage(5, this.typeParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
                codedOutputStream.writeMessage(6, this.supertype_.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
                codedOutputStream.writeInt32NoTag(this.nestedClassName_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
                codedOutputStream.writeMessage(8, this.constructor_.get(i5));
            }
            for (int i6 = 0; i6 < this.function_.size(); i6++) {
                codedOutputStream.writeMessage(9, this.function_.get(i6));
            }
            for (int i7 = 0; i7 < this.property_.size(); i7++) {
                codedOutputStream.writeMessage(10, this.property_.get(i7));
            }
            for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
                codedOutputStream.writeMessage(11, this.typeAlias_.get(i8));
            }
            for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
                codedOutputStream.writeMessage(13, this.enumEntry_.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                codedOutputStream.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
                codedOutputStream.writeInt32NoTag(this.sealedSubclassFqName_.get(i10).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i11 = 0; i11 < this.versionRequirement_.size(); i11++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i11).intValue());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.supertypeId_.size(); i3++) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(this.supertypeId_.get(i3).intValue());
            }
            int i4 = computeInt32Size + i2;
            if (!getSupertypeIdList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.supertypeIdMemoizedSerializedSize = i2;
            if ((this.bitField0_ & 2) == 2) {
                i4 += CodedOutputStream.computeInt32Size(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i4 += CodedOutputStream.computeInt32Size(4, this.companionObjectName_);
            }
            for (int i5 = 0; i5 < this.typeParameter_.size(); i5++) {
                i4 += CodedOutputStream.computeMessageSize(5, this.typeParameter_.get(i5));
            }
            for (int i6 = 0; i6 < this.supertype_.size(); i6++) {
                i4 += CodedOutputStream.computeMessageSize(6, this.supertype_.get(i6));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.nestedClassName_.size(); i8++) {
                i7 += CodedOutputStream.computeInt32SizeNoTag(this.nestedClassName_.get(i8).intValue());
            }
            int i9 = i4 + i7;
            if (!getNestedClassNameList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeInt32SizeNoTag(i7);
            }
            this.nestedClassNameMemoizedSerializedSize = i7;
            for (int i10 = 0; i10 < this.constructor_.size(); i10++) {
                i9 += CodedOutputStream.computeMessageSize(8, this.constructor_.get(i10));
            }
            for (int i11 = 0; i11 < this.function_.size(); i11++) {
                i9 += CodedOutputStream.computeMessageSize(9, this.function_.get(i11));
            }
            for (int i12 = 0; i12 < this.property_.size(); i12++) {
                i9 += CodedOutputStream.computeMessageSize(10, this.property_.get(i12));
            }
            for (int i13 = 0; i13 < this.typeAlias_.size(); i13++) {
                i9 += CodedOutputStream.computeMessageSize(11, this.typeAlias_.get(i13));
            }
            for (int i14 = 0; i14 < this.enumEntry_.size(); i14++) {
                i9 += CodedOutputStream.computeMessageSize(13, this.enumEntry_.get(i14));
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.sealedSubclassFqName_.size(); i16++) {
                i15 += CodedOutputStream.computeInt32SizeNoTag(this.sealedSubclassFqName_.get(i16).intValue());
            }
            int i17 = i9 + i15;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                i17 = i17 + 2 + CodedOutputStream.computeInt32SizeNoTag(i15);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = i15;
            if ((this.bitField0_ & 8) == 8) {
                i17 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int i18 = 0;
            for (int i19 = 0; i19 < this.versionRequirement_.size(); i19++) {
                i18 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i19).intValue());
            }
            int size = i17 + i18 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Class classR) {
            return newBuilder().mergeFrom(classR);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            private int bitField0_;
            private int companionObjectName_;
            private List<Constructor> constructor_ = Collections.emptyList();
            private List<EnumEntry> enumEntry_ = Collections.emptyList();
            private int flags_ = 6;
            private int fqName_;
            private List<Function> function_ = Collections.emptyList();
            private List<Integer> nestedClassName_ = Collections.emptyList();
            private List<Property> property_ = Collections.emptyList();
            private List<Integer> sealedSubclassFqName_ = Collections.emptyList();
            private List<Integer> supertypeId_ = Collections.emptyList();
            private List<Type> supertype_ = Collections.emptyList();
            private List<TypeAlias> typeAlias_ = Collections.emptyList();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.getDefaultInstance();
            private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            public final Class build() {
                Class buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Class buildPartial() {
                Class classR = new Class((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = classR.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = classR.fqName_ = this.fqName_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                int unused3 = classR.companionObjectName_ = this.companionObjectName_;
                if ((this.bitField0_ & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -9;
                }
                List unused4 = classR.typeParameter_ = this.typeParameter_;
                if ((this.bitField0_ & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    this.bitField0_ &= -17;
                }
                List unused5 = classR.supertype_ = this.supertype_;
                if ((this.bitField0_ & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    this.bitField0_ &= -33;
                }
                List unused6 = classR.supertypeId_ = this.supertypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    this.bitField0_ &= -65;
                }
                List unused7 = classR.nestedClassName_ = this.nestedClassName_;
                if ((this.bitField0_ & 128) == 128) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    this.bitField0_ &= -129;
                }
                List unused8 = classR.constructor_ = this.constructor_;
                if ((this.bitField0_ & 256) == 256) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -257;
                }
                List unused9 = classR.function_ = this.function_;
                if ((this.bitField0_ & 512) == 512) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -513;
                }
                List unused10 = classR.property_ = this.property_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -1025;
                }
                List unused11 = classR.typeAlias_ = this.typeAlias_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    this.bitField0_ &= -2049;
                }
                List unused12 = classR.enumEntry_ = this.enumEntry_;
                if ((this.bitField0_ & 4096) == 4096) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    this.bitField0_ &= -4097;
                }
                List unused13 = classR.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                if ((i & 8192) == 8192) {
                    i2 |= 8;
                }
                TypeTable unused14 = classR.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -16385;
                }
                List unused15 = classR.versionRequirement_ = this.versionRequirement_;
                if ((i & 32768) == 32768) {
                    i2 |= 16;
                }
                VersionRequirementTable unused16 = classR.versionRequirementTable_ = this.versionRequirementTable_;
                int unused17 = classR.bitField0_ = i2;
                return classR;
            }

            public final Builder mergeFrom(Class classR) {
                if (classR == Class.getDefaultInstance()) {
                    return this;
                }
                if (classR.hasFlags()) {
                    setFlags(classR.getFlags());
                }
                if (classR.hasFqName()) {
                    setFqName(classR.getFqName());
                }
                if (classR.hasCompanionObjectName()) {
                    setCompanionObjectName(classR.getCompanionObjectName());
                }
                if (!classR.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = classR.typeParameter_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(classR.typeParameter_);
                    }
                }
                if (!classR.supertype_.isEmpty()) {
                    if (this.supertype_.isEmpty()) {
                        this.supertype_ = classR.supertype_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureSupertypeIsMutable();
                        this.supertype_.addAll(classR.supertype_);
                    }
                }
                if (!classR.supertypeId_.isEmpty()) {
                    if (this.supertypeId_.isEmpty()) {
                        this.supertypeId_ = classR.supertypeId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureSupertypeIdIsMutable();
                        this.supertypeId_.addAll(classR.supertypeId_);
                    }
                }
                if (!classR.nestedClassName_.isEmpty()) {
                    if (this.nestedClassName_.isEmpty()) {
                        this.nestedClassName_ = classR.nestedClassName_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureNestedClassNameIsMutable();
                        this.nestedClassName_.addAll(classR.nestedClassName_);
                    }
                }
                if (!classR.constructor_.isEmpty()) {
                    if (this.constructor_.isEmpty()) {
                        this.constructor_ = classR.constructor_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureConstructorIsMutable();
                        this.constructor_.addAll(classR.constructor_);
                    }
                }
                if (!classR.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = classR.function_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(classR.function_);
                    }
                }
                if (!classR.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = classR.property_;
                        this.bitField0_ &= -513;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(classR.property_);
                    }
                }
                if (!classR.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = classR.typeAlias_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(classR.typeAlias_);
                    }
                }
                if (!classR.enumEntry_.isEmpty()) {
                    if (this.enumEntry_.isEmpty()) {
                        this.enumEntry_ = classR.enumEntry_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureEnumEntryIsMutable();
                        this.enumEntry_.addAll(classR.enumEntry_);
                    }
                }
                if (!classR.sealedSubclassFqName_.isEmpty()) {
                    if (this.sealedSubclassFqName_.isEmpty()) {
                        this.sealedSubclassFqName_ = classR.sealedSubclassFqName_;
                        this.bitField0_ &= -4097;
                    } else {
                        ensureSealedSubclassFqNameIsMutable();
                        this.sealedSubclassFqName_.addAll(classR.sealedSubclassFqName_);
                    }
                }
                if (classR.hasTypeTable()) {
                    mergeTypeTable(classR.getTypeTable());
                }
                if (!classR.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = classR.versionRequirement_;
                        this.bitField0_ &= -16385;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(classR.versionRequirement_);
                    }
                }
                if (classR.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(classR.getVersionRequirementTable());
                }
                mergeExtensionFields(classR);
                setUnknownFields(getUnknownFields().concat(classR.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                    if (!getConstructor(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                    if (!getFunction(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                    if (!getProperty(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                    if (!getTypeAlias(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                    if (!getEnumEntry(i7).isInitialized()) {
                        return false;
                    }
                }
                if ((!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Class classR;
                Class classR2 = null;
                try {
                    Class parsePartialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    classR = (Class) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    classR2 = classR;
                }
                if (classR2 != null) {
                    mergeFrom(classR2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public final boolean hasFqName() {
                return (this.bitField0_ & 2) == 2;
            }

            public final Builder setFqName(int i) {
                this.bitField0_ |= 2;
                this.fqName_ = i;
                return this;
            }

            public final Builder setCompanionObjectName(int i) {
                this.bitField0_ |= 4;
                this.companionObjectName_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 8;
                }
            }

            public final int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public final TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            private void ensureSupertypeIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.supertype_ = new ArrayList(this.supertype_);
                    this.bitField0_ |= 16;
                }
            }

            public final int getSupertypeCount() {
                return this.supertype_.size();
            }

            public final Type getSupertype(int i) {
                return this.supertype_.get(i);
            }

            private void ensureSupertypeIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.supertypeId_ = new ArrayList(this.supertypeId_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureNestedClassNameIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.nestedClassName_ = new ArrayList(this.nestedClassName_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureConstructorIsMutable() {
                if ((this.bitField0_ & 128) != 128) {
                    this.constructor_ = new ArrayList(this.constructor_);
                    this.bitField0_ |= 128;
                }
            }

            public final int getConstructorCount() {
                return this.constructor_.size();
            }

            public final Constructor getConstructor(int i) {
                return this.constructor_.get(i);
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 256;
                }
            }

            public final int getFunctionCount() {
                return this.function_.size();
            }

            public final Function getFunction(int i) {
                return this.function_.get(i);
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 512;
                }
            }

            public final int getPropertyCount() {
                return this.property_.size();
            }

            public final Property getProperty(int i) {
                return this.property_.get(i);
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 1024;
                }
            }

            public final int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public final TypeAlias getTypeAlias(int i) {
                return this.typeAlias_.get(i);
            }

            private void ensureEnumEntryIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.enumEntry_ = new ArrayList(this.enumEntry_);
                    this.bitField0_ |= 2048;
                }
            }

            public final int getEnumEntryCount() {
                return this.enumEntry_.size();
            }

            public final EnumEntry getEnumEntry(int i) {
                return this.enumEntry_.get(i);
            }

            private void ensureSealedSubclassFqNameIsMutable() {
                if ((this.bitField0_ & 4096) != 4096) {
                    this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
                    this.bitField0_ |= 4096;
                }
            }

            public final boolean hasTypeTable() {
                return (this.bitField0_ & 8192) == 8192;
            }

            public final TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public final Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 8192) != 8192 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 8192;
                return this;
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 16384;
                }
            }

            public final Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 32768) != 32768 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 32768;
                return this;
            }
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new AbstractParser<Package>() {
            public final Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Package defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Property> property_;
        /* access modifiers changed from: private */
        public List<TypeAlias> typeAlias_;
        /* access modifiers changed from: private */
        public TypeTable typeTable_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public VersionRequirementTable versionRequirementTable_;

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Package(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        public final Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder} */
        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v5 */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private Package(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r10 = this;
                r10.<init>()
                r0 = -1
                r10.memoizedIsInitialized = r0
                r10.memoizedSerializedSize = r0
                r10.initFields()
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString$Output r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 4
                r6 = 2
                if (r3 != 0) goto L_0x012b
                int r7 = r11.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                if (r7 == 0) goto L_0x00d7
                r8 = 26
                if (r7 == r8) goto L_0x00bd
                r8 = 34
                if (r7 == r8) goto L_0x00a3
                r8 = 42
                if (r7 == r8) goto L_0x0089
                r8 = 242(0xf2, float:3.39E-43)
                r9 = 0
                if (r7 == r8) goto L_0x0063
                r8 = 258(0x102, float:3.62E-43)
                if (r7 == r8) goto L_0x003d
                boolean r5 = r10.parseUnknownField(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                if (r5 != 0) goto L_0x0016
                goto L_0x00d7
            L_0x003d:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7 = r7 & r6
                if (r7 != r6) goto L_0x0048
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r10.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder r9 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            L_0x0048:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r11.readMessage(r7, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                if (r9 == 0) goto L_0x005d
                r9.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r9.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            L_0x005d:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7 = r7 | r6
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                goto L_0x0016
            L_0x0063:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7 = r7 & r1
                if (r7 != r1) goto L_0x006e
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r10.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder r9 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            L_0x006e:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r11.readMessage(r7, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                if (r9 == 0) goto L_0x0083
                r9.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r9.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            L_0x0083:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7 = r7 | r1
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                goto L_0x0016
            L_0x0089:
                r7 = r4 & 4
                if (r7 == r5) goto L_0x0096
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.typeAlias_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r4 = r4 | 4
            L_0x0096:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r7 = r10.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r11.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                goto L_0x0016
            L_0x00a3:
                r7 = r4 & 2
                if (r7 == r6) goto L_0x00b0
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.property_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r4 = r4 | 2
            L_0x00b0:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r7 = r10.property_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r11.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                goto L_0x0016
            L_0x00bd:
                r7 = r4 & 1
                if (r7 == r1) goto L_0x00ca
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r10.function_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r4 = r4 | 1
            L_0x00ca:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r7 = r10.function_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r11.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
                goto L_0x0016
            L_0x00d7:
                r3 = 1
                goto L_0x0016
            L_0x00da:
                r11 = move-exception
                goto L_0x00f1
            L_0x00dc:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00da }
                java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00da }
                r12.<init>(r11)     // Catch:{ all -> 0x00da }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r12.setUnfinishedMessage(r10)     // Catch:{ all -> 0x00da }
                throw r11     // Catch:{ all -> 0x00da }
            L_0x00eb:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r11.setUnfinishedMessage(r10)     // Catch:{ all -> 0x00da }
                throw r11     // Catch:{ all -> 0x00da }
            L_0x00f1:
                r12 = r4 & 1
                if (r12 != r1) goto L_0x00fd
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r12 = r10.function_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.function_ = r12
            L_0x00fd:
                r12 = r4 & 2
                if (r12 != r6) goto L_0x0109
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r12 = r10.property_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.property_ = r12
            L_0x0109:
                r12 = r4 & 4
                if (r12 != r5) goto L_0x0115
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r12 = r10.typeAlias_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.typeAlias_ = r12
            L_0x0115:
                r2.flush()     // Catch:{ IOException -> 0x0118, all -> 0x011f }
            L_0x0118:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r10.unknownFields = r12
                goto L_0x0127
            L_0x011f:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r10.unknownFields = r12
                throw r11
            L_0x0127:
                r10.makeExtensionsImmutable()
                throw r11
            L_0x012b:
                r11 = r4 & 1
                if (r11 != r1) goto L_0x0137
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = r10.function_
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.function_ = r11
            L_0x0137:
                r11 = r4 & 2
                if (r11 != r6) goto L_0x0143
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = r10.property_
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.property_ = r11
            L_0x0143:
                r11 = r4 & 4
                if (r11 != r5) goto L_0x014f
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = r10.typeAlias_
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.typeAlias_ = r11
            L_0x014f:
                r2.flush()     // Catch:{ IOException -> 0x0152, all -> 0x0159 }
            L_0x0152:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r11 = r0.toByteString()
                r10.unknownFields = r11
                goto L_0x0161
            L_0x0159:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r10.unknownFields = r12
                throw r11
            L_0x0161:
                r10.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            Package packageR = new Package(true);
            defaultInstance = packageR;
            packageR.initFields();
        }

        public final Parser<Package> getParserForType() {
            return PARSER;
        }

        public final List<Function> getFunctionList() {
            return this.function_;
        }

        public final int getFunctionCount() {
            return this.function_.size();
        }

        public final Function getFunction(int i) {
            return this.function_.get(i);
        }

        public final List<Property> getPropertyList() {
            return this.property_;
        }

        public final int getPropertyCount() {
            return this.property_.size();
        }

        public final Property getProperty(int i) {
            return this.property_.get(i);
        }

        public final List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public final int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public final TypeAlias getTypeAlias(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1647275762, oncanceled);
                onCancelLoad.getMin(1647275762, oncanceled);
            }
            return this.typeAlias_.get(i);
        }

        public final boolean hasTypeTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public final TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public final boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 2) == 2;
        }

        public final VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        private void initFields() {
            this.function_ = Collections.emptyList();
            this.property_ = Collections.emptyList();
            this.typeAlias_ = Collections.emptyList();
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.function_.size(); i++) {
                codedOutputStream.writeMessage(3, this.function_.get(i));
            }
            for (int i2 = 0; i2 < this.property_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.property_.get(i2));
            }
            for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
                codedOutputStream.writeMessage(5, this.typeAlias_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.function_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(3, this.function_.get(i3));
            }
            for (int i4 = 0; i4 < this.property_.size(); i4++) {
                i2 += CodedOutputStream.computeMessageSize(4, this.property_.get(i4));
            }
            for (int i5 = 0; i5 < this.typeAlias_.size(); i5++) {
                i2 += CodedOutputStream.computeMessageSize(5, this.typeAlias_.get(i5));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Package packageR) {
            return newBuilder().mergeFrom(packageR);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            private int bitField0_;
            private List<Function> function_ = Collections.emptyList();
            private List<Property> property_ = Collections.emptyList();
            private List<TypeAlias> typeAlias_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.getDefaultInstance();
            private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            public final Package build() {
                Package buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Package buildPartial() {
                Package packageR = new Package((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -2;
                }
                List unused = packageR.function_ = this.function_;
                if ((this.bitField0_ & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -3;
                }
                List unused2 = packageR.property_ = this.property_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -5;
                }
                List unused3 = packageR.typeAlias_ = this.typeAlias_;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                TypeTable unused4 = packageR.typeTable_ = this.typeTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                VersionRequirementTable unused5 = packageR.versionRequirementTable_ = this.versionRequirementTable_;
                int unused6 = packageR.bitField0_ = i2;
                return packageR;
            }

            public final Builder mergeFrom(Package packageR) {
                if (packageR == Package.getDefaultInstance()) {
                    return this;
                }
                if (!packageR.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = packageR.function_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(packageR.function_);
                    }
                }
                if (!packageR.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = packageR.property_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(packageR.property_);
                    }
                }
                if (!packageR.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = packageR.typeAlias_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(packageR.typeAlias_);
                    }
                }
                if (packageR.hasTypeTable()) {
                    mergeTypeTable(packageR.getTypeTable());
                }
                if (packageR.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(packageR.getVersionRequirementTable());
                }
                mergeExtensionFields(packageR);
                setUnknownFields(getUnknownFields().concat(packageR.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                if ((!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Package packageR;
                Package packageR2 = null;
                try {
                    Package parsePartialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    packageR = (Package) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    packageR2 = packageR;
                }
                if (packageR2 != null) {
                    mergeFrom(packageR2);
                }
                throw th;
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 1;
                }
            }

            public final int getFunctionCount() {
                return this.function_.size();
            }

            public final Function getFunction(int i) {
                return this.function_.get(i);
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 2;
                }
            }

            public final int getPropertyCount() {
                return this.property_.size();
            }

            public final Property getProperty(int i) {
                return this.property_.get(i);
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 4;
                }
            }

            public final int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public final TypeAlias getTypeAlias(int i) {
                return this.typeAlias_.get(i);
            }

            public final boolean hasTypeTable() {
                return (this.bitField0_ & 8) == 8;
            }

            public final TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public final Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 8) != 8 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16) != 16 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new AbstractParser<TypeTable>() {
            public final TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeTable defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Type> type_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private TypeTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        public final TypeTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.type_ = new ArrayList();
                                z2 |= true;
                            }
                            this.type_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                        } else if (readTag == 16) {
                            this.bitField0_ |= 1;
                            this.firstNullable_ = codedInputStream.readInt32();
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            defaultInstance = typeTable;
            typeTable.initFields();
        }

        public final Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        public final List<Type> getTypeList() {
            return this.type_;
        }

        public final int getTypeCount() {
            return this.type_.size();
        }

        public final Type getType(int i) {
            return this.type_.get(i);
        }

        public final boolean hasFirstNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFirstNullable() {
            return this.firstNullable_;
        }

        private void initFields() {
            this.type_ = Collections.emptyList();
            this.firstNullable_ = -1;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.type_.size(); i++) {
                codedOutputStream.writeMessage(1, this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(2, this.firstNullable_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.type_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeInt32Size(2, this.firstNullable_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
            private int bitField0_;
            private int firstNullable_ = -1;
            private List<Type> type_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            public final TypeTable build() {
                TypeTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable((GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                List unused = typeTable.type_ = this.type_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                int unused2 = typeTable.firstNullable_ = this.firstNullable_;
                int unused3 = typeTable.bitField0_ = i2;
                return typeTable;
            }

            public final Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = typeTable.type_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                TypeTable typeTable;
                TypeTable typeTable2 = null;
                try {
                    TypeTable parsePartialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeTable = (TypeTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    typeTable2 = typeTable;
                }
                if (typeTable2 != null) {
                    mergeFrom(typeTable2);
                }
                throw th;
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 1;
                }
            }

            public final int getTypeCount() {
                return this.type_.size();
            }

            public final Type getType(int i) {
                return this.type_.get(i);
            }

            public final Builder setFirstNullable(int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(28293715, oncanceled);
                    onCancelLoad.getMin(28293715, oncanceled);
                }
                this.bitField0_ |= 2;
                this.firstNullable_ = i;
                return this;
            }
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new AbstractParser<Constructor>() {
            public final Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Constructor defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public List<ValueParameter> valueParameter_;
        /* access modifiers changed from: private */
        public List<Integer> versionRequirement_;

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Constructor(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Constructor getDefaultInstance() {
            return defaultInstance;
        }

        public final Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.valueParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.valueParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                        } else if (readTag == 248) {
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                        } else if (readTag == 250) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            Constructor constructor = new Constructor(true);
            defaultInstance = constructor;
            constructor.initFields();
        }

        public final Parser<Constructor> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public final int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public final ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        public final List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.valueParameter_ = Collections.emptyList();
            this.versionRequirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.writeMessage(2, this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i2).intValue());
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, this.valueParameter_.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i4).intValue());
            }
            int size = computeInt32Size + i3 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            private int bitField0_;
            private int flags_ = 6;
            private List<ValueParameter> valueParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            public final Constructor build() {
                Constructor buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Constructor buildPartial() {
                Constructor constructor = new Constructor((GeneratedMessageLite.ExtendableBuilder) this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                int unused = constructor.flags_ = this.flags_;
                if ((this.bitField0_ & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -3;
                }
                List unused2 = constructor.valueParameter_ = this.valueParameter_;
                if ((this.bitField0_ & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -5;
                }
                List unused3 = constructor.versionRequirement_ = this.versionRequirement_;
                int unused4 = constructor.bitField0_ = i;
                return constructor;
            }

            public final Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = constructor.valueParameter_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = constructor.versionRequirement_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(constructor.versionRequirement_);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Constructor constructor;
                Constructor constructor2 = null;
                try {
                    Constructor parsePartialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    constructor = (Constructor) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    constructor2 = constructor;
                }
                if (constructor2 != null) {
                    mergeFrom(constructor2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 2;
                }
            }

            public final int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public final ValueParameter getValueParameter(int i) {
                return this.valueParameter_.get(i);
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 4;
                }
            }
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new AbstractParser<Function>() {
            public final Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Function defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public Contract contract_;
        /* access modifiers changed from: private */
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public int oldFlags_;
        /* access modifiers changed from: private */
        public int receiverTypeId_;
        /* access modifiers changed from: private */
        public Type receiverType_;
        /* access modifiers changed from: private */
        public int returnTypeId_;
        /* access modifiers changed from: private */
        public Type returnType_;
        /* access modifiers changed from: private */
        public List<TypeParameter> typeParameter_;
        /* access modifiers changed from: private */
        public TypeTable typeTable_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public List<ValueParameter> valueParameter_;
        /* access modifiers changed from: private */
        public List<Integer> versionRequirement_;

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Function(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Function getDefaultInstance() {
            return defaultInstance;
        }

        public final Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder} */
        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v20 */
        /* JADX WARNING: type inference failed for: r9v21 */
        /* JADX WARNING: type inference failed for: r9v22 */
        /* JADX WARNING: type inference failed for: r9v23 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private Function(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r12, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r11 = this;
                r11.<init>()
                r0 = -1
                r11.memoizedIsInitialized = r0
                r11.memoizedSerializedSize = r0
                r11.initFields()
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString$Output r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 1024(0x400, float:1.435E-42)
                r6 = 256(0x100, float:3.59E-43)
                r7 = 32
                if (r3 != 0) goto L_0x01ea
                int r8 = r12.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r9 = 0
                switch(r8) {
                    case 0: goto L_0x0193;
                    case 8: goto L_0x0185;
                    case 16: goto L_0x0177;
                    case 26: goto L_0x014e;
                    case 34: goto L_0x0134;
                    case 42: goto L_0x010d;
                    case 50: goto L_0x00f3;
                    case 56: goto L_0x00e5;
                    case 64: goto L_0x00d7;
                    case 72: goto L_0x00ca;
                    case 242: goto L_0x00a1;
                    case 248: goto L_0x0085;
                    case 250: goto L_0x0052;
                    case 258: goto L_0x002c;
                    default: goto L_0x0026;
                }     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x0026:
                boolean r5 = r11.parseUnknownField(r12, r2, r13, r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0196
            L_0x002c:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 & r6
                if (r8 != r6) goto L_0x0037
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r8 = r11.contract_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder r9 = r8.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x0037:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r12.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.contract_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                if (r9 == 0) goto L_0x004c
                r9.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r8 = r9.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.contract_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x004c:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | r6
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x0052:
                int r8 = r12.readRawVarint32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r8 = r12.pushLimit(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r9 = r4 & 1024(0x400, float:1.435E-42)
                if (r9 == r5) goto L_0x006d
                int r9 = r12.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                if (r9 <= 0) goto L_0x006d
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.versionRequirement_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r4 = r4 | 1024(0x400, float:1.435E-42)
            L_0x006d:
                int r9 = r12.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                if (r9 <= 0) goto L_0x0081
                java.util.List<java.lang.Integer> r9 = r11.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r10 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x006d
            L_0x0081:
                r12.popLimit(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x0085:
                r8 = r4 & 1024(0x400, float:1.435E-42)
                if (r8 == r5) goto L_0x0092
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.versionRequirement_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r4 = r4 | 1024(0x400, float:1.435E-42)
            L_0x0092:
                java.util.List<java.lang.Integer> r8 = r11.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r9 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x00a1:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r10 = 128(0x80, float:1.794E-43)
                r8 = r8 & r10
                if (r8 != r10) goto L_0x00ae
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r8 = r11.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder r9 = r8.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x00ae:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r12.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.typeTable_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                if (r9 == 0) goto L_0x00c3
                r9.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r8 = r9.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.typeTable_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x00c3:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | r10
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x00ca:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | r1
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r8 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.flags_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x00d7:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | 64
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r8 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.receiverTypeId_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x00e5:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | 16
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r8 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.returnTypeId_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x00f3:
                r8 = r4 & 256(0x100, float:3.59E-43)
                if (r8 == r6) goto L_0x0100
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.valueParameter_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r4 = r4 | 256(0x100, float:3.59E-43)
            L_0x0100:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r8 = r11.valueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r9 = r12.readMessage(r9, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x010d:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 & r7
                if (r8 != r7) goto L_0x0118
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r11.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder r9 = r8.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x0118:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r12.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.receiverType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                if (r9 == 0) goto L_0x012d
                r9.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r9.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.receiverType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x012d:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | r7
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x0134:
                r8 = r4 & 32
                if (r8 == r7) goto L_0x0141
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.typeParameter_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r4 = r4 | 32
            L_0x0141:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r8 = r11.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r9 = r12.readMessage(r9, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x014e:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r10 = 8
                r8 = r8 & r10
                if (r8 != r10) goto L_0x015b
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r11.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder r9 = r8.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x015b:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r12.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.returnType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                if (r9 == 0) goto L_0x0170
                r9.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r9.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.returnType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
            L_0x0170:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | r10
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x0177:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | 4
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r8 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.name_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x0185:
                int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r8 = r8 | 2
                r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                int r8 = r12.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                r11.oldFlags_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01aa, IOException -> 0x019b }
                goto L_0x0016
            L_0x0193:
                r3 = 1
                goto L_0x0016
            L_0x0196:
                if (r5 != 0) goto L_0x0016
                goto L_0x0193
            L_0x0199:
                r12 = move-exception
                goto L_0x01b0
            L_0x019b:
                r12 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0199 }
                java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0199 }
                r13.<init>(r12)     // Catch:{ all -> 0x0199 }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = r13.setUnfinishedMessage(r11)     // Catch:{ all -> 0x0199 }
                throw r12     // Catch:{ all -> 0x0199 }
            L_0x01aa:
                r12 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = r12.setUnfinishedMessage(r11)     // Catch:{ all -> 0x0199 }
                throw r12     // Catch:{ all -> 0x0199 }
            L_0x01b0:
                r13 = r4 & 32
                if (r13 != r7) goto L_0x01bc
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r13 = r11.typeParameter_
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.typeParameter_ = r13
            L_0x01bc:
                r13 = r4 & 256(0x100, float:3.59E-43)
                if (r13 != r6) goto L_0x01c8
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r13 = r11.valueParameter_
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.valueParameter_ = r13
            L_0x01c8:
                r13 = r4 & 1024(0x400, float:1.435E-42)
                if (r13 != r5) goto L_0x01d4
                java.util.List<java.lang.Integer> r13 = r11.versionRequirement_
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.versionRequirement_ = r13
            L_0x01d4:
                r2.flush()     // Catch:{ IOException -> 0x01d7, all -> 0x01de }
            L_0x01d7:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r13 = r0.toByteString()
                r11.unknownFields = r13
                goto L_0x01e6
            L_0x01de:
                r12 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r13 = r0.toByteString()
                r11.unknownFields = r13
                throw r12
            L_0x01e6:
                r11.makeExtensionsImmutable()
                throw r12
            L_0x01ea:
                r12 = r4 & 32
                if (r12 != r7) goto L_0x01f6
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = r11.typeParameter_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.typeParameter_ = r12
            L_0x01f6:
                r12 = r4 & 256(0x100, float:3.59E-43)
                if (r12 != r6) goto L_0x0202
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r12 = r11.valueParameter_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.valueParameter_ = r12
            L_0x0202:
                r12 = r4 & 1024(0x400, float:1.435E-42)
                if (r12 != r5) goto L_0x020e
                java.util.List<java.lang.Integer> r12 = r11.versionRequirement_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.versionRequirement_ = r12
            L_0x020e:
                r2.flush()     // Catch:{ IOException -> 0x0211, all -> 0x0218 }
            L_0x0211:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r11.unknownFields = r12
                goto L_0x0220
            L_0x0218:
                r12 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r13 = r0.toByteString()
                r11.unknownFields = r13
                throw r12
            L_0x0220:
                r11.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            Function function = new Function(true);
            defaultInstance = function;
            function.initFields();
        }

        public final Parser<Function> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getOldFlags() {
            return this.oldFlags_;
        }

        public final boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public final int getName() {
            return this.name_;
        }

        public final boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public final Type getReturnType() {
            return this.returnType_;
        }

        public final boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public final int getReturnTypeId() {
            return this.returnTypeId_;
        }

        public final List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public final int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public final TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public final boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public final Type getReceiverType() {
            return this.receiverType_;
        }

        public final boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public final int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public final List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public final int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public final ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        public final boolean hasTypeTable() {
            return (this.bitField0_ & 128) == 128;
        }

        public final TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public final List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public final boolean hasContract() {
            return (this.bitField0_ & 256) == 256;
        }

        public final Contract getContract() {
            return this.contract_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.valueParameter_ = Collections.emptyList();
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = Collections.emptyList();
            this.contract_ = Contract.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasReturnType() || getReturnType().isInitialized()) {
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!hasReceiverType() || getReceiverType().isInitialized()) {
                    for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                        if (!getValueParameter(i2).isInitialized()) {
                            this.memoizedIsInitialized = 0;
                            return false;
                        }
                    }
                    if (hasTypeTable() && !getTypeTable().isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    } else if (hasContract() && !getContract().isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    } else if (!extensionsAreInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    } else {
                        this.memoizedIsInitialized = 1;
                        return true;
                    }
                } else {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.valueParameter_.get(i2));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(9, this.flags_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i3).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(32, this.contract_);
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0 : 0;
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, this.valueParameter_.get(i3));
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeInt32Size(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                computeInt32Size += CodedOutputStream.computeInt32Size(9, this.flags_);
            }
            if ((this.bitField0_ & 128) == 128) {
                computeInt32Size += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i5).intValue());
            }
            int size = computeInt32Size + i4 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.contract_);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            private int bitField0_;
            private Contract contract_ = Contract.getDefaultInstance();
            private int flags_ = 6;
            private int name_;
            private int oldFlags_ = 6;
            private int receiverTypeId_;
            private Type receiverType_ = Type.getDefaultInstance();
            private int returnTypeId_;
            private Type returnType_ = Type.getDefaultInstance();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.getDefaultInstance();
            private List<ValueParameter> valueParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            public final Function build() {
                Function buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Function buildPartial() {
                Function function = new Function((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = function.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = function.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                int unused3 = function.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                Type unused4 = function.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                int unused5 = function.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                List unused6 = function.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                Type unused7 = function.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                int unused8 = function.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -257;
                }
                List unused9 = function.valueParameter_ = this.valueParameter_;
                if ((i & 512) == 512) {
                    i2 |= 128;
                }
                TypeTable unused10 = function.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -1025;
                }
                List unused11 = function.versionRequirement_ = this.versionRequirement_;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                Contract unused12 = function.contract_ = this.contract_;
                int unused13 = function.bitField0_ = i2;
                return function;
            }

            public final Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = function.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = function.valueParameter_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = function.versionRequirement_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                    if (!getValueParameter(i2).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                if ((!hasContract() || getContract().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Function function;
                Function function2 = null;
                try {
                    Function parsePartialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    function = (Function) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    function2 = function;
                }
                if (function2 != null) {
                    mergeFrom(function2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public final Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public final boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public final Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public final boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public final Type getReturnType() {
                return this.returnType_;
            }

            public final Builder mergeReturnType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            public final int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public final TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public final boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public final Type getReceiverType() {
                return this.receiverType_;
            }

            public final Builder mergeReceiverType(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public final Builder setReceiverTypeId(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 256;
                }
            }

            public final int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public final ValueParameter getValueParameter(int i) {
                return this.valueParameter_.get(i);
            }

            public final boolean hasTypeTable() {
                return (this.bitField0_ & 512) == 512;
            }

            public final TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public final Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 512) != 512 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 512;
                return this;
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 1024;
                }
            }

            public final boolean hasContract() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public final Contract getContract() {
                return this.contract_;
            }

            public final Builder mergeContract(Contract contract) {
                if ((this.bitField0_ & 2048) != 2048 || this.contract_ == Contract.getDefaultInstance()) {
                    this.contract_ = contract;
                } else {
                    this.contract_ = Contract.newBuilder(this.contract_).mergeFrom(contract).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new AbstractParser<Property>() {
            public final Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Property defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int flags_;
        /* access modifiers changed from: private */
        public int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public int oldFlags_;
        /* access modifiers changed from: private */
        public int receiverTypeId_;
        /* access modifiers changed from: private */
        public Type receiverType_;
        /* access modifiers changed from: private */
        public int returnTypeId_;
        /* access modifiers changed from: private */
        public Type returnType_;
        /* access modifiers changed from: private */
        public int setterFlags_;
        /* access modifiers changed from: private */
        public ValueParameter setterValueParameter_;
        /* access modifiers changed from: private */
        public List<TypeParameter> typeParameter_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public List<Integer> versionRequirement_;

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Property(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Property getDefaultInstance() {
            return defaultInstance;
        }

        public final Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder} */
        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v16 */
        /* JADX WARNING: type inference failed for: r8v17 */
        /* JADX WARNING: type inference failed for: r8v18 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private Property(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r10 = this;
                r10.<init>()
                r0 = -1
                r10.memoizedIsInitialized = r0
                r10.memoizedSerializedSize = r0
                r10.initFields()
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString$Output r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 2048(0x800, float:2.87E-42)
                r6 = 32
                if (r3 != 0) goto L_0x01b5
                int r7 = r11.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r8 = 0
                switch(r7) {
                    case 0: goto L_0x016a;
                    case 8: goto L_0x015c;
                    case 16: goto L_0x014e;
                    case 26: goto L_0x0125;
                    case 34: goto L_0x010b;
                    case 42: goto L_0x00e4;
                    case 50: goto L_0x00bb;
                    case 56: goto L_0x00ad;
                    case 64: goto L_0x009f;
                    case 72: goto L_0x0091;
                    case 80: goto L_0x0084;
                    case 88: goto L_0x0078;
                    case 248: goto L_0x005d;
                    case 250: goto L_0x002a;
                    default: goto L_0x0024;
                }     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x0024:
                boolean r5 = r10.parseUnknownField(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x016d
            L_0x002a:
                int r7 = r11.readRawVarint32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.pushLimit(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r8 = r4 & 2048(0x800, float:2.87E-42)
                if (r8 == r5) goto L_0x0045
                int r8 = r11.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                if (r8 <= 0) goto L_0x0045
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.versionRequirement_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r4 = r4 | 2048(0x800, float:2.87E-42)
            L_0x0045:
                int r8 = r11.getBytesUntilLimit()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                if (r8 <= 0) goto L_0x0059
                java.util.List<java.lang.Integer> r8 = r10.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r9 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0045
            L_0x0059:
                r11.popLimit(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x005d:
                r7 = r4 & 2048(0x800, float:2.87E-42)
                if (r7 == r5) goto L_0x006a
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.versionRequirement_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r4 = r4 | 2048(0x800, float:2.87E-42)
            L_0x006a:
                java.util.List<java.lang.Integer> r7 = r10.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r8 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x0078:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | r1
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.flags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x0084:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | 64
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.receiverTypeId_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x0091:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | 16
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.returnTypeId_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x009f:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | 512(0x200, float:7.175E-43)
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.setterFlags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x00ad:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | 256(0x100, float:3.59E-43)
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.getterFlags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x00bb:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r9 = 128(0x80, float:1.794E-43)
                r7 = r7 & r9
                if (r7 != r9) goto L_0x00c8
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = r10.setterValueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder r8 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x00c8:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r11.readMessage(r7, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.setterValueParameter_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                if (r8 == 0) goto L_0x00dd
                r8.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r7)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = r8.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.setterValueParameter_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x00dd:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | r9
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x00e4:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 & r6
                if (r7 != r6) goto L_0x00ef
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r10.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder r8 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x00ef:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r11.readMessage(r7, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.receiverType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                if (r8 == 0) goto L_0x0104
                r8.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r8.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.receiverType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x0104:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | r6
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x010b:
                r7 = r4 & 32
                if (r7 == r6) goto L_0x0118
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.typeParameter_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r4 = r4 | 32
            L_0x0118:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r7 = r10.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r11.readMessage(r8, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x0125:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r9 = 8
                r7 = r7 & r9
                if (r7 != r9) goto L_0x0132
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r10.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder r8 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x0132:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r11.readMessage(r7, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.returnType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                if (r8 == 0) goto L_0x0147
                r8.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7)     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r8.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.returnType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
            L_0x0147:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | r9
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x014e:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | 4
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.name_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x015c:
                int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r7 = r7 | 2
                r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                int r7 = r11.readInt32()     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                r10.oldFlags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0181, IOException -> 0x0172 }
                goto L_0x0016
            L_0x016a:
                r3 = 1
                goto L_0x0016
            L_0x016d:
                if (r5 != 0) goto L_0x0016
                goto L_0x016a
            L_0x0170:
                r11 = move-exception
                goto L_0x0187
            L_0x0172:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0170 }
                java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0170 }
                r12.<init>(r11)     // Catch:{ all -> 0x0170 }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r12.setUnfinishedMessage(r10)     // Catch:{ all -> 0x0170 }
                throw r11     // Catch:{ all -> 0x0170 }
            L_0x0181:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r11.setUnfinishedMessage(r10)     // Catch:{ all -> 0x0170 }
                throw r11     // Catch:{ all -> 0x0170 }
            L_0x0187:
                r12 = r4 & 32
                if (r12 != r6) goto L_0x0193
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = r10.typeParameter_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.typeParameter_ = r12
            L_0x0193:
                r12 = r4 & 2048(0x800, float:2.87E-42)
                if (r12 != r5) goto L_0x019f
                java.util.List<java.lang.Integer> r12 = r10.versionRequirement_
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.versionRequirement_ = r12
            L_0x019f:
                r2.flush()     // Catch:{ IOException -> 0x01a2, all -> 0x01a9 }
            L_0x01a2:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r10.unknownFields = r12
                goto L_0x01b1
            L_0x01a9:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r10.unknownFields = r12
                throw r11
            L_0x01b1:
                r10.makeExtensionsImmutable()
                throw r11
            L_0x01b5:
                r11 = r4 & 32
                if (r11 != r6) goto L_0x01c1
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = r10.typeParameter_
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.typeParameter_ = r11
            L_0x01c1:
                r11 = r4 & 2048(0x800, float:2.87E-42)
                if (r11 != r5) goto L_0x01cd
                java.util.List<java.lang.Integer> r11 = r10.versionRequirement_
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.versionRequirement_ = r11
            L_0x01cd:
                r2.flush()     // Catch:{ IOException -> 0x01d0, all -> 0x01d7 }
            L_0x01d0:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r11 = r0.toByteString()
                r10.unknownFields = r11
                goto L_0x01df
            L_0x01d7:
                r11 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r12 = r0.toByteString()
                r10.unknownFields = r12
                throw r11
            L_0x01df:
                r10.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            Property property = new Property(true);
            defaultInstance = property;
            property.initFields();
        }

        public final Parser<Property> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getOldFlags() {
            return this.oldFlags_;
        }

        public final boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public final int getName() {
            return this.name_;
        }

        public final boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public final Type getReturnType() {
            return this.returnType_;
        }

        public final boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public final int getReturnTypeId() {
            return this.returnTypeId_;
        }

        public final List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public final int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public final TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public final boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public final Type getReceiverType() {
            return this.receiverType_;
        }

        public final boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public final int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public final boolean hasSetterValueParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        public final ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public final boolean hasGetterFlags() {
            return (this.bitField0_ & 256) == 256;
        }

        public final int getGetterFlags() {
            return this.getterFlags_;
        }

        public final boolean hasSetterFlags() {
            return (this.bitField0_ & 512) == 512;
        }

        public final int getSetterFlags() {
            return this.setterFlags_;
        }

        public final List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        private void initFields() {
            this.flags_ = 518;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.setterValueParameter_ = ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasReturnType() || getReturnType().isInitialized()) {
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeInt32(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(11, this.flags_);
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i2).intValue());
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0 : 0;
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                computeInt32Size += CodedOutputStream.computeInt32Size(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeInt32Size(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                computeInt32Size += CodedOutputStream.computeInt32Size(11, this.flags_);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i4).intValue());
            }
            int size = computeInt32Size + i3 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            private int bitField0_;
            private int flags_ = 518;
            private int getterFlags_;
            private int name_;
            private int oldFlags_ = 2054;
            private int receiverTypeId_;
            private Type receiverType_ = Type.getDefaultInstance();
            private int returnTypeId_;
            private Type returnType_ = Type.getDefaultInstance();
            private int setterFlags_;
            private ValueParameter setterValueParameter_ = ValueParameter.getDefaultInstance();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            public final Property build() {
                Property buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Property buildPartial() {
                Property property = new Property((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = property.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = property.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                int unused3 = property.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                Type unused4 = property.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                int unused5 = property.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                List unused6 = property.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                Type unused7 = property.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                int unused8 = property.receiverTypeId_ = this.receiverTypeId_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                ValueParameter unused9 = property.setterValueParameter_ = this.setterValueParameter_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                int unused10 = property.getterFlags_ = this.getterFlags_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                int unused11 = property.setterFlags_ = this.setterFlags_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -2049;
                }
                List unused12 = property.versionRequirement_ = this.versionRequirement_;
                int unused13 = property.bitField0_ = i2;
                return property;
            }

            public final Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = property.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = property.versionRequirement_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(property.versionRequirement_);
                    }
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                if ((!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Property property;
                Property property2 = null;
                try {
                    Property parsePartialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    property = (Property) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    property2 = property;
                }
                if (property2 != null) {
                    mergeFrom(property2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public final Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public final boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public final Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public final boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public final Type getReturnType() {
                return this.returnType_;
            }

            public final Builder mergeReturnType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            public final int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public final TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public final boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public final Type getReceiverType() {
                return this.receiverType_;
            }

            public final Builder mergeReceiverType(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public final Builder setReceiverTypeId(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            public final boolean hasSetterValueParameter() {
                return (this.bitField0_ & 256) == 256;
            }

            public final ValueParameter getSetterValueParameter() {
                return this.setterValueParameter_;
            }

            public final Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.bitField0_ & 256) != 256 || this.setterValueParameter_ == ValueParameter.getDefaultInstance()) {
                    this.setterValueParameter_ = valueParameter;
                } else {
                    this.setterValueParameter_ = ValueParameter.newBuilder(this.setterValueParameter_).mergeFrom(valueParameter).buildPartial();
                }
                this.bitField0_ |= 256;
                return this;
            }

            public final Builder setGetterFlags(int i) {
                this.bitField0_ |= 512;
                this.getterFlags_ = i;
                return this;
            }

            public final Builder setSetterFlags(int i) {
                this.bitField0_ |= 1024;
                this.setterFlags_ = i;
                return this;
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 2048;
                }
            }
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new AbstractParser<ValueParameter>() {
            public final ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final ValueParameter defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public int typeId_;
        /* access modifiers changed from: private */
        public Type type_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public int varargElementTypeId_;
        /* access modifiers changed from: private */
        public Type varargElementType_;

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private ValueParameter(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        public final ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        } else if (readTag != 16) {
                            Type.Builder builder = null;
                            if (readTag == 26) {
                                builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : builder;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.type_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.type_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            } else if (readTag == 34) {
                                builder = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : builder;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.varargElementType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.varargElementType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 16;
                            } else if (readTag == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = codedInputStream.readInt32();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            defaultInstance = valueParameter;
            valueParameter.initFields();
        }

        public final Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getName() {
            return this.name_;
        }

        public final boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public final Type getType() {
            return this.type_;
        }

        public final boolean hasTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public final int getTypeId() {
            return this.typeId_;
        }

        public final boolean hasVarargElementType() {
            return (this.bitField0_ & 16) == 16;
        }

        public final Type getVarargElementType() {
            return this.varargElementType_;
        }

        public final boolean hasVarargElementTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public final int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        private void initFields() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(6, this.varargElementTypeId_);
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeMessageSize(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.computeMessageSize(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.computeInt32Size(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeInt32Size(6, this.varargElementTypeId_);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            private int bitField0_;
            private int flags_;
            private int name_;
            private int typeId_;
            private Type type_ = Type.getDefaultInstance();
            private int varargElementTypeId_;
            private Type varargElementType_ = Type.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            public final ValueParameter build() {
                ValueParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = valueParameter.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = valueParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                Type unused3 = valueParameter.type_ = this.type_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                int unused4 = valueParameter.typeId_ = this.typeId_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                Type unused5 = valueParameter.varargElementType_ = this.varargElementType_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                int unused6 = valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                int unused7 = valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            public final Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    return false;
                }
                if ((!hasVarargElementType() || getVarargElementType().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                ValueParameter valueParameter;
                ValueParameter valueParameter2 = null;
                try {
                    ValueParameter parsePartialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    valueParameter = (ValueParameter) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    valueParameter2 = valueParameter;
                }
                if (valueParameter2 != null) {
                    mergeFrom(valueParameter2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public final boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public final Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public final boolean hasType() {
                return (this.bitField0_ & 4) == 4;
            }

            public final Type getType() {
                return this.type_;
            }

            public final Builder mergeType(Type type) {
                if ((this.bitField0_ & 4) != 4 || this.type_ == Type.getDefaultInstance()) {
                    this.type_ = type;
                } else {
                    this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder setTypeId(int i) {
                this.bitField0_ |= 8;
                this.typeId_ = i;
                return this;
            }

            public final boolean hasVarargElementType() {
                return (this.bitField0_ & 16) == 16;
            }

            public final Type getVarargElementType() {
                return this.varargElementType_;
            }

            public final Builder mergeVarargElementType(Type type) {
                if ((this.bitField0_ & 16) != 16 || this.varargElementType_ == Type.getDefaultInstance()) {
                    this.varargElementType_ = type;
                } else {
                    this.varargElementType_ = Type.newBuilder(this.varargElementType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            public final Builder setVarargElementTypeId(int i) {
                this.bitField0_ |= 32;
                this.varargElementTypeId_ = i;
                return this;
            }
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new AbstractParser<TypeAlias>() {
            public final TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeAlias defaultInstance;
        /* access modifiers changed from: private */
        public List<Annotation> annotation_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int expandedTypeId_;
        /* access modifiers changed from: private */
        public Type expandedType_;
        /* access modifiers changed from: private */
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public List<TypeParameter> typeParameter_;
        /* access modifiers changed from: private */
        public int underlyingTypeId_;
        /* access modifiers changed from: private */
        public Type underlyingType_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public List<Integer> versionRequirement_;

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private TypeAlias(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        public final TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    Type.Builder builder = null;
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 2;
                            this.name_ = codedInputStream.readInt32();
                            break;
                        case 26:
                            if (!(z2 & true)) {
                                this.typeParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            break;
                        case 34:
                            builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : builder;
                            Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.underlyingType_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.underlyingType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 40:
                            this.bitField0_ |= 8;
                            this.underlyingTypeId_ = codedInputStream.readInt32();
                            break;
                        case 50:
                            builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : builder;
                            Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.expandedType_ = type2;
                            if (builder != null) {
                                builder.mergeFrom(type2);
                                this.expandedType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 16;
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.expandedTypeId_ = codedInputStream.readInt32();
                            break;
                        case 66:
                            if (!(z2 & true)) {
                                this.annotation_ = new ArrayList();
                                z2 |= true;
                            }
                            this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            break;
                        case 248:
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            break;
                        case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            break;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (z2 & true) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if (z2 & true) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            defaultInstance = typeAlias;
            typeAlias.initFields();
        }

        public final Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getName() {
            return this.name_;
        }

        public final List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public final int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public final TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public final boolean hasUnderlyingType() {
            return (this.bitField0_ & 4) == 4;
        }

        public final Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public final boolean hasUnderlyingTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public final int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public final boolean hasExpandedType() {
            return (this.bitField0_ & 16) == 16;
        }

        public final Type getExpandedType() {
            return this.expandedType_;
        }

        public final boolean hasExpandedTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public final int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public final List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public final int getAnnotationCount() {
            return this.annotation_.size();
        }

        public final Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public final List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.name_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.underlyingType_ = Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = Collections.emptyList();
            this.versionRequirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasExpandedType() || getExpandedType().isInitialized()) {
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(3, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.expandedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.writeMessage(8, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i3).intValue());
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeInt32Size(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.expandedTypeId_);
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(8, this.annotation_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i5).intValue());
            }
            int size = computeInt32Size + i4 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            private List<Annotation> annotation_ = Collections.emptyList();
            private int bitField0_;
            private int expandedTypeId_;
            private Type expandedType_ = Type.getDefaultInstance();
            private int flags_ = 6;
            private int name_;
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private int underlyingTypeId_;
            private Type underlyingType_ = Type.getDefaultInstance();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            public final TypeAlias build() {
                TypeAlias buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = typeAlias.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = typeAlias.name_ = this.name_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -5;
                }
                List unused3 = typeAlias.typeParameter_ = this.typeParameter_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                Type unused4 = typeAlias.underlyingType_ = this.underlyingType_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                int unused5 = typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                Type unused6 = typeAlias.expandedType_ = this.expandedType_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                int unused7 = typeAlias.expandedTypeId_ = this.expandedTypeId_;
                if ((this.bitField0_ & 128) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -129;
                }
                List unused8 = typeAlias.annotation_ = this.annotation_;
                if ((this.bitField0_ & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -257;
                }
                List unused9 = typeAlias.versionRequirement_ = this.versionRequirement_;
                int unused10 = typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            public final Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = typeAlias.typeParameter_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeAlias.annotation_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = typeAlias.versionRequirement_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(typeAlias.versionRequirement_);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                TypeAlias typeAlias;
                TypeAlias typeAlias2 = null;
                try {
                    TypeAlias parsePartialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeAlias = (TypeAlias) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    typeAlias2 = typeAlias;
                }
                if (typeAlias2 != null) {
                    mergeFrom(typeAlias2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public final boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public final Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 4;
                }
            }

            public final int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public final TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public final boolean hasUnderlyingType() {
                return (this.bitField0_ & 8) == 8;
            }

            public final Type getUnderlyingType() {
                return this.underlyingType_;
            }

            public final Builder mergeUnderlyingType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.underlyingType_ == Type.getDefaultInstance()) {
                    this.underlyingType_ = type;
                } else {
                    this.underlyingType_ = Type.newBuilder(this.underlyingType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setUnderlyingTypeId(int i) {
                this.bitField0_ |= 16;
                this.underlyingTypeId_ = i;
                return this;
            }

            public final boolean hasExpandedType() {
                return (this.bitField0_ & 32) == 32;
            }

            public final Type getExpandedType() {
                return this.expandedType_;
            }

            public final Builder mergeExpandedType(Type type) {
                if ((this.bitField0_ & 32) != 32 || this.expandedType_ == Type.getDefaultInstance()) {
                    this.expandedType_ = type;
                } else {
                    this.expandedType_ = Type.newBuilder(this.expandedType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 32;
                return this;
            }

            public final Builder setExpandedTypeId(int i) {
                this.bitField0_ |= 64;
                this.expandedTypeId_ = i;
                return this;
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 128) != 128) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 128;
                }
            }

            public final int getAnnotationCount() {
                return this.annotation_.size();
            }

            public final Annotation getAnnotation(int i) {
                return this.annotation_.get(i);
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 256;
                }
            }
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new AbstractParser<EnumEntry>() {
            public final EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        };
        private static final EnumEntry defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private EnumEntry(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        public final EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = codedInputStream.readInt32();
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            defaultInstance = enumEntry;
            enumEntry.initFields();
        }

        public final Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getName() {
            return this.name_;
        }

        private void initFields() {
            this.name_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.name_);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            private int bitField0_;
            private int name_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            public final EnumEntry build() {
                EnumEntry buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry((GeneratedMessageLite.ExtendableBuilder) this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                int unused = enumEntry.name_ = this.name_;
                int unused2 = enumEntry.bitField0_ = i;
                return enumEntry;
            }

            public final Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                return extensionsAreInitialized();
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                EnumEntry enumEntry;
                EnumEntry enumEntry2 = null;
                try {
                    EnumEntry parsePartialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    enumEntry = (EnumEntry) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    enumEntry2 = enumEntry;
                }
                if (enumEntry2 != null) {
                    mergeFrom(enumEntry2);
                }
                throw th;
            }

            public final Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new AbstractParser<VersionRequirement>() {
            public final VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        };
        private static final VersionRequirement defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int errorCode_;
        /* access modifiers changed from: private */
        public Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int message_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public int versionFull_;
        /* access modifiers changed from: private */
        public VersionKind versionKind_;
        /* access modifiers changed from: private */
        public int version_;

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private VersionRequirement(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        public final VersionRequirement getDefaultInstanceForType() {
            return defaultInstance;
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            int readEnum = codedInputStream.readEnum();
                            Level valueOf = Level.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = valueOf;
                            }
                        } else if (readTag == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = codedInputStream.readInt32();
                        } else if (readTag == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = codedInputStream.readInt32();
                        } else if (readTag == 48) {
                            int readEnum2 = codedInputStream.readEnum();
                            VersionKind valueOf2 = VersionKind.valueOf(readEnum2);
                            if (valueOf2 == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum2);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = valueOf2;
                            }
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            defaultInstance = versionRequirement;
            versionRequirement.initFields();
        }

        public final Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);
            
            private static Internal.EnumLiteMap<Level> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<Level>() {
                    public final Level findValueByNumber(int i) {
                        return Level.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            private Level(int i, int i2) {
                this.value = i2;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);
            
            private static Internal.EnumLiteMap<VersionKind> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<VersionKind>() {
                    public final VersionKind findValueByNumber(int i) {
                        return VersionKind.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            private VersionKind(int i, int i2) {
                this.value = i2;
            }
        }

        public final boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getVersion() {
            return this.version_;
        }

        public final boolean hasVersionFull() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getVersionFull() {
            return this.versionFull_;
        }

        public final boolean hasLevel() {
            return (this.bitField0_ & 4) == 4;
        }

        public final Level getLevel() {
            return this.level_;
        }

        public final boolean hasErrorCode() {
            return (this.bitField0_ & 8) == 8;
        }

        public final int getErrorCode() {
            return this.errorCode_;
        }

        public final boolean hasMessage() {
            return (this.bitField0_ & 16) == 16;
        }

        public final int getMessage() {
            return this.message_;
        }

        public final boolean hasVersionKind() {
            return (this.bitField0_ & 32) == 32;
        }

        public final VersionKind getVersionKind() {
            return this.versionKind_;
        }

        private void initFields() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeEnum(6, this.versionKind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeEnumSize(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.computeInt32Size(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.computeInt32Size(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeEnumSize(6, this.versionKind_.getNumber());
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
            private int bitField0_;
            private int errorCode_;
            private Level level_ = Level.ERROR;
            private int message_;
            private int versionFull_;
            private VersionKind versionKind_ = VersionKind.LANGUAGE_VERSION;
            private int version_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            public final VersionRequirement build() {
                VersionRequirement buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement((GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = versionRequirement.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = versionRequirement.versionFull_ = this.versionFull_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                Level unused3 = versionRequirement.level_ = this.level_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                int unused4 = versionRequirement.errorCode_ = this.errorCode_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                int unused5 = versionRequirement.message_ = this.message_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                VersionKind unused6 = versionRequirement.versionKind_ = this.versionKind_;
                int unused7 = versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            public final Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.unknownFields));
                return this;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                VersionRequirement versionRequirement;
                VersionRequirement versionRequirement2 = null;
                try {
                    VersionRequirement parsePartialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    versionRequirement = (VersionRequirement) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    versionRequirement2 = versionRequirement;
                }
                if (versionRequirement2 != null) {
                    mergeFrom(versionRequirement2);
                }
                throw th;
            }

            public final Builder setVersion(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                return this;
            }

            public final Builder setVersionFull(int i) {
                this.bitField0_ |= 2;
                this.versionFull_ = i;
                return this;
            }

            public final Builder setLevel(Level level) {
                if (level != null) {
                    this.bitField0_ |= 4;
                    this.level_ = level;
                    return this;
                }
                throw null;
            }

            public final Builder setErrorCode(int i) {
                this.bitField0_ |= 8;
                this.errorCode_ = i;
                return this;
            }

            public final Builder setMessage(int i) {
                this.bitField0_ |= 16;
                this.message_ = i;
                return this;
            }

            public final Builder setVersionKind(VersionKind versionKind) {
                if (versionKind != null) {
                    this.bitField0_ |= 32;
                    this.versionKind_ = versionKind;
                    return this;
                }
                throw null;
            }
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new AbstractParser<VersionRequirementTable>() {
            public final VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<VersionRequirement> requirement_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private VersionRequirementTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        public final VersionRequirementTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.requirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.requirement_.add(codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            defaultInstance = versionRequirementTable;
            versionRequirementTable.initFields();
        }

        public final Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public final List<VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        public final int getRequirementCount() {
            return this.requirement_.size();
        }

        private void initFields() {
            this.requirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.requirement_.size(); i++) {
                codedOutputStream.writeMessage(1, this.requirement_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.requirement_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.requirement_.get(i3));
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
            private int bitField0_;
            private List<VersionRequirement> requirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            public final VersionRequirementTable build() {
                VersionRequirementTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable((GeneratedMessageLite.Builder) this);
                if ((this.bitField0_ & 1) == 1) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    this.bitField0_ &= -2;
                }
                List unused = versionRequirementTable.requirement_ = this.requirement_;
                return versionRequirementTable;
            }

            public final Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.requirement_.isEmpty()) {
                        this.requirement_ = versionRequirementTable.requirement_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequirementIsMutable();
                        this.requirement_.addAll(versionRequirementTable.requirement_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.unknownFields));
                return this;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                VersionRequirementTable versionRequirementTable;
                VersionRequirementTable versionRequirementTable2 = null;
                try {
                    VersionRequirementTable parsePartialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    versionRequirementTable = (VersionRequirementTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    versionRequirementTable2 = versionRequirementTable;
                }
                if (versionRequirementTable2 != null) {
                    mergeFrom(versionRequirementTable2);
                }
                throw th;
            }

            private void ensureRequirementIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.requirement_ = new ArrayList(this.requirement_);
                    this.bitField0_ |= 1;
                }
            }
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new AbstractParser<PackageFragment>() {
            public final PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        };
        private static final PackageFragment defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public List<Class> class__;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public Package package_;
        /* access modifiers changed from: private */
        public QualifiedNameTable qualifiedNames_;
        /* access modifiers changed from: private */
        public StringTable strings_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private PackageFragment(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        public final PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$Builder} */
        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v7 */
        /* JADX WARNING: type inference failed for: r8v8 */
        /* JADX WARNING: type inference failed for: r8v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r9 = this;
                r9.<init>()
                r0 = -1
                r9.memoizedIsInitialized = r0
                r9.memoizedSerializedSize = r0
                r9.initFields()
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString$Output r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 8
                if (r3 != 0) goto L_0x0104
                int r6 = r10.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                if (r6 == 0) goto L_0x00c8
                r7 = 10
                r8 = 0
                if (r6 == r7) goto L_0x00a1
                r7 = 18
                if (r6 == r7) goto L_0x0079
                r7 = 26
                if (r6 == r7) goto L_0x0052
                r7 = 34
                if (r6 == r7) goto L_0x0039
                boolean r5 = r9.parseUnknownField(r10, r2, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                if (r5 != 0) goto L_0x0016
                goto L_0x00c8
            L_0x0039:
                r6 = r4 & 8
                if (r6 == r5) goto L_0x0046
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.class__ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r4 = r4 | 8
            L_0x0046:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r6 = r9.class__     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r10.readMessage(r7, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                goto L_0x0016
            L_0x0052:
                int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r7 = 4
                r6 = r6 & r7
                if (r6 != r7) goto L_0x005e
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = r9.package_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$Builder r8 = r6.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            L_0x005e:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r6 = r10.readMessage(r6, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                if (r8 == 0) goto L_0x0073
                r8.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = r8.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            L_0x0073:
                int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r6 = r6 | r7
                r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                goto L_0x0016
            L_0x0079:
                int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r7 = 2
                r6 = r6 & r7
                if (r6 != r7) goto L_0x0085
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = r9.qualifiedNames_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$Builder r8 = r6.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            L_0x0085:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r6 = r10.readMessage(r6, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                if (r8 == 0) goto L_0x009a
                r8.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = r8.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            L_0x009a:
                int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r6 = r6 | r7
                r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                goto L_0x0016
            L_0x00a1:
                int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r6 = r6 & r1
                if (r6 != r1) goto L_0x00ac
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = r9.strings_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$Builder r8 = r6.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            L_0x00ac:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r6 = r10.readMessage(r6, (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                if (r8 == 0) goto L_0x00c1
                r8.mergeFrom((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = r8.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            L_0x00c1:
                int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                r6 = r6 | r1
                r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
                goto L_0x0016
            L_0x00c8:
                r3 = 1
                goto L_0x0016
            L_0x00cb:
                r10 = move-exception
                goto L_0x00e2
            L_0x00cd:
                r10 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00cb }
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00cb }
                r11.<init>(r10)     // Catch:{ all -> 0x00cb }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = r11.setUnfinishedMessage(r9)     // Catch:{ all -> 0x00cb }
                throw r10     // Catch:{ all -> 0x00cb }
            L_0x00dc:
                r10 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = r10.setUnfinishedMessage(r9)     // Catch:{ all -> 0x00cb }
                throw r10     // Catch:{ all -> 0x00cb }
            L_0x00e2:
                r11 = r4 & 8
                if (r11 != r5) goto L_0x00ee
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r11 = r9.class__
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r9.class__ = r11
            L_0x00ee:
                r2.flush()     // Catch:{ IOException -> 0x00f1, all -> 0x00f8 }
            L_0x00f1:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r11 = r0.toByteString()
                r9.unknownFields = r11
                goto L_0x0100
            L_0x00f8:
                r10 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r11 = r0.toByteString()
                r9.unknownFields = r11
                throw r10
            L_0x0100:
                r9.makeExtensionsImmutable()
                throw r10
            L_0x0104:
                r10 = r4 & 8
                if (r10 != r5) goto L_0x0110
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r10 = r9.class__
                java.util.List r10 = java.util.Collections.unmodifiableList(r10)
                r9.class__ = r10
            L_0x0110:
                r2.flush()     // Catch:{ IOException -> 0x0113, all -> 0x011a }
            L_0x0113:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r10 = r0.toByteString()
                r9.unknownFields = r10
                goto L_0x0122
            L_0x011a:
                r10 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r11 = r0.toByteString()
                r9.unknownFields = r11
                throw r10
            L_0x0122:
                r9.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            defaultInstance = packageFragment;
            packageFragment.initFields();
        }

        public final Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public final boolean hasStrings() {
            return (this.bitField0_ & 1) == 1;
        }

        public final StringTable getStrings() {
            return this.strings_;
        }

        public final boolean hasQualifiedNames() {
            return (this.bitField0_ & 2) == 2;
        }

        public final QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        public final boolean hasPackage() {
            return (this.bitField0_ & 4) == 4;
        }

        public final Package getPackage() {
            return this.package_;
        }

        public final List<Class> getClass_List() {
            return this.class__;
        }

        public final int getClass_Count() {
            return this.class__.size();
        }

        public final Class getClass_(int i) {
            return this.class__.get(i);
        }

        private void initFields() {
            this.strings_ = StringTable.getDefaultInstance();
            this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            this.package_ = Package.getDefaultInstance();
            this.class__ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasPackage() || getPackage().isInitialized()) {
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.package_);
            }
            for (int i = 0; i < this.class__.size(); i++) {
                codedOutputStream.writeMessage(4, this.class__.get(i));
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.strings_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, this.package_);
            }
            for (int i2 = 0; i2 < this.class__.size(); i2++) {
                computeMessageSize += CodedOutputStream.computeMessageSize(4, this.class__.get(i2));
            }
            int extensionsSerializedSize = computeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            private int bitField0_;
            private List<Class> class__ = Collections.emptyList();
            private Package package_ = Package.getDefaultInstance();
            private QualifiedNameTable qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            private StringTable strings_ = StringTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            public final PackageFragment build() {
                PackageFragment buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment((GeneratedMessageLite.ExtendableBuilder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                StringTable unused = packageFragment.strings_ = this.strings_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                QualifiedNameTable unused2 = packageFragment.qualifiedNames_ = this.qualifiedNames_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                Package unused3 = packageFragment.package_ = this.package_;
                if ((this.bitField0_ & 8) == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
                    this.bitField0_ &= -9;
                }
                List unused4 = packageFragment.class__ = this.class__;
                int unused5 = packageFragment.bitField0_ = i2;
                return packageFragment;
            }

            public final Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.class__.isEmpty()) {
                        this.class__ = packageFragment.class__;
                        this.bitField0_ &= -9;
                    } else {
                        ensureClass_IsMutable();
                        this.class__.addAll(packageFragment.class__);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                PackageFragment packageFragment;
                PackageFragment packageFragment2 = null;
                try {
                    PackageFragment parsePartialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    packageFragment = (PackageFragment) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    packageFragment2 = packageFragment;
                }
                if (packageFragment2 != null) {
                    mergeFrom(packageFragment2);
                }
                throw th;
            }

            public final Builder mergeStrings(StringTable stringTable) {
                if ((this.bitField0_ & 1) != 1 || this.strings_ == StringTable.getDefaultInstance()) {
                    this.strings_ = stringTable;
                } else {
                    this.strings_ = StringTable.newBuilder(this.strings_).mergeFrom(stringTable).buildPartial();
                }
                this.bitField0_ |= 1;
                return this;
            }

            public final boolean hasQualifiedNames() {
                return (this.bitField0_ & 2) == 2;
            }

            public final QualifiedNameTable getQualifiedNames() {
                return this.qualifiedNames_;
            }

            public final Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 2) != 2 || this.qualifiedNames_ == QualifiedNameTable.getDefaultInstance()) {
                    this.qualifiedNames_ = qualifiedNameTable;
                } else {
                    this.qualifiedNames_ = QualifiedNameTable.newBuilder(this.qualifiedNames_).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public final boolean hasPackage() {
                return (this.bitField0_ & 4) == 4;
            }

            public final Package getPackage() {
                return this.package_;
            }

            public final Builder mergePackage(Package packageR) {
                if ((this.bitField0_ & 4) != 4 || this.package_ == Package.getDefaultInstance()) {
                    this.package_ = packageR;
                } else {
                    this.package_ = Package.newBuilder(this.package_).mergeFrom(packageR).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            private void ensureClass_IsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.class__ = new ArrayList(this.class__);
                    this.bitField0_ |= 8;
                }
            }

            public final int getClass_Count() {
                return this.class__.size();
            }

            public final Class getClass_(int i) {
                return this.class__.get(i);
            }
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new AbstractParser<Contract>() {
            public final Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Contract defaultInstance;
        /* access modifiers changed from: private */
        public List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Contract(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Contract getDefaultInstance() {
            return defaultInstance;
        }

        public final Contract getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.effect_ = new ArrayList();
                                z2 |= true;
                            }
                            this.effect_.add(codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.effect_ = Collections.unmodifiableList(this.effect_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            Contract contract = new Contract(true);
            defaultInstance = contract;
            contract.initFields();
        }

        public final Parser<Contract> getParserForType() {
            return PARSER;
        }

        public final int getEffectCount() {
            return this.effect_.size();
        }

        public final Effect getEffect(int i) {
            return this.effect_.get(i);
        }

        private void initFields() {
            this.effect_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.effect_.size(); i++) {
                codedOutputStream.writeMessage(1, this.effect_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.effect_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.effect_.get(i3));
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
            private int bitField0_;
            private List<Effect> effect_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            public final Contract build() {
                Contract buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Contract buildPartial() {
                Contract contract = new Contract((GeneratedMessageLite.Builder) this);
                if ((this.bitField0_ & 1) == 1) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
                    this.bitField0_ &= -2;
                }
                List unused = contract.effect_ = this.effect_;
                return contract;
            }

            public final Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.effect_.isEmpty()) {
                        this.effect_ = contract.effect_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEffectIsMutable();
                        this.effect_.addAll(contract.effect_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Contract contract;
                Contract contract2 = null;
                try {
                    Contract parsePartialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    contract = (Contract) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    contract2 = contract;
                }
                if (contract2 != null) {
                    mergeFrom(contract2);
                }
                throw th;
            }

            private void ensureEffectIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.effect_ = new ArrayList(this.effect_);
                    this.bitField0_ |= 1;
                }
            }

            public final int getEffectCount() {
                return this.effect_.size();
            }

            public final Effect getEffect(int i) {
                return this.effect_.get(i);
            }
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new AbstractParser<Effect>() {
            public final Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Effect defaultInstance;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public Expression conclusionOfConditionalEffect_;
        /* access modifiers changed from: private */
        public List<Expression> effectConstructorArgument_;
        /* access modifiers changed from: private */
        public EffectType effectType_;
        /* access modifiers changed from: private */
        public InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Effect(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Effect getDefaultInstance() {
            return defaultInstance;
        }

        public final Effect getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            int readEnum = codedInputStream.readEnum();
                            EffectType valueOf = EffectType.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = valueOf;
                            }
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.effectConstructorArgument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.effectConstructorArgument_.add(codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                        } else if (readTag == 26) {
                            Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                            Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                            this.conclusionOfConditionalEffect_ = expression;
                            if (builder != null) {
                                builder.mergeFrom(expression);
                                this.conclusionOfConditionalEffect_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 2;
                        } else if (readTag == 32) {
                            int readEnum2 = codedInputStream.readEnum();
                            InvocationKind valueOf2 = InvocationKind.valueOf(readEnum2);
                            if (valueOf2 == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum2);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = valueOf2;
                            }
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            Effect effect = new Effect(true);
            defaultInstance = effect;
            effect.initFields();
        }

        public final Parser<Effect> getParserForType() {
            return PARSER;
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);
            
            private static Internal.EnumLiteMap<EffectType> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<EffectType>() {
                    public final EffectType findValueByNumber(int i) {
                        return EffectType.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            private EffectType(int i, int i2) {
                this.value = i2;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);
            
            private static Internal.EnumLiteMap<InvocationKind> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<InvocationKind>() {
                    public final InvocationKind findValueByNumber(int i) {
                        return InvocationKind.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            private InvocationKind(int i, int i2) {
                this.value = i2;
            }
        }

        public final boolean hasEffectType() {
            return (this.bitField0_ & 1) == 1;
        }

        public final EffectType getEffectType() {
            return this.effectType_;
        }

        public final int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        public final Expression getEffectConstructorArgument(int i) {
            return this.effectConstructorArgument_.get(i);
        }

        public final boolean hasConclusionOfConditionalEffect() {
            return (this.bitField0_ & 2) == 2;
        }

        public final Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        public final boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        public final InvocationKind getKind() {
            return this.kind_;
        }

        private void initFields() {
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.emptyList();
            this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(4, this.kind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.effectType_.getNumber()) + 0 : 0;
            for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, this.effectConstructorArgument_.get(i2));
            }
            if ((this.bitField0_ & 2) == 2) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeEnumSize += CodedOutputStream.computeEnumSize(4, this.kind_.getNumber());
            }
            int size = computeEnumSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
            private int bitField0_;
            private Expression conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            private List<Expression> effectConstructorArgument_ = Collections.emptyList();
            private EffectType effectType_ = EffectType.RETURNS_CONSTANT;
            private InvocationKind kind_ = InvocationKind.AT_MOST_ONCE;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            public final Effect build() {
                Effect buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Effect buildPartial() {
                Effect effect = new Effect((GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                EffectType unused = effect.effectType_ = this.effectType_;
                if ((this.bitField0_ & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    this.bitField0_ &= -3;
                }
                List unused2 = effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                Expression unused3 = effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                InvocationKind unused4 = effect.kind_ = this.kind_;
                int unused5 = effect.bitField0_ = i2;
                return effect;
            }

            public final Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.effectConstructorArgument_.isEmpty()) {
                        this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEffectConstructorArgumentIsMutable();
                        this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                    return true;
                }
                return false;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Effect effect;
                Effect effect2 = null;
                try {
                    Effect parsePartialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    effect = (Effect) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    effect2 = effect;
                }
                if (effect2 != null) {
                    mergeFrom(effect2);
                }
                throw th;
            }

            public final Builder setEffectType(EffectType effectType) {
                if (effectType != null) {
                    this.bitField0_ |= 1;
                    this.effectType_ = effectType;
                    return this;
                }
                throw null;
            }

            private void ensureEffectConstructorArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
                    this.bitField0_ |= 2;
                }
            }

            public final int getEffectConstructorArgumentCount() {
                return this.effectConstructorArgument_.size();
            }

            public final Expression getEffectConstructorArgument(int i) {
                return this.effectConstructorArgument_.get(i);
            }

            public final boolean hasConclusionOfConditionalEffect() {
                return (this.bitField0_ & 4) == 4;
            }

            public final Expression getConclusionOfConditionalEffect() {
                return this.conclusionOfConditionalEffect_;
            }

            public final Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.bitField0_ & 4) != 4 || this.conclusionOfConditionalEffect_ == Expression.getDefaultInstance()) {
                    this.conclusionOfConditionalEffect_ = expression;
                } else {
                    this.conclusionOfConditionalEffect_ = Expression.newBuilder(this.conclusionOfConditionalEffect_).mergeFrom(expression).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder setKind(InvocationKind invocationKind) {
                if (invocationKind != null) {
                    this.bitField0_ |= 8;
                    this.kind_ = invocationKind;
                    return this;
                }
                throw null;
            }
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new AbstractParser<Expression>() {
            public final Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Expression defaultInstance;
        /* access modifiers changed from: private */
        public List<Expression> andArgument_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public ConstantValue constantValue_;
        /* access modifiers changed from: private */
        public int flags_;
        /* access modifiers changed from: private */
        public int isInstanceTypeId_;
        /* access modifiers changed from: private */
        public Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Expression> orArgument_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;
        /* access modifiers changed from: private */
        public int valueParameterReference_;

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Expression(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Expression getDefaultInstance() {
            return defaultInstance;
        }

        public final Expression getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            int readEnum = codedInputStream.readEnum();
                            ConstantValue valueOf = ConstantValue.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = valueOf;
                            }
                        } else if (readTag == 34) {
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                            Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.isInstanceType_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.isInstanceType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                        } else if (readTag == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = codedInputStream.readInt32();
                        } else if (readTag == 50) {
                            if (!(z2 & true)) {
                                this.andArgument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.andArgument_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                        } else if (readTag == 58) {
                            if (!(z2 & true)) {
                                this.orArgument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.orArgument_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    }
                    if (z2 & true) {
                        this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if (z2 & true) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            Expression expression = new Expression(true);
            defaultInstance = expression;
            expression.initFields();
        }

        public final Parser<Expression> getParserForType() {
            return PARSER;
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);
            
            private static Internal.EnumLiteMap<ConstantValue> internalValueMap;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<ConstantValue>() {
                    public final ConstantValue findValueByNumber(int i) {
                        return ConstantValue.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            private ConstantValue(int i, int i2) {
                this.value = i2;
            }
        }

        public final boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public final int getFlags() {
            return this.flags_;
        }

        public final boolean hasValueParameterReference() {
            return (this.bitField0_ & 2) == 2;
        }

        public final int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public final boolean hasConstantValue() {
            return (this.bitField0_ & 4) == 4;
        }

        public final ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        public final boolean hasIsInstanceType() {
            return (this.bitField0_ & 8) == 8;
        }

        public final Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public final boolean hasIsInstanceTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public final int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        public final int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public final Expression getAndArgument(int i) {
            return this.andArgument_.get(i);
        }

        public final int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        public final Expression getOrArgument(int i) {
            return this.orArgument_.get(i);
        }

        private void initFields() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            this.andArgument_ = Collections.emptyList();
            this.orArgument_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasIsInstanceType() || getIsInstanceType().isInitialized()) {
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.writeMessage(6, this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.writeMessage(7, this.orArgument_.get(i2));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeEnumSize(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(5, this.isInstanceTypeId_);
            }
            for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, this.andArgument_.get(i2));
            }
            for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(7, this.orArgument_.get(i3));
            }
            int size = computeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
            private List<Expression> andArgument_ = Collections.emptyList();
            private int bitField0_;
            private ConstantValue constantValue_ = ConstantValue.TRUE;
            private int flags_;
            private int isInstanceTypeId_;
            private Type isInstanceType_ = Type.getDefaultInstance();
            private List<Expression> orArgument_ = Collections.emptyList();
            private int valueParameterReference_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            public final Expression build() {
                Expression buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Expression buildPartial() {
                Expression expression = new Expression((GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = expression.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = expression.valueParameterReference_ = this.valueParameterReference_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                ConstantValue unused3 = expression.constantValue_ = this.constantValue_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                Type unused4 = expression.isInstanceType_ = this.isInstanceType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                int unused5 = expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    this.bitField0_ &= -33;
                }
                List unused6 = expression.andArgument_ = this.andArgument_;
                if ((this.bitField0_ & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    this.bitField0_ &= -65;
                }
                List unused7 = expression.orArgument_ = this.orArgument_;
                int unused8 = expression.bitField0_ = i2;
                return expression;
            }

            public final Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.andArgument_.isEmpty()) {
                        this.andArgument_ = expression.andArgument_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureAndArgumentIsMutable();
                        this.andArgument_.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.orArgument_.isEmpty()) {
                        this.orArgument_ = expression.orArgument_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureOrArgumentIsMutable();
                        this.orArgument_.addAll(expression.orArgument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Expression expression;
                Expression expression2 = null;
                try {
                    Expression parsePartialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    expression = (Expression) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    expression2 = expression;
                }
                if (expression2 != null) {
                    mergeFrom(expression2);
                }
                throw th;
            }

            public final Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public final Builder setValueParameterReference(int i) {
                this.bitField0_ |= 2;
                this.valueParameterReference_ = i;
                return this;
            }

            public final Builder setConstantValue(ConstantValue constantValue) {
                if (constantValue != null) {
                    this.bitField0_ |= 4;
                    this.constantValue_ = constantValue;
                    return this;
                }
                throw null;
            }

            public final boolean hasIsInstanceType() {
                return (this.bitField0_ & 8) == 8;
            }

            public final Type getIsInstanceType() {
                return this.isInstanceType_;
            }

            public final Builder mergeIsInstanceType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.isInstanceType_ == Type.getDefaultInstance()) {
                    this.isInstanceType_ = type;
                } else {
                    this.isInstanceType_ = Type.newBuilder(this.isInstanceType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setIsInstanceTypeId(int i) {
                this.bitField0_ |= 16;
                this.isInstanceTypeId_ = i;
                return this;
            }

            private void ensureAndArgumentIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.andArgument_ = new ArrayList(this.andArgument_);
                    this.bitField0_ |= 32;
                }
            }

            public final int getAndArgumentCount() {
                return this.andArgument_.size();
            }

            public final Expression getAndArgument(int i) {
                return this.andArgument_.get(i);
            }

            private void ensureOrArgumentIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.orArgument_ = new ArrayList(this.orArgument_);
                    this.bitField0_ |= 64;
                }
            }

            public final int getOrArgumentCount() {
                return this.orArgument_.size();
            }

            public final Expression getOrArgument(int i) {
                return this.orArgument_.get(i);
            }
        }
    }
}
