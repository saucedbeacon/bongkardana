package o;

import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.sendmoney.summary.SummaryRichView;
import kotlin.jvm.functions.Function1;

public final class setPhotoWidth implements Function1 {
    private final SummaryRichView setMax;

    public setPhotoWidth(SummaryRichView summaryRichView) {
        this.setMax = summaryRichView;
    }

    public final Object invoke(Object obj) {
        return DanaH5.startContainerFullUrl(setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/portal/topup?entryPoint={entryPoint}").getMin(UrlTag.ENTRY_POINT, "sendMoney").getMax());
    }
}
