package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lid/dana/data/sendmoney/mapper/WithdrawInitChannelOptionResultMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/data/sendmoney/model/WithdrawInitChannelOptionViewResult;", "Lid/dana/domain/sendmoney/model/WithdrawInitChannelOption;", "()V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class toJSONObject extends setSpeed<List<? extends formatFileSize>, List<? extends byteArraysMatch>> {
    /* access modifiers changed from: protected */
    @NotNull
    public final List<byteArraysMatch> map(@Nullable List<formatFileSize> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                formatFileSize formatfilesize = (formatFileSize) it.next();
                Iterator it2 = it;
                byteArraysMatch bytearraysmatch = r3;
                byteArraysMatch bytearraysmatch2 = new byteArraysMatch(formatfilesize.getCardNoLength(), formatfilesize.getChannelIndex(), formatfilesize.getDisable(), formatfilesize.getInstId(), formatfilesize.getInstLocalName(), formatfilesize.getInstName(), formatfilesize.getPayMethod(), formatfilesize.getPayOption(), formatfilesize.getSelected(), formatfilesize.getValidData(), formatfilesize.getDisableReason(), formatfilesize.getErrorCode(), formatfilesize.getErrorMsg());
                arrayList.add(bytearraysmatch);
                it = it2;
            }
        }
        return arrayList;
    }
}
