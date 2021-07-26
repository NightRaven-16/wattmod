package wattmod.wattmod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    // create DeferredRegister object
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Wattmod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Wattmod.MODID);

    public static void init () {
        //attach DeferredRegister to the event bus
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // register block
    public static final RegistryObject<Block> ICHOR_ORE = BLOCKS.register("ichor_ore", () ->
            new Block(
                    Block.Properties
                            .create(Material.IRON)
                            .hardnessAndResistance(5.0f, 6.0f)
                            .sound(SoundType.STONE)
                            .harvestLevel(1)
                            .harvestTool(ToolType.PICKAXE)

            )
        );

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () ->
            new Block(
                    Block.Properties
                            .create(Material.IRON)
                            .hardnessAndResistance(5.0f, 6.0f)
                            .sound(SoundType.STONE)
                            .harvestLevel(1)
                            .harvestTool(ToolType.PICKAXE)

            )
    );

    //register item\

    public static final RegistryObject<Item> ICHOR_INGOT = ITEMS.register("ichor_ingot", () ->
            new Item(
                    new Item.Properties().group(ItemGroup.MATERIALS)
            )
    );

    public static final RegistryObject<Item> ICHOR_SCRAP = ITEMS.register("ichor_scrap", () ->
            new Item(
                    new Item.Properties().group(ItemGroup.MATERIALS)
            )
    );

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () ->
            new Item(
                    new Item.Properties().group(ItemGroup.COMBAT)
            )
    );

    public static final RegistryObject<Item> ICHOR_ORE_ITEM = ITEMS.register("ichor_ore", () ->
            new BlockItem(
                    ICHOR_ORE.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
            )
    );

    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () ->
            new BlockItem(
                    STEEL_BLOCK.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
            )
    );
}
