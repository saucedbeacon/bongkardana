package id.dana.lib.drawbitmap.invoice;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import o.GetAppInfoBridgeExtension;
import o.MiniProgramBridgeExtension;
import o.dispatchOnCancelled;
import o.fetchAppInfoListByKeyword;
import o.navigateToMiniProgram;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.registerUpdateManager;
import o.updateClientApp;

public class InvoiceActivity extends AppCompatActivity {
    public static final byte[] getMax = {Ascii.SO, -63, 78, 54, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 60;
    private fetchAppInfoListByKeyword header;
    private GetAppInfoBridgeExtension.AnonymousClass2 orderDetail;
    private updateClientApp paymentMethod;
    private List<registerUpdateManager> priceDetails;
    private MiniProgramBridgeExtension summary;
    private List<navigateToMiniProgram> transactionDetails;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, short r7, int r8) {
        /*
            byte[] r0 = getMax
            int r6 = r6 * 165
            int r6 = r6 + 11
            int r8 = r8 * 175
            int r8 = 179 - r8
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0033
        L_0x001a:
            r3 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x001e:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0029:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0033:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r0 + 1
            int r8 = r8 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.drawbitmap.invoice.InvoiceActivity.setMax(int, short, int):java.lang.String");
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = getMax;
        String max = setMax((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = getMax;
        String max2 = setMax((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-29041944, oncanceled);
            onCancelLoad.getMin(-29041944, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-29041944, oncanceled2);
            onCancelLoad.getMin(-29041944, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-29041944, oncanceled3);
            onCancelLoad.getMin(-29041944, oncanceled3);
        }
        super.onCreate(bundle);
        mock();
    }

    private void mock() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1235003083, oncanceled);
            onCancelLoad.getMin(1235003083, oncanceled);
        }
        fetchAppInfoListByKeyword fetchappinfolistbykeyword = new fetchAppInfoListByKeyword();
        this.header = fetchappinfolistbykeyword;
        fetchappinfolistbykeyword.setAmount("Rp50.000");
        this.header.setDesc("Anda telah berhasil membeli Pulsa");
        this.header.setDate("13 Maret 2019");
        this.header.setTime("12:30");
        this.priceDetails = new ArrayList();
        registerUpdateManager registerupdatemanager = new registerUpdateManager();
        registerupdatemanager.setAmount("Rp1.500");
        registerupdatemanager.setTitle("Total");
        registerupdatemanager.setType("addition");
        this.priceDetails.add(registerupdatemanager);
        registerUpdateManager registerupdatemanager2 = new registerUpdateManager();
        registerupdatemanager2.setAmount("Rp500");
        registerupdatemanager2.setTitle("promo");
        registerupdatemanager2.setType("addition");
        this.priceDetails.add(registerupdatemanager2);
        registerUpdateManager registerupdatemanager3 = new registerUpdateManager();
        registerupdatemanager3.setAmount("Rp1.000");
        registerupdatemanager3.setTitle("fee");
        registerupdatemanager3.setType("deduction");
        this.priceDetails.add(registerupdatemanager3);
        MiniProgramBridgeExtension.setMax setmax = new MiniProgramBridgeExtension.setMax();
        setmax.setStatus("SUCCESS");
        setmax.setTitle("Order Berhasil");
        MiniProgramBridgeExtension miniProgramBridgeExtension = new MiniProgramBridgeExtension();
        this.summary = miniProgramBridgeExtension;
        miniProgramBridgeExtension.setTitle("Indosat 50.000 - 081289811245");
        this.summary.setBizType("PULSA");
        this.summary.setDesc("Rp200.000 to Ricky Contesso");
        MiniProgramBridgeExtension.length length = new MiniProgramBridgeExtension.length();
        length.setTitle("Nomor Token");
        length.setValue("0041 0021 0051 8027");
        this.summary.setExtInfo(length);
        this.summary.setIconUrl("");
        this.summary.setOrderStatus(setmax);
        GetAppInfoBridgeExtension.AnonymousClass2 r0 = new Object() {
            private List<setMin> data;
            private String number;
            private String title;

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public String getNumber() {
                return this.number;
            }

            public void setNumber(String str) {
                this.number = str;
            }

            public List<setMin> getData() {
                return this.data;
            }

            public void setData(List<setMin> list) {
                this.data = list;
            }

            /* renamed from: o.GetAppInfoBridgeExtension$2$setMin */
            public static class setMin {
                private String title;
                private String value;

                public final String getTitle() {
                    return this.title;
                }

                public final void setTitle(String str) {
                    this.title = str;
                }

                public final String getValue() {
                    return this.value;
                }

                public final void setValue(String str) {
                    this.value = str;
                }
            }
        };
        this.orderDetail = r0;
        r0.setTitle("No. Invoice");
        this.orderDetail.setNumber("INV/20170605/XVII/VI/86428176");
        ArrayList arrayList = new ArrayList();
        GetAppInfoBridgeExtension.AnonymousClass2.setMin setmin = new GetAppInfoBridgeExtension.AnonymousClass2.setMin();
        setmin.setTitle("Nomor HP");
        setmin.setValue("082145377771");
        arrayList.add(setmin);
        GetAppInfoBridgeExtension.AnonymousClass2.setMin setmin2 = new GetAppInfoBridgeExtension.AnonymousClass2.setMin();
        setmin2.setTitle("Paket Data");
        setmin2.setValue("50.000");
        arrayList.add(setmin2);
        GetAppInfoBridgeExtension.AnonymousClass2.setMin setmin3 = new GetAppInfoBridgeExtension.AnonymousClass2.setMin();
        setmin3.setTitle("Nomor HP");
        setmin3.setValue("082145377771");
        arrayList.add(setmin3);
        GetAppInfoBridgeExtension.AnonymousClass2.setMin setmin4 = new GetAppInfoBridgeExtension.AnonymousClass2.setMin();
        setmin4.setTitle("Paket Data");
        setmin4.setValue("50.000");
        arrayList.add(setmin4);
        this.orderDetail.setData(arrayList);
        this.transactionDetails = new ArrayList();
        navigateToMiniProgram navigatetominiprogram = new navigateToMiniProgram();
        navigatetominiprogram.setTitle("ID Transaksi");
        navigatetominiprogram.setValue("2019 0717 6543 2876 9176 0134");
        this.transactionDetails.add(navigatetominiprogram);
        navigateToMiniProgram navigatetominiprogram2 = new navigateToMiniProgram();
        navigatetominiprogram2.setTitle("ID Order Merchant");
        navigatetominiprogram2.setValue("GP0765432107587652820");
        this.transactionDetails.add(navigatetominiprogram2);
        navigateToMiniProgram navigatetominiprogram3 = new navigateToMiniProgram();
        navigatetominiprogram3.setTitle("ID Transaksi");
        navigatetominiprogram3.setValue("2019 0717 6543 2876 9176 0134");
        this.transactionDetails.add(navigatetominiprogram3);
        updateClientApp updateclientapp = new updateClientApp();
        this.paymentMethod = updateclientapp;
        updateclientapp.setDesc("Debit BCA (7652)");
        this.paymentMethod.setPaymentIconUrl("");
        this.paymentMethod.setProtectionIconUrl("");
        this.paymentMethod.setTitle("Metode Pembayaran");
    }
}
