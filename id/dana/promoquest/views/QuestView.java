package id.dana.promoquest.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.promoquest.model.QuestActionType;
import id.dana.promoquest.model.QuestModel;
import id.dana.richview.LogoProgressView;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.IntRange;
import o.TitleBarRightButtonView;
import o.UrlMapExtension;
import o.encodeImageBytesToString;
import o.getSecureSignatureComp;
import o.getSessionData;
import o.hideProgress;
import o.loadLocalImageInternal;
import o.observedEntities;
import o.pathIsInAppScope;

public class QuestView extends BaseRichView {
    @BindView(2131362117)
    Button btnQuestAction;
    private pathIsInAppScope getMax;
    private UrlMapExtension.getMax getMin;
    private encodeImageBytesToString.getMin isInside;
    @BindView(2131363598)
    ImageView ivQuestIconState;
    private loadLocalImageInternal length;
    @BindView(2131363970)
    LogoProgressView lpvLoading;
    @BindView(2131365476)
    TextView questDescription;
    @BindView(2131365477)
    TextView questTitle;
    private int setMax;
    /* access modifiers changed from: private */
    public QuestModel setMin;
    @BindView(2131365785)
    ConstraintLayout vgQuestViewRoot;
    @BindView(2131365784)
    LinearLayout viewAction;
    @BindView(2131365930)
    View viewQuestSeparator;
    @BindView(2131365983)
    View viewTrackLine;

    public int getLayout() {
        return R.layout.view_quest_mission_detail;
    }

    @Inject
    public QuestView(@NonNull Context context) {
        super(context);
    }

    public QuestView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuestView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setup() {
        this.btnQuestAction.setOnClickListener(new observedEntities(getBaseActivity()) {
            public final void getMin(View view) {
                if (QuestView.this.setMin != null) {
                    QuestView.access$100(QuestView.this);
                }
            }
        });
    }

    public void showProgress() {
        this.viewAction.setEnabled(false);
        this.btnQuestAction.setVisibility(8);
        this.lpvLoading.startRefresh();
        this.lpvLoading.setVisibility(0);
    }

    public void dismissProgress() {
        this.lpvLoading.setVisibility(8);
        this.lpvLoading.stopRefresh();
        this.viewAction.setEnabled(true);
    }

    public void setQuest(QuestModel questModel, int i, UrlMapExtension.getMax getmax) {
        if (questModel != null) {
            if (!isViewBinded()) {
                onAttachedToWindow();
            }
            this.setMin = questModel;
            this.getMin = getmax;
            this.setMax = i;
            if (questModel != null) {
                this.questTitle.setText(questModel.length);
                this.questDescription.setText(questModel.setMax);
                if (questModel.getMax != null) {
                    this.ivQuestIconState.setImageResource(this.setMin.getMax());
                    String str = questModel.getMax;
                    char c = 65535;
                    switch (str.hashCode()) {
                        case 2252048:
                            if (str.equals("INIT")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 64218584:
                            if (str.equals("CLOSE")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 183181625:
                            if (str.equals("COMPLETE")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1925346054:
                            if (str.equals("ACTIVE")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 2073854099:
                            if (str.equals("FINISH")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0 || c == 1 || c == 2) {
                        this.btnQuestAction.setVisibility(8);
                    } else if (c == 3) {
                        final Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f722130772044);
                        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                loadAnimation.setAnimationListener(this);
                                QuestView.this.addDisposable(TitleBarRightButtonView.AnonymousClass1.timer(2, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new getSessionData(this, animation)));
                            }
                        });
                        this.ivQuestIconState.startAnimation(loadAnimation);
                        this.btnQuestAction.setVisibility(0);
                        this.btnQuestAction.setText(getContext().getString(R.string.redeem));
                        this.btnQuestAction.setVisibility(0);
                    } else if (c == 4) {
                        this.btnQuestAction.setVisibility(0);
                        this.btnQuestAction.setText(QuestActionType.GO);
                        this.btnQuestAction.setVisibility(0);
                    }
                }
            }
        }
    }

    public void setActionFactory(loadLocalImageInternal loadlocalimageinternal) {
        this.length = loadlocalimageinternal;
    }

    public void setRedeemQuestListener(encodeImageBytesToString.getMin getmin) {
        this.isInside = getmin;
    }

    public void setCardBehavior(boolean z, int i, int i2, boolean z2) {
        Drawable length2 = IntRange.length(getContext(), z ? R.drawable.view_active_quest_divider_sequential_background : R.drawable.view_item_quest_horizontal_divider_sequential_background);
        if (!z2) {
            int i3 = 0;
            this.viewTrackLine.setVisibility(i >= i2 ? 4 : 0);
            this.viewTrackLine.setBackground(length2);
            View view = this.viewQuestSeparator;
            if (i >= i2) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void access$100(id.dana.promoquest.views.QuestView r7) {
        /*
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.getMax
            if (r0 == 0) goto L_0x0124
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.getMax
            java.lang.String r0 = r0.toUpperCase()
            int r1 = r0.hashCode()
            r2 = 183181625(0xaeb2139, float:2.2642174E-32)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002a
            r2 = 1925346054(0x72c27306, float:7.702931E30)
            if (r1 == r2) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            java.lang.String r1 = "ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "COMPLETE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x005a
            if (r0 == r5) goto L_0x003b
            goto L_0x0124
        L_0x003b:
            o.UrlMapExtension$getMax r0 = r7.getMin
            if (r0 == 0) goto L_0x0124
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.getMin
            if (r0 == 0) goto L_0x0124
            r7.showProgress()
            o.UrlMapExtension$getMax r0 = r7.getMin
            id.dana.promoquest.model.QuestModel r1 = r7.setMin
            java.lang.String r1 = r1.getMin
            int r2 = r7.setMax
            id.dana.promoquest.views.QuestView$1 r3 = new id.dana.promoquest.views.QuestView$1
            r3.<init>()
            r0.length(r1, r2, r3)
            goto L_0x0124
        L_0x005a:
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.setMin
            if (r0 == 0) goto L_0x0124
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.setMin
            java.lang.String r0 = r0.toUpperCase()
            int r1 = r0.hashCode()
            r2 = -1138821620(0xffffffffbc1ef60c, float:-0.009702217)
            r6 = 2
            if (r1 == r2) goto L_0x0090
            r2 = 2280(0x8e8, float:3.195E-42)
            if (r1 == r2) goto L_0x0086
            r2 = 80083243(0x4c5f92b, float:4.6543302E-36)
            if (r1 == r2) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            java.lang.String r1 = "TRACK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r3 = 1
            goto L_0x0099
        L_0x0086:
            java.lang.String r1 = "GO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r3 = 0
            goto L_0x0099
        L_0x0090:
            java.lang.String r1 = "GO_AND_TRACK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r3 = 2
        L_0x0099:
            if (r3 == 0) goto L_0x00bf
            if (r3 == r5) goto L_0x00a1
            if (r3 == r6) goto L_0x00a1
            goto L_0x0124
        L_0x00a1:
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.getMin
            if (r0 == 0) goto L_0x0124
            r7.showProgress()
            o.UrlMapExtension$getMax r0 = r7.getMin
            id.dana.promoquest.model.QuestModel r1 = r7.setMin
            java.lang.String r1 = r1.getMin
            id.dana.promoquest.model.QuestModel r2 = r7.setMin
            boolean r2 = r2.setMin()
            id.dana.promoquest.views.QuestView$3 r3 = new id.dana.promoquest.views.QuestView$3
            r3.<init>()
            r0.setMin(r1, r2, r3)
            goto L_0x0124
        L_0x00bf:
            o.convertDipToPx$length r0 = new o.convertDipToPx$length
            id.dana.base.BaseActivity r1 = r7.getBaseActivity()
            android.content.Context r1 = r1.getApplicationContext()
            r0.<init>(r1)
            java.lang.String r1 = "Promo Quest Task Execute"
            r0.getMax = r1
            id.dana.promoquest.model.QuestModel r1 = r7.setMin
            java.lang.String r1 = r1.length
            java.lang.String r2 = "Quest Description"
            o.convertDipToPx$length r0 = r0.setMax(r2, r1)
            r0.setMin()
            o.convertDipToPx r1 = new o.convertDipToPx
            r1.<init>(r0, r4)
            o.convertDipToPx$length r0 = r1.length
            if (r0 == 0) goto L_0x00ed
            o.convertDipToPx$length r0 = r1.length
            java.util.List r0 = r0.length
            goto L_0x00f2
        L_0x00ed:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00f2:
            int r1 = r0.size()
            o.convertSpToPx[] r1 = new o.convertSpToPx[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            o.convertSpToPx[] r0 = (o.convertSpToPx[]) r0
            o.genTextSelector.setMax(r0)
            id.dana.promoquest.model.QuestModel r0 = r7.setMin
            java.lang.String r0 = r0.IsOverlapping
            id.dana.promoquest.model.QuestModel r1 = r7.setMin
            java.lang.String r2 = "promoQuest"
            java.lang.String r3 = "entryPoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r1 = r1.toIntRange
            java.lang.String r1 = o.isShowMenu.length(r1, r2)
            java.lang.String r2 = "UrlUtil.getCleanUrl(redi…alue,\n        entryPoint)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.loadLocalImageInternal r2 = r7.length
            o.pathIsInAppScope r0 = r2.getMin(r0, r1)
            r7.getMax = r0
            r0.getMin()
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.promoquest.views.QuestView.access$100(id.dana.promoquest.views.QuestView):void");
    }

    static /* synthetic */ void access$200(QuestView questView) {
        questView.dismissProgress();
        questView.enableClick();
    }

    static /* synthetic */ void access$400(QuestView questView) {
        if (questView.isInside != null && questView.setMin.getMin != null) {
            questView.isInside.getMax(questView.setMin.getMin);
        }
    }

    static /* synthetic */ void access$500(QuestView questView, String str) {
        questView.btnQuestAction.setText(str);
        questView.btnQuestAction.setVisibility(0);
    }

    public static /* synthetic */ void access$600(QuestView questView, Animation animation) {
        ImageView imageView = questView.ivQuestIconState;
        if (imageView != null) {
            imageView.startAnimation(animation);
        }
    }
}
