package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements Function0<MemberScope> {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    @NotNull
    public final MemberScope invoke() {
        if (this.this$0.getFragments().isEmpty()) {
            return MemberScope.Empty.INSTANCE;
        }
        Iterable<PackageFragmentDescriptor> fragments = this.this$0.getFragments();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fragments, 10));
        for (PackageFragmentDescriptor memberScope : fragments) {
            arrayList.add(memberScope.getMemberScope());
        }
        List plus = CollectionsKt.plus((List) arrayList, new SubpackagesScope(this.this$0.getModule(), this.this$0.getFqName()));
        ChainedMemberScope.Companion companion = ChainedMemberScope.Companion;
        StringBuilder sb = new StringBuilder("package view scope for ");
        sb.append(this.this$0.getFqName());
        sb.append(" in ");
        sb.append(this.this$0.getModule().getName());
        return companion.create(sb.toString(), plus);
    }
}
