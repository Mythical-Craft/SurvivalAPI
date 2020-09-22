package net.mythical.survival.api;

import net.mythical.survival.api.data.Data;
import net.mythical.survival.api.module.ModuleManager;
import net.mythical.survival.api.utils.Util;

public interface SurvivalCore {

    Util getUtil();

    Data getData();

    ModuleManager getModule();
}
