package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.oauth.ScopeViewHolder;
import id.dana.oauth.activity.InputNameActivity;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.IMultiInstanceInvalidationCallback;
import o.SnapshotBridgeExtension;
import o.getScreenBrightness;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/oauth/adapter/BindingBenefitAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/oauth/model/BindingBenefitModel;", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "BindingBenefitItemViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ScreenShotObserver extends IMultiInstanceInvalidationCallback.Stub<Ignore<SnapshotBridgeExtension.AnonymousClass2>, SnapshotBridgeExtension.AnonymousClass2> {
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setMin(viewGroup);
    }

    public class H5ScreenShotListener extends IMultiInstanceInvalidationCallback.Stub<Ignore<saveImageToGallery>, saveImageToGallery> {
        public /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
            onBindViewHolder((Ignore) valueof, i);
        }

        @Inject
        H5ScreenShotListener() {
        }

        public final void getMax(Ignore<saveImageToGallery> ignore, int i) {
            super.onBindViewHolder(ignore, i);
            if (((saveImageToGallery) setMin(i)).setMax.equals("Item Powered By Alipay")) {
                ignore.setMax((saveImageToGallery) setMin(i));
            }
        }

        public int getItemViewType(int i) {
            return ((saveImageToGallery) setMin(i)).setMax.equals("Item Powered By Alipay") ? 1 : 0;
        }

        @NonNull
        public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new setScreenBrightness(viewGroup);
            }
            return new ScopeViewHolder(viewGroup);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¨\u0006\u0011"}, d2 = {"Lid/dana/oauth/adapter/BindingBenefitAdapter$BindingBenefitItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/oauth/model/BindingBenefitModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "bindImage", "imageUrl", "", "targetView", "Landroid/widget/ImageView;", "getLocaleName", "bindingBenefitModel", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class setMin extends Ignore<SnapshotBridgeExtension.AnonymousClass2> {
        @NotNull
        public static final getMin setMax = new getMin((byte) 0);

        public final /* synthetic */ void setMax(Object obj) {
            String str;
            SnapshotBridgeExtension.AnonymousClass2 r6 = (SnapshotBridgeExtension.AnonymousClass2) obj;
            if (r6 != null) {
                View view = this.itemView;
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.setBaselineAligned);
                if (textView != null) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
                    if (StringsKt.equals(locale.getCountry(), "id", true)) {
                        str = r6.length;
                    } else {
                        str = r6.setMax;
                    }
                    textView.setText(str);
                }
                String str2 = r6.getMax;
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setInverseBackgroundForced);
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivBenefitIcon");
                ((updateCornerMarking) Glide.getMax(this.length)).setMax(str2).length((ImageView) appCompatImageView);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_binding_benefit, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/oauth/adapter/BindingBenefitAdapter$BindingBenefitItemViewHolder$Companion;", "", "()V", "INDONESIA", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(byte b) {
                this();
            }
        }
    }

    /* renamed from: o.ScreenShotObserver$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<InputNameActivity> {
        @InjectedFieldSignature("id.dana.oauth.activity.InputNameActivity.presenter")
        public static void length(InputNameActivity inputNameActivity, getScreenBrightness.setMax setmax) {
            inputNameActivity.presenter = setmax;
        }
    }
}
