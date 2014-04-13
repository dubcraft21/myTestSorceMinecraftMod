package DuBCraft21.Armor;

import DuBCraft21.common.TutorialMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TestArmor extends ItemArmor {

	public TestArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(TutorialMod.testTab);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == TutorialMod.testHelmet || stack.getItem() == TutorialMod.testChest || stack.getItem() == TutorialMod.testBoots){
			return "TutorialMod:textures/models/armor/testArmor_1.png";
		}
		if(stack.getItem() == TutorialMod.testLeggs) {
			return "TutorialMod:textures/models/armor/testArmor_2.png";
		}
		else return null;
	};
	
}
