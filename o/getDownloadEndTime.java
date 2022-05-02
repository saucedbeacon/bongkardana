package o;

import android.util.Base64;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/data/zendesk/repository/ZendeskEntityRepository;", "Lid/dana/domain/zendesk/ZendeskRepository;", "zendeskEntityDataFactory", "Lid/dana/data/zendesk/repository/source/ZendeskEntityDataFactory;", "(Lid/dana/data/zendesk/repository/source/ZendeskEntityDataFactory;)V", "networkZendeskEntityData", "Lid/dana/data/zendesk/repository/source/ZendeskEntityData;", "getNetworkZendeskEntityData", "()Lid/dana/data/zendesk/repository/source/ZendeskEntityData;", "networkZendeskEntityData$delegate", "Lkotlin/Lazy;", "createTicket", "Lio/reactivex/Observable;", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult;", "zendeskBasicTicket", "Lid/dana/domain/zendesk/model/ZendeskBasicTicket;", "getApiTokenAuthentication", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getDownloadEndTime implements isShortUuid {
    private static final String API_TOKEN = "OOca07HPtP6KsS9AbY6pBcKeF3CW7u1NYaQSEtT9";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final String ZENDESK_EMAIL_ADDRESS = "testing@dana.id";
    private final Lazy networkZendeskEntityData$delegate = LazyKt.lazy(new setMin(this));
    /* access modifiers changed from: private */
    public final setEndTime zendeskEntityDataFactory;

    private final getOfflineMode getNetworkZendeskEntityData() {
        return (getOfflineMode) this.networkZendeskEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<setNbUrl, getServiceUuids> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setNbUrl setnburl = (setNbUrl) obj;
            Intrinsics.checkNotNullParameter(setnburl, "it");
            return getEndTime.toZendeskBasicTicketResult(setnburl);
        }
    }

    @Inject
    public getDownloadEndTime(@NotNull setEndTime setendtime) {
        Intrinsics.checkNotNullParameter(setendtime, "zendeskEntityDataFactory");
        this.zendeskEntityDataFactory = setendtime;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getServiceUuids> createTicket(@NotNull ScanRecord scanRecord) {
        TitleBarRightButtonView.AnonymousClass1<getServiceUuids> r3;
        Intrinsics.checkNotNullParameter(scanRecord, "zendeskBasicTicket");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<setNbUrl> createTicket = getNetworkZendeskEntityData().createTicket(getApiTokenAuthentication(), getEndTime.toCreateZendeskTicketRequest(scanRecord));
        RedDotDrawable redDotDrawable = length.setMax;
        setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
        setMinDuration releaseviewlist = new releaseViewList(createTicket, redDotDrawable);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
        if (redDotDrawable2 != null) {
            releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
        }
        if (releaseviewlist instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) releaseviewlist).setMax();
        } else {
            r3 = new setTitleLoading<>(releaseviewlist);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
            if (redDotDrawable3 != null) {
                r3 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r3);
            }
        }
        Intrinsics.checkNotNullExpressionValue(r3, "networkZendeskEntityData…          .toObservable()");
        return r3;
    }

    private final String getApiTokenAuthentication() {
        byte[] bytes = "testing@dana.id/token:OOca07HPtP6KsS9AbY6pBcKeF3CW7u1NYaQSEtT9".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return "Basic ".concat(String.valueOf(Base64.encodeToString(bytes, 2)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/zendesk/repository/source/ZendeskEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<getOfflineMode> {
        final /* synthetic */ getDownloadEndTime this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getDownloadEndTime getdownloadendtime) {
            super(0);
            this.this$0 = getdownloadendtime;
        }

        @NotNull
        public final getOfflineMode invoke() {
            return this.this$0.zendeskEntityDataFactory.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/zendesk/repository/ZendeskEntityRepository$Companion;", "", "()V", "API_TOKEN", "", "ZENDESK_EMAIL_ADDRESS", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
