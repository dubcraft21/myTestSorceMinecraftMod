package DuBCraft21.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import DuBCraft21.Block.*;
import DuBCraft21.Item.*;
import DuBCraft21.creativeTab.*;
import DuBCraft21.creativeTab.placeholder.*;
import DuBCraft21.Armor.*;
import DuBCraft21.Block.worldgeneration.*;
import DuBCraft21.mob.entity.*;

@Mod(modid = "TutorialMod", name = "Tutorial Mod!", version = "Pre-Alpha 1.0")
public class TutorialMod {
@SidedProxy(clientSide = "DuBCraft21.common.ClientProxy", serverSide = "DuBCraft21.common.CommonProxy")
public static CommonProxy proxy;
//ARMOR IDS//
private static int A1;
private static int A2;
private static int A3;
private static int A4;



public static CreativeTabs testTab = new testTab(CreativeTabs.getNextID(), "testTab");
public static Item testPlaceholder = new testPlaceholder(3111).setUnlocalizedName("testPlaceholder").setTextureName("TutorialMod:testPlaceholder");
public static ArmorMaterial testArmor = EnumHelper.addArmorMaterial("TESTA", 66, new int [] {10,  30, 20, 10}, 30);
public static ToolMaterial test = EnumHelper.addToolMaterial("TEST", 5, 4000, 15.0f, 5, 30);

// armor assignment
public static Item testHelmet = new TestArmor(testArmor, A1, 0).setUnlocalizedName("testHelmet").setTextureName("TutorialMod:testHelmet");
public static Item testChest = new TestArmor(testArmor, A2, 1).setUnlocalizedName("testChest").setTextureName("TutorialMod:testChest");
public static Item testLeggs = new TestArmor(testArmor, A3, 2).setUnlocalizedName("testLeggs").setTextureName("TutorialMod:testLeggs");
public static Item testBoots = new TestArmor(testArmor, A4, 3).setUnlocalizedName("testBoots").setTextureName("TutorialMod:testBoots");

// block assignment
public static Block testOre = new testOre(3000, Material.rock).setBlockName("testOre").setBlockTextureName("TutorialMod:testOre");

//WorldGen
public static testOreWG  worldgen1 = new testOreWG();

// tool assignment
public static Item testPick = new testPick(3100, test).setUnlocalizedName("testPick").setTextureName("TutorialMod:testPick");
public static Item testAxe = new testAxe(3101, test).setUnlocalizedName("testAxe").setTextureName("TutorialMod:testAxe");
public static Item testSword = new testSword(3102, test).setUnlocalizedName("testSword").setTextureName("TutorialMod:testSword");
public static Item testHoe = new testHoe(3103, test).setUnlocalizedName("testHoe").setTextureName("TutorialMod:testHoe");
public static Item testShovle = new testShovle(3104, test).setUnlocalizedName("testShovle").setTextureName("TutorialMod:testShovle");

// item assignment
public static Item testGem = new testGem(3110).setUnlocalizedName("testGem").setTextureName("TutorialMod:testGem");



	public TutorialMod() {
		
		//Block registry
		GameRegistry.registerBlock(testOre, "testOre");
		
		//Item registry
		GameRegistry.registerItem(testPick, "testPick");
		GameRegistry.registerItem(testAxe, "testAxe");
		GameRegistry.registerItem(testSword, "testSword");
		GameRegistry.registerItem(testShovle, "testShovle");
		GameRegistry.registerItem(testHoe, "testHoe");
		GameRegistry.registerItem(testGem, "testGem");
		GameRegistry.registerItem(testPlaceholder, "testPlaceholder");
		GameRegistry.registerItem(testHelmet, "testHelmet");
		GameRegistry.registerItem(testChest, "testChest");
		GameRegistry.registerItem(testLeggs, "testLeggs");
		GameRegistry.registerItem(testBoots, "testBoots");
		
		//Mob registry
		EntityRegistry.registerGlobalEntityID(EntitytestMob.class, "Tes tMob", 301, 0xfffffff, 0x0033ff);
		EntityRegistry.addSpawn(EntitytestMob.class, 10, 2, 4, EnumCreatureType.ambient);
		EntityRegistry.findGlobalUniqueEntityId();
		
		// recipes
		GameRegistry.addRecipe(new ItemStack(testPick, 1), new Object [] {
			"XXX", " s ", " s ", 'X', testGem, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(testShovle, 1), new Object [] { 
			" x ", " s ", " s ", 'x', testGem, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(testAxe, 1), new Object [] {
			" xx", " sx", " s ", 'x', testGem, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(testSword, 1), new Object [] {
			" x ", " x ", " s ", 'x', testGem, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(testHoe, 1), new Object [] {
			" xx", " s ", " s ", 'x', testGem, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(testHelmet, 1), new Object [] {
			"xxx", "x x", 'x', testGem
		});
		GameRegistry.addRecipe(new ItemStack(testChest, 1), new Object [] {
			"x x", "xxx", "xxx", 'x', testGem
		});
		GameRegistry.addRecipe(new ItemStack(testLeggs, 1), new Object [] {
			"xxx", "x x", "x x", 'x', testGem
		});
		GameRegistry.addRecipe(new ItemStack(testBoots, 1), new Object [] {
			"x x", "x x", 'x', testGem
		});
		
		GameRegistry.registerWorldGenerator(worldgen1, 1);
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.RenderInformation();
	}
	
}
