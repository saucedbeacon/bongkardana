package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.nearbyme.model.PromoInfoModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/nearbyme/adapter/OtherStoreListAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "listener", "Lid/dana/nearbyme/adapter/OtherStoreListListener;", "(Lid/dana/nearbyme/adapter/OtherStoreListListener;)V", "getItemViewType", "", "position", "hideErrorView", "", "hideLabel", "hideLoadingSkeleton", "hideSeeMoreButton", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showLoadingSkeleton", "showSeeMoreButton", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setHandlerClassName extends IMultiInstanceInvalidationCallback.Stub<Ignore<H5Worker>, H5Worker> {
    /* access modifiers changed from: private */
    public final setEventClassNames setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ setHandlerClassName this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(setHandlerClassName sethandlerclassname) {
            super(1);
            this.this$0 = sethandlerclassname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            H5Worker h5Worker = (H5Worker) this.this$0.setMin(i);
            if (h5Worker != null) {
                this.this$0.setMax.length(h5Worker.setMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMax extends Lambda implements Function1<H5Worker, Boolean> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((H5Worker) obj));
        }

        public final boolean invoke(H5Worker h5Worker) {
            return h5Worker.length == 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<H5Worker, Boolean> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((H5Worker) obj));
        }

        public final boolean invoke(H5Worker h5Worker) {
            return h5Worker.length == 4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ setHandlerClassName this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(setHandlerClassName sethandlerclassname) {
            super(1);
            this.this$0 = sethandlerclassname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-2142208132, oncanceled);
                onCancelLoad.getMin(-2142208132, oncanceled);
            }
            H5Worker h5Worker = (H5Worker) this.this$0.setMin(i);
            if (h5Worker != null) {
                this.this$0.setMax.length(new GriverMenuExtensionImpl(h5Worker.setMin));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<H5Worker, Boolean> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((H5Worker) obj));
        }

        public final boolean invoke(H5Worker h5Worker) {
            return h5Worker.length == 3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<H5Worker, Boolean> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((H5Worker) obj));
        }

        public final boolean invoke(H5Worker h5Worker) {
            return h5Worker.length == 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ setHandlerClassName this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(setHandlerClassName sethandlerclassname) {
            super(1);
            this.this$0 = sethandlerclassname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            H5Worker h5Worker = (H5Worker) this.this$0.setMin(i);
            if (h5Worker != null) {
                setEventClassNames min = this.this$0.setMax;
                List<PromoInfoModel> list = h5Worker.setMin.Mean$Arithmetic;
                Intrinsics.checkNotNullExpressionValue(list, "it.shopModel.promoInfos");
                min.setMax(list);
            }
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == 1) {
            ignore = new GriverPageFactory(viewGroup, new setMin(this.setMax));
        } else if (i == 2) {
            ignore = new Ignore<H5Worker>(viewGroup) {
            };
        } else if (i != 3) {
            ignore = new GriverEngineFactoryImpl(viewGroup, new equals(this), new toIntRange(this), new isInside(this));
        } else {
            ignore = new getEventClassNames(viewGroup);
        }
        return ignore;
    }

    public setHandlerClassName(@NotNull setEventClassNames seteventclassnames) {
        Intrinsics.checkNotNullParameter(seteventclassnames, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.setMax = seteventclassnames;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function0<Unit> {
        setMin(setEventClassNames seteventclassnames) {
            super(0, seteventclassnames, setEventClassNames.class, "onSeeMoreClick", "onSeeMoreClick()V", 0);
        }

        public final void invoke() {
            ((setEventClassNames) this.receiver).length();
        }
    }

    public final int getItemViewType(int i) {
        return ((H5Worker) getMax().get(i)).length;
    }
}
