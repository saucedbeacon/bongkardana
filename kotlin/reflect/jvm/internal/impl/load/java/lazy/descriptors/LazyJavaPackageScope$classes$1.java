package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class LazyJavaPackageScope$classes$1 extends Lambda implements Function1<LazyJavaPackageScope.FindClassRequest, ClassDescriptor> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaPackageScope;
        this.$c = lazyJavaResolverContext;
    }

    @Nullable
    public final ClassDescriptor invoke(@NotNull LazyJavaPackageScope.FindClassRequest findClassRequest) {
        KotlinClassFinder.Result result;
        KotlinJvmBinaryClass kotlinJvmBinaryClass;
        ClassId classId;
        LightClassOriginKind lightClassOriginKind;
        FqName fqName;
        byte[] bArr;
        Intrinsics.checkNotNullParameter(findClassRequest, RequestPermissionsEvent.REQUEST);
        ClassId classId2 = new ClassId(this.this$0.getOwnerDescriptor().getFqName(), findClassRequest.getName());
        if (findClassRequest.getJavaClass() != null) {
            result = this.$c.getComponents().getKotlinClassFinder().findKotlinClassOrContent(findClassRequest.getJavaClass());
        } else {
            result = this.$c.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId2);
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
        if (result == null) {
            kotlinJvmBinaryClass = null;
        } else {
            kotlinJvmBinaryClass = result.toKotlinJvmBinaryClass();
        }
        if (kotlinJvmBinaryClass == null) {
            classId = null;
        } else {
            classId = kotlinJvmBinaryClass.getClassId();
        }
        if (classId != null && (classId.isNestedClass() || classId.isLocal())) {
            return null;
        }
        LazyJavaPackageScope.KotlinClassLookupResult access$resolveKotlinBinaryClass = this.this$0.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
        if (access$resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
            return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) access$resolveKotlinBinaryClass).getDescriptor();
        }
        if (access$resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (access$resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound) {
            JavaClass javaClass = findClassRequest.getJavaClass();
            if (javaClass == null) {
                JavaClassFinder finder = this.$c.getComponents().getFinder();
                if (result != null) {
                    if (!(result instanceof KotlinClassFinder.Result.ClassFileContent)) {
                        result = null;
                    }
                    KotlinClassFinder.Result.ClassFileContent classFileContent = (KotlinClassFinder.Result.ClassFileContent) result;
                    if (classFileContent != null) {
                        bArr = classFileContent.getContent();
                        javaClass = finder.findClass(new JavaClassFinder.Request(classId2, bArr, (JavaClass) null, 4, (DefaultConstructorMarker) null));
                    }
                }
                bArr = null;
                javaClass = finder.findClass(new JavaClassFinder.Request(classId2, bArr, (JavaClass) null, 4, (DefaultConstructorMarker) null));
            }
            JavaClass javaClass2 = javaClass;
            if (javaClass2 == null) {
                lightClassOriginKind = null;
            } else {
                lightClassOriginKind = javaClass2.getLightClassOriginKind();
            }
            if (lightClassOriginKind != LightClassOriginKind.BINARY) {
                if (javaClass2 == null) {
                    fqName = null;
                } else {
                    fqName = javaClass2.getFqName();
                }
                if (fqName != null && !fqName.isRoot() && Intrinsics.areEqual((Object) fqName.parent(), (Object) this.this$0.getOwnerDescriptor().getFqName())) {
                    lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.$c, this.this$0.getOwnerDescriptor(), javaClass2, (ClassDescriptor) null, 8, (DefaultConstructorMarker) null);
                    this.$c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                }
                return lazyJavaClassDescriptor;
            }
            StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
            sb.append(javaClass2);
            sb.append("\nClassId: ");
            sb.append(classId2);
            sb.append("\nfindKotlinClass(JavaClass) = ");
            sb.append(KotlinClassFinderKt.findKotlinClass(this.$c.getComponents().getKotlinClassFinder(), javaClass2));
            sb.append("\nfindKotlinClass(ClassId) = ");
            sb.append(KotlinClassFinderKt.findKotlinClass(this.$c.getComponents().getKotlinClassFinder(), classId2));
            sb.append(10);
            throw new IllegalStateException(sb.toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
