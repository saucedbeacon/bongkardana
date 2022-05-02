package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.jetbrains.annotations.NotNull;

public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {
    @NotNull
    private final Name name;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorImpl(@NotNull Annotations annotations, @NotNull Name name2) {
        super(annotations);
        if (annotations == null) {
            $$$reportNull$$$0(0);
        }
        if (name2 == null) {
            $$$reportNull$$$0(1);
        }
        this.name = name2;
    }

    @NotNull
    public Name getName() {
        Name name2 = this.name;
        if (name2 == null) {
            $$$reportNull$$$0(2);
        }
        return name2;
    }

    public String toString() {
        return toString(this);
    }

    @NotNull
    public static String toString(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(DescriptorRenderer.DEBUG_TEXT.render(declarationDescriptor));
            sb.append("[");
            sb.append(declarationDescriptor.getClass().getSimpleName());
            sb.append(AUScreenAdaptTool.PREFIX_ID);
            sb.append(Integer.toHexString(System.identityHashCode(declarationDescriptor)));
            sb.append("]");
            String obj = sb.toString();
            if (obj == null) {
                $$$reportNull$$$0(5);
            }
            return obj;
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(declarationDescriptor.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(declarationDescriptor.getName());
            String obj2 = sb2.toString();
            if (obj2 == null) {
                $$$reportNull$$$0(6);
            }
            return obj2;
        }
    }
}
