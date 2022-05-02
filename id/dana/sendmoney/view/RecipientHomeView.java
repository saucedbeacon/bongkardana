package id.dana.sendmoney.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.di.modules.RecipientHomeModule;
import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.richview.BannerView;
import id.dana.scanner.ScannerActivity;
import id.dana.scanner.handler.ScannerViewType;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.DecodeWrapper;
import o.LoadingBridgeExtension;
import o.PluginResourcePackage;
import o.PrepareException;
import o.getModifiedTime;
import o.getRelatedArray;
import o.increaseCount;
import o.isPhotoSupport;
import o.setInEdited;
import o.setLargePhotoHeight;
import o.setSourcePath;
import o.stopIgnoring;

public class RecipientHomeView extends BaseRichView implements RecentRecipientView.getMax {
    @BindView(2131362188)
    BannerView bannerView;
    private isPhotoSupport getMin;
    private getRelatedArray length;
    @BindView(2131365937)
    RecentRecipientView recentRecipientView;
    @Inject
    public getModifiedTime.getMin recipientHomePresenter;
    @BindView(2131364557)
    RecyclerView rvRecipientHomeMenu;
    /* access modifiers changed from: private */
    public setSourcePath setMin;

    public int getLayout() {
        return R.layout.view_recipient_home;
    }

    public RecipientHomeView(@NonNull Context context) {
        super(context);
    }

    public RecipientHomeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecipientHomeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RecipientHomeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.length == null) {
            PluginResourcePackage.MyPluginDownloadCallback.AnonymousClass1.getMin getmin = new PluginResourcePackage.MyPluginDownloadCallback.AnonymousClass1.getMin((byte) 0);
            if (r4 != null) {
                getmin.getMax = r4;
                getmin.setMin = new RecipientHomeModule(new getModifiedTime.getMax() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void getMin(List<SendMoneyHomeMenuModel> list) {
                        RecipientHomeView.this.setMin.setMin.getMin(list);
                        if (RecipientHomeView.this.setMin.setMax()) {
                            RecipientHomeView.this.recipientHomePresenter.setMin(list);
                        }
                    }

                    public final void length(SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
                        RecipientHomeView.this.setMin.setMin.setMin(sendMoneyHomeMenuModel);
                    }

                    public final void length(Boolean bool) {
                        if (RecipientHomeView.this.bannerView == null) {
                            return;
                        }
                        if (bool.booleanValue()) {
                            RecipientHomeView.this.bannerView.setVisibility(0);
                            RecipientHomeView.this.recipientHomePresenter.length();
                            return;
                        }
                        RecipientHomeView.this.bannerView.setVisibility(8);
                    }

                    public final void setMax(LoadingBridgeExtension loadingBridgeExtension) {
                        List list = loadingBridgeExtension.setMin;
                        if (list == null) {
                            list = new ArrayList();
                        }
                        RecipientHomeView.this.bannerView.setPromotionBannerSliderItemMode(false);
                        RecipientHomeView.this.bannerView.setEntryPoint("sendMoney");
                        RecipientHomeView.this.bannerView.setContents(list);
                        RecipientHomeView.this.bannerView.setPromotionModel(loadingBridgeExtension);
                        RecipientHomeView.this.bannerView.display();
                    }
                });
                stopIgnoring.setMin(getmin.setMin, RecipientHomeModule.class);
                stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
                this.length = new PluginResourcePackage.MyPluginDownloadCallback.AnonymousClass1(getmin.setMin, getmin.getMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.length.getMax(this);
        registerPresenter(this.recipientHomePresenter);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        super.parseAttrs(context, attributeSet);
        this.bannerView.setSelectedColor(-1);
    }

    public void getSendMoneyBannerContent() {
        this.recipientHomePresenter.getMin();
    }

    public void setListener(isPhotoSupport isphotosupport) {
        this.getMin = isphotosupport;
    }

    private void setMax(increaseCount increasecount, String str, String str2) {
        RecipientModel.length length2 = new RecipientModel.length(str);
        length2.getMin = increasecount.setMin;
        length2.FastBitmap$CoordinateSystem = str2;
        length2.toFloatRange = increasecount.getMin();
        length2.isInside = increasecount.length();
        length2.toIntRange = increasecount.isInside;
        length2.IsOverlapping = increasecount.getMax();
        length2.Mean$Arithmetic = increasecount.equals;
        length2.equals = increasecount.length;
        length2.values = increasecount.toIntRange;
        length2.toDoubleRange = increasecount.toFloatRange;
        length2.invoke = increasecount.setMin();
        length2.getCause = increasecount.toIntRange();
        this.getMin.setMin(length2.length());
    }

    @OnClick({2131362291})
    public void sendMoneyViaScanClick() {
        BaseActivity baseActivity = getBaseActivity();
        Intent intent = new Intent(baseActivity, ScannerActivity.class);
        intent.putExtra("source", "Send Money");
        intent.putExtra(ScannerActivity.FROM_VIEW_TYPE, ScannerViewType.ACTIVITY);
        baseActivity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
    }

    public void setup() {
        setSourcePath setsourcepath = new setSourcePath();
        this.setMin = setsourcepath;
        setsourcepath.setMax = new setInEdited(this);
        this.rvRecipientHomeMenu.setAdapter(this.setMin);
        this.rvRecipientHomeMenu.setHasFixedSize(true);
        this.rvRecipientHomeMenu.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.rvRecipientHomeMenu.addItemDecoration(new RecyclerView.getMax() {
            public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                int dimension = (int) RecipientHomeView.this.getResources().getDimension(R.dimen.f26262131165274);
                rect.right = dimension;
                rect.bottom = dimension;
            }
        });
        ViewCompat.setMax((View) this.rvRecipientHomeMenu, false);
        this.recipientHomePresenter.setMin();
        this.recentRecipientView.setRecentTransactionVisible(true);
        this.recentRecipientView.setItemSelectedListener(this);
        this.recentRecipientView.setRecipientContactType(3);
    }

    @SuppressLint({"SwitchIntDef"})
    public void onItemSelected(increaseCount increasecount) {
        int i = increasecount.values;
        if (i == 2) {
            setMax(increasecount, "contact", "userid");
        } else if (i == 4) {
            setMax(increasecount, "bank", RecipientIdType.INSTITUTION);
        } else if (i == 5 && getBaseActivity() != null) {
            AddReceiverDialogFragment addReceiverDialogFragment = new AddReceiverDialogFragment();
            addReceiverDialogFragment.getMin = new setLargePhotoHeight(this);
            addReceiverDialogFragment.show(getBaseActivity().getSupportFragmentManager(), "Custom Bottom Sheet");
        }
    }
}
