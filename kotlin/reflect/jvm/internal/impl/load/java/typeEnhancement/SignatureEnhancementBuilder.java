package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

final class SignatureEnhancementBuilder {
    /* access modifiers changed from: private */
    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> signatures = new LinkedHashMap();

    public final class ClassEnhancementBuilder {
        @NotNull
        private final String className;
        final /* synthetic */ SignatureEnhancementBuilder this$0;

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String str) {
            Intrinsics.checkNotNullParameter(signatureEnhancementBuilder, "this$0");
            Intrinsics.checkNotNullParameter(str, "className");
            this.this$0 = signatureEnhancementBuilder;
            this.className = str;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        public final void function(@NotNull String str, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(function1, "block");
            Map access$getSignatures$p = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str);
            function1.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> build = functionEnhancementBuilder.build();
            access$getSignatures$p.put(build.getFirst(), build.getSecond());
        }

        public final class FunctionEnhancementBuilder {
            @NotNull
            private final String functionName;
            @NotNull
            private final List<Pair<String, TypeEnhancementInfo>> parameters = new ArrayList();
            @NotNull
            private Pair<String, TypeEnhancementInfo> returnType = TuplesKt.to("V", null);
            final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, String str) {
                Intrinsics.checkNotNullParameter(classEnhancementBuilder, "this$0");
                Intrinsics.checkNotNullParameter(str, "functionName");
                this.this$0 = classEnhancementBuilder;
                this.functionName = str;
            }

            @NotNull
            public final String getFunctionName() {
                return this.functionName;
            }

            public final void parameter(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                Intrinsics.checkNotNullParameter(str, "type");
                Intrinsics.checkNotNullParameter(javaTypeQualifiersArr, "qualifiers");
                Collection collection = this.parameters;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<IndexedValue> withIndex = ArraysKt.withIndex((T[]) javaTypeQualifiersArr);
                    Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
                    for (IndexedValue indexedValue : withIndex) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                collection.add(TuplesKt.to(str, typeEnhancementInfo));
            }

            public final void returns(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                Intrinsics.checkNotNullParameter(str, "type");
                Intrinsics.checkNotNullParameter(javaTypeQualifiersArr, "qualifiers");
                Iterable<IndexedValue> withIndex = ArraysKt.withIndex((T[]) javaTypeQualifiersArr);
                Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
                for (IndexedValue indexedValue : withIndex) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                }
                this.returnType = TuplesKt.to(str, new TypeEnhancementInfo(linkedHashMap));
            }

            public final void returns(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                Intrinsics.checkNotNullParameter(jvmPrimitiveType, "type");
                String desc = jvmPrimitiveType.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "type.desc");
                this.returnType = TuplesKt.to(desc, null);
            }

            @NotNull
            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                String functionName2 = getFunctionName();
                Iterable<Pair> iterable = this.parameters;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (Pair first : iterable) {
                    arrayList.add((String) first.getFirst());
                }
                String signature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(functionName2, (List) arrayList, this.returnType.getFirst()));
                TypeEnhancementInfo second = this.returnType.getSecond();
                Iterable<Pair> iterable2 = this.parameters;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                for (Pair second2 : iterable2) {
                    arrayList2.add((TypeEnhancementInfo) second2.getSecond());
                }
                return TuplesKt.to(signature, new PredefinedFunctionEnhancementInfo(second, (List) arrayList2));
            }
        }
    }

    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }
}
