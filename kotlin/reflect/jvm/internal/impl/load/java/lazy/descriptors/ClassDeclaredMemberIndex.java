package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {
    @NotNull
    private final Map<Name, JavaRecordComponent> components;
    @NotNull
    private final Map<Name, JavaField> fields;
    @NotNull
    private final JavaClass jClass;
    /* access modifiers changed from: private */
    @NotNull
    public final Function1<JavaMember, Boolean> memberFilter;
    @NotNull
    private final Function1<JavaMethod, Boolean> methodFilter = new ClassDeclaredMemberIndex$methodFilter$1(this);
    @NotNull
    private final Map<Name, List<JavaMethod>> methods;

    public ClassDeclaredMemberIndex(@NotNull JavaClass javaClass, @NotNull Function1<? super JavaMember, Boolean> function1) {
        Intrinsics.checkNotNullParameter(javaClass, "jClass");
        Intrinsics.checkNotNullParameter(function1, "memberFilter");
        this.jClass = javaClass;
        this.memberFilter = function1;
        Sequence<T> filter = SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getMethods()), this.methodFilter);
        Map<Name, List<JavaMethod>> linkedHashMap = new LinkedHashMap<>();
        for (T next : filter) {
            Name name = ((JavaMethod) next).getName();
            List<JavaMethod> list = linkedHashMap.get(name);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(name, list);
            }
            list.add(next);
        }
        this.methods = linkedHashMap;
        Sequence<T> filter2 = SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        Map<Name, JavaField> linkedHashMap2 = new LinkedHashMap<>();
        for (T next2 : filter2) {
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
        Function1<JavaMember, Boolean> function12 = this.memberFilter;
        Collection arrayList = new ArrayList();
        for (Object next3 : this.jClass.getRecordComponents()) {
            if (function12.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        Iterable iterable = (List) arrayList;
        Map<Name, JavaRecordComponent> linkedHashMap3 = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object next4 : iterable) {
            linkedHashMap3.put(((JavaRecordComponent) next4).getName(), next4);
        }
        this.components = linkedHashMap3;
    }

    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = this.methods.get(name);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public Set<Name> getMethodNames() {
        Sequence<T> filter = SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getMethods()), this.methodFilter);
        Collection linkedHashSet = new LinkedHashSet();
        for (T name : filter) {
            linkedHashSet.add(name.getName());
        }
        return (Set) linkedHashSet;
    }

    @Nullable
    public JavaField findFieldByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.fields.get(name);
    }

    @NotNull
    public Set<Name> getFieldNames() {
        Sequence<T> filter = SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        Collection linkedHashSet = new LinkedHashSet();
        for (T name : filter) {
            linkedHashSet.add(name.getName());
        }
        return (Set) linkedHashSet;
    }

    @NotNull
    public Set<Name> getRecordComponentNames() {
        return this.components.keySet();
    }

    @Nullable
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.components.get(name);
    }
}
