package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.sendmoney.bank.all.BankActivity;
import id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientActivityModule.class, BillerX2BModule.class})
public interface StepType {
    void getMax(BankRecipientActivity bankRecipientActivity);

    void length(BankActivity bankActivity);
}
