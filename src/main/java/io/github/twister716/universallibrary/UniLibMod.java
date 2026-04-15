package io.github.twister716.universallibrary;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
/**
 * このライブラリのメインクラス
 */
@Mod(UniLibMod.MODID) // アノテーション。クラスやメソッドに追加で情報を加えるためのもの
public class UniLibMod {
    public static final String MODID = "unilib";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UniLibMod(IEventBus modEventBus, ModContainer modContainer) {
    }
}