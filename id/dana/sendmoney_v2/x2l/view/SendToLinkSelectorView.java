package id.dana.sendmoney_v2.x2l.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.sendmoney_v2.x2l.di.SendToLinkSelectorModule;
import id.dana.sendmoney_v2.x2l.model.SocialLinkModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.PhotoBrowseView;
import o.PrepareException;
import o.onDelete;
import o.resetInternal;
import o.stopIgnoring;
import o.toggleFinish;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u0011H\u0002J\u0012\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\u0016\u0010,\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0.H\u0002R5\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00060"}, d2 = {"Lid/dana/sendmoney_v2/x2l/view/SendToLinkSelectorView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "onSocialLinkSelected", "Lkotlin/Function1;", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "Lkotlin/ParameterName;", "name", "socialLinkModel", "", "getOnSocialLinkSelected", "()Lkotlin/jvm/functions/Function1;", "setOnSocialLinkSelected", "(Lkotlin/jvm/functions/Function1;)V", "sendToLinkSelectorModule", "Lid/dana/sendmoney_v2/x2l/di/SendToLinkSelectorModule;", "getSendToLinkSelectorModule", "()Lid/dana/sendmoney_v2/x2l/di/SendToLinkSelectorModule;", "sendToLinkSelectorPresenter", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract$Presenter;", "getSendToLinkSelectorPresenter", "()Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract$Presenter;", "setSendToLinkSelectorPresenter", "(Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract$Presenter;)V", "socialLinkAdapter", "Lid/dana/sendmoney_v2/x2l/adapter/SocialLinkAdapter;", "getSocialLinkAdapter", "()Lid/dana/sendmoney_v2/x2l/adapter/SocialLinkAdapter;", "setSocialLinkAdapter", "(Lid/dana/sendmoney_v2/x2l/adapter/SocialLinkAdapter;)V", "getLayout", "iniRecyclerView", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setup", "updateSocialLinks", "socialLinks", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendToLinkSelectorView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    @NotNull
    private Function1<? super SocialLinkModel, Unit> getMax;
    private HashMap length;
    @Inject
    public PhotoBrowseView.AnonymousClass8.length sendToLinkSelectorPresenter;
    public PhotoBrowseView.AnonymousClass2 socialLinkAdapter;

    @JvmOverloads
    public SendToLinkSelectorView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SendToLinkSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_send_to_link_selector;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<SocialLinkModel, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final void invoke(@NotNull SocialLinkModel socialLinkModel) {
            Intrinsics.checkNotNullParameter(socialLinkModel, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SocialLinkModel) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendToLinkSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendToLinkSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = length.INSTANCE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SendToLinkSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = length.INSTANCE;
    }

    @NotNull
    public final PhotoBrowseView.AnonymousClass8.length getSendToLinkSelectorPresenter() {
        PhotoBrowseView.AnonymousClass8.length length2 = this.sendToLinkSelectorPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendToLinkSelectorPresenter");
        }
        return length2;
    }

    public final void setSendToLinkSelectorPresenter(@NotNull PhotoBrowseView.AnonymousClass8.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.sendToLinkSelectorPresenter = length2;
    }

    @NotNull
    public final PhotoBrowseView.AnonymousClass2 getSocialLinkAdapter() {
        PhotoBrowseView.AnonymousClass2 r0 = this.socialLinkAdapter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialLinkAdapter");
        }
        return r0;
    }

    public final void setSocialLinkAdapter(@NotNull PhotoBrowseView.AnonymousClass2 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.socialLinkAdapter = r2;
    }

    @NotNull
    public final Function1<SocialLinkModel, Unit> getOnSocialLinkSelected() {
        return this.getMax;
    }

    public final void setOnSocialLinkSelected(@NotNull Function1<? super SocialLinkModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.getMax = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/sendmoney_v2/x2l/view/SendToLinkSelectorView$sendToLinkSelectorModule$1", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract$View;", "onGetSocialLinks", "", "socialLinks", "", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements PhotoBrowseView.AnonymousClass8.getMax {
        final /* synthetic */ SendToLinkSelectorView setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(SendToLinkSelectorView sendToLinkSelectorView) {
            this.setMax = sendToLinkSelectorView;
        }

        public final void setMin(@NotNull List<SocialLinkModel> list) {
            Intrinsics.checkNotNullParameter(list, "socialLinks");
            SendToLinkSelectorView.access$updateSocialLinks(this.setMax, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "position", "", "onItemClick", "id/dana/sendmoney_v2/x2l/view/SendToLinkSelectorView$iniRecyclerView$1$1$1", "id/dana/sendmoney_v2/x2l/view/SendToLinkSelectorView$$special$$inlined$run$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Ignore.setMin {
        final /* synthetic */ SendToLinkSelectorView getMin;
        final /* synthetic */ PhotoBrowseView.AnonymousClass2 length;
        final /* synthetic */ RecyclerView setMin;

        setMax(PhotoBrowseView.AnonymousClass2 r1, RecyclerView recyclerView, SendToLinkSelectorView sendToLinkSelectorView) {
            this.length = r1;
            this.setMin = recyclerView;
            this.getMin = sendToLinkSelectorView;
        }

        public final void length(int i) {
            Function1<SocialLinkModel, Unit> onSocialLinkSelected = this.getMin.getOnSocialLinkSelected();
            Object min = this.length.setMin(i);
            Intrinsics.checkNotNullExpressionValue(min, "getItem(position)");
            onSocialLinkSelected.invoke(min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/x2l/view/SendToLinkSelectorView$Companion;", "", "()V", "SPAN_SIZE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        PhotoBrowseView.PhotoPagerAdapter.setMin setmin = new PhotoBrowseView.PhotoPagerAdapter.setMin((byte) 0);
        if (r4 != null) {
            setmin.length = r4;
            setmin.getMax = new SendToLinkSelectorModule(new getMin(this));
            stopIgnoring.setMin(setmin.getMax, SendToLinkSelectorModule.class);
            stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
            new PhotoBrowseView.PhotoPagerAdapter(setmin.getMax, setmin.length, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            PhotoBrowseView.AnonymousClass8.length length2 = this.sendToLinkSelectorPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendToLinkSelectorPresenter");
            }
            getminArr[0] = length2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void setup() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        if (recyclerView != null) {
            PhotoBrowseView.AnonymousClass2 r1 = new IMultiInstanceInvalidationCallback.Stub<toggleFinish, SocialLinkModel>() {
                public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    return new toggleFinish(viewGroup);
                }
            };
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
            recyclerView.setAdapter(r1);
            this.socialLinkAdapter = r1;
            r1.getMax((Ignore.setMin) new setMax(r1, recyclerView, this));
        }
        PhotoBrowseView.AnonymousClass8.length length2 = this.sendToLinkSelectorPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendToLinkSelectorPresenter");
        }
        length2.getMax();
    }

    public static final /* synthetic */ void access$updateSocialLinks(SendToLinkSelectorView sendToLinkSelectorView, List list) {
        PhotoBrowseView.AnonymousClass2 r1 = sendToLinkSelectorView.socialLinkAdapter;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialLinkAdapter");
        }
        r1.getMin(list);
    }
}
