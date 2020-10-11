package seedu.address.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlockSettingTest {
    private static final String BLOCK_A_NAME = "A";
    private static final String LEVEL_1_ROOMS = "Level 1: 100 to 120";
    private static final String LEVEL_2_ROOMS = "Level 2: 200 to 220";

    private static final BlockSetting BLOCK_A = new BlockSetting(BLOCK_A_NAME);

    @Test
    public void blockSetting_equalBlockSetting() {
        BlockSetting blockA = new BlockSetting(BLOCK_A_NAME);
        assertEquals(blockA, BLOCK_A);
    }

    @Test
    public void blockSetting_constructor_correctBlockName() {
        BlockSetting blockA = new BlockSetting(BLOCK_A_NAME);
        assertEquals(BLOCK_A_NAME, blockA.getBlockName());
    }

    @Test
    public void blockSetting_getLevels_correctRoomRangeString() {
        BlockSetting blockA = new BlockSetting(BLOCK_A_NAME);
        assertEquals(LEVEL_1_ROOMS, blockA.getLevel(1));
        assertEquals(LEVEL_2_ROOMS, blockA.getLevel(2));
    }
}