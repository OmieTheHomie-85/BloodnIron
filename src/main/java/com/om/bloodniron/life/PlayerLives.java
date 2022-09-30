package com.om.bloodniron.life;

import net.minecraft.nbt.CompoundTag;

public class PlayerLives {

    private int lives;
    private final int MAX_LIVES = 10;
    private final int MIN_LIVES = 0;

    public int getLives() {
        return lives;
    }

    public void addLives(int add) {
        this.lives = Math.min(this.lives + add, MAX_LIVES);
    }

    public void subLives(int sub) {
        this.lives = Math.min(this.lives - sub, MIN_LIVES);
    }

    public void copyFrom(PlayerLives source) {
        this.lives = source.lives;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("lives", this.lives);
    }

    public void loadNBTData(CompoundTag nbt) {
        this.lives = nbt.getInt("lives");
    }
}
