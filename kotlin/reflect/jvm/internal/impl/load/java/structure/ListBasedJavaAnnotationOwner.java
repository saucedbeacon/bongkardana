package kotlin.reflect.jvm.internal.impl.load.java.structure;

public interface ListBasedJavaAnnotationOwner extends JavaAnnotationOwner {

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.reflect.jvm.internal.impl.name.FqName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlin.reflect.jvm.internal.impl.name.FqName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.reflect.jvm.internal.impl.name.FqName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.reflect.jvm.internal.impl.name.FqName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.reflect.jvm.internal.impl.name.FqName} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.structure.ListBasedJavaAnnotationOwner r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r4) {
            /*
                java.lang.String r0 = "this"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.Collection r3 = r3.getAnnotations()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x0014:
                boolean r0 = r3.hasNext()
                r1 = 0
                if (r0 == 0) goto L_0x0034
                java.lang.Object r0 = r3.next()
                r2 = r0
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation r2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation) r2
                kotlin.reflect.jvm.internal.impl.name.ClassId r2 = r2.getClassId()
                if (r2 != 0) goto L_0x0029
                goto L_0x002d
            L_0x0029:
                kotlin.reflect.jvm.internal.impl.name.FqName r1 = r2.asSingleFqName()
            L_0x002d:
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
                if (r1 == 0) goto L_0x0014
                r1 = r0
            L_0x0034:
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.structure.ListBasedJavaAnnotationOwner.DefaultImpls.findAnnotation(kotlin.reflect.jvm.internal.impl.load.java.structure.ListBasedJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.name.FqName):kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation");
        }
    }
}
