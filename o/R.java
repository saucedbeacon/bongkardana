package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import dagger.internal.InjectedFieldSignature;
import id.dana.constants.ErrorCode;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.data.base.NetworkException;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.deeplink.DeepLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.qrbarcode.NotWhitelistedUrlException;
import id.dana.data.qrbarcode.ScanSelfException;
import id.dana.data.qrbarcode.repository.source.network.QrBarcodeException;
import id.dana.data.qrbarcode.repository.source.network.QrBarcodeExpiredException;
import id.dana.di.PerActivity;
import id.dana.domain.qrbarcode.interactor.GetUserStaticQr;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;
import io.branch.referral.util.LinkProperties;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BLEManager;
import o.GetAboutInfoResult;
import o.GriverPrepareInterceptor;
import o.GriverTransActivity;
import o.InitParams;
import o.OnTouch;
import o.R;
import o.ResourceProviderExtension;
import o.TinyBlurMenu;
import o.TitleBarRightButtonView;
import o.VisitNode;
import o.b;
import o.callback;
import o.negativeListener;
import o.onDelete;
import o.setTextSpacing;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.constructor.ConstructorException;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.NodeId;

public final class R implements getAdapterPosition<OnItemSelected$Callback> {
    private final b.C0007b<decodeByImageDecoder> getMax;
    private final b.C0007b<callback.getMin> length;
    private final b.C0007b<Context> setMax;

    public interface id {

        public interface getMax extends onDelete.getMin {
            void getMax(String str, String str2, String str3);

            void getMin();

            void length();

            void setMax(String str, String str2, @Nullable String str3);

            void setMin(String str, String str2, @Nullable String str3);
        }

        public interface length extends onDelete.length {
            void getMax();

            void getMax(String str);

            void getMax(fillPageCommonInfo fillpagecommoninfo);

            void getMin();

            void getMin(String str);

            void length();

            String setMax();

            void setMax(fillPageCommonInfo fillpagecommoninfo);

            void setMin();
        }
    }

    final class layout implements styleable.setMin {
        public static final layout getMax = new layout();

        public final void getMax() {
            styleable.getMax();
        }
    }

    final class string implements Function1 {
        private final styleable setMax;

        public string(styleable styleable) {
            this.setMax = styleable;
        }

        public final Object invoke(Object obj) {
            return styleable.getMin(this.setMax, (List) obj);
        }
    }

    final class style implements Function1 {
        private final styleable getMax;

        public style(styleable styleable) {
            this.getMax = styleable;
        }

        public final Object invoke(Object obj) {
            return styleable.setMax(this.getMax, (Throwable) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final class array implements RedDotManager {
        private final /* synthetic */ Function1 setMax;

        public array(Function1 function1) {
            this.setMax = function1;
        }

        public final /* synthetic */ void accept(Object obj) {
            Intrinsics.checkNotNullExpressionValue(this.setMax.invoke(obj), "invoke(...)");
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final class mipmap implements GoogleMap.OnMarkerClickListener {
        private final /* synthetic */ Function1 setMax;

        public mipmap(Function1 function1) {
            this.setMax = function1;
        }

        public final /* synthetic */ boolean onMarkerClick(Marker marker) {
            Object invoke = this.setMax.invoke(marker);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
            return ((Boolean) invoke).booleanValue();
        }
    }

    final class anim implements RedDotDrawable {
        private final getVisitUrl getMax;

        public anim(getVisitUrl getvisiturl) {
            this.getMax = getvisiturl;
        }

        public final Object apply(Object obj) {
            return this.getMax.apply(obj);
        }
    }

    public final class attr implements getAdapterPosition<Activity> {
        private final ScanQrModule setMax;

        private attr(ScanQrModule scanQrModule) {
            this.setMax = scanQrModule;
        }

        public static attr setMax(ScanQrModule scanQrModule) {
            return new attr(scanQrModule);
        }

        @Nullable
        public final /* synthetic */ Object get() {
            return this.setMax.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\b\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/contract/staticqr/GetStaticQrPresenter;", "Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;", "view", "Lid/dana/contract/staticqr/GetStaticQrContract$View;", "getUserStaticQr", "Lid/dana/domain/qrbarcode/interactor/GetUserStaticQr;", "getUserDynamicQr", "Lid/dana/domain/qrbarcode/interactor/GetUserDynamicQr;", "isQrisTcicoEnable", "Lid/dana/domain/qrbarcode/interactor/IsQrisTcicoEnable;", "(Lid/dana/contract/staticqr/GetStaticQrContract$View;Lid/dana/domain/qrbarcode/interactor/GetUserStaticQr;Lid/dana/domain/qrbarcode/interactor/GetUserDynamicQr;Lid/dana/domain/qrbarcode/interactor/IsQrisTcicoEnable;)V", "lastQr", "", "userDynamicQrObserver", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/qrbarcode/QrUserResult;", "getDynamicProfileQr", "", "getStaticProfileQr", "onDestroy", "resetDynamicQr", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class dimen implements OnTouch.setMin {
        private final removeApp IsOverlapping;
        /* access modifiers changed from: private */
        public final OnTouch.length getMax;
        private final GetUserStaticQr getMin;
        private GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> length;
        /* access modifiers changed from: private */
        public final getLocalResponse setMax;
        @org.jetbrains.annotations.Nullable
        @JvmField
        public String setMin = "";

        @Inject
        public dimen(@NotNull OnTouch.length length2, @NotNull GetUserStaticQr getUserStaticQr, @NotNull getLocalResponse getlocalresponse, @NotNull removeApp removeapp) {
            Intrinsics.checkNotNullParameter(length2, "view");
            Intrinsics.checkNotNullParameter(getUserStaticQr, "getUserStaticQr");
            Intrinsics.checkNotNullParameter(getlocalresponse, "getUserDynamicQr");
            Intrinsics.checkNotNullParameter(removeapp, "isQrisTcicoEnable");
            this.getMax = length2;
            this.getMin = getUserStaticQr;
            this.setMax = getlocalresponse;
            this.IsOverlapping = removeapp;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/staticqr/GetStaticQrPresenter$getDynamicProfileQr$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/qrbarcode/QrUserResult;", "onError", "", "e", "", "onNext", "qrUserResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> {
            final /* synthetic */ dimen getMin;

            setMax(dimen dimen) {
                this.getMin = dimen;
            }

            public final /* synthetic */ void onNext(Object obj) {
                GriverPrepareInterceptor.AnonymousClass1 r3 = (GriverPrepareInterceptor.AnonymousClass1) obj;
                Intrinsics.checkNotNullParameter(r3, "qrUserResult");
                if (!Intrinsics.areEqual((Object) this.getMin.setMin, (Object) r3.getQrCode())) {
                    this.getMin.getMax.dismissProgress();
                    this.getMin.getMax.getMin(r3.getQrCode());
                    StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.STATIC_QRCODE_PREFIX);
                    sb.append(getClass().getName());
                    sb.append("onNext");
                    sb.append(r3.getQrCode());
                    updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
                } else {
                    this.getMin.getMax.getMin("");
                    this.getMin.setMax.dispose();
                    this.getMin.setMin = "";
                }
                this.getMin.setMin = r3.getQrCode();
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.STATIC_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
                this.getMin.getMax.dismissProgress();
                this.getMin.getMax.onError(th.getMessage());
            }
        }

        public final void setMin() {
            getLocalResponse getlocalresponse = this.setMax;
            GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> setmax = new setMax(this);
            this.length = setmax;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userDynamicQrObserver");
            }
            getlocalresponse.execute(setmax);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/staticqr/GetStaticQrPresenter$getStaticProfileQr$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/qrbarcode/QrUserResult;", "onError", "", "e", "", "onNext", "qrUserResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> {
            final /* synthetic */ dimen setMin;

            getMax(dimen dimen) {
                this.setMin = dimen;
            }

            public final /* synthetic */ void onNext(Object obj) {
                GriverPrepareInterceptor.AnonymousClass1 r3 = (GriverPrepareInterceptor.AnonymousClass1) obj;
                Intrinsics.checkNotNullParameter(r3, "qrUserResult");
                this.setMin.getMax.dismissProgress();
                this.setMin.getMax.getMin(r3.getQrCode());
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.STATIC_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("onNext");
                sb.append(r3.getQrCode());
                updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.STATIC_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
                this.setMin.getMax.dismissProgress();
                this.setMin.getMax.onError(th.getMessage());
            }
        }

        public final void length() {
            this.getMin.execute(new getMax(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/staticqr/GetStaticQrPresenter$isQrisTcicoEnable$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "enable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMin extends GriverAppVirtualHostProxy<Boolean> {
            final /* synthetic */ dimen getMin;

            setMin(dimen dimen) {
                this.getMin = dimen;
            }

            public final /* synthetic */ void onNext(Object obj) {
                this.getMin.getMax.setMin(((Boolean) obj).booleanValue());
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.STATIC_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
                this.getMin.getMax.dismissProgress();
                this.getMin.getMax.onError(th.getMessage());
            }
        }

        public final void getMin() {
            this.IsOverlapping.execute(new setMin(this));
        }

        public final void getMax() {
            this.setMax.dispose();
        }

        public final void setMax() {
            this.getMin.dispose();
            this.setMax.dispose();
            this.IsOverlapping.dispose();
            this.setMax.dispose();
        }
    }

    public final class drawable implements getAdapterPosition<id.getMax> {
        private final b.C0007b<styleable> setMax;
        private final ScanQrModule setMin;

        private drawable(ScanQrModule scanQrModule, b.C0007b<styleable> bVar) {
            this.setMin = scanQrModule;
            this.setMax = bVar;
        }

        public static drawable setMin(ScanQrModule scanQrModule, b.C0007b<styleable> bVar) {
            return new drawable(scanQrModule, bVar);
        }

        public final /* synthetic */ Object get() {
            id.getMax length = this.setMin.length(this.setMax.get());
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class integer implements getAdapterPosition<id.length> {
        private final b.C0007b<method> getMax;
        private final ScanQrModule getMin;

        private integer(ScanQrModule scanQrModule, b.C0007b<method> bVar) {
            this.getMin = scanQrModule;
            this.getMax = bVar;
        }

        public static integer setMin(ScanQrModule scanQrModule, b.C0007b<method> bVar) {
            return new integer(scanQrModule, bVar);
        }

        public final /* synthetic */ Object get() {
            id.length max = this.getMin.setMax(this.getMax.get());
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private R(b.C0007b<callback.getMin> bVar, b.C0007b<decodeByImageDecoder> bVar2, b.C0007b<Context> bVar3) {
        this.length = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
    }

    public final class color implements getAdapterPosition<dimen> {
        private final b.C0007b<removeApp> getMax;
        private final b.C0007b<OnTouch.length> getMin;
        private final b.C0007b<getLocalResponse> setMax;
        private final b.C0007b<GetUserStaticQr> setMin;

        private color(b.C0007b<OnTouch.length> bVar, b.C0007b<GetUserStaticQr> bVar2, b.C0007b<getLocalResponse> bVar3, b.C0007b<removeApp> bVar4) {
            this.getMin = bVar;
            this.setMin = bVar2;
            this.setMax = bVar3;
            this.getMax = bVar4;
        }

        public static color length(b.C0007b<OnTouch.length> bVar, b.C0007b<GetUserStaticQr> bVar2, b.C0007b<getLocalResponse> bVar3, b.C0007b<removeApp> bVar4) {
            return new color(bVar, bVar2, bVar3, bVar4);
        }

        public final /* synthetic */ Object get() {
            return new dimen(this.getMin.get(), this.setMin.get(), this.setMax.get(), this.getMax.get());
        }
    }

    public static R setMax(b.C0007b<callback.getMin> bVar, b.C0007b<decodeByImageDecoder> bVar2, b.C0007b<Context> bVar3) {
        return new R(bVar, bVar2, bVar3);
    }

    @Singleton
    public class raw implements setPageId {
        private final Context context;

        @Inject
        public raw(Context context2) {
            this.context = context2;
        }

        public TitleBarRightButtonView.AnonymousClass1<Boolean> saveProfileQrDeepLink(String str, boolean z) {
            throw new UnsupportedOperationException();
        }

        public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateReferralDeepLink(String str) {
            if (str == null) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
            }
            StringBuilder sb = new StringBuilder("https://link.dana.id/");
            sb.append(String.format(BranchLinkConstant.PrefixAlias.REFERRAL, new Object[]{str}));
            return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1(sb.toString()));
        }

        public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateTransferQrDeepLink(String str, String str2, String str3, String str4, String str5) {
            if (str2 == null || TextUtils.isEmpty(str)) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
            }
            return generate(getBranchObjectProperties(String.format("minta/%s", new Object[]{str}), str4, str5, BranchLinkConstant.DeepLinkImageUrl.REQUEST_MONEY), str, str2, str3, "minta/%s", true, DeepLinkConstant.Tag.P2P_TRANSFER, DeepLinkConstant.Tag.REQUEST_MONEY);
        }

        public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateProfileQrDeepLink(String str, String str2, String str3, String str4, String str5, boolean z) {
            if (str2 == null || TextUtils.isEmpty(str)) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
            }
            if (!z || !TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
                BranchUniversalObject branchObjectProperties = getBranchObjectProperties(String.format(BranchLinkConstant.CanonicalIdStarter.PROFILE, new Object[]{str}), str4, str5, BranchLinkConstant.DeepLinkImageUrl.PROFILE_QR);
                return generate(branchObjectProperties, str, str2, str3, BranchLinkConstant.PrefixAlias.QR, false, new String[0]);
            }
            VisitNode.AnonymousClass1 r0 = new VisitNode.AnonymousClass1();
            r0.setLink(str2);
            return TitleBarRightButtonView.AnonymousClass1.just(r0);
        }

        public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateSplitBillQrDeepLink(String str, String str2, String str3, String str4, String str5, String str6) {
            if (str3 == null || TextUtils.isEmpty(str)) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
            }
            return generate(getBranchObjectProperties(String.format("patungan/%s", new Object[]{str}), str5, str6, BranchLinkConstant.DeepLinkImageUrl.SPLIT_BILL), str2, str3, str4, "patungan/%s", false, DeepLinkConstant.Tag.P2P_TRANSFER, "Split Bill");
        }

        public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateSplitBillDetailDeepLink(String str) {
            if (TextUtils.isEmpty(str)) {
                return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1());
            }
            StringBuilder sb = new StringBuilder("https://link.dana.id/");
            sb.append(String.format(BranchLinkConstant.PrefixAlias.SPLIT_BILL_DETAIL, new Object[]{str}));
            return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1(sb.toString()));
        }

        private TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generate(BranchUniversalObject branchUniversalObject, String str, String str2, String str3, String str4, boolean z, String... strArr) {
            return TitleBarRightButtonView.AnonymousClass1.defer(new Callable(this, branchUniversalObject, str, str4, str2, str3, z, strArr) {
                private final String IsOverlapping;
                private final BranchUniversalObject getMax;
                private final String getMin;
                private final boolean isInside;
                private final String length;
                private final R.raw setMax;
                private final String setMin;
                private final String[] toIntRange;

                public final java.lang.Object call(
/*
Method generation error in method: o.PageNode.7.call():java.lang.Object, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.PageNode.7.call():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }

        /* access modifiers changed from: private */
        public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generate$2(BranchUniversalObject branchUniversalObject, String str, String str2, String str3, String str4, boolean z, String[] strArr) throws Exception {
            return TitleBarRightButtonView.AnonymousClass1.create(new TitleBarRightButtonView.AnonymousClass2.AnonymousClass1(this, branchUniversalObject, str, str2, str3, str4, z, strArr) {
                private final String[] equals;
                private final String getMax;
                private final BranchUniversalObject getMin;
                private final String isInside;
                private final String length;
                private final R.raw setMax;
                private final String setMin;
                private final boolean toIntRange;

                public final void subscribe(
/*
Method generation error in method: o.PageNode.6.1.subscribe(o.TitleBarRightButtonView$2):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.PageNode.6.1.subscribe(o.TitleBarRightButtonView$2):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$generate$1(BranchUniversalObject branchUniversalObject, String str, String str2, String str3, String str4, boolean z, String[] strArr, TitleBarRightButtonView.AnonymousClass2 r20) throws Exception {
            VisitNode.AnonymousClass1 r2 = new VisitNode.AnonymousClass1();
            Context context2 = this.context;
            LinkProperties decodeLinkProperties = getDecodeLinkProperties(str, str2, str3, str4, z, strArr);
            BranchUniversalObject branchUniversalObject2 = branchUniversalObject;
            branchUniversalObject.length(new setRightButtonView(context2), decodeLinkProperties).setMax((Branch.getMin) new setVisitUrl(this, r2, str4, r20, z, str, str2));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$generate$0(VisitNode.AnonymousClass1 r3, String str, TitleBarRightButtonView.AnonymousClass2 r5, boolean z, String str2, String str3, String str4, TinyBlurMenu.AnonymousClass8 r10) {
            if (r10 == null) {
                r3.setLink(str4);
                r3.setReferralCode(str);
                r5.onNext(r3);
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PROFILE_QR);
                sb.append(getClass().getName());
                sb.append("Success");
                sb.append(r3.getLink());
                updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
            } else if (isAliasExists(r10, z)) {
                r3.setLink(String.format("https://link.dana.id/%s", new Object[]{getInnerUrlAlias(str2, z, str3, str)}));
                r3.setReferralCode(str);
                r5.onNext(r3);
                StringBuilder sb2 = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PROFILE_QR);
                sb2.append(getClass().getName());
                sb2.append("Error");
                sb2.append(r3.getLink());
                updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb2.toString());
            } else {
                updateActionSheetContent.exception(DanaLogConstants.BizType.BRANCH_DEEPLINK_GENERATION, DanaLogConstants.ExceptionType.DEEPLINK_BRANCH_FAIL, r10.setMin);
                r5.onError(new Throwable(r10.setMin));
            }
        }

        private BranchUniversalObject getBranchObjectProperties(String str, String str2, String str3, String str4) {
            BranchUniversalObject branchUniversalObject = new BranchUniversalObject();
            branchUniversalObject.getMin = str;
            branchUniversalObject.length = str2;
            branchUniversalObject.getMax = str3;
            branchUniversalObject.setMin = "http://a.m.dana.id/resource/imgs/skywalker/deeplinkpreview/".concat(String.valueOf(str4));
            branchUniversalObject.setMax = BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC;
            branchUniversalObject.IsOverlapping = BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC;
            return branchUniversalObject;
        }

        private LinkProperties getDecodeLinkProperties(String str, String str2, String str3, String str4, boolean z, String... strArr) {
            LinkProperties linkProperties = new LinkProperties();
            linkProperties.length = getInnerUrlAlias(str, z, str2, str4);
            linkProperties.toIntRange.put("path", BranchLinkConstant.PathTarget.DECODE);
            if (!TextUtils.isEmpty(str4)) {
                linkProperties.toIntRange.put(BranchLinkConstant.PayloadKey.REFERRAL, str4);
            }
            linkProperties.toIntRange.put(BranchLinkConstant.PayloadKey.FULL_URL, str3);
            if (strArr.length > 0) {
                linkProperties.getMin.addAll(Arrays.asList(strArr));
            }
            return linkProperties;
        }

        private String getInnerUrlAlias(String str, boolean z, String str2, String str3) {
            if (z) {
                return String.format(str2, new Object[]{PrepareContext.generateDynamicCode(str)});
            }
            return String.format(str2, new Object[]{PrepareContext.generateStaticCode(str, !TextUtils.isEmpty(str3))});
        }

        private boolean isAliasExists(TinyBlurMenu.AnonymousClass8 r2, boolean z) {
            return r2.getMin == -105 && !z;
        }
    }

    public final class xml implements getBindingAdapter<NewNearbyMeActivity> {
        @InjectedFieldSignature("id.dana.nearbyrevamp.NewNearbyMeActivity.mapHelper")
        public static void getMax(NewNearbyMeActivity newNearbyMeActivity, GriverDefaultLoadingView griverDefaultLoadingView) {
            newNearbyMeActivity.mapHelper = griverDefaultLoadingView;
        }

        @InjectedFieldSignature("id.dana.nearbyrevamp.NewNearbyMeActivity.nearbyPresenter")
        public static void getMax(NewNearbyMeActivity newNearbyMeActivity, setTextSpacing.setMin setmin) {
            newNearbyMeActivity.nearbyPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.nearbyrevamp.NewNearbyMeActivity.merchantDetailPresenter")
        public static void setMin(NewNearbyMeActivity newNearbyMeActivity, GriverTransActivity.Lite1.setMax setmax) {
            newNearbyMeActivity.merchantDetailPresenter = setmax;
        }

        @InjectedFieldSignature("id.dana.nearbyrevamp.NewNearbyMeActivity.merchantCategoryPresenter")
        public static void setMax(NewNearbyMeActivity newNearbyMeActivity, GetAboutInfoResult.getMax getmax) {
            newNearbyMeActivity.merchantCategoryPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.nearbyrevamp.NewNearbyMeActivity.photoPreviewPresenter")
        public static void setMin(NewNearbyMeActivity newNearbyMeActivity, negativeListener.getMax getmax) {
            newNearbyMeActivity.photoPreviewPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.nearbyrevamp.NewNearbyMeActivity.nearbyAnalyticTracker")
        public static void setMin(NewNearbyMeActivity newNearbyMeActivity, t tVar) {
            newNearbyMeActivity.nearbyAnalyticTracker = tVar;
        }
    }

    @PerActivity
    public final class styleable implements id.getMax {
        private final setDataRequestNotifier IsOverlapping;
        private final getPerformanceTracker equals;
        /* access modifiers changed from: private */
        public final Context getMax;
        private final GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1 getMin;
        private final BLEManager.AnonymousClass2.AnonymousClass1 isInside;
        /* access modifiers changed from: private */
        public final id.length length;
        private final ResourceProviderExtension setMax;
        /* access modifiers changed from: private */
        public final getTinyLocalStorageInfo setMin;
        /* access modifiers changed from: private */
        public disconnect toDoubleRange = null;
        private final requestAppWithAppId toFloatRange;
        private List<String> toIntRange;

        public interface setMin {
            void getMax();
        }

        static /* synthetic */ void getMax() {
        }

        @Inject
        public styleable(Context context, id.length length2, ResourceProviderExtension resourceProviderExtension, GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1 r5, getTinyLocalStorageInfo gettinylocalstorageinfo, getPerformanceTracker getperformancetracker, setDataRequestNotifier setdatarequestnotifier, BLEManager.AnonymousClass2.AnonymousClass1 r9, requestAppWithAppId requestappwithappid) {
            this.getMax = context;
            this.length = length2;
            this.setMax = resourceProviderExtension;
            this.getMin = r5;
            this.setMin = gettinylocalstorageinfo;
            this.equals = getperformancetracker;
            this.IsOverlapping = setdatarequestnotifier;
            this.isInside = r9;
            this.toFloatRange = requestappwithappid;
        }

        public final void setMin(final String str, final String str2, @Nullable String str3) {
            if (!setMin()) {
                this.length.showProgress();
                ResourceProviderExtension resourceProviderExtension = this.setMax;
                AnonymousClass2 r1 = new GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1 r3 = (GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1) obj;
                        if (r3.isSuccess()) {
                            getTinyLocalStorageInfo unused = styleable.this.setMin;
                            fillPageCommonInfo max = getTinyLocalStorageInfo.getMax(r3);
                            max.getBizInfo().invoke = str;
                            max.setSource(str2);
                            styleable.setMin(styleable.this, max);
                            styleable.this.IsOverlapping.execute(onReceivedIcon.INSTANCE, new ViewCollections(styleable.this, max), new ListenerClass(styleable.this, max));
                            return;
                        }
                        styleable.this.length.dismissProgress();
                    }

                    public final void onError(Throwable th) {
                        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SCAN_QRCODE_PREFIX);
                        sb.append(getClass().getName());
                        sb.append("getDecodedQrBarcode:onError");
                        updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
                        styleable.this.length.dismissProgress();
                        styleable.getMax(styleable.this, th);
                    }
                };
                Intrinsics.checkNotNullParameter(str, "$this$removeDeepLinkSourceParam");
                Intrinsics.checkNotNullParameter("request_money", "source");
                String format = String.format("?params=[source=%s]", Arrays.copyOf(new Object[]{"request_money"}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
                resourceProviderExtension.execute(r1, ResourceProviderExtension.setMax.forDecodeQrBarcode(StringsKt.replace$default(str, format, "", false, 4, (Object) null), str3, setMax(str, this.toIntRange)));
            }
        }

        public final void getMin() {
            final layout layout = R.layout.getMax;
            this.isInside.dispose();
            this.isInside.execute(new GriverAppVirtualHostProxy<disconnect>() {
                public final /* synthetic */ void onNext(Object obj) {
                    disconnect unused = styleable.this.toDoubleRange = (disconnect) obj;
                    r0.getMax();
                }

                public final void onError(Throwable th) {
                    String str;
                    disconnect unused = styleable.this.toDoubleRange = null;
                    id.length max = styleable.this.length;
                    Context min = styleable.this.getMax;
                    if (th instanceof NetworkException) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = min.getString(id.dana.R.string.general_error_msg);
                    }
                    max.onError(str);
                }
            });
        }

        public final void length() {
            this.toFloatRange.execute(onReceivedIcon.INSTANCE, new string(this), new style(this));
        }

        public final void getMax(final String str, final String str2, String str3) {
            if (!setMin()) {
                this.length.showProgress();
                this.getMin.execute(new GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1 r3 = (GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1) obj;
                        styleable.this.length.dismissProgress();
                        if (r3.isSuccess()) {
                            getTinyLocalStorageInfo unused = styleable.this.setMin;
                            fillPageCommonInfo max = getTinyLocalStorageInfo.getMax(r3);
                            max.getBizInfo().invoke = str;
                            max.setSource(str2);
                            styleable.setMin(styleable.this, max);
                            styleable.this.length.getMax(max);
                        }
                    }

                    public final void onError(Throwable th) {
                        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SCAN_QRCODE_PREFIX);
                        sb.append(getClass().getName());
                        sb.append("getDecodedQrisTopUp:onError");
                        updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
                        styleable.this.length.dismissProgress();
                        styleable.getMax(styleable.this, th);
                    }
                }, new GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1.setMax(str, str3, setMax(str, this.toIntRange).booleanValue()));
            }
        }

        public final void setMax(String str, String str2, @Nullable String str3) {
            final targetType targettype = new targetType(this, str, str2, str3);
            this.isInside.dispose();
            this.isInside.execute(new GriverAppVirtualHostProxy<disconnect>() {
                public final /* synthetic */ void onNext(Object obj) {
                    disconnect unused = styleable.this.toDoubleRange = (disconnect) obj;
                    targettype.getMax();
                }

                public final void onError(Throwable th) {
                    String str;
                    disconnect unused = styleable.this.toDoubleRange = null;
                    id.length max = styleable.this.length;
                    Context min = styleable.this.getMax;
                    if (th instanceof NetworkException) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = min.getString(id.dana.R.string.general_error_msg);
                    }
                    max.onError(str);
                }
            });
        }

        /* access modifiers changed from: private */
        public void setMin(fillPageCommonInfo fillpagecommoninfo) {
            disconnect disconnect = this.toDoubleRange;
            if (disconnect == null || !disconnect.isUserAndAccountStatusEnable()) {
                this.length.dismissProgress();
                this.length.onError(this.getMax.getString(id.dana.R.string.error_init_transfer));
                return;
            }
            this.length.dismissProgress();
            this.length.setMax(fillpagecommoninfo);
        }

        private void getMax(fillPageCommonInfo fillpagecommoninfo) {
            if (this.toDoubleRange == null) {
                final Unbinder unbinder = new Unbinder(this, fillpagecommoninfo);
                this.isInside.dispose();
                this.isInside.execute(new GriverAppVirtualHostProxy<disconnect>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        disconnect unused = styleable.this.toDoubleRange = (disconnect) obj;
                        targettype.getMax();
                    }

                    public final void onError(Throwable th) {
                        String str;
                        disconnect unused = styleable.this.toDoubleRange = null;
                        id.length max = styleable.this.length;
                        Context min = styleable.this.getMax;
                        if (th instanceof NetworkException) {
                            str = ((NetworkException) th).getMessage();
                        } else {
                            str = min.getString(id.dana.R.string.general_error_msg);
                        }
                        max.onError(str);
                    }
                });
                return;
            }
            setMin(fillpagecommoninfo);
        }

        private boolean setMin() {
            if (setTopBackgroundColor.getMin(this.getMax)) {
                return false;
            }
            setMax();
            return true;
        }

        private static Boolean setMax(String str, List<String> list) {
            if (list != null) {
                for (String compile : list) {
                    if (Pattern.compile(compile).matcher(str).find()) {
                        return Boolean.TRUE;
                    }
                }
            }
            return Boolean.FALSE;
        }

        public final void setMax() {
            this.setMax.dispose();
            this.getMin.dispose();
            this.IsOverlapping.dispose();
            this.isInside.dispose();
            this.toFloatRange.dispose();
        }

        static /* synthetic */ void setMin(styleable styleable, fillPageCommonInfo fillpagecommoninfo) {
            Bundle bundle = new Bundle();
            bundle.putString("bizType", fillpagecommoninfo.getBizType());
            bundle.putString("UTDID", styleable.equals.getDeviceUtdId());
            HashMap hashMap = new HashMap();
            hashMap.put("bizType", fillpagecommoninfo.getBizType());
            hashMap.put("UTDID", styleable.equals.getDeviceUtdId());
            genTextSelector.setMax(new setWidth(styleable.getMax, "scan_qr", hashMap), new AUBubbleDrawable(styleable.getMax, "scan_qr", hashMap), new getActivityByContext(styleable.getMax, "scan_qr", bundle));
        }

        static /* synthetic */ void getMax(styleable styleable, Throwable th) {
            String str;
            if (th instanceof ScanSelfException) {
                styleable.length.getMax();
            } else if (th instanceof NotWhitelistedUrlException) {
                styleable.length.setMin();
            } else if (!(th instanceof QrBarcodeException)) {
                id.length length2 = styleable.length;
                Context context = styleable.getMax;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = context.getString(id.dana.R.string.general_error_msg);
                }
                length2.onError(str);
            } else if (th instanceof QrBarcodeExpiredException) {
                styleable.length.getMin();
            } else {
                QrBarcodeException qrBarcodeException = (QrBarcodeException) th;
                if (ErrorCode.USER_IS_NOT_PAYER.equals(qrBarcodeException.getErrorCode())) {
                    styleable.length.length();
                    return;
                }
                styleable.length.getMin(qrBarcodeException.errorMessage());
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SCAN_QRCODE_PREFIX);
                sb.append(styleable.getClass().getName());
                sb.append("getDecodedQrBarcode:decodedScan = false");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
            }
        }

        static /* synthetic */ Unit setMax(styleable styleable, Throwable th) {
            String str;
            id.length length2 = styleable.length;
            Context context = styleable.getMax;
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = context.getString(id.dana.R.string.general_error_msg);
            }
            length2.onError(str);
            return Unit.INSTANCE;
        }

        static /* synthetic */ Unit getMax(styleable styleable, fillPageCommonInfo fillpagecommoninfo, Throwable th) {
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SCAN_QRCODE_PREFIX);
            sb.append(styleable.getClass().getName());
            sb.append("checkIsSendMoneyV2Enable:onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
            styleable.getMax(fillpagecommoninfo);
            return null;
        }

        static /* synthetic */ Unit getMin(styleable styleable, List list) {
            ArrayList arrayList = new ArrayList();
            styleable.toIntRange = arrayList;
            arrayList.addAll(list);
            return Unit.INSTANCE;
        }

        static /* synthetic */ Unit setMin(styleable styleable, fillPageCommonInfo fillpagecommoninfo, Boolean bool) {
            if (bool.booleanValue()) {
                fillpagecommoninfo.setSendMoneyV2(true);
            }
            styleable.getMax(fillpagecommoninfo);
            return null;
        }
    }

    public abstract class bool {
        protected getEvVer FastBitmap$CoordinateSystem;
        public boolean IsOverlapping;
        protected getLastPage equals;
        protected final Map<getLastPage, DeviceIdProvider> getMax;
        protected getFeVer getMin;
        protected final Map<getLastPage, Class<? extends Object>> hashCode;
        private boolean invoke;
        public boolean isInside;
        protected final Map<String, DeviceIdProvider> length;
        final Map<getLanguage, Object> setMax;
        protected final Map<NodeId, DeviceIdProvider> setMin;
        private final Set<getLanguage> toDoubleRange;
        protected final Map<Class<? extends Object>, setFmt> toFloatRange;
        public refreshSessionID toIntRange;
        private final ArrayList<getMax<Map<Object, Object>, getMax<Object, Object>>> toString;
        private boolean valueOf;
        private final ArrayList<getMax<Set<Object>, Object>> values;

        public bool() {
            this(new getEvVer());
        }

        public bool(getEvVer getevver) {
            this.setMin = new EnumMap(NodeId.class);
            this.getMax = new HashMap();
            this.length = new HashMap();
            this.IsOverlapping = true;
            this.isInside = false;
            this.invoke = false;
            this.setMax = new HashMap();
            this.toDoubleRange = new HashSet();
            this.toString = new ArrayList<>();
            this.values = new ArrayList<>();
            this.toFloatRange = new HashMap();
            this.hashCode = new HashMap();
            this.equals = null;
            this.valueOf = false;
            this.toFloatRange.put(SortedMap.class, new setFmt(SortedMap.class, getLastPage.length, TreeMap.class));
            this.toFloatRange.put(SortedSet.class, new setFmt(SortedSet.class, getLastPage.getMin, TreeSet.class));
            this.FastBitmap$CoordinateSystem = getevver;
        }

        public final void getMin(getFeVer getfever) {
            this.getMin = getfever;
        }

        public final Object getMin(Class<?> cls) {
            getLastPage getlastpage;
            getLanguage min = this.getMin.getMin();
            if (min == null || getLastPage.hashCode.equals(min.setMax)) {
                return this.getMax.get(getLastPage.hashCode).setMax(min);
            }
            if (Object.class != cls) {
                getlastpage = new getLastPage((Class<? extends Object>) cls);
            } else {
                getlastpage = this.equals;
                if (getlastpage != null) {
                    if (getlastpage == null) {
                        throw new NullPointerException("tag in a Node is required.");
                    }
                }
                return setMin(min);
            }
            min.setMax = getlastpage;
            return setMin(min);
        }

        /* access modifiers changed from: protected */
        public final Object length(getLanguage getlanguage) {
            if (this.setMax.containsKey(getlanguage)) {
                return this.setMax.get(getlanguage);
            }
            return getMin(getlanguage);
        }

        private Object getMin(getLanguage getlanguage) {
            if (!this.toDoubleRange.contains(getlanguage)) {
                this.toDoubleRange.add(getlanguage);
                DeviceIdProvider max = setMax(getlanguage);
                Object max2 = this.setMax.containsKey(getlanguage) ? this.setMax.get(getlanguage) : max.setMax(getlanguage);
                setMax(getlanguage, max2);
                this.setMax.put(getlanguage, max2);
                this.toDoubleRange.remove(getlanguage);
                if (getlanguage.setMax()) {
                    max.setMax(getlanguage, max2);
                }
                return max2;
            }
            throw new ConstructorException((String) null, (InitParams.AnonymousClass1) null, "found unconstructable recursive node", getlanguage.length);
        }

        private DeviceIdProvider setMax(getLanguage getlanguage) {
            if (getlanguage.isInside()) {
                return this.setMin.get(getlanguage.length());
            }
            DeviceIdProvider deviceIdProvider = this.getMax.get(getlanguage.setMax);
            if (deviceIdProvider != null) {
                return deviceIdProvider;
            }
            for (String next : this.length.keySet()) {
                if (getlanguage.setMax.getMin(next)) {
                    return this.length.get(next);
                }
            }
            return this.getMax.get((Object) null);
        }

        /* access modifiers changed from: protected */
        public final Object getMax(getLanguage getlanguage) {
            try {
                return length(Object.class, getlanguage, true);
            } catch (InstantiationException e) {
                throw new YAMLException((Throwable) e);
            }
        }

        /* access modifiers changed from: protected */
        public final Set<Object> setMax(putBizExternParams<?> putbizexternparams) {
            try {
                return (Set) length(Set.class, putbizexternparams, true);
            } catch (InstantiationException unused) {
                return new LinkedHashSet(putbizexternparams.setMin().size());
            }
        }

        /* access modifiers changed from: protected */
        public final List<Object> setMax(setLayoutType setlayouttype) {
            try {
                return (List) length(List.class, setlayouttype, true);
            } catch (InstantiationException unused) {
                return new ArrayList(setlayouttype.setMin.size());
            }
        }

        /* access modifiers changed from: protected */
        public final Map<Object, Object> length(getLayoutType getlayouttype) {
            try {
                return (Map) length(Map.class, getlayouttype, true);
            } catch (InstantiationException unused) {
                return new LinkedHashMap(getlayouttype.getMin.size());
            }
        }

        public final List<? extends Object> getMax(setLayoutType setlayouttype) {
            List<Object> max = setMax(setlayouttype);
            setMax(setlayouttype, (Collection<Object>) max);
            return max;
        }

        /* access modifiers changed from: protected */
        public final Set<? extends Object> setMin(setLayoutType setlayouttype) {
            Set<Object> max = setMax((putBizExternParams<?>) setlayouttype);
            setMax(setlayouttype, (Collection<Object>) max);
            return max;
        }

        /* access modifiers changed from: protected */
        public final Set<Object> setMax(getLayoutType getlayouttype) {
            Set<Object> max = setMax((putBizExternParams<?>) getlayouttype);
            getMax(getlayouttype, max);
            return max;
        }

        /* access modifiers changed from: protected */
        public final Map<Object, Object> getMin(getLayoutType getlayouttype) {
            Map<Object, Object> length2 = length(getlayouttype);
            setMin(getlayouttype, length2);
            return length2;
        }

        public final void getMax(refreshSessionID refreshsessionid) {
            this.toIntRange = refreshsessionid;
            this.valueOf = true;
            for (setFmt setfmt : this.toFloatRange.values()) {
                setfmt.length = refreshsessionid;
            }
        }

        static class getMax<T, K> {
            final T length;
            final K setMin;

            public getMax(T t, K k) {
                this.length = t;
                this.setMin = k;
            }
        }

        public final boolean getMin() {
            return this.valueOf;
        }

        public final boolean setMax() {
            return this.IsOverlapping;
        }

        private Object setMin(getLanguage getlanguage) {
            Object obj;
            try {
                if (this.setMax.containsKey(getlanguage)) {
                    obj = this.setMax.get(getlanguage);
                } else {
                    obj = getMin(getlanguage);
                }
                if (!this.toString.isEmpty()) {
                    Iterator<getMax<Map<Object, Object>, getMax<Object, Object>>> it = this.toString.iterator();
                    while (it.hasNext()) {
                        getMax next = it.next();
                        getMax getmax = (getMax) next.setMin;
                        ((Map) next.length).put(getmax.length, getmax.setMin);
                    }
                    this.toString.clear();
                }
                if (!this.values.isEmpty()) {
                    Iterator<getMax<Set<Object>, Object>> it2 = this.values.iterator();
                    while (it2.hasNext()) {
                        getMax next2 = it2.next();
                        ((Set) next2.length).add(next2.setMin);
                    }
                    this.values.clear();
                }
                this.setMax.clear();
                this.toDoubleRange.clear();
                return obj;
            } catch (RuntimeException e) {
                if (!this.isInside || (e instanceof YAMLException)) {
                    throw e;
                }
                throw new YAMLException((Throwable) e);
            } catch (Throwable th) {
                this.setMax.clear();
                this.toDoubleRange.clear();
                throw th;
            }
        }

        private Object setMax(getLanguage getlanguage, Object obj) {
            Class<? extends Object> cls = getlanguage.toFloatRange;
            if (!this.toFloatRange.containsKey(cls)) {
                return obj;
            }
            this.toFloatRange.get(cls);
            return setFmt.getMax(obj);
        }

        /* access modifiers changed from: protected */
        public final Object length(Class<?> cls, getLanguage getlanguage, boolean z) throws InstantiationException {
            Object max;
            Class<? extends Object> cls2 = getlanguage.toFloatRange;
            if (this.toFloatRange.containsKey(cls2) && (max = this.toFloatRange.get(cls2).setMax()) != null) {
                return max;
            }
            if (!z || !cls.isAssignableFrom(cls2) || Modifier.isAbstract(cls2.getModifiers())) {
                throw new InstantiationException();
            }
            try {
                Constructor<? extends Object> declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder("NoSuchMethodException:");
                sb.append(e.getLocalizedMessage());
                throw new InstantiationException(sb.toString());
            } catch (Exception e2) {
                throw new YAMLException((Throwable) e2);
            }
        }

        /* access modifiers changed from: protected */
        public final Object getMin(setLayoutType setlayouttype) {
            Class<? extends Object> cls = setlayouttype.toFloatRange;
            return setMax(setlayouttype, Array.newInstance(cls.getComponentType(), setlayouttype.setMin.size()));
        }

        /* access modifiers changed from: protected */
        public final void setMax(setLayoutType setlayouttype, Collection<Object> collection) {
            Object obj;
            for (getLanguage next : setlayouttype.setMin) {
                if (this.setMax.containsKey(next)) {
                    obj = this.setMax.get(next);
                } else {
                    obj = getMin(next);
                }
                collection.add(obj);
            }
        }

        /* access modifiers changed from: protected */
        public final Object setMax(setLayoutType setlayouttype, Object obj) {
            Object obj2;
            Class<?> componentType = setlayouttype.toFloatRange.getComponentType();
            int i = 0;
            for (getLanguage next : setlayouttype.setMin) {
                if (next.toFloatRange == Object.class && !componentType.isAssignableFrom(next.toFloatRange)) {
                    next.toFloatRange = componentType;
                }
                if (this.setMax.containsKey(next)) {
                    obj2 = this.setMax.get(next);
                } else {
                    obj2 = getMin(next);
                }
                if (!componentType.isPrimitive()) {
                    Array.set(obj, i, obj2);
                } else if (obj2 == null) {
                    throw new NullPointerException("Unable to construct element value for ".concat(String.valueOf(next)));
                } else if (Byte.TYPE.equals(componentType)) {
                    Array.setByte(obj, i, ((Number) obj2).byteValue());
                } else if (Short.TYPE.equals(componentType)) {
                    Array.setShort(obj, i, ((Number) obj2).shortValue());
                } else if (Integer.TYPE.equals(componentType)) {
                    Array.setInt(obj, i, ((Number) obj2).intValue());
                } else if (Long.TYPE.equals(componentType)) {
                    Array.setLong(obj, i, ((Number) obj2).longValue());
                } else if (Float.TYPE.equals(componentType)) {
                    Array.setFloat(obj, i, ((Number) obj2).floatValue());
                } else if (Double.TYPE.equals(componentType)) {
                    Array.setDouble(obj, i, ((Number) obj2).doubleValue());
                } else if (Character.TYPE.equals(componentType)) {
                    Array.setChar(obj, i, ((Character) obj2).charValue());
                } else if (Boolean.TYPE.equals(componentType)) {
                    Array.setBoolean(obj, i, ((Boolean) obj2).booleanValue());
                } else {
                    throw new YAMLException("unexpected primitive type");
                }
                i++;
            }
            return obj;
        }

        /* access modifiers changed from: protected */
        public void setMin(getLayoutType getlayouttype, Map<Object, Object> map) {
            Object obj;
            Object obj2;
            for (addSPMPage next : getlayouttype.getMin) {
                getLanguage getlanguage = next.getMax;
                getLanguage getlanguage2 = next.length;
                if (this.setMax.containsKey(getlanguage)) {
                    obj = this.setMax.get(getlanguage);
                } else {
                    obj = getMin(getlanguage);
                }
                if (obj != null) {
                    try {
                        obj.hashCode();
                    } catch (Exception e) {
                        throw new ConstructorException("while constructing a mapping", getlayouttype.length, "found unacceptable key ".concat(String.valueOf(obj)), next.getMax.length, e);
                    }
                }
                if (this.setMax.containsKey(getlanguage2)) {
                    obj2 = this.setMax.get(getlanguage2);
                } else {
                    obj2 = getMin(getlanguage2);
                }
                if (!getlanguage.setMax()) {
                    map.put(obj, obj2);
                } else if (this.FastBitmap$CoordinateSystem.setMin()) {
                    this.toString.add(0, new getMax(map, new getMax(obj, obj2)));
                } else {
                    throw new YAMLException("Recursive key for mapping is detected but it is not configured to be allowed.");
                }
            }
        }

        /* access modifiers changed from: protected */
        public void getMax(getLayoutType getlayouttype, Set<Object> set) {
            Object obj;
            for (addSPMPage next : getlayouttype.getMin) {
                getLanguage getlanguage = next.getMax;
                if (this.setMax.containsKey(getlanguage)) {
                    obj = this.setMax.get(getlanguage);
                } else {
                    obj = getMin(getlanguage);
                }
                if (obj != null) {
                    try {
                        obj.hashCode();
                    } catch (Exception e) {
                        throw new ConstructorException("while constructing a Set", getlayouttype.length, "found unacceptable key ".concat(String.valueOf(obj)), next.getMax.length, e);
                    }
                }
                if (getlanguage.setMax()) {
                    this.values.add(0, new getMax(set, obj));
                } else {
                    set.add(obj);
                }
            }
        }

        public final setFmt length(setFmt setfmt) {
            if (setfmt != null) {
                this.hashCode.put(setfmt.getMin, setfmt.setMin);
                if (this.toIntRange == null) {
                    this.toIntRange = new refreshSessionID();
                }
                setfmt.length = this.toIntRange;
                return this.toFloatRange.put(setfmt.setMin, setfmt);
            }
            throw new NullPointerException("TypeDescription is required.");
        }
    }

    public final /* synthetic */ Object get() {
        return new OnItemSelected$Callback(this.length.get(), this.getMax.get(), this.setMax.get());
    }
}
