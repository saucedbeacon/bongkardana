package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0002\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\r"}, d2 = {"defaultSelectedBank", "Lid/dana/sendmoney/model/BankModel;", "bankModels", "", "recentBank", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "topBanks", "", "toBankSelectorConfigModel", "Lid/dana/requestmoney/model/BankSelectorConfigModel;", "Lid/dana/domain/requestmoney/model/BankSelectorConfig;", "bankModelMapper", "Lid/dana/sendmoney/mapper/BankModelMapper;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class resetState {
    @NotNull
    public static final x setMin(@NotNull getParserIdentifier getparseridentifier, @NotNull SaveImageToAlbumBridgeExtension saveImageToAlbumBridgeExtension, @Nullable getMonitorToken getmonitortoken) {
        Intrinsics.checkNotNullParameter(getparseridentifier, "$this$toBankSelectorConfigModel");
        Intrinsics.checkNotNullParameter(saveImageToAlbumBridgeExtension, "bankModelMapper");
        List list = (List) saveImageToAlbumBridgeExtension.apply(getparseridentifier.getTransferInit());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        return new x(getparseridentifier.getTransferInit().isNeedSenderName(), "", getparseridentifier.getNameCheckConfig().getRetryLimit(), getparseridentifier.getNameCheckConfig().getFreezeTime(), list2, length(list2, getmonitortoken, getparseridentifier.getTopFeaturedBanks()), false, PsExtractor.AUDIO_STREAM);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: id.dana.sendmoney.model.BankModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final id.dana.sendmoney.model.BankModel length(java.util.List<? extends id.dana.sendmoney.model.BankModel> r4, o.getMonitorToken r5, java.util.List<java.lang.String> r6) {
        /*
            r0 = r4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0007:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()
            r3 = r1
            id.dana.sendmoney.model.BankModel r3 = (id.dana.sendmoney.model.BankModel) r3
            if (r5 == 0) goto L_0x001b
            java.lang.String r2 = r5.getId()
        L_0x001b:
            java.lang.String r3 = r3.getMin
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0007
            r2 = r1
        L_0x0024:
            id.dana.sendmoney.model.BankModel r2 = (id.dana.sendmoney.model.BankModel) r2
            if (r2 != 0) goto L_0x0033
            java.util.List r4 = o.setCount.getMin(r4, r6)
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            r2 = r4
            id.dana.sendmoney.model.BankModel r2 = (id.dana.sendmoney.model.BankModel) r2
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resetState.length(java.util.List, o.getMonitorToken, java.util.List):id.dana.sendmoney.model.BankModel");
    }
}
