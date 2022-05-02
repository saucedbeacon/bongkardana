package id.dana.sendmoney_v2.recipient.view;

import kotlin.Metadata;
import o.setOnWheelViewListener;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$setupKeyboardListener$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RecipientView$Grayscale$Algorithm implements setOnWheelViewListener.length {
    final /* synthetic */ RecipientView setMin;

    RecipientView$Grayscale$Algorithm(RecipientView recipientView) {
        this.setMin = recipientView;
    }

    public final void length() {
        this.setMin.isInside = true;
    }

    public final void setMax() {
        this.setMin.isInside = false;
    }
}
