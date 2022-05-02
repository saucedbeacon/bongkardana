package com.alipay.bis.common.service.facade.gw.pbmodel.face;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BisFaceUploadContent extends Message {
    public static final List<BisFaceImage> DEFAULT_ACTIONIMAGES = Collections.emptyList();
    public static final List<BisFaceImage> DEFAULT_ALIVEIMAGES = Collections.emptyList();
    public static final List<BisFaceImage> DEFAULT_MONITORIMAGES = Collections.emptyList();
    public static final List<BisVideo> DEFAULT_VIDEO = Collections.emptyList();
    public static final int TAG_ACTIONIMAGES = 2;
    public static final int TAG_ALIVEIMAGES = 1;
    public static final int TAG_MONITORIMAGES = 4;
    public static final int TAG_PANOIMAGE = 3;
    public static final int TAG_VIDEO = 5;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<BisFaceImage> actionImages;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<BisFaceImage> aliveImages;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public List<BisFaceImage> monitorImages;
    @ProtoField(tag = 3)
    public BisFaceImage panoImage;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public List<BisVideo> video;

    public BisFaceUploadContent(BisFaceUploadContent bisFaceUploadContent) {
        super(bisFaceUploadContent);
        if (bisFaceUploadContent != null) {
            this.aliveImages = copyOf(bisFaceUploadContent.aliveImages);
            this.actionImages = copyOf(bisFaceUploadContent.actionImages);
            this.panoImage = bisFaceUploadContent.panoImage;
            this.monitorImages = copyOf(bisFaceUploadContent.monitorImages);
            this.video = copyOf(bisFaceUploadContent.video);
        }
    }

    public BisFaceUploadContent() {
    }

    public final BisFaceUploadContent fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.aliveImages = immutableCopyOf((List) obj);
        } else if (i == 2) {
            this.actionImages = immutableCopyOf((List) obj);
        } else if (i == 3) {
            this.panoImage = (BisFaceImage) obj;
        } else if (i == 4) {
            this.monitorImages = immutableCopyOf((List) obj);
        } else if (i == 5) {
            this.video = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisFaceUploadContent)) {
            return false;
        }
        BisFaceUploadContent bisFaceUploadContent = (BisFaceUploadContent) obj;
        return equals((List<?>) this.aliveImages, (List<?>) bisFaceUploadContent.aliveImages) && equals((List<?>) this.actionImages, (List<?>) bisFaceUploadContent.actionImages) && equals((Object) this.panoImage, (Object) bisFaceUploadContent.panoImage) && equals((List<?>) this.monitorImages, (List<?>) bisFaceUploadContent.monitorImages) && equals((List<?>) this.video, (List<?>) bisFaceUploadContent.video);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        List<BisFaceImage> list = this.aliveImages;
        int i2 = 1;
        int hashCode = (list != null ? list.hashCode() : 1) * 37;
        List<BisFaceImage> list2 = this.actionImages;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 1)) * 37;
        BisFaceImage bisFaceImage = this.panoImage;
        int hashCode3 = (hashCode2 + (bisFaceImage != null ? bisFaceImage.hashCode() : 0)) * 37;
        List<BisFaceImage> list3 = this.monitorImages;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 1)) * 37;
        List<BisVideo> list4 = this.video;
        if (list4 != null) {
            i2 = list4.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }
}
