package net.mythical.survival.api.module;

import net.mythical.survival.api.CoreProvider;
import net.mythical.survival.api.SurvivalCore;

public interface Module{

    void startModule();

    void stopModule();

    default ModuleManager getModule(){
        return getCore().getModule();
    }

    default SurvivalCore getCore(){
        return CoreProvider.getCore();
    }
}
