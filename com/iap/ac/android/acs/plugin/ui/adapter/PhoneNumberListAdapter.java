package com.iap.ac.android.acs.plugin.ui.adapter;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.PhoneNumberFacade;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.model.MobilePhoneInfo;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.UserPhoneRequest;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginDialog;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.List;

public class PhoneNumberListAdapter extends BaseAdapter implements View.OnClickListener {
    private Activity mActivity;
    private String mCancelText;
    private String mConfirmDeleteText;
    private String mDeleteDialogDesc;
    private String mDeleteText;
    private View mDeleteView;
    private OnDeleteAllListener mOnDeleteAllListener;
    private List<MobilePhoneInfo> mPhoneInfoList;
    private int mSelectedPosition = 0;

    public interface OnDeleteAllListener {
        void onDeleteAll();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public PhoneNumberListAdapter(@NonNull Activity activity, @NonNull List<MobilePhoneInfo> list) {
        this.mActivity = activity;
        this.mPhoneInfoList = list;
    }

    public int getCount() {
        return this.mPhoneInfoList.size();
    }

    public Object getItem(int i) {
        return this.mPhoneInfoList.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        int i2 = 0;
        if (view == null) {
            view = LayoutInflater.from(this.mActivity).inflate(R.layout.acplugin_layout_phone_num_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.phoneNumText = (TextView) view.findViewById(R.id.phone_num_text);
            viewHolder.selectedFlag = (ImageView) view.findViewById(R.id.selected_flag);
            viewHolder.deleteText = (TextView) view.findViewById(R.id.delete_text);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.phoneNumText.setText(this.mPhoneInfoList.get(i).formattedMobilePhoneNumber);
        viewHolder.deleteText.setText(this.mDeleteText);
        ImageView imageView = viewHolder.selectedFlag;
        if (i != this.mSelectedPosition) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        viewHolder.deleteText.setOnClickListener(this);
        viewHolder.deleteText.setVisibility(8);
        viewHolder.deleteText.setTag(Integer.valueOf(i));
        return view;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.delete_text) {
            showDeleteDialog(((Integer) view.getTag()).intValue());
        }
    }

    public void setMultiLanguageText(String str, String str2, String str3, String str4) {
        this.mDeleteText = str;
        this.mDeleteDialogDesc = str2;
        this.mCancelText = str3;
        this.mConfirmDeleteText = str4;
    }

    public void setOnDeleteAllListener(@NonNull OnDeleteAllListener onDeleteAllListener) {
        this.mOnDeleteAllListener = onDeleteAllListener;
    }

    public void onItemClick(int i) {
        if (i < 0 || i >= this.mPhoneInfoList.size()) {
            ACLog.e(Constants.TAG, "PhoneNumberListAdapter#onItemClick, position illegal: ".concat(String.valueOf(i)));
            return;
        }
        ACLog.d(Constants.TAG, "PhoneNumberListAdapter#onItemClick, position: ".concat(String.valueOf(i)));
        this.mSelectedPosition = i;
        notifyDataSetChanged();
    }

    public boolean onItemLongClick(@Nullable View view) {
        ACLog.d(Constants.TAG, "PhoneNumberListAdapter#onItemLongClick, view: ".concat(String.valueOf(view)));
        if (view == null || !(view.getTag() instanceof ViewHolder)) {
            return false;
        }
        TextView textView = ((ViewHolder) view.getTag()).deleteText;
        if (textView == null) {
            ACLog.e(Constants.TAG, "PhoneNumberListAdapter#onItemLongClick, delete view is null");
            return true;
        }
        View view2 = this.mDeleteView;
        if (!(view2 == null || view2 == textView)) {
            view2.setVisibility(8);
        }
        this.mDeleteView = textView;
        textView.setVisibility(0);
        ACLog.d(Constants.TAG, "PhoneNumberListAdapter#onItemLongClick, show new delete view");
        return true;
    }

    public MobilePhoneInfo getSelectedPhoneInfo() {
        int i = this.mSelectedPosition;
        if (i >= 0 && i < this.mPhoneInfoList.size()) {
            return this.mPhoneInfoList.get(this.mSelectedPosition);
        }
        StringBuilder sb = new StringBuilder("PhoneNumberListAdapter#getSelectedPhoneInfo, selected position illegal: ");
        sb.append(this.mSelectedPosition);
        ACLog.e(Constants.TAG, sb.toString());
        return null;
    }

    private void showDeleteDialog(final int i) {
        if (i < 0 || i >= this.mPhoneInfoList.size()) {
            ACLog.e(Constants.TAG, "PhoneNumberListAdapter#showDeleteDialog, position illegal");
        } else if (UIUtils.isActivityDisabled(this.mActivity)) {
            ACLog.e(Constants.TAG, "PhoneNumberListAdapter#showDeleteDialog, activity disabled");
        } else {
            String str = this.mPhoneInfoList.get(i).formattedMobilePhoneNumber;
            if (TextUtils.isEmpty(str)) {
                ACLog.e(Constants.TAG, "PhoneNumberListAdapter#showDeleteDialog, phone number is empty");
                return;
            }
            String format = String.format(this.mDeleteDialogDesc, new Object[]{str});
            StringBuilder sb = new StringBuilder("PhoneNumberListAdapter#showDeleteDialog, position: ");
            sb.append(i);
            sb.append(", phone number: ");
            sb.append(UIUtils.encryptPhoneNumber(str));
            ACLog.d(Constants.TAG, sb.toString());
            ACPluginDialog aCPluginDialog = new ACPluginDialog(this.mActivity, format, this.mCancelText, this.mConfirmDeleteText);
            aCPluginDialog.setConfirmListener(new ACPluginDialog.OnConfirmListener() {
                public void onConfirm() {
                    PhoneNumberListAdapter.this.deleteItem(i);
                }
            });
            aCPluginDialog.setCancelListener(new ACPluginDialog.OnCancelListener() {
                public void onCancel() {
                    PhoneNumberListAdapter.this.notifyDataSetChanged();
                }
            });
            aCPluginDialog.show();
        }
    }

    /* access modifiers changed from: private */
    public void deleteItem(int i) {
        if (i < 0 || i >= this.mPhoneInfoList.size()) {
            ACLog.e(Constants.TAG, "PhoneNumberListAdapter#deleteItem, position illegal");
            return;
        }
        ACLog.d(Constants.TAG, "PhoneNumberListAdapter#deleteItem, position: ".concat(String.valueOf(i)));
        deletePhoneNumber(this.mPhoneInfoList.remove(i));
        if (!this.mPhoneInfoList.isEmpty() || this.mOnDeleteAllListener == null) {
            int i2 = this.mSelectedPosition;
            if (i2 == i) {
                this.mSelectedPosition = 0;
            } else if (i2 > i) {
                this.mSelectedPosition = i2 - 1;
            }
            StringBuilder sb = new StringBuilder("PhoneNumberListAdapter#deleteItem, selected position after delete: ");
            sb.append(this.mSelectedPosition);
            ACLog.d(Constants.TAG, sb.toString());
            notifyDataSetChanged();
            return;
        }
        ACLog.d(Constants.TAG, "PhoneNumberListAdapter#deleteItem, all items have been deleted");
        this.mOnDeleteAllListener.onDeleteAll();
    }

    private void deletePhoneNumber(@NonNull final MobilePhoneInfo mobilePhoneInfo) {
        StringBuilder sb = new StringBuilder("PhoneNumberListAdapter#deletePhoneNumber, prefix: ");
        sb.append(mobilePhoneInfo.mobilePhoneRegionCode);
        sb.append(", phone number: ");
        sb.append(UIUtils.encryptPhoneNumber(mobilePhoneInfo.mobilePhoneNumber));
        ACLog.d(Constants.TAG, sb.toString());
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    UserPhoneRequest userPhoneRequest = new UserPhoneRequest();
                    userPhoneRequest.mobilePhoneNumber = mobilePhoneInfo.mobilePhoneNumber;
                    userPhoneRequest.mobilePhoneRegionCode = mobilePhoneInfo.mobilePhoneRegionCode;
                    BaseRpcResult delete = ((PhoneNumberFacade) RPCProxyHost.getInterfaceProxy(PhoneNumberFacade.class, "ac_biz")).delete(userPhoneRequest);
                    MonitorUtil.monitorRPC(PhoneNumberFacade.OPERATION_TYPE_DELETE, SystemClock.elapsedRealtime() - elapsedRealtime, delete);
                    if (delete == null) {
                        ACLog.e(Constants.TAG, "PhoneNumberListAdapter#deletePhoneNumber, rpc result is null");
                    } else if (!delete.success) {
                        StringBuilder sb = new StringBuilder("PhoneNumberListAdapter#deletePhoneNumber, rpc result fail, error: ");
                        sb.append(delete.errorCode);
                        sb.append(", errorMessage: ");
                        sb.append(delete.errorMessage);
                        ACLog.e(Constants.TAG, sb.toString());
                    } else {
                        ACLog.d(Constants.TAG, "PhoneNumberListAdapter#deletePhoneNumber, rpc result success");
                    }
                } catch (Throwable th) {
                    ACLog.e(Constants.TAG, "PhoneNumberListAdapter#deletePhoneNumber,rpc error: ".concat(String.valueOf(th)));
                }
            }
        });
    }

    static class ViewHolder {
        TextView deleteText;
        TextView phoneNumText;
        ImageView selectedFlag;

        private ViewHolder() {
        }
    }
}
