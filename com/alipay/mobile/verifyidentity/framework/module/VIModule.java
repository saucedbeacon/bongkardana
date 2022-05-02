package com.alipay.mobile.verifyidentity.framework.module;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.base.log.VILog;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.VIRespone;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.base.product.ProductAssembly;
import com.alipay.mobile.verifyidentity.base.product.ProductAssemblyManager;

public class VIModule {
    public static final String TAG = VIModule.class.getSimpleName();
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public Message message;
    /* access modifiers changed from: private */
    public ProductAssembly productAssembly;

    public interface Callback {
        void onAction(String str);

        void onResult(IProduct iProduct, VIRespone vIRespone);
    }

    public void stop() {
    }

    public VIModule(Context context2, Message message2) {
        this.context = context2;
        this.message = message2;
    }

    public void setProductAssembly(ProductAssembly productAssembly2) {
        this.productAssembly = productAssembly2;
    }

    /* access modifiers changed from: private */
    public IProduct createProduct(String str) {
        VILog.i(TAG, "create product ".concat(String.valueOf(str)));
        try {
            Class<?> cls = Class.forName(str);
            if (cls != null) {
                return (IProduct) cls.newInstance();
            }
            return null;
        } catch (Throwable th) {
            VILog.e(TAG, th);
            return null;
        }
    }

    public void start(final Callback callback) {
        ProductAssembly productAssembly2 = this.productAssembly;
        if (productAssembly2 == null) {
            if (callback != null) {
                VILog.e(TAG, "not found product");
                callback.onResult((IProduct) null, new VIRespone(1008));
            }
        } else if (productAssembly2.number() > 0) {
            IProduct createProduct = createProduct(this.productAssembly.getFirstProduct());
            if (createProduct != null) {
                createProduct.startProduct(this.context, this.message, new IProduct.ICallback() {
                    public void onAction(String str) {
                        Callback callback = callback;
                        if (callback != null) {
                            callback.onAction(str);
                        }
                    }

                    public void onResult(IProduct iProduct, VIRespone vIRespone) {
                        if (vIRespone.getResult() == 1000) {
                            if (VIModule.this.productAssembly.getProcessType() != ProductAssembly.ProcessType.AND) {
                                Callback callback = callback;
                                if (callback != null) {
                                    callback.onResult(iProduct, vIRespone);
                                }
                            } else if (VIModule.this.productAssembly.getNextProduct() != null && !VIModule.this.productAssembly.getNextProduct().isEmpty()) {
                                VIModule vIModule = VIModule.this;
                                IProduct access$100 = vIModule.createProduct(vIModule.productAssembly.getNextProduct());
                                if (access$100 != null) {
                                    access$100.startProduct(VIModule.this.context, VIModule.this.message, this);
                                    return;
                                }
                                String str = VIModule.TAG;
                                StringBuilder sb = new StringBuilder("no exist this prodct:");
                                sb.append(VIModule.this.productAssembly.getFirstProduct());
                                VILog.e(str, sb.toString());
                                Callback callback2 = callback;
                                if (callback2 != null) {
                                    callback2.onResult(iProduct, new VIRespone(1008));
                                }
                            }
                        } else if (VIModule.this.productAssembly.getProcessType() != ProductAssembly.ProcessType.OR) {
                            Callback callback3 = callback;
                            if (callback3 != null) {
                                callback3.onResult(iProduct, vIRespone);
                            }
                        } else if (VIModule.this.productAssembly.getNextProduct() == null || VIModule.this.productAssembly.getNextProduct().isEmpty()) {
                            Callback callback4 = callback;
                            if (callback4 != null) {
                                callback4.onResult(iProduct, vIRespone);
                            }
                        } else {
                            VIModule vIModule2 = VIModule.this;
                            IProduct access$1002 = vIModule2.createProduct(vIModule2.productAssembly.getNextProduct());
                            if (access$1002 != null) {
                                access$1002.startProduct(VIModule.this.context, VIModule.this.message, this);
                                return;
                            }
                            String str2 = VIModule.TAG;
                            StringBuilder sb2 = new StringBuilder("no exist this prodct:");
                            sb2.append(VIModule.this.productAssembly.getFirstProduct());
                            VILog.e(str2, sb2.toString());
                            Callback callback5 = callback;
                            if (callback5 != null) {
                                callback5.onResult(iProduct, new VIRespone(1008));
                            }
                        }
                    }
                });
                return;
            }
            String str = TAG;
            StringBuilder sb = new StringBuilder("no exist this prodct:");
            sb.append(this.productAssembly.getFirstProduct());
            VILog.e(str, sb.toString());
            if (callback != null) {
                callback.onResult(createProduct, new VIRespone(1008));
            }
        }
    }

    public String getEnvInfo(String str) {
        ProductAssembly productAssembly2 = this.productAssembly;
        return (productAssembly2 == null || productAssembly2.getEnvInfo() == null) ? "" : this.productAssembly.getEnvInfo().getEnvInfo(this.context, str);
    }

    public static class Builder {
        public VIModule create(Context context, Message message) {
            if (message == null) {
                return null;
            }
            String productCode = message.getProductCode();
            message.getNextStep();
            String nextStep = message.getNextStep();
            if (TextUtils.isEmpty(productCode)) {
                productCode = nextStep;
            }
            ProductAssembly productAssembly = ProductAssemblyManager.getProductAssembly(productCode);
            VIModule vIModule = new VIModule(context, message);
            vIModule.setProductAssembly(productAssembly);
            return vIModule;
        }

        public VIModule create(Context context, String str) {
            if (str == null) {
                return null;
            }
            ProductAssembly productAssembly = ProductAssemblyManager.getProductAssembly(str);
            VIModule vIModule = new VIModule(context, (Message) null);
            vIModule.setProductAssembly(productAssembly);
            return vIModule;
        }
    }
}
