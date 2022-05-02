package id.dana.promoquest.views;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.promoquest.activity.MissionDetailActivity;
import id.dana.promoquest.adapter.HorizontalQuestAdapter;
import id.dana.promoquest.model.MissionModel;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.GriverProgressBar;
import o.getBluetoothAdapterState;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002IJB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020@H\u0002J\b\u0010B\u001a\u00020\u0007H\u0016J\b\u0010C\u001a\u00020@H\u0002J\b\u0010D\u001a\u00020\u0013H\u0014J\u0010\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020\u001eH\u0002J\b\u0010G\u001a\u00020@H\u0016J\b\u0010H\u001a\u00020@H\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010!\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R*\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b<\u0010!\u001a\u0004\b=\u00101\"\u0004\b>\u00103¨\u0006K"}, d2 = {"Lid/dana/promoquest/views/MissionCardView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "date", "Ljava/util/Date;", "expiresIn", "getExpiresIn", "()Ljava/util/Date;", "setExpiresIn", "(Ljava/util/Date;)V", "isQuestsVisible", "", "()Z", "setQuestsVisible", "(Z)V", "mission", "Lid/dana/promoquest/model/MissionModel;", "getMission", "()Lid/dana/promoquest/model/MissionModel;", "setMission", "(Lid/dana/promoquest/model/MissionModel;)V", "status", "", "missionStatus", "getMissionStatus$annotations", "()V", "getMissionStatus", "()Ljava/lang/String;", "setMissionStatus", "(Ljava/lang/String;)V", "title", "", "missionTitle", "getMissionTitle", "()Ljava/lang/CharSequence;", "setMissionTitle", "(Ljava/lang/CharSequence;)V", "type", "missionType", "getMissionType$annotations", "getMissionType", "()I", "setMissionType", "(I)V", "questAdapter", "Lid/dana/promoquest/adapter/HorizontalQuestAdapter;", "getQuestAdapter", "()Lid/dana/promoquest/adapter/HorizontalQuestAdapter;", "questsSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "cardSize", "size", "getSize$annotations", "getSize", "setSize", "dispose", "", "extinguishQuestList", "getLayout", "hideQuests", "isForRecyclerViewholder", "setMissionBanner", "url", "setup", "shimmerQuestList", "CardSize", "MissionType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissionCardView extends BaseRichView {
    private int IsOverlapping;
    @NotNull
    private String getMax;
    private onDetachedFromLayoutParams getMin;
    private HashMap isInside;
    private int length;
    @Nullable
    private MissionModel setMax;
    private boolean setMin;
    @Nullable
    private Date toFloatRange;

    @JvmOverloads
    public MissionCardView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MissionCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getMissionStatus$annotations() {
    }

    public static /* synthetic */ void getMissionType$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_item_promo_quest_mission_card;
    }

    public final boolean isForRecyclerViewholder() {
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MissionCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MissionCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        ((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.CheckResult)).setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ MissionCardView getMax;

            {
                this.getMax = r1;
            }

            public final void onClick(View view) {
                MissionModel mission = this.getMax.getMission();
                if (mission != null) {
                    MissionDetailActivity.length length = MissionDetailActivity.Companion;
                    Context context = this.getMax.getContext();
                    if (context != null) {
                        Activity activity = (Activity) context;
                        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                        Intrinsics.checkNotNullParameter(mission, "mission");
                        activity.startActivity(MissionDetailActivity.length.setMin(activity, mission));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        });
        this.getMax = "INIT";
        this.length = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MissionCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        ((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.CheckResult)).setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ MissionCardView getMax;

            {
                this.getMax = r1;
            }

            public final void onClick(View view) {
                MissionModel mission = this.getMax.getMission();
                if (mission != null) {
                    MissionDetailActivity.length length = MissionDetailActivity.Companion;
                    Context context = this.getMax.getContext();
                    if (context != null) {
                        Activity activity = (Activity) context;
                        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                        Intrinsics.checkNotNullParameter(mission, "mission");
                        activity.startActivity(MissionDetailActivity.length.setMin(activity, mission));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        });
        this.getMax = "INIT";
        this.length = 1;
    }

    public final void setup() {
        setClipToPadding(false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onReceiveContent);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_quest");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onReceiveContent);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_quest");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetStart);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_mission_title");
        recyclerView2.setAdapter(new HorizontalQuestAdapter(textView));
    }

    public final void dispose() {
        GriverProgressBar.UpdateRunnable updateRunnable = getQuestAdapter().getMax;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
    }

    @Nullable
    public final MissionModel getMission() {
        return this.setMax;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        if (r6 == null) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMission(@org.jetbrains.annotations.Nullable id.dana.promoquest.model.MissionModel r6) {
        /*
            r5 = this;
            r5.setMax = r6
            r0 = 0
            if (r6 == 0) goto L_0x0008
            java.lang.String r1 = r6.getMax
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5.setMissionTitle(r1)
            if (r6 == 0) goto L_0x0014
            java.lang.String r1 = r6.getMin
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r1 = "INIT"
        L_0x0016:
            r5.setMissionStatus(r1)
            if (r6 == 0) goto L_0x001e
            java.util.Date r1 = r6.length
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            r5.setExpiresIn(r1)
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x0035
            boolean r2 = r6.getMax()
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r6.IsOverlapping
            goto L_0x0031
        L_0x002f:
            java.lang.String r2 = r6.toFloatRange
        L_0x0031:
            if (r2 != 0) goto L_0x0036
            r2 = r1
            goto L_0x0036
        L_0x0035:
            r2 = r0
        L_0x0036:
            if (r2 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            android.content.Context r2 = r5.getContext()
            o.setHorizontalGap r2 = com.bumptech.glide.Glide.getMax((android.content.Context) r2)
            o.updateCornerMarking r2 = (o.updateCornerMarking) r2
            o.updateMessageMenuItem r1 = r2.setMax((java.lang.String) r1)
            r2 = 2131231051(0x7f08014b, float:1.8078172E38)
            o.updateMessageMenuItem r1 = r1.setMax((int) r2)
            o.updateMessageMenuItem r1 = r1.setMin((int) r2)
            o.evaluate r2 = o.evaluate.setMin
            o.updateMessageMenuItem r1 = r1.setMax((o.evaluate) r2)
            int r2 = o.resetInternal.setMax.getPadding
            android.view.View r2 = r5._$_findCachedViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.length((android.widget.ImageView) r2)
            id.dana.promoquest.model.MissionModel r1 = r5.setMax
            r2 = 1
            if (r1 == 0) goto L_0x0080
            boolean r1 = r1.length()
            if (r1 != r2) goto L_0x0080
            int r1 = o.resetInternal.setMax.getPadding
            android.view.View r1 = r5._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r3 = "iv_mission_banner"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            o.getBluetoothAdapterState.getMax(r1)
            goto L_0x008b
        L_0x0080:
            int r1 = o.resetInternal.setMax.getPadding
            android.view.View r1 = r5._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.clearColorFilter()
        L_0x008b:
            boolean r1 = r5.setMin
            java.lang.String r3 = "rv_quest"
            java.lang.String r4 = "rv_quest_skeleton"
            if (r1 == 0) goto L_0x0137
            if (r6 == 0) goto L_0x0098
            java.util.List<id.dana.promoquest.model.QuestModel> r6 = r6.toIntRange
            goto L_0x0099
        L_0x0098:
            r6 = r0
        L_0x0099:
            java.util.Collection r6 = (java.util.Collection) r6
            r1 = 0
            if (r6 == 0) goto L_0x00a7
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r6 = 0
            goto L_0x00a8
        L_0x00a7:
            r6 = 1
        L_0x00a8:
            if (r6 == 0) goto L_0x00ec
            int r6 = o.resetInternal.setMax.setImageDrawable
            android.view.View r6 = r5._$_findCachedViewById(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            r6.setVisibility(r1)
            o.onDetachedFromLayoutParams r6 = r5.getMin
            if (r6 != 0) goto L_0x011e
            int r6 = o.resetInternal.setMax.setImageDrawable
            android.view.View r6 = r5._$_findCachedViewById(r6)
            o.getInsetDodgeRect$setMax r0 = new o.getInsetDodgeRect$setMax
            r0.<init>(r6)
            r6 = 2131558992(0x7f0d0250, float:1.8743315E38)
            r0.getMax = r6
            r6 = 1300(0x514, float:1.822E-42)
            r0.setMax = r6
            r0.length = r2
            android.view.View r6 = r0.getMin
            android.content.Context r6 = r6.getContext()
            r2 = 2131100433(0x7f060311, float:1.7813247E38)
            int r6 = o.IntRange.setMax(r6, r2)
            r0.setMin = r6
            o.getInsetDodgeRect r6 = new o.getInsetDodgeRect
            r6.<init>(r0, r1)
            r6.getMin()
            o.onDetachedFromLayoutParams r6 = (o.onDetachedFromLayoutParams) r6
            r5.getMin = r6
            goto L_0x011e
        L_0x00ec:
            o.onDetachedFromLayoutParams r6 = r5.getMin
            if (r6 == 0) goto L_0x00f3
            r6.length()
        L_0x00f3:
            r5.getMin = r0
            id.dana.promoquest.model.MissionModel r6 = r5.setMax
            if (r6 == 0) goto L_0x010e
            id.dana.promoquest.adapter.HorizontalQuestAdapter r0 = r5.getQuestAdapter()
            boolean r2 = r6.setMax()
            r0.setMax = r2
            id.dana.promoquest.adapter.HorizontalQuestAdapter r0 = r5.getQuestAdapter()
            java.util.List<id.dana.promoquest.model.QuestModel> r2 = r6.toIntRange
            r0.length(r2)
            if (r6 != 0) goto L_0x011e
        L_0x010e:
            r6 = r5
            id.dana.promoquest.views.MissionCardView r6 = (id.dana.promoquest.views.MissionCardView) r6
            id.dana.promoquest.adapter.HorizontalQuestAdapter r6 = r6.getQuestAdapter()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r6.length(r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x011e:
            int r6 = o.resetInternal.setMax.onReceiveContent
            android.view.View r6 = r5._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            r6.setVisibility(r1)
            id.dana.promoquest.views.MissionCardView$length r6 = new id.dana.promoquest.views.MissionCardView$length
            r6.<init>(r5)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.post(r6)
            return
        L_0x0137:
            int r6 = o.resetInternal.setMax.setImageDrawable
            android.view.View r6 = r5._$_findCachedViewById(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            r0 = 8
            r6.setVisibility(r0)
            int r6 = o.resetInternal.setMax.onReceiveContent
            android.view.View r6 = r5._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            r6.setVisibility(r0)
            id.dana.promoquest.adapter.HorizontalQuestAdapter r6 = r5.getQuestAdapter()
            java.util.List<id.dana.promoquest.model.QuestModel> r0 = r6.length
            r0.clear()
            r6.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.promoquest.views.MissionCardView.setMission(id.dana.promoquest.model.MissionModel):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class length implements Runnable {
        final /* synthetic */ MissionCardView setMin;

        length(MissionCardView missionCardView) {
            this.setMin = missionCardView;
        }

        public final void run() {
            RecyclerView.Adapter adapter;
            RecyclerView recyclerView = (RecyclerView) this.setMin._$_findCachedViewById(resetInternal.setMax.onReceiveContent);
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Nullable
    public final CharSequence getMissionTitle() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetStart);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_mission_title");
        return textView.getText();
    }

    public final void setMissionTitle(@Nullable CharSequence charSequence) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetStart);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_mission_title");
        textView.setText(charSequence);
    }

    public final boolean isQuestsVisible() {
        return this.setMin;
    }

    public final void setQuestsVisible(boolean z) {
        this.setMin = z;
    }

    @NotNull
    public final String getMissionStatus() {
        return this.getMax;
    }

    public final void setMissionStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "status");
        this.getMax = str;
        switch (str.hashCode()) {
            case 64218584:
                if (str.equals("CLOSE")) {
                    ((ImageView) _$_findCachedViewById(resetInternal.setMax.unscheduleDrawable)).setImageResource(R.drawable.ic_promo_quest_mission_expired);
                    TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.stopDrag);
                    Intrinsics.checkNotNullExpressionValue(textView, "tv_expire_time");
                    textView.setText(getResources().getString(R.string.mission_expired));
                    return;
                }
                return;
            case 183181625:
                if (!str.equals("COMPLETE")) {
                    return;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    ((ImageView) _$_findCachedViewById(resetInternal.setMax.unscheduleDrawable)).setImageResource(R.drawable.ic_promo_quest_mission_active);
                    Date date = this.toFloatRange;
                    setExpiresIn(new Date(date != null ? date.getTime() : 0));
                    return;
                }
                return;
            case 2073854099:
                if (!str.equals("FINISH")) {
                    return;
                }
                break;
            default:
                return;
        }
        ((ImageView) _$_findCachedViewById(resetInternal.setMax.unscheduleDrawable)).setImageResource(R.drawable.ic_promo_quest_mission_completed);
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.stopDrag);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_expire_time");
        textView2.setText(getResources().getString(R.string.mission_completed));
    }

    public final int getSize() {
        return this.length;
    }

    public final void setSize(int i) {
        this.length = i;
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.getPadding);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_mission_banner");
        View view = imageView;
        Float valueOf = Float.valueOf(i != 0 ? i != 2 ? 165.0f : 171.0f : 154.0f);
        Intrinsics.checkNotNullParameter(view, "$this$setSize");
        getBluetoothAdapterState.setMax(view, getBluetoothAdapterState.setMax((Float) null), getBluetoothAdapterState.setMax(valueOf));
        if (i == 0) {
            getBluetoothAdapterState.setMax(this, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.f32472131166008)), (Integer) null);
            getBluetoothAdapterState.getMin(this, Float.valueOf(4.0f), (Float) null, Float.valueOf(4.0f), (Float) null, 10);
        } else if (i != 2) {
            getBluetoothAdapterState.getMin(this, Float.valueOf(16.0f), Float.valueOf(5.0f), Float.valueOf(16.0f), Float.valueOf(5.0f));
        } else {
            getBluetoothAdapterState.getMin(this, Float.valueOf(4.0f), (Float) null, Float.valueOf(4.0f), (Float) null, 10);
        }
    }

    public final int getMissionType() {
        return this.IsOverlapping;
    }

    public final void setMissionType(int i) {
        this.IsOverlapping = i;
        getQuestAdapter().setMax = i;
        getQuestAdapter().notifyDataSetChanged();
    }

    @NotNull
    public final HorizontalQuestAdapter getQuestAdapter() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onReceiveContent);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_quest");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return (HorizontalQuestAdapter) adapter;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.promoquest.adapter.HorizontalQuestAdapter");
    }

    @Nullable
    public final Date getExpiresIn() {
        return this.toFloatRange;
    }

    public final void setExpiresIn(@Nullable Date date) {
        String str;
        this.toFloatRange = date;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.stopDrag);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_expire_time");
        if (date == null) {
            str = "";
        } else {
            int max = (int) ConfirmPopup.AnonymousClass1.setMax(date);
            if (max > 0) {
                str = getResources().getQuantityString(R.plurals.f75212131755010, max, new Object[]{Integer.valueOf(max)});
            } else {
                long convert = TimeUnit.HOURS.convert(date.getTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                int i = convert <= 0 ? -1 : (int) convert;
                if (i > 0) {
                    str = getResources().getQuantityString(R.plurals.f75222131755011, i, new Object[]{Integer.valueOf(i)});
                } else if (i >= 0) {
                    str = getResources().getString(R.string.expiring_soon);
                } else {
                    str = getResources().getString(R.string.mission_expired);
                }
            }
        }
        textView.setText(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/promoquest/views/MissionCardView$CardSize;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface CardSize {
        @NotNull
        public static final length Companion = length.getMin;
        public static final int LARGE = 2;
        public static final int MEDIUM = 1;
        public static final int SMALL = 0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/promoquest/views/MissionCardView$CardSize$Companion;", "", "()V", "LARGE", "", "MEDIUM", "SMALL", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            static final /* synthetic */ length getMin = new length();

            private length() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/promoquest/views/MissionCardView$MissionType;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface MissionType {
        @NotNull
        public static final getMin Companion = getMin.getMin;
        public static final int FLEXIBLE = 1;
        public static final int SEQUENTIAL = 0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/promoquest/views/MissionCardView$MissionType$Companion;", "", "()V", "FLEXIBLE", "", "SEQUENTIAL", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            static final /* synthetic */ getMin getMin = new getMin();

            private getMin() {
            }
        }
    }
}
