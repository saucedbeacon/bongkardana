package id.dana.miniprogram;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.component.cellcomponent.DanaCellLeftView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.MiniProgramModule;
import id.dana.di.modules.OauthModule;
import id.dana.miniprogram.MiniProgramStoreActivity;
import id.dana.miniprogram.view.FavoriteButton;
import id.dana.miniprogram.view.SectionView;
import id.dana.richview.SearchView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;
import o.BaseGriverRpcRequest;
import o.DeviceTokenClient;
import o.DialogBridgeExtension;
import o.DictionaryKeys;
import o.EmbedViewBridgeExtension;
import o.GriverDefaultPromptExtension;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.SwipeRefreshLayout;
import o.dispatchOnCancelled;
import o.getAD102;
import o.getApkKeyHashBytes;
import o.getFacadeClass;
import o.getScrimColor;
import o.initToken;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onReceivedIcon;
import o.resetInternal;
import o.setConfiguration;
import o.stopIgnoring;
import o.xp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0002CDB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0016J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020'H\u0014J\u0012\u0010/\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\u0006H\u0016J\u0016\u00103\u001a\u00020'2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016J\u0016\u00105\u001a\u00020'2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016J\u0016\u00107\u001a\u00020'2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016J\u0018\u00109\u001a\u00020'2\u0006\u00102\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0012H\u0016J\u0018\u0010;\u001a\u00020'2\u0006\u00102\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020'H\u0002J\b\u0010?\u001a\u00020'H\u0016J\b\u0010@\u001a\u00020'H\u0002J \u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005*\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010B\u001a\u00020\u0006H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lid/dana/miniprogram/MiniProgramStoreActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/miniprogram/di/MiniProgramContract$View;", "()V", "allMiniProgramAppIds", "", "", "getAllMiniProgramAppIds", "()Ljava/util/List;", "setAllMiniProgramAppIds", "(Ljava/util/List;)V", "allMiniProgramsAdapter", "Lid/dana/miniprogram/adapter/AllMiniProgramsAdapter;", "allMinis", "Lid/dana/domain/miniprogram/model/MiniProgram;", "favoriteMiniProgramAdapter", "Lid/dana/miniprogram/adapter/GridMiniProgramAdapter;", "inSearchMode", "", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "job", "Lkotlinx/coroutines/CompletableJob;", "state", "Lid/dana/miniprogram/MiniProgramStoreActivity$PageState;", "pageState", "setPageState", "(Lid/dana/miniprogram/MiniProgramStoreActivity$PageState;)V", "presenter", "Lid/dana/miniprogram/di/MiniProgramPresenter;", "getPresenter", "()Lid/dana/miniprogram/di/MiniProgramPresenter;", "setPresenter", "(Lid/dana/miniprogram/di/MiniProgramPresenter;)V", "recentMiniProgramAdapter", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "uiScope", "dismissProgress", "", "getLayout", "", "hideSkeleton", "init", "initInjector", "initView", "onDestroy", "onError", "errorMessage", "onFavoriteLimitExceeded", "appId", "onGetMiniPrograms", "miniPrograms", "onLoadFavoriteMiniPrograms", "favoriteMiniPrograms", "onLoadRecentMiniPrograms", "recentMiniPrograms", "onSetFavoriteMiniPrograms", "isFavorite", "onSetRecentMiniProgram", "lastOpen", "", "setupSearchView", "showProgress", "showSkeleton", "toFilterBySearch", "query", "Companion", "PageState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MiniProgramStoreActivity extends BaseActivity implements GriverDefaultPromptExtension.AnonymousClass2.getMin {
    @NotNull
    public static final length Companion = new length((byte) 0);
    public static final int SEARCH_CHARACTERS = 3;
    private onDetachedFromLayoutParams FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public final initToken IsOverlapping = setConfiguration.length(DeviceTokenClient.length().plus(this.toIntRange));
    /* access modifiers changed from: private */
    public List<BaseGriverRpcRequest.DeviceInfo> equals = CollectionsKt.emptyList();
    private DialogBridgeExtension.AnonymousClass7 getMax;
    private DialogBridgeExtension.AnonymousClass7 getMin;
    /* access modifiers changed from: private */
    public PageState hashCode = PageState.MINI_PROGRAM_ERROR;
    @NotNull
    private List<String> isInside = CollectionsKt.emptyList();
    @Inject
    public EmbedViewBridgeExtension presenter;
    /* access modifiers changed from: private */
    public DialogBridgeExtension.AnonymousClass8 setMax;
    private final initToken toFloatRange = setConfiguration.length(DeviceTokenClient.setMax().plus(this.toIntRange));
    private final getAD102 toIntRange = new getApkKeyHashBytes((DictionaryKeys) null);
    private HashMap toString;
    /* access modifiers changed from: private */
    public boolean values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/miniprogram/MiniProgramStoreActivity$PageState;", "", "(Ljava/lang/String;I)V", "DISPLAYING_EMPTY_SEARCH_RESULT", "MINI_PROGRAM_ERROR", "SUCCESS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum PageState {
        DISPLAYING_EMPTY_SEARCH_RESULT,
        MINI_PROGRAM_ERROR,
        SUCCESS
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-800662561, oncanceled);
            onCancelLoad.getMin(-800662561, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-800662561, oncanceled2);
            onCancelLoad.getMin(-800662561, oncanceled2);
        }
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_mini_program_store;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(335432515, oncanceled);
        onCancelLoad.getMin(335432515, oncanceled);
        return R.layout.activity_mini_program_store;
    }

    public final void getMin() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1948526412 == (max = dispatchOnCancelled.getMax(applicationContext, -1948526412)))) {
            onCanceled oncanceled = new onCanceled(-1948526412, max, 512);
            onCancelLoad.setMax(-1948526412, oncanceled);
            onCancelLoad.getMin(-1948526412, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-1948526412, oncanceled2);
            onCancelLoad.getMin(-1948526412, oncanceled2);
        }
    }

    public final void length() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"id/dana/extension/view/InputExtKt$onTextAfterChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements TextWatcher {
        final /* synthetic */ MiniProgramStoreActivity setMin;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-234677161, oncanceled);
                onCancelLoad.getMin(-234677161, oncanceled);
            }
        }

        public getMax(MiniProgramStoreActivity miniProgramStoreActivity) {
            this.setMin = miniProgramStoreActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String str;
            boolean z;
            PageState pageState;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            DialogBridgeExtension.AnonymousClass8 access$getAllMiniProgramsAdapter$p = MiniProgramStoreActivity.access$getAllMiniProgramsAdapter$p(this.setMin);
            if (str != null) {
                String obj = StringsKt.trim((CharSequence) str).toString();
                MiniProgramStoreActivity miniProgramStoreActivity = this.setMin;
                if (obj.length() >= 3) {
                    MiniProgramStoreActivity miniProgramStoreActivity2 = this.setMin;
                    access$getAllMiniProgramsAdapter$p.getMin(MiniProgramStoreActivity.access$toFilterBySearch(miniProgramStoreActivity2, miniProgramStoreActivity2.equals, obj));
                    z = true;
                } else {
                    access$getAllMiniProgramsAdapter$p.getMin(this.setMin.equals);
                    z = false;
                }
                miniProgramStoreActivity.values = z;
                access$getAllMiniProgramsAdapter$p.notifyDataSetChanged();
                MiniProgramStoreActivity miniProgramStoreActivity3 = this.setMin;
                if (access$getAllMiniProgramsAdapter$p.getMax().isEmpty()) {
                    pageState = PageState.DISPLAYING_EMPTY_SEARCH_RESULT;
                } else {
                    pageState = PageState.SUCCESS;
                }
                miniProgramStoreActivity3.setMax(pageState);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    public static final /* synthetic */ DialogBridgeExtension.AnonymousClass8 access$getAllMiniProgramsAdapter$p(MiniProgramStoreActivity miniProgramStoreActivity) {
        DialogBridgeExtension.AnonymousClass8 r1 = miniProgramStoreActivity.setMax;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allMiniProgramsAdapter");
        }
        return r1;
    }

    @NotNull
    public final EmbedViewBridgeExtension getPresenter() {
        EmbedViewBridgeExtension embedViewBridgeExtension = this.presenter;
        if (embedViewBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return embedViewBridgeExtension;
    }

    public final void setPresenter(@NotNull EmbedViewBridgeExtension embedViewBridgeExtension) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1183257463, oncanceled);
            onCancelLoad.getMin(1183257463, oncanceled);
        }
        Intrinsics.checkNotNullParameter(embedViewBridgeExtension, "<set-?>");
        this.presenter = embedViewBridgeExtension;
    }

    @NotNull
    public final List<String> getAllMiniProgramAppIds() {
        return this.isInside;
    }

    public final void setAllMiniProgramAppIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.isInside = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ MiniProgramStoreActivity getMin;

        setMax(MiniProgramStoreActivity miniProgramStoreActivity) {
            this.getMin = miniProgramStoreActivity;
        }

        public final void onClick(View view) {
            this.getMin.finish();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        if ((!r4.isEmpty()) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(id.dana.miniprogram.MiniProgramStoreActivity.PageState r7) {
        /*
            r6 = this;
            r6.hashCode = r7
            int[] r0 = o.GriverDefaultDialogExtension.setMin
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            r1 = 0
            r2 = 8
            java.lang.String r3 = "<this>"
            if (r7 == r0) goto L_0x013e
            r4 = 2
            if (r7 == r4) goto L_0x00b1
            r4 = 3
            if (r7 == r4) goto L_0x001a
            goto L_0x00b0
        L_0x001a:
            int r7 = o.resetInternal.setMax.getMenu
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            if (r7 == 0) goto L_0x002c
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x002c:
            int r7 = o.resetInternal.setMax.setDropDownHorizontalOffset
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x003e
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r1)
        L_0x003e:
            int r7 = o.resetInternal.setMax.performClick
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x0078
            android.view.View r7 = (android.view.View) r7
            boolean r4 = r6.values
            if (r4 != 0) goto L_0x006b
            o.DialogBridgeExtension$7 r4 = r6.getMax
            if (r4 != 0) goto L_0x0057
            java.lang.String r5 = "recentMiniProgramAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0057:
            java.util.List r4 = r4.getMax()
            java.lang.String r5 = "recentMiniProgramAdapter.items"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x006b
            r4 = 1
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            if (r4 == 0) goto L_0x0073
            r4 = 0
            goto L_0x0075
        L_0x0073:
            r4 = 8
        L_0x0075:
            r7.setVisibility(r4)
        L_0x0078:
            int r7 = o.resetInternal.setMax.setDropDownWidth
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x00b0
            android.view.View r7 = (android.view.View) r7
            boolean r4 = r6.values
            if (r4 != 0) goto L_0x00a4
            o.DialogBridgeExtension$7 r4 = r6.getMin
            if (r4 != 0) goto L_0x0091
            java.lang.String r5 = "favoriteMiniProgramAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0091:
            java.util.List r4 = r4.getMax()
            java.lang.String r5 = "favoriteMiniProgramAdapter.items"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            if (r0 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r1 = 8
        L_0x00ad:
            r7.setVisibility(r1)
        L_0x00b0:
            return
        L_0x00b1:
            int r7 = o.resetInternal.setMax.getMenu
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            if (r7 == 0) goto L_0x00c3
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r1)
        L_0x00c3:
            int r7 = o.resetInternal.setMax.setPrecomputedText
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.richview.SearchView r7 = (id.dana.richview.SearchView) r7
            if (r7 == 0) goto L_0x00d5
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r1)
        L_0x00d5:
            int r7 = o.resetInternal.setMax.invoke
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.component.buttoncomponent.DanaButtonSecondaryView r7 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) r7
            if (r7 == 0) goto L_0x00e7
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x00e7:
            int r7 = o.resetInternal.setMax.setChildFrame
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00f7
            r0 = 2131888002(0x7f120782, float:1.9410627E38)
            r7.setText(r0)
        L_0x00f7:
            int r7 = o.resetInternal.setMax.layoutVertical
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0107
            r0 = 2131888003(0x7f120783, float:1.941063E38)
            r7.setText(r0)
        L_0x0107:
            int r7 = o.resetInternal.setMax.setDropDownHorizontalOffset
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x0119
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x0119:
            int r7 = o.resetInternal.setMax.performClick
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x012b
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x012b:
            int r7 = o.resetInternal.setMax.setDropDownWidth
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x013d
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x013d:
            return
        L_0x013e:
            int r7 = o.resetInternal.setMax.getMenu
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            if (r7 == 0) goto L_0x0150
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r1)
        L_0x0150:
            int r7 = o.resetInternal.setMax.setPrecomputedText
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.richview.SearchView r7 = (id.dana.richview.SearchView) r7
            if (r7 == 0) goto L_0x0162
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x0162:
            int r7 = o.resetInternal.setMax.invoke
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.component.buttoncomponent.DanaButtonSecondaryView r7 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) r7
            if (r7 == 0) goto L_0x0174
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r1)
        L_0x0174:
            int r7 = o.resetInternal.setMax.setChildFrame
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0184
            r0 = 2131888004(0x7f120784, float:1.9410631E38)
            r7.setText(r0)
        L_0x0184:
            int r7 = o.resetInternal.setMax.layoutVertical
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0194
            r0 = 2131888005(0x7f120785, float:1.9410633E38)
            r7.setText(r0)
        L_0x0194:
            int r7 = o.resetInternal.setMax.setDropDownHorizontalOffset
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x01a6
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x01a6:
            int r7 = o.resetInternal.setMax.performClick
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x01b8
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x01b8:
            int r7 = o.resetInternal.setMax.setDropDownWidth
            android.view.View r7 = r6._$_findCachedViewById(r7)
            id.dana.miniprogram.view.SectionView r7 = (id.dana.miniprogram.view.SectionView) r7
            if (r7 == 0) goto L_0x01ca
            android.view.View r7 = (android.view.View) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.setVisibility(r2)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.MiniProgramStoreActivity.setMax(id.dana.miniprogram.MiniProgramStoreActivity$PageState):void");
    }

    public final void onGetMiniPrograms(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
        PageState pageState;
        Intrinsics.checkNotNullParameter(list, "miniPrograms");
        this.equals = list;
        Iterable<BaseGriverRpcRequest.DeviceInfo> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BaseGriverRpcRequest.DeviceInfo appId : iterable) {
            arrayList.add(appId.getAppId());
        }
        this.isInside = (List) arrayList;
        EmbedViewBridgeExtension embedViewBridgeExtension = this.presenter;
        if (embedViewBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        embedViewBridgeExtension.getMax(list);
        EmbedViewBridgeExtension embedViewBridgeExtension2 = this.presenter;
        if (embedViewBridgeExtension2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        embedViewBridgeExtension2.getMin(list);
        DialogBridgeExtension.AnonymousClass8 r0 = this.setMax;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allMiniProgramsAdapter");
        }
        r0.getMin(list);
        r0.notifyDataSetChanged();
        ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.setPopupBackgroundDrawable)).smoothScrollTo(0, 0);
        if (list.isEmpty()) {
            pageState = PageState.MINI_PROGRAM_ERROR;
        } else {
            pageState = PageState.SUCCESS;
        }
        setMax(pageState);
    }

    public final void onLoadFavoriteMiniPrograms(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "favoriteMiniPrograms");
        DialogBridgeExtension.AnonymousClass7 r0 = this.getMin;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("favoriteMiniProgramAdapter");
        }
        r0.getMin(list);
        r0.notifyDataSetChanged();
        int i = 0;
        ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.setPopupBackgroundDrawable)).smoothScrollTo(0, 0);
        SectionView sectionView = (SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownWidth);
        if (sectionView != null) {
            View view = sectionView;
            boolean z = true;
            if (!(!list.isEmpty()) || this.values) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void onLoadRecentMiniPrograms(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "recentMiniPrograms");
        DialogBridgeExtension.AnonymousClass7 r0 = this.getMax;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentMiniProgramAdapter");
        }
        r0.getMin(list);
        r0.notifyDataSetChanged();
        int i = 0;
        ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.setPopupBackgroundDrawable)).smoothScrollTo(0, 0);
        SectionView sectionView = (SectionView) _$_findCachedViewById(resetInternal.setMax.performClick);
        if (sectionView != null) {
            View view = sectionView;
            boolean z = true;
            if (!(!list.isEmpty()) || this.values) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSetFavoriteMiniPrograms(@org.jetbrains.annotations.NotNull java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.List<o.BaseGriverRpcRequest$DeviceInfo> r0 = r7.equals
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()
            r3 = r1
            o.BaseGriverRpcRequest$DeviceInfo r3 = (o.BaseGriverRpcRequest.DeviceInfo) r3
            java.lang.String r3 = r3.getAppId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 2
            boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r4, (boolean) r5, (int) r6, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x000d
            r2 = r1
        L_0x002d:
            o.BaseGriverRpcRequest$DeviceInfo r2 = (o.BaseGriverRpcRequest.DeviceInfo) r2
            if (r2 == 0) goto L_0x0034
            r2.setFavorite(r9)
        L_0x0034:
            o.EmbedViewBridgeExtension r8 = r7.presenter
            if (r8 != 0) goto L_0x003d
            java.lang.String r9 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x003d:
            java.util.List<o.BaseGriverRpcRequest$DeviceInfo> r9 = r7.equals
            r8.getMax(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.MiniProgramStoreActivity.onSetFavoriteMiniPrograms(java.lang.String, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: o.BaseGriverRpcRequest$DeviceInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSetRecentMiniProgram(@org.jetbrains.annotations.NotNull java.lang.String r8, long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.List<o.BaseGriverRpcRequest$DeviceInfo> r0 = r7.equals
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()
            r3 = r1
            o.BaseGriverRpcRequest$DeviceInfo r3 = (o.BaseGriverRpcRequest.DeviceInfo) r3
            java.lang.String r3 = r3.getAppId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 2
            boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r4, (boolean) r5, (int) r6, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x000d
            r2 = r1
        L_0x002d:
            o.BaseGriverRpcRequest$DeviceInfo r2 = (o.BaseGriverRpcRequest.DeviceInfo) r2
            if (r2 == 0) goto L_0x0034
            r2.setLastOpen(r9)
        L_0x0034:
            o.EmbedViewBridgeExtension r8 = r7.presenter
            if (r8 != 0) goto L_0x003d
            java.lang.String r9 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x003d:
            java.util.List<o.BaseGriverRpcRequest$DeviceInfo> r9 = r7.equals
            r8.getMin(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.MiniProgramStoreActivity.onSetRecentMiniProgram(java.lang.String, long):void");
    }

    public final void onFavoriteLimitExceeded(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "appId");
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        String string = getString(R.string.mp_maximum_favorite_items);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.mp_maximum_favorite_items)");
        SwipeRefreshLayout.length(this, R.drawable.ic_close_red, R.drawable.bg_rounded_toast_red_border, string);
        xp4.getMin(this.toFloatRange, (CoroutineContext) null, (CoroutineStart) null, new getMin(this, str, (Continuation) null), 3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.miniprogram.MiniProgramStoreActivity$onFavoriteLimitExceeded$1", f = "MiniProgramStoreActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getMin extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $appId;
        int label;
        final /* synthetic */ MiniProgramStoreActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(MiniProgramStoreActivity miniProgramStoreActivity, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = miniProgramStoreActivity;
            this.$appId = str;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new getMin(this.this$0, this.$appId, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List max = MiniProgramStoreActivity.access$getAllMiniProgramsAdapter$p(this.this$0).getMax();
                Intrinsics.checkNotNullExpressionValue(max, "allMiniProgramsAdapter.items");
                final int i = 0;
                Iterator it = max.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Boxing.boxBoolean(Intrinsics.areEqual((Object) ((BaseGriverRpcRequest.DeviceInfo) it.next()).getAppId(), (Object) this.$appId)).booleanValue()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    xp4.getMin(this.this$0.IsOverlapping, (CoroutineContext) null, (CoroutineStart) null, new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                        int label;
                        final /* synthetic */ getMin this$0;

                        {
                            this.this$0 = r1;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            Intrinsics.checkNotNullParameter(continuation, "completion");
                            return 

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/miniprogram/model/MiniProgram;", "invoke"}, k = 3, mv = {1, 4, 2})
                            static final class setMin extends Lambda implements Function1<BaseGriverRpcRequest.DeviceInfo, Comparable<?>> {
                                public static final setMin INSTANCE = new setMin();

                                setMin() {
                                    super(1);
                                }

                                @Nullable
                                public final Comparable<?> invoke(@NotNull BaseGriverRpcRequest.DeviceInfo deviceInfo) {
                                    Intrinsics.checkNotNullParameter(deviceInfo, "it");
                                    return Boolean.valueOf(!deviceInfo.isFavorite());
                                }
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/miniprogram/model/MiniProgram;", "invoke"}, k = 3, mv = {1, 4, 2})
                            static final class toFloatRange extends Lambda implements Function1<BaseGriverRpcRequest.DeviceInfo, Comparable<?>> {
                                public static final toFloatRange INSTANCE = new toFloatRange();

                                toFloatRange() {
                                    super(1);
                                }

                                @Nullable
                                public final Comparable<?> invoke(@NotNull BaseGriverRpcRequest.DeviceInfo deviceInfo) {
                                    Intrinsics.checkNotNullParameter(deviceInfo, "it");
                                    return deviceInfo.getTitle();
                                }
                            }

                            public final void showProgress() {
                                ((SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownHorizontalOffset)).setTitleVisibility(false);
                                SectionView sectionView = (SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownWidth);
                                Intrinsics.checkNotNullExpressionValue(sectionView, "sectionFavoriteMiniPrograms");
                                sectionView.setVisibility(8);
                                SectionView sectionView2 = (SectionView) _$_findCachedViewById(resetInternal.setMax.performClick);
                                Intrinsics.checkNotNullExpressionValue(sectionView2, "sectionRecentMiniPrograms");
                                sectionView2.setVisibility(8);
                                int max = dispatchOnCancelled.getMax(0);
                                if (max != 0) {
                                    onCanceled oncanceled = new onCanceled(0, max, 16);
                                    onCancelLoad.setMax(1919742000, oncanceled);
                                    onCancelLoad.getMin(1919742000, oncanceled);
                                }
                                onDetachedFromLayoutParams ondetachedfromlayoutparams = this.FastBitmap$CoordinateSystem;
                                if (ondetachedfromlayoutparams == null) {
                                    SectionView sectionView3 = (SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownHorizontalOffset);
                                    Intrinsics.checkNotNullExpressionValue(sectionView3, "sectionAllMiniPrograms");
                                    getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) sectionView3._$_findCachedViewById(resetInternal.setMax.setMenuPrepared));
                                    DialogBridgeExtension.AnonymousClass8 r0 = this.setMax;
                                    if (r0 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("allMiniProgramsAdapter");
                                    }
                                    getmax.length = r0;
                                    getmax.getMax = R.layout.view_mini_program_skeleton;
                                    getmax.IsOverlapping = 1500;
                                    getmax.setMin = 10;
                                    getmax.getMin = true;
                                    getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f20342131099946);
                                    getmax.toIntRange = 0;
                                    getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
                                    getscrimcolor.getMin();
                                    this.FastBitmap$CoordinateSystem = getscrimcolor;
                                } else if (ondetachedfromlayoutparams != null) {
                                    ondetachedfromlayoutparams.getMin();
                                }
                            }

                            public final void dismissProgress() {
                                int max;
                                int max2;
                                Context baseContext = getBaseContext();
                                Context context = null;
                                Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                                if (!(applicationContext == null || 439440537 == (max2 = dispatchOnCancelled.getMax(applicationContext, 439440537)))) {
                                    onCanceled oncanceled = new onCanceled(439440537, max2, 512);
                                    onCancelLoad.setMax(439440537, oncanceled);
                                    onCancelLoad.getMin(439440537, oncanceled);
                                }
                                ((SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownHorizontalOffset)).setTitleVisibility(true);
                                SectionView sectionView = (SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownWidth);
                                Intrinsics.checkNotNullExpressionValue(sectionView, "sectionFavoriteMiniPrograms");
                                sectionView.setVisibility(0);
                                SectionView sectionView2 = (SectionView) _$_findCachedViewById(resetInternal.setMax.performClick);
                                Intrinsics.checkNotNullExpressionValue(sectionView2, "sectionRecentMiniPrograms");
                                sectionView2.setVisibility(0);
                                Context baseContext2 = getBaseContext();
                                if (baseContext2 != null) {
                                    context = baseContext2.getApplicationContext();
                                }
                                if (!(context == null || -1845387409 == (max = dispatchOnCancelled.getMax(context, -1845387409)))) {
                                    onCanceled oncanceled2 = new onCanceled(-1845387409, max, 512);
                                    onCancelLoad.setMax(-1845387409, oncanceled2);
                                    onCancelLoad.getMin(-1845387409, oncanceled2);
                                }
                                onDetachedFromLayoutParams ondetachedfromlayoutparams = this.FastBitmap$CoordinateSystem;
                                if (ondetachedfromlayoutparams != null) {
                                    ondetachedfromlayoutparams.length();
                                }
                            }

                            public final void onError(@Nullable String str) {
                                setMax(PageState.MINI_PROGRAM_ERROR);
                            }

                            public final void onDestroy() {
                                this.toIntRange.getMin((CancellationException) null);
                                DanaH5.dispose();
                                super.onDestroy();
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/miniprogram/MiniProgramStoreActivity$Companion;", "", "()V", "SEARCH_CHARACTERS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                            public static final class length {
                                private length() {
                                }

                                public /* synthetic */ length(byte b) {
                                    this();
                                }
                            }

                            public final void init() {
                                int length2;
                                int min;
                                GriverDefaultPromptExtension.AnonymousClass3.setMax setmax = new GriverDefaultPromptExtension.AnonymousClass3.setMax((byte) 0);
                                PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
                                Context context = null;
                                if (applicationComponent != null) {
                                    setmax.toFloatRange = applicationComponent;
                                    setmax.length = new MiniProgramModule(this);
                                    DeepLinkModule.setMin max = DeepLinkModule.getMax();
                                    Activity activity = this;
                                    max.getMax = activity;
                                    setmax.setMax = new DeepLinkModule(max, (byte) 0);
                                    ScanQrModule.setMin max2 = ScanQrModule.getMax();
                                    max2.setMin = activity;
                                    setmax.getMax = new ScanQrModule(max2, (byte) 0);
                                    OauthModule.getMax min2 = OauthModule.setMin();
                                    min2.setMin = activity;
                                    setmax.isInside = new OauthModule(min2, (byte) 0);
                                    RestoreUrlModule.setMin min3 = RestoreUrlModule.setMin();
                                    min3.getMax = activity;
                                    setmax.setMin = new RestoreUrlModule(min3, (byte) 0);
                                    FeatureModule.length length3 = FeatureModule.length();
                                    length3.setMax = activity;
                                    setmax.getMin = new FeatureModule(length3, (byte) 0);
                                    setmax.toIntRange = new ServicesModule((byte) 0);
                                    stopIgnoring.setMin(setmax.length, MiniProgramModule.class);
                                    stopIgnoring.setMin(setmax.setMax, DeepLinkModule.class);
                                    stopIgnoring.setMin(setmax.getMax, ScanQrModule.class);
                                    stopIgnoring.setMin(setmax.setMin, RestoreUrlModule.class);
                                    stopIgnoring.setMin(setmax.getMin, FeatureModule.class);
                                    stopIgnoring.setMin(setmax.isInside, OauthModule.class);
                                    if (setmax.toIntRange == null) {
                                        setmax.toIntRange = new ServicesModule();
                                    }
                                    stopIgnoring.setMin(setmax.toFloatRange, PrepareException.AnonymousClass1.class);
                                    new GriverDefaultPromptExtension.AnonymousClass3(setmax.length, setmax.setMax, setmax.getMax, setmax.setMin, setmax.getMin, setmax.isInside, setmax.toIntRange, setmax.toFloatRange, (byte) 0).setMax(this);
                                    onDelete.getMin[] getminArr = new onDelete.getMin[1];
                                    EmbedViewBridgeExtension embedViewBridgeExtension = this.presenter;
                                    if (embedViewBridgeExtension == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                                    }
                                    getminArr[0] = embedViewBridgeExtension;
                                    registerPresenter(getminArr);
                                    Context baseContext = getBaseContext();
                                    if (baseContext != null) {
                                        context = baseContext.getApplicationContext();
                                    }
                                    if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                                        onCanceled oncanceled = new onCanceled(length2, min, 32);
                                        onCancelLoad.setMax(1110576495, oncanceled);
                                        onCancelLoad.getMin(1110576495, oncanceled);
                                    }
                                    setCenterTitle(getString(R.string.mp_store_title));
                                    setMenuLeftButton((int) R.drawable.btn_arrow_left);
                                    ((DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.invoke)).setOnClickListener(new setMax(this));
                                    SectionView sectionView = (SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownHorizontalOffset);
                                    sectionView.setSectionTitle(getText(R.string.mp_all_mini_programs));
                                    DialogBridgeExtension.AnonymousClass8 r1 = new IMultiInstanceInvalidationCallback.Stub<DialogBridgeExtension.AnonymousClass8.length, BaseGriverRpcRequest.DeviceInfo>() {
                                        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                                            Intrinsics.checkNotNullParameter(viewGroup, "parent");
                                            return new length(viewGroup);
                                        }

                                        {
                                            getMin(CollectionsKt.emptyList());
                                        }

                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/miniprogram/adapter/AllMiniProgramsAdapter$ViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/miniprogram/model/MiniProgram;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "item", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                                        /* renamed from: o.DialogBridgeExtension$8$length */
                                        public static final class length extends Ignore<BaseGriverRpcRequest.DeviceInfo> {
                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            public length(@NotNull ViewGroup viewGroup) {
                                                super(viewGroup.getContext(), R.layout.item_mini_program_horizontal, viewGroup);
                                                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                                                setMin(new Ignore.setMin(this) {
                                                    final /* synthetic */ length setMax;

                                                    {
                                                        this.setMax = r1;
                                                    }

                                                    public final void length(int i) {
                                                        String obj;
                                                        View view = this.setMax.itemView;
                                                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                                        Object tag = view.getTag();
                                                        if (tag != null && (obj = tag.toString()) != null) {
                                                            View view2 = this.setMax.itemView;
                                                            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                                            Context context = view2.getContext();
                                                            if (context != null) {
                                                                ((MiniProgramStoreActivity) context).getPresenter().length(obj);
                                                                DanaH5.openApp$default(obj, (Bundle) null, 2, (Object) null);
                                                                return;
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type id.dana.miniprogram.MiniProgramStoreActivity");
                                                        }
                                                    }
                                                });
                                                View view = this.itemView;
                                                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                                ((FavoriteButton) view.findViewById(resetInternal.setMax.b)).setOnCheckedChangeListener(new EngineBridgeExtension(this) {
                                                    final /* synthetic */ length length;

                                                    {
                                                        this.length = r1;
                                                    }

                                                    public final void setMin(boolean z) {
                                                        String obj;
                                                        View view = this.length.itemView;
                                                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                                        Object tag = view.getTag();
                                                        if (tag != null && (obj = tag.toString()) != null) {
                                                            View view2 = this.length.itemView;
                                                            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                                            Context context = view2.getContext();
                                                            if (context != null) {
                                                                MiniProgramStoreActivity miniProgramStoreActivity = (MiniProgramStoreActivity) context;
                                                                EmbedViewBridgeExtension presenter = miniProgramStoreActivity.getPresenter();
                                                                List<String> allMiniProgramAppIds = miniProgramStoreActivity.getAllMiniProgramAppIds();
                                                                Intrinsics.checkNotNullParameter(obj, "appId");
                                                                Intrinsics.checkNotNullParameter(allMiniProgramAppIds, "allMiniProgramAppIds");
                                                                presenter.toIntRange.execute(new getFacadeClass.length(obj, z, allMiniProgramAppIds), new EmbedViewBridgeExtension.toFloatRange(presenter, obj, z), new EmbedViewBridgeExtension.IsOverlapping(presenter, obj));
                                                                return;
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type id.dana.miniprogram.MiniProgramStoreActivity");
                                                        }
                                                    }
                                                });
                                            }

                                            /* access modifiers changed from: private */
                                            /* renamed from: getMax */
                                            public void setMax(@NotNull BaseGriverRpcRequest.DeviceInfo deviceInfo) {
                                                Intrinsics.checkNotNullParameter(deviceInfo, "item");
                                                View view = this.itemView;
                                                view.setTag(deviceInfo.getAppId());
                                                ((FavoriteButton) view.findViewById(resetInternal.setMax.b)).setState(deviceInfo.isFavorite());
                                                ((DanaCellLeftView) view.findViewById(resetInternal.setMax.IMediaSession)).setCellLeftLabelDesc(deviceInfo.getTitle(), deviceInfo.getDescription());
                                                setFirstVerticalBias<Drawable> max = Glide.getMax(view.getContext()).getMax(deviceInfo.getLogo());
                                                ImageView iconCell = ((DanaCellLeftView) view.findViewById(resetInternal.setMax.IMediaSession)).getIconCell();
                                                if (iconCell != null) {
                                                    max.length(iconCell);
                                                }
                                            }
                                        }
                                    };
                                    this.setMax = r1;
                                    if (r1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("allMiniProgramsAdapter");
                                    }
                                    sectionView.setupLinearRecyclerView(r1);
                                    SectionView sectionView2 = (SectionView) _$_findCachedViewById(resetInternal.setMax.setDropDownWidth);
                                    sectionView2.setSectionTitle(getText(R.string.favorites));
                                    DialogBridgeExtension.AnonymousClass7 r12 = new IMultiInstanceInvalidationCallback.Stub<DialogBridgeExtension.AnonymousClass7.getMax, BaseGriverRpcRequest.DeviceInfo>() {
                                        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                                            Intrinsics.checkNotNullParameter(viewGroup, "parent");
                                            return new getMax(viewGroup);
                                        }

                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/miniprogram/adapter/GridMiniProgramAdapter$ViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/miniprogram/model/MiniProgram;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "item", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                                        /* renamed from: o.DialogBridgeExtension$7$getMax */
                                        public static final class getMax extends Ignore<BaseGriverRpcRequest.DeviceInfo> {
                                            public final /* synthetic */ void setMax(Object obj) {
                                                BaseGriverRpcRequest.DeviceInfo deviceInfo = (BaseGriverRpcRequest.DeviceInfo) obj;
                                                Intrinsics.checkNotNullParameter(deviceInfo, "item");
                                                View view = this.itemView;
                                                view.setTag(deviceInfo.getAppId());
                                                TextView textView = (TextView) view.findViewById(resetInternal.setMax.onNothingSelected);
                                                Intrinsics.checkNotNullExpressionValue(textView, "tvMiniProgramTitle");
                                                textView.setText(deviceInfo.getTitle());
                                                setFirstVerticalBias<Drawable> max = Glide.getMax(view.getContext()).getMax(deviceInfo.getLogo());
                                                View view2 = this.itemView;
                                                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                                max.length((ImageView) (CircleImageView) view2.findViewById(resetInternal.setMax.setSupportProgressBarIndeterminateVisibility));
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            public getMax(@NotNull ViewGroup viewGroup) {
                                                super(viewGroup.getContext(), R.layout.view_item_favorit_recent_mini_program, viewGroup);
                                                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                                                setMin(new Ignore.setMin(this) {
                                                    final /* synthetic */ getMax length;

                                                    {
                                                        this.length = r1;
                                                    }

                                                    public final void length(int i) {
                                                        String obj;
                                                        View view = this.length.itemView;
                                                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                                        Object tag = view.getTag();
                                                        if (tag != null && (obj = tag.toString()) != null) {
                                                            DanaH5.openApp$default(obj, (Bundle) null, 2, (Object) null);
                                                            View view2 = this.length.itemView;
                                                            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                                            Context context = view2.getContext();
                                                            if (context != null) {
                                                                ((MiniProgramStoreActivity) context).getPresenter().length(obj);
                                                                return;
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type id.dana.miniprogram.MiniProgramStoreActivity");
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    };
                                    this.getMin = r12;
                                    if (r12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("favoriteMiniProgramAdapter");
                                    }
                                    sectionView2.setupGridRecyclerView(r12);
                                    SectionView sectionView3 = (SectionView) _$_findCachedViewById(resetInternal.setMax.performClick);
                                    sectionView3.setSectionTitle(getText(R.string.mp_recently_open_mini_program));
                                    DialogBridgeExtension.AnonymousClass7 r13 = new IMultiInstanceInvalidationCallback.Stub<DialogBridgeExtension.AnonymousClass7.getMax, BaseGriverRpcRequest.DeviceInfo>() {
                                        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                                            Intrinsics.checkNotNullParameter(viewGroup, "parent");
                                            return new getMax(viewGroup);
                                        }

                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/miniprogram/adapter/GridMiniProgramAdapter$ViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/miniprogram/model/MiniProgram;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "item", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                                        /* renamed from: o.DialogBridgeExtension$7$getMax */
                                        public static final class getMax extends Ignore<BaseGriverRpcRequest.DeviceInfo> {
                                            public final /* synthetic */ void setMax(Object obj) {
                                                BaseGriverRpcRequest.DeviceInfo deviceInfo = (BaseGriverRpcRequest.DeviceInfo) obj;
                                                Intrinsics.checkNotNullParameter(deviceInfo, "item");
                                                View view = this.itemView;
                                                view.setTag(deviceInfo.getAppId());
                                                TextView textView = (TextView) view.findViewById(resetInternal.setMax.onNothingSelected);
                                                Intrinsics.checkNotNullExpressionValue(textView, "tvMiniProgramTitle");
                                                textView.setText(deviceInfo.getTitle());
                                                setFirstVerticalBias<Drawable> max = Glide.getMax(view.getContext()).getMax(deviceInfo.getLogo());
                                                View view2 = this.itemView;
                                                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                                max.length((ImageView) (CircleImageView) view2.findViewById(resetInternal.setMax.setSupportProgressBarIndeterminateVisibility));
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            public getMax(@NotNull ViewGroup viewGroup) {
                                                super(viewGroup.getContext(), R.layout.view_item_favorit_recent_mini_program, viewGroup);
                                                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                                                setMin(new Ignore.setMin(this) {
                                                    final /* synthetic */ getMax length;

                                                    {
                                                        this.length = r1;
                                                    }

                                                    public final void length(int i) {
                                                        String obj;
                                                        View view = this.length.itemView;
                                                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                                        Object tag = view.getTag();
                                                        if (tag != null && (obj = tag.toString()) != null) {
                                                            DanaH5.openApp$default(obj, (Bundle) null, 2, (Object) null);
                                                            View view2 = this.length.itemView;
                                                            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                                            Context context = view2.getContext();
                                                            if (context != null) {
                                                                ((MiniProgramStoreActivity) context).getPresenter().length(obj);
                                                                return;
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type id.dana.miniprogram.MiniProgramStoreActivity");
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    };
                                    this.getMax = r13;
                                    if (r13 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("recentMiniProgramAdapter");
                                    }
                                    sectionView3.setupGridRecyclerView(r13);
                                    ((SearchView) _$_findCachedViewById(resetInternal.setMax.setPrecomputedText)).setSearchHint(getString(R.string.mp_find_favorite_mini_program));
                                    SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.setPrecomputedText);
                                    Intrinsics.checkNotNullExpressionValue(searchView, "svMiniProgramSearch");
                                    EditText editText = searchView.getEditText();
                                    Intrinsics.checkNotNullExpressionValue(editText, "svMiniProgramSearch.editText");
                                    editText.addTextChangedListener(new getMax(this));
                                    EmbedViewBridgeExtension embedViewBridgeExtension2 = this.presenter;
                                    if (embedViewBridgeExtension2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                                    }
                                    initToken inittoken = this.toFloatRange;
                                    Intrinsics.checkNotNullParameter(inittoken, "<set-?>");
                                    embedViewBridgeExtension2.getMax = inittoken;
                                    initToken inittoken2 = this.IsOverlapping;
                                    Intrinsics.checkNotNullParameter(inittoken2, "<set-?>");
                                    embedViewBridgeExtension2.setMin = inittoken2;
                                    embedViewBridgeExtension2.length.showProgress();
                                    embedViewBridgeExtension2.getMin.execute(onReceivedIcon.INSTANCE, new EmbedViewBridgeExtension.length(embedViewBridgeExtension2), new EmbedViewBridgeExtension.setMax(embedViewBridgeExtension2));
                                    return;
                                }
                                throw null;
                            }

                            public static final /* synthetic */ List access$toFilterBySearch(MiniProgramStoreActivity miniProgramStoreActivity, List list, String str) {
                                Collection arrayList = new ArrayList();
                                for (Object next : list) {
                                    if (StringsKt.contains((CharSequence) ((BaseGriverRpcRequest.DeviceInfo) next).getTitle(), (CharSequence) str, true)) {
                                        arrayList.add(next);
                                    }
                                }
                                return CollectionsKt.sortedWith((List) arrayList, ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{setMin.INSTANCE, toFloatRange.INSTANCE}));
                            }
                        }
