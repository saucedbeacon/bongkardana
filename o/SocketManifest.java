package o;

import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.social.model.ReactionCountModel;
import id.dana.social.view.ReactionView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.WebSocketBridgeExtension;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lid/dana/social/adapter/FeedReactionAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/social/adapter/ReactionCountViewHolder;", "Lid/dana/social/model/ReactionCountModel;", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "reactions", "", "feedReactionClickListener", "Lid/dana/social/adapter/FeedReactionClickListener;", "(Lid/dana/social/adapter/SocialFeedClickListener;Ljava/util/List;Lid/dana/social/adapter/FeedReactionClickListener;)V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toggleReactionSelectedStatus", "itemPos", "nonFirstReactionModifiedCallback", "Lkotlin/Function0;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SocketManifest extends IMultiInstanceInvalidationCallback.Stub<WebSocketBridgeExtension.AnonymousClass1, ReactionCountModel> {
    @NotNull
    public static final getMax length = new getMax((byte) 0);
    private final signRequest getMax;
    private final initContent setMax;

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i, List list) {
        WebSocketBridgeExtension.AnonymousClass1 r4 = (WebSocketBridgeExtension.AnonymousClass1) valueof;
        Intrinsics.checkNotNullParameter(r4, "holder");
        Intrinsics.checkNotNullParameter(list, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(r4, i, list);
            return;
        }
        ReactionCountModel reactionCountModel = (ReactionCountModel) getMax().get(i);
        Iterable iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Object next : iterable) {
            if (next != null) {
                arrayList.add(Integer.valueOf(((Integer) next).intValue()));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        for (Number intValue : (List) arrayList) {
            if (intValue.intValue() == 1) {
                boolean max = reactionCountModel.getMax();
                View view = r4.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                ReactionView reactionView = (ReactionView) view.findViewById(resetInternal.setMax.initFeature);
                if (reactionView != null) {
                    reactionView.setReactionActive(max);
                }
                r4.getMax(reactionCountModel.setMax);
            }
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Ignore<ReactionCountModel>(viewGroup, this.setMax, this.getMax) {
            /* access modifiers changed from: private */
            public final initContent getMax;
            /* access modifiers changed from: private */
            public signRequest getMin;
            @NotNull
            private final ViewGroup setMin;

            public final /* synthetic */ void setMax(Object obj) {
                ReactionCountModel reactionCountModel = (ReactionCountModel) obj;
                if (reactionCountModel != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    ReactionView reactionView = (ReactionView) view.findViewById(resetInternal.setMax.initFeature);
                    if (reactionView != null) {
                        reactionView.setOnClickListener(new getMax(reactionCountModel, this, reactionCountModel));
                        reactionView.setOnLongClickListener(new length(reactionView, reactionCountModel, this, reactionCountModel));
                        reactionView.setEmoji(reactionCountModel.getMin);
                    }
                    boolean max = reactionCountModel.getMax();
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    ReactionView reactionView2 = (ReactionView) view2.findViewById(resetInternal.setMax.initFeature);
                    if (reactionView2 != null) {
                        reactionView2.setReactionActive(max);
                    }
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    ReactionView reactionView3 = (ReactionView) view3.findViewById(resetInternal.setMax.initFeature);
                    if (reactionView3 != null) {
                        reactionView3.setEmoji(reactionCountModel.getMin);
                    }
                    getMax(reactionCountModel.setMax);
                }
            }

            {
                Intrinsics.checkNotNullParameter(r3, "parent");
                Intrinsics.checkNotNullParameter(r4, "socialFeedClickListener");
                Intrinsics.checkNotNullParameter(r5, "feedReactionClickListener");
                this.setMin = r3;
                this.getMax = r4;
                this.getMin = r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/adapter/ReactionCountViewHolder$bindData$1$1$1", "id/dana/social/adapter/ReactionCountViewHolder$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.WebSocketBridgeExtension$1$getMax */
            static final class getMax implements View.OnClickListener {
                final /* synthetic */ ReactionCountModel getMin;
                final /* synthetic */ ReactionCountModel length;
                final /* synthetic */ AnonymousClass1 setMin;

                getMax(ReactionCountModel reactionCountModel, AnonymousClass1 r2, ReactionCountModel reactionCountModel2) {
                    this.getMin = reactionCountModel;
                    this.setMin = r2;
                    this.length = reactionCountModel2;
                }

                public final void onClick(View view) {
                    this.setMin.getMax.length(this.getMin);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick", "id/dana/social/adapter/ReactionCountViewHolder$bindData$1$1$2", "id/dana/social/adapter/ReactionCountViewHolder$$special$$inlined$apply$lambda$2"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.WebSocketBridgeExtension$1$length */
            static final class length implements View.OnLongClickListener {
                final /* synthetic */ AnonymousClass1 getMax;
                final /* synthetic */ ReactionCountModel getMin;
                final /* synthetic */ ReactionView length;
                final /* synthetic */ ReactionCountModel setMin;

                length(ReactionView reactionView, ReactionCountModel reactionCountModel, AnonymousClass1 r3, ReactionCountModel reactionCountModel2) {
                    this.length = reactionView;
                    this.setMin = reactionCountModel;
                    this.getMax = r3;
                    this.getMin = reactionCountModel2;
                }

                public final boolean onLongClick(View view) {
                    Vibrator vibrator = (Vibrator) this.length.getContext().getSystemService("vibrator");
                    if (CornerMarkingDataProvider.FastBitmap$CoordinateSystem()) {
                        vibrator.vibrate(VibrationEffect.createOneShot(100, -1));
                    } else {
                        vibrator.vibrate(100);
                    }
                    this.getMax.getMin.length(this.getMin.getMin);
                    return true;
                }
            }

            public final void getMax(int i) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                ReactionView reactionView = (ReactionView) view.findViewById(resetInternal.setMax.initFeature);
                if (reactionView != null) {
                    reactionView.setReactionCount(Integer.valueOf(i));
                }
            }
        };
    }

    public SocketManifest(@NotNull initContent initcontent, @NotNull List<ReactionCountModel> list, @NotNull signRequest signrequest) {
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedClickListener");
        Intrinsics.checkNotNullParameter(list, "reactions");
        Intrinsics.checkNotNullParameter(signrequest, "feedReactionClickListener");
        this.setMax = initcontent;
        this.getMax = signrequest;
        getMin(list);
    }

    public final long getItemId(int i) {
        return (long) Integer.parseInt(((ReactionCountModel) getMax().get(i)).getMin, 16);
    }

    public final void setMin(int i, @Nullable Function0<Unit> function0) {
        if (i >= 0 && i < getMax().size()) {
            boolean max = ((ReactionCountModel) getMax().get(i)).getMax();
            ((ReactionCountModel) getMax().get(i)).setMax += max ? -1 : 1;
            ((ReactionCountModel) getMax().get(i)).length = !max;
            if (((ReactionCountModel) getMax().get(i)).setMax <= 0) {
                getMax().remove(i);
                notifyItemRemoved(i);
                return;
            }
            if (function0 != null) {
                function0.invoke();
            }
            if (function0 == null) {
                notifyItemChanged(i, 1);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/adapter/FeedReactionAdapter$Companion;", "", "()V", "INTEGER_PARSING_RADIX", "", "PAYLOAD_REACTION_CONTENT_UPDATED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
