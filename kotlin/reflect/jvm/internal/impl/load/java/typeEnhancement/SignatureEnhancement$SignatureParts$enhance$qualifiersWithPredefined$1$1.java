package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1 extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
    final /* synthetic */ TypeEnhancementInfo $predefined;
    final /* synthetic */ Function1<Integer, JavaTypeQualifiers> $qualifiers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1(TypeEnhancementInfo typeEnhancementInfo, Function1<? super Integer, JavaTypeQualifiers> function1) {
        super(1);
        this.$predefined = typeEnhancementInfo;
        this.$qualifiers = function1;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final JavaTypeQualifiers invoke(int i) {
        JavaTypeQualifiers javaTypeQualifiers = this.$predefined.getMap().get(Integer.valueOf(i));
        return javaTypeQualifiers == null ? this.$qualifiers.invoke(Integer.valueOf(i)) : javaTypeQualifiers;
    }
}
