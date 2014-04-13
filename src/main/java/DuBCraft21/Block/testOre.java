package DuBCraft21.Block;

import DuBCraft21.common.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class testOre extends Block {

	public testOre(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(TutorialMod.testTab);
		this.setHardness(2f);
		this.setResistance(2.0f);
		this.setLightLevel(0.2f);
		this.setHarvestLevel("pickaxe", 3);
	}

}
