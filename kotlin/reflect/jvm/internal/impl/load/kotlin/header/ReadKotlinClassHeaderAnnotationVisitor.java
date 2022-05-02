package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {
    private static final Map<ClassId, KotlinClassHeader.Kind> HEADER_KINDS;
    private static final boolean IGNORE_OLD_METADATA = SummaryActivity.CHECKED.equals(System.getProperty("kotlin.ignore.old.metadata"));
    /* access modifiers changed from: private */
    public JvmBytecodeBinaryVersion bytecodeVersion = null;
    /* access modifiers changed from: private */
    public String[] data = null;
    /* access modifiers changed from: private */
    public int extraInt = 0;
    /* access modifiers changed from: private */
    public String extraString = null;
    /* access modifiers changed from: private */
    public KotlinClassHeader.Kind headerKind = null;
    private String[] incompatibleData = null;
    /* access modifiers changed from: private */
    public int[] metadataVersionArray = null;
    /* access modifiers changed from: private */
    public String packageName = null;
    /* access modifiers changed from: private */
    public String[] strings = null;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void visitEnd() {
    }

    static {
        HashMap hashMap = new HashMap();
        HEADER_KINDS = hashMap;
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    @Nullable
    public KotlinClassHeader createHeader() {
        if (this.headerKind == null || this.metadataVersionArray == null) {
            return null;
        }
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(this.metadataVersionArray, (this.extraInt & 8) != 0);
        if (!jvmMetadataVersion.isCompatible()) {
            this.incompatibleData = this.data;
            this.data = null;
        } else if (shouldHaveData() && this.data == null) {
            return null;
        }
        KotlinClassHeader.Kind kind = this.headerKind;
        JvmBytecodeBinaryVersion jvmBytecodeBinaryVersion = this.bytecodeVersion;
        if (jvmBytecodeBinaryVersion == null) {
            jvmBytecodeBinaryVersion = JvmBytecodeBinaryVersion.INSTANCE;
        }
        return new KotlinClassHeader(kind, jvmMetadataVersion, jvmBytecodeBinaryVersion, this.data, this.incompatibleData, this.strings, this.extraString, this.extraInt, this.packageName);
    }

    private boolean shouldHaveData() {
        return this.headerKind == KotlinClassHeader.Kind.CLASS || this.headerKind == KotlinClassHeader.Kind.FILE_FACADE || this.headerKind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            $$$reportNull$$$0(0);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(1);
        }
        if (classId.asSingleFqName().equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new KotlinMetadataArgumentVisitor();
        }
        if (IGNORE_OLD_METADATA || this.headerKind != null || (kind = HEADER_KINDS.get(classId)) == null) {
            return null;
        }
        this.headerKind = kind;
        return new OldDeprecatedAnnotationArgumentVisitor();
    }

    class KotlinMetadataArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull Name name, @NotNull ClassId classId) {
            if (name == null) {
                $$$reportNull$$$0(6);
            }
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(7);
            return null;
        }

        public void visitClassLiteral(@NotNull Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (name == null) {
                $$$reportNull$$$0(0);
            }
            if (classLiteralValue == null) {
                $$$reportNull$$$0(1);
            }
        }

        public void visitEnd() {
        }

        public void visitEnum(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (name == null) {
                $$$reportNull$$$0(3);
            }
            if (classId == null) {
                $$$reportNull$$$0(4);
            }
            if (name2 == null) {
                $$$reportNull$$$0(5);
            }
        }

        private KotlinMetadataArgumentVisitor() {
        }

        public void visit(@Nullable Name name, @Nullable Object obj) {
            if (name != null) {
                String asString = name.asString();
                if ("k".equals(asString)) {
                    if (obj instanceof Integer) {
                        KotlinClassHeader.Kind unused = ReadKotlinClassHeaderAnnotationVisitor.this.headerKind = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(asString)) {
                    if (obj instanceof int[]) {
                        int[] unused2 = ReadKotlinClassHeaderAnnotationVisitor.this.metadataVersionArray = (int[]) obj;
                    }
                } else if ("bv".equals(asString)) {
                    if (obj instanceof int[]) {
                        JvmBytecodeBinaryVersion unused3 = ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion = new JvmBytecodeBinaryVersion((int[]) obj);
                    }
                } else if ("xs".equals(asString)) {
                    if (obj instanceof String) {
                        String unused4 = ReadKotlinClassHeaderAnnotationVisitor.this.extraString = (String) obj;
                    }
                } else if ("xi".equals(asString)) {
                    if (obj instanceof Integer) {
                        int unused5 = ReadKotlinClassHeaderAnnotationVisitor.this.extraInt = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(asString) && (obj instanceof String)) {
                    String unused6 = ReadKotlinClassHeaderAnnotationVisitor.this.packageName = (String) obj;
                }
            }
        }

        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@NotNull Name name) {
            if (name == null) {
                $$$reportNull$$$0(2);
            }
            String asString = name.asString();
            if ("d1".equals(asString)) {
                return dataArrayVisitor();
            }
            if ("d2".equals(asString)) {
                return stringsArrayVisitor();
            }
            return null;
        }

        @NotNull
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor dataArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
                }

                /* access modifiers changed from: protected */
                public void visitEnd(@NotNull String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    String[] unused = ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
                }
            };
        }

        @NotNull
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor stringsArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
                }

                /* access modifiers changed from: protected */
                public void visitEnd(@NotNull String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    String[] unused = ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
                }
            };
        }
    }

    class OldDeprecatedAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull Name name, @NotNull ClassId classId) {
            if (name == null) {
                $$$reportNull$$$0(6);
            }
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(7);
            return null;
        }

        public void visitClassLiteral(@NotNull Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (name == null) {
                $$$reportNull$$$0(0);
            }
            if (classLiteralValue == null) {
                $$$reportNull$$$0(1);
            }
        }

        public void visitEnd() {
        }

        public void visitEnum(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (name == null) {
                $$$reportNull$$$0(3);
            }
            if (classId == null) {
                $$$reportNull$$$0(4);
            }
            if (name2 == null) {
                $$$reportNull$$$0(5);
            }
        }

        private OldDeprecatedAnnotationArgumentVisitor() {
        }

        public void visit(@Nullable Name name, @Nullable Object obj) {
            if (name != null) {
                String asString = name.asString();
                if ("version".equals(asString)) {
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int[] unused = ReadKotlinClassHeaderAnnotationVisitor.this.metadataVersionArray = iArr;
                        if (ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion == null) {
                            JvmBytecodeBinaryVersion unused2 = ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion = new JvmBytecodeBinaryVersion(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(asString)) {
                    String unused3 = ReadKotlinClassHeaderAnnotationVisitor.this.extraString = obj instanceof String ? (String) obj : null;
                }
            }
        }

        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@NotNull Name name) {
            if (name == null) {
                $$$reportNull$$$0(2);
            }
            String asString = name.asString();
            if ("data".equals(asString) || "filePartClassNames".equals(asString)) {
                return dataArrayVisitor();
            }
            if ("strings".equals(asString)) {
                return stringsArrayVisitor();
            }
            return null;
        }

        @NotNull
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor dataArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
                }

                /* access modifiers changed from: protected */
                public void visitEnd(@NotNull String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    String[] unused = ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
                }
            };
        }

        @NotNull
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor stringsArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
                }

                /* access modifiers changed from: protected */
                public void visitEnd(@NotNull String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    String[] unused = ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
                }
            };
        }
    }

    static abstract class CollectStringArrayAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
        private final List<String> strings = new ArrayList();

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i != 2) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classLiteralValue";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i != 2) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void visitClassLiteral(@NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                $$$reportNull$$$0(2);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void visitEnd(@NotNull String[] strArr);

        public void visitEnum(@NotNull ClassId classId, @NotNull Name name) {
            if (classId == null) {
                $$$reportNull$$$0(0);
            }
            if (name == null) {
                $$$reportNull$$$0(1);
            }
        }

        public void visit(@Nullable Object obj) {
            if (obj instanceof String) {
                this.strings.add((String) obj);
            }
        }

        public void visitEnd() {
            visitEnd((String[]) this.strings.toArray(new String[0]));
        }
    }
}
