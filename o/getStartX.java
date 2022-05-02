package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.recipient.activity.ContactRecipientActivity;
import o.ConstraintProxy$StorageNotLowProxy;
import o.DiagnosticsReceiver;

public final class getStartX implements getBindingAdapter<ContactRecipientActivity> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.ContactRecipientActivity.referralTrackerPresenter")
    public static void getMin(ContactRecipientActivity contactRecipientActivity, ConstraintProxy$StorageNotLowProxy.setMin setmin) {
        contactRecipientActivity.referralTrackerPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.ContactRecipientActivity.calculatorPresenter")
    public static void getMin(ContactRecipientActivity contactRecipientActivity, DiagnosticsReceiver.getMin getmin) {
        contactRecipientActivity.calculatorPresenter = getmin;
    }
}
