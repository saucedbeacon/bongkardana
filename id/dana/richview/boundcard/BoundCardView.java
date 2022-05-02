package id.dana.richview.boundcard;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.boundcard.BoundCardModule;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.user.GetUserInfoModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.pay.PayCardInfo;
import id.dana.richview.boundcard.BoundCardAdapter;
import id.dana.richview.boundcard.BoundCardView;
import id.dana.richview.boundcard.model.BoundCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CaptureServiceImpl;
import o.PrepareException;
import o.RVResourceManager;
import o.Workflow;
import o.capture;
import o.fakeDragBy;
import o.getChildrenSkipCount;
import o.getPagePerfKey;
import o.isBaselineAligned;
import o.isPrerunAction;
import o.onNext;
import o.onScanStep;
import o.setAutoDismissEnabled$core;
import o.setCancelOnTouchOutside$core;
import o.setColorSchemeColors;
import o.setShadowDrawableRight;
import o.stopIgnoring;
import o.updateActionSheetContent;

public class BoundCardView extends BaseRichView implements setColorSchemeColors.getMin {
    private String FastBitmap$CoordinateSystem;
    private boolean Grayscale$Algorithm;
    private boolean IsOverlapping;
    /* access modifiers changed from: private */
    public boolean Mean$Arithmetic;
    @Inject
    public CaptureServiceImpl boundCardMapper;
    private String equals;
    private isPrerunAction getMax;
    private boolean getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    /* access modifiers changed from: private */
    public getPagePerfKey hashCode;
    private setShadowDrawableRight invoke;
    private LinearLayoutManager invokeSuspend;
    private List<BoundCard> isInside;
    private boolean length;
    @Inject
    public setColorSchemeColors.length presenter;
    @Inject
    public fakeDragBy.length queryPayMethodPresenter;
    @BindView(2131364572)
    RecyclerView rvStackView;
    private int setMax;
    private BoundCardAdapter setMin;
    private BoundCard toDoubleRange;
    private getMin toFloatRange;
    /* access modifiers changed from: private */
    public List<BoundCard> toIntRange;
    private int toString;
    @Inject
    public setAutoDismissEnabled$core.setMin userInfoPresenter;
    private List<PayCardInfo> values;

    public interface getMin {
        void getMin(BoundCard boundCard, View view);

        void setMin(BoundCard boundCard);
    }

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_boundcard;
    }

    public void onError(String str) {
    }

    public void showProgress() {
    }

    public BoundCardView(@NonNull Context context) {
        super(context);
    }

    public BoundCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoundCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BoundCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r11) {
        super.injectComponent(r11);
        if (this.getMax == null) {
            RVResourceManager.setMin setmin = new RVResourceManager.setMin((byte) 0);
            if (r11 != null) {
                setmin.getMin = r11;
                setmin.length = new BoundCardModule(this);
                setmin.setMin = new QueryPayMethodModule(new fakeDragBy.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void getMax() {
                    }

                    public final void length() {
                    }

                    public final void length(int i) {
                    }

                    public final void showProgress() {
                    }

                    public final void setMin(Boolean bool) {
                        BoundCardView.this.setAddNewCardEnabled(bool.booleanValue());
                    }

                    public final void length(String str, String str2, List<PayCardInfo> list, boolean z, boolean z2) {
                        BoundCardView.access$000(BoundCardView.this, list);
                    }

                    public final void setMax(String str, List<PayCardInfo> list) {
                        BoundCardView.access$000(BoundCardView.this, list);
                    }

                    public final void onError(String str) {
                        updateActionSheetContent.exception(DanaLogConstants.TAG.QRCODE_TAG, DanaLogConstants.Prefix.QRCODE_QUERY_PAY_METHOD_PREFIX, str);
                    }
                });
                setmin.setMax = new GetUserInfoModule(new setAutoDismissEnabled$core.getMax() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void length(getPagePerfKey getpageperfkey) {
                        getPagePerfKey unused = BoundCardView.this.hashCode = getpageperfkey;
                        BoundCardView.access$200(BoundCardView.this);
                    }
                });
                setmin.getMax = new GlobalNetworkModule(new Workflow() {
                    public final void setMax(boolean z, String str) {
                        BoundCardView.this.rvStackView.setVisibility(z ? 8 : 0);
                    }
                });
                stopIgnoring.setMin(setmin.length, BoundCardModule.class);
                stopIgnoring.setMin(setmin.setMin, QueryPayMethodModule.class);
                stopIgnoring.setMin(setmin.setMax, GetUserInfoModule.class);
                stopIgnoring.setMin(setmin.getMax, GlobalNetworkModule.class);
                stopIgnoring.setMin(setmin.getMin, PrepareException.AnonymousClass1.class);
                this.getMax = new RVResourceManager(setmin.length, setmin.setMin, setmin.setMax, setmin.getMax, setmin.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.getMin(this);
        registerPresenter(this.presenter, this.queryPayMethodPresenter, this.userInfoPresenter, this.globalNetworkPresenter);
    }

    public void injected(boolean z) {
        super.injected(z);
        if (z) {
            this.setMin = new BoundCardAdapter(new BoundCardAdapter.setMin(this) {
                private final BoundCardView getMax;

                {
                    this.getMax = r1;
                }

                public final void length(View view, int i) {
                    BoundCardView.setMin(this.getMax, view, i);
                }
            });
            getBoundCards();
        }
    }

    public void setup() {
        this.invokeSuspend = new LinearLayoutManager(getContext());
        this.globalNetworkPresenter.setMin();
        initAnimationListener();
    }

    public void getBoundCards() {
        this.presenter.setMin();
        this.presenter.getMax();
        this.queryPayMethodPresenter.setMin();
        this.queryPayMethodPresenter.length();
        this.userInfoPresenter.getMax();
    }

    public void onGetBoundCardsSuccess(List<BoundCard> list) {
        Boolean bool;
        if (!this.Mean$Arithmetic) {
            if (this.isInside != null) {
                Iterator<BoundCard> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BoundCard next = it.next();
                    if (next.getMax != null) {
                        Iterator<BoundCard> it2 = this.isInside.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            BoundCard next2 = it2.next();
                            if (!TextUtils.isEmpty(next2.getMax) && next2.getMax.equals(next.getMax)) {
                                bool = Boolean.TRUE;
                                break;
                            }
                        }
                        if (!bool.booleanValue()) {
                            this.presenter.getMax(next.getMax);
                            break;
                        }
                    }
                }
            }
            if (isViewBinded()) {
                if (!list.isEmpty()) {
                    if (this.getMin) {
                        BoundCard boundCard = new BoundCard();
                        boundCard.setMin = "ADD_CARD";
                        boundCard.Mean$Arithmetic = this.IsOverlapping;
                        boundCard.FastBitmap$CoordinateSystem = "DEBIT_CARD";
                        list.add(boundCard);
                    }
                    this.isInside = list;
                    int i = 0;
                    list.get(0).invokeSuspend = this.FastBitmap$CoordinateSystem;
                    if (!this.isInside.isEmpty()) {
                        BoundCard boundCard2 = this.isInside.get(0);
                        this.equals = boundCard2.toString == null ? "" : boundCard2.toString;
                    }
                    this.setMin.getMin(this.isInside);
                    this.presenter.getMin();
                    setShadowDrawableRight setshadowdrawableright = this.invoke;
                    if (setshadowdrawableright == null) {
                        initOverLapDecoration((int) getResources().getDimension(R.dimen.f28802131165579));
                    } else {
                        this.rvStackView.removeItemDecoration(setshadowdrawableright);
                    }
                    this.rvStackView.addItemDecoration(this.invoke);
                    this.rvStackView.setLayoutManager(this.invokeSuspend);
                    this.rvStackView.setAdapter(this.setMin);
                    getMin getmin = this.toFloatRange;
                    if (getmin != null) {
                        if (this.toDoubleRange != null) {
                            while (true) {
                                if (i >= this.isInside.size()) {
                                    i = this.isInside.size() - 1;
                                    break;
                                }
                                BoundCard boundCard3 = this.isInside.get(i);
                                if ((this.toDoubleRange.setMin() && boundCard3.setMin()) || getMax(boundCard3)) {
                                    break;
                                }
                                i++;
                            }
                            this.toString = i;
                        } else if (setMax() && this.isInside.get(0).setMin()) {
                            this.toString = 1;
                        }
                        getmin.setMin(this.isInside.get(this.toString));
                        length(this.toString);
                    }
                }
                this.toIntRange = null;
                return;
            }
            return;
        }
        this.toIntRange = list;
    }

    public void onErrorGetCard(String str) {
        new isBaselineAligned(getContext(), isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelOnTouchOutside(false).message((Integer) null, str, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.retry), (CharSequence) null, new onScanStep(this)).show();
    }

    public void onGetDefaultCardSuccess(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= this.isInside.size()) {
                    break;
                }
                z = setMin(i, str);
                if (z) {
                    this.setMax = i;
                    setSelectedCardPosition(i);
                    break;
                }
                i++;
            }
            if (!z) {
                setSelectedCardPosition(0);
                return;
            }
            return;
        }
        setSelectedCardPosition(0);
    }

    public void onGetPhoneNumberSuccess(String str) {
        this.FastBitmap$CoordinateSystem = str;
    }

    public void onCheckEnableExpressPayFeature(Boolean bool) {
        this.IsOverlapping = bool.booleanValue();
    }

    public void initOverLapDecoration(int i) {
        double d = (double) i;
        Double.isNaN(d);
        this.invoke = new setShadowDrawableRight(((int) (d * 0.35d)) - i);
    }

    private boolean getMax(BoundCard boundCard) {
        return !TextUtils.isEmpty(this.toDoubleRange.getMax) && this.toDoubleRange.getMax.equals(boundCard.getMax);
    }

    private void length(int i) {
        BoundCard boundCard = this.isInside.get(i);
        BoundCard boundCard2 = this.toDoubleRange;
        if (boundCard2 == null || !this.length) {
            this.isInside.remove(i);
        } else {
            this.isInside.set(i, boundCard2);
            this.length = false;
        }
        this.toDoubleRange = boundCard;
        this.setMin.notifyDataSetChanged();
        if (length()) {
            this.rvStackView.smoothScrollToPosition(this.isInside.size() - 1);
            this.Grayscale$Algorithm = false;
        }
    }

    private boolean setMax() {
        return this.equals.equals("KYC0") || this.equals.equals("KYC1");
    }

    public void gotoAddNewCard() {
        if (this.getMin) {
            DanaH5.startContainerFullUrl("https://m.dana.id/m/portal/bankcardadd?isClosable=true", new setCancelOnTouchOutside$core() {
                public final void onContainerCreated(Bundle bundle) {
                }

                public final void onContainerDestroyed(Bundle bundle) {
                    BoundCardView.this.getBoundCards();
                }
            });
        }
    }

    public void gotoKYCPage() {
        DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=sendMoney");
    }

    public void setSelectedCardPosition(int i) {
        this.toString = i;
    }

    private boolean setMin(int i, String str) {
        if (this.isInside.isEmpty()) {
            return false;
        }
        String str2 = this.isInside.get(i).getMax;
        if (!TextUtils.isEmpty(str2)) {
            return str2.equals(str);
        }
        return false;
    }

    public void setAddNewCardEnabled(boolean z) {
        this.getMin = z;
    }

    public void initListener(getMin getmin) {
        this.toFloatRange = getmin;
    }

    public BoundCard getCurrentCard() {
        if (!TextUtils.isEmpty(this.isInside.get(this.toString).setMin) || !setMax()) {
            return this.isInside.get(this.toString);
        }
        new isBaselineAligned(getContext(), isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelOnTouchOutside(false).message(Integer.valueOf(R.string.payment_method_need_premium_message), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.upgrade), (CharSequence) null, new capture(this)).negativeButton((Integer) null, (CharSequence) null, new Function1(this) {
            private final BoundCardView getMax;

            {
                this.getMax = r1;
            }

            public final Object invoke(Object obj) {
                return this.getMax.setSelectedCardPosition(this.getMax.setMax);
            }
        }).show();
        return null;
    }

    public void initAnimationListener() {
        this.rvStackView.setLayoutAnimationListener(new Animation.AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                boolean unused = BoundCardView.this.Mean$Arithmetic = false;
                if (BoundCardView.this.toIntRange != null) {
                    BoundCardView boundCardView = BoundCardView.this;
                    boundCardView.onGetBoundCardsSuccess(boundCardView.toIntRange);
                }
            }
        });
    }

    public void startExpandingAnimation() {
        this.Mean$Arithmetic = true;
        this.rvStackView.startLayoutAnimation();
    }

    public void onCardSwapped() {
        length(this.toString);
    }

    public void startCloseAnimation() {
        this.rvStackView.startLayoutAnimation();
    }

    public void setCloseAnimation() {
        this.rvStackView.clearAnimation();
        this.rvStackView.getLayoutAnimation().getAnimation().cancel();
        this.rvStackView.setLayoutAnimation((LayoutAnimationController) null);
        this.rvStackView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.f302130771997));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.isInside;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean length() {
        /*
            r1 = this;
            boolean r0 = r1.Grayscale$Algorithm
            if (r0 == 0) goto L_0x0010
            java.util.List<id.dana.richview.boundcard.model.BoundCard> r0 = r1.isInside
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.boundcard.BoundCardView.length():boolean");
    }

    public void setEntryPoint(String str) {
        this.setMin.getMax = str;
    }

    static /* synthetic */ void access$000(BoundCardView boundCardView, List list) {
        boundCardView.values = list;
        if (list == null) {
            boundCardView.values = new ArrayList();
        }
        List<PayCardInfo> list2 = boundCardView.values;
        if (list2 != null) {
            boundCardView.onGetBoundCardsSuccess(CaptureServiceImpl.setMax(list2, boundCardView.hashCode));
        }
    }

    static /* synthetic */ void access$200(BoundCardView boundCardView) {
        List<PayCardInfo> list = boundCardView.values;
        if (list != null) {
            boundCardView.onGetBoundCardsSuccess(CaptureServiceImpl.setMax(list, boundCardView.hashCode));
        }
    }

    public static /* synthetic */ Unit setMax(BoundCardView boundCardView, isBaselineAligned isbaselinealigned) {
        boundCardView.setSelectedCardPosition(boundCardView.setMax);
        boundCardView.gotoKYCPage();
        isbaselinealigned.dismiss();
        return null;
    }

    public static /* synthetic */ void setMin(BoundCardView boundCardView, View view, int i) {
        int itemViewType = boundCardView.setMin.getItemViewType(i);
        if (itemViewType == 1 || itemViewType == 2) {
            getMin getmin = boundCardView.toFloatRange;
            if (getmin != null) {
                boundCardView.toString = i;
                boundCardView.length = true;
                getmin.getMin(boundCardView.isInside.get(i), view);
                return;
            }
            return;
        }
        boundCardView.Grayscale$Algorithm = true;
        boundCardView.gotoAddNewCard();
    }
}
