package id.dana.danah5.bca;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.danah5.DanaH5;
import id.dana.danah5.base.UrlTransportEventHandler;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GContainerModule;
import id.dana.domain.bcaoneklik.model.BcaOneKlikInterceptData;
import id.dana.home.HomeTabActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DatePickerBridgeExtension;
import o.PrepareException;
import o.onInput;
import o.onReceivedIcon;
import o.releaseWebView;
import o.saveSnapshot;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lid/dana/danah5/bca/BcaOneKlikEventHandler;", "Lid/dana/danah5/base/UrlTransportEventHandler;", "()V", "bcaOneKlikInterceptData", "Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "getBcaOneKlikInterceptData", "()Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "setBcaOneKlikInterceptData", "(Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;)V", "getBcaOneKlikInterceptDataConfig", "Lid/dana/domain/bcaoneklik/interactor/GetBcaOneKlikInterceptDataConfig;", "getGetBcaOneKlikInterceptDataConfig", "()Lid/dana/domain/bcaoneklik/interactor/GetBcaOneKlikInterceptDataConfig;", "setGetBcaOneKlikInterceptDataConfig", "(Lid/dana/domain/bcaoneklik/interactor/GetBcaOneKlikInterceptDataConfig;)V", "getDataConfig", "", "interceptUrl", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "url", "", "isBcaOneKlikFailedPageUrl", "isBcaOneKlikSuccessPageUrl", "onFinalized", "onInitialized", "redirectPlayStore", "redirectToHome", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BcaOneKlikEventHandler extends UrlTransportEventHandler {
    public BcaOneKlikInterceptData bcaOneKlikInterceptData;
    @Inject
    public releaseWebView getBcaOneKlikInterceptDataConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.BCA_ONE_KLIK_WEBVIEW_INTERCEPT, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<BcaOneKlikInterceptData, Unit> {
        final /* synthetic */ BcaOneKlikEventHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(BcaOneKlikEventHandler bcaOneKlikEventHandler) {
            super(1);
            this.this$0 = bcaOneKlikEventHandler;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BcaOneKlikInterceptData) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull BcaOneKlikInterceptData bcaOneKlikInterceptData) {
            Intrinsics.checkNotNullParameter(bcaOneKlikInterceptData, "it");
            this.this$0.setBcaOneKlikInterceptData(bcaOneKlikInterceptData);
        }
    }

    @NotNull
    public final releaseWebView getGetBcaOneKlikInterceptDataConfig() {
        releaseWebView releasewebview = this.getBcaOneKlikInterceptDataConfig;
        if (releasewebview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getBcaOneKlikInterceptDataConfig");
        }
        return releasewebview;
    }

    public final void setGetBcaOneKlikInterceptDataConfig(@NotNull releaseWebView releasewebview) {
        Intrinsics.checkNotNullParameter(releasewebview, "<set-?>");
        this.getBcaOneKlikInterceptDataConfig = releasewebview;
    }

    @NotNull
    public final BcaOneKlikInterceptData getBcaOneKlikInterceptData() {
        BcaOneKlikInterceptData bcaOneKlikInterceptData2 = this.bcaOneKlikInterceptData;
        if (bcaOneKlikInterceptData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bcaOneKlikInterceptData");
        }
        return bcaOneKlikInterceptData2;
    }

    public final void setBcaOneKlikInterceptData(@NotNull BcaOneKlikInterceptData bcaOneKlikInterceptData2) {
        Intrinsics.checkNotNullParameter(bcaOneKlikInterceptData2, "<set-?>");
        this.bcaOneKlikInterceptData = bcaOneKlikInterceptData2;
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().setMax(this);
                getDataConfig();
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    public final boolean interceptUrl(@Nullable Page page, @Nullable String str) {
        if (isBcaOneKlikSuccessPageUrl(str)) {
            DanaH5.closeAllContainers();
            redirectToHome();
            redirectPlayStore(page);
            return true;
        } else if (!isBcaOneKlikFailedPageUrl(str)) {
            return false;
        } else {
            DanaH5.closeAllContainers();
            redirectToHome();
            return true;
        }
    }

    private final boolean isBcaOneKlikSuccessPageUrl(String str) {
        if (str == null) {
            return false;
        }
        BcaOneKlikInterceptData bcaOneKlikInterceptData2 = this.bcaOneKlikInterceptData;
        if (bcaOneKlikInterceptData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bcaOneKlikInterceptData");
        }
        return Intrinsics.areEqual((Object) str, (Object) bcaOneKlikInterceptData2.getInterceptSuccessUrl());
    }

    private final boolean isBcaOneKlikFailedPageUrl(String str) {
        if (str == null) {
            return false;
        }
        BcaOneKlikInterceptData bcaOneKlikInterceptData2 = this.bcaOneKlikInterceptData;
        if (bcaOneKlikInterceptData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bcaOneKlikInterceptData");
        }
        return Intrinsics.areEqual((Object) str, (Object) bcaOneKlikInterceptData2.getInterceptFailedUrl());
    }

    private final void redirectToHome() {
        onInput.getDefault().post(new HomeTabActivity.setMax());
    }

    private final void redirectPlayStore(Page page) {
        if (page != null) {
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            Activity activity = pageContext != null ? pageContext.getActivity() : null;
            if (activity != null) {
                Context context = activity;
                BcaOneKlikInterceptData bcaOneKlikInterceptData2 = this.bcaOneKlikInterceptData;
                if (bcaOneKlikInterceptData2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bcaOneKlikInterceptData");
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(bcaOneKlikInterceptData2.getRedirectUrl()));
                Intrinsics.checkNotNullParameter(context, "$this$startActivitySafely");
                Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
                if (DatePickerBridgeExtension.AnonymousClass8.length(intent, context)) {
                    context.startActivity(intent);
                }
            }
        }
    }

    private final void getDataConfig() {
        releaseWebView releasewebview = this.getBcaOneKlikInterceptDataConfig;
        if (releasewebview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getBcaOneKlikInterceptDataConfig");
        }
        releasewebview.execute(onReceivedIcon.INSTANCE, new setMax(this), getMin.INSTANCE);
    }

    public final void onFinalized() {
        releaseWebView releasewebview = this.getBcaOneKlikInterceptDataConfig;
        if (releasewebview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getBcaOneKlikInterceptDataConfig");
        }
        releasewebview.dispose();
    }
}
