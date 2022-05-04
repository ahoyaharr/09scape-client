package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ColorUtils {
    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
    public static int rgbToHsl(@OriginalArg(1) int arg0) {
        @Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        @Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        @Pc(25) double local25 = 0.0D;
        @Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
        @Pc(34) double local34 = local10;
        @Pc(37) double local37 = (double) 0;
        @Pc(39) double local39 = local10;
        if (local10 > local19) {
            local34 = local19;
        }
        if (local32 < local34) {
            local34 = local32;
        }
        if (local19 > local10) {
            local39 = local19;
        }
        if (local32 > local39) {
            local39 = local32;
        }
        @Pc(72) double local72 = (local34 + local39) / 2.0D;
        if (local34 != local39) {
            if (local72 < 0.5D) {
                local37 = (local39 - local34) / (local34 + local39);
            }
            if (local72 >= 0.5D) {
                local37 = (local39 - local34) / (2.0D - local39 - local34);
            }
            if (local39 == local10) {
                local25 = (local19 - local32) / (local39 - local34);
            } else if (local19 == local39) {
                local25 = (local32 - local10) / (local39 - local34) + 2.0D;
            } else if (local39 == local32) {
                local25 = (local10 - local19) / (-local34 + local39) + 4.0D;
            }
        }
        @Pc(159) int local159 = (int) (local37 * 256.0D);
        @Pc(164) int local164 = (int) (local72 * 256.0D);
        local25 /= 6.0D;
        if (local164 < 0) {
            local164 = 0;
        } else if (local164 > 255) {
            local164 = 255;
        }
        @Pc(188) int local188 = (int) (local25 * 256.0D);
        if (local159 < 0) {
            local159 = 0;
        } else if (local159 > 255) {
            local159 = 255;
        }
        if (local164 > 243) {
            local159 >>= 0x4;
        } else if (local164 > 217) {
            local159 >>= 0x3;
        } else if (local164 > 192) {
            local159 >>= 0x2;
        } else if (local164 > 179) {
            local159 >>= 0x1;
        }
        return (local188 >> 2 << 10) + (local159 >> 5 << 7) + (local164 >> 1);
    }
}