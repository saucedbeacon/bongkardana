package id.dana.nearbyme.merchantdetail.merchantphoto;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.nearbyme.di.module.MerchantPhotoViewerModule;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverDialog;
import o.GriverEmbedWebViewJsApiPermissionProxyImpl;
import o.PrepareException;
import o.evaluate;
import o.invalidateDrawable;
import o.positiveString;
import o.resetInternal;
import o.setColorFilter;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\"\u001a\u00020\rH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerDialog;", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerDialog;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "()V", "merchantPhotoViewerPresenter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$Presenter;", "getMerchantPhotoViewerPresenter", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$Presenter;", "setMerchantPhotoViewerPresenter", "(Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$Presenter;)V", "merchantViewerModel", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerModel;", "bindData", "", "data", "view", "Landroid/view/View;", "bindUsername", "extractArgument", "getApplicationComponent", "Lid/dana/di/component/ApplicationComponent;", "getPresenter", "initInjection", "loadImage", "imageUrl", "", "imageView", "Landroid/widget/ImageView;", "errorPlaceHolder", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setupTitle", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantPhotoViewerDialog extends GriverDialog.AnonymousClass2<MerchantImageModel> {
    @NotNull
    public static final length length = new length((byte) 0);
    private MerchantPhotoViewerModel getMax;
    @Inject
    public positiveString.length<MerchantImageModel> merchantPhotoViewerPresenter;
    private HashMap setMax;

    public final View length(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void length() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final /* synthetic */ void getMax(Parcelable parcelable, View view) {
        String str;
        Resources resources;
        MerchantImageModel merchantImageModel = (MerchantImageModel) parcelable;
        Intrinsics.checkNotNullParameter(merchantImageModel, "data");
        Intrinsics.checkNotNullParameter(view, "view");
        String str2 = merchantImageModel.length;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.getTransparentRegion);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "view.iv_media_preview");
        setMax(str2, appCompatImageView, R.drawable.image_broken_large);
        String str3 = merchantImageModel.setMin;
        CircleImageView circleImageView = (CircleImageView) view.findViewById(resetInternal.setMax.adjustVolume);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "view.civ_media_info");
        setMax(str3, circleImageView, R.drawable.avatar_placeholder);
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.setNavigationIcon);
        Intrinsics.checkNotNullExpressionValue(textView, "view.tv_media_info_title");
        MerchantPhotoViewerModel merchantPhotoViewerModel = this.getMax;
        if (merchantPhotoViewerModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantViewerModel");
        }
        textView.setText(merchantPhotoViewerModel.getMax);
        if (merchantImageModel.getMax.length() == 0) {
            Context context = getContext();
            str = (context == null || (resources = context.getResources()) == null) ? null : resources.getString(R.string.user_review_anonymous_label);
        } else {
            str = merchantImageModel.getMax;
        }
        TextView textView2 = (TextView) view.findViewById(resetInternal.setMax.setNavigationContentDescription);
        Intrinsics.checkNotNullExpressionValue(textView2, "view.tv_media_info_subtitle");
        textView2.setText(getString(R.string.merchant_photo_author, str));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        MerchantPhotoViewerModel merchantPhotoViewerModel;
        super.onCreate(bundle);
        GriverEmbedWebViewJsApiPermissionProxyImpl.getMax getmax = new GriverEmbedWebViewJsApiPermissionProxyImpl.getMax((byte) 0);
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext instanceof DanaApplication)) {
            applicationContext = null;
        }
        DanaApplication danaApplication = (DanaApplication) applicationContext;
        PrepareException.AnonymousClass1 applicationComponent = danaApplication != null ? danaApplication.getApplicationComponent() : null;
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            getmax.length = new MerchantPhotoViewerModule(this);
            stopIgnoring.setMin(getmax.length, MerchantPhotoViewerModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new GriverEmbedWebViewJsApiPermissionProxyImpl(getmax.length, getmax.setMax, (byte) 0).getMax(this);
            Bundle arguments = getArguments();
            if (arguments != null && (merchantPhotoViewerModel = (MerchantPhotoViewerModel) arguments.getParcelable("MERCHANT_VIEWER_MODEL_EXTRA")) != null) {
                Intrinsics.checkNotNullExpressionValue(merchantPhotoViewerModel, "it");
                this.getMax = merchantPhotoViewerModel;
                return;
            }
            return;
        }
        throw null;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) length(resetInternal.setMax.setNavigationOnClickListener);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_media_title");
        textView.setText(getString(R.string.title_merchant_viewer_dialog));
    }

    @NotNull
    public final positiveString.length<MerchantImageModel> getMax() {
        positiveString.length<MerchantImageModel> length2 = this.merchantPhotoViewerPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantPhotoViewerPresenter");
        }
        return length2;
    }

    private final void setMax(String str, ImageView imageView, int i) {
        Context context = getContext();
        if (context != null) {
            ((updateCornerMarking) Glide.getMax(context)).setMax(str).setMin(i).setMax(evaluate.setMin).length(imageView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerDialog$Companion;", "", "()V", "MERCHANT_VIEWER_MODEL_EXTRA", "", "TAG", "buildDialog", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerDialog;", "model", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerModel;", "removeIfDialogAlreadyInBackStack", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "show", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        private static MerchantPhotoViewerDialog length(MerchantPhotoViewerModel merchantPhotoViewerModel) {
            MerchantPhotoViewerDialog merchantPhotoViewerDialog = new MerchantPhotoViewerDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("MERCHANT_VIEWER_MODEL_EXTRA", merchantPhotoViewerModel);
            bundle.putParcelable("MEDIA_VIEWER_MODEL_EXTRA", merchantPhotoViewerModel.setMax);
            Unit unit = Unit.INSTANCE;
            merchantPhotoViewerDialog.setArguments(bundle);
            merchantPhotoViewerDialog.setStyle(2, 0);
            return merchantPhotoViewerDialog;
        }

        public static void getMin(@NotNull FragmentManager fragmentManager, @NotNull MerchantPhotoViewerModel merchantPhotoViewerModel) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(merchantPhotoViewerModel, H5GetLogInfoBridge.RESULT_MODEL);
            setColorFilter setcolorfilter = new setColorFilter(fragmentManager);
            Intrinsics.checkNotNullExpressionValue(setcolorfilter, "fragmentManager.beginTransaction()");
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("MerchantPhotoViewer");
            if (findFragmentByTag != null) {
                setcolorfilter.length(findFragmentByTag);
            }
            if (setcolorfilter.hashCode) {
                setcolorfilter.IsOverlapping = true;
                setcolorfilter.toString = null;
                length(merchantPhotoViewerModel).show((invalidateDrawable) setcolorfilter, "MerchantPhotoViewer");
                return;
            }
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
