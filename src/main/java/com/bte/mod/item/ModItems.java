package com.bte.mod.item;

import com.bte.mod.BTEMod;
import com.bte.mod.item.tool.ItemPickaxe;
import com.bte.mod.item.tool.ItemSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Timeout on 2017-08-20.
 */
public class ModItems {
    public static ItemBase copperDust = new ItemBase("copper_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase tinDust = new ItemBase("tin_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase aluminumDust = new ItemBase("aluminum_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase bronzeDust = new ItemBase("bronze_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ironDust = new ItemBase("iron_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase goldDust = new ItemBase("gold_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase coalDust = new ItemBase("coal_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase carbonatedIronDust = new ItemBase("carbonated_iron_dust").setCreativeTab(CreativeTabs.MATERIALS);


    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotTin = new ItemBase("ingot_tin").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotAluminum = new ItemBase("ingot_aluminum").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotSteel = new ItemBase("ingot_steel").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotBronze = new ItemBase("ingot_bronze").setCreativeTab(CreativeTabs.MATERIALS);

    public static ItemBase steelRod = new ItemBase("steel_rod").setCreativeTab(CreativeTabs.MATERIALS);

    public static ItemSword moraKnife = new ItemSword(BTEMod.steelToolMaterial,"mora_knife");
    public static ItemSword steelSword = new ItemSword(BTEMod.steelToolMaterial,"steel_sword");
    public static ItemSword bronzeSword = new ItemSword(BTEMod.bronzeToolMaterial,"bronze_sword");

    public static ItemPickaxe steelPickaxe = new ItemPickaxe(BTEMod.steelToolMaterial,"steel_pickaxe");
    public static ItemPickaxe bronzePickaxe = new ItemPickaxe(BTEMod.bronzeToolMaterial,"bronze_pickaxe");

    public static ItemCornSeed cornSeed = new ItemCornSeed();
    public static ItemBase corn = new ItemBase("corn").setCreativeTab(CreativeTabs.FOOD);

    public static ItemBattery battery = new ItemBattery();

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                copperDust,
                tinDust,
                aluminumDust,
                bronzeDust,
                ironDust,
                goldDust,
                coalDust,
                carbonatedIronDust,

                ingotCopper,
                ingotTin,
                ingotAluminum,
                ingotSteel,
                ingotBronze,

                steelRod,

                moraKnife,
                steelSword,
                bronzeSword,

                steelPickaxe,
                bronzePickaxe,

                cornSeed,
                corn,

                battery
        );
    }

    public static void registerModels() {
        copperDust.registerItemModel();
        tinDust.registerItemModel();
        aluminumDust.registerItemModel();
        bronzeDust.registerItemModel();
        ironDust.registerItemModel();
        goldDust.registerItemModel();
        coalDust.registerItemModel();
        carbonatedIronDust.registerItemModel();

        ingotCopper.registerItemModel();
        ingotTin.registerItemModel();
        ingotAluminum.registerItemModel();
        ingotSteel.registerItemModel();
        ingotBronze.registerItemModel();

        steelRod.registerItemModel();

        moraKnife.registerItemModel();
        steelSword.registerItemModel();
        bronzeSword.registerItemModel();
        steelPickaxe.registerItemModel();
        bronzePickaxe.registerItemModel();

        cornSeed.registerItemModel();
        corn.registerItemModel();

        battery.registerItemModel();
    }

}