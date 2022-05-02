package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.constant.BranchLinkConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GyroscopeSensorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u001f\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/onboarding/view/SimplePagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onItemClickListener", "Lid/dana/onboarding/view/SimplePagerAdapter$OnItemClickListener;", "viewList", "", "Lid/dana/onboarding/view/BaseSimpleView;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "objects", "", "getCount", "getItem", "getItemView", "Landroid/view/View;", "getPageTitle", "", "instantiateItem", "isViewFromObject", "", "view", "setOnItemClickListener", "setViewList", "OnItemClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class setStatusBar extends setExpandActivityOverflowButtonDrawable {
    @NotNull
    private final Context getMax;
    private List<? extends GyroscopeSensorService.SensorChangedListener> length;
    public length setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/onboarding/view/SimplePagerAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void getMin(int i);
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "objects");
        return view == obj;
    }

    public setStatusBar(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = context;
    }

    public void getMin(@Nullable List<? extends GyroscopeSensorService.SensorChangedListener> list) {
        this.length = list;
    }

    public int getCount() {
        List<? extends GyroscopeSensorService.SensorChangedListener> list = this.length;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @NotNull
    public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, BranchLinkConstant.PathTarget.CONTAINER);
        List<? extends GyroscopeSensorService.SensorChangedListener> list = this.length;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            GyroscopeSensorService.SensorChangedListener sensorChangedListener = (GyroscopeSensorService.SensorChangedListener) list.get(i);
            sensorChangedListener.length(this.getMax, viewGroup);
            View view = sensorChangedListener.toFloatRange;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            view.setOnClickListener(new setMax(this, i));
            viewGroup.addView(view);
            return view;
        }
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        Intrinsics.checkNotNullExpressionValue(instantiateItem, "super.instantiateItem(container, position)");
        return instantiateItem;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ int getMax;
        final /* synthetic */ setStatusBar setMin;

        setMax(setStatusBar setstatusbar, int i) {
            this.setMin = setstatusbar;
            this.getMax = i;
        }

        public final void onClick(@Nullable View view) {
            if (this.setMin.setMax != null) {
                length max = this.setMin.setMax;
                Intrinsics.checkNotNull(max);
                max.getMin(this.getMax);
            }
        }
    }

    public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, BranchLinkConstant.PathTarget.CONTAINER);
        Intrinsics.checkNotNullParameter(obj, "objects");
        viewGroup.removeView((View) obj);
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1531082183, oncanceled);
            onCancelLoad.getMin(-1531082183, oncanceled);
        }
        List<? extends GyroscopeSensorService.SensorChangedListener> list = this.length;
        if (list == null) {
            return super.getPageTitle(i);
        }
        Intrinsics.checkNotNull(list);
        return ((GyroscopeSensorService.SensorChangedListener) list.get(i)).setMin();
    }
}
