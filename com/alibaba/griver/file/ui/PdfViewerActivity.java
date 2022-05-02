package com.alibaba.griver.file.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.file.R;
import com.alibaba.griver.file.pdf.PdfImageSource;
import com.alibaba.griver.file.pdf.PdfSourceManager;
import com.alibaba.griver.ui.ant.AUTitleBar;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchMenuItemSelected;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class PdfViewerActivity extends Activity {
    public static final int getMax = 235;
    public static final byte[] length = {51, -88, 4, -115, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f9094a;
    private ProgressDialog b;
    private AUTitleBar c;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 165
            int r8 = r8 + 11
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r6 = r6 + 4
            byte[] r0 = length
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x002f
        L_0x0018:
            r3 = 0
        L_0x0019:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L_0x0028
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0028:
            byte r3 = r0[r6]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r1
            r1 = r5
        L_0x002f:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.file.ui.PdfViewerActivity.setMax(int, byte, short):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte[] bArr = length;
        byte b2 = (byte) bArr[96];
        String max = setMax((short) bArr[85], b2, (byte) b2);
        byte b3 = (byte) length[8];
        String max2 = setMax(174, b3, (byte) b3);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(167579983, oncanceled);
            onCancelLoad.getMin(167579983, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(167579983, oncanceled2);
            onCancelLoad.getMin(167579983, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(167579983, oncanceled3);
            onCancelLoad.getMin(167579983, oncanceled3);
        }
        super.onCreate(bundle);
        try {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.b = progressDialog;
            progressDialog.show();
            setContentView(R.layout.griver_file_activity_page_list);
            AUTitleBar aUTitleBar = (AUTitleBar) findViewById(R.id.title_bar);
            this.c = aUTitleBar;
            aUTitleBar.setTitleText(getString(R.string.griver_open_document));
            this.f9094a = getIntent().getStringExtra("filePath");
            if (!PermissionUtils.hasPermission("android.permission.READ_EXTERNAL_STORAGE")) {
                PermissionUtils.requestPermission("android.permission.READ_EXTERNAL_STORAGE", 2001, new IPermissionRequestCallback() {
                    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                        GriverLogger.d("PdfViewerActivity", "receive request permission result");
                        if (PermissionUtils.positivePermissionResult(iArr)) {
                            PdfViewerActivity.this.a();
                            return;
                        }
                        PdfViewerActivity.this.b();
                        ToastUtils.showToast(GriverEnv.getApplicationContext(), PdfViewerActivity.this.getString(R.string.griver_lack_read_external_perission), 0);
                    }
                });
            } else {
                a();
            }
        } catch (Exception e) {
            GriverLogger.e("PdfViewerActivity", "view pdf error", e);
            b();
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        ZoomRecyclerView zoomRecyclerView = (ZoomRecyclerView) findViewById(R.id.list);
        zoomRecyclerView.setEnableScale(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        zoomRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        zoomRecyclerView.setAdapter(new PageAdapter());
        zoomRecyclerView.addItemDecoration(new DividerGridItemDecoration());
        zoomRecyclerView.setItemAnimator(new dispatchMenuItemSelected());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        PdfSourceManager.getInstance().destory(this.f9094a);
    }

    /* access modifiers changed from: private */
    public void b() {
        ProgressDialog progressDialog = this.b;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.b.dismiss();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 964543905 == (max = dispatchOnCancelled.getMax(applicationContext, 964543905)))) {
            onCanceled oncanceled = new onCanceled(964543905, max, 512);
            onCancelLoad.setMax(964543905, oncanceled);
            onCancelLoad.getMin(964543905, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(964543905, oncanceled2);
            onCancelLoad.getMin(964543905, oncanceled2);
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        RVNativePermissionRequestProxy rVNativePermissionRequestProxy = (RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class);
        if (rVNativePermissionRequestProxy != null) {
            rVNativePermissionRequestProxy.onRequestPermissionResult(i, strArr, iArr);
        }
    }

    class PageAdapter extends RecyclerView.Adapter<PageImageHolder> {

        /* renamed from: a  reason: collision with root package name */
        private Activity f10436a;
        /* access modifiers changed from: private */
        public PdfImageSource b;

        public PageAdapter() {
            this.f10436a = PdfViewerActivity.this;
            new Thread(PdfViewerActivity.this) {
                public void run() {
                    PdfImageSource unused = PageAdapter.this.b = PdfSourceManager.getInstance().getOrCreate(PdfViewerActivity.this.f9094a);
                    PdfViewerActivity.this.b();
                    PageAdapter.this.a();
                }
            }.start();
        }

        /* access modifiers changed from: private */
        public void a() {
            PdfViewerActivity.this.runOnUiThread(new Runnable() {
                public void run() {
                    PageAdapter.this.notifyDataSetChanged();
                }
            });
        }

        @NonNull
        public PageImageHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new PageImageHolder(LayoutInflater.from(this.f10436a).inflate(R.layout.griver_file_item_page_image, viewGroup, false));
        }

        public void onBindViewHolder(@NonNull PageImageHolder pageImageHolder, int i) {
            pageImageHolder.bindData(this.b.getItem(i), i, this.b.getTotalCount());
        }

        public int getItemCount() {
            PdfImageSource pdfImageSource = this.b;
            if (pdfImageSource == null) {
                return 0;
            }
            return pdfImageSource.getTotalCount();
        }

        public class PageImageHolder extends RecyclerView.valueOf {

            /* renamed from: a  reason: collision with root package name */
            private ImageView f10437a;
            private TextView b;

            public PageImageHolder(View view) {
                super(view);
                this.f10437a = (ImageView) view.findViewById(R.id.page);
                this.b = (TextView) view.findViewById(R.id.page_index);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                double d = (double) i;
                Double.isNaN(d);
                int i2 = (int) (d * 1.42d);
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
            }

            public void bindData(Bitmap bitmap, int i, int i2) {
                ViewGroup.LayoutParams layoutParams = this.f10437a.getLayoutParams();
                double d = (double) layoutParams.width;
                Double.isNaN(d);
                layoutParams.height = (int) (d * 1.42d);
                this.f10437a.setImageBitmap(bitmap);
                this.b.setText(String.format("%d/%d", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}));
            }
        }
    }

    public class DividerGridItemDecoration extends RecyclerView.getMax {
        public DividerGridItemDecoration() {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            super.getItemOffsets(rect, view, recyclerView, recyclerView$Mean$Arithmetic);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            super.onDraw(canvas, recyclerView, recyclerView$Mean$Arithmetic);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            super.onDrawOver(canvas, recyclerView, recyclerView$Mean$Arithmetic);
        }
    }
}
