package id.dana.sendmoney.voucher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.sendmoney.model.VoucherModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.AnimationUtil;
import o.DownloadStep;
import o.Ignore;
import o.PrepareException;
import o.PropertyNamingStrategy;
import o.dispatchOnCancelled;
import o.getShortName;
import o.onCancelLoad;
import o.onCanceled;
import o.setFillAfter;
import o.stopIgnoring;

public class VoucherDetailActivity extends BaseActivity {
    @Inject
    public getShortName dynamicUrlWrapper;
    @BindView(2131364579)
    RecyclerView rvVoucher;
    private PropertyNamingStrategy.AnonymousClass1 setMax;
    @BindView(2131365100)
    TextView tvAllVoucher;
    @BindView(2131365680)
    TextView tvWordingVoucherList;

    public int getLayout() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            return R.layout.activity_voucher_detail;
        }
        onCanceled oncanceled = new onCanceled(length, min, 32);
        onCancelLoad.setMax(-1757845352, oncanceled);
        onCancelLoad.getMin(-1757845352, oncanceled);
        return R.layout.activity_voucher_detail;
    }

    public static Intent createTransferIntent(BaseActivity baseActivity, List<VoucherModel> list, int i) {
        Intent intent = new Intent(baseActivity, VoucherDetailActivity.class);
        intent.putParcelableArrayListExtra("vouchers", new ArrayList(list));
        intent.putExtra("bundle_selected_voucher_coupon_index", i);
        return intent;
    }

    public void configToolbar() {
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 788926280 == (max = dispatchOnCancelled.getMax(applicationContext, 788926280)))) {
            onCanceled oncanceled = new onCanceled(788926280, max, 512);
            onCancelLoad.setMax(788926280, oncanceled);
            onCancelLoad.getMin(788926280, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(788926280, oncanceled2);
            onCancelLoad.getMin(788926280, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(788926280, oncanceled3);
            onCancelLoad.getMin(788926280, oncanceled3);
        }
        setCenterTitle(getString(R.string.voucher_title));
    }

    public void init() {
        int length;
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        Context context = null;
        if (this.setMax == null) {
            DownloadStep.AnonymousClass3.getMax getmax = new DownloadStep.AnonymousClass3.getMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmax.length = applicationComponent;
                stopIgnoring.setMin(getmax.length, PrepareException.AnonymousClass1.class);
                this.setMax = new DownloadStep.AnonymousClass3(getmax.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMax.setMin(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("vouchers");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                context = baseContext.getApplicationContext();
            }
            if (!(context == null || (length = dispatchOnCancelled.length(context, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, length, 4);
                onCancelLoad.setMax(1302138045, oncanceled);
                onCancelLoad.getMin(1302138045, oncanceled);
            }
            this.tvWordingVoucherList.setText(String.format(getString(R.string.voucher_available), new Object[]{String.valueOf(parcelableArrayListExtra.size())}));
            initRecyclerView(parcelableArrayListExtra);
        }
    }

    public void initRecyclerView(List<VoucherModel> list) {
        int min;
        int length;
        int min2;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1521327570, oncanceled);
            onCancelLoad.getMin(-1521327570, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min2, 32);
            onCancelLoad.setMax(-1521327570, oncanceled2);
            onCancelLoad.getMin(-1521327570, oncanceled2);
        }
        setFillAfter setfillafter = new setFillAfter(this.dynamicUrlWrapper);
        this.rvVoucher.setLayoutManager(new LinearLayoutManager(this));
        this.rvVoucher.setNestedScrollingEnabled(false);
        this.rvVoucher.setAdapter(setfillafter);
        int intExtra = getIntent().getIntExtra("bundle_selected_voucher_coupon_index", -99);
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || intExtra == (min = dispatchOnCancelled.setMin(context, intExtra)))) {
            onCanceled oncanceled3 = new onCanceled(intExtra, min, 8);
            onCancelLoad.setMax(-152501907, oncanceled3);
            onCancelLoad.getMin(-152501907, oncanceled3);
        }
        for (VoucherModel next : list) {
            next.FastBitmap$CoordinateSystem = next.hashCode == intExtra;
        }
        setfillafter.getMin(list);
        setfillafter.getMax((Ignore.setMin) new AnimationUtil(this, setfillafter));
    }

    @OnClick({2131362166})
    public void onWithoutVoucherClick() {
        VoucherModel voucherModel = new VoucherModel();
        voucherModel.hashCode = -99;
        Intent intent = new Intent();
        intent.putExtra("voucher", voucherModel);
        setResult(-1, intent);
        finish();
    }

    public static /* synthetic */ void setMax(VoucherDetailActivity voucherDetailActivity, setFillAfter setfillafter, int i) {
        int length;
        Context baseContext = voucherDetailActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length, 4);
            onCancelLoad.setMax(-368215296, oncanceled);
            onCancelLoad.getMin(-368215296, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-368215296, oncanceled2);
            onCancelLoad.getMin(-368215296, oncanceled2);
        }
        int max2 = dispatchOnCancelled.getMax(i);
        if (i != max2) {
            onCanceled oncanceled3 = new onCanceled(i, max2, 16);
            onCancelLoad.setMax(-368215296, oncanceled3);
            onCancelLoad.getMin(-368215296, oncanceled3);
        }
        Intent intent = new Intent();
        intent.putExtra("voucher", (Parcelable) setfillafter.setMin(i));
        voucherDetailActivity.setResult(-1, intent);
        voucherDetailActivity.finish();
    }
}
