package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean isFallback;

    public /* synthetic */ BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z);
    }

    private BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, (DeserializedContainerSource) null);
        this.isFallback = z;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
            kotlin.io.CloseableKt.closeFinally(r14, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
            throw r12;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.StorageManager r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r13, @org.jetbrains.annotations.NotNull java.io.InputStream r14, boolean r15) {
            /*
                r10 = this;
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "storageManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "module"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "inputStream"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.io.Closeable r14 = (java.io.Closeable) r14
                r0 = r14
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x006f }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion$Companion r1 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion     // Catch:{ all -> 0x006f }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion r7 = r1.readFrom(r0)     // Catch:{ all -> 0x006f }
                r1 = 0
                if (r7 == 0) goto L_0x0069
                boolean r2 = r7.isCompatible()     // Catch:{ all -> 0x006f }
                if (r2 == 0) goto L_0x0046
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE     // Catch:{ all -> 0x006f }
                kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r2 = r2.getExtensionRegistry()     // Catch:{ all -> 0x006f }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.parseFrom(r0, r2)     // Catch:{ all -> 0x006f }
                kotlin.io.CloseableKt.closeFinally(r14, r1)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
                r9 = 0
                r2 = r14
                r3 = r11
                r4 = r12
                r5 = r13
                r8 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r14
            L_0x0046:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x006f }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
                java.lang.String r13 = "Kotlin built-in definition format version is not supported: expected "
                r12.<init>(r13)     // Catch:{ all -> 0x006f }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion r13 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.INSTANCE     // Catch:{ all -> 0x006f }
                r12.append(r13)     // Catch:{ all -> 0x006f }
                java.lang.String r13 = ", actual "
                r12.append(r13)     // Catch:{ all -> 0x006f }
                r12.append(r7)     // Catch:{ all -> 0x006f }
                java.lang.String r13 = ". Please update Kotlin"
                r12.append(r13)     // Catch:{ all -> 0x006f }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x006f }
                r11.<init>(r12)     // Catch:{ all -> 0x006f }
                throw r11     // Catch:{ all -> 0x006f }
            L_0x0069:
                java.lang.String r11 = "version"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)     // Catch:{ all -> 0x006f }
                throw r1     // Catch:{ all -> 0x006f }
            L_0x006f:
                r11 = move-exception
                throw r11     // Catch:{ all -> 0x0071 }
            L_0x0071:
                r12 = move-exception
                kotlin.io.CloseableKt.closeFinally(r14, r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, java.io.InputStream, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl");
        }
    }
}
