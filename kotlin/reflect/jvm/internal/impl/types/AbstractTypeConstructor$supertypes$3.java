package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import org.jetbrains.annotations.NotNull;

final class AbstractTypeConstructor$supertypes$3 extends Lambda implements Function1<AbstractTypeConstructor.Supertypes, Unit> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractTypeConstructor.Supertypes) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull AbstractTypeConstructor.Supertypes supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        Collection<KotlinType> findLoopsInSupertypesAndDisconnect = this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, supertypes.getAllSupertypes(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this.this$0), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this.this$0));
        List list = null;
        if (findLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType defaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
            List listOf = defaultSupertypeIfEmpty == null ? null : CollectionsKt.listOf(defaultSupertypeIfEmpty);
            if (listOf == null) {
                listOf = CollectionsKt.emptyList();
            }
            findLoopsInSupertypesAndDisconnect = listOf;
        }
        if (this.this$0.getShouldReportCyclicScopeWithCompanionWarning()) {
            final AbstractTypeConstructor abstractTypeConstructor = this.this$0;
            final AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
            this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, findLoopsInSupertypesAndDisconnect, new Function1<TypeConstructor, Iterable<? extends KotlinType>>() {
                @NotNull
                public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
                    Intrinsics.checkNotNullParameter(typeConstructor, "it");
                    return abstractTypeConstructor.computeNeighbours(typeConstructor, true);
                }
            }, new Function1<KotlinType, Unit>() {
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((KotlinType) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull KotlinType kotlinType) {
                    Intrinsics.checkNotNullParameter(kotlinType, "it");
                    abstractTypeConstructor2.reportScopesLoopError(kotlinType);
                }
            });
        }
        AbstractTypeConstructor abstractTypeConstructor3 = this.this$0;
        if (findLoopsInSupertypesAndDisconnect instanceof List) {
            list = (List) findLoopsInSupertypesAndDisconnect;
        }
        if (list == null) {
            list = CollectionsKt.toList(findLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(abstractTypeConstructor3.processSupertypesWithoutCycles(list));
    }
}
