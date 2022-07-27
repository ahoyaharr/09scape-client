package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MiniMap {
	@OriginalMember(owner = "client!ke", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
	public static final int[] locId = new int[1000];
	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
	public static final int[] locX = new int[1000];
	@OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
	public static final int[] locZ = new int[1000];
	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[Lclient!nc;")
	public static final MapMarker[] hintMapMarkers = new MapMarker[4];
	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_668 = JagString.parse("Hidden)2use");
	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!mm;")
	public static SoftwareSprite softwareSprite;
	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!qf;")
	public static Sprite sprite;
	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int locs = 0;
	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int state = 0;
	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static int zoom = 0;
	@OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
	public static int hiddenMinimapYaw = 0;
	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public static int anInt5755 = 2;
	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public static int anInt4262 = 1;
	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public static int anInt2252 = 0;
	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4075 = -1;
	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt5073 = -1;
	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt5062;

	final static byte MAP_SIZE = 104;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIII)V")
	public static void renderTile(@OriginalArg(0) int[] pixels, @OriginalArg(1) int index, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Tile local7 = SceneGraph.tiles[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) PlainTile local13 = local7.plainTile;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4871;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					pixels[index] = local18;
					pixels[index + 1] = local18;
					pixels[index + 2] = local18;
					pixels[index + 3] = local18;
					index += 512;
				}
			}
			return;
		}
		@Pc(58) ShapedTile local58 = local7.shapedTile;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1966;
		@Pc(67) int local67 = local58.anInt1967;
		@Pc(70) int local70 = local58.anInt1969;
		@Pc(73) int local73 = local58.anInt1968;
		@Pc(77) int[] local77 = anIntArrayArray24[local23];
		@Pc(81) int[] local81 = anIntArrayArray46[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				pixels[index] = local77[local81[local83++]] == 0 ? local70 : local73;
				pixels[index + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				pixels[index + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				pixels[index + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				index += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				pixels[index] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				pixels[index + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				pixels[index + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				pixels[index + 3] = local73;
			}
			index += 512;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
	public static boolean renderMap(@OriginalArg(1) int arg0) {
//		@Pc(35) int randomAngle2; // Now locally scoped
		@Pc(37) int local37;
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (softwareSprite == null) {
			if (GlRenderer.enabled || sprite == null) {
				softwareSprite = new SoftwareSprite(512, 512);
			} else {
				softwareSprite = (SoftwareSprite) sprite;
			}
			@Pc(32) int[] local32 = softwareSprite.pixels;
			int pixelsInSprite = local32.length;
			for (local37 = 0; local37 < pixelsInSprite; local37++) {
				local32[local37] = 1;
			}
			// TODO: We should be able to extend the range that icons are drawn here
			for (local37 = 1; local37 < 103; local37++) {
				local76 = 4 * 512 * (103 - local37) + 24628;
				for (local80 = 1; local80 < 103; local80++) {
					if ((SceneGraph.tileFlags[arg0][local80][local37] & 0x18) == 0) {
						renderTile(local32, local76, arg0, local80, local37);
					}
					if (arg0 < 3 && (SceneGraph.tileFlags[arg0 + 1][local80][local37] & 0x8) != 0) {
						renderTile(local32, local76, arg0 + 1, local80, local37);
					}
					local76 += 4;
				}
			}
			locs = 0;
			for (local37 = 0; local37 < MAP_SIZE; local37++) {
				for (local76 = 0; local76 < MAP_SIZE; local76++) {
					@Pc(169) long local169 = SceneGraph.getGroundDecorKey(Player.level, local37 + 0, local76);
					if (local169 != 0L) {
						@Pc(184) LocType locType = LocTypeList.get((int) (local169 >>> 32) & Integer.MAX_VALUE);
						@Pc(187) int mapElementID = locType.mapElement;
						if (locType.multiLocs != null) {
							for (int i = 0; i < locType.multiLocs.length; i++) {
								if (locType.multiLocs[i] != -1) {
									@Pc(216) LocType childLocType = LocTypeList.get(locType.multiLocs[i]);
									if (childLocType.mapElement >= 0) {
										mapElementID = childLocType.mapElement;
										break;
									}
								}
							}
						}
						if (mapElementID >= 0) {
							@Pc(237) int local237 = local76;
							int local194 = local37;
							locId[locs] = locType.id;
							locX[locs] = local194;
							locZ[locs] = local237;
							locs++;
						}
					}
				}
			}
		}
		softwareSprite.makeTarget();
		@Pc(455) int randomAngle1 = ((int) (0.5f * 20.0D) + 238 - 10 << 8) + ((int) (0.5f * 20.0D) + 238 - 10 << 16) + (int) (0.5f * 20.0D) + 228;
		int randomAngle2 = (int) (0.5f * 20.0D) + 238 - 10 << 16;
		for (int i = 1; i < 103; i++) { // Tile coord on minimap?
			for (int j = 1; j < 103; j++) { // Tile coord on minimap?
				if ((SceneGraph.tileFlags[arg0][j][i] & 0x18) == 0 && !method3109(j, randomAngle1, i, randomAngle2, arg0)) {
					if (GlRenderer.enabled) {
						SoftwareRaster.pixels = null;
					} else {
						SoftwareRaster.frameBuffer.makeTarget();
					}
					return false;
				}
				if (arg0 < 3 && (SceneGraph.tileFlags[arg0 + 1][j][i] & 0x8) != 0 && !method3109(j, randomAngle1, i, randomAngle2, arg0 + 1)) {
					if (GlRenderer.enabled) {
						SoftwareRaster.pixels = null;
					} else {
						SoftwareRaster.frameBuffer.makeTarget();
					}
					return false;
				}
			}
		}
		if (GlRenderer.enabled) {
			@Pc(576) int[] local576 = softwareSprite.pixels;
			local76 = local576.length;
			for (local80 = 0; local80 < local76; local80++) {
				if (local576[local80] == 0) {
					local576[local80] = 1;
				}
			}
			sprite = new GlSprite(softwareSprite);
		} else {
			sprite = softwareSprite;
		}
		if (GlRenderer.enabled) {
			SoftwareRaster.pixels = null;
		} else {
			SoftwareRaster.frameBuffer.makeTarget();
		}
		softwareSprite = null;
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIILclient!be;)V")
	public static void render(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		client.audioLoop();
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg2, arg1, arg2 + arg3.width, arg1 + arg3.height);
		} else {
			SoftwareRaster.setClip(arg2, arg1, arg2 + arg3.width, arg1 + arg3.height);
		}
		if (state != 2 && state != 5 && sprite != null) {
			@Pc(48) int local48 = hiddenMinimapYaw + (int) Camera.yawTarget & 0x7FF;
			@Pc(57) int local57 = PlayerList.self.xFine / 32 + 48;
			@Pc(67) int local67 = 464 - PlayerList.self.zFine / 32;
			if (GlRenderer.enabled) {
				((GlSprite) sprite).renderRotatedTransparent(arg2, arg1, arg3.width, arg3.height, local57, local67, local48, zoom + 256, (GlSprite) arg3.method489(false));
			} else {
				((SoftwareSprite) sprite).renderRotated(arg2, arg1, arg3.width, arg3.height, local57, local67, local48, zoom + 256, arg3.anIntArray37, arg3.anIntArray45);
			}
			@Pc(146) int local146;
			@Pc(181) int local181;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(231) int local231;
			@Pc(200) int local200;
			@Pc(239) int local239;
			@Pc(271) int local271;
			if (LoginManager.mapElementList != null) {
				for (@Pc(117) int local117 = 0; local117 < LoginManager.mapElementList.anInt5074; local117++) {
					if (LoginManager.mapElementList.method3892(local117)) {
						local146 = (LoginManager.mapElementList.aShortArray73[local117] - Camera.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						local150 = MathUtils.sin[local48];
						local154 = MathUtils.cos[local48];
						@Pc(156) Font local156 = Fonts.p11Full;
						@Pc(164) int local164 = local150 * 256 / (zoom + 256);
						local181 = (LoginManager.mapElementList.aShortArray72[local117] - Camera.originZ) * 4 + 2 - PlayerList.self.zFine / 32;
						@Pc(189) int local189 = local154 * 256 / (zoom + 256);
						local200 = local181 * local189 - local146 * local164 >> 16;
						if (LoginManager.mapElementList.method3894(local117) == 1) {
							local156 = Fonts.p12Full;
						}
						if (LoginManager.mapElementList.method3894(local117) == 2) {
							local156 = Fonts.b12Full;
						}
						local231 = local164 * local181 + local189 * local146 >> 16;
						local239 = local156.getMaxLineWidth(LoginManager.mapElementList.aClass100Array153[local117], 100);
						@Pc(245) int local245 = local231 - local239 / 2;
						if (local245 >= -arg3.width && local245 <= arg3.width && local200 >= -arg3.height && local200 <= arg3.height) {
							local271 = 16777215;
							if (LoginManager.mapElementList.anIntArray444[local117] != -1) {
								local271 = LoginManager.mapElementList.anIntArray444[local117];
							}
							if (GlRenderer.enabled) {
								GlFont.method1188((GlSprite) arg3.method489(false));
							} else {
								SoftwareRaster.method2486(arg3.anIntArray37, arg3.anIntArray45);
							}
							local156.renderParagraphAlpha(LoginManager.mapElementList.aClass100Array153[local117], arg2 + local245 + arg3.width / 2, arg1 + arg3.height / 2 + -local200, local239, 50, local271, 0, 1, 0, 0);
							if (GlRenderer.enabled) {
								GlFont.method1173();
							} else {
								SoftwareRaster.method2482();
							}
						}
					}
				}
			}

			// Minimap draw area icons (e.g., banks)
			for (local146 = 0; local146 < locs; local146++) {
				local181 = locX[local146] * 4 + 2 - PlayerList.self.xFine / 32;
				local150 = locZ[local146] * 4 + 2 - PlayerList.self.zFine / 32;
				@Pc(382) LocType locType = LocTypeList.get(locId[local146]);
				if (locType.multiLocs != null) {
					locType = locType.getMultiLoc();
					if (locType == null || locType.mapElement == -1) {
						continue;
					}
				}
				drawMinimapIcons(arg3, Sprites.mapfuncs[locType.mapElement], local150, local181, arg1, arg2);
			}

			// Minimap draw item dots
			if (!HighlightConfig.minimapHideItems) {
				for (int i = 0; i < MAP_SIZE; i++) {
					for (int j = 0; j < MAP_SIZE; j++) {
						@Pc(439) LinkedList itemStackOnTile = SceneGraph.objStacks[Player.level][i][j];
						if (itemStackOnTile != null) {
							Sprite itemDot = Sprites.mapdots[0];

							for (ObjStackNode current = (ObjStackNode) itemStackOnTile.head(); current != null; current = (ObjStackNode) itemStackOnTile.next()) {
								ObjType objType = ObjTypeList.get(current.value.type);
								if (HighlightConfig.itemHighlightIDs.contains(objType.id)) {
									itemDot = Sprites.mapdots[3];
								}
							}


							int minimapX = i * 4 + 2 - PlayerList.self.xFine / 32;
							int minimapY = j * 4 + 2 - PlayerList.self.zFine / 32;
							drawMinimapIcons(arg3, itemDot, minimapY, minimapX, arg1, arg2);
						}
					}
				}
			}

			// Minimap draw NPC dots
			if (!HighlightConfig.minimapHideNPC) {
				for (int i = 0; i < NpcList.size; i++) {
					@Pc(498) Npc npc = NpcList.npcs[NpcList.ids[i]];
					if (npc != null && npc.isVisible()) {
						@Pc(507) NpcType npcType = npc.type;
						if (npcType != null && npcType.multiNpcs != null) {
							npcType = npcType.getMultiNpc();
						}
						if (npcType != null && npcType.aBoolean184 && npcType.aBoolean183) {
							local154 = npc.xFine / 32 - PlayerList.self.xFine / 32;
							local231 = npc.zFine / 32 - PlayerList.self.zFine / 32;
							if (npcType.anInt3739 == -1) {
								drawMinimapIcons(arg3, Sprites.mapdots[1], local231, local154, arg1, arg2);
							} else {
								drawMinimapIcons(arg3, Sprites.mapfuncs[npcType.anInt3739], local231, local154, arg1, arg2);
							}
						}
					}
				}
			}

			// Minimap draw player dots
			if (!HighlightConfig.minimapHidePlayers) {
				for (local146 = 0; local146 < PlayerList.size; local146++) {
					@Pc(591) Player local591 = PlayerList.players[PlayerList.ids[local146]];
					if (local591 != null && local591.isVisible()) {
						local154 = local591.zFine / 32 - PlayerList.self.zFine / 32;
						local150 = local591.xFine / 32 - PlayerList.self.xFine / 32;
						@Pc(624) long local624 = local591.username.encode37();
						@Pc(626) boolean local626 = false;
						for (local239 = 0; local239 < FriendsList.size; local239++) {
							if (local624 == FriendsList.encodedUsernames[local239] && FriendsList.worlds[local239] != 0) {
								local626 = true;
								break;
							}
						}
						@Pc(660) boolean local660 = false;
						for (local271 = 0; local271 < ClanChat.size; local271++) {
							if (local624 == ClanChat.members[local271].key) {
								local660 = true;
								break;
							}
						}
						@Pc(682) boolean local682 = PlayerList.self.anInt1650 != 0 && local591.anInt1650 != 0 && local591.anInt1650 == PlayerList.self.anInt1650;
						if (local626) {
							drawMinimapIcons(arg3, Sprites.mapdots[3], local154, local150, arg1, arg2);
						} else if (local660) {
							drawMinimapIcons(arg3, Sprites.mapdots[5], local154, local150, arg1, arg2);
						} else if (local682) {
							drawMinimapIcons(arg3, Sprites.mapdots[4], local154, local150, arg1, arg2);
						} else {
							drawMinimapIcons(arg3, Sprites.mapdots[2], local154, local150, arg1, arg2);
						}
					}
				}
			}

			@Pc(756) MapMarker[] local756 = hintMapMarkers;
			for (local181 = 0; local181 < local756.length; local181++) {
				@Pc(770) MapMarker local770 = local756[local181];
				if (local770 != null && local770.type != 0 && client.loop % 20 < 10) {
					if (local770.type == 1 && local770.actorTargetId >= 0 && local770.actorTargetId < NpcList.npcs.length) {
						@Pc(804) Npc local804 = NpcList.npcs[local770.actorTargetId];
						if (local804 != null) {
							local231 = local804.xFine / 32 - PlayerList.self.xFine / 32;
							local200 = local804.zFine / 32 - PlayerList.self.zFine / 32;
							method1960(local770.anInt4048, arg1, arg2, local231, local200, arg3);
						}
					}
					if (local770.type == 2) {
						local154 = (local770.targetX - Camera.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						local231 = (-Camera.originZ + local770.anInt4046) * 4 + 2 - PlayerList.self.zFine / 32;
						method1960(local770.anInt4048, arg1, arg2, local154, local231, arg3);
					}
					if (local770.type == 10 && local770.actorTargetId >= 0 && PlayerList.players.length > local770.actorTargetId) {
						@Pc(905) Player local905 = PlayerList.players[local770.actorTargetId];
						if (local905 != null) {
							local200 = local905.zFine / 32 - PlayerList.self.zFine / 32;
							local231 = local905.xFine / 32 - PlayerList.self.xFine / 32;
							method1960(local770.anInt4048, arg1, arg2, local231, local200, arg3);
						}
					}
				}
			}
			if (LoginManager.mapFlagX != 0) {
				local146 = LoginManager.mapFlagX * 4 + 2 - PlayerList.self.xFine / 32;
				local181 = LoginManager.mapFlagZ * 4 + 2 - PlayerList.self.zFine / 32;
				drawMinimapIcons(arg3, Sprites.mapflags, local181, local146, arg1, arg2);
			}
			if (GlRenderer.enabled) {
				GlRaster.fillRect(arg2 + arg3.width / 2 - 1, arg1 + -1 - -(arg3.height / 2), 3, 3, 16777215);
			} else {
				SoftwareRaster.fillRect(arg3.width / 2 + arg2 - 1, arg3.height / 2 + -1 + arg1, 3, 3, 16777215);
			}
		} else if (GlRenderer.enabled) {
			@Pc(1041) Sprite local1041 = arg3.method489(false);
			if (local1041 != null) {
				local1041.render(arg2, arg1);
			}
		} else {
			SoftwareRaster.method2504(arg2, arg1, arg3.anIntArray37, arg3.anIntArray45);
		}
		InterfaceList.rectangleRedraw[arg0] = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!be;Lclient!qf;IIIBI)V")
	public static void drawMinimapIcons(@OriginalArg(0) Component component, @OriginalArg(1) Sprite mapSprite, @OriginalArg(2) int drawPosY, @OriginalArg(3) int drawPosX, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (mapSprite == null) {
			return;
		}
		@Pc(21) int local21 = drawPosX * drawPosX + drawPosY * drawPosY;
		@Pc(27) int local27 = hiddenMinimapYaw + (int) Camera.yawTarget & 0x7FF;
		@Pc(39) int local39 = Math.max(component.width / 2, component.height / 2) + 10;
		if (local39 * local39 < local21) {
			return;
		}
		@Pc(50) int local50 = MathUtils.sin[local27];
		@Pc(58) int local58 = local50 * 256 / (zoom + 256);
		@Pc(62) int local62 = MathUtils.cos[local27];
		@Pc(70) int local70 = local62 * 256 / (zoom + 256);
		@Pc(81) int local81 = local58 * drawPosY + drawPosX * local70 >> 16;
		@Pc(92) int local92 = local70 * drawPosY - drawPosX * local58 >> 16;
		if (GlRenderer.enabled) {
			((GlSprite) mapSprite).method1425(component.width / 2 + arg5 + local81 - mapSprite.anInt1860 / 2, component.height / 2 + arg4 - (local92 + mapSprite.anInt1866 / 2), (GlSprite) component.method489(false));
		} else {
			((SoftwareSprite) mapSprite).drawMinimapIcon(component.width / 2 + arg5 + local81 - mapSprite.anInt1860 / 2, -(mapSprite.anInt1866 / 2) + component.height / 2 + arg4 + -local92, component.anIntArray37, component.anIntArray45);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIILclient!be;Z)V")
	public static void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Component arg5) {
		@Pc(13) int local13 = arg3 * arg3 + arg4 * arg4;
		if (local13 > 360000) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg5.width / 2, arg5.height / 2);
		if (local30 * local30 >= local13) {
			drawMinimapIcons(arg5, Sprites.mapmarkhints[arg0], arg4, arg3, arg1, arg2);
			return;
		}
		local30 -= 10;
		@Pc(58) int local58 = hiddenMinimapYaw + (int) Camera.yawTarget & 0x7FF;
		@Pc(62) int local62 = MathUtils.cos[local58];
		@Pc(66) int local66 = MathUtils.sin[local58];
		@Pc(74) int local74 = local66 * 256 / (zoom + 256);
		@Pc(82) int local82 = local62 * 256 / (zoom + 256);
		@Pc(93) int local93 = arg4 * local74 + local82 * arg3 >> 16;
		@Pc(104) int local104 = arg4 * local82 - local74 * arg3 >> 16;
		@Pc(110) double local110 = Math.atan2(local93, local104);
		@Pc(117) int local117 = (int) (Math.sin(local110) * (double) local30);
		@Pc(124) int local124 = (int) (Math.cos(local110) * (double) local30);
		if (GlRenderer.enabled) {
			((GlSprite) Sprites.hintMapEdge[arg0]).method1428((arg5.width / 2 + arg2 + local117) * 16, (arg5.height / 2 + arg1 - local124) * 16, (int) (local110 * 10430.378D));
		} else {
			((SoftwareSprite) Sprites.hintMapEdge[arg0]).method306(local117 + arg5.width / 2 + arg2 - 10, arg5.height / 2 + -10 + arg1 + -local124, local110);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!be;B)Lclient!na;")
	public static JagString getTargetVerb(@OriginalArg(0) Component arg0) {
		if (InterfaceList.getServerActiveProperties(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.optionCircumfix == null || arg0.optionCircumfix.trim().length() == 0) {
			return Cheat.qaOpTest ? aClass100_668 : null;
		} else {
			return arg0.optionCircumfix;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!pb;ZIIII)Z")
	public static boolean renderScenery(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) MsiType msiType = MsiTypeList.get(arg1.mapSceneId);
		if (msiType.spriteId == -1) {
			return true;
		}
		if (arg1.mapSceneRotated) {
			@Pc(24) int local24 = arg3 + arg1.mapSceneAngleOffset;
			arg3 = local24 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(42) SoftwareIndexedSprite local42 = msiType.getSprite(arg3);
		if (local42 == null) {
			return false;
		}
		@Pc(49) int local49 = arg1.width;
		@Pc(52) int local52 = arg1.length;
		if ((arg3 & 0x1) == 1) {
			local49 = arg1.length;
			local52 = arg1.width;
		}
		@Pc(66) int local66 = local42.innerWidth;
		@Pc(69) int local69 = local42.innerHeight;
		if (msiType.aBoolean2) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (msiType.anInt11 == 0) {
			local42.method1398(arg0 * 4 + 48, (-local52 + -arg2 + MAP_SIZE) * 4 + 48, local66, local69);
		} else {
			local42.method1390(arg0 * 4 + 48, (-local52 + -arg2 + MAP_SIZE) * 4 + 48, local66, local69, msiType.anInt11);
		}
		return true;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZIII)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 0;
		@Pc(5) MapMarker[] local5 = hintMapMarkers;
		while (local5.length > local3) {
			@Pc(17) MapMarker local17 = local5[local3];
			if (local17 != null && local17.type == 2) {
				ScriptRunner.method1026(arg0 >> 1, arg4, (local17.anInt4046 - Camera.originZ << 7) + local17.anInt4047, local17.anInt4050 * 2, arg2 >> 1, local17.anInt4045 + (local17.targetX - Camera.originX << 7), arg3);
				if (ScriptRunner.anInt1951 > -1 && client.loop % 20 < 10) {
					Sprites.headhints[local17.anInt4048].render(arg1 + ScriptRunner.anInt1951 - 12, arg5 + -28 - -ScriptRunner.anInt548);
				}
			}
			local3++;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIZ)Z")
	public static boolean method3109(@OriginalArg(1) int minimapY, @OriginalArg(2) int randomYOffset, @OriginalArg(3) int minimapX, @OriginalArg(4) int randomXOffset, @OriginalArg(6) int arg4) {
		@Pc(14) long local14 = SceneGraph.getWallKey(arg4, minimapY + 0, minimapX);
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(42) int local42;
		@Pc(46) LocType local46;
		@Pc(65) int local65;
		@Pc(75) int[] local75;
		@Pc(90) int local90;
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) local14 >> 14 & 0x1F;
			local42 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local46 = LocTypeList.get(local42);
			if (local46.mapSceneId == -1) {
				local65 = randomYOffset;
				if (local14 > 0L) {
					local65 = randomXOffset;
				}
				local75 = SoftwareRaster.pixels;
				local90 = (52736 - minimapX * 512) * 4 + minimapY * 4 + 24624;
				if (local35 == 0 || local35 == 2) {
					if (local28 == 0) {
						local75[local90] = local65;
						local75[local90 + 512] = local65;
						local75[local90 + 1024] = local65;
						local75[local90 + 1536] = local65;
					} else if (local28 == 1) {
						local75[local90] = local65;
						local75[local90 + 1] = local65;
						local75[local90 + 2] = local65;
						local75[local90 + 3] = local65;
					} else if (local28 == 2) {
						local75[local90 + 3] = local65;
						local75[local90 + 3 + 512] = local65;
						local75[local90 + 3 + 1024] = local65;
						local75[local90 + 3 + 1536] = local65;
					} else if (local28 == 3) {
						local75[local90 + 1536] = local65;
						local75[local90 + 1536 + 1] = local65;
						local75[local90 + 1538] = local65;
						local75[local90 + 3 + 1536] = local65;
					}
				}
				if (local35 == 3) {
					if (local28 == 0) {
						local75[local90] = local65;
					} else if (local28 == 1) {
						local75[local90 + 3] = local65;
					} else if (local28 == 2) {
						local75[local90 + 3 + 1536] = local65;
					} else if (local28 == 3) {
						local75[local90 + 1536] = local65;
					}
				}
				if (local35 == 2) {
					if (local28 == 3) {
						local75[local90] = local65;
						local75[local90 + 512] = local65;
						local75[local90 + 1024] = local65;
						local75[local90 + 1536] = local65;
					} else if (local28 == 0) {
						local75[local90] = local65;
						local75[local90 + 1] = local65;
						local75[local90 + 2] = local65;
						local75[local90 + 3] = local65;
					} else if (local28 == 1) {
						local75[local90 + 3] = local65;
						local75[local90 + 512 + 3] = local65;
						local75[local90 + 1024 + 3] = local65;
						local75[local90 + 1536 + 3] = local65;
					} else if (local28 == 2) {
						local75[local90 + 1536] = local65;
						local75[local90 + 1536 + 1] = local65;
						local75[local90 + 1536 + 2] = local65;
						local75[local90 + 1539] = local65;
					}
				}
			} else if (!renderScenery(minimapY, local46, minimapX, local28)) {
				return false;
			}
		}
		local14 = SceneGraph.getSceneryKey(arg4, minimapY + 0, minimapX);
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) local14 >> 14 & 0x1F;
			local42 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			local46 = LocTypeList.get(local42);
			if (local46.mapSceneId == -1) {
				if (local35 == 9) {
					local65 = 15658734;
					if (local14 > 0L) {
						local65 = 15597568;
					}
					local90 = minimapY * 4 + (103 - minimapX) * 2048 + 24624;
					local75 = SoftwareRaster.pixels;
					if (local28 == 0 || local28 == 2) {
						local75[local90 + 1536] = local65;
						local75[local90 + 1025] = local65;
						local75[local90 + 512 + 2] = local65;
						local75[local90 + 3] = local65;
					} else {
						local75[local90] = local65;
						local75[local90 + 512 + 1] = local65;
						local75[local90 + 1024 + 2] = local65;
						local75[local90 + 1536 + 3] = local65;
					}
				}
			} else if (!renderScenery(minimapY, local46, minimapX, local28)) {
				return false;
			}
		}
		local14 = SceneGraph.getGroundDecorKey(arg4, minimapY + 0, minimapX);
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			@Pc(586) LocType local586 = LocTypeList.get(local35);
			return local586.mapSceneId == -1 || renderScenery(minimapY, local586, minimapX, local28);
		}
		return true;
	}
}
