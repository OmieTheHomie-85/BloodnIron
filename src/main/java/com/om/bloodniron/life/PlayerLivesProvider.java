package com.om.bloodniron.life;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerLivesProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<PlayerLives> PLAYER_LIVES = CapabilityManager.get(new CapabilityToken<PlayerLives>() { });

    private PlayerLives lives = null;
    private final LazyOptional<PlayerLives> optional = LazyOptional.of(this::createPlayerLives);

    private PlayerLives createPlayerLives() {
        if(this.lives == null) {
            this.lives = new PlayerLives();
        }
        return this.lives;
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == PLAYER_LIVES) {
            return optional.cast();
        }
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerLives().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerLives().loadNBTData(nbt);
    }
}
