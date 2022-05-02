package com.alipay.iap.android.matamata.plugins.file;

import android.content.Context;
import com.alipay.iap.android.matamata.plugins.file.descriptor.DescriptorManager;
import com.alipay.iap.android.matamata.plugins.file.descriptor.Named;
import com.alipay.iap.android.matamata.plugins.file.descriptor.NodeDescriptor;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import java.util.List;
import o.CoordinatorLayout;
import o.dispatchKeyShortcutEvent;
import o.getExtraData;
import org.json.JSONArray;

public class InternalFilesPlugin implements FlipperPlugin {
    private DescriptorManager descriptorManager = new DescriptorManager();
    private dispatchKeyShortcutEvent mConnection;
    /* access modifiers changed from: private */
    public Context mContext;
    private final FlipperReceiver mGetNodes = new FlipperReceiver() {
        public void onReceive(FlipperObject flipperObject, getExtraData getextradata) {
            FlipperArray flipperArray = new FlipperArray((JSONArray) flipperObject.setMax.opt("ids"));
            FlipperArray.getMax getmax = new FlipperArray.getMax();
            int length = flipperArray.setMax.length();
            for (int i = 0; i < length; i++) {
                try {
                    FlipperObject access$100 = InternalFilesPlugin.this.buildFlipperObject(InternalFilesPlugin.this.mNodeTracker.get(flipperArray.setMax.optString(i)));
                    if (access$100 != null) {
                        getmax.getMax.put(access$100 == null ? null : access$100.setMax);
                    }
                } catch (Exception unused) {
                }
            }
            getextradata.setMax(new FlipperObject(new FlipperObject.setMax().getMin("elements", new FlipperArray(getmax.getMax)).getMax));
        }
    };
    private final FlipperReceiver mGetRoot = new FlipperReceiver() {
        public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
            InternalFilesPlugin internalFilesPlugin = InternalFilesPlugin.this;
            getextradata.setMax(internalFilesPlugin.buildFlipperObject(internalFilesPlugin.mContext));
        }
    };
    /* access modifiers changed from: private */
    public NodeTracker mNodeTracker = new NodeTracker();

    public String getId() {
        return "Files";
    }

    public boolean runInBackground() {
        return false;
    }

    public InternalFilesPlugin(Context context) {
        this.mContext = context;
    }

    public void onConnect(dispatchKeyShortcutEvent dispatchkeyshortcutevent) throws Exception {
        this.mConnection = dispatchkeyshortcutevent;
        dispatchkeyshortcutevent.receive("getRoot", this.mGetRoot);
        dispatchkeyshortcutevent.receive("getNodes", this.mGetNodes);
    }

    public void onDisconnect() throws Exception {
        this.mNodeTracker.clear();
        this.mConnection = null;
    }

    /* access modifiers changed from: private */
    public FlipperObject buildFlipperObject(Object obj) throws Exception {
        final NodeDescriptor descriptorFor = this.descriptorManager.getDescriptorFor(obj);
        String id2 = descriptorFor.getId(obj);
        String name = descriptorFor.getName(obj);
        this.mNodeTracker.put(id2, obj);
        FlipperArray.getMax getmax = new FlipperArray.getMax();
        Object[] children = descriptorFor.getChildren(obj);
        if (children != null) {
            for (Object obj2 : children) {
                String id3 = this.descriptorManager.getDescriptorFor(obj2).getId(obj2);
                this.mNodeTracker.put(id3, obj2);
                getmax.getMax.put(id3);
            }
        }
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        final Object obj3 = obj;
        final FlipperObject.setMax setmax2 = setmax;
        new CoordinatorLayout.DispatchChangeEvent(this.mConnection) {
            public void runOrThrow() throws Exception {
                List<Named<FlipperObject>> data = descriptorFor.getData(obj3);
                if (data != null && data.size() > 0) {
                    for (Named next : data) {
                        setmax2.setMax(next.getName(), next.getValue());
                    }
                }
            }
        }.run();
        return new FlipperObject(new FlipperObject.setMax().getMax("name", name).getMax("id", id2).getMin("children", new FlipperArray(getmax.getMax)).setMax("data", new FlipperObject(setmax.getMax)).getMax);
    }
}
