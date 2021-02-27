package net.Lex.sd.data.client.provider;

import net.Lex.sd.SpatialDisruption;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProviderSD extends ItemModelProvider {
    public ItemModelProviderSD(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SpatialDisruption.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("phased_matter", modLoc("block/phased_matter"));
        withExistingParent("perm_phased_matter", modLoc("block/perm_phased_matter"));
        withExistingParent("spawn_setter", modLoc("block/spawn_setter"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "upgrade_module");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
