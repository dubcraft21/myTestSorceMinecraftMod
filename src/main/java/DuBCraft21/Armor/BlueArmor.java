package DuBCraft21.Armor;

import DuBCraft21.common.TutorialMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BlueArmor extends ItemArmor {

	public BlueArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(TutorialMod.testTab);
	}
	
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == TutorialMod.blueHelmet || stack.getItem() == TutorialMod.blueChest || stack.getItem() == TutorialMod.blueBoots){
			return "TutorialMod:textures/models/armor/blueArmor_1.png";
		}
		if(stack.getItem() == TutorialMod.blueLeggings) {
			return "TutorialMod:textures/models/armor/blueArmor_2.png";
		}
		else return null;
	};
	
}
