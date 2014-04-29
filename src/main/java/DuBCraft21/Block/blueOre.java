package DuBCraft21.Block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import DuBCraft21.common.TutorialMod;
public class blueOre extends Block {

	public blueOre(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(TutorialMod.testTab);
		this.setHardness(3f);
		this.setResistance(3.0f);
		this.setLightLevel(0.5f);
		this.setHarvestLevel("pickaxe", 4);
	}

}
