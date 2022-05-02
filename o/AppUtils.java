package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import id.dana.data.userconfig.BiztypeNotFoundException;
import id.dana.domain.bcaoneklik.model.BcaOneKlikInterceptData;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.domain.merchant.MerchantOrder;
import id.dana.domain.version.Version;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppMsgReceiver;
import o.AppNode;
import o.TitleBarRightButtonView;
import o.UpdateAppCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 è\u00012\u00020\u0001:\u0002è\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010$\u001a\u00020\tH\u0016J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0006H\u0016J\u001a\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020+0*0\u0006H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0006H\u0016J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u000e0\u0006H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001a\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002050*0\u0006H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0006H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0006H\u0016J\u0014\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0006H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0006H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0006H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0006H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0006H\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u0006H\u0016J\u0014\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u000e0\u0006H\u0016J\u0014\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0002J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\u00062\u0006\u0010M\u001a\u00020\tH\u0002J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J\u0014\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\u0006H\u0016J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0006H\u0016J\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0006H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u0006H\u0016J\u000e\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u0006H\u0016J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u0006H\u0016J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0006H\u0016J\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\u0006H\u0016J\u001c\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00062\u0006\u0010j\u001a\u00020kH\u0016J\u000e\u0010l\u001a\b\u0012\u0004\u0012\u00020h0\u0006H\u0016J\u000e\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u0006H\u0016J\u000e\u0010o\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000e\u0010p\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u0006H\u0016J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020v0\u00062\u0006\u0010w\u001a\u00020\u0007H\u0016J\u000e\u0010x\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020z0\u00062\u0006\u0010{\u001a\u00020\tH\u0016J\u0014\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u000e\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\u0006H\u0016J\u0014\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\u0006H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u0015\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u0016\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u00062\u0006\u0010M\u001a\u00020\tJ\u0015\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u0016\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u000b0\u0006H\u0016J\u0015\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u001b\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00062\u0006\u0010\u0015\u001a\u00020\tJ\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0006H\u0016J\u001c\u0010\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00010\u0006H\u0016J\u0015\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u0015\u0010 \u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006H\u0016J\u0010\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u00010\u0006H\u0016J\u0016\u0010£\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¤\u00010\u000b0\u0006H\u0016J\u000f\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010¨\u0001\u001a\u000b\u0012\u0005\u0012\u00030©\u0001\u0018\u00010\u0006H\u0016J\u000f\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010­\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001a\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\t\u0010Ä\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u000f\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010×\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ü\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001a\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\t\u0010à\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u000f\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010â\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0015\u0010ä\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0006H\u0016J\u000f\u0010å\u0001\u001a\b\u0012\u0004\u0012\u00020?0\u0006H\u0016J\u0010\u0010æ\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006é\u0001"}, d2 = {"Lid/dana/data/config/source/split/SplitConfigEntityData;", "Lid/dana/data/config/source/ConfigEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "checkVisibilityFeature", "Lio/reactivex/Observable;", "", "name", "", "getAddingNameWhitelistedSubMerchantId", "", "getAmlEddMandatory", "getAndMonitorCertificateWhitelist", "", "getAppVersion", "Lid/dana/domain/version/Version;", "getAppWidgetEnabled", "getBcaOneKlikInterceptConfig", "Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "getBooleanUserTraffic", "splitName", "throwExceptionIfControl", "getBooleanUserTrafficOnceReady", "getBooleanUserTrafficOnceReadyWithFallbackAMCS", "getCategoryExplore", "getCertificatesUrl", "getContactSyncConfig", "Lid/dana/data/config/source/amcs/result/ContactSyncConfigResult;", "getDecodeQrTimeout", "", "getDeeplinkEntries", "Lcom/alibaba/fastjson/JSONObject;", "getDeeplinkFeatureConfigByKeys", "Lid/dana/data/deeplink/repository/source/branch/result/DeepLinkPayloadEntity;", "keys", "url", "getDeeplinkFeatureConfigList", "getDefaultFeedFromConfig", "getDonationCampaignConfig", "Lid/dana/data/config/source/amcs/result/DonationCampaignConfigResult;", "getElectronicMoneyConfig", "", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyConfig;", "getEnableAddNewCard", "getEnableExpressPayInfo", "Lid/dana/domain/featureconfig/model/ExpressPayInfo;", "getExpiryChoice", "Lid/dana/data/config/source/amcs/result/ExpiryInfoResult;", "getFeatureAmlEdd", "getFeatureCameraCard", "getFeatureForcedFirstCard", "getFeatureGlobalSearchCategories", "Lid/dana/domain/featureconfig/model/GlobalSearchCategory;", "getFeaturePromoAds", "Lid/dana/data/config/model/PromoAdsConfigResponse;", "getFeatureReferralEngagementDialogConfig", "Lid/dana/data/referral/source/network/result/ReferralEngagementDialogConfigEntity;", "getFeatureSkipButtonMerchantList", "getFeedConfig", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "getFeedHomeConfig", "getFeedVersionConfig", "", "getFeedbackConfigInfo", "Lid/dana/domain/featureconfig/model/FeedBackConfigInfo;", "getFriendshipEmojiList", "Lorg/json/JSONObject;", "getFriendshipSyncProgressInterval", "getGeofenceConfig", "Lid/dana/data/config/source/amcs/result/GeofenceConfigResult;", "getGlobalSearchConfig", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "getGnBindingBenefits", "Lid/dana/data/config/model/BindingBenefitEntity;", "getGnBindingBenefitsKey", "getGnDetailBindingBenefit", "key", "getH5Entries", "getHomeBannerDefaultContent", "getInterstitialBannerConfig", "Lid/dana/data/config/source/amcs/result/InterstitialBannerConfigResult;", "getJSONObject", "getMaxBankAccount", "getMaxContactPerBatch", "getMaxRecentBank", "getMaxRecentContact", "getMaxRecentRecipient", "getMaxSavedBank", "getMerchantCategories", "getMerchantOrder", "Lorg/json/JSONArray;", "getMerchantSubcategories", "getMerchantTopups", "getNearbyAutoSearchConfig", "Lid/dana/domain/nearbyme/model/NearbyAutoSearchConfig;", "getNearbyConfig", "Lid/dana/data/config/source/amcs/result/NearbyConfigResult;", "getNearbyMeFeature", "getNearbyMeMapViewFeature", "getNearbyRankingConfig", "Lid/dana/domain/nearbyme/model/NearbyRankingConfig;", "getNearbyRankingConfigV2", "getNewMerchantCategories", "Lid/dana/data/config/source/amcs/result/MerchantCategoryContentResult;", "getNewMerchantCategoryOrder", "merchantCategoryType", "Lid/dana/domain/merchant/MerchantCategoryType;", "getNewMerchantSubCategories", "getOTCExpiryConfig", "Lid/dana/data/config/source/amcs/result/OTCAcceptExpiryTimeConfigResult;", "getPinningMode", "getPlayStoreReviewFeature", "getProfileCompletionWidgetVisibility", "getPromoAdsLocationConfig", "Lid/dana/data/config/model/PromoAdsLocationConfigResponse;", "getPromoBannerSliderItemNewSizeEnabled", "getPromoCenterConfig", "Lid/dana/data/config/source/amcs/result/PromoCenterConfigResult;", "enabled", "getQrCount", "getQrisCrossBorderContent", "Lid/dana/data/config/source/amcs/result/QrisCrossBorderContentResult;", "countryCode", "getQrisCrossBorderSupportedCountries", "getReferralPageConfig", "Lid/dana/data/config/source/amcs/result/ReferralPageConfigResult;", "getReportReasonsConfig", "getRequestMoneyInfo", "Lid/dana/data/config/source/amcs/result/RequestMoneyInfoResult;", "getSavingCategories", "getSavingCategoriesByKey", "Lid/dana/data/saving/model/SavingCategoryEntity;", "getSavingWithdrawOptionsConfig", "getSendMoneyBannerConfig", "getSendMoneyFeedConfig", "getSendMoneyNoteCharLimit", "getSendMoneyRefundTimeout", "getShareReferralMessageTemplate", "Lid/dana/domain/featureconfig/model/ReferralMessageTemplateConfig;", "getShowAlipayConnectBrandConfig", "Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "getSkuExplore", "Lid/dana/domain/featureconfig/model/SkuExploreConfig;", "getSocialMediaCategoryShare", "getSplashAnimationConfig", "Lid/dana/data/config/source/amcs/result/SplashAnimationConfigResult;", "getSplitBillConfig", "Lid/dana/data/config/source/amcs/result/SplitBillConfigResult;", "getStringList", "getTermsConditionsConfig", "Lid/dana/data/config/source/amcs/result/TermsConditionsResult;", "getTimeoutPeriod", "getTnCReferralMission", "getTncAgreementFeature", "getTwilioTimeoutConfig", "Lid/dana/data/config/source/amcs/result/TwilioTimeoutConfigResult;", "getWhitelistedDevices", "", "getWhitelistedDomain", "getWhitelistedSubMerchantId", "getX2LBannerConfig", "Lid/dana/data/sendmoney/x2l/model/BannerConfigEntity;", "getX2LSocialLinks", "Lid/dana/data/sendmoney/x2l/model/SocialLinkEntity;", "isAnalyticsModuleEnable", "isBranchDeepLinkEnable", "isCScanBEnabled", "isChangeUsernameEnabled", "Lid/dana/data/profilemenu/model/ChangeUsernameEntity;", "isDexguardHookCheckEnable", "isDexguardRootCheckEnable", "isDexguardTamperCheckEnable", "isDoHoldLogin", "isEnableSendRiskLuckyMoney", "isEncryptCardEnabled", "isFaceLoginEnabled", "isFavoriteServicesEnabled", "isFeatureAnnouncementEnable", "isFeatureFeedHightlightEnabled", "isFeatureGlobalSearchEnabled", "isFeatureGnProxyEnable", "isFeatureGoalsBalanceEnable", "isFeatureInvestmentEnabled", "isFeatureOldRecentTransactionEnabled", "isFeatureQrisCrossBorderEnabled", "isFeatureSecureRecentTransactionEnabled", "isFeatureSplitMigration", "isFeedCommentEnable", "isFeedInboxTabEnable", "isFeedNotificationEnable", "isGlobalNetworkEnabled", "isHomeRevampEnable", "isInterstitialBannerEnabled", "isKnowYourBusinessEnable", "isKnowledgeBasedAuthEnable", "type", "isLeaderboardEntryEnabled", "isLogoutEnable", "isMerchantCategoryFilterEnable", "isMixpanelTrackEnable", "isOfflineF2FPay", "isPromoCenterEnable", "isPromoClaimEnable", "isPromoQuestEnable", "isPushNotifDiagnosticEnable", "isQrisEnabled", "isQrisTcico", "isQrisTopUpEnable", "isRecurringContactSyncEnabled", "isReferralSendMoneyEnable", "isReferredUserEnabled", "isResendWhatsAppEnable", "isSendMoneyPeerToCashEnable", "isSendMoneyV2Enabled", "isSendToBankEnable", "isSendToLinkEnable", "isShowReferralCode", "isSocialContactSyncEnabled", "isSocialFeatureEnable", "isStatementDownloadEnabled", "isStatementEnabled", "isTwilioEnrollmentEnable", "isUserConfigSyncEnable", "bizType", "isX2BPreKitkatDialogEnable", "isX2PEnable", "isX2XVoucherEnable", "monitorCertificatesUrl", "monitorPinningMode", "observeMaintenanceBroadcast", "Lid/dana/data/config/source/amcs/result/MaintenanceBroadcastResult;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AppUtils implements AppMsgReceiver.AnonymousClass2 {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final int DEFAULT_DECODE_QR_TIMEOUT = 30;
    private static final int DEFAULT_MAX_RECENT_BANK = 3;
    private static final int DEFAULT_MAX_RECENT_CONTACT = 5;
    private static final int DEFAULT_MAX_SAVED_BANK = 20;
    private static final long DEFAULT_TIMEOUT_PERIOD = 4320;
    private static final String EMPTY_JSON_ARRAY = "[]";
    private static final String TNC_REFERRAL_URL = "url";
    private final UpdateAppCallback splitFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/GeofenceConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback<T, R> implements RedDotDrawable<getRequestMainPackage, onComplete> {
        public static final ICustomTabsCallback getMax = new ICustomTabsCallback();

        ICustomTabsCallback() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Integer>> {
            public static final Stub getMin = new Stub();

            Stub() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class Proxy<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends JSONObject>> {
                public static final Proxy getMax = new Proxy();

                Proxy() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    TitleBarRightButtonView.AnonymousClass1 r5;
                    getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "merchant_categories", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_MERCHANT_CATEGORIES), JSONObject.class), true));
                    Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                    if (min instanceof getSecondFloorView) {
                        r5 = ((getSecondFloorView) min).setMax();
                    } else {
                        setTitleLoading settitleloading = new setTitleLoading(min);
                        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                        r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                    }
                    return r5;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getMerchantCategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
                public static final class getMin<T> implements updateProgress<T> {
                    final /* synthetic */ Object $defaultValue;
                    final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                    final /* synthetic */ String $splitName;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                        this.this$0 = getrequestmainpackage;
                        this.$splitName = str;
                        this.$defaultValue = obj;
                        this.$isNeedToThrowWhenGotControl = z;
                    }

                    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                        Intrinsics.checkNotNullParameter(r8, "emitter");
                        isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), JSONObject.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                            final /* synthetic */ getMin this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void onComplete(@NotNull String str, @Nullable T t) {
                                Intrinsics.checkNotNullParameter(str, "treatment");
                                this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                                if (t == null) {
                                    r8.onError(new SplitNull(this.this$0.$splitName));
                                } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                    r8.onSuccess(t);
                                } else {
                                    r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                                }
                            }

                            public final void onError() {
                                r8.onError(new SplitException("Error when get toggle config"));
                            }
                        });
                    }
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "feature_max_recent_contact", 5, true));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getMaxRecentContact$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class setMin<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Integer.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ setMin this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Default<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Integer>> {
            public static final Default setMax = new Default();

            Default() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "feature_max_recent_bank", 3, true));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getMaxRecentBank$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class getMax<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Integer.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ getMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        private static onComplete getMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feature_geofence", true);
            if (onComplete.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (onComplete) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), onComplete.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_GEOFENCE), onComplete.class);
                Intrinsics.checkNotNull(obj);
            }
            return (onComplete) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lorg/json/JSONArray;", "kotlin.jvm.PlatformType", "merchantOrderJsonString", "Lcom/alibaba/fastjson/JSONArray;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsService<T, R> implements RedDotDrawable<com.alibaba.fastjson.JSONArray, JSONArray> {
        public static final ICustomTabsService setMin = new ICustomTabsService();

        ICustomTabsService() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<getRequestMainPackage, List<String>> {
            public static final Stub getMax = new Stub();

            Stub() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class Proxy<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Integer>> {
                public static final Proxy length = new Proxy();

                Proxy() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    TitleBarRightButtonView.AnonymousClass1 r5;
                    getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "fetch_qr_count", 1, false));
                    Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                    if (min instanceof getSecondFloorView) {
                        r5 = ((getSecondFloorView) min).setMax();
                    } else {
                        setTitleLoading settitleloading = new setTitleLoading(min);
                        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                        r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                    }
                    return r5;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getQrCount$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
                public static final class getMax<T> implements updateProgress<T> {
                    final /* synthetic */ Object $defaultValue;
                    final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                    final /* synthetic */ String $splitName;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                        this.this$0 = getrequestmainpackage;
                        this.$splitName = str;
                        this.$defaultValue = obj;
                        this.$isNeedToThrowWhenGotControl = z;
                    }

                    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                        Intrinsics.checkNotNullParameter(r8, "emitter");
                        isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Integer.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                            final /* synthetic */ getMax this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void onComplete(@NotNull String str, @Nullable T t) {
                                Intrinsics.checkNotNullParameter(str, "treatment");
                                this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                                if (t == null) {
                                    r8.onError(new SplitNull(this.this$0.$splitName));
                                } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                    r8.onSuccess(t);
                                } else {
                                    r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                                }
                            }

                            public final void onError() {
                                r8.onError(new SplitException("Error when get toggle config"));
                            }
                        });
                    }
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                return setMax((getRequestMainPackage) obj);
            }

            private static List<String> setMax(@NotNull getRequestMainPackage getrequestmainpackage) {
                Object obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                String max = getrequestmainpackage.getMax("qcb_supported_countries", false);
                if (com.alibaba.fastjson.JSONArray.class.isAssignableFrom(JSONArray.class)) {
                    if (max == null) {
                        max = "";
                    }
                    obj = (com.alibaba.fastjson.JSONArray) new JSONArray(max);
                } else {
                    if (max != null) {
                        Object obj2 = null;
                        if (max != null) {
                            try {
                                obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), com.alibaba.fastjson.JSONArray.class);
                            } catch (Exception unused) {
                            }
                        }
                        if (obj2 != null) {
                            obj = obj2;
                        }
                    }
                    obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_QRIS_CROSS_BORDER_SUPPORTED_COUNTRIES), com.alibaba.fastjson.JSONArray.class);
                    Intrinsics.checkNotNull(obj);
                }
                return getFantasyFontFamily.toMutableListOfString((com.alibaba.fastjson.JSONArray) obj);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/PromoCenterConfigResult;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Default<T, R> implements RedDotDrawable<AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1, AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1> {
            final /* synthetic */ boolean setMax;

            Default(boolean z) {
                this.setMax = z;
            }

            public final /* synthetic */ Object apply(Object obj) {
                AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 r2 = (AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1) obj;
                Intrinsics.checkNotNullParameter(r2, "it");
                r2.setEnable(this.setMax);
                return r2;
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            com.alibaba.fastjson.JSONArray jSONArray = (com.alibaba.fastjson.JSONArray) obj;
            Intrinsics.checkNotNullParameter(jSONArray, "merchantOrderJsonString");
            return new JSONArray(jSONArray);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/QrisCrossBorderContentResult;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IPostMessageService<T, R> implements RedDotDrawable<getRequestMainPackage, initResult> {
        final /* synthetic */ String getMin;

        IPostMessageService(String str) {
            this.getMin = str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends JSONObject>>> {
            public static final Stub length = new Stub();

            Stub() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class Proxy<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends access$702>> {
                final /* synthetic */ String length;

                Proxy(String str) {
                    this.length = str;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    TitleBarRightButtonView.AnonymousClass1 r5;
                    getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, this.length, (Object) null, false));
                    Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                    if (min instanceof getSecondFloorView) {
                        r5 = ((getSecondFloorView) min).setMax();
                    } else {
                        setTitleLoading settitleloading = new setTitleLoading(min);
                        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                        r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                    }
                    return r5;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getSavingCategoriesByKey$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
                public static final class getMin<T> implements updateProgress<T> {
                    final /* synthetic */ Object $defaultValue;
                    final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                    final /* synthetic */ String $splitName;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                        this.this$0 = getrequestmainpackage;
                        this.$splitName = str;
                        this.$defaultValue = obj;
                        this.$isNeedToThrowWhenGotControl = z;
                    }

                    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                        Intrinsics.checkNotNullParameter(r8, "emitter");
                        isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), access$702.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                            final /* synthetic */ getMin this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void onComplete(@NotNull String str, @Nullable T t) {
                                Intrinsics.checkNotNullParameter(str, "treatment");
                                this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                                if (t == null) {
                                    r8.onError(new SplitNull(this.this$0.$splitName));
                                } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                    r8.onSuccess(t);
                                } else {
                                    r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                                }
                            }

                            public final void onError() {
                                r8.onError(new SplitException("Error when get toggle config"));
                            }
                        });
                    }
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "comment_report_reasons", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_REPORT_REASONS), List.class), false));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getReportReasonsConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class getMax<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ getMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/RequestMoneyInfoResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Default<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends AppNode.AnonymousClass8>> {
            public static final Default length = new Default();

            Default() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "feature_request_money", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_REQUEST_MONEY), AppNode.AnonymousClass8.class), false));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getRequestMoneyInfo$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class getMin<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), AppNode.AnonymousClass8.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ getMin this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: o.initResult} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: o.initResult} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: o.initResult} */
        /* JADX WARNING: type inference failed for: r0v9, types: [org.json.JSONArray] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: setMax */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o.initResult apply(@org.jetbrains.annotations.NotNull o.getRequestMainPackage r11) {
            /*
                r10 = this;
                java.lang.String r0 = "ttUser"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "qcb_content_"
                r0.<init>(r1)
                java.lang.String r1 = r10.getMin
                java.util.Locale r2 = java.util.Locale.ROOT
                java.lang.String r3 = "Locale.ROOT"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                if (r1 == 0) goto L_0x0076
                java.lang.String r1 = r1.toLowerCase(r2)
                java.lang.String r2 = "(this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                o.initResult r9 = new o.initResult
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 31
                r8 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r1 = 0
                java.lang.String r11 = r11.getMax((java.lang.String) r0, (boolean) r1)
                java.lang.Class<o.initResult> r0 = o.initResult.class
                java.lang.Class<org.json.JSONArray> r1 = org.json.JSONArray.class
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 == 0) goto L_0x0052
                org.json.JSONArray r0 = new org.json.JSONArray
                if (r11 != 0) goto L_0x004b
                java.lang.String r11 = ""
            L_0x004b:
                r0.<init>(r11)
                r9 = r0
                o.initResult r9 = (o.initResult) r9
                goto L_0x0073
            L_0x0052:
                if (r11 == 0) goto L_0x0073
                r0 = 0
                if (r11 != 0) goto L_0x0058
                goto L_0x006f
            L_0x0058:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x006e }
                r1.<init>(r11)     // Catch:{ Exception -> 0x006e }
                com.google.gson.Gson r11 = new com.google.gson.Gson     // Catch:{ Exception -> 0x006e }
                r11.<init>()     // Catch:{ Exception -> 0x006e }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x006e }
                java.lang.Class<o.initResult> r2 = o.initResult.class
                java.lang.Object r11 = r11.fromJson((java.lang.String) r1, r2)     // Catch:{ Exception -> 0x006e }
                r0 = r11
                goto L_0x006f
            L_0x006e:
            L_0x006f:
                if (r0 != 0) goto L_0x0072
                goto L_0x0073
            L_0x0072:
                r9 = r0
            L_0x0073:
                o.initResult r9 = (o.initResult) r9
                return r9
            L_0x0076:
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppUtils.IPostMessageService.apply(o.getRequestMainPackage):o.initResult");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class ITrustedWebActivityCallback<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        public static final ITrustedWebActivityCallback getMin = new ITrustedWebActivityCallback();

        ITrustedWebActivityCallback() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/domain/featureconfig/model/SkuExploreConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends onReceivedHttpError>>> {
            public static final Stub length = new Stub();

            Stub() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class Proxy<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends shouldOverrideUrlLoading>> {
                public static final Proxy getMin = new Proxy();

                Proxy() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    TitleBarRightButtonView.AnonymousClass4 r5;
                    getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new length(getrequestmainpackage, "show_alipayconnect_brand", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SHOW_ALIPAYCONNECT_BRAND), JSONObject.class), true));
                    Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                    RedDotDrawable redDotDrawable = AnonymousClass3.setMin;
                    setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
                    setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
                    RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
                    if (redDotDrawable2 != null) {
                        releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
                    }
                    if (releaseviewlist instanceof getSecondFloorView) {
                        r5 = ((getSecondFloorView) releaseviewlist).setMax();
                    } else {
                        r5 = new setTitleLoading(releaseviewlist);
                        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                        if (redDotDrawable3 != null) {
                            r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                        }
                    }
                    return r5;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getShowAlipayConnectBrandConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
                public static final class length<T> implements updateProgress<T> {
                    final /* synthetic */ Object $defaultValue;
                    final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                    final /* synthetic */ String $splitName;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public length(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                        this.this$0 = getrequestmainpackage;
                        this.$splitName = str;
                        this.$defaultValue = obj;
                        this.$isNeedToThrowWhenGotControl = z;
                    }

                    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                        Intrinsics.checkNotNullParameter(r8, "emitter");
                        isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), JSONObject.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                            final /* synthetic */ length this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void onComplete(@NotNull String str, @Nullable T t) {
                                Intrinsics.checkNotNullParameter(str, "treatment");
                                this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                                if (t == null) {
                                    r8.onError(new SplitNull(this.this$0.$splitName));
                                } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                    r8.onSuccess(t);
                                } else {
                                    r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                                }
                            }

                            public final void onError() {
                                r8.onError(new SplitException("Error when get toggle config"));
                            }
                        });
                    }
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass4 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "sku_explore", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SKU_EXPLORE), List.class), false));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                RedDotDrawable redDotDrawable = AnonymousClass2.getMin;
                setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
                setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
                RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
                if (redDotDrawable2 != null) {
                    releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
                }
                if (releaseviewlist instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) releaseviewlist).setMax();
                } else {
                    r5 = new setTitleLoading(releaseviewlist);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                    if (redDotDrawable3 != null) {
                        r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                    }
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getSkuExplore$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class getMin<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ getMin this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Default<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
            public static final Default setMin = new Default();

            Default() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "send_money_feed_config", Boolean.TRUE, true));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getSendMoneyFeedConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class setMax<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Boolean.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ setMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "saving_withdraw_option", CollectionsKt.emptyList(), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getSavingWithdrawOptionsConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/featureconfig/model/ReferralMessageTemplateConfig;", "kotlin.jvm.PlatformType", "userTraffic", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class ITrustedWebActivityService<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends postWebMessage>> {
        public static final ITrustedWebActivityService setMax = new ITrustedWebActivityService();

        ITrustedWebActivityService() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
            public static final Stub setMax = new Stub();

            Stub() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/TwilioTimeoutConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class Proxy<T, R> implements RedDotDrawable<getRequestMainPackage, onNetworkChanged> {
                public static final Proxy length = new Proxy();

                Proxy() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return setMin((getRequestMainPackage) obj);
                }

                private static onNetworkChanged setMin(@NotNull getRequestMainPackage getrequestmainpackage) {
                    Object obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                    String max = getrequestmainpackage.getMax("twilio_timeout_config", true);
                    if (onNetworkChanged.class.isAssignableFrom(JSONArray.class)) {
                        if (max == null) {
                            max = "";
                        }
                        obj = (onNetworkChanged) new JSONArray(max);
                    } else {
                        if (max != null) {
                            Object obj2 = null;
                            if (max != null) {
                                try {
                                    obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), onNetworkChanged.class);
                                } catch (Exception unused) {
                                }
                            }
                            if (obj2 != null) {
                                obj = obj2;
                            }
                        }
                        obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_TWILIO_TIMEOUT), onNetworkChanged.class);
                        Intrinsics.checkNotNull(obj);
                    }
                    return (onNetworkChanged) obj;
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "valid_external_domain", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_VALID_EXTERNAL_DOMAIN), List.class), false));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getWhitelistedDomain$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class getMax<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ getMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Default<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
            public static final Default length = new Default();

            Default() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "gn_supported_merchant", (Object) null, false));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getWhitelistedSubMerchantId$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class setMax<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ setMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "userTraffic");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new length(getrequestmainpackage, "share_referral_message_template", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SHARE_REFERRAL_MESSAGE_TEMPLATE), postWebMessage.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getShareReferralMessageTemplate$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class length<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public length(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), postWebMessage.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ length this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/sendmoney/x2l/model/BannerConfigEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class INotificationSideChannel<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends IPCCallManager>> {
        public static final INotificationSideChannel getMax = new INotificationSideChannel();

        INotificationSideChannel() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
            public static final Stub getMax = new Stub();

            Stub() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/data/sendmoney/x2l/model/SocialLinkEntity;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class Proxy<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends IPCContextManager>>> {
                public static final Proxy setMin = new Proxy();

                Proxy() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    TitleBarRightButtonView.AnonymousClass4 r5;
                    getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "send_money_social_media", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SEND_MONEY_SOCIAL_MEDIA), List.class), false));
                    Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                    RedDotDrawable redDotDrawable = AnonymousClass1.getMin;
                    setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
                    setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
                    RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
                    if (redDotDrawable2 != null) {
                        releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
                    }
                    if (releaseviewlist instanceof getSecondFloorView) {
                        r5 = ((getSecondFloorView) releaseviewlist).setMax();
                    } else {
                        r5 = new setTitleLoading(releaseviewlist);
                        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                        if (redDotDrawable3 != null) {
                            r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                        }
                    }
                    return r5;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getX2LSocialLinks$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
                public static final class setMin<T> implements updateProgress<T> {
                    final /* synthetic */ Object $defaultValue;
                    final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                    final /* synthetic */ String $splitName;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                        this.this$0 = getrequestmainpackage;
                        this.$splitName = str;
                        this.$defaultValue = obj;
                        this.$isNeedToThrowWhenGotControl = z;
                    }

                    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                        Intrinsics.checkNotNullParameter(r8, "emitter");
                        isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                            final /* synthetic */ setMin this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void onComplete(@NotNull String str, @Nullable T t) {
                                Intrinsics.checkNotNullParameter(str, "treatment");
                                this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                                if (t == null) {
                                    r8.onError(new SplitNull(this.this$0.$splitName));
                                } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                    r8.onSuccess(t);
                                } else {
                                    r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                                }
                            }

                            public final void onError() {
                                r8.onError(new SplitException("Error when get toggle config"));
                            }
                        });
                    }
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                return Boolean.valueOf(getrequestmainpackage.setMin("feature_dexguard_tamper_check", false, true));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/profilemenu/model/ChangeUsernameEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class Default<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends setActivityClz>> {
            public static final Default getMax = new Default();

            Default() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new length(getrequestmainpackage, MyProfileMenuAction.SETTING_USERNAME_CHANGE, JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_CHANGE_USERNAME), setActivityClz.class), false));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$isChangeUsernameEnabled$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class length<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public length(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), setActivityClz.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ length this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onComplete(@NotNull String str, @Nullable T t) {
                            Intrinsics.checkNotNullParameter(str, "treatment");
                            this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                            if (t == null) {
                                r8.onError(new SplitNull(this.this$0.$splitName));
                            } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                                r8.onSuccess(t);
                            } else {
                                r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                            }
                        }

                        public final void onError() {
                            r8.onError(new SplitException("Error when get toggle config"));
                        }
                    });
                }
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "send_money_chat_banner", (Object) null, false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getX2LBannerConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), IPCCallManager.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/data/config/model/BindingBenefitEntity;", "kotlin.jvm.PlatformType", "listKey", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class extraCallback<T, R> implements RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<? extends List<JsonReader$Token>>> {
        final /* synthetic */ AppUtils setMax;

        extraCallback(AppUtils appUtils) {
            this.setMax = appUtils;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/model/BindingBenefitEntity;", "apply", "(Lid/dana/data/config/model/BindingBenefitEntity;)Ljava/lang/Boolean;", "id/dana/data/config/source/split/SplitConfigEntityData$getGnBindingBenefits$1$1$1"}, k = 3, mv = {1, 4, 2})
        static final class length<T, R> implements RedDotDrawable<JsonReader$Token, Boolean> {
            final /* synthetic */ List getMin;
            final /* synthetic */ extraCallback length;

            length(extraCallback extracallback, List list) {
                this.length = extracallback;
                this.getMin = list;
            }

            public final /* synthetic */ Object apply(Object obj) {
                JsonReader$Token jsonReader$Token = (JsonReader$Token) obj;
                Intrinsics.checkNotNullParameter(jsonReader$Token, "it");
                return Boolean.valueOf(this.getMin.add(jsonReader$Token));
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<String> list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "listKey");
            List arrayList = new ArrayList();
            for (String access$getGnDetailBindingBenefit : list) {
                this.setMax.getGnDetailBindingBenefit(access$getGnDetailBindingBenefit).map(new length(this, arrayList)).blockingFirst();
            }
            return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class IconCompatParcelizer<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final IconCompatParcelizer setMax = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getrequestmainpackage.setMin("feature_show_feed_inbox_tab", false, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/ContactSyncConfigResult;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends getStartUrl>> {
        public static final IsOverlapping length = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "feature_contact_sync", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_CONTACT_SYNC), getStartUrl.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getContactSyncConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), getStartUrl.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class RemoteActionCompatParcelizer<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final RemoteActionCompatParcelizer setMin = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getRequestMainPackage.getMax(getrequestmainpackage, "feature_myreferral", false, 6));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class areNotificationsEnabled<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final areNotificationsEnabled setMax = new areNotificationsEnabled();

        areNotificationsEnabled() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            return Boolean.valueOf(getRequestMainPackage.getMax(getrequestmainpackage, "feature_send_money_banner", false, 2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/InterstitialBannerConfigResult;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class asBinder<T, R> implements RedDotDrawable<getRequestMainPackage, AppNode.AnonymousClass1> {
        public static final asBinder length = new asBinder();

        asBinder() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: o.AppNode$1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: o.AppNode$1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: o.AppNode$1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static o.AppNode.AnonymousClass1 getMin(@org.jetbrains.annotations.NotNull o.getRequestMainPackage r4) {
            /*
                java.lang.String r0 = "ttUser"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                o.AppNode$1 r0 = new o.AppNode$1
                r0.<init>()
                r1 = 15
                r0.setGapTime(r1)
                r1 = 0
                r0.setResetTime(r1)
                java.lang.String r1 = "interstitial_banner_config"
                r2 = 1
                java.lang.String r4 = r4.getMax((java.lang.String) r1, (boolean) r2)
                java.lang.Class<o.AppNode$1> r1 = o.AppNode.AnonymousClass1.class
                java.lang.Class<org.json.JSONArray> r2 = org.json.JSONArray.class
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x0032
                org.json.JSONArray r0 = new org.json.JSONArray
                if (r4 != 0) goto L_0x002c
                java.lang.String r4 = ""
            L_0x002c:
                r0.<init>(r4)
                o.AppNode$1 r0 = (o.AppNode.AnonymousClass1) r0
                goto L_0x0053
            L_0x0032:
                if (r4 == 0) goto L_0x0053
                r1 = 0
                if (r4 != 0) goto L_0x0038
                goto L_0x004f
            L_0x0038:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x004e }
                r2.<init>(r4)     // Catch:{ Exception -> 0x004e }
                com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch:{ Exception -> 0x004e }
                r4.<init>()     // Catch:{ Exception -> 0x004e }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004e }
                java.lang.Class<o.AppNode$1> r3 = o.AppNode.AnonymousClass1.class
                java.lang.Object r4 = r4.fromJson((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x004e }
                r1 = r4
                goto L_0x004f
            L_0x004e:
            L_0x004f:
                if (r1 != 0) goto L_0x0052
                goto L_0x0053
            L_0x0052:
                r0 = r1
            L_0x0053:
                o.AppNode$1 r0 = (o.AppNode.AnonymousClass1) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppUtils.asBinder.getMin(o.getRequestMainPackage):o.AppNode$1");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class cancel<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final cancel length = new cancel();

        cancel() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getrequestmainpackage.setMin("feature_dexguard_root_check", false, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class cancelAll<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final cancelAll getMin = new cancelAll();

        cancelAll() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getrequestmainpackage.setMin("feature_dexguard_hook_check", false, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/TermsConditionsResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class cancelNotification<T, R> implements RedDotDrawable<getRequestMainPackage, AppNode.AnonymousClass7> {
        public static final cancelNotification setMax = new cancelNotification();

        cancelNotification() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        private static AppNode.AnonymousClass7 getMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feature_terms_conditions", true);
            if (AppNode.AnonymousClass7.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (AppNode.AnonymousClass7) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), AppNode.AnonymousClass7.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_TERMS_CONDITIONS), AppNode.AnonymousClass7.class);
                Intrinsics.checkNotNull(obj);
            }
            return (AppNode.AnonymousClass7) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class create<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        public static final create getMax = new create();

        create() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "gn_input_name_skip_button", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SUB_MERCHANT_ID_SKIP_BUTTON_ADDING_NAME), List.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getFeatureSkipButtonMerchantList$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ String getMin;

        equals(String str) {
            this.getMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, this.getMin, Boolean.FALSE, true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getBooleanUserTrafficOnceReadyWithFallbackAMCS$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Boolean.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class extraCallbackWithResult<T, R> implements RedDotDrawable<getRequestMainPackage, List<? extends JSONObject>> {
        public static final extraCallbackWithResult length = new extraCallbackWithResult();

        extraCallbackWithResult() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        private static List<JSONObject> getMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            Object jSONArray = new com.alibaba.fastjson.JSONArray();
            String max = getrequestmainpackage.getMax("home_banner", false);
            if (com.alibaba.fastjson.JSONArray.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                jSONArray = (com.alibaba.fastjson.JSONArray) new JSONArray(max);
            } else if (max != null) {
                Object obj = null;
                if (max != null) {
                    try {
                        obj = new Gson().fromJson(new org.json.JSONObject(max).toString(), com.alibaba.fastjson.JSONArray.class);
                    } catch (Exception unused) {
                    }
                }
                if (obj != null) {
                    jSONArray = obj;
                }
            }
            return getFantasyFontFamily.toMutableListOfJSONObject((com.alibaba.fastjson.JSONArray) jSONArray);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "trafficType", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class extraCommand<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final extraCommand length = new extraCommand();

        extraCommand() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "trafficType");
            return Boolean.valueOf(getrequestmainpackage.setMin("feature_maps_nearby_home", false, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/SplitBillConfigResult;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getActiveNotifications<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends AppNode.AnonymousClass9>> {
        public static final getActiveNotifications getMax = new getActiveNotifications();

        getActiveNotifications() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "feature_split_bill_config", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_SPLIT_BILL_CONFIG), AppNode.AnonymousClass9.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getSplitBillConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), AppNode.AnonymousClass9.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getCause<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends APWebViewClient>> {
        public static final getCause setMin = new getCause();

        getCause() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "global_search_config", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_GLOBAL_SEARCH_CONFIG), APWebViewClient.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getGlobalSearchConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), APWebViewClient.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getDefaultImpl<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Integer>> {
        public static final getDefaultImpl getMin = new getDefaultImpl();

        getDefaultImpl() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass4 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "feature_max_saved_bank", 20, true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            RedDotDrawable redDotDrawable = AnonymousClass1.getMin;
            setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
            setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
            if (redDotDrawable2 != null) {
                releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
            }
            if (releaseviewlist instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) releaseviewlist).setMax();
            } else {
                r5 = new setTitleLoading(releaseviewlist);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                if (redDotDrawable3 != null) {
                    r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                }
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getMaxSavedBank$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Integer.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONArray;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getInterfaceDescriptor<T, R> implements RedDotDrawable<getRequestMainPackage, com.alibaba.fastjson.JSONArray> {
        public static final getInterfaceDescriptor setMax = new getInterfaceDescriptor();

        getInterfaceDescriptor() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return setMin((getRequestMainPackage) obj);
        }

        private static com.alibaba.fastjson.JSONArray setMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax(MerchantOrder.ALL, true);
            if (com.alibaba.fastjson.JSONArray.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (com.alibaba.fastjson.JSONArray) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), com.alibaba.fastjson.JSONArray.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_MERCHANT_CATEGORIES_ORDER_JSON), com.alibaba.fastjson.JSONArray.class);
                Intrinsics.checkNotNull(obj);
            }
            return (com.alibaba.fastjson.JSONArray) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        public static final getMax getMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "gn_input_name_merchant_list", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SUB_MERCHANT_ID_ADDING_NAME), List.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getAddingNameWhitelistedSubMerchantId$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/version/Version;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getRequestMainPackage, Version> {
        public static final getMin length = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        private static Version getMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax(MyProfileMenuAction.APP_VERSION, true);
            if (Version.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (Version) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), Version.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_APP_VERSION), Version.class);
                Intrinsics.checkNotNull(obj);
            }
            return (Version) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/SplashAnimationConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getSmallIconBitmap<T, R> implements RedDotDrawable<getRequestMainPackage, AppNode.AnonymousClass8.AnonymousClass1> {
        public static final getSmallIconBitmap length = new getSmallIconBitmap();

        getSmallIconBitmap() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        private static AppNode.AnonymousClass8.AnonymousClass1 getMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("splash_animation", true);
            if (AppNode.AnonymousClass8.AnonymousClass1.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (AppNode.AnonymousClass8.AnonymousClass1) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), AppNode.AnonymousClass8.AnonymousClass1.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SPLASH_ANIMATION), AppNode.AnonymousClass8.AnonymousClass1.class);
                Intrinsics.checkNotNull(obj);
            }
            return (AppNode.AnonymousClass8.AnonymousClass1) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/model/PromoAdsConfigResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class invoke<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends findApp>> {
        public static final invoke length = new invoke();

        invoke() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new length(getrequestmainpackage, "feature_promo_ads", new findApp(false, 0, 3, (DefaultConstructorMarker) null), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getFeaturePromoAds$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class length<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public length(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), findApp.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ length this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        int length = str != null ? str.length() : 0;
                        int max = dispatchOnCancelled.setMax(length);
                        if (length != max) {
                            onCanceled oncanceled = new onCanceled(length, max, 1);
                            onCancelLoad.setMax(804742503, oncanceled);
                            onCancelLoad.getMin(804742503, oncanceled);
                        }
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "Lid/dana/domain/featureconfig/model/GlobalSearchCategory;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Map<String, ? extends setVerticalScrollBarEnabled>>> {
        public static final invokeSuspend getMin = new invokeSuspend();

        invokeSuspend() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass4 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "feature_global_search_categories", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_GLOBAL_SEARCH_CATEGORIES), String.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            RedDotDrawable redDotDrawable = AnonymousClass3.setMin;
            setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
            setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
            if (redDotDrawable2 != null) {
                releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
            }
            if (releaseviewlist instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) releaseviewlist).setMax();
            } else {
                r5 = new setTitleLoading(releaseviewlist);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                if (redDotDrawable3 != null) {
                    r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                }
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getFeatureGlobalSearchCategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), String.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ String setMax;

        isInside(String str) {
            this.setMax = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, this.setMax, Boolean.FALSE, false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getBooleanUserTrafficOnceReady$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Boolean.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        final /* synthetic */ String getMax;
        final /* synthetic */ boolean setMax;

        length(String str, boolean z) {
            this.getMax = str;
            this.setMax = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getRequestMainPackage.getMax(getrequestmainpackage, this.getMax, this.setMax, 2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/NearbyConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class mayLaunchUrl<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends AppNode.AnonymousClass12>> {
        public static final mayLaunchUrl getMax = new mayLaunchUrl();

        mayLaunchUrl() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "nearby_config", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_NEARBY_CONFIG), AppNode.AnonymousClass12.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getNearbyConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), AppNode.AnonymousClass12.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class newSession<T, R> implements RedDotDrawable<getRequestMainPackage, JSONObject> {
        public static final newSession length = new newSession();

        newSession() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return length((getRequestMainPackage) obj);
        }

        private static JSONObject length(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("nearby_me_topup_agent", true);
            if (JSONObject.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (JSONObject) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), JSONObject.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_MERCHANT_TOPUP), JSONObject.class);
                Intrinsics.checkNotNull(obj);
            }
            return (JSONObject) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/nearbyme/model/NearbyRankingConfig;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class newSessionWithExtras<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends clearTempPath>> {
        public static final newSessionWithExtras getMax = new newSessionWithExtras();

        newSessionWithExtras() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "nearby_merchant_rank_weighting_v2", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_NEARBY_RANKING_CONFIG), clearTempPath.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getNearbyRankingConfigV2$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), clearTempPath.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class notify<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        final /* synthetic */ AppUtils getMax;

        notify(AppUtils appUtils) {
            this.getMax = appUtils;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "feature_referral_url_tnc", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_TNC_REFERRAL_QUEST), JSONObject.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5.map(new RedDotDrawable<JSONObject, String>(this) {
                final /* synthetic */ notify getMax;

                {
                    this.getMax = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                    Intrinsics.checkNotNullParameter(jSONObject, "result");
                    String string = jSONObject.getString("url");
                    CharSequence charSequence = string;
                    if (!(!(charSequence == null || charSequence.length() == 0))) {
                        string = null;
                    }
                    return string == null ? "https://www.dana.id/id/promo/detail/770/untuk-kamu-yang-terudang-kejar-voucher-dana" : string;
                }
            });
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getTnCReferralMission$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), JSONObject.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class notifyNotificationWithChannel<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Long>> {
        public static final notifyNotificationWithChannel getMin = new notifyNotificationWithChannel();

        notifyNotificationWithChannel() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass4 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "timeout_period", Long.valueOf(AppUtils.DEFAULT_TIMEOUT_PERIOD), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            RedDotDrawable redDotDrawable = AnonymousClass5.getMax;
            setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
            setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
            if (redDotDrawable2 != null) {
                releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
            }
            if (releaseviewlist instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) releaseviewlist).setMax();
            } else {
                r5 = new setTitleLoading(releaseviewlist);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                if (redDotDrawable3 != null) {
                    r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                }
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getTimeoutPeriod$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Long.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class onExtraCallback<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        public static final onExtraCallback setMax = new onExtraCallback();

        onExtraCallback() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "saving_categories", CollectionsKt.emptyList(), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getSavingCategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class onNavigationEvent<T, R> implements RedDotDrawable<getRequestMainPackage, access$002> {
        public static final onNavigationEvent length = new onNavigationEvent();

        onNavigationEvent() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMax((getRequestMainPackage) obj);
        }

        private static access$002 getMax(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feed_config", false);
            if (access$002.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (access$002) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), access$002.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEED_CONFIG), access$002.class);
                Intrinsics.checkNotNull(obj);
            }
            return (access$002) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class onPostMessage<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<String>>> {
        public static final onPostMessage setMax = new onPostMessage();

        onPostMessage() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "gn_binding_benefit", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, AppUtils.EMPTY_JSON_ARRAY), List.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getGnBindingBenefitsKey$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class onRelationshipValidationResult<T, R> implements RedDotDrawable<getRequestMainPackage, JSONObject> {
        public static final onRelationshipValidationResult length = new onRelationshipValidationResult();

        onRelationshipValidationResult() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return length((getRequestMainPackage) obj);
        }

        private static JSONObject length(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feature_h5_entries", true);
            if (JSONObject.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (JSONObject) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), JSONObject.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_H5_ENTRIES), JSONObject.class);
                Intrinsics.checkNotNull(obj);
            }
            return (JSONObject) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 2})
    static final class onTransact<T, R> implements RedDotDrawable<getRequestMainPackage, Integer> {
        public static final onTransact setMax = new onTransact();

        onTransact() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Integer.valueOf(getRequestMainPackage.getMax(getrequestmainpackage, "feature_max_recent_transaction", 20));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "trafficType", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class postMessage<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final postMessage getMax = new postMessage();

        postMessage() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "trafficType");
            return Boolean.valueOf(getrequestmainpackage.setMin("promo_banner_slider_size_v2", true, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class read<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final read length = new read();

        read() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "feature_facelogin", Boolean.TRUE, true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$isFaceLoginEnabled$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Boolean.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/PromoCenterConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class receiveFile<T, R> implements RedDotDrawable<getRequestMainPackage, AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1> {
        public static final receiveFile getMax = new receiveFile();

        receiveFile() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((getRequestMainPackage) obj);
        }

        private static AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 getMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("config_promo_center", true);
            if (AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_CONFIG_PROMO_CENTER), AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1.class);
                Intrinsics.checkNotNull(obj);
            }
            return (AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class requestPostMessageChannel<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<String>>> {
        final /* synthetic */ MerchantCategoryType setMin;

        requestPostMessageChannel(MerchantCategoryType merchantCategoryType) {
            this.setMin = merchantCategoryType;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass4 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String key = this.setMin.getKey();
            String defaultPath = this.setMin.getDefaultPath();
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, key, defaultPath != null ? JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, defaultPath), com.alibaba.fastjson.JSONArray.class) : null, false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            RedDotDrawable redDotDrawable = AnonymousClass1.setMax;
            setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
            setMinDuration releaseviewlist = new releaseViewList(min, redDotDrawable);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
            if (redDotDrawable2 != null) {
                releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
            }
            if (releaseviewlist instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) releaseviewlist).setMax();
            } else {
                r5 = new setTitleLoading(releaseviewlist);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
                if (redDotDrawable3 != null) {
                    r5 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r5);
                }
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getNewMerchantCategoryOrder$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), com.alibaba.fastjson.JSONArray.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class requestPostMessageChannelWithExtras<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends JSONObject>> {
        public static final requestPostMessageChannelWithExtras setMax = new requestPostMessageChannelWithExtras();

        requestPostMessageChannelWithExtras() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "feature_store_review", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_STORE_REVIEW), JSONObject.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getPlayStoreReviewFeature$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), JSONObject.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setDefaultImpl<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends JSONObject>> {
        public static final setDefaultImpl getMin = new setDefaultImpl();

        setDefaultImpl() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "merchant_sub_category", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_MERCHANT_SUB_CATEGORIES), JSONObject.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getMerchantSubcategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), JSONObject.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends BcaOneKlikInterceptData>> {
        public static final setMax length = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new C0041setMax(getrequestmainpackage, "bca_oneklik_webview_intercept_config", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_BCA_ONEKLIK_WEBVIEW_INTERCEPT_CONFIG), BcaOneKlikInterceptData.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getBcaOneKlikInterceptConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.AppUtils$setMax$setMax  reason: collision with other inner class name */
        public static final class C0041setMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public C0041setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), BcaOneKlikInterceptData.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ C0041setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<String>>> {
        public static final toDoubleRange setMax = new toDoubleRange();

        toDoubleRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "deeplink_feature_payload_config_list", (Object) null, false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getDeeplinkFeatureConfigList$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Long;"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<getRequestMainPackage, Long> {
        public static final toIntRange getMax = new toIntRange();

        toIntRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Long.valueOf((long) getRequestMainPackage.getMax(getrequestmainpackage, "decode_qr_timeout_time", 30));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<getRequestMainPackage, List<? extends String>> {
        public static final toString getMax = new toString();

        toString() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            com.alibaba.fastjson.JSONArray jSONArray = new com.alibaba.fastjson.JSONArray();
            String max = getrequestmainpackage.getMax("dana_news", false);
            if (com.alibaba.fastjson.JSONArray.class.isAssignableFrom(String.class)) {
                if (max == null) {
                    max = "";
                }
                if (max != null) {
                    jSONArray = (com.alibaba.fastjson.JSONArray) max;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                }
            }
            return getFantasyFontFamily.toMutableListOfString(jSONArray);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/MerchantCategoryContentResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class updateVisuals<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends AppNode.AnonymousClass10>> {
        public static final updateVisuals setMin = new updateVisuals();

        updateVisuals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "merchant_sub_categories_v2", new AppNode.AnonymousClass10((String) null, 1, (DefaultConstructorMarker) null), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getNewMerchantSubCategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), AppNode.AnonymousClass10.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/model/PromoAdsLocationConfigResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class validateRelationship<T, R> implements RedDotDrawable<getRequestMainPackage, startApp> {
        public static final validateRelationship setMin = new validateRelationship();

        validateRelationship() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMax((getRequestMainPackage) obj);
        }

        private static startApp getMax(@NotNull getRequestMainPackage getrequestmainpackage) {
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            Object obj = null;
            Object startapp = new startApp(0, 1, (DefaultConstructorMarker) null);
            String max = getrequestmainpackage.getMax("promo_ads_location_config", false);
            if (startApp.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                startapp = (startApp) new JSONArray(max);
            } else if (max != null) {
                if (max != null) {
                    try {
                        obj = new Gson().fromJson(new org.json.JSONObject(max).toString(), startApp.class);
                    } catch (Exception unused) {
                    }
                }
                if (obj != null) {
                    startapp = obj;
                }
            }
            return (startApp) startapp;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class valueOf<T, R> implements RedDotDrawable<getRequestMainPackage, Map<String, ? extends setSupportMultipleWindows>> {
        public static final valueOf setMax = new valueOf();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0005"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release", "id/dana/data/config/source/split/SplitConfigEntityData$getElectronicMoneyConfig$1$$special$$inlined$toMap$2"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends TypeReference<Map<String, ? extends setSupportMultipleWindows>> {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0005"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release", "id/dana/data/config/source/split/SplitConfigEntityData$getElectronicMoneyConfig$1$$special$$inlined$toMap$1"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends TypeReference<Map<String, ? extends setSupportMultipleWindows>> {
        }

        valueOf() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return setMin((getRequestMainPackage) obj);
        }

        private static Map<String, setSupportMultipleWindows> setMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            String str;
            Map<String, setSupportMultipleWindows> map;
            Map<String, setSupportMultipleWindows> map2;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feature_electronic_money", false);
            if (max != null) {
                if (max == null) {
                    try {
                        map2 = MapsKt.emptyMap();
                    } catch (Exception unused) {
                        map2 = MapsKt.emptyMap();
                    }
                } else {
                    Object parseObject = JSON.parseObject(new org.json.JSONObject(max).toString(), new setMax(), new Feature[0]);
                    Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
                    map2 = (Map) parseObject;
                }
                if (map2 != null) {
                    return map2;
                }
            }
            Map map3 = (Map) JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_ELECTRONIC_MONEY), Map.class);
            if (map3 != null) {
                str = map3.toString();
            } else {
                str = null;
            }
            if (str == null) {
                try {
                    return MapsKt.emptyMap();
                } catch (Exception unused2) {
                    map = MapsKt.emptyMap();
                }
            } else {
                Object parseObject2 = JSON.parseObject(new org.json.JSONObject(str).toString(), new getMax(), new Feature[0]);
                Intrinsics.checkNotNullExpressionValue(parseObject2, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
                map = (Map) parseObject2;
                return map;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class values<T, R> implements RedDotDrawable<getRequestMainPackage, JSONObject> {
        public static final values length = new values();

        values() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return setMin((getRequestMainPackage) obj);
        }

        private static JSONObject setMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feature_deeplink_entries", true);
            if (JSONObject.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (JSONObject) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), JSONObject.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_DEEPLINK_ENTRIES), JSONObject.class);
                Intrinsics.checkNotNull(obj);
            }
            return (JSONObject) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/MerchantCategoryContentResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class warmup<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends AppNode.AnonymousClass10>> {
        public static final warmup getMax = new warmup();

        warmup() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new length(getrequestmainpackage, "merchant_categories_v2", new AppNode.AnonymousClass10((String) null, 1, (DefaultConstructorMarker) null), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getNewMerchantCategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class length<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public length(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), AppNode.AnonymousClass10.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ length this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class write<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final write setMin = new write();

        write() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "feature_x2x_v2", Boolean.TRUE, false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$isSendMoneyV2Enabled$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), Boolean.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class b<T, R> implements RedDotDrawable<getRequestMainPackage, access$002> {
        public static final b setMax = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return setMax((getRequestMainPackage) obj);
        }

        private static access$002 setMax(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("feed_home_config", false);
            if (access$002.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (access$002) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new org.json.JSONObject(max).toString(), access$002.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEED_HOME_CONFIG), access$002.class);
                Intrinsics.checkNotNull(obj);
            }
            return (access$002) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<String>>> {
        public static final toFloatRange length = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(getrequestmainpackage, "category_explore", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_CATEGORY_EXPLORE), List.class), false));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getCategoryExplore$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Inject
    public AppUtils(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.splitFacade = updateAppCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Version> getAppVersion() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Version> map = fromCallable.map(getMin.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getTimeoutPeriod() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(notifyNotificationWithChannel.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getSendMoneyRefundTimeout() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getSendMoneyNoteCharLimit() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getEnableAddNewCard() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_show_other_card");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardRootCheckEnable() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Boolean> map = fromCallable.map(cancel.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardHookCheckEnable() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Boolean> map = fromCallable.map(cancelAll.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardTamperCheckEnable() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Boolean> map = fromCallable.map(INotificationSideChannel.Stub.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGnProxyEnable() {
        return getBooleanUserTraffic("feature_gn_proxy", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isEncryptCardEnabled() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getCertificatesUrl() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getPinningMode() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowledgeBasedAuthEnable(@Nullable String str) {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowYourBusinessEnable() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isLogoutEnable() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    private final TitleBarRightButtonView.AnonymousClass1<Boolean> getBooleanUserTrafficOnceReady(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(new isInside(str));
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    private final TitleBarRightButtonView.AnonymousClass1<Boolean> getBooleanUserTrafficOnceReadyWithFallbackAMCS(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(new equals(str));
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getBooleanUserTraffic$default(AppUtils appUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appUtils.getBooleanUserTraffic(str, z);
    }

    private final TitleBarRightButtonView.AnonymousClass1<Boolean> getBooleanUserTraffic(String str, boolean z) {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new length(str, z));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…l\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoQuestEnable() {
        return getBooleanUserTraffic("feature_promoquest", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getCacheDir> getNearbyAutoSearchConfig() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getQrCount() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ICustomTabsService.Stub.Proxy.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfig() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfigV2() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(newSessionWithExtras.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPushNotifDiagnosticEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_push_notif_diagnostic");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setHorizontalScrollBarEnabled> getFeedbackConfigInfo() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isDoHoldLogin() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isOfflineF2FPay() {
        return getBooleanUserTraffic("feature_f2fpay_V2", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass2> observeMaintenanceBroadcast() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, setVerticalScrollBarEnabled>> getFeatureGlobalSearchCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(invokeSuspend.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isBranchDeepLinkEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_branch_deeplink");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isMerchantCategoryFilterEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_nearby_me_merchant_filter");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAPWebViewListener> getEnableExpressPayInfo() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(AppUtils$Grayscale$Algorithm.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getPlayStoreReviewFeature() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(requestPostMessageChannelWithExtras.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureSplitMigration() {
        return getBooleanUserTrafficOnceReady("feature_service_split_migration");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getNearbyMeFeature() {
        return getBooleanUserTraffic("feature_nearby", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getNearbyMeMapViewFeature() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(extraCommand.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isAnalyticsModuleEnable() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getTncAgreementFeature() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getExtensionManager>> getExpiryChoice() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isShowReferralCode() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Boolean> map = fromCallable.map(RemoteActionCompatParcelizer.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…L\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isLeaderboardEntryEnabled() {
        return getBooleanUserTraffic("feature_leaderboard", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToLinkEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_send_to_link");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getPromoBannerSliderItemNewSizeEnabled() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(postMessage.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8> getRequestMoneyInfo() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(IPostMessageService.Default.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isX2PEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_send_money_x2p");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isX2BPreKitkatDialogEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_dialog_pre_kitkat_x2b");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyV2Enabled() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(write.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<IPCCallManager> getX2LBannerConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(INotificationSideChannel.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<IPCContextManager>> getX2LSocialLinks() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(INotificationSideChannel.Stub.Proxy.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isX2XVoucherEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_x2x_voucher");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass5> getReferralPageConfig() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> monitorPinningMode() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> monitorCertificatesUrl() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getAndMonitorCertificateWhitelist() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToBankEnable() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getCategoryExplore() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(toFloatRange.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass1> getInterstitialBannerConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(asBinder.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade\n            …          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isReferredUserEnabled() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_referred_user");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getStartUrl> getContactSyncConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(IsOverlapping.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade\n        .tra….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass9> getSplitBillConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(getActiveNotifications.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, Boolean>> getWhitelistedDevices() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isTwilioEnrollmentEnable() {
        return getBooleanUserTraffic$default(this, "feature_twilio_enrollment", false, 2, (Object) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isResendWhatsAppEnable() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureSecureRecentTransactionEnabled() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoClaimEnable() {
        return getBooleanUserTraffic("feature_promo_claim", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getSocialMediaCategoryShare() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isUserConfigSyncEnable(@Nullable String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1500189437, oncanceled);
            onCancelLoad.getMin(-1500189437, oncanceled);
        }
        if (str != null) {
            return getBooleanUserTrafficOnceReadyWithFallbackAMCS(str);
        }
        throw new BiztypeNotFoundException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoCenterEnable() {
        return getBooleanUserTraffic("feature_promocenter", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass7> getTermsConditionsConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(cancelNotification.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentBank() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ICustomTabsCallback.Default.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentContact() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ICustomTabsCallback.Stub.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentRecipient() {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorReturnItem = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(onTransact.setMax).onErrorReturnItem(20);
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "splitFacade.trafficTypeU…T_MAX_RECENT_TRANSACTION)");
        return onErrorReturnItem;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isEnableSendRiskLuckyMoney() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkVisibilityFeature(@Nullable String str) {
        return getBooleanUserTraffic("feature_".concat(String.valueOf(str)), true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisEnabled() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_qris");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isReferralSendMoneyEnable() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyPeerToCashEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_send_money_x2c");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<OTCAcceptExpiryTimeConfigResult> getOTCExpiryConfig() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1> getPromoCenterConfig(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(receiveFile.getMax).map(new ICustomTabsService.Default(z));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…d\n            }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isMixpanelTrackEnable() {
        return getBooleanUserTraffic("feature_mixpanel", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxSavedBank() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(getDefaultImpl.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyFeedConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityCallback.Default.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFavoriteServicesEnabled() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS(DefaultEventTracker.SYNC_KEY);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFaceLoginEnabled() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Boolean> flatMap = fromCallable.flatMap(read.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeD….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureOldRecentTransactionEnabled() {
        return getBooleanUserTraffic("feature_sync_recent_transaction", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedSubMerchantId() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityService.Default.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getAddingNameWhitelistedSubMerchantId() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(getMax.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getDeeplinkFeatureConfigList() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(toDoubleRange.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/deeplink/repository/source/branch/result/DeepLinkPayloadEntity;", "kotlin.jvm.PlatformType", "traffic", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T, R> implements RedDotDrawable<getRequestMainPackage, DeepLinkPayloadEntity> {
        final /* synthetic */ String getMin;
        final /* synthetic */ List length;

        hashCode(List list, String str) {
            this.length = list;
            this.getMin = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: getMin */
        public DeepLinkPayloadEntity apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            boolean z;
            DeepLinkPayloadEntity deepLinkPayloadEntity;
            Pair pair;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "traffic");
            List list = this.length;
            Intrinsics.checkNotNullParameter(list, "splitNames");
            Map<String, getSystemLocation> min = isUesCacheLocation.getMax().setMin((List<String>) list, getrequestmainpackage.setMin());
            Intrinsics.checkNotNullExpressionValue(min, "it");
            getrequestmainpackage.setMin(min);
            Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(min.size()));
            for (Map.Entry entry : min.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((getSystemLocation) entry.getValue()).getMin);
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                z = false;
                deepLinkPayloadEntity = null;
                if (!it.hasNext()) {
                    pair = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                if (StringsKt.contains$default((CharSequence) this.getMin, (CharSequence) (String) key, false, 2, (Object) null)) {
                    pair = new Pair(key, value);
                    break;
                }
            }
            Intrinsics.checkNotNull(pair);
            String str = (String) pair.getSecond();
            if (str != null) {
                try {
                    deepLinkPayloadEntity = new Gson().fromJson(new org.json.JSONObject(str).toString(), DeepLinkPayloadEntity.class);
                } catch (Exception unused) {
                }
            }
            Intrinsics.checkNotNull(deepLinkPayloadEntity);
            DeepLinkPayloadEntity deepLinkPayloadEntity2 = deepLinkPayloadEntity;
            CharSequence path = deepLinkPayloadEntity2.getPath();
            if (path == null || path.length() == 0) {
                z = true;
            }
            if (z) {
                deepLinkPayloadEntity2.setPath(BranchLinkConstant.PathTarget.FEATURE);
            }
            return deepLinkPayloadEntity2;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> getDeeplinkFeatureConfigByKeys(@NotNull List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "keys");
        Intrinsics.checkNotNullParameter(str, "url");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new hashCode(list, str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…              }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialContactSyncEnabled() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isRecurringContactSyncEnabled() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxContactPerBatch() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedDomain() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityService.Stub.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onNetworkChanged> getTwilioTimeoutConfig() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<onNetworkChanged> map = fromCallable.map(ITrustedWebActivityService.Stub.Proxy.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedCommentEnable() {
        return getBooleanUserTrafficOnceReady("feature_comment");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedNotificationEnable() {
        return getBooleanUserTrafficOnceReady("feature_notification_feed");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BcaOneKlikInterceptData> getBcaOneKlikInterceptConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(setMax.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialFeatureEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_home_friendship");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureCameraCard() {
        return getBooleanUserTraffic("feature_camera_card", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureForcedFirstCard() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureAnnouncementEnable() {
        return getBooleanUserTraffic("feature_announcement", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getFeatureSkipButtonMerchantList() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(create.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BigDataChannelModel> getFeatureReferralEngagementDialogConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(AppUtils$Mean$Arithmetic.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGlobalSearchEnabled() {
        return getBooleanUserTraffic("feature_global_search", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<APWebViewClient> getGlobalSearchConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(getCause.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, setSupportMultipleWindows>> getElectronicMoneyConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(valueOf.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade\n            …          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getAppWidgetEnabled() {
        return getBooleanUserTrafficOnceReady("feature_app_shortcut");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getFriendshipSyncProgressInterval() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onComplete> getGeofenceConfig() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<onComplete> map = fromCallable.map(ICustomTabsCallback.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureAmlEdd() {
        return getBooleanUserTraffic("feature_aml_edd", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getAmlEddMandatory() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<performBack> getDonationCampaignConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(AppUtils$FastBitmap$CoordinateSystem.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8.AnonymousClass1> getSplashAnimationConfig() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8.AnonymousClass1> map = fromCallable.map(getSmallIconBitmap.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<org.json.JSONObject> getFriendshipEmojiList() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getProfileCompletionWidgetVisibility() {
        return getBooleanUserTrafficOnceReady("feature_profile_completion_widget");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTcico() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_qris_tcico");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTopUpEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_qris_topup");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxBankAccount() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getDeeplinkEntries() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(values.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getTnCReferralMission() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(new notify(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…}\n            }\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementEnabled() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementDownloadEnabled() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_download_statement");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getFeedVersionConfig() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getDefaultFeedFromConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(toString.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…tOfString()\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGoalsBalanceEnable() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_cumulative_balance");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isHomeRevampEnable() {
        return getBooleanUserTrafficOnceReady("config_home_new");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<access$002> getFeedHomeConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(b.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<access$002> getFeedConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(onNavigationEvent.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<JSONObject>> getReportReasonsConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(IPostMessageService.Stub.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureQrisCrossBorderEnabled() {
        return getBooleanUserTraffic$default(this, "feature_qris_crossborder", false, 2, (Object) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getQrisCrossBorderSupportedCountries() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(ICustomTabsService.Stub.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…tOfString()\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<initResult> getQrisCrossBorderContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new IPostMessageService(str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade\n        .tra…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<JsonReader$Token>> getGnBindingBenefits() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getGnBindingBenefitsKey().flatMap(new extraCallback(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getGnBindingBenefitsKey(….just(list)\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isInterstitialBannerEnabled() {
        return getBooleanUserTraffic$default(this, "feature_interstitial_banner", false, 2, (Object) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<JSONObject>> getHomeBannerDefaultContent() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(extraCallbackWithResult.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…SONObject()\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureFeedHightlightEnabled() {
        return getBooleanUserTraffic$default(this, "feature_feeds_highlight", false, 2, (Object) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ICustomTabsCallback.Stub.Proxy.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantSubcategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(setDefaultImpl.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantTopups() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(newSession.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONArray> getMerchantOrder() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(getInterfaceDescriptor.setMax).map(ICustomTabsService.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…erchantOrderJsonString) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getH5Entries() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(onRelationshipValidationResult.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getNewMerchantCategoryOrder(@NotNull MerchantCategoryType merchantCategoryType) {
        Intrinsics.checkNotNullParameter(merchantCategoryType, "merchantCategoryType");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(new requestPostMessageChannel(merchantCategoryType));
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass10> getNewMerchantCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(warmup.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass10> getNewMerchantSubCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(updateVisuals.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyBannerConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(areNotificationsEnabled.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getSavingWithdrawOptionsConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityCallback.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getSavingCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(onExtraCallback.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<access$702> getSavingCategoriesByKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(new IPostMessageService.Stub.Proxy(str));
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…    .toObservable()\n    }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<JSONObject> getJSONObject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "splitName");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new asInterface(str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class asInterface<T, R> implements RedDotDrawable<getRequestMainPackage, JSONObject> {
        final /* synthetic */ String setMin;

        asInterface(String str) {
            this.setMin = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: getMax */
        public JSONObject apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String str = this.setMin;
            Object jSONObject = new JSONObject();
            String max = getrequestmainpackage.getMax(str, false);
            if (JSONObject.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                jSONObject = (JSONObject) new JSONArray(max);
            } else if (max != null) {
                Object obj = null;
                if (max != null) {
                    try {
                        obj = new Gson().fromJson(new org.json.JSONObject(max).toString(), JSONObject.class);
                    } catch (Exception unused) {
                    }
                }
                if (obj != null) {
                    jSONObject = obj;
                }
            }
            return (JSONObject) jSONObject;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getStringList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "splitName");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new getSmallIconId(str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…eListOfString()\n        }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getSmallIconId<T, R> implements RedDotDrawable<getRequestMainPackage, List<String>> {
        final /* synthetic */ String length;

        getSmallIconId(String str) {
            this.length = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: length */
        public List<String> apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            String str = this.length;
            Object jSONArray = new com.alibaba.fastjson.JSONArray();
            String max = getrequestmainpackage.getMax(str, false);
            if (com.alibaba.fastjson.JSONArray.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                jSONArray = (com.alibaba.fastjson.JSONArray) new JSONArray(max);
            } else if (max != null) {
                Object obj = null;
                if (max != null) {
                    try {
                        obj = new Gson().fromJson(new org.json.JSONObject(max).toString(), com.alibaba.fastjson.JSONArray.class);
                    } catch (Exception unused) {
                    }
                }
                if (obj != null) {
                    jSONArray = obj;
                }
            }
            return getFantasyFontFamily.toMutableListOfString((com.alibaba.fastjson.JSONArray) jSONArray);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedInboxTabEnable() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(IconCompatParcelizer.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }

    private final TitleBarRightButtonView.AnonymousClass1<List<String>> getGnBindingBenefitsKey() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(onPostMessage.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<JsonReader$Token> getGnDetailBindingBenefit(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new onMessageChannelReady(str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/config/model/BindingBenefitEntity;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class onMessageChannelReady<T, R> implements RedDotDrawable<getRequestMainPackage, JsonReader$Token> {
        final /* synthetic */ String setMax;

        onMessageChannelReady(String str) {
            this.setMax = str;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
        /* renamed from: setMax */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o.JsonReader$Token apply(@org.jetbrains.annotations.NotNull o.getRequestMainPackage r4) {
            /*
                r3 = this;
                java.lang.String r0 = "ttUser"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = r3.setMax
                r1 = 0
                java.lang.String r4 = r4.getMax((java.lang.String) r0, (boolean) r1)
                java.lang.Class<o.JsonReader$Token> r0 = o.JsonReader$Token.class
                java.lang.Class<org.json.JSONArray> r1 = org.json.JSONArray.class
                boolean r0 = r0.isAssignableFrom(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0025
                org.json.JSONArray r0 = new org.json.JSONArray
                if (r4 != 0) goto L_0x001e
                java.lang.String r4 = ""
            L_0x001e:
                r0.<init>(r4)
                r1 = r0
                o.JsonReader$Token r1 = (o.JsonReader$Token) r1
                goto L_0x0047
            L_0x0025:
                if (r4 == 0) goto L_0x0044
                if (r4 != 0) goto L_0x002b
            L_0x0029:
                r4 = r1
                goto L_0x003f
            L_0x002b:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0029 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0029 }
                com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0029 }
                r4.<init>()     // Catch:{ Exception -> 0x0029 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0029 }
                java.lang.Class<o.JsonReader$Token> r2 = o.JsonReader$Token.class
                java.lang.Object r4 = r4.fromJson((java.lang.String) r0, r2)     // Catch:{ Exception -> 0x0029 }
            L_0x003f:
                if (r4 != 0) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r1 = r4
                goto L_0x0047
            L_0x0044:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            L_0x0047:
                o.JsonReader$Token r1 = (o.JsonReader$Token) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppUtils.onMessageChannelReady.apply(o.getRequestMainPackage):o.JsonReader$Token");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled() {
        return getBooleanUserTraffic("feature_global_network", true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("feature_global_network_cscanb");
    }

    @Nullable
    public final TitleBarRightButtonView.AnonymousClass1<setActivityClz> isChangeUsernameEnabled() {
        return getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(INotificationSideChannel.Default.getMax);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<findApp> getFeaturePromoAds() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(invoke.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<postWebMessage> getShareReferralMessageTemplate() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityService.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getDecodeQrTimeout() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<Long> map = fromCallable.map(toIntRange.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD… ).toLong()\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<shouldOverrideUrlLoading> getShowAlipayConnectBrandConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityCallback.Stub.Proxy.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<startApp> getPromoAdsLocationConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(validateRelationship.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass12> getNearbyConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(mayLaunchUrl.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> getSkuExplore() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(ITrustedWebActivityCallback.Stub.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU….toObservable()\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureInvestmentEnabled() {
        return getBooleanUserTrafficOnceReadyWithFallbackAMCS("home_widget_investment");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/config/source/split/SplitConfigEntityData$Companion;", "", "()V", "DEFAULT_DECODE_QR_TIMEOUT", "", "DEFAULT_MAX_RECENT_BANK", "DEFAULT_MAX_RECENT_CONTACT", "DEFAULT_MAX_SAVED_BANK", "DEFAULT_TIMEOUT_PERIOD", "", "EMPTY_JSON_ARRAY", "", "TNC_REFERRAL_URL", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
