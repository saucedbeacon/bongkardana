package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUTitleBar;
import o.CharacteristicProperty;
import o.GriverOpenAuthExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/social/presenter/AccountDeactivationPresenter;", "Lid/dana/social/contract/AccountDeactivationContract$Presenter;", "view", "Lid/dana/social/contract/AccountDeactivationContract$View;", "createZendeskTicket", "Lid/dana/domain/zendesk/interactor/CreateZendeskTicket;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "getPhoneNumber", "Lid/dana/domain/account/interactor/GetPhoneNumber;", "(Lid/dana/social/contract/AccountDeactivationContract$View;Lid/dana/domain/zendesk/interactor/CreateZendeskTicket;Lid/dana/domain/account/interactor/GetUserId;Lid/dana/domain/account/interactor/GetPhoneNumber;)V", "emailAddress", "", "", "userId", "onError", "Lkotlin/Function0;", "isValidEmail", "", "target", "", "observeEmailAddress", "textChanges", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "sendTicket", "phoneNumber", "sendTicketToZendesk", "validateEmail", "email", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAmountToScroll implements AUTitleBar.setMin {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    private final CharacteristicProperty getMin;
    private final GriverOpenAuthExtension.RevokeCallback isInside;
    /* access modifiers changed from: private */
    public final AUTitleBar.getMin length;
    /* access modifiers changed from: private */
    public String setMax = "";
    private final GriverCreateDialogParam setMin;

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<getServiceUuids, Unit> {
        final /* synthetic */ getAmountToScroll this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getAmountToScroll getamounttoscroll) {
            super(1);
            this.this$0 = getamounttoscroll;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getServiceUuids) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getServiceUuids getserviceuuids) {
            Intrinsics.checkNotNullParameter(getserviceuuids, "it");
            this.this$0.length.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ getAmountToScroll this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getAmountToScroll getamounttoscroll) {
            super(1);
            this.this$0 = getamounttoscroll;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.getMin();
        }
    }

    @Inject
    public getAmountToScroll(@NotNull AUTitleBar.getMin getmin, @NotNull CharacteristicProperty characteristicProperty, @NotNull GriverCreateDialogParam griverCreateDialogParam, @NotNull GriverOpenAuthExtension.RevokeCallback revokeCallback) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(characteristicProperty, "createZendeskTicket");
        Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
        Intrinsics.checkNotNullParameter(revokeCallback, Constants.JS_API_GET_PHONE_NUMBER);
        this.length = getmin;
        this.getMin = characteristicProperty;
        this.setMin = griverCreateDialogParam;
        this.isInside = revokeCallback;
    }

    public final void setMax(@NotNull AudioAttributesImplBase<CharSequence> audioAttributesImplBase) {
        Intrinsics.checkNotNullParameter(audioAttributesImplBase, "textChanges");
        audioAttributesImplBase.skipInitialValue().debounce(1000, TimeUnit.MILLISECONDS).observeOn(hideProgress.length()).subscribe(new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/AccountDeactivationPresenter$observeEmailAddress$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<CharSequence> {
        final /* synthetic */ getAmountToScroll setMax;

        getMax(getAmountToScroll getamounttoscroll) {
            this.setMax = getamounttoscroll;
        }

        public final /* synthetic */ void onNext(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, SecurityConstants.KEY_TEXT);
            getAmountToScroll.setMin(this.setMax, charSequence);
            this.setMax.setMax = charSequence.toString();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMax.length.onError(th.getMessage());
        }
    }

    private static boolean length(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0) && setIconAttribute.toIntRange.matcher(charSequence).matches();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/AccountDeactivationPresenter$sendTicketToZendesk$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ getAmountToScroll setMax;

        equals(getAmountToScroll getamounttoscroll) {
            this.setMax = getamounttoscroll;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            this.setMax.isInside.execute(new setMax(this.setMax, str, new length(this)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function0<Unit> {
            final /* synthetic */ equals this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(equals equals) {
                super(0);
                this.this$0 = equals;
            }

            public final void invoke() {
                this.this$0.setMax.length.getMin();
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMax.length.getMin();
        }
    }

    public final void setMin() {
        this.setMin.execute(new equals(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/AccountDeactivationPresenter$getPhoneNumber$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "phoneNumber", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ Function0 getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ getAmountToScroll setMin;

        setMax(getAmountToScroll getamounttoscroll, String str, Function0 function0) {
            this.setMin = getamounttoscroll;
            this.getMin = str;
            this.getMax = function0;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            getAmountToScroll.getMin(this.setMin, this.getMin, str);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/presenter/AccountDeactivationPresenter$Companion;", "", "()V", "DEBOUNCE_EMAIL_ADDRESS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMin(getAmountToScroll getamounttoscroll, CharSequence charSequence) {
        if (length(charSequence)) {
            getamounttoscroll.length.length();
        } else {
            getamounttoscroll.length.setMax();
        }
    }

    public static final /* synthetic */ void getMin(getAmountToScroll getamounttoscroll, String str, String str2) {
        StringBuilder sb = new StringBuilder("Email Address: ");
        sb.append(getamounttoscroll.setMax);
        sb.append(10);
        sb.append("User ID: ");
        sb.append(str);
        sb.append(10);
        sb.append("Phone Number: ");
        sb.append(str2);
        getamounttoscroll.getMin.execute(CharacteristicProperty.setMin.Companion.create(new ScanRecord("urgent", "Deactivate Account", sb.toString())), new getMin(getamounttoscroll), new length(getamounttoscroll));
    }
}
