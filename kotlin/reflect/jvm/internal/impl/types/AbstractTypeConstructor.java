package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractTypeConstructor implements TypeConstructor {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;
    @NotNull
    private final NotNullLazyValue<Supertypes> supertypes;

    /* access modifiers changed from: protected */
    @NotNull
    public abstract Collection<KotlinType> computeSupertypes();

    /* access modifiers changed from: protected */
    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public abstract ClassifierDescriptor getDeclarationDescriptor();

    /* access modifiers changed from: protected */
    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    /* access modifiers changed from: protected */
    @NotNull
    public List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> list) {
        Intrinsics.checkNotNullParameter(list, "supertypes");
        return list;
    }

    /* access modifiers changed from: protected */
    public void reportScopesLoopError(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
    }

    /* access modifiers changed from: protected */
    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.supertypes = storageManager.createLazyValueWithPostCompute(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.INSTANCE, new AbstractTypeConstructor$supertypes$3(this));
    }

    @NotNull
    public List<KotlinType> getSupertypes() {
        return ((Supertypes) this.supertypes.invoke()).getSupertypesWithoutCycles();
    }

    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    final class ModuleViewTypeConstructor implements TypeConstructor {
        /* access modifiers changed from: private */
        @NotNull
        public final KotlinTypeRefiner kotlinTypeRefiner;
        @NotNull
        private final Lazy refinedSupertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2(this, this.this$0));
        final /* synthetic */ AbstractTypeConstructor this$0;

        public ModuleViewTypeConstructor(@NotNull AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner2) {
            Intrinsics.checkNotNullParameter(abstractTypeConstructor, "this$0");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner2, "kotlinTypeRefiner");
            this.this$0 = abstractTypeConstructor;
            this.kotlinTypeRefiner = kotlinTypeRefiner2;
        }

        private final List<KotlinType> getRefinedSupertypes() {
            return (List) this.refinedSupertypes$delegate.getValue();
        }

        @NotNull
        public final List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.this$0.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        @NotNull
        public final List<KotlinType> getSupertypes() {
            return getRefinedSupertypes();
        }

        public final boolean isDenotable() {
            return this.this$0.isDenotable();
        }

        @NotNull
        public final ClassifierDescriptor getDeclarationDescriptor() {
            return this.this$0.getDeclarationDescriptor();
        }

        @NotNull
        public final KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.this$0.getBuiltIns();
            Intrinsics.checkNotNullExpressionValue(builtIns, "this@AbstractTypeConstructor.builtIns");
            return builtIns;
        }

        @NotNull
        public final TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner2) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner2, "kotlinTypeRefiner");
            return this.this$0.refine(kotlinTypeRefiner2);
        }

        public final boolean equals(@Nullable Object obj) {
            return this.this$0.equals(obj);
        }

        public final int hashCode() {
            return this.this$0.hashCode();
        }

        @NotNull
        public final String toString() {
            return this.this$0.toString();
        }
    }

    static final class Supertypes {
        @NotNull
        private final Collection<KotlinType> allSupertypes;
        @NotNull
        private List<? extends KotlinType> supertypesWithoutCycles = CollectionsKt.listOf(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES);

        public Supertypes(@NotNull Collection<? extends KotlinType> collection) {
            Intrinsics.checkNotNullParameter(collection, "allSupertypes");
            this.allSupertypes = collection;
        }

        @NotNull
        public final Collection<KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        @NotNull
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(@NotNull List<? extends KotlinType> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.supertypesWithoutCycles = list;
        }
    }

    /* access modifiers changed from: private */
    public final Collection<KotlinType> computeNeighbours(TypeConstructor typeConstructor, boolean z) {
        List<T> list = null;
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null) {
            list = CollectionsKt.plus(((Supertypes) abstractTypeConstructor.supertypes.invoke()).getAllSupertypes(), abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z));
        }
        if (list != null) {
            return list;
        }
        Collection<KotlinType> supertypes2 = typeConstructor.getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes2, "supertypes");
        return supertypes2;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return CollectionsKt.emptyList();
    }
}
