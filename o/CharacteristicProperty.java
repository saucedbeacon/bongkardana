package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/zendesk/interactor/CreateZendeskTicket;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult;", "Lid/dana/domain/zendesk/interactor/CreateZendeskTicket$Params;", "zendeskRepository", "Lid/dana/domain/zendesk/ZendeskRepository;", "(Lid/dana/domain/zendesk/ZendeskRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class CharacteristicProperty extends APWebChromeClient<getServiceUuids, setMin> {
    private final isShortUuid zendeskRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CharacteristicProperty(@NotNull isShortUuid isshortuuid) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(isshortuuid, "zendeskRepository");
        this.zendeskRepository = isshortuuid;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getServiceUuids> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.zendeskRepository.createTicket(setmin.getZendeskBasicTicket$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/zendesk/interactor/CreateZendeskTicket$Params;", "", "zendeskBasicTicket", "Lid/dana/domain/zendesk/model/ZendeskBasicTicket;", "(Lid/dana/domain/zendesk/model/ZendeskBasicTicket;)V", "getZendeskBasicTicket$domain_release", "()Lid/dana/domain/zendesk/model/ZendeskBasicTicket;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        private final ScanRecord zendeskBasicTicket;

        @JvmStatic
        @NotNull
        public static final setMin create(@NotNull ScanRecord scanRecord) {
            return Companion.create(scanRecord);
        }

        private setMin(ScanRecord scanRecord) {
            this.zendeskBasicTicket = scanRecord;
        }

        public /* synthetic */ setMin(ScanRecord scanRecord, DefaultConstructorMarker defaultConstructorMarker) {
            this(scanRecord);
        }

        @NotNull
        public final ScanRecord getZendeskBasicTicket$domain_release() {
            return this.zendeskBasicTicket;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/zendesk/interactor/CreateZendeskTicket$Params$Companion;", "", "()V", "create", "Lid/dana/domain/zendesk/interactor/CreateZendeskTicket$Params;", "zendeskBasicTicket", "Lid/dana/domain/zendesk/model/ZendeskBasicTicket;", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final setMin create(@NotNull ScanRecord scanRecord) {
                Intrinsics.checkNotNullParameter(scanRecord, "zendeskBasicTicket");
                return new setMin(scanRecord, (DefaultConstructorMarker) null);
            }
        }
    }
}
