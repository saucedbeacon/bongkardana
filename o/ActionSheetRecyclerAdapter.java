package o;

import android.content.Context;
import android.graphics.Bitmap;
import id.dana.lib.drawbitmap.invoice.CreateInvoiceResultHandler;
import id.dana.lib.drawbitmap.invoice.DrawInvoice;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import o.GetAppInfoBridgeExtension;
import o.TitleBarRightButtonView;

public interface ActionSheetRecyclerAdapter {
    void setMin(String str);

    public class OnItemClickListener {
        /* access modifiers changed from: private */
        public Context context;
        /* access modifiers changed from: private */
        public String filenamePrefix;
        /* access modifiers changed from: private */
        public String imageFormat;

        public OnItemClickListener(Context context2, String str, String str2) {
            this.context = context2;
            this.filenamePrefix = str;
            this.imageFormat = str2;
        }

        public TitleBarRightButtonView.AnonymousClass1<String> saveToInternalStorage(final Bitmap bitmap) {
            return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable<String>() {
                public final String call() {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    File min = setLeftSelectedIndex.setMin(OnItemClickListener.this.context);
                    if (!setLeftSelectedIndex.getMax(min.getAbsolutePath())) {
                        setLeftSelectedIndex.getMin(min.getAbsolutePath());
                    }
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(OnItemClickListener.this.filenamePrefix);
                        sb.append(currentTimeMillis);
                        sb.append(OnItemClickListener.this.imageFormat);
                        File file = new File(min, sb.toString());
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file.getPath();
                    } catch (IOException unused) {
                        return null;
                    }
                }
            }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.setMin());
        }
    }

    public class ActionSheetViewHolder {
        private static final String FILE_NAME_FORMAT = "dana_invoice_";
        /* access modifiers changed from: private */
        public setMax builder;
        /* access modifiers changed from: private */
        public OnItemClickListener saveBitmapImage;

        private ActionSheetViewHolder(setMax setmax) {
            this.builder = setmax;
            this.saveBitmapImage = new OnItemClickListener(setmax.context, FILE_NAME_FORMAT, ".png");
        }

        public void draw() {
            new DrawInvoice(this.builder.context, this.builder.pageTitle, this.builder.headerEntity, this.builder.orderDetailEntity, this.builder.paymentMethodEntity, this.builder.priceDetailEntity, this.builder.summaryEntity, this.builder.transactionDetailEntity).constructInvoice().flatMap(new RedDotDrawable<Bitmap, TitleBarRightButtonView.AnonymousClass4<? extends String>>() {
                public final TitleBarRightButtonView.AnonymousClass4<? extends String> apply(Bitmap bitmap) throws Exception {
                    return ActionSheetViewHolder.this.saveBitmapImage.saveToInternalStorage(bitmap);
                }
            }).subscribe(new atlasEncryptString<String>() {
                public void onComplete() {
                }

                public void onNext(String str) {
                    ActionSheetViewHolder.this.builder.handler.onResult(str);
                }

                public void onError(Throwable th) {
                    ActionSheetViewHolder.this.builder.handler.onError(th);
                }
            });
        }

        public static class setMax {
            /* access modifiers changed from: private */
            public final Context context;
            /* access modifiers changed from: private */
            public CreateInvoiceResultHandler handler;
            /* access modifiers changed from: private */
            public fetchAppInfoListByKeyword headerEntity;
            /* access modifiers changed from: private */
            public GetAppInfoBridgeExtension.AnonymousClass2 orderDetailEntity;
            /* access modifiers changed from: private */
            public String pageTitle;
            /* access modifiers changed from: private */
            public updateClientApp paymentMethodEntity;
            /* access modifiers changed from: private */
            public List<registerUpdateManager> priceDetailEntity;
            /* access modifiers changed from: private */
            public MiniProgramBridgeExtension summaryEntity;
            /* access modifiers changed from: private */
            public List<navigateToMiniProgram> transactionDetailEntity;

            public setMax(Context context2) {
                this.context = context2;
            }

            public setMax setPageTitle(String str) {
                this.pageTitle = str;
                return this;
            }

            public setMax setHeaderEntity(fetchAppInfoListByKeyword fetchappinfolistbykeyword) {
                this.headerEntity = fetchappinfolistbykeyword;
                return this;
            }

            public setMax setOrderDetailEntity(GetAppInfoBridgeExtension.AnonymousClass2 r1) {
                this.orderDetailEntity = r1;
                return this;
            }

            public setMax setPaymentMethodEntity(updateClientApp updateclientapp) {
                this.paymentMethodEntity = updateclientapp;
                return this;
            }

            public setMax setPriceDetailEntity(List<registerUpdateManager> list) {
                this.priceDetailEntity = list;
                return this;
            }

            public setMax setSummaryEntity(MiniProgramBridgeExtension miniProgramBridgeExtension) {
                this.summaryEntity = miniProgramBridgeExtension;
                return this;
            }

            public setMax setTransactionDetailEntity(List<navigateToMiniProgram> list) {
                this.transactionDetailEntity = list;
                return this;
            }

            public setMax setResultHandler(CreateInvoiceResultHandler createInvoiceResultHandler) {
                this.handler = createInvoiceResultHandler;
                return this;
            }

            public ActionSheetViewHolder build() {
                return new ActionSheetViewHolder(this);
            }
        }
    }
}
