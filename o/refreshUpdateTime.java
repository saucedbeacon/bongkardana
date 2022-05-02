package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.ChangeVoucherModule;
import id.dana.sendmoney.voucher.ChangeVoucherView;
import id.dana.sendmoney.voucher.SummaryVoucherView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ChangeVoucherModule.class})
public interface refreshUpdateTime {
    void getMax(ChangeVoucherView changeVoucherView);

    void setMin(SummaryVoucherView summaryVoucherView);
}
