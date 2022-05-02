package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.view.RecipientView;
import id.dana.sendmoney.voucher.ChangeVoucherView;
import o.BindBitmap;

public final class PhotoMenu implements AddReceiverDialogFragment.setMax {
    private final RecipientView getMin;

    public PhotoMenu(RecipientView recipientView) {
        this.getMin = recipientView;
    }

    public final void getMin(RecipientModel recipientModel) {
        this.getMin.Grayscale$Algorithm.onRecipientSelected(recipientModel);
    }

    /* renamed from: o.PhotoMenu$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<ChangeVoucherView> {
        @InjectedFieldSignature("id.dana.sendmoney.voucher.ChangeVoucherView.presenter")
        public static void getMax(ChangeVoucherView changeVoucherView, BindBitmap.getMin getmin) {
            changeVoucherView.presenter = getmin;
        }
    }
}
