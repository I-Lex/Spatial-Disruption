package net.Lex.sd.data.common;

import net.Lex.sd.SpatialDisruption;
import net.Lex.sd.data.common.item.UpgradeModule;
import net.Lex.sd.setup.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ItemsSD {
    public static void register() {}

    public static final RegistryObject<Item> UPGRADE_MODULE = Registration.ITEMS.register("upgrade_module", UpgradeModule::new);
}
