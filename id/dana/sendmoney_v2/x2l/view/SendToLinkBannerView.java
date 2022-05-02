package id.dana.sendmoney_v2.x2l.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.sendmoney_v2.x2l.di.SendToLinkBannerModule;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoPreview;
import o.PrepareException;
import o.access$2602;
import o.getPhotoList;
import o.onDelete;
import o.resetInternal;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u001c\u0010\u001d\u001a\u00020\u0019*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0002J\f\u0010\"\u001a\u00020\u0019*\u00020\u0016H\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lid/dana/sendmoney_v2/x2l/view/SendToLinkBannerView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "sendToLinkBannerModule", "Lid/dana/sendmoney_v2/x2l/di/SendToLinkBannerModule;", "getSendToLinkBannerModule", "()Lid/dana/sendmoney_v2/x2l/di/SendToLinkBannerModule;", "sendToLinkBannerPresenter", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$Presenter;", "getSendToLinkBannerPresenter", "()Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$Presenter;", "setSendToLinkBannerPresenter", "(Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$Presenter;)V", "getDefaultBannerConfigModel", "Lid/dana/sendmoney_v2/x2l/model/BannerConfigModel;", "getLayout", "injectComponent", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setup", "loadImage", "Landroidx/appcompat/widget/AppCompatImageView;", "url", "", "placeholder", "renderBanner", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendToLinkBannerView extends BaseRichView {
    private HashMap getMin;
    @Inject
    public access$2602.length sendToLinkBannerPresenter;

    @JvmOverloads
    public SendToLinkBannerView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SendToLinkBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_send_to_link_banner;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendToLinkBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendToLinkBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SendToLinkBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final access$2602.length getSendToLinkBannerPresenter() {
        access$2602.length length = this.sendToLinkBannerPresenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendToLinkBannerPresenter");
        }
        return length;
    }

    public final void setSendToLinkBannerPresenter(@NotNull access$2602.length length) {
        Intrinsics.checkNotNullParameter(length, "<set-?>");
        this.sendToLinkBannerPresenter = length;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney_v2/x2l/view/SendToLinkBannerView$sendToLinkBannerModule$1", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$View;", "onError", "", "errorMessage", "", "onGetBannerConfig", "bannerConfigModel", "Lid/dana/sendmoney_v2/x2l/model/BannerConfigModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements access$2602.setMin {
        final /* synthetic */ SendToLinkBannerView getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(SendToLinkBannerView sendToLinkBannerView) {
            this.getMin = sendToLinkBannerView;
        }

        public final void getMin(@NotNull PhotoPreview photoPreview) {
            Intrinsics.checkNotNullParameter(photoPreview, "bannerConfigModel");
            SendToLinkBannerView.access$renderBanner(this.getMin, photoPreview);
        }

        public final void onError(@Nullable String str) {
            SendToLinkBannerView sendToLinkBannerView = this.getMin;
            SendToLinkBannerView.access$renderBanner(sendToLinkBannerView, SendToLinkBannerView.access$getDefaultBannerConfigModel(sendToLinkBannerView));
        }
    }

    public final void setup() {
        access$2602.length length = this.sendToLinkBannerPresenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendToLinkBannerPresenter");
        }
        length.getMin();
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        getPhotoList.setMin setmin = new getPhotoList.setMin((byte) 0);
        if (r4 != null) {
            setmin.length = r4;
            setmin.getMax = new SendToLinkBannerModule(new setMin(this));
            stopIgnoring.setMin(setmin.getMax, SendToLinkBannerModule.class);
            stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
            new getPhotoList(setmin.getMax, setmin.length, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            access$2602.length length = this.sendToLinkBannerPresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendToLinkBannerPresenter");
            }
            getminArr[0] = length;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$renderBanner(SendToLinkBannerView sendToLinkBannerView, PhotoPreview photoPreview) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) sendToLinkBannerView._$_findCachedViewById(resetInternal.setMax.setMeasureWithLargestChildEnabled);
        if (appCompatTextView != null) {
            appCompatTextView.setText(photoPreview.getMax);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) sendToLinkBannerView._$_findCachedViewById(resetInternal.setMax.getBaseline);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(photoPreview.setMax);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) sendToLinkBannerView._$_findCachedViewById(resetInternal.setMax.setOnItemSelectedListener);
        if (appCompatImageView != null) {
            ((updateCornerMarking) Glide.getMax(appCompatImageView.getContext())).setMax(photoPreview.length).setMax((int) R.drawable.bg_illustration_send_to_chat_banner).setMin((int) R.drawable.bg_illustration_send_to_chat_banner).length((ImageView) appCompatImageView);
        }
    }

    public static final /* synthetic */ PhotoPreview access$getDefaultBannerConfigModel(SendToLinkBannerView sendToLinkBannerView) {
        Context context = sendToLinkBannerView.getContext();
        String string = context.getString(R.string.sendmoney_to_link_banner_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendmoney_to_link_banner_title)");
        String string2 = context.getString(R.string.sendmoney_to_link_banner_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sendmoney_to_link_banner_title)");
        return new PhotoPreview(string, string2, "");
    }
}
