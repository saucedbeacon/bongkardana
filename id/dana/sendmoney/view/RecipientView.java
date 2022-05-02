package id.dana.sendmoney.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.material.appbar.AppBarLayout;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.di.modules.AddReceiverInfoModule;
import id.dana.di.modules.DanaContactModule;
import id.dana.di.modules.SavedBankModule;
import id.dana.richview.SearchView;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.bank.all.BankViewHolder;
import id.dana.sendmoney.bank.all.CollapsibleSavedBankViewHolder;
import id.dana.sendmoney.bank.all.SendWithNewAccountNumberViewHolder;
import id.dana.sendmoney.bank.savedcard.AddOtherCardDialogFragment;
import id.dana.sendmoney.contact.all.EmptySearchRecentBankViewHolder;
import id.dana.sendmoney.contact.all.NoContactPermissionViewHolder;
import id.dana.sendmoney.contact.all.NoRecentBankViewHolder;
import id.dana.sendmoney.contact.all.SendWithNewNumberViewHolder;
import id.dana.sendmoney.contact.all.SendWithPhoneNumberViewHolder;
import id.dana.sendmoney.model.BankModel;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney.recipient.SectionViewHolder;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import id.dana.sendmoney.view.RecipientView;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.DecodeWrapper;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.PathUtils;
import o.PhotoGrid;
import o.PhotoItem;
import o.PhotoMenu;
import o.PluginResourcePackage;
import o.PrepareException;
import o.RedDotManager;
import o.SystemAlarmService;
import o.canScroll;
import o.findItemIndex;
import o.getDefaultProxy;
import o.getMediaType;
import o.getSelected;
import o.increaseCount;
import o.isGifSuffix;
import o.moveToStart;
import o.onSuccess;
import o.removeItemAt;
import o.setComponentType;
import o.setExclusiveItemChecked;
import o.setOnWheelViewListener;
import o.setStateOn;
import o.stopIgnoring;

public class RecipientView extends BaseRichView implements moveToStart.getMin, RecentRecipientView.getMax, AddOtherCardDialogFragment.getMin {
    private int FastBitmap$CoordinateSystem;
    private PhotoItem Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    private List<BankModel> Mean$Arithmetic = new ArrayList();
    @Inject
    public SystemAlarmService.setMin addReceiverInfoPresenter;
    @BindView(2131361903)
    AppBarLayout appBarLayout;
    @Inject
    public moveToStart.setMin danaContactPresenter;
    private boolean equals;
    private setComponentType getMax;
    private AddOtherCardDialogFragment getMin;
    private PhotoGrid.AnonymousClass1 hashCode;
    private canScroll invoke;
    /* access modifiers changed from: private */
    public boolean isInside;
    private List<String> length;
    @BindView(2131365937)
    RecentRecipientView recentRecipientView;
    @BindView(2131364556)
    RecyclerView rvRecipient;
    @Inject
    public onSuccess.length savedBankPresenter;
    @BindView(2131365942)
    SearchView searchView;
    /* access modifiers changed from: private */
    public AddReceiverDialogFragment setMax;
    private getMax setMin;
    private setStateOn toDoubleRange;
    private String toFloatRange;
    private boolean toIntRange;
    private List<RecentBankModel> toString;
    @BindView(2131365549)
    TextView tvSend;
    private boolean valueOf;
    private getMediaType values;

    public interface getMax {
        void getMin();
    }

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_recipient;
    }

    public void onGetContactSyncState(boolean z) {
    }

    public void showProgress() {
    }

    public RecipientView(@NonNull Context context) {
        super(context);
    }

    public RecipientView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecipientView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RecipientView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setRecipientContactType(int i) {
        String str;
        this.FastBitmap$CoordinateSystem = i;
        this.recentRecipientView.setRecipientContactType(i);
        SearchView searchView2 = this.searchView;
        if (2 == this.FastBitmap$CoordinateSystem) {
            str = getContext().getString(R.string.search_phone_number);
        } else {
            str = getContext().getString(R.string.search_bank_account);
        }
        searchView2.setSearchHint(str);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r10) {
        if (this.getMax == null) {
            PluginResourcePackage.MyPluginDownloadCallback.AnonymousClass1.AnonymousClass1.setMin setmin = new PluginResourcePackage.MyPluginDownloadCallback.AnonymousClass1.AnonymousClass1.setMin((byte) 0);
            if (r10 != null) {
                setmin.setMin = r10;
                setmin.length = new DanaContactModule(this);
                setmin.getMin = new SavedBankModule(new onSuccess.getMax() {
                    public final void getMin() {
                    }

                    public final void length(int i) {
                    }

                    public final void setMax(List<RecentBankModel> list) {
                    }

                    public final void getMax(List<RecentBankModel> list) {
                        RecipientView.access$200(RecipientView.this, false);
                        RecipientView.this.setMin(new ArrayList());
                        RecipientView.this.length();
                        RecipientView.access$500(RecipientView.this, list);
                        RecipientView.access$600(RecipientView.this, true);
                    }

                    public final void length(List<RecentBankModel> list) {
                        RecipientView.access$200(RecipientView.this, false);
                        RecipientView.access$500(RecipientView.this, list);
                        RecipientView.access$600(RecipientView.this, true);
                    }

                    public final void getMax() {
                        RecipientView.access$200(RecipientView.this, false);
                        RecipientView.this.setMin(new ArrayList());
                        RecipientView.this.length();
                        RecipientView.access$500(RecipientView.this, new ArrayList());
                        RecipientView.access$600(RecipientView.this, false);
                    }

                    public final void setMax() {
                        RecipientView.access$200(RecipientView.this, true);
                        RecipientView.this.setMin(new ArrayList());
                        RecipientView.this.length();
                        RecipientView.access$500(RecipientView.this, new ArrayList());
                        RecipientView.access$600(RecipientView.this, true);
                    }
                });
                setmin.getMax = new AddReceiverInfoModule(new SystemAlarmService.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void setMax(List<getDefaultProxy> list) {
                        RecipientView.this.setMax();
                        RecipientView.this.setMax.getMax = list;
                    }
                });
                stopIgnoring.setMin(setmin.length, DanaContactModule.class);
                stopIgnoring.setMin(setmin.getMin, SavedBankModule.class);
                stopIgnoring.setMin(setmin.getMax, AddReceiverInfoModule.class);
                stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
                this.getMax = new PluginResourcePackage.MyPluginDownloadCallback.AnonymousClass1.AnonymousClass1(setmin.length, setmin.getMin, setmin.getMax, setmin.setMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.setMax(this);
        registerPresenter(this.danaContactPresenter, this.savedBankPresenter, this.addReceiverInfoPresenter);
    }

    public void setup() {
        this.length = new ArrayList();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getMax(motionEvent)) {
            View findFocus = findFocus();
            if (findFocus instanceof EditText) {
                Rect rect = new Rect();
                findFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    findFocus.clearFocus();
                    setOnWheelViewListener.length((View) this);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean getMax(MotionEvent motionEvent) {
        return this.IsOverlapping && !this.searchView.isClearImageViewRect((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && motionEvent.getAction() == 0;
    }

    public void initRecipientView() {
        String str;
        if (2 == this.FastBitmap$CoordinateSystem) {
            getMax();
            this.toDoubleRange.length();
            setMin();
        } else {
            this.savedBankPresenter.length();
        }
        this.recentRecipientView.setItemSelectedListener(this);
        SearchView searchView2 = this.searchView;
        if (2 == this.FastBitmap$CoordinateSystem) {
            str = getContext().getString(R.string.search_phone_number);
        } else {
            str = getContext().getString(R.string.search_bank_account);
        }
        searchView2.setSearchHint(str);
        addDisposable(this.searchView.getOnSearchClickedEvent().subscribe(new getSelected(this)));
        addDisposable(this.searchView.getKeyword().debounce(300, TimeUnit.MILLISECONDS).subscribe(new isGifSuffix(this)));
        this.addReceiverInfoPresenter.length();
        setOnWheelViewListener.getMax(this, new setOnWheelViewListener.length() {
            public final void length() {
                boolean unused = RecipientView.this.IsOverlapping = true;
            }

            public final void setMax() {
                boolean unused = RecipientView.this.IsOverlapping = false;
            }
        });
    }

    /* access modifiers changed from: private */
    public void setMin(List<String> list) {
        PhotoGrid.AnonymousClass1 r0 = new IMultiInstanceInvalidationCallback.Stub.Proxy<Ignore<RecipientViewModel>, RecipientViewModel>(RecipientViewModel.toString) {
            public List<String> getMax;
            public PhotoItem getMin;
            public boolean length;

            public final int getItemViewType(int i) {
                setExclusiveItemChecked<T> setexclusiveitemchecked;
                if (i < 0) {
                    i = 0;
                }
                removeItemAt<T> removeitemat = this.setMin;
                if (removeitemat.IsOverlapping != null) {
                    setexclusiveitemchecked = removeitemat.IsOverlapping;
                } else {
                    setexclusiveitemchecked = removeitemat.toFloatRange;
                }
                return ((RecipientViewModel) setexclusiveitemchecked.get(i)).values;
            }

            @NonNull
            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                switch (i) {
                    case 1:
                    case 7:
                    case 10:
                        return new SectionViewHolder(viewGroup);
                    case 2:
                        return new BankViewHolder(viewGroup, this.getMin);
                    case 3:
                        if (this.length) {
                            return new PathUtils.AnonymousClass1(viewGroup, this.getMin, this.getMax);
                        }
                        return new PathUtils(viewGroup, this.getMin, this.getMax);
                    case 4:
                        return new hasHost(viewGroup);
                    case 8:
                        return new SendWithNewNumberViewHolder(viewGroup, this.getMin);
                    case 9:
                        return new BaseReq(viewGroup);
                    case 11:
                        return new SendWithPhoneNumberViewHolder(viewGroup, "send_money");
                    case 12:
                        return new SendWithNewAccountNumberViewHolder(viewGroup, this.getMin);
                    case 13:
                    case 14:
                        return new CollapsibleSavedBankViewHolder(viewGroup);
                    case 17:
                        return new NoRecentBankViewHolder(viewGroup);
                    case 18:
                        return new EmptySearchRecentBankViewHolder(viewGroup);
                    default:
                        return new NoContactPermissionViewHolder(viewGroup);
                }
            }
        };
        this.hashCode = r0;
        if (this.toIntRange) {
            r0.length = true;
        }
        this.hashCode.setMax = new Ignore.setMin(this) {
            private final RecipientView length;

            {
                this.length = r1;
            }

            public final void length(int i) {
                RecipientView.getMax(this.length, i);
            }
        };
        this.hashCode.getMin = new PhotoItem() {
            public final void onRecipientSelected(RecipientModel recipientModel) {
                RecipientView.access$700(RecipientView.this, recipientModel);
            }

            public final void getMax() {
                RecipientView.this.getMax((String) null, RecipientView.this.toFloatRange);
            }
        };
        this.hashCode.getMax = list;
    }

    /* access modifiers changed from: private */
    public void length() {
        this.rvRecipient.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rvRecipient.setAdapter(this.hashCode);
        if (this.rvRecipient.getItemDecorationCount() == 0) {
            RecyclerView recyclerView = this.rvRecipient;
            if (this.invoke == null) {
                this.invoke = new canScroll(this.rvRecipient, getContext().getResources().getDimensionPixelSize(R.dimen.f32202131165970), new canScroll.setMin() {
                    public final boolean getMax(int i) {
                        if (RecipientView.this.getMax(i)) {
                            RecipientView recipientView = RecipientView.this;
                            char access$1400 = RecipientView.getMin(RecipientView.access$1300(recipientView, i));
                            RecipientView recipientView2 = RecipientView.this;
                            if (access$1400 != RecipientView.getMin(RecipientView.access$1300(recipientView2, i - 1))) {
                                return true;
                            }
                        }
                        return false;
                    }

                    public final CharSequence getMin(int i) {
                        if (!RecipientView.this.getMax(i)) {
                            return null;
                        }
                        RecipientView recipientView = RecipientView.this;
                        return String.valueOf(RecipientView.getMin(RecipientView.access$1300(recipientView, i)));
                    }
                }, -1);
            }
            recyclerView.addItemDecoration(this.invoke);
        }
        ViewCompat.setMax((View) this.rvRecipient, true);
    }

    private void getMax() {
        if (this.toDoubleRange == null) {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
            getmin.length.add("android.permission.READ_CONTACTS");
            getmin.getMax = new setStateOn.length() {
                public final void getMin(setStateOn.setMin setmin) {
                    boolean unused = RecipientView.this.isInside = true;
                    RecipientView.this.danaContactPresenter.setMin();
                    RecipientView.this.danaContactPresenter.length();
                    RecipientView.this.setMin();
                }

                public final void setMin(setStateOn.setMin setmin) {
                    boolean unused = RecipientView.this.isInside = false;
                    RecipientView.this.setMin(Collections.emptyList());
                    RecipientView.this.length();
                    RecipientView.this.setMin();
                }
            };
            this.toDoubleRange = new setStateOn(getmin, (byte) 0);
        }
    }

    /* access modifiers changed from: private */
    public void setMin() {
        if (this.values == null) {
            this.values = new getMediaType(getContext());
        }
        setMax(this.values);
        getMediaType getmediatype = this.values;
        setExclusiveItemChecked.getMin.length length2 = new setExclusiveItemChecked.getMin.length();
        length2.getMax = 20;
        length2.setMin = 10;
        length2.setMax = false;
        addDisposable(new findItemIndex(getmediatype, length2.setMax()).length(BackpressureStrategy.LATEST).getMax(new RedDotManager(this) {
            private final RecipientView length;

            {
                this.length = r1;
            }

            public final void accept(Object obj) {
                this.length.hashCode.setMin((setExclusiveItemChecked) obj);
            }
        }, Functions.IsOverlapping, Functions.length, FlowableInternalHelper.RequestMax.INSTANCE));
    }

    private void setMax(getMediaType getmediatype) {
        if (this.FastBitmap$CoordinateSystem == 1) {
            getmediatype.getMax = this.valueOf;
            getmediatype.toIntRange = this.toString;
            getmediatype.getMin = true;
            getmediatype.setMin = this.equals;
        }
        getmediatype.equals = this.FastBitmap$CoordinateSystem;
        getmediatype.setMax = this.toFloatRange;
        getmediatype.length = this.isInside;
    }

    /* access modifiers changed from: private */
    public boolean getMax(int i) {
        return this.hashCode.getItemViewType(i) == 3;
    }

    /* access modifiers changed from: private */
    public static char getMin(String str) {
        if (TextUtils.isEmpty(str)) {
            return ' ';
        }
        return str.charAt(0);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.toDoubleRange;
        if (setstateon != null) {
            setstateon.getMin(i, strArr, iArr);
        }
    }

    public void setListener(PhotoItem photoItem) {
        this.Grayscale$Algorithm = photoItem;
    }

    public void setListener(getMax getmax) {
        this.setMin = getmax;
    }

    public void onGetDanaUserContactSuccess(List<String> list) {
        this.length.clear();
        this.length.addAll(list);
        setMin(this.length);
        length();
    }

    public void onError(String str) {
        setMin(new ArrayList());
        length();
        this.savedBankPresenter.length();
    }

    private void setMin(increaseCount increasecount, String str, String str2) {
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
        length2.setMax = RecipientSource.RECENT;
        length2.getCause = increasecount.toIntRange();
        this.Grayscale$Algorithm.onRecipientSelected(length2.length());
    }

    /* access modifiers changed from: private */
    public void setMax() {
        if (this.setMax == null) {
            AddReceiverDialogFragment addReceiverDialogFragment = new AddReceiverDialogFragment();
            this.setMax = addReceiverDialogFragment;
            addReceiverDialogFragment.getMin = new PhotoMenu(this);
        }
    }

    public void onAddedNewBank(RecentBankModel recentBankModel) {
        RecipientModel.length length2 = new RecipientModel.length("bank");
        length2.toFloatRange = recentBankModel.getMin;
        length2.FastBitmap$CoordinateSystem = RecipientIdType.INSTITUTION;
        length2.isInside = recentBankModel.equals;
        length2.Mean$Arithmetic = recentBankModel.isInside;
        length2.toIntRange = recentBankModel.getMax;
        length2.IsOverlapping = recentBankModel.Mean$Arithmetic;
        length2.equals = recentBankModel.setMin;
        length2.values = recentBankModel.toFloatRange;
        length2.toDoubleRange = recentBankModel.IsOverlapping;
        length2.getMin = recentBankModel.Grayscale$Algorithm;
        length2.setMax = RecipientSource.MANUAL_INPUT;
        String str = recentBankModel.getMax;
        length2.getCause = (str == null || str.length() <= 2) ? null : str.substring(0, str.length() / 2);
        this.Grayscale$Algorithm.onRecipientSelected(length2.length());
    }

    public void onGetListWithdrawBank(List<BankModel> list) {
        this.Mean$Arithmetic = list;
    }

    public void enableInvite() {
        this.toIntRange = true;
        if (this.isInside) {
            setMin(this.length);
            length();
        }
    }

    public void setQrTransferModel(QrTransferModel qrTransferModel, String str) {
        if (BranchLinkConstant.ActionTarget.SEND_MONEY_BANK.equals(str)) {
            getMax(qrTransferModel.IsOverlapping(), qrTransferModel.setMin());
        }
    }

    /* access modifiers changed from: private */
    public void getMax(String str, String str2) {
        if (getBaseActivity() != null) {
            AddOtherCardDialogFragment addOtherCardDialogFragment = new AddOtherCardDialogFragment();
            this.getMin = addOtherCardDialogFragment;
            addOtherCardDialogFragment.getMax = this;
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(FeatureParams.BANK_ID, str);
            }
            bundle.putString("bank_number", str2);
            bundle.putParcelableArrayList("bundle_withdraw_banks", new ArrayList(this.Mean$Arithmetic));
            this.getMin.setArguments(bundle);
        }
        if (getBaseActivity() != null) {
            this.getMin.show(getBaseActivity().getSupportFragmentManager(), "Add Other Bank Dialog");
        }
    }

    public void checkContactSyncState() {
        this.danaContactPresenter.getMin();
    }

    public void setRecipientViewTitle(String str) {
        this.tvSend.setText(str);
    }

    public void onEnableContactSyncFeature() {
        getMax getmax = this.setMin;
        if (getmax != null) {
            getmax.getMin();
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public void onItemSelected(increaseCount increasecount) {
        int i = increasecount.values;
        if (i == 0) {
            DecodeWrapper.getMin("Send Money");
        } else if (i == 2) {
            setMin(increasecount, "contact", "userid");
        } else if (i == 3) {
            RecipientModel.length length2 = new RecipientModel.length("link");
            length2.isInside = getContext().getString(R.string.send_as_link);
            length2.toIntRange = getContext().getString(R.string.share_send_money_link);
            length2.IsOverlapping = increasecount.getMax();
            this.Grayscale$Algorithm.onRecipientSelected(length2.length());
        } else if (i == 4) {
            setMin(increasecount, "bank", RecipientIdType.INSTITUTION);
        } else if (i == 5) {
            setMax();
            if (getBaseActivity() != null) {
                this.setMax.show(getBaseActivity().getSupportFragmentManager(), "Add Receiver Info Dialog");
            }
        }
    }

    static /* synthetic */ void access$200(RecipientView recipientView, boolean z) {
        recipientView.equals = z && !TextUtils.isEmpty(recipientView.toFloatRange);
    }

    static /* synthetic */ void access$500(RecipientView recipientView, List list) {
        if (recipientView.toString == null) {
            recipientView.toString = new ArrayList();
        }
        recipientView.toString.clear();
        recipientView.toString.addAll(list);
        recipientView.setMin();
    }

    static /* synthetic */ void access$600(RecipientView recipientView, boolean z) {
        if (z) {
            recipientView.searchView.setVisibility(0);
        } else {
            recipientView.searchView.setVisibility(8);
        }
    }

    static /* synthetic */ void access$700(RecipientView recipientView, RecipientModel recipientModel) {
        PhotoItem photoItem = recipientView.Grayscale$Algorithm;
        if (photoItem != null) {
            photoItem.onRecipientSelected(recipientModel);
        }
    }

    static /* synthetic */ String access$1300(RecipientView recipientView, int i) {
        setExclusiveItemChecked<T> setexclusiveitemchecked;
        setExclusiveItemChecked<T> setexclusiveitemchecked2;
        setExclusiveItemChecked<T> setexclusiveitemchecked3;
        PhotoGrid.AnonymousClass1 r0 = recipientView.hashCode;
        int i2 = i < 0 ? 0 : i;
        removeItemAt<T> removeitemat = r0.setMin;
        if (removeitemat.IsOverlapping != null) {
            setexclusiveitemchecked = removeitemat.IsOverlapping;
        } else {
            setexclusiveitemchecked = removeitemat.toFloatRange;
        }
        if (((RecipientViewModel) setexclusiveitemchecked.get(i2)).length() != null) {
            PhotoGrid.AnonymousClass1 r4 = recipientView.hashCode;
            if (i < 0) {
                i = 0;
            }
            removeItemAt<T> removeitemat2 = r4.setMin;
            if (removeitemat2.IsOverlapping != null) {
                setexclusiveitemchecked3 = removeitemat2.IsOverlapping;
            } else {
                setexclusiveitemchecked3 = removeitemat2.toFloatRange;
            }
            return ((RecipientViewModel) setexclusiveitemchecked3.get(i)).length().toUpperCase();
        }
        PhotoGrid.AnonymousClass1 r42 = recipientView.hashCode;
        if (i < 0) {
            i = 0;
        }
        removeItemAt<T> removeitemat3 = r42.setMin;
        if (removeitemat3.IsOverlapping != null) {
            setexclusiveitemchecked2 = removeitemat3.IsOverlapping;
        } else {
            setexclusiveitemchecked2 = removeitemat3.toFloatRange;
        }
        return ((RecipientViewModel) setexclusiveitemchecked2.get(i)).length();
    }

    public static /* synthetic */ void length(RecipientView recipientView, String str) {
        recipientView.toFloatRange = str;
        if (1 == recipientView.FastBitmap$CoordinateSystem) {
            recipientView.savedBankPresenter.getMax(str);
        } else {
            recipientView.setMin();
        }
    }

    public static /* synthetic */ void setMax(RecipientView recipientView, Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            recipientView.searchView.setSearchViewInputType(144);
            SearchView searchView2 = recipientView.searchView;
            if (2 == recipientView.FastBitmap$CoordinateSystem) {
                str = recipientView.getContext().getString(R.string.search_phone_number);
            } else {
                str = recipientView.getContext().getString(R.string.search_bank_account);
            }
            searchView2.setSearchHint(str);
            recipientView.appBarLayout.setExpanded(false);
        }
    }

    public static /* synthetic */ void getMax(RecipientView recipientView, int i) {
        int itemViewType = recipientView.hashCode.getItemViewType(i);
        if (!(itemViewType == 2 || itemViewType == 3)) {
            if (itemViewType == 5) {
                recipientView.getMax();
                recipientView.toDoubleRange.setMin();
                return;
            } else if (itemViewType != 11) {
                if (itemViewType != 17) {
                    if (itemViewType != 8) {
                        if (itemViewType != 9) {
                            if (itemViewType != 13) {
                                if (itemViewType == 14 && recipientView.valueOf) {
                                    recipientView.valueOf = false;
                                    recipientView.setMin();
                                    return;
                                }
                                return;
                            } else if (!recipientView.valueOf) {
                                recipientView.valueOf = true;
                                recipientView.setMin();
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                }
                recipientView.getMax((String) null, recipientView.toFloatRange);
                return;
            } else {
                recipientView.searchView.setSearchViewInputType(3);
                recipientView.searchView.setSearchHint(recipientView.getContext().getString(R.string.search_phone_number));
                recipientView.searchView.focusEtSearchContact();
                return;
            }
        }
        setOnWheelViewListener.length((View) recipientView);
    }
}
