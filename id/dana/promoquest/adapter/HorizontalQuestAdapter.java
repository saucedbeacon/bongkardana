package id.dana.promoquest.adapter;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.promoquest.model.QuestModel;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.IntRange;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.getBluetoothAdapterState;
import o.getSecureSignatureComp;
import o.hideProgress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003789B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J\b\u0010\u001c\u001a\u00020\nH\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\u0018J\b\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0016J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\nH\u0016J\u0018\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nH\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0018\u00101\u001a\u00020\u00182\u0006\u0010&\u001a\u0002022\u0006\u0010$\u001a\u00020\nH\u0002J\u0014\u00103\u001a\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J\u0018\u00104\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\u0006\u00105\u001a\u000206H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lid/dana/promoquest/adapter/HorizontalQuestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "widthReference", "Landroid/view/View;", "(Landroid/view/View;)V", "itemList", "", "Lid/dana/promoquest/model/QuestModel;", "missionType", "", "getMissionType", "()I", "setMissionType", "(I)V", "quests", "", "getQuests", "()Ljava/util/List;", "timerDisposable", "Lio/reactivex/disposables/Disposable;", "totalQuests", "getTotalQuests", "addQuest", "", "quest", "notifyAdapter", "", "calculateDividerWidth", "calculateQuestItemMargins", "Lkotlin/Pair;", "questWidth", "clearQuests", "disposeObservable", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "playAnimation", "questStatusIcon", "Landroid/widget/ImageView;", "removeQuest", "id", "", "setDividerBackgroundColor", "Lid/dana/promoquest/adapter/HorizontalQuestAdapter$DividerViewHolder;", "setQuest", "startAnimation", "animation", "Landroid/view/animation/Animation;", "DividerViewHolder", "QuestViewHolder", "ViewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HorizontalQuestAdapter extends RecyclerView.Adapter<RecyclerView.valueOf> {
    public GriverProgressBar.UpdateRunnable getMax;
    public final List<QuestModel> length = new ArrayList();
    public int setMax;
    private final View setMin;

    public HorizontalQuestAdapter(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "widthReference");
        this.setMin = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/promoquest/adapter/HorizontalQuestAdapter$ViewType;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    @interface ViewType {
        @NotNull
        public static final setMin Companion = setMin.getMin;
        public static final int DIVIDER = 1;
        public static final int QUEST_ITEM = 0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/promoquest/adapter/HorizontalQuestAdapter$ViewType$Companion;", "", "()V", "DIVIDER", "", "QUEST_ITEM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            static final /* synthetic */ setMin getMin = new setMin();

            private setMin() {
            }
        }
    }

    public final void length(@NotNull List<QuestModel> list) {
        Intrinsics.checkNotNullParameter(list, "quests");
        this.length.clear();
        Intrinsics.checkNotNullParameter(list, "quests");
        if (!list.isEmpty()) {
            int size = 5 - ((this.length.size() + 1) / 2);
            if (size > 0) {
                List take = CollectionsKt.take(list, size);
                if (this.length.isEmpty()) {
                    this.length.add(take.get(0));
                }
                int size2 = take.size();
                for (int i = 1; i < size2; i++) {
                    this.length.add((Object) null);
                    this.length.add(take.get(i));
                }
            }
        }
        notifyDataSetChanged();
    }

    public final int getItemViewType(int i) {
        return this.length.get(i) == null ? 1 : 0;
    }

    @NotNull
    public final RecyclerView.valueOf onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.view_item_promo_quest_circle_wiggle, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…           parent, false)");
            return new getMax(inflate);
        }
        View inflate2 = from.inflate(R.layout.view_item_quest_horizontal_divider_sequential, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflater.inflate(\n      …equential, parent, false)");
        return new getMin(inflate2);
    }

    public final int getItemCount() {
        return this.length.size();
    }

    public final void onBindViewHolder(@NotNull RecyclerView.valueOf valueof, int i) {
        Pair pair;
        Intrinsics.checkNotNullParameter(valueof, "holder");
        String str = null;
        if (valueof instanceof getMin) {
            View view = valueof.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            getBluetoothAdapterState.setMax(view, Integer.valueOf((this.setMin.getWidth() - (((this.length.size() + 1) / 2) * ((int) TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())))) / (this.length.size() / 2)), (Integer) null);
            if (this.setMax == 0) {
                View view2 = valueof.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
                view2.setVisibility(0);
                getMin getmin = (getMin) valueof;
                QuestModel questModel = this.length.get(i - 1);
                if (questModel != null) {
                    QuestModel questModel2 = (QuestModel) CollectionsKt.getOrNull(this.length, i + 1);
                    String[] strArr = {"FINISH", "COMPLETE"};
                    Drawable length2 = IntRange.length(getmin.getMax.getContext(), (int) R.drawable.view_item_quest_horizontal_divider_sequential_background);
                    if (ArraysKt.contains((T[]) strArr, questModel.getMax)) {
                        if (questModel2 != null) {
                            str = questModel2.getMax;
                        }
                        if (ArraysKt.contains((T[]) strArr, str) && length2 != null) {
                            int max = IntRange.setMax(getmin.getMax.getContext(), R.color.f20282131099934);
                            Intrinsics.checkNotNullParameter(length2, "$this$applyTint");
                            length2.mutate().setColorFilter(max, PorterDuff.Mode.SRC_IN);
                        }
                    }
                    getmin.getMax.setBackground(length2);
                    return;
                }
                return;
            }
            View view3 = valueof.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
            view3.setVisibility(4);
            return;
        }
        QuestModel questModel3 = this.length.get(i);
        if (questModel3 != null) {
            View view4 = valueof.itemView;
            if (view4 != null) {
                ImageView imageView = (ImageView) view4;
                imageView.setImageResource(questModel3.getMax());
                if (questModel3.setMax()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), R.anim.f722130772044);
                    loadAnimation.setAnimationListener(new length(this, loadAnimation, imageView));
                    Intrinsics.checkNotNullExpressionValue(loadAnimation, "shakeAnimation");
                    imageView.startAnimation(loadAnimation);
                }
                View view5 = valueof.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "holder.itemView");
                int width = view5.getWidth();
                if (getItemCount() == 1) {
                    if (getItemCount() == 1) {
                        int width2 = (this.setMin.getWidth() - width) / 2;
                        pair = new Pair(Integer.valueOf(width2), Integer.valueOf(width2));
                    } else {
                        pair = new Pair(0, 0);
                    }
                    View view6 = valueof.itemView;
                    Intrinsics.checkNotNullExpressionValue(view6, "holder.itemView");
                    getBluetoothAdapterState.setMin(view6, (Integer) pair.getFirst(), (Integer) pair.getSecond(), (Integer) null, 10);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/promoquest/adapter/HorizontalQuestAdapter$playAnimation$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements Animation.AnimationListener {
        final /* synthetic */ HorizontalQuestAdapter getMax;
        final /* synthetic */ ImageView length;
        final /* synthetic */ Animation setMin;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        length(HorizontalQuestAdapter horizontalQuestAdapter, Animation animation, ImageView imageView) {
            this.getMax = horizontalQuestAdapter;
            this.setMin = animation;
            this.length = imageView;
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            this.setMin.setAnimationListener(this);
            this.getMax.getMax = TitleBarRightButtonView.AnonymousClass1.timer(2, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new getMax(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
        static final class getMax<T> implements RedDotManager<Long> {
            final /* synthetic */ length setMin;

            getMax(length length) {
                this.setMin = length;
            }

            public final /* synthetic */ void accept(Object obj) {
                ImageView imageView = this.setMin.length;
                Animation animation = this.setMin.setMin;
                Intrinsics.checkNotNullExpressionValue(animation, "shakeAnimation");
                imageView.startAnimation(animation);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/promoquest/adapter/HorizontalQuestAdapter$DividerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "divider", "getDivider", "()Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class getMin extends RecyclerView.valueOf {
        @NotNull
        final View getMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.f42412131362742);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.divider)");
            this.getMax = findViewById;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/promoquest/adapter/HorizontalQuestAdapter$QuestViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class getMax extends RecyclerView.valueOf {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }
}
