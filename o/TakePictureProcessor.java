package o;

import android.view.View;
import dagger.internal.InjectedFieldSignature;
import id.dana.richview.calculator.adapter.CalculatorAdapter;
import id.dana.richview.contactselector.ContactSelectorView;
import id.dana.richview.donation.DonationView;
import id.dana.richview.exploredana.ExploreDanaView;
import o.getTrimPathStart;
import o.moveToStart;
import o.parseFromBytes;

public final class TakePictureProcessor implements View.OnClickListener {
    private final CalculatorAdapter.CalculatorViewHolder getMax;

    public TakePictureProcessor(CalculatorAdapter.CalculatorViewHolder calculatorViewHolder) {
        this.getMax = calculatorViewHolder;
    }

    public final void onClick(View view) {
        this.getMax.getMax.onClearByCharacter();
    }

    /* renamed from: o.TakePictureProcessor$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<ExploreDanaView> {
        @InjectedFieldSignature("id.dana.richview.exploredana.ExploreDanaView.presenter")
        public static void setMax(ExploreDanaView exploreDanaView, getTrimPathStart.getMax getmax) {
            exploreDanaView.presenter = getmax;
        }
    }

    /* renamed from: o.TakePictureProcessor$3  reason: invalid class name */
    public final class AnonymousClass3 implements getBindingAdapter<ContactSelectorView> {
        @InjectedFieldSignature("id.dana.richview.contactselector.ContactSelectorView.danaContactPresenter")
        public static void getMin(ContactSelectorView contactSelectorView, moveToStart.setMin setmin) {
            contactSelectorView.danaContactPresenter = setmin;
        }
    }

    /* renamed from: o.TakePictureProcessor$4  reason: invalid class name */
    public final class AnonymousClass4 implements getBindingAdapter<DonationView> {
        @InjectedFieldSignature("id.dana.richview.donation.DonationView.donatinPresenter")
        public static void setMin(DonationView donationView, parseFromBytes.getMax getmax) {
            donationView.donatinPresenter = getmax;
        }
    }
}
