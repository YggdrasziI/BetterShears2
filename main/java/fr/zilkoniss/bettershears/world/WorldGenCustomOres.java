package fr.zilkoniss.bettershears.world;

import java.util.Random;

import fr.zilkoniss.bettershears.init.BlocksMod;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
    /*
    private WorldGenerator
    */
    
    public WorldGenCustomOres() 
    {
        /*
        ruby_ore = new WorldGenMinable(BlocksMod.RUBY_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
        */
    }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
    {
        switch(world.provider.getDimension())
        {
          
        //Nether
        case -1:
            
            
            
            break;
        
        //Overworld
        case 0:
            /*
            runGenerator(ruby_ore, world, random, chunkX, chunkZ, 50, 0, 100);
            */
            
            break;
        
        //End    
        case 1:
            
            
        }
    }
    
    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
        
        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            
            gen.generate(world, rand, new BlockPos(x,y,z));
        }
    }
}
