package net.Lex.sd.data.client.provider;

import net.Lex.sd.data.common.ItemsSD;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupSD extends ItemGroup
{
    public ItemGroupSD(){
        super("SD");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemsSD.UPGRADE_MODULE.get()); //Put main item here, I think the MultiTool would fit
    }
}
