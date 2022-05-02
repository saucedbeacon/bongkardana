package com.alipay.mobile.verifyidentity.business.activity;

import com.alipay.mobile.verifyidentity.base.product.ProductAssembly;
import com.alipay.mobile.verifyidentity.base.product.ProductAssemblyManager;
import java.util.Map;

public class SecVIVerify {
    public static SecTouchInterface secTouchInterface;
    public static SecVINewProductInterface secVINewProductInterface;
    public static SecVIVerifyInterface secVIVerifyInterface;

    public static void setSecVIVerifyInterface(SecVIVerifyInterface secVIVerifyInterface2) {
        secVIVerifyInterface = secVIVerifyInterface2;
    }

    public static SecVIVerifyInterface getSecVIVerifyInterface() {
        return secVIVerifyInterface;
    }

    public static void setSecTouchInterface(SecTouchInterface secTouchInterface2) {
        secTouchInterface = secTouchInterface2;
    }

    public static SecTouchInterface getSecTouchInterface() {
        return secTouchInterface;
    }

    public static void setSecVINewProductInterface(SecVINewProductInterface secVINewProductInterface2) {
        secVINewProductInterface = secVINewProductInterface2;
        addNewProduct(secVINewProductInterface2.secNewProducts());
    }

    public static SecVINewProductInterface getSecVINewProductInterface() {
        return secVINewProductInterface;
    }

    public static void addNewProduct(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                ProductAssembly productAssembly = new ProductAssembly();
                productAssembly.addProduct((String) next.getValue());
                ProductAssemblyManager.addProductAssembly((String) next.getKey(), productAssembly);
            }
        }
    }
}
