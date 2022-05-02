package in.srain.cube.views.ptr;

import android.content.Context;
import android.util.AttributeSet;

public class PtrClassicFrameLayout extends PtrFrameLayout {
    private PtrClassicDefaultHeader getMin;

    public PtrClassicFrameLayout(Context context) {
        super(context);
        PtrClassicDefaultHeader ptrClassicDefaultHeader = new PtrClassicDefaultHeader(getContext());
        this.getMin = ptrClassicDefaultHeader;
        setHeaderView(ptrClassicDefaultHeader);
        addPtrUIHandler(this.getMin);
    }

    public PtrClassicFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        PtrClassicDefaultHeader ptrClassicDefaultHeader = new PtrClassicDefaultHeader(getContext());
        this.getMin = ptrClassicDefaultHeader;
        setHeaderView(ptrClassicDefaultHeader);
        addPtrUIHandler(this.getMin);
    }

    public PtrClassicFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PtrClassicDefaultHeader ptrClassicDefaultHeader = new PtrClassicDefaultHeader(getContext());
        this.getMin = ptrClassicDefaultHeader;
        setHeaderView(ptrClassicDefaultHeader);
        addPtrUIHandler(this.getMin);
    }

    public PtrClassicDefaultHeader getHeader() {
        return this.getMin;
    }

    public void setLastUpdateTimeKey(String str) {
        PtrClassicDefaultHeader ptrClassicDefaultHeader = this.getMin;
        if (ptrClassicDefaultHeader != null) {
            ptrClassicDefaultHeader.setLastUpdateTimeKey(str);
        }
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        PtrClassicDefaultHeader ptrClassicDefaultHeader = this.getMin;
        if (ptrClassicDefaultHeader != null) {
            ptrClassicDefaultHeader.setLastUpdateTimeRelateObject(obj);
        }
    }
}
