package id.dana.richview.contactselector;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.DanaContactModule;
import id.dana.richview.LogoProgressView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientViewModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import o.IComponent;
import o.PrepareException;
import o.RVAppInfoManager;
import o.canScroll;
import o.findItemIndex;
import o.moveToStart;
import o.notifyProcessFinished;
import o.notifyTakenPictureBitmap;
import o.notifyTakenPictureData;
import o.onGetInputStream;
import o.removeItemAt;
import o.resetInternal;
import o.saveCommonTakePicture;
import o.selectLooper;
import o.setExclusiveItemChecked;
import o.setOnWheelViewListener;
import o.setPhotoIndex;
import o.setStateOn;
import o.stopIgnoring;

public class ContactSelectorView extends BaseRichView implements moveToStart.getMin {
    private boolean IsOverlapping;
    @Inject
    public moveToStart.setMin danaContactPresenter;
    /* access modifiers changed from: private */
    public getMin equals;
    private RVAppInfoManager getMax;
    private selectLooper getMin;
    private List<String> isInside;
    private notifyTakenPictureData length;
    @BindView(2131363887)
    LinearLayout llLoadingContact;
    @BindView(2131363964)
    LogoProgressView lpvContact;
    @BindView(2131364503)
    RecyclerView rvContactList;
    /* access modifiers changed from: private */
    public boolean setMax;
    private setStateOn setMin;
    private boolean toDoubleRange;
    private int toFloatRange;
    private setPhotoIndex toIntRange;
    /* access modifiers changed from: private */
    public boolean toString;
    private int values;

    public interface getMin {
        void getMax();

        void setMax(boolean z);
    }

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_contact_selector;
    }

    public void onEnableContactSyncFeature() {
    }

    public void showProgress() {
    }

    public ContactSelectorView(@NonNull Context context) {
        super(context);
    }

    public ContactSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContactSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.getMax == null) {
            onGetInputStream.setMin setmin = new onGetInputStream.setMin((byte) 0);
            if (r4 != null) {
                setmin.length = r4;
                setmin.getMin = new DanaContactModule(this);
                stopIgnoring.setMin(setmin.getMin, DanaContactModule.class);
                stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
                this.getMax = new onGetInputStream(setmin.getMin, setmin.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.getMax(this);
        registerPresenter(this.danaContactPresenter);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.IPostMessageService$Stub$Proxy);
            try {
                this.toDoubleRange = obtainStyledAttributes.getBoolean(2, false);
                this.toString = obtainStyledAttributes.getBoolean(1, false);
                TypedValue typedValue = new TypedValue();
                obtainStyledAttributes.getValue(0, typedValue);
                this.values = typedValue.data;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        this.isInside = new ArrayList();
    }

    public void onGetDanaUserContactSuccess(List<String> list) {
        this.isInside.clear();
        this.isInside.addAll(list);
        LinearLayout linearLayout = this.llLoadingContact;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LogoProgressView logoProgressView = this.lpvContact;
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
        }
        RecyclerView recyclerView = this.rvContactList;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        setMin(list);
        observeContactPagedList();
    }

    public void onGetContactSyncState(boolean z) {
        this.equals.setMax(z);
        if (z) {
            this.danaContactPresenter.setMin();
        }
    }

    public void onError(String str) {
        setMin(Collections.emptyList());
        observeContactPagedList();
    }

    public void checkPermission() {
        getMin();
        this.setMin.length();
    }

    public void initContactList() {
        this.rvContactList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rvContactList.addItemDecoration(new canScroll(this.rvContactList, getContext().getResources().getDimensionPixelSize(R.dimen.f32202131165970), new canScroll.setMin() {
            public final boolean getMax(int i) {
                if (ContactSelectorView.this.getMax(i)) {
                    ContactSelectorView contactSelectorView = ContactSelectorView.this;
                    char access$200 = ContactSelectorView.getMax(ContactSelectorView.access$100(contactSelectorView, i));
                    ContactSelectorView contactSelectorView2 = ContactSelectorView.this;
                    if (access$200 != ContactSelectorView.getMax(ContactSelectorView.access$100(contactSelectorView2, i - 1))) {
                        return true;
                    }
                }
                return false;
            }

            public final CharSequence getMin(int i) {
                if (!ContactSelectorView.this.getMax(i)) {
                    return null;
                }
                ContactSelectorView contactSelectorView = ContactSelectorView.this;
                return String.valueOf(ContactSelectorView.getMax(ContactSelectorView.access$100(contactSelectorView, i)));
            }
        }, this.toFloatRange));
        this.getMin = new selectLooper(RecipientViewModel.toString);
        ViewCompat.setMax((View) this.rvContactList, true);
        this.rvContactList.setAdapter(this.getMin);
    }

    public void setContactHeaderColor(int i) {
        this.toFloatRange = i;
    }

    /* access modifiers changed from: private */
    public boolean getMax(int i) {
        return this.getMin.getItemViewType(i) == 3;
    }

    /* access modifiers changed from: private */
    public static char getMax(String str) {
        if (TextUtils.isEmpty(str)) {
            return ' ';
        }
        return str.charAt(0);
    }

    private void getMin() {
        if (this.setMin == null) {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
            getmin.length.add("android.permission.READ_CONTACTS");
            getmin.getMax = new setStateOn.length() {
                public final void getMin(setStateOn.setMin setmin) {
                    boolean unused = ContactSelectorView.this.setMax = true;
                    if (ContactSelectorView.this.toString) {
                        ContactSelectorView.access$500(ContactSelectorView.this);
                        ContactSelectorView.this.equals.setMax(false);
                        ContactSelectorView.this.danaContactPresenter.getMin();
                        return;
                    }
                    ContactSelectorView.this.danaContactPresenter.setMin();
                }

                public final void setMin(setStateOn.setMin setmin) {
                    boolean unused = ContactSelectorView.this.setMax = false;
                    ContactSelectorView.access$700(ContactSelectorView.this, (List) null);
                }
            };
            this.setMin = new setStateOn(getmin, (byte) 0);
        }
    }

    public void observeContactPagedList() {
        observeContactPagedList("");
    }

    public void observeContactPagedList(String str) {
        if (this.length == null) {
            this.length = new notifyTakenPictureData(getContext());
        }
        this.length.getMax = this.isInside;
        this.length.length = str;
        this.length.setMax = this.toDoubleRange;
        this.length.setMin = this.values;
        this.length.getMin = this.setMax;
        notifyTakenPictureData notifytakenpicturedata = this.length;
        setExclusiveItemChecked.getMin.length length2 = new setExclusiveItemChecked.getMin.length();
        length2.getMax = 20;
        length2.setMin = 10;
        length2.setMax = false;
        addDisposable(new findItemIndex(notifytakenpicturedata, length2.setMax()).length(BackpressureStrategy.LATEST).getMax(new notifyTakenPictureBitmap(this), Functions.IsOverlapping, Functions.length, FlowableInternalHelper.RequestMax.INSTANCE));
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.setMin;
        if (setstateon != null) {
            setstateon.getMin(i, strArr, iArr);
        }
    }

    public void setRecipientListener(setPhotoIndex setphotoindex) {
        this.toIntRange = setphotoindex;
    }

    public void setListener(getMin getmin) {
        this.equals = getmin;
    }

    public void setSelectedNumbersPublisher(IComponent<List<String>> iComponent) {
        if (iComponent != null) {
            this.getMin.getMin = iComponent;
        }
    }

    public void setSelectedNumbers(List<String> list) {
        this.getMin.IsOverlapping = list;
    }

    public void enableArrow() {
        this.IsOverlapping = true;
    }

    private void setMin(List<String> list) {
        this.getMin.length = new saveCommonTakePicture(this);
        this.getMin.setMax = new notifyProcessFinished(this);
        this.getMin.toFloatRange = this.IsOverlapping;
        if (list != null) {
            this.getMin.getMax = this.isInside;
        }
    }

    public boolean getHasPermission() {
        return this.setMax;
    }

    static /* synthetic */ String access$100(ContactSelectorView contactSelectorView, int i) {
        setExclusiveItemChecked<T> setexclusiveitemchecked;
        setExclusiveItemChecked<T> setexclusiveitemchecked2;
        setExclusiveItemChecked<T> setexclusiveitemchecked3;
        selectLooper selectlooper = contactSelectorView.getMin;
        int i2 = i < 0 ? 0 : i;
        removeItemAt<T> removeitemat = selectlooper.setMin;
        if (removeitemat.IsOverlapping != null) {
            setexclusiveitemchecked = removeitemat.IsOverlapping;
        } else {
            setexclusiveitemchecked = removeitemat.toFloatRange;
        }
        if (((RecipientViewModel) setexclusiveitemchecked.get(i2)).length() != null) {
            selectLooper selectlooper2 = contactSelectorView.getMin;
            if (i < 0) {
                i = 0;
            }
            removeItemAt<T> removeitemat2 = selectlooper2.setMin;
            if (removeitemat2.IsOverlapping != null) {
                setexclusiveitemchecked3 = removeitemat2.IsOverlapping;
            } else {
                setexclusiveitemchecked3 = removeitemat2.toFloatRange;
            }
            return ((RecipientViewModel) setexclusiveitemchecked3.get(i)).length().toUpperCase();
        }
        selectLooper selectlooper3 = contactSelectorView.getMin;
        if (i < 0) {
            i = 0;
        }
        removeItemAt<T> removeitemat3 = selectlooper3.setMin;
        if (removeitemat3.IsOverlapping != null) {
            setexclusiveitemchecked2 = removeitemat3.IsOverlapping;
        } else {
            setexclusiveitemchecked2 = removeitemat3.toFloatRange;
        }
        return ((RecipientViewModel) setexclusiveitemchecked2.get(i)).length();
    }

    static /* synthetic */ void access$500(ContactSelectorView contactSelectorView) {
        LinearLayout linearLayout = contactSelectorView.llLoadingContact;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        contactSelectorView.lpvContact.startRefresh();
        contactSelectorView.rvContactList.setVisibility(8);
    }

    static /* synthetic */ void access$700(ContactSelectorView contactSelectorView, List list) {
        contactSelectorView.setMin(list);
        contactSelectorView.observeContactPagedList();
    }

    public static /* synthetic */ void getMin(ContactSelectorView contactSelectorView, int i) {
        getMin getmin;
        int itemViewType = contactSelectorView.getMin.getItemViewType(i);
        if (itemViewType == 5) {
            contactSelectorView.getMin();
            contactSelectorView.setMin.setMin();
        } else if (itemViewType == 11 && (getmin = contactSelectorView.equals) != null) {
            getmin.getMax();
        }
    }

    public static /* synthetic */ void getMin(ContactSelectorView contactSelectorView, RecipientModel recipientModel) {
        setOnWheelViewListener.length((View) contactSelectorView);
        setPhotoIndex setphotoindex = contactSelectorView.toIntRange;
        if (setphotoindex != null) {
            setphotoindex.onRecipientSelected(recipientModel);
        }
    }
}
