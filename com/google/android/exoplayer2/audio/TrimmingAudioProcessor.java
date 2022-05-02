package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class TrimmingAudioProcessor implements AudioProcessor {
    private static final int OUTPUT_ENCODING = 2;
    private ByteBuffer buffer = EMPTY_BUFFER;
    private int bytesPerFrame;
    private int channelCount = -1;
    private byte[] endBuffer = Util.EMPTY_BYTE_ARRAY;
    private int endBufferSize;
    private boolean inputEnded;
    private boolean isActive;
    private ByteBuffer outputBuffer = EMPTY_BUFFER;
    private int pendingTrimStartBytes;
    private boolean receivedInputSinceConfigure;
    private int sampleRateHz = -1;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    public final int getOutputEncoding() {
        return 2;
    }

    public final void setTrimFrameCount(int i, int i2) {
        this.trimStartFrames = i;
        this.trimEndFrames = i2;
    }

    public final void resetTrimmedFrameCount() {
        this.trimmedFrameCount = 0;
    }

    public final long getTrimmedFrameCount() {
        return this.trimmedFrameCount;
    }

    public final boolean configure(int i, int i2, int i3) throws AudioProcessor.UnhandledFormatException {
        if (i3 == 2) {
            int i4 = this.endBufferSize;
            if (i4 > 0) {
                this.trimmedFrameCount += (long) (i4 / this.bytesPerFrame);
            }
            this.channelCount = i2;
            this.sampleRateHz = i;
            int pcmFrameSize = Util.getPcmFrameSize(2, i2);
            this.bytesPerFrame = pcmFrameSize;
            int i5 = this.trimEndFrames;
            this.endBuffer = new byte[(i5 * pcmFrameSize)];
            this.endBufferSize = 0;
            int i6 = this.trimStartFrames;
            this.pendingTrimStartBytes = pcmFrameSize * i6;
            boolean z = this.isActive;
            boolean z2 = (i6 == 0 && i5 == 0) ? false : true;
            this.isActive = z2;
            this.receivedInputSinceConfigure = false;
            if (z != z2) {
                return true;
            }
            return false;
        }
        throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final int getOutputChannelCount() {
        return this.channelCount;
    }

    public final int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    public final void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            this.receivedInputSinceConfigure = true;
            int min = Math.min(i, this.pendingTrimStartBytes);
            this.trimmedFrameCount += (long) (min / this.bytesPerFrame);
            this.pendingTrimStartBytes -= min;
            byteBuffer.position(position + min);
            if (this.pendingTrimStartBytes <= 0) {
                int i2 = i - min;
                int length = (this.endBufferSize + i2) - this.endBuffer.length;
                if (this.buffer.capacity() < length) {
                    this.buffer = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                } else {
                    this.buffer.clear();
                }
                int constrainValue = Util.constrainValue(length, 0, this.endBufferSize);
                this.buffer.put(this.endBuffer, 0, constrainValue);
                int constrainValue2 = Util.constrainValue(length - constrainValue, 0, i2);
                byteBuffer.limit(byteBuffer.position() + constrainValue2);
                this.buffer.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - constrainValue2;
                int i4 = this.endBufferSize - constrainValue;
                this.endBufferSize = i4;
                byte[] bArr = this.endBuffer;
                System.arraycopy(bArr, constrainValue, bArr, 0, i4);
                byteBuffer.get(this.endBuffer, this.endBufferSize, i3);
                this.endBufferSize += i3;
                this.buffer.flip();
                this.outputBuffer = this.buffer;
            }
        }
    }

    public final void queueEndOfStream() {
        this.inputEnded = true;
    }

    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        if (this.inputEnded && this.endBufferSize > 0 && byteBuffer == EMPTY_BUFFER) {
            int capacity = this.buffer.capacity();
            int i = this.endBufferSize;
            if (capacity < i) {
                this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.buffer.clear();
            }
            this.buffer.put(this.endBuffer, 0, this.endBufferSize);
            this.endBufferSize = 0;
            this.buffer.flip();
            byteBuffer = this.buffer;
        }
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    public final boolean isEnded() {
        return this.inputEnded && this.endBufferSize == 0 && this.outputBuffer == EMPTY_BUFFER;
    }

    public final void flush() {
        this.outputBuffer = EMPTY_BUFFER;
        this.inputEnded = false;
        if (this.receivedInputSinceConfigure) {
            this.pendingTrimStartBytes = 0;
        }
        this.endBufferSize = 0;
    }

    public final void reset() {
        flush();
        this.buffer = EMPTY_BUFFER;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.endBuffer = Util.EMPTY_BYTE_ARRAY;
    }
}
