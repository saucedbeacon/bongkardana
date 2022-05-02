package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.DanaH5;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.domain.services.Category;
import id.dana.miniprogram.tnc.TncServiceDialogActivity;
import id.dana.model.ThirdPartyService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.BLEManager;
import o.CornerMarkingDataProvider;
import o.DialogBridgeExtension;
import o.NullBeaconDataFactory;
import o.Region$1;
import o.getUniqueId;
import o.hasSameIdentifiers;
import o.onCharacteristicWriteCompleted;
import o.onConnect;
import o.style;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@PerActivity
@SuppressLint({"DefaultLocale"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 g2\u00020\u0001:\u0002fgBw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020 0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\"H\u0002J\b\u0010\u0016\u001a\u00020)H\u0016J\u0010\u0010\u001a\u001a\u00020)2\u0006\u0010*\u001a\u00020 H\u0002J$\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020%H\u0016JL\u00101\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u00102\u001a\u00020#2\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010#2\b\u00108\u001a\u0004\u0018\u00010#H\u0016J\u001c\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\"0:2\u0006\u0010<\u001a\u00020%H\u0002J\u001a\u0010=\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010>\u001a\u00020 H\u0016J\u0018\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020#2\u0006\u0010*\u001a\u00020 H\u0002J\u0018\u0010A\u001a\u00020%2\u0006\u0010@\u001a\u00020#2\u0006\u0010*\u001a\u00020 H\u0002J\u0018\u0010B\u001a\u00020%2\u0006\u0010@\u001a\u00020#2\u0006\u0010*\u001a\u00020 H\u0002J\u0010\u0010C\u001a\u00020)2\u0006\u0010<\u001a\u00020%H\u0016J\u0018\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020#2\u0006\u0010<\u001a\u00020%H\u0016J\u001e\u0010C\u001a\u00020)2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010<\u001a\u00020%H\u0016J\b\u0010F\u001a\u00020)H\u0016J\b\u0010G\u001a\u00020)H\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u00020#H\u0016J&\u0010I\u001a\u00020)2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010J\u001a\u00020%2\u0006\u0010<\u001a\u00020%H\u0002J\u0018\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020#2\u0006\u0010M\u001a\u00020#H\u0016J&\u0010K\u001a\u00020)2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010M\u001a\u00020#2\u0006\u0010<\u001a\u00020%H\u0016J.\u0010O\u001a\u00020)2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020;0'2\u0006\u0010J\u001a\u00020%2\u0006\u0010D\u001a\u00020#2\u0006\u0010<\u001a\u00020%H\u0002J\u0010\u0010\n\u001a\u00020)2\u0006\u0010Q\u001a\u00020#H\u0016J\u0018\u0010R\u001a\u00020%2\u0006\u0010@\u001a\u00020#2\u0006\u0010*\u001a\u00020 H\u0002J\u0018\u0010S\u001a\u00020)2\u0006\u0010T\u001a\u00020#2\u0006\u0010U\u001a\u00020VH\u0002J\u001e\u0010W\u001a\u00020)2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020;0'2\u0006\u0010X\u001a\u00020%H\u0002J\b\u0010Y\u001a\u00020)H\u0016J\u0010\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020\\H\u0007J\u0010\u0010]\u001a\u00020)2\u0006\u0010>\u001a\u00020 H\u0002J\u001e\u0010^\u001a\u00020)2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020;0'2\u0006\u0010*\u001a\u00020;H\u0002J\u0016\u0010_\u001a\u00020)2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020 0'H\u0002J\u0018\u0010\f\u001a\u00020)2\u0006\u0010a\u001a\u00020%2\u0006\u0010Q\u001a\u00020#H\u0016J$\u0010b\u001a\b\u0012\u0004\u0012\u00020 0\"2\u0006\u0010@\u001a\u00020#2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020 0\"H\u0002J\u001e\u0010d\u001a\u00020)2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020;0\"2\u0006\u0010<\u001a\u00020%H\u0002J\u0016\u0010e\u001a\u00020)2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020;0\"H\u0002R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lid/dana/contract/services/ServicesPresenter;", "Lid/dana/contract/services/ServicesContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/contract/services/ServicesContract$View;", "getAuthCode", "Lid/dana/domain/authcode/interactor/GetAuthCode;", "mapper", "Lid/dana/mapper/ThirdPartyServicesMapper;", "isNeedToShowToolTip", "Lid/dana/domain/usereducation/interactor/IsNeedToShowToolTip;", "saveShowToolTip", "Lid/dana/domain/usereducation/interactor/SaveShowToolTip;", "getServicesWithCategory", "Lid/dana/domain/services/interactor/GetServicesWithCategory;", "getServicesByName", "Lid/dana/domain/services/interactor/GetServicesByName;", "getServicesByKey", "Lid/dana/domain/services/interactor/GetServicesByKey;", "getFavoriteServices", "Lid/dana/domain/services/interactor/GetFavoriteServices;", "checkFavoriteServicesFeature", "Lid/dana/domain/services/interactor/CheckFavoriteServicesFeature;", "getRawServices", "Lid/dana/domain/services/interactor/GetRawServices;", "consultAgreement", "Lid/dana/domain/useragreement/interactor/ConsultAgreement;", "recordAgreement", "Lid/dana/domain/useragreement/interactor/RecordAgreement;", "(Landroid/content/Context;Lid/dana/contract/services/ServicesContract$View;Lid/dana/domain/authcode/interactor/GetAuthCode;Lid/dana/mapper/ThirdPartyServicesMapper;Lid/dana/domain/usereducation/interactor/IsNeedToShowToolTip;Lid/dana/domain/usereducation/interactor/SaveShowToolTip;Lid/dana/domain/services/interactor/GetServicesWithCategory;Lid/dana/domain/services/interactor/GetServicesByName;Lid/dana/domain/services/interactor/GetServicesByKey;Lid/dana/domain/services/interactor/GetFavoriteServices;Lid/dana/domain/services/interactor/CheckFavoriteServicesFeature;Lid/dana/domain/services/interactor/GetRawServices;Lid/dana/domain/useragreement/interactor/ConsultAgreement;Lid/dana/domain/useragreement/interactor/RecordAgreement;)V", "activeService", "Lid/dana/model/ThirdPartyService;", "agreementKeys", "", "", "favoriteServiceEnabled", "", "checkAndRemoveFeaturedServiceDuplicates", "", "thirdPartyServiceList", "", "service", "consultAndOpenEmoney", "activity", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "immediateOpen", "consultAndOpenMiniProgram", "action", "params", "", "extendedInfo", "Lorg/json/JSONObject;", "destinationPath", "orderId", "createFilteredServiceObserver", "Lio/reactivex/observers/DisposableObserver;", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "isExcludeHeader", "doAction", "thirdPartyService", "filterByDescription", "query", "filterByKeyword", "filterByName", "getCategoryServices", "categoryKey", "categoryKeys", "getFeatureServices", "getInitThirdPartyServices", "getSearchedServices", "getServicesByCategory", "updateHome", "getThirdPartyServicesFilterBy", "csvNames", "filterBy", "names", "handleServices", "categoryServices", "scenario", "isServiceMatch", "logError", "prefix", "e", "", "mergeWithFavoriteServices", "categoryAll", "onDestroy", "onReceiveAgreementMessageEvent", "event", "Lid/dana/contract/services/ServicesPresenter$AgreementMessageEvent;", "postAuthCode", "putToCategoryServices", "removeLastEmptyServiceHeader", "services", "hasShown", "searchServices", "serviceList", "showCategoryServices", "updateHomeServices", "AgreementMessageEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BindInt implements style.length {
    @NotNull
    public static final getMin getMin = new getMin((byte) 0);
    private static final String invokeSuspend = BindInt.class.getSimpleName();
    private final hasSameIdentifiers FastBitmap$CoordinateSystem;
    private final BLEManager.AnonymousClass2.C00022 Grayscale$Algorithm;
    private final onCharacteristicWriteCompleted IsOverlapping;
    private ThirdPartyService equals;
    /* access modifiers changed from: private */
    public boolean getMax;
    private final getUniqueId hashCode;
    private final BLEManager.AnonymousClass2.AnonymousClass3 invoke;
    /* access modifiers changed from: private */
    public final Context isInside;
    public final style.getMin length;
    /* access modifiers changed from: private */
    public List<String> setMax = CollectionsKt.emptyList();
    public final didExitRegion setMin;
    private final Region$1 toDoubleRange;
    private final GetAuthCode toFloatRange;
    /* access modifiers changed from: private */
    public final parseBatteryPercentage toIntRange;
    private final onConnect toString;
    private final toByteArray valueOf;
    private final convertIntentsToCallbacks values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class create extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ThirdPartyService $thirdPartyService;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        create(BindInt bindInt, ThirdPartyService thirdPartyService) {
            super(1);
            this.this$0 = bindInt;
            this.$thirdPartyService = thirdPartyService;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "it");
            if (th instanceof GetAuthCode.MissingRequiredUserInfoException) {
                String str2 = this.$thirdPartyService.isInside;
                Intrinsics.checkNotNull(str2);
                DialogBridgeExtension.AnonymousClass6.getMax((GetAuthCode.MissingRequiredUserInfoException) th, str2, this.$thirdPartyService.toFloatRange);
            } else {
                style.getMin min = this.this$0.length;
                Context min2 = this.this$0.isInside;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min2.getString(R.string.general_error_msg);
                }
                min.onError(str);
            }
            style.getMin min3 = this.this$0.length;
            th.getMessage();
            min3.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class equals extends Lambda implements Function1<List<? extends ThirdPartyServiceResponse>, Unit> {
        final /* synthetic */ String $appId;
        final /* synthetic */ String $destinationPath;
        final /* synthetic */ JSONObject $extendedInfo;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public equals(BindInt bindInt, String str, String str2, JSONObject jSONObject) {
            super(1);
            this.this$0 = bindInt;
            this.$appId = str;
            this.$destinationPath = str2;
            this.$extendedInfo = jSONObject;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<ThirdPartyServiceResponse>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<ThirdPartyServiceResponse> list) {
            Object obj;
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.length.dismissProgress();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((ThirdPartyServiceResponse) obj).getAppId(), (Object) this.$appId)) {
                    break;
                }
            }
            ThirdPartyServiceResponse thirdPartyServiceResponse = (ThirdPartyServiceResponse) obj;
            if (thirdPartyServiceResponse == null || thirdPartyServiceResponse.isEnable()) {
                Uri.Builder appendQueryParameter = Uri.parse("mini://platformapi/startapp").buildUpon().appendQueryParameter("_ariver_appid", this.$appId);
                String max = isShowMenu.getMax(this.$destinationPath);
                if (max != null) {
                    appendQueryParameter.appendQueryParameter("_ariver_path", max);
                }
                String obj2 = appendQueryParameter.build().toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "uriBuilder.build().toString()");
                DanaH5.openApp(obj2, setFantasyFontFamily.toBundle(this.$extendedInfo));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(BindInt bindInt) {
            super(1);
            this.this$0 = bindInt;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.getMax = z;
            this.this$0.toIntRange.length = z;
            style.getMin unused = this.this$0.length;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "categoryServices", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<List<? extends NullBeaconDataFactory.AnonymousClass1>, Unit> {
        final /* synthetic */ String $query;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(BindInt bindInt, String str) {
            super(1);
            this.this$0 = bindInt;
            this.$query = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends NullBeaconDataFactory.AnonymousClass1>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends NullBeaconDataFactory.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "categoryServices");
            this.this$0.length.dismissProgress();
            BindInt bindInt = this.this$0;
            String str = this.$query;
            parseBatteryPercentage max = bindInt.toIntRange;
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (true ^ Intrinsics.areEqual((Object) ((NullBeaconDataFactory.AnonymousClass1) next).getKey(), (Object) Category.FEATURED)) {
                    arrayList.add(next);
                }
            }
            List min = BindInt.getMin(bindInt, str, CollectionsKt.toMutableList(max.getMax((List) arrayList, true, false)));
            if (min.isEmpty()) {
                this.this$0.length.length();
            } else {
                this.this$0.length.setMin((List<ThirdPartyService>) CollectionsKt.toMutableList(min));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invoke extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invoke(BindInt bindInt) {
            super(1);
            this.this$0 = bindInt;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            style.getMin min = this.this$0.length;
            Context min2 = this.this$0.isInside;
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = min2.getString(R.string.general_error_msg);
            }
            min.onError(str);
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public isInside(BindInt bindInt) {
            super(1);
            this.this$0 = bindInt;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            BindInt.getMin(this.this$0, DanaLogConstants.Prefix.CONSULT_AND_OPEN_MINI_PROGRAM, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/useragreement/model/ConsultAgreementResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<BLEOperation, Unit> {
        final /* synthetic */ ThirdPartyService $service;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(BindInt bindInt, ThirdPartyService thirdPartyService) {
            super(1);
            this.this$0 = bindInt;
            this.$service = thirdPartyService;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BLEOperation) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull BLEOperation bLEOperation) {
            String str;
            Intrinsics.checkNotNullParameter(bLEOperation, "it");
            if (bLEOperation.getNeedUserAgreement()) {
                BindInt bindInt = this.this$0;
                List<BLEManager.ScanHandler> agreementInfos = bLEOperation.getAgreementInfos();
                if (agreementInfos != null) {
                    Collection arrayList = new ArrayList();
                    for (BLEManager.ScanHandler agreementKey : agreementInfos) {
                        String agreementKey2 = agreementKey.getAgreementKey();
                        if (agreementKey2 != null) {
                            arrayList.add(agreementKey2);
                        }
                    }
                    bindInt.setMax = (List) arrayList;
                    String str2 = this.$service.toString;
                    String str3 = this.$service.toFloatRange;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = this.$service.isInside;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String joinToString$default = CollectionsKt.joinToString$default(this.this$0.setMax, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                    List<BLEManager.ScanHandler> agreementInfos2 = bLEOperation.getAgreementInfos();
                    if (agreementInfos2 != null) {
                        Collection arrayList2 = new ArrayList();
                        for (BLEManager.ScanHandler contentValue : agreementInfos2) {
                            String contentValue2 = contentValue.getContentValue();
                            if (contentValue2 != null) {
                                arrayList2.add(contentValue2);
                            }
                        }
                        str = CollectionsKt.joinToString$default((List) arrayList2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                    } else {
                        str = null;
                    }
                    Intent putExtra = new Intent(this.this$0.isInside, TncServiceDialogActivity.class).addFlags(268435456).putExtra("startParams", new TncServiceDialogActivity.StartParams(str2, str3, str4, joinToString$default, str, false, true, 32));
                    Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, TncServi…TRA_START_PARAMS, params)");
                    this.this$0.isInside.startActivity(putExtra);
                    return;
                }
                return;
            }
            this.this$0.length(this.$service);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ThirdPartyService $service;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(BindInt bindInt, ThirdPartyService thirdPartyService) {
            super(1);
            this.this$0 = bindInt;
            this.$service = thirdPartyService;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length(this.$service);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(BindInt bindInt) {
            super(1);
            this.this$0 = bindInt;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            style.getMin min = this.this$0.length;
            Context min2 = this.this$0.isInside;
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = min2.getString(R.string.general_error_msg);
            }
            min.onError(str);
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<List<? extends NullBeaconDataFactory.AnonymousClass1>, Unit> {
        final /* synthetic */ boolean $immediateOpen;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(BindInt bindInt, boolean z, Intent intent) {
            super(1);
            this.this$0 = bindInt;
            this.$immediateOpen = z;
            this.$intent = intent;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends NullBeaconDataFactory.AnonymousClass1>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends NullBeaconDataFactory.AnonymousClass1> list) {
            Object obj;
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.length.dismissProgress();
            Iterator it = this.this$0.toIntRange.getMax(list, true, false).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) "service_emoney", (Object) ((ThirdPartyService) obj).setMax)) {
                    break;
                }
            }
            ThirdPartyService thirdPartyService = (ThirdPartyService) obj;
            if (thirdPartyService == null) {
                getDeviceName.setMin().onNext("");
            } else if (thirdPartyService.getMax()) {
                StringBuilder sb = new StringBuilder();
                sb.append(thirdPartyService.IsOverlapping);
                sb.append("?updateBalance=true");
                String min = isShowMenu.setMin(sb.toString());
                getDeviceName.setMin().onNext(min);
                if (this.$immediateOpen) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("android.nfc.extra.TAG", this.$intent);
                    bundle.putString("url", min);
                    DanaH5.startContainerActivity(bundle);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(BindInt bindInt) {
            super(1);
            this.this$0 = bindInt;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            BindInt.getMin(this.this$0, DanaLogConstants.Prefix.CONSULT_AND_OPEN_ELECTRONICMONEY, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<List<? extends NullBeaconDataFactory.AnonymousClass1>, Unit> {
        final /* synthetic */ List $categoryKeys;
        final /* synthetic */ boolean $isExcludeHeader;
        final /* synthetic */ boolean $updateHome;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(BindInt bindInt, List list, boolean z, boolean z2) {
            super(1);
            this.this$0 = bindInt;
            this.$categoryKeys = list;
            this.$updateHome = z;
            this.$isExcludeHeader = z2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends NullBeaconDataFactory.AnonymousClass1>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends NullBeaconDataFactory.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.length.dismissProgress();
            if (1 >= this.$categoryKeys.size()) {
                BindInt.setMax(this.this$0, CollectionsKt.toMutableList(list), this.$updateHome, this.$categoryKeys.isEmpty() ^ true ? (String) this.$categoryKeys.get(0) : "", this.$isExcludeHeader);
            } else {
                this.this$0.length.setMin((List<ThirdPartyService>) CollectionsKt.toMutableList(this.this$0.toIntRange.getMax(list, true, true)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/authcode/AuthCodeResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class valueOf extends Lambda implements Function1<SplashEntryInfo, Unit> {
        final /* synthetic */ ThirdPartyService $thirdPartyService;
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        valueOf(BindInt bindInt, ThirdPartyService thirdPartyService) {
            super(1);
            this.this$0 = bindInt;
            this.$thirdPartyService = thirdPartyService;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SplashEntryInfo) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SplashEntryInfo splashEntryInfo) {
            Intrinsics.checkNotNullParameter(splashEntryInfo, "it");
            getStackButtons$core.serviceKey().onNext(this.$thirdPartyService.setMax);
            style.getMin min = this.this$0.length;
            ThirdPartyService thirdPartyService = this.$thirdPartyService;
            String authCode = splashEntryInfo.getAuthCode();
            Intrinsics.checkNotNullExpressionValue(authCode, "it.authCode");
            min.getMax(thirdPartyService, authCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BindInt this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(BindInt bindInt) {
            super(1);
            this.this$0 = bindInt;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            style.getMin min = this.this$0.length;
            Context min2 = this.this$0.isInside;
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = min2.getString(R.string.general_error_msg);
            }
            min.onError(str);
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
        }
    }

    @Inject
    public BindInt(@NotNull Context context, @NotNull style.getMin getmin, @NotNull GetAuthCode getAuthCode, @NotNull parseBatteryPercentage parsebatterypercentage, @NotNull onCharacteristicWriteCompleted oncharacteristicwritecompleted, @NotNull onConnect onconnect, @NotNull hasSameIdentifiers hassameidentifiers, @NotNull Region$1 region$1, @NotNull getUniqueId getuniqueid, @NotNull convertIntentsToCallbacks convertintentstocallbacks, @NotNull toByteArray tobytearray, @NotNull didExitRegion didexitregion, @NotNull BLEManager.AnonymousClass2.C00022 r14, @NotNull BLEManager.AnonymousClass2.AnonymousClass3 r15) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(getAuthCode, Constants.JS_API_GET_AUTH_CODE);
        Intrinsics.checkNotNullParameter(parsebatterypercentage, "mapper");
        Intrinsics.checkNotNullParameter(oncharacteristicwritecompleted, "isNeedToShowToolTip");
        Intrinsics.checkNotNullParameter(onconnect, "saveShowToolTip");
        Intrinsics.checkNotNullParameter(hassameidentifiers, "getServicesWithCategory");
        Intrinsics.checkNotNullParameter(region$1, "getServicesByName");
        Intrinsics.checkNotNullParameter(getuniqueid, "getServicesByKey");
        Intrinsics.checkNotNullParameter(convertintentstocallbacks, "getFavoriteServices");
        Intrinsics.checkNotNullParameter(tobytearray, "checkFavoriteServicesFeature");
        Intrinsics.checkNotNullParameter(didexitregion, "getRawServices");
        Intrinsics.checkNotNullParameter(r14, "consultAgreement");
        Intrinsics.checkNotNullParameter(r15, "recordAgreement");
        this.isInside = context;
        this.length = getmin;
        this.toFloatRange = getAuthCode;
        this.toIntRange = parsebatterypercentage;
        this.IsOverlapping = oncharacteristicwritecompleted;
        this.toString = onconnect;
        this.FastBitmap$CoordinateSystem = hassameidentifiers;
        this.toDoubleRange = region$1;
        this.hashCode = getuniqueid;
        this.values = convertintentstocallbacks;
        this.valueOf = tobytearray;
        this.setMin = didexitregion;
        this.Grayscale$Algorithm = r14;
        this.invoke = r15;
        onInput.getDefault().register(this);
    }

    public final void setMax() {
        onInput.getDefault().unregister(this);
        this.toFloatRange.dispose();
        this.toDoubleRange.dispose();
        this.hashCode.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        this.values.dispose();
        this.valueOf.dispose();
        this.setMin.dispose();
        DanaH5.dispose();
    }

    public final void setMin() {
        this.length.showProgress();
        this.FastBitmap$CoordinateSystem.execute(hasSameIdentifiers.getMax.Companion.forFilterCategory(""), new BindInt$FastBitmap$CoordinateSystem(this), new toDoubleRange(this));
    }

    public final void setMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "csvNames");
        Intrinsics.checkNotNullParameter(str2, "filterBy");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            length(false);
            return;
        }
        Object[] array = StringsKt.split$default(charSequence, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            List listOf = CollectionsKt.listOf((String[]) Arrays.copyOf(strArr, strArr.length));
            Intrinsics.checkNotNullParameter(listOf, "names");
            Intrinsics.checkNotNullParameter(str2, "filterBy");
            getMax(listOf, str2, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void getMax(@NotNull List<String> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "names");
        Intrinsics.checkNotNullParameter(str, "filterBy");
        this.length.showProgress();
        if (Intrinsics.areEqual((Object) "name", (Object) str)) {
            this.toDoubleRange.execute(new IsOverlapping(this, z), Region$1.setMax.forGetServicesByName(list));
        } else if (Intrinsics.areEqual((Object) "key", (Object) str)) {
            this.hashCode.execute(new IsOverlapping(this, z), getUniqueId.setMax.forGetServicesByKey(list));
        }
    }

    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
        String str;
        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        if (!thirdPartyService.getMax()) {
            this.length.getMax(thirdPartyService);
        } else if (thirdPartyService.setMin != null) {
            DanaH5.openApp(thirdPartyService);
        } else if (Intrinsics.areEqual((Object) thirdPartyService.length, (Object) "POST") && thirdPartyService.toIntRange != null) {
            this.equals = thirdPartyService;
            this.setMax = CollectionsKt.emptyList();
            if (!thirdPartyService.getMin() || thirdPartyService.Grayscale$Algorithm == null) {
                length(thirdPartyService);
                return;
            }
            BLEManager.AnonymousClass2.C00022 r0 = this.Grayscale$Algorithm;
            List<String> list = thirdPartyService.Grayscale$Algorithm;
            Intrinsics.checkNotNull(list);
            r0.execute(new BLEManager.AnonymousClass2.C00022.getMin(list), new length(this, thirdPartyService), new setMax(this, thirdPartyService));
        } else if (Intrinsics.areEqual((Object) thirdPartyService.length, (Object) "GET") && thirdPartyService.IsOverlapping != null) {
            String str2 = thirdPartyService.IsOverlapping;
            if (str2 != null) {
                Map mapOf = MapsKt.mapOf(TuplesKt.to("needConsult", String.valueOf(thirdPartyService.getMin())));
                Intrinsics.checkNotNullParameter(str2, "$this$constructUrl");
                Intrinsics.checkNotNullParameter(mapOf, "params");
                Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
                for (Map.Entry entry : mapOf.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                str = buildUpon.build().toString();
                Intrinsics.checkNotNullExpressionValue(str, "url.build().toString()");
            } else {
                str = null;
            }
            thirdPartyService.IsOverlapping = str;
            getStackButtons$core.serviceKey().onNext(thirdPartyService.setMax);
            this.length.setMin(thirdPartyService);
        }
    }

    public final void length(@Nullable Intent intent, boolean z) {
        this.FastBitmap$CoordinateSystem.execute(hasSameIdentifiers.getMax.Companion.forFilterCategory(""), new toFloatRange(this, z, intent), new toIntRange(this));
    }

    public final void length(boolean z) {
        Intrinsics.checkNotNullParameter("", "categoryKey");
        List singletonList = Collections.singletonList("");
        Intrinsics.checkNotNullExpressionValue(singletonList, "Collections.singletonList(categoryKey)");
        getMax((List<String>) singletonList, false, z);
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "categoryKey");
        List singletonList = Collections.singletonList(str);
        Intrinsics.checkNotNullExpressionValue(singletonList, "Collections.singletonList(categoryKey)");
        getMax((List<String>) singletonList, false, false);
    }

    public final void length(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "categoryKeys");
        getMax(list, false, true);
    }

    public final void getMax() {
        getMax((List<String>) CollectionsKt.listOf(Category.FEATURED), true, false);
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "query");
        this.length.showProgress();
        this.FastBitmap$CoordinateSystem.execute(hasSameIdentifiers.getMax.Companion.forFilterCategory(""), new hashCode(this, str), new values(this));
    }

    public final void getMin() {
        APWebChromeClient.execute$default(this.valueOf, onReceivedIcon.INSTANCE, new getMax(this), (Function1) null, 4, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/services/ServicesPresenter$isNeedToShowToolTip$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "needToShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class invokeSuspend extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ BindInt setMax;

        invokeSuspend(BindInt bindInt) {
            this.setMax = bindInt;
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.setMax.length.dismissProgress();
            this.setMax.length.setMax(booleanValue);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMax.length.dismissProgress();
            this.setMax.length.setMax(false);
            BindInt.getMin(this.setMax, DanaLogConstants.Prefix.IS_NEED_TO_SHOW_TOOLTIP_PREFIX, th);
        }
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "scenario");
        this.length.showProgress();
        this.IsOverlapping.execute(new invokeSuspend(this), onCharacteristicWriteCompleted.getMax.forShowTooltip(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/contract/services/ServicesPresenter$saveShowToolTip$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class b extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ BindInt length;

        b(BindInt bindInt) {
            this.length = bindInt;
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            BindInt.getMin(this.length, DanaLogConstants.Prefix.SAVE_SHOW_TOOLTIP_PREFIX, th);
        }
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "scenario");
        this.toString.execute(new b(this), onConnect.getMax.forSaveShowToolTip(true, str));
    }

    private final boolean getMax(String str, ThirdPartyService thirdPartyService) {
        return setMin(str, thirdPartyService) || setMax(str, thirdPartyService) || getMin(str, thirdPartyService);
    }

    /* access modifiers changed from: private */
    public final void length(ThirdPartyService thirdPartyService) {
        GetAuthCode getAuthCode = this.toFloatRange;
        GetAuthCode.length.getMin getmin = GetAuthCode.length.Companion;
        String str = thirdPartyService.toIntRange;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = thirdPartyService.getMax;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = thirdPartyService.toString;
        if (str4 != null) {
            str2 = str4;
        }
        getAuthCode.execute(getmin.forGetAuthCode(str, str3, str2, true), new valueOf(this, thirdPartyService), new create(this, thirdPartyService));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/contract/services/ServicesPresenter$AgreementMessageEvent;", "", "agree", "", "(Z)V", "getAgree", "()Z", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private final boolean getMax;

        public setMin(boolean z) {
            this.getMax = z;
        }

        public final boolean getMax() {
            return this.getMax;
        }
    }

    @Subscribe
    public final void onReceiveAgreementMessageEvent(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
        if (setmin.getMax()) {
            for (String setmin2 : this.setMax) {
                APWebChromeClient.execute$default(this.invoke, new BLEManager.AnonymousClass2.AnonymousClass3.setMin(setmin2, true), BindInt$Grayscale$Algorithm.INSTANCE, (Function1) null, 4, (Object) null);
            }
            ThirdPartyService thirdPartyService = this.equals;
            if (thirdPartyService != null) {
                length(thirdPartyService);
                this.equals = null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/contract/services/ServicesPresenter$createFilteredServiceObserver$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "onError", "", "e", "", "onNext", "thirdPartyCategoryServices", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<List<? extends NullBeaconDataFactory.AnonymousClass1>> {
        final /* synthetic */ BindInt getMax;
        final /* synthetic */ boolean setMin;

        IsOverlapping(BindInt bindInt, boolean z) {
            this.getMax = bindInt;
            this.setMin = z;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "thirdPartyCategoryServices");
            this.getMax.length.getMin(BindInt.getMin(this.getMax.toIntRange.getMax(list, true, this.setMin)));
        }

        public final void onError(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.getMax.length.dismissProgress();
            style.getMin min = this.getMax.length;
            Context min2 = this.getMax.isInside;
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = min2.getString(R.string.general_error_msg);
            }
            min.onError(str);
        }
    }

    private final void getMax(List<String> list, boolean z, boolean z2) {
        this.length.showProgress();
        this.FastBitmap$CoordinateSystem.execute(hasSameIdentifiers.getMax.Companion.forFilterCategory(list), new toString(this, list, z, z2), new invoke(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/services/ServicesPresenter$updateHomeServices$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "onError", "", "e", "", "onNext", "service", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onNavigationEvent extends GriverAppVirtualHostProxy<NullBeaconDataFactory.AnonymousClass1> {
        final /* synthetic */ List length;
        final /* synthetic */ BindInt setMin;

        onNavigationEvent(BindInt bindInt, List list) {
            this.setMin = bindInt;
            this.length = list;
        }

        public final /* synthetic */ void onNext(Object obj) {
            NullBeaconDataFactory.AnonymousClass1 r2 = (NullBeaconDataFactory.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r2, FeatureParams.OPEN_SERVICE);
            parseBatteryPercentage unused = this.setMin.toIntRange;
            Intrinsics.checkNotNullParameter(r2, "entity");
            this.setMin.length.setMax((List<ThirdPartyService>) BindInt.getMin(parseBatteryPercentage.setMin(CollectionsKt.listOf(r2))));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.FAVORITE_SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
            style.getMin min = this.setMin.length;
            parseBatteryPercentage unused = this.setMin.toIntRange;
            min.setMax((List<ThirdPartyService>) CollectionsKt.toMutableList(parseBatteryPercentage.setMin(this.length)));
        }
    }

    /* access modifiers changed from: private */
    public static List<ThirdPartyService> getMin(List<ThirdPartyService> list) {
        String str;
        if (list.isEmpty() || list.size() == 1) {
            return CollectionsKt.toMutableList(list);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            ThirdPartyService thirdPartyService = (ThirdPartyService) next;
            if (thirdPartyService.setMax.length() == 0) {
                str = thirdPartyService.isInside;
            } else {
                str = thirdPartyService.setMax;
            }
            if (hashSet.add(str)) {
                arrayList.add(next);
            }
        }
        return CollectionsKt.toMutableList(arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/contract/services/ServicesPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    private static boolean setMin(String str, ThirdPartyService thirdPartyService) {
        List<String> list = thirdPartyService.invokeSuspend;
        if (list != null) {
            Iterable<String> iterable = list;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (String contains : iterable) {
                if (StringsKt.contains((CharSequence) contains, (CharSequence) str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean setMax(String str, ThirdPartyService thirdPartyService) {
        boolean z;
        Iterable<String> ofNotNull = SetsKt.setOfNotNull((T[]) new String[]{thirdPartyService.isInside, thirdPartyService.equals});
        if (!(ofNotNull instanceof Collection) || !((Collection) ofNotNull).isEmpty()) {
            for (String str2 : ofNotNull) {
                CharSequence charSequence = str;
                if (StringsKt.contains((CharSequence) str2, charSequence, true) || StringsKt.contains((CharSequence) CornerMarkingDataProvider.AnonymousClass3.setMin(this.isInside, str2, str2), charSequence, true)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean getMin(String str, ThirdPartyService thirdPartyService) {
        String str2 = thirdPartyService.toDoubleRange;
        if (str2 == null) {
            str2 = "";
        }
        return StringsKt.contains((CharSequence) str2, (CharSequence) str, true);
    }

    public static final /* synthetic */ void setMax(BindInt bindInt, List list, boolean z, String str, boolean z2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        if (z) {
            if (bindInt.getMax) {
                bindInt.values.execute(new onNavigationEvent(bindInt, list));
                return;
            }
            bindInt.length.setMax(getMin((List<ThirdPartyService>) CollectionsKt.toMutableList(parseBatteryPercentage.setMin(list))));
        } else if (!bindInt.getMax || (!isEmpty && !Intrinsics.areEqual((Object) Category.FEATURED, (Object) str) && !Intrinsics.areEqual((Object) Category.GLOBAL_NETWORK_FEATURED, (Object) str))) {
            bindInt.length.setMin((List<ThirdPartyService>) CollectionsKt.toMutableList(bindInt.toIntRange.getMax(list, true, z2)));
        } else {
            bindInt.values.execute(new BindInt$Mean$Arithmetic(bindInt, list, isEmpty));
        }
    }

    public static final /* synthetic */ void getMin(BindInt bindInt, String str, Throwable th) {
        String str2 = invokeSuspend;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(bindInt.getClass().getName());
        sb.append(" onError");
        updateActionSheetContent.e(str2, sb.toString(), th);
    }

    public static final /* synthetic */ List getMin(BindInt bindInt, String str, List list) {
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ThirdPartyService thirdPartyService = (ThirdPartyService) next;
            if (thirdPartyService.values == 3 || !bindInt.getMax(str, thirdPartyService)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List mutableList = CollectionsKt.toMutableList((List) arrayList);
        if ((!mutableList.isEmpty()) && ((ThirdPartyService) mutableList.get(mutableList.size() - 1)).values == 3) {
            mutableList.remove(mutableList.get(mutableList.size() - 1));
        }
        return mutableList;
    }

    public static final /* synthetic */ void setMin(List list, NullBeaconDataFactory.AnonymousClass1 r4) {
        if (Intrinsics.areEqual((Object) Category.FEATURED, (Object) ((NullBeaconDataFactory.AnonymousClass1) list.get(0)).getKey())) {
            list.set(0, r4);
        }
    }

    @JvmDefault
    public final void length() {
        length(false);
    }

    @JvmDefault
    public final void length(@NotNull String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-240357439, oncanceled);
            onCancelLoad.getMin(-240357439, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "categoryKey");
        getMax(str);
    }
}
