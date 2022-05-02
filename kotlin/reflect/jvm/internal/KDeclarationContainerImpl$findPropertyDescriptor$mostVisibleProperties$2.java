package kotlin.reflect.jvm.internal;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "kotlin.jvm.PlatformType", "second", "compare"}, k = 3, mv = {1, 4, 1})
final class KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2<T> implements Comparator<DescriptorVisibility> {
    public static final KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 INSTANCE = new KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2();

    KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2() {
    }

    public final int compare(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer compare = DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
        if (compare != null) {
            return compare.intValue();
        }
        return 0;
    }
}
