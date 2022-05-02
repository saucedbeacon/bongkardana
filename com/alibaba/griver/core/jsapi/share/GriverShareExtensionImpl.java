package com.alibaba.griver.core.jsapi.share;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.api.ui.share.BaseShareItem;
import com.alibaba.griver.api.ui.share.GriverShareExtension;
import com.alibaba.griver.api.ui.share.ShareParam;
import com.alibaba.griver.api.ui.share.ShareResultListener;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.ui.widget.GriverBottomPopupDialog;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.jsapi.share.ui.ShareRecyclerAdapter;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import java.util.List;
import o.dispatchMenuItemSelected;

@Keep
public class GriverShareExtensionImpl implements GriverShareExtension {
    private static final String TAG = "CustomShareExtensionImpl";
    private RecyclerView channelRecyclerView;
    private ShareRecyclerAdapter shareRecyclerAdapter;

    public void startShare(ShareParam shareParam, List<BaseShareItem> list, final ShareResultListener shareResultListener) {
        View inflate = LayoutInflater.from(shareParam.activity).inflate(R.layout.griver_core_window_share, (ViewGroup) null);
        this.channelRecyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(shareParam.activity);
        linearLayoutManager.setOrientation(0);
        this.channelRecyclerView.setLayoutManager(linearLayoutManager);
        this.channelRecyclerView.setItemAnimator(new dispatchMenuItemSelected());
        final GriverBottomPopupDialog griverBottomPopupDialog = new GriverBottomPopupDialog(shareParam.activity, inflate);
        griverBottomPopupDialog.show();
        griverBottomPopupDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                GriverLogger.d(GriverShareExtensionImpl.TAG, "share canceled");
                shareResultListener.cancel();
            }
        });
        inflate.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                griverBottomPopupDialog.dismiss();
                shareResultListener.cancel();
            }
        });
        ShareRecyclerAdapter shareRecyclerAdapter2 = new ShareRecyclerAdapter(shareParam.activity, list);
        this.shareRecyclerAdapter = shareRecyclerAdapter2;
        this.channelRecyclerView.setAdapter(shareRecyclerAdapter2);
        final List<BaseShareItem> list2 = list;
        final ShareParam shareParam2 = shareParam;
        final ShareResultListener shareResultListener2 = shareResultListener;
        this.shareRecyclerAdapter.setOnItemClickListener(new OnItemClickListener() {
            public void onClick(View view, int i) {
                griverBottomPopupDialog.dismiss();
                ((BaseShareItem) list2.get(i)).onShare(shareParam2, new ShareResultListener() {
                    public void success(String str) {
                        shareResultListener2.success(str);
                    }

                    public void cancel() {
                        shareResultListener2.cancel();
                    }

                    public void fail(String str, String str2, String str3) {
                        shareResultListener2.fail(str, str2, str3);
                    }
                });
            }
        });
    }
}
