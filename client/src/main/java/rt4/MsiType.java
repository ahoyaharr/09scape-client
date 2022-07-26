package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class MsiType {

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	public int spriteId;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!wa;I)V")
	public final void decode(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method11(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!ek;")
	public final SoftwareIndexedSprite getSprite(@OriginalArg(0) int arg0) {
		@Pc(17) SoftwareIndexedSprite sprite = (SoftwareIndexedSprite) MsiTypeList.sprites.get(arg0 << 16 | this.spriteId);
		if (sprite != null) {
			return sprite;
		}
		MsiTypeList.spritesArchive.isFileReady(this.spriteId);
		sprite = SpriteLoader.loadSoftwareIndexedSprite(this.spriteId, MsiTypeList.spritesArchive);
		if (sprite != null) {
			/* The regular client runs `sprite.adjustPalette` using random offsets created in `MsiTypeList`,
			* but that sometimes produced unattractive colors. */
			sprite.innerWidth = sprite.width;
			sprite.innerHeight = sprite.height;
			for (@Pc(59) int local59 = 0; local59 < arg0; local59++) {
				sprite.flipVertical();
			}
			MsiTypeList.sprites.put(sprite, arg0 << 16 | this.spriteId);
		}
		return sprite;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!wa;II)V")
	private void method11(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.spriteId = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt11 = arg1.g3();
		} else if (arg0 == 3) {
			this.aBoolean2 = true;
		} else if (arg0 == 4) {
			this.spriteId = -1;
		}
	}
}
