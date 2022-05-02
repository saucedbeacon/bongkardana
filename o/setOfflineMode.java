package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/NetworkZendeskEntityData;", "Lid/dana/data/zendesk/repository/source/ZendeskEntityData;", "zendeskApi", "Lid/dana/data/zendesk/repository/source/network/ZendeskApi;", "(Lid/dana/data/zendesk/repository/source/network/ZendeskApi;)V", "createTicket", "Lio/reactivex/Single;", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse;", "base64AuthString", "", "createZendeskTicketRequest", "Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setOfflineMode implements getOfflineMode {
    private final getNbUrl zendeskApi;

    @Inject
    public setOfflineMode(@NotNull getNbUrl getnburl) {
        Intrinsics.checkNotNullParameter(getnburl, "zendeskApi");
        this.zendeskApi = getnburl;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<setNbUrl> createTicket(@NotNull String str, @NotNull isNeedShowFail isneedshowfail) {
        Intrinsics.checkNotNullParameter(str, "base64AuthString");
        Intrinsics.checkNotNullParameter(isneedshowfail, "createZendeskTicketRequest");
        return this.zendeskApi.createTicket(str, isneedshowfail);
    }
}
