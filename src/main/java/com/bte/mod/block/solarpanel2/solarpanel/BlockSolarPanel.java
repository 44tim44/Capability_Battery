package com.bte.mod.block.solarpanel2.solarpanel;

import com.bte.mod.BTEMod;
import com.bte.mod.ModGuiHandler;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Timeout on 2017-08-22.
 */
public class BlockSolarPanel extends Block implements ITileEntityProvider{

    public BlockSolarPanel() {
        super(Material.IRON);
        this.isBlockContainer = true;
        this.setUnlocalizedName("solar_panel_block_2");
        this.setRegistryName("solar_panel_block_2");
        this.setHardness(0.2F);
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setLightOpacity(0);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){

        if (world.isRemote) {

            final TileEntity tile = world.getTileEntity(pos);

            if (tile instanceof TileEntitySolarPanel && !tile.isInvalid()) {

                final TileEntitySolarPanel panel = (TileEntitySolarPanel) tile;
                final ContainerSolarPanel container = (ContainerSolarPanel) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);
            }
        }
        return true;
    }

    @Override
    public void breakBlock (World world, BlockPos pos, IBlockState state) {

        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }

    @Override
    public boolean eventReceived (IBlockState state, World world, BlockPos pos, int id, int param) {

        super.eventReceived(state, world, pos, id, param);
        final TileEntity tileentity = world.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntitySolarPanel();
    }

}
