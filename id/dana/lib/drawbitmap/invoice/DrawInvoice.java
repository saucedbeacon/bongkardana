package id.dana.lib.drawbitmap.invoice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import java.util.List;
import java.util.concurrent.Callable;
import o.GetAppInfoBridgeExtension;
import o.MiniProgramBridgeExtension;
import o.RedDotDrawable;
import o.TabBarBridgeExtension;
import o.TitleBarRightButtonView;
import o.fetchAppInfoListByKeyword;
import o.getRunScene;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.hideTabBar;
import o.navigateBackMiniProgram;
import o.navigateToMiniProgram;
import o.registerUpdateManager;
import o.setTabBar;
import o.showTabBar;
import o.updateClientApp;

public class DrawInvoice extends View {
    /* access modifiers changed from: private */
    public Canvas canvas;
    private Context context;
    /* access modifiers changed from: private */
    public GetAppInfoBridgeExtension drawHeader;
    /* access modifiers changed from: private */
    public getRunScene drawOrderDetail;
    /* access modifiers changed from: private */
    public navigateBackMiniProgram drawPaymentMethod;
    /* access modifiers changed from: private */
    public TabBarBridgeExtension drawPriceDetail;
    /* access modifiers changed from: private */
    public hideTabBar drawSummary;
    /* access modifiers changed from: private */
    public showTabBar drawTransactionDetail;
    /* access modifiers changed from: private */
    public setTabBar drawWrapper;
    private int fixedHeight;
    private fetchAppInfoListByKeyword headerEntity;
    private GetAppInfoBridgeExtension.AnonymousClass2 orderDetailEntity;
    private String pageTitle;
    private updateClientApp paymentMethodEntity;
    private List<registerUpdateManager> priceDetailEntity;
    /* access modifiers changed from: private */
    public Bitmap returnedBitmap;
    private MiniProgramBridgeExtension summaryEntity;
    private List<navigateToMiniProgram> transactionDetailEntity;

    public DrawInvoice(Context context2) {
        super(context2);
        this.context = context2;
        initComponent();
    }

    private void initComponent() {
        setTabBar settabbar = new setTabBar(this.context, this.pageTitle);
        this.drawWrapper = settabbar;
        settabbar.setFirstY(0);
        GetAppInfoBridgeExtension getAppInfoBridgeExtension = new GetAppInfoBridgeExtension(this.context, this.headerEntity);
        this.drawHeader = getAppInfoBridgeExtension;
        getAppInfoBridgeExtension.setFirstY(this.drawWrapper.getLastY());
        TabBarBridgeExtension tabBarBridgeExtension = new TabBarBridgeExtension(this.context, this.priceDetailEntity);
        this.drawPriceDetail = tabBarBridgeExtension;
        tabBarBridgeExtension.setFirstY(this.drawHeader.getLastY());
        hideTabBar hidetabbar = new hideTabBar(this.context, this.summaryEntity);
        this.drawSummary = hidetabbar;
        hidetabbar.setFirstY(this.drawPriceDetail.getLastY());
        getRunScene getrunscene = new getRunScene(this.context, this.orderDetailEntity);
        this.drawOrderDetail = getrunscene;
        getrunscene.setFirstY(this.drawSummary.getLastY());
        showTabBar showtabbar = new showTabBar(this.context, this.transactionDetailEntity);
        this.drawTransactionDetail = showtabbar;
        showtabbar.setFirstY(this.drawOrderDetail.getLastY());
        navigateBackMiniProgram navigatebackminiprogram = new navigateBackMiniProgram(this.context, this.paymentMethodEntity);
        this.drawPaymentMethod = navigatebackminiprogram;
        navigatebackminiprogram.setFirstY(this.drawTransactionDetail.getLastY());
        int lastY = this.drawPaymentMethod.getLastY() + 100;
        this.fixedHeight = lastY;
        this.drawWrapper.setWrapperHeight(lastY);
    }

    public DrawInvoice(Context context2, String str, fetchAppInfoListByKeyword fetchappinfolistbykeyword, GetAppInfoBridgeExtension.AnonymousClass2 r4, updateClientApp updateclientapp, List<registerUpdateManager> list, MiniProgramBridgeExtension miniProgramBridgeExtension, List<navigateToMiniProgram> list2) {
        super(context2);
        this.context = context2;
        this.pageTitle = str;
        this.headerEntity = fetchappinfolistbykeyword;
        this.orderDetailEntity = r4;
        this.paymentMethodEntity = updateclientapp;
        this.priceDetailEntity = list;
        this.summaryEntity = miniProgramBridgeExtension;
        this.transactionDetailEntity = list2;
        initComponent();
        this.returnedBitmap = Bitmap.createBitmap(750, this.fixedHeight + BlobStatic.MONITOR_IMAGE_WIDTH, Bitmap.Config.ARGB_8888);
        this.canvas = new Canvas(this.returnedBitmap);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas2) {
        canvas2.save();
        this.canvas = canvas2;
    }

    public TitleBarRightButtonView.AnonymousClass1<Bitmap> constructInvoice() {
        return drawWrapper().flatMap(new RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Integer>>() {
            public final TitleBarRightButtonView.AnonymousClass4<? extends Integer> apply(Integer num) throws Exception {
                return DrawInvoice.this.drawHeader(num.intValue());
            }
        }).flatMap(new RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Integer>>() {
            public final TitleBarRightButtonView.AnonymousClass4<? extends Integer> apply(Integer num) throws Exception {
                return DrawInvoice.this.drawPriceDetail(num.intValue());
            }
        }).flatMap(new RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Integer>>() {
            public final TitleBarRightButtonView.AnonymousClass4<? extends Integer> apply(Integer num) throws Exception {
                return DrawInvoice.this.drawSummary(num.intValue());
            }
        }).flatMap(new RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Integer>>() {
            public final TitleBarRightButtonView.AnonymousClass4<? extends Integer> apply(Integer num) throws Exception {
                return DrawInvoice.this.drawOrderDetail(num.intValue());
            }
        }).flatMap(new RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Integer>>() {
            public final TitleBarRightButtonView.AnonymousClass4<? extends Integer> apply(Integer num) throws Exception {
                return DrawInvoice.this.drawTransactionDetail(num.intValue());
            }
        }).flatMap(new RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Integer>>() {
            public final TitleBarRightButtonView.AnonymousClass4<? extends Integer> apply(Integer num) throws Exception {
                return DrawInvoice.this.drawPaymentMethod(num.intValue());
            }
        }).map(new RedDotDrawable<Integer, Bitmap>() {
            public final Bitmap apply(Integer num) throws Exception {
                return DrawInvoice.this.returnedBitmap;
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    private TitleBarRightButtonView.AnonymousClass1<Integer> drawWrapper() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable<Integer>() {
            public final Integer call() throws Exception {
                DrawInvoice.this.drawWrapper.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawWrapper.constructWrapper();
                return Integer.valueOf(DrawInvoice.this.drawWrapper.getLastY());
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return 0;
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Integer> drawHeader(final int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable<Integer>() {
            public final Integer call() throws Exception {
                DrawInvoice.this.drawHeader.setFirstY(i);
                DrawInvoice.this.drawHeader.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawHeader.constructHeader();
                return Integer.valueOf(DrawInvoice.this.drawHeader.getLastY());
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return Integer.valueOf(i);
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Integer> drawPriceDetail(final int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable<Integer>() {
            public final Integer call() throws Exception {
                DrawInvoice.this.drawPriceDetail.setFirstY(i);
                DrawInvoice.this.drawPriceDetail.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawPriceDetail.constructPriceDetail();
                return Integer.valueOf(DrawInvoice.this.drawPriceDetail.getLastY());
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return Integer.valueOf(i);
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Integer> drawSummary(final int i) {
        return TitleBarRightButtonView.AnonymousClass1.create(new TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<Integer>() {
            public final void subscribe(TitleBarRightButtonView.AnonymousClass2<Integer> r3) throws Exception {
                DrawInvoice.this.drawSummary.setFirstY(i);
                DrawInvoice.this.drawSummary.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawSummary.constructSummary();
                DrawInvoice.this.drawSummary.setEmitter(r3);
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return Integer.valueOf(i);
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Integer> drawOrderDetail(final int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable<Integer>() {
            public final Integer call() throws Exception {
                DrawInvoice.this.drawOrderDetail.setFirstY(i);
                DrawInvoice.this.drawOrderDetail.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawOrderDetail.constructOrderDetail();
                return Integer.valueOf(DrawInvoice.this.drawOrderDetail.getLastY());
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return Integer.valueOf(i);
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Integer> drawTransactionDetail(final int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable<Integer>() {
            public final Integer call() throws Exception {
                DrawInvoice.this.drawTransactionDetail.setFirstY(i);
                DrawInvoice.this.drawTransactionDetail.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawTransactionDetail.constructTransactionDetail();
                return Integer.valueOf(DrawInvoice.this.drawTransactionDetail.getLastY());
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return Integer.valueOf(i);
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Integer> drawPaymentMethod(final int i) {
        return TitleBarRightButtonView.AnonymousClass1.create(new TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<Integer>() {
            public final void subscribe(TitleBarRightButtonView.AnonymousClass2<Integer> r3) throws Exception {
                DrawInvoice.this.drawPaymentMethod.setFirstY(i);
                DrawInvoice.this.drawPaymentMethod.setCanvas(DrawInvoice.this.canvas);
                DrawInvoice.this.drawPaymentMethod.constructPaymentMethod();
                DrawInvoice.this.drawPaymentMethod.setEmitter(r3);
            }
        }).onErrorReturn(new RedDotDrawable<Throwable, Integer>() {
            public final Integer apply(Throwable th) throws Exception {
                return Integer.valueOf(i);
            }
        }).subscribeOn(hideProgress.length()).observeOn(getSecureSignatureComp.length());
    }
}
