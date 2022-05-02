package net.sqlcipher;

import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;

public class DefaultCursorWindowAllocation implements CursorWindowAllocation {
    private long WindowAllocationUnbounded = 0;
    private long initialAllocationSize = ConvertUtils.MB;

    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    public long getGrowthPaddingSize() {
        return this.initialAllocationSize;
    }

    public long getMaxAllocationSize() {
        return this.WindowAllocationUnbounded;
    }
}
