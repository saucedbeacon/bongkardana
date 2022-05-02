package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.PayMethodModule;
import id.dana.sendmoney.paymethod.ChangePayMethodView;
import id.dana.sendmoney_v2.paymethod.PayMethodView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PayMethodModule.class})
public interface getClientCount {
    void setMin(ChangePayMethodView changePayMethodView);

    void setMin(PayMethodView payMethodView);
}
