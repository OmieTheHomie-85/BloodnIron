//package com.om.bloodniron.event;
//
//import com.om.bloodniron.BloodnIron;
//import com.om.bloodniron.life.PlayerLives;
//import com.om.bloodniron.life.PlayerLivesProvider;
//import net.minecraft.Util;
//import net.minecraft.network.chat.ChatType;
//import net.minecraft.network.chat.TextComponent;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.server.MinecraftServer;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.level.Level;
//import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
//import net.minecraftforge.common.util.LazyOptional;
//import net.minecraftforge.event.AttachCapabilitiesEvent;
//import net.minecraftforge.event.entity.player.PlayerEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//
//import java.util.Objects;
//import java.util.UUID;
//
//@Mod.EventBusSubscriber(modid = BloodnIron.MOD_ID)
//public class ModEvents {
//
//    @SubscribeEvent
//    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
//        if (event.getObject() instanceof Player) {
//            if(!event.getObject().getCapability(PlayerLivesProvider.PLAYER_LIVES).isPresent()) {
//                event.addCapability(new ResourceLocation(BloodnIron.MOD_ID, "properties"), new PlayerLivesProvider());
//            }
//        }
//    }
//
//    /**
//     *
//     * I want this to say in chat "You have x lives left" when a player dies
//     */
//    @SubscribeEvent
//    public static void onPlayerClone(PlayerEvent.Clone event){
//        if(event.isWasDeath()) {
//            event.getOriginal().getCapability(PlayerLivesProvider.PLAYER_LIVES).ifPresent(lives -> {
//                event.getPlayer().getCapability(PlayerLivesProvider.PLAYER_LIVES).ifPresent(newLives -> {
//                    lives.addLives(1);
//                });
//            });
//            int lives = event.getPlayer().getCapability(PlayerLivesProvider.PLAYER_LIVES).orElse(null).getLives();
//            Level server = Objects.requireNonNull(event.getPlayer().level);
//            if (server instanceof ServerLevel serverLevel) serverLevel.getServer().getPlayerList().broadcastMessage(new TextComponent("You have " + lives + " lives left"), ChatType.SYSTEM, Util.NIL_UUID);
//
//        }
//
//    }
//
//    @SubscribeEvent
//    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event){
//        event.register(PlayerLives.class);
//    }
//
//}
