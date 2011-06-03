package net.minecraft.src;


public class BlockSmallBarrel extends Block
{

  protected BlockSmallBarrel(int i, int j){
    super(i, j, Material.ground);
  }

  public int getBlockTextureFromSideAndMetadata(int i, int j){
    if(j==0){
      if(i==2) return mod_farming.smallBarrelFront;
      if(i==3) return mod_farming.smallBarrelBack;
    }
    if(j==1){
      if(i==5) return mod_farming.smallBarrelFront;
      if(i==4) return mod_farming.smallBarrelBack;
    }
    if(j==2){
      if(i==3) return mod_farming.smallBarrelFront;
      if(i==2) return mod_farming.smallBarrelBack;
    }
    if(j==3){
      if(i==4) return mod_farming.smallBarrelFront;
      if(i==5) return mod_farming.smallBarrelBack;
    }
    return mod_farming.smallBarrelSide;
  }

  public int getBlockTextureFromSide(int i){
    if(i == 4){
      return mod_farming.smallBarrelFront;
    }
    else if(i == 5){
      return mod_farming.smallBarrelBack;
    }
    return mod_farming.smallBarrelSide;
  }
  
  public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        if(l == 0)
        {
            world.setBlockMetadataWithNotify(i, j, k, 0);
        }
        if(l == 1)
        {
            world.setBlockMetadataWithNotify(i, j, k, 1);
        }
        if(l == 2)
        {
            world.setBlockMetadataWithNotify(i, j, k, 2);
        }
        if(l == 3)
        {
            world.setBlockMetadataWithNotify(i, j, k, 3);
        }
    }
}