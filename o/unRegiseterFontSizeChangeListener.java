package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/globalnetwork/mapper/GnContentMapper;", "", "()V", "transform", "Lid/dana/domain/globalnetwork/model/GnContent;", "getGnContentResult", "Lid/dana/data/globalnetwork/model/GnContentResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class unRegiseterFontSizeChangeListener {
    @NotNull
    public final PageProcessPoint transform(@NotNull attachPage attachpage) {
        Intrinsics.checkNotNullParameter(attachpage, "getGnContentResult");
        return new PageProcessPoint(attachpage.getTitle(), attachpage.getSubtitle(), attachpage.getButtonTitle(), attachpage.getImageUrl());
    }
}
