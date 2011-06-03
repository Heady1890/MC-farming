
package net.minecraft.src;

public class mod_farming extends BaseMod
{
  public static final Block haystack = new BlockHaystack(97, 0).setHardness(1.0F).setResistance(5.0F).setBlockName("haystack");
  public static final Block small_barrel = new BlockSmallBarrel(98, 0).setHardness(1.0F).setResistance(5.0F).setBlockName("small_barrel");
  
  public static int smallBarrelSide = ModLoader.addOverride("/terrain.png", "/farming/smallbarrel_side.png");
  public static int smallBarrelFront = ModLoader.addOverride("/terrain.png", "/farming/smallbarrel_front.png");
  public static int smallBarrelBack = ModLoader.addOverride("/terrain.png", "/farming/smallbarrel_back.png");
  public static int smallBarrelTest = ModLoader.addOverride("/terrain.png", "/farming/haystack.png");
  
  public static final Item bottleItem = new Item(2000).setItemName("bottleItem");

  public mod_farming(){
    ModLoader.RegisterBlock(haystack);
    haystack.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/farming/haystack.png");
    ModLoader.AddName(haystack, "Haystack");
    
    ModLoader.RegisterBlock(small_barrel);
    //small_barrel.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/farming/smallbarrel_side.png");
    ModLoader.AddName(small_barrel, "small Barrel");
    
    ModLoader.AddRecipe(new ItemStack(haystack, 1), new Object[] {
            "XXX", "XXX", "XXX", Character.valueOf('X'), Item.wheat
    });
    
    ModLoader.AddRecipe(new ItemStack(small_barrel, 1), new Object[] {
            "XXX", "X X", "X X", Character.valueOf('X'), Block.planks
    });
    
    //Bottle
    bottleItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/farming/bottle.png");
    ModLoader.AddName(bottleItem, "Bottle");
    ModLoader.AddRecipe(new ItemStack(bottleItem, 1), new Object[] {
            "X", "X", "X", Character.valueOf('X'), Block.glass
    });
  }
  
  public String Version()
  {
    return "farming mod v0.1 for MC 1.6_04";
  }

}