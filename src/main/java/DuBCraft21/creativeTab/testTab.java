package DuBCraft21.creativeTab;

import DuBCraft21.common.TutorialMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class testTab extends CreativeTabs {

	public testTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return TutorialMod.testPlaceholder;
	}

}
