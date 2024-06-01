package com.caixukun.enjoy_music.mixin;

import net.minecraft.sound.MusicSound;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MusicSound.class)
public class MixinSound {
    @Mutable
    @Shadow @Final private int minDelay=0;

    @Mutable
    @Shadow @Final private int maxDelay=0;


    @Inject(method = "getMinDelay", at = @At("HEAD"))
    public void mind(CallbackInfoReturnable<Integer> cir){
        this.minDelay=0;

    }
    @Inject(method = "getMaxDelay", at = @At("HEAD"))
    public void maxd(CallbackInfoReturnable<Integer> cir){
        this.maxDelay=0;
    }

}
