package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectKotlinClassFinder implements KotlinClassFinder {
    @NotNull
    private final BuiltInsResourceLoader builtInsResourceLoader = new BuiltInsResourceLoader();
    @NotNull
    private final ClassLoader classLoader;

    public ReflectKotlinClassFinder(@NotNull ClassLoader classLoader2) {
        Intrinsics.checkNotNullParameter(classLoader2, "classLoader");
        this.classLoader = classLoader2;
    }

    private final KotlinClassFinder.Result findKotlinClass(String str) {
        ReflectKotlinClass create;
        Class<?> tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, str);
        KotlinClassFinder.Result.KotlinClass kotlinClass = null;
        if (!(tryLoadClass == null || (create = ReflectKotlinClass.Factory.create(tryLoadClass)) == null)) {
            kotlinClass = new KotlinClassFinder.Result.KotlinClass(create, (byte[]) null, 2, (DefaultConstructorMarker) null);
        }
        return kotlinClass;
    }

    @Nullable
    public final KotlinClassFinder.Result findKotlinClassOrContent(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return findKotlinClass(ReflectKotlinClassFinderKt.toRuntimeFqName(classId));
    }

    @Nullable
    public final KotlinClassFinder.Result findKotlinClassOrContent(@NotNull JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        FqName fqName = javaClass.getFqName();
        String asString = fqName == null ? null : fqName.asString();
        if (asString == null) {
            return null;
        }
        return findKotlinClass(asString);
    }

    @Nullable
    public final InputStream findBuiltInsData(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "packageFqName");
        if (!fqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.builtInsResourceLoader.loadResource(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
    }
}
