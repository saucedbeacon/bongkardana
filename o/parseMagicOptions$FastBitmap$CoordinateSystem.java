package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;
import o.StartClientBundle;
import o.addAnimatorUpdateListener;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
final class parseMagicOptions$FastBitmap$CoordinateSystem<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, needWaitIpc> {
    final /* synthetic */ String getMax;
    final /* synthetic */ String getMin;
    final /* synthetic */ parseMagicOptions length;
    final /* synthetic */ Map setMax;
    final /* synthetic */ String setMin;

    parseMagicOptions$FastBitmap$CoordinateSystem(parseMagicOptions parsemagicoptions, String str, String str2, String str3, Map map) {
        this.length = parsemagicoptions;
        this.getMax = str;
        this.setMin = str2;
        this.getMin = str3;
        this.setMax = map;
    }

    public final /* synthetic */ Object processFacade(Object obj) {
        unifyAll unifyall = (unifyAll) obj;
        String str = this.getMax;
        String str2 = this.setMin;
        String str3 = this.getMin;
        Boolean bool = null;
        if (str3 != null) {
            bool = Boolean.valueOf(StringsKt.contains$default((CharSequence) str3, (CharSequence) "reversal", false, 2, (Object) null));
        }
        StartClientBundle.AnonymousClass1 r0 = new StartClientBundle.AnonymousClass1(str, str2, bool, this.setMax);
        r0.envInfo = this.length.generateMobileEnvInfo();
        Unit unit = Unit.INSTANCE;
        return unifyall.getTopUpCommandEmoney(r0);
    }
}
