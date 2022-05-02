package id.dana.richview.splitbill;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.model.SelectedPayerModule;
import id.dana.scanner.ScannerActivity;
import id.dana.scanner.handler.nativepages.ScannerSceneType;
import id.dana.sendmoney.RecentDetailView;
import id.dana.sendmoney.model.RecipientModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.CameraView;
import o.DecodeWrapper;
import o.PrepareException;
import o.fastReadTarIntoMemory;
import o.setCameraParams;
import o.setRecordPhase;
import o.stopIgnoring;
import o.switchCamera;

public class SelectedPayerView extends BaseRichView {
    private List<RecipientModel> getMax = new ArrayList();
    @Inject
    public CameraView.setMin presenter;
    @BindView(2131364329)
    RecentDetailView rdvScanner;
    @BindView(2131364566)
    RecyclerView rvSelectedPayers;
    switchCamera selectedPayerAdapter;
    private List<RecipientModel> setMax;
    /* access modifiers changed from: private */
    public getMax setMin;
    @BindView(2131365160)
    TextView tvCountPayers;

    public interface getMax {
        void getMax(RecipientModel recipientModel);

        void setMax(RecipientModel recipientModel);
    }

    public int getLayout() {
        return R.layout.view_selected_payer;
    }

    public SelectedPayerView(@NonNull Context context) {
        super(context);
    }

    public SelectedPayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectedPayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SelectedPayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        fastReadTarIntoMemory.setMax setmax = new fastReadTarIntoMemory.setMax((byte) 0);
        if (r4 != null) {
            setmax.length = r4;
            setmax.getMin = new SelectedPayerModule(new setRecordPhase(this));
            stopIgnoring.setMin(setmax.getMin, SelectedPayerModule.class);
            stopIgnoring.setMin(setmax.length, PrepareException.AnonymousClass1.class);
            new fastReadTarIntoMemory(setmax.getMin, setmax.length, (byte) 0).length(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.rdvScanner.setView(getContext().getString(R.string.scan_qr_send_money_title), getContext().getString(R.string.scan_code), (String) null, "scanner");
        this.rdvScanner.setOnClickListener(new setCameraParams(this));
        this.rdvScanner.setContentDescription(getResources().getString(R.string.btnScanQr));
        this.rvSelectedPayers.setLayoutManager(linearLayoutManager);
        this.rvSelectedPayers.setNestedScrollingEnabled(false);
        switchCamera switchcamera = new switchCamera();
        this.selectedPayerAdapter = switchcamera;
        switchcamera.length = new switchCamera.getMax() {
            public final void getMax(RecipientModel recipientModel) {
                if (SelectedPayerView.this.setMin != null) {
                    SelectedPayerView.this.setMin.getMax(recipientModel);
                }
            }

            public final void setMin(RecipientModel recipientModel) {
                if (SelectedPayerView.this.setMin != null) {
                    SelectedPayerView.this.setMin.setMax(recipientModel);
                }
            }
        };
        this.rvSelectedPayers.setAdapter(this.selectedPayerAdapter);
        ArrayList arrayList = new ArrayList();
        this.setMax = arrayList;
        this.selectedPayerAdapter.getMin(arrayList);
        this.presenter.setMin();
    }

    public void setSelectedPayers(List<RecipientModel> list) {
        this.setMax.clear();
        this.setMax.addAll(list);
        this.selectedPayerAdapter.getMin(this.setMax);
    }

    public void addSelectedPayer(int i, RecipientModel recipientModel) {
        if (this.setMax.isEmpty()) {
            this.setMax.add(recipientModel);
            this.selectedPayerAdapter.notifyDataSetChanged();
            return;
        }
        this.setMax.add(i, recipientModel);
        this.selectedPayerAdapter.notifyDataSetChanged();
    }

    public void removeSelectedPayer(RecipientModel recipientModel) {
        if (this.setMax.indexOf(recipientModel) != -1) {
            this.selectedPayerAdapter.getMax(this.setMax.indexOf(recipientModel));
        }
    }

    public void updatePayerFromSelectedToRecent(RecipientModel recipientModel) {
        if (this.setMax.indexOf(recipientModel) != -1) {
            this.selectedPayerAdapter.getMax(this.setMax.indexOf(recipientModel));
            for (RecipientModel next : this.getMax) {
                if (next.toDoubleRange()) {
                    this.setMax.remove(next);
                }
            }
            for (RecipientModel next2 : this.getMax) {
                if (next2.toDoubleRange()) {
                    this.setMax.add(next2);
                }
            }
            this.selectedPayerAdapter.notifyDataSetChanged();
        }
    }

    public void updatePayerFromRecentToSelected(int i, RecipientModel recipientModel) {
        if (this.setMax.indexOf(recipientModel) != -1) {
            this.selectedPayerAdapter.getMax(this.setMax.indexOf(recipientModel));
            this.setMax.add(i, recipientModel);
            this.selectedPayerAdapter.notifyDataSetChanged();
        }
    }

    public void addRecentPayers(List<RecipientModel> list) {
        if (!list.isEmpty()) {
            this.setMax.addAll(list);
            this.selectedPayerAdapter.notifyDataSetChanged();
        }
    }

    public List<RecipientModel> getPayersList() {
        return this.setMax;
    }

    public void setPayersCount(int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(R.string.split_bill_with_people));
            sb.append(" ");
            sb.append(getContext().getResources().getQuantityString(R.plurals.f75292131755018, i, new Object[]{Integer.valueOf(i)}));
            String obj = sb.toString();
            this.tvCountPayers.setVisibility(0);
            this.tvCountPayers.setText(obj);
            return;
        }
        this.tvCountPayers.setVisibility(8);
    }

    public void setListener(getMax getmax) {
        this.setMin = getmax;
    }

    public boolean isRecentPayer(RecipientModel recipientModel) {
        if (TextUtils.isEmpty(recipientModel.isInside)) {
            return false;
        }
        for (RecipientModel recipientModel2 : this.getMax) {
            if (recipientModel.isInside.equals(recipientModel2.isInside)) {
                return true;
            }
        }
        return false;
    }

    public void setRecentPayerDisplay(RecipientModel recipientModel, boolean z) {
        if (!TextUtils.isEmpty(recipientModel.isInside)) {
            for (RecipientModel next : this.getMax) {
                if (recipientModel.isInside.equals(next.isInside)) {
                    next.onNavigationEvent = z ? "recentContacts" : "contact";
                    next.extraCallbackWithResult = z;
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void length(SelectedPayerView selectedPayerView, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RecipientModel recipientModel = (RecipientModel) it.next();
                if (recipientModel != null) {
                    selectedPayerView.getMax.add(recipientModel);
                }
            }
            selectedPayerView.addRecentPayers(selectedPayerView.getMax);
        }
    }

    public static /* synthetic */ void getMin(SelectedPayerView selectedPayerView) {
        Activity activity = (Activity) selectedPayerView.getContext();
        Intent intent = new Intent(activity, ScannerActivity.class);
        intent.putExtra("source", "Split Bill");
        intent.putExtra(ScannerActivity.FROM_VIEW_TYPE, "split_bill");
        intent.putExtra("scene", ScannerSceneType.SCENE_SPLIT_BILL);
        activity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
    }
}
