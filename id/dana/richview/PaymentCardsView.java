package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.richview.PaymentCardsView;
import id.dana.richview.boundcard.BoundCardView;
import id.dana.richview.boundcard.DanaBalanceCardView;
import id.dana.richview.boundcard.DebitCardView;
import id.dana.richview.boundcard.model.BoundCard;
import o.TwoWheelOptionPickerDialog;
import o.from;
import o.getFixedHeightMajor;
import o.isHideOnContentScrollEnabled;
import o.onCameraFacingChanged;
import o.onVideoModeReached;
import o.setTopLineColor;

public class PaymentCardsView extends BaseRichView {
    @BindView(2131361938)
    BoundCardView bcvPaymentMethod;
    @BindView(2131362395)
    ConstraintLayout clChoosenCardSwapper;
    @BindView(2131362442)
    ConstraintLayout clHighlightedCardSwapper;
    @BindView(2131362453)
    ConstraintLayout clMainParent;
    @BindView(2131362679)
    DanaBalanceCardView dbvCard;
    @BindView(2131362680)
    DanaBalanceCardView dbvChoosenCardSwapper;
    @BindView(2131362681)
    DanaBalanceCardView dbvHighlightedCardSwapper;
    @BindView(2131362686)
    DebitCardView dcvChoosenCardSwapper;
    @BindView(2131362687)
    DebitCardView dcvDebit;
    @BindView(2131362688)
    DebitCardView dcvHighlightedCardSwapper;
    private boolean getMax;
    /* access modifiers changed from: private */
    public BoundCard getMin;
    private View length;
    @BindView(2131363933)
    LinearLayout llSingleCard;
    /* access modifiers changed from: private */
    public int setMax;
    private int setMin;
    @BindView(2131365865)
    View viewDummy;

    public int getLayout() {
        return R.layout.view_payment_cards;
    }

    public PaymentCardsView(@NonNull Context context) {
        super(context);
    }

    public PaymentCardsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PaymentCardsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PaymentCardsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        AnonymousClass4 r0 = new setTopLineColor.getMin() {
            public final void onTransitionEnd(Transition transition) {
                PaymentCardsView.access$000(PaymentCardsView.this);
            }
        };
        setTopLineColor.getMax = new from();
        ChangeBounds changeBounds = new ChangeBounds();
        setTopLineColor.length = changeBounds;
        changeBounds.addListener(r0);
        setTopLineColor.length.setInterpolator(new AnticipateOvershootInterpolator(0.0f));
        setTopLineColor.length.setDuration(200);
        this.llSingleCard.setLayoutAnimationListener(new TwoWheelOptionPickerDialog.OnOptionPickListener.setMax() {
            public final void onAnimationEnd(Animation animation) {
                PaymentCardsView.access$000(PaymentCardsView.this);
            }
        });
        this.dbvCard.initListener(new DanaBalanceCardView.getMax(this) {
            private final PaymentCardsView setMin;

            {
                this.setMin = r1;
            }

            public final void getMax() {
                PaymentCardsView.setMax(this.setMin);
            }
        });
        this.bcvPaymentMethod.initListener(new BoundCardView.getMin() {
            public final void setMin(BoundCard boundCard) {
                PaymentCardsView.this.setMin(boundCard);
            }

            public final void getMin(BoundCard boundCard, View view) {
                BoundCard unused = PaymentCardsView.this.getMin = boundCard;
                PaymentCardsView paymentCardsView = PaymentCardsView.this;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                PaymentCardsView.access$400(paymentCardsView, view, iArr[1] - PaymentCardsView.this.setMax);
            }
        });
    }

    /* access modifiers changed from: private */
    public void setMin(BoundCard boundCard) {
        if (boundCard == null || !boundCard.setMin()) {
            this.dbvCard.setVisibility(8);
            this.dcvDebit.setVisibility(0);
            this.dcvDebit.setData(boundCard);
        } else {
            this.dcvDebit.setVisibility(8);
            this.dbvCard.setVisibility(0);
            this.dbvCard.setData(boundCard);
        }
        if (this.setMin == 0) {
            this.llSingleCard.post(new onVideoModeReached(this));
            this.llSingleCard.setVisibility(0);
        }
    }

    public void closeClicked() {
        this.bcvPaymentMethod.setCloseAnimation();
        if (!this.getMax) {
            this.getMax = true;
            this.setMin = 2;
            this.llSingleCard.post(new Runnable(this) {
                private final PaymentCardsView setMin;

                {
                    this.setMin = r1;
                }

                public final void run() {
                    PaymentCardsView.getMax(this.setMin);
                }
            });
        }
    }

    public void setParentPosY(int i) {
        this.setMax = i;
    }

    private void setMin(boolean z) {
        int i = 4;
        this.dcvHighlightedCardSwapper.setVisibility(z ? 4 : 0);
        DanaBalanceCardView danaBalanceCardView = this.dbvHighlightedCardSwapper;
        if (z) {
            i = 0;
        }
        danaBalanceCardView.setVisibility(i);
    }

    private void getMin(boolean z) {
        int i = 4;
        this.dcvChoosenCardSwapper.setVisibility(z ? 4 : 0);
        DanaBalanceCardView danaBalanceCardView = this.dbvChoosenCardSwapper;
        if (z) {
            i = 0;
        }
        danaBalanceCardView.setVisibility(i);
    }

    public void setEntryPoint(String str) {
        this.dbvCard.setEntryPoint(str);
        this.dbvChoosenCardSwapper.setEntryPoint(str);
        this.dbvHighlightedCardSwapper.setEntryPoint(str);
        this.bcvPaymentMethod.setEntryPoint(str);
    }

    static /* synthetic */ void access$000(PaymentCardsView paymentCardsView) {
        int i = paymentCardsView.setMin;
        if (i == 0) {
            paymentCardsView.getMax = false;
            paymentCardsView.setMin = 1;
        } else if (i != 1) {
            BoundCardView boundCardView = paymentCardsView.bcvPaymentMethod;
            if (boundCardView != null) {
                boundCardView.setVisibility(4);
            }
            LinearLayout linearLayout = paymentCardsView.llSingleCard;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            BaseActivity baseActivity = paymentCardsView.getBaseActivity();
            if (baseActivity != null) {
                baseActivity.finish();
            }
        } else {
            View view = paymentCardsView.length;
            if (view != null) {
                view.setVisibility(0);
                paymentCardsView.llSingleCard.setVisibility(0);
                paymentCardsView.length = null;
            }
            paymentCardsView.clHighlightedCardSwapper.setVisibility(4);
            paymentCardsView.clChoosenCardSwapper.setVisibility(4);
            ConstraintLayout constraintLayout = paymentCardsView.clHighlightedCardSwapper;
            ConstraintLayout constraintLayout2 = paymentCardsView.clMainParent;
            if (constraintLayout2 != null) {
                setTopLineColor.getMax.setMax(constraintLayout2);
            }
            setTopLineColor.getMax.length(constraintLayout.getId(), 3, 0, 3, 0);
            setTopLineColor.getMax.setMin(constraintLayout2);
            ConstraintLayout constraintLayout3 = paymentCardsView.clChoosenCardSwapper;
            ConstraintLayout constraintLayout4 = paymentCardsView.clMainParent;
            if (constraintLayout4 != null) {
                setTopLineColor.getMax.setMax(constraintLayout4);
            }
            setTopLineColor.getMax.length(constraintLayout3.getId(), 3, 0, 3, 0);
            setTopLineColor.getMax.setMin(constraintLayout4);
            paymentCardsView.getMax = false;
            paymentCardsView.setMin(paymentCardsView.getMin);
            paymentCardsView.bcvPaymentMethod.onCardSwapped();
        }
    }

    static /* synthetic */ void access$400(PaymentCardsView paymentCardsView, View view, int i) {
        if (!paymentCardsView.getMax) {
            paymentCardsView.length = view;
            view.setVisibility(4);
            ConstraintLayout constraintLayout = paymentCardsView.clChoosenCardSwapper;
            ConstraintLayout constraintLayout2 = paymentCardsView.clMainParent;
            if (constraintLayout2 != null) {
                setTopLineColor.getMax.setMax(constraintLayout2);
            }
            setTopLineColor.getMax.length(constraintLayout.getId(), 3, 0, 3, i);
            setTopLineColor.getMax.setMin(constraintLayout2);
            if (paymentCardsView.dbvCard.getVisibility() == 0) {
                paymentCardsView.dbvHighlightedCardSwapper.setData(paymentCardsView.dbvCard.getData());
                paymentCardsView.setMin(true);
            } else if (paymentCardsView.dcvDebit.getVisibility() == 0) {
                paymentCardsView.dcvHighlightedCardSwapper.setData(paymentCardsView.dcvDebit.getData());
                paymentCardsView.setMin(false);
            }
            BoundCard boundCard = paymentCardsView.getMin;
            if (boundCard == null || !boundCard.setMin()) {
                paymentCardsView.dcvChoosenCardSwapper.setData(paymentCardsView.getMin);
                paymentCardsView.dbvChoosenCardSwapper.setVisibility(4);
                paymentCardsView.dcvChoosenCardSwapper.setVisibility(0);
                paymentCardsView.getMin(false);
            } else {
                paymentCardsView.dbvChoosenCardSwapper.setData(paymentCardsView.getMin);
                paymentCardsView.getMin(true);
            }
            paymentCardsView.clHighlightedCardSwapper.setVisibility(0);
            paymentCardsView.getMax = true;
            view.setVisibility(4);
            paymentCardsView.llSingleCard.setVisibility(4);
            paymentCardsView.clChoosenCardSwapper.post(new Runnable(paymentCardsView, i) {
                private final PaymentCardsView getMax;
                private final int getMin;

                {
                    this.getMax = r1;
                    this.getMin = r2;
                }

                public final void run() {
                    PaymentCardsView.length(this.getMax, this.getMin);
                }
            });
            paymentCardsView.clHighlightedCardSwapper.setVisibility(0);
            paymentCardsView.clChoosenCardSwapper.setVisibility(0);
            paymentCardsView.clChoosenCardSwapper.setAlpha(0.0f);
        }
    }

    public static /* synthetic */ void getMax(PaymentCardsView paymentCardsView) {
        paymentCardsView.bcvPaymentMethod.startCloseAnimation();
        LinearLayout linearLayout = paymentCardsView.llSingleCard;
        ConstraintLayout constraintLayout = paymentCardsView.clMainParent;
        setTopLineColor.getMax.setMax(linearLayout.getId(), 3);
        setTopLineColor.getMax.setMin(constraintLayout);
        LinearLayout linearLayout2 = paymentCardsView.llSingleCard;
        ConstraintLayout constraintLayout2 = paymentCardsView.clMainParent;
        if (constraintLayout2 != null) {
            setTopLineColor.getMax.setMax(constraintLayout2);
        }
        setTopLineColor.getMax.setMax(linearLayout2.getId(), 4);
        setTopLineColor.getMax.setMin(constraintLayout2);
        LinearLayout linearLayout3 = paymentCardsView.llSingleCard;
        ConstraintLayout constraintLayout3 = paymentCardsView.clMainParent;
        if (constraintLayout3 != null) {
            setTopLineColor.getMax.setMax(constraintLayout3);
        }
        setTopLineColor.getMax.length(linearLayout3.getId(), 4, 3);
        isHideOnContentScrollEnabled.getMin(constraintLayout3, setTopLineColor.length);
        setTopLineColor.getMax.setMin(constraintLayout3);
    }

    public static /* synthetic */ void setMax(PaymentCardsView paymentCardsView) {
        BoundCardView boundCardView = paymentCardsView.bcvPaymentMethod;
        if (boundCardView != null) {
            boundCardView.getBoundCards();
        }
    }

    public static /* synthetic */ void length(PaymentCardsView paymentCardsView, int i) {
        ((getFixedHeightMajor) ((getFixedHeightMajor) getFixedHeightMajor.setMax(paymentCardsView.clChoosenCardSwapper).getMax(0)).setMin(300)).getMax();
        ((getFixedHeightMajor) ((getFixedHeightMajor) getFixedHeightMajor.setMax(paymentCardsView.clHighlightedCardSwapper).getMax(8)).setMin(300)).getMax();
        ConstraintLayout constraintLayout = paymentCardsView.clChoosenCardSwapper;
        ConstraintLayout constraintLayout2 = paymentCardsView.clMainParent;
        if (constraintLayout2 != null) {
            setTopLineColor.getMax.setMax(constraintLayout2);
        }
        setTopLineColor.getMax.length(constraintLayout.getId(), 3, 0, 3, 0);
        isHideOnContentScrollEnabled.getMin(constraintLayout2, setTopLineColor.length);
        setTopLineColor.getMax.setMin(constraintLayout2);
        ConstraintLayout constraintLayout3 = paymentCardsView.clHighlightedCardSwapper;
        ConstraintLayout constraintLayout4 = paymentCardsView.clMainParent;
        if (constraintLayout4 != null) {
            setTopLineColor.getMax.setMax(constraintLayout4);
        }
        setTopLineColor.getMax.length(constraintLayout3.getId(), 3, 0, 3, i);
        isHideOnContentScrollEnabled.getMin(constraintLayout4, setTopLineColor.length);
        setTopLineColor.getMax.setMin(constraintLayout4);
    }

    public static /* synthetic */ void length(PaymentCardsView paymentCardsView) {
        LinearLayout linearLayout;
        if (paymentCardsView.getVisibility() == 0 && (linearLayout = paymentCardsView.llSingleCard) != null) {
            paymentCardsView.getMax = true;
            linearLayout.startLayoutAnimation();
            paymentCardsView.bcvPaymentMethod.post(new onCameraFacingChanged(paymentCardsView));
            paymentCardsView.bcvPaymentMethod.setVisibility(0);
        }
    }
}
