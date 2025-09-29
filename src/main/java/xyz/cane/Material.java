package xyz.cane;

import org.jetbrains.annotations.Nullable;

/**
 * Represents a type of item or block in the game.
 * This enum is designed for efficiency, using an array for quick ID lookups.
 */
public enum Material {
    AIR(0, 64, 0, true, false),
    STONE(1, 64, 0, true, false),
    GRASS(2, 64, 0, true, false),
    DIRT(3, 64, 0, true, false),
    COBBLESTONE(4, 64, 0, true, false),
    WOOD(5, 64, 0, true, false),
    SAPLING(6, 64, 0, true, false),
    BEDROCK(7, 64, 0, true, false),
    WATER(8, 64, 0, true, false),
    STATIONARY_WATER(9, 64, 0, true, false),
    LAVA(10, 64, 0, true, false),
    STATIONARY_LAVA(11, 64, 0, true, false),
    SAND(12, 64, 0, true, false),
    GRAVEL(13, 64, 0, true, false),
    GOLD_ORE(14, 64, 0, true, false),
    IRON_ORE(15, 64, 0, true, false),
    COAL_ORE(16, 64, 0, true, false),
    LOG(17, 64, 0, true, false),
    LEAVES(18, 64, 0, true, false),
    SPONGE(19, 64, 0, true, false),
    GLASS(20, 64, 0, true, false),
    LAPIS_ORE(21, 64, 0, true, false),
    LAPIS_BLOCK(22, 64, 0, true, false),
    DISPENSER(23, 64, 0, true, false),
    SANDSTONE(24, 64, 0, true, false),
    NOTE_BLOCK(25, 64, 0, true, false),
    BED_BLOCK(26, 1, 0, true, false),
    POWERED_RAIL(27, 64, 0, true, false),
    DETECTOR_RAIL(28, 64, 0, true, false),
    PISTON_STICKY_BASE(29, 64, 0, true, false),
    WEB(30, 64, 0, true, false),
    LONG_GRASS(31, 64, 0, true, false),
    DEAD_BUSH(32, 64, 0, true, false),
    PISTON_BASE(33, 64, 0, true, false),
    PISTON_EXTENSION(34, 64, 0, true, false),
    WOOL(35, 64, 0, true, false),
    PISTON_MOVING_PIECE(36, 64, 0, true, false),
    YELLOW_FLOWER(37, 64, 0, true, false),
    RED_ROSE(38, 64, 0, true, false),
    BROWN_MUSHROOM(39, 64, 0, true, false),
    RED_MUSHROOM(40, 64, 0, true, false),
    GOLD_BLOCK(41, 64, 0, true, false),
    IRON_BLOCK(42, 64, 0, true, false),
    DOUBLE_STEP(43, 64, 0, true, false),
    STEP(44, 64, 0, true, false),
    BRICK(45, 64, 0, true, false),
    TNT(46, 64, 0, true, false),
    BOOKSHELF(47, 64, 0, true, false),
    MOSSY_COBBLESTONE(48, 64, 0, true, false),
    OBSIDIAN(49, 64, 0, true, false),
    TORCH(50, 64, 0, true, false),
    FIRE(51, 64, 0, true, false),
    MOB_SPAWNER(52, 64, 0, true, false),
    WOOD_STAIRS(53, 64, 0, true, false),
    CHEST(54, 64, 0, true, false),
    REDSTONE_WIRE(55, 64, 0, true, false),
    DIAMOND_ORE(56, 64, 0, true, false),
    DIAMOND_BLOCK(57, 64, 0, true, false),
    WORKBENCH(58, 64, 0, true, false),
    CROPS(59, 64, 0, true, false),
    SOIL(60, 64, 0, true, false),
    FURNACE(61, 64, 0, true, false),
    BURNING_FURNACE(62, 64, 0, true, false),
    SIGN_POST(63, 16, 0, true, false),
    WOODEN_DOOR(64, 64, 0, true, false),
    LADDER(65, 64, 0, true, false),
    RAILS(66, 64, 0, true, false),
    COBBLESTONE_STAIRS(67, 64, 0, true, false),
    WALL_SIGN(68, 16, 0, true, false),
    LEVER(69, 64, 0, true, false),
    STONE_PLATE(70, 64, 0, true, false),
    IRON_DOOR_BLOCK(71, 64, 0, true, false),
    WOOD_PLATE(72, 64, 0, true, false),
    REDSTONE_ORE(73, 64, 0, true, false),
    GLOWING_REDSTONE_ORE(74, 64, 0, true, false),
    REDSTONE_TORCH_OFF(75, 64, 0, true, false),
    REDSTONE_TORCH_ON(76, 64, 0, true, false),
    STONE_BUTTON(77, 64, 0, true, false),
    SNOW(78, 64, 0, true, false),
    ICE(79, 64, 0, true, false),
    SNOW_BLOCK(80, 64, 0, true, false),
    CACTUS(81, 64, 0, true, false),
    CLAY(82, 64, 0, true, false),
    SUGAR_CANE_BLOCK(83, 64, 0, true, false),
    JUKEBOX(84, 64, 0, true, false),
    FENCE(85, 64, 0, true, false),
    PUMPKIN(86, 64, 0, true, false),
    NETHERRACK(87, 64, 0, true, false),
    SOUL_SAND(88, 64, 0, true, false),
    GLOWSTONE(89, 64, 0, true, false),
    PORTAL(90, 64, 0, true, false),
    JACK_O_LANTERN(91, 64, 0, true, false),
    CAKE_BLOCK(92, 1, 0, true, false),
    DIODE_BLOCK_OFF(93, 64, 0, true, false),
    DIODE_BLOCK_ON(94, 64, 0, true, false),
    STAINED_GLASS(95, 64, 0, true, false),
    TRAP_DOOR(96, 64, 0, true, false),
    MONSTER_EGGS(97, 64, 0, true, false),
    SMOOTH_BRICK(98, 64, 0, true, false),
    HUGE_MUSHROOM_1(99, 64, 0, true, false),
    HUGE_MUSHROOM_2(100, 64, 0, true, false),
    IRON_FENCE(101, 64, 0, true, false),
    THIN_GLASS(102, 64, 0, true, false),
    MELON_BLOCK(103, 64, 0, true, false),
    PUMPKIN_STEM(104, 64, 0, true, false),
    MELON_STEM(105, 64, 0, true, false),
    VINE(106, 64, 0, true, false),
    FENCE_GATE(107, 64, 0, true, false),
    BRICK_STAIRS(108, 64, 0, true, false),
    SMOOTH_STAIRS(109, 64, 0, true, false),
    MYCEL(110, 64, 0, true, false),
    WATER_LILY(111, 64, 0, true, false),
    NETHER_BRICK(112, 64, 0, true, false),
    NETHER_FENCE(113, 64, 0, true, false),
    NETHER_BRICK_STAIRS(114, 64, 0, true, false),
    NETHER_WARTS(115, 64, 0, true, false),
    ENCHANTMENT_TABLE(116, 64, 0, true, false),
    BREWING_STAND(117, 64, 0, true, false),
    CAULDRON(118, 64, 0, true, false),
    ENDER_PORTAL(119, 64, 0, true, false),
    ENDER_PORTAL_FRAME(120, 64, 0, true, false),
    ENDER_STONE(121, 64, 0, true, false),
    DRAGON_EGG(122, 64, 0, true, false),
    REDSTONE_LAMP_OFF(123, 64, 0, true, false),
    REDSTONE_LAMP_ON(124, 64, 0, true, false),
    WOOD_DOUBLE_STEP(125, 64, 0, true, false),
    WOOD_STEP(126, 64, 0, true, false),
    COCOA(127, 64, 0, true, false),
    SANDSTONE_STAIRS(128, 64, 0, true, false),
    EMERALD_ORE(129, 64, 0, true, false),
    ENDER_CHEST(130, 64, 0, true, false),
    TRIPWIRE_HOOK(131, 64, 0, true, false),
    TRIPWIRE(132, 64, 0, true, false),
    EMERALD_BLOCK(133, 64, 0, true, false),
    SPRUCE_WOOD_STAIRS(134, 64, 0, true, false),
    BIRCH_WOOD_STAIRS(135, 64, 0, true, false),
    JUNGLE_WOOD_STAIRS(136, 64, 0, true, false),
    COMMAND(137, 64, 0, true, false),
    BEACON(138, 64, 0, true, false),
    COBBLE_WALL(139, 64, 0, true, false),
    FLOWER_POT(140, 64, 0, true, false),
    CARROT(141, 64, 0, true, false),
    POTATO(142, 64, 0, true, false),
    WOOD_BUTTON(143, 64, 0, true, false),
    SKULL(144, 64, 0, true, false),
    ANVIL(145, 64, 0, true, false),
    TRAPPED_CHEST(146, 64, 0, true, false),
    GOLD_PLATE(147, 64, 0, true, false),
    IRON_PLATE(148, 64, 0, true, false),
    REDSTONE_COMPARATOR_OFF(149, 64, 0, true, false),
    REDSTONE_COMPARATOR_ON(150, 64, 0, true, false),
    DAYLIGHT_DETECTOR(151, 64, 0, true, false),
    REDSTONE_BLOCK(152, 64, 0, true, false),
    QUARTZ_ORE(153, 64, 0, true, false),
    HOPPER(154, 64, 0, true, false),
    QUARTZ_BLOCK(155, 64, 0, true, false),
    QUARTZ_STAIRS(156, 64, 0, true, false),
    ACTIVATOR_RAIL(157, 64, 0, true, false),
    DROPPER(158, 64, 0, true, false),
    STAINED_CLAY(159, 64, 0, true, false),
    STAINED_GLASS_PANE(160, 64, 0, true, false),
    LEAVES_2(161, 64, 0, true, false),
    LOG_2(162, 64, 0, true, false),
    ACACIA_STAIRS(163, 64, 0, true, false),
    DARK_OAK_STAIRS(164, 64, 0, true, false),
    SLIME_BLOCK(165, 64, 0, true, false),
    BARRIER(166, 64, 0, true, false),
    IRON_TRAPDOOR(167, 64, 0, true, false),
    PRISMARINE(168, 64, 0, true, false),
    SEA_LANTERN(169, 64, 0, true, false),
    HAY_BLOCK(170, 64, 0, true, false),
    CARPET(171, 64, 0, true, false),
    HARD_CLAY(172, 64, 0, true, false),
    COAL_BLOCK(173, 64, 0, true, false),
    PACKED_ICE(174, 64, 0, true, false),
    DOUBLE_PLANT(175, 64, 0, true, false),
    STANDING_BANNER(176, 16, 0, true, false),
    WALL_BANNER(177, 16, 0, true, false),
    DAYLIGHT_DETECTOR_INVERTED(178, 64, 0, true, false),
    RED_SANDSTONE(179, 64, 0, true, false),
    RED_SANDSTONE_STAIRS(180, 64, 0, true, false),
    DOUBLE_STONE_SLAB2(181, 64, 0, true, false),
    STONE_SLAB2(182, 64, 0, true, false),
    SPRUCE_FENCE_GATE(183, 64, 0, true, false),
    BIRCH_FENCE_GATE(184, 64, 0, true, false),
    JUNGLE_FENCE_GATE(185, 64, 0, true, false),
    DARK_OAK_FENCE_GATE(186, 64, 0, true, false),
    ACACIA_FENCE_GATE(187, 64, 0, true, false),
    SPRUCE_FENCE(188, 64, 0, true, false),
    BIRCH_FENCE(189, 64, 0, true, false),
    JUNGLE_FENCE(190, 64, 0, true, false),
    DARK_OAK_FENCE(191, 64, 0, true, false),
    ACACIA_FENCE(192, 64, 0, true, false),
    SPRUCE_DOOR(193, 64, 0, true, false),
    BIRCH_DOOR(194, 64, 0, true, false),
    JUNGLE_DOOR(195, 64, 0, true, false),
    ACACIA_DOOR(196, 64, 0, true, false),
    DARK_OAK_DOOR(197, 64, 0, true, false),
    IRON_SHOVEL(256, 1, 250, false, false),
    IRON_PICKAXE(257, 1, 250, false, false),
    IRON_AXE(258, 1, 250, false, false),
    FLINT_AND_STEEL(259, 1, 64, false, false),
    APPLE(260, 64, 0, false, true),
    BOW(261, 1, 384, false, false),
    ARROW(262, 64, 0, false, false),
    COAL(263, 64, 0, false, false),
    DIAMOND(264, 64, 0, false, false),
    IRON_INGOT(265, 64, 0, false, false),
    GOLD_INGOT(266, 64, 0, false, false),
    IRON_SWORD(267, 1, 250, false, false),
    WOOD_SWORD(268, 1, 59, false, false),
    WOOD_SPADE(269, 1, 59, false, false),
    WOOD_PICKAXE(270, 1, 59, false, false),
    WOOD_AXE(271, 1, 59, false, false),
    STONE_SWORD(272, 1, 131, false, false),
    STONE_SPADE(273, 1, 131, false, false),
    STONE_PICKAXE(274, 1, 131, false, false),
    STONE_AXE(275, 1, 131, false, false),
    DIAMOND_SWORD(276, 1, 1561, false, false),
    DIAMOND_SPADE(277, 1, 1561, false, false),
    DIAMOND_PICKAXE(278, 1, 1561, false, false),
    DIAMOND_AXE(279, 1, 1561, false, false),
    STICK(280, 64, 0, false, false),
    BOWL(281, 64, 0, false, false),
    MUSHROOM_SOUP(282, 1, 0, false, true),
    GOLD_SWORD(283, 1, 32, false, false),
    GOLD_SPADE(284, 1, 32, false, false),
    GOLD_PICKAXE(285, 1, 32, false, false),
    GOLD_AXE(286, 1, 32, false, false),
    STRING(287, 64, 0, false, false),
    FEATHER(288, 64, 0, false, false),
    SULPHUR(289, 64, 0, false, false),
    WOOD_HOE(290, 1, 59, false, false),
    STONE_HOE(291, 1, 131, false, false),
    IRON_HOE(292, 1, 250, false, false),
    DIAMOND_HOE(293, 1, 1561, false, false),
    GOLD_HOE(294, 1, 32, false, false),
    SEEDS(295, 64, 0, false, false),
    WHEAT(296, 64, 0, false, false),
    BREAD(297, 64, 0, false, true),
    LEATHER_HELMET(298, 1, 55, false, false),
    LEATHER_CHESTPLATE(299, 1, 80, false, false),
    LEATHER_LEGGINGS(300, 1, 75, false, false),
    LEATHER_BOOTS(301, 1, 65, false, false),
    CHAINMAIL_HELMET(302, 1, 165, false, false),
    CHAINMAIL_CHESTPLATE(303, 1, 240, false, false),
    CHAINMAIL_LEGGINGS(304, 1, 225, false, false),
    CHAINMAIL_BOOTS(305, 1, 195, false, false),
    IRON_HELMET(306, 1, 165, false, false),
    IRON_CHESTPLATE(307, 1, 240, false, false),
    IRON_LEGGINGS(308, 1, 225, false, false),
    IRON_BOOTS(309, 1, 195, false, false),
    DIAMOND_HELMET(310, 1, 363, false, false),
    DIAMOND_CHESTPLATE(311, 1, 528, false, false),
    DIAMOND_LEGGINGS(312, 1, 495, false, false),
    DIAMOND_BOOTS(313, 1, 429, false, false),
    GOLD_HELMET(314, 1, 77, false, false),
    GOLD_CHESTPLATE(315, 1, 112, false, false),
    GOLD_LEGGINGS(316, 1, 105, false, false),
    GOLD_BOOTS(317, 1, 91, false, false),
    FLINT(318, 64, 0, false, false),
    PORK(319, 64, 0, false, true),
    GRILLED_PORK(320, 64, 0, false, true),
    PAINTING(321, 64, 0, false, false),
    GOLDEN_APPLE(322, 64, 0, false, true),
    SIGN(323, 16, 0, false, false),
    WOOD_DOOR(324, 64, 0, false, false),
    BUCKET(325, 16, 0, false, false),
    WATER_BUCKET(326, 1, 0, false, false),
    LAVA_BUCKET(327, 1, 0, false, false),
    MINECART(328, 1, 0, false, false),
    SADDLE(329, 1, 0, false, false),
    IRON_DOOR(330, 64, 0, false, false),
    REDSTONE(331, 64, 0, false, false),
    SNOW_BALL(332, 16, 0, false, false),
    BOAT(333, 1, 0, false, false),
    LEATHER(334, 64, 0, false, false),
    MILK_BUCKET(335, 1, 0, false, false),
    CLAY_BRICK(336, 64, 0, false, false),
    CLAY_BALL(337, 64, 0, false, false),
    SUGAR_CANE(338, 64, 0, false, false),
    PAPER(339, 64, 0, false, false),
    BOOK(340, 64, 0, false, false),
    SLIME_BALL(341, 64, 0, false, false),
    STORAGE_MINECART(342, 1, 0, false, false),
    POWERED_MINECART(343, 1, 0, false, false),
    EGG(344, 16, 0, false, false),
    COMPASS(345, 64, 0, false, false),
    FISHING_ROD(346, 1, 64, false, false),
    WATCH(347, 64, 0, false, false),
    GLOWSTONE_DUST(348, 64, 0, false, false),
    RAW_FISH(349, 64, 0, false, true),
    COOKED_FISH(350, 64, 0, false, true),
    INK_SACK(351, 64, 0, false, false),
    BONE(352, 64, 0, false, false),
    SUGAR(353, 64, 0, false, false),
    CAKE(354, 1, 0, false, false),
    BED(355, 1, 0, false, false),
    DIODE(356, 64, 0, false, false),
    COOKIE(357, 64, 0, false, true),
    MAP(358, 64, 0, false, false),
    SHEARS(359, 1, 238, false, false),
    MELON(360, 64, 0, false, true),
    PUMPKIN_SEEDS(361, 64, 0, false, false),
    MELON_SEEDS(362, 64, 0, false, false),
    RAW_BEEF(363, 64, 0, false, true),
    COOKED_BEEF(364, 64, 0, false, true),
    RAW_CHICKEN(365, 64, 0, false, true),
    COOKED_CHICKEN(366, 64, 0, false, true),
    ROTTEN_FLESH(367, 64, 0, false, true),
    ENDER_PEARL(368, 16, 0, false, false),
    BLAZE_ROD(369, 64, 0, false, false),
    GHAST_TEAR(370, 64, 0, false, false),
    GOLD_NUGGET(371, 64, 0, false, false),
    NETHER_STALK(372, 64, 0, false, false),
    POTION(373, 1, 0, false, false),
    GLASS_BOTTLE(374, 64, 0, false, false),
    SPIDER_EYE(375, 64, 0, false, true),
    FERMENTED_SPIDER_EYE(376, 64, 0, false, false),
    BLAZE_POWDER(377, 64, 0, false, false),
    MAGMA_CREAM(378, 64, 0, false, false),
    BREWING_STAND_ITEM(379, 64, 0, false, false),
    CAULDRON_ITEM(380, 64, 0, false, false),
    EYE_OF_ENDER(381, 64, 0, false, false),
    SPECKLED_MELON(382, 64, 0, false, false),
    MONSTER_EGG(383, 64, 0, false, false),
    EXP_BOTTLE(384, 64, 0, false, false),
    FIREBALL(385, 64, 0, false, false),
    BOOK_AND_QUILL(386, 1, 0, false, false),
    WRITTEN_BOOK(387, 16, 0, false, false),
    EMERALD(388, 64, 0, false, false),
    ITEM_FRAME(389, 64, 0, false, false),
    FLOWER_POT_ITEM(390, 64, 0, false, false),
    CARROT_ITEM(391, 64, 0, false, true),
    POTATO_ITEM(392, 64, 0, false, true),
    BAKED_POTATO(393, 64, 0, false, true),
    POISONOUS_POTATO(394, 64, 0, false, true),
    EMPTY_MAP(395, 64, 0, false, false),
    GOLDEN_CARROT(396, 64, 0, false, true),
    SKULL_ITEM(397, 64, 0, false, false),
    CARROT_STICK(398, 1, 25, false, false),
    NETHER_STAR(399, 64, 0, false, false),
    PUMPKIN_PIE(400, 64, 0, false, true),
    FIREWORK(401, 64, 0, false, false),
    FIREWORK_CHARGE(402, 64, 0, false, false),
    ENCHANTED_BOOK(403, 1, 0, false, false),
    REDSTONE_COMPARATOR(404, 64, 0, false, false),
    NETHER_BRICK_ITEM(405, 64, 0, false, false),
    QUARTZ(406, 64, 0, false, false),
    EXPLOSIVE_MINECART(407, 1, 0, false, false),
    HOPPER_MINECART(408, 1, 0, false, false),
    PRISMARINE_SHARD(409, 64, 0, false, false),
    PRISMARINE_CRYSTALS(410, 64, 0, false, false),
    RABBIT(411, 64, 0, false, true),
    COOKED_RABBIT(412, 64, 0, false, true),
    RABBIT_STEW(413, 1, 0, false, true),
    RABBIT_FOOT(414, 64, 0, false, false),
    RABBIT_HIDE(415, 64, 0, false, false),
    ARMOR_STAND(416, 16, 0, false, false),
    IRON_BARDING(417, 1, 0, false, false),
    GOLD_BARDING(418, 1, 0, false, false),
    DIAMOND_BARDING(419, 1, 0, false, false),
    LEASH(420, 64, 0, false, false),
    NAME_TAG(421, 64, 0, false, false),
    COMMAND_MINECART(422, 1, 0, false, false),
    MUTTON(423, 64, 0, false, true),
    COOKED_MUTTON(424, 64, 0, false, true),
    BANNER(425, 16, 0, false, false),
    SPRUCE_DOOR_ITEM(427, 64, 0, false, false),
    BIRCH_DOOR_ITEM(428, 64, 0, false, false),
    JUNGLE_DOOR_ITEM(429, 64, 0, false, false),
    ACACIA_DOOR_ITEM(430, 64, 0, false, false),
    DARK_OAK_DOOR_ITEM(431, 64, 0, false, false),
    GOLD_RECORD(2256, 1, 0, false, false),
    GREEN_RECORD(2257, 1, 0, false, false),
    RECORD_3(2258, 1, 0, false, false),
    RECORD_4(2259, 1, 0, false, false),
    RECORD_5(2260, 1, 0, false, false),
    RECORD_6(2261, 1, 0, false, false),
    RECORD_7(2262, 1, 0, false, false),
    RECORD_8(2263, 1, 0, false, false),
    RECORD_9(2264, 1, 0, false, false),
    RECORD_10(2265, 1, 0, false, false),
    RECORD_11(2266, 1, 0, false, false),
    RECORD_12(2267, 1, 0, false, false);

    private final int id;
    private final int maxStackSize;
    private final short maxDurability;
    private final boolean isBlock;
    private final boolean isEdible;

    private static final Material[] byId = new Material[32000];

    /**
     * Constructs a new Material.
     *
     * @param id The legacy material ID.
     * @param maxStackSize The maximum stack size.
     * @param maxDurability The maximum durability (for tools/armor).
     * @param isBlock True if the material is a placeable block.
     * @param isEdible True if the material is edible.
     */
    Material(int id, int maxStackSize, int maxDurability, boolean isBlock, boolean isEdible) {
        this.id = id;
        this.maxStackSize = maxStackSize;
        this.maxDurability = (short) maxDurability;
        this.isBlock = isBlock;
        this.isEdible = isEdible;
    }

    /**
     * Gets the legacy vanilla ID of this material.
     * @return The material ID.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the maximum stack size for this material.
     * @return The maximum stack size.
     */
    public int getMaxStackSize() {
        return this.maxStackSize;
    }

    /**
     * Gets the maximum durability of this item.
     * @return The maximum durability, or 0 if not applicable.
     */
    public short getMaxDurability() {
        return this.maxDurability;
    }

    /**
     * Checks if this material is a placeable block.
     * @return true if it is a block.
     */
    public boolean isBlock() {
        return this.isBlock;
    }

    /**
     * Checks if this material is edible.
     * @return true if it is edible.
     */
    public boolean isEdible() {
        return this.isEdible;
    }

    /**
     * Gets a Material by its legacy vanilla ID.
     * This method is highly efficient due to array-based lookup.
     *
     * @param id The ID to look up.
     * @return The Material, or null if not found.
     */
    @Nullable
    public static Material getMaterial(int id) {
        if (id >= 0 && id < byId.length) {
            return byId[id];
        }
        return null;
    }

    static {
        for (Material material : values()) {
            if (byId[material.id] != null) {
                // This can happen with items that share an ID with a block (e.g., SIGN_POST and SIGN)
                // The block version is usually registered first, which is often the desired behavior.
                continue;
            }
            byId[material.id] = material;
        }
    }

}
