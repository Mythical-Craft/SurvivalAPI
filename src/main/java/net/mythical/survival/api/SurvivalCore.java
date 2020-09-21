package net.mythical.survival.api;

import net.mythical.survival.api.data.Data;
import net.mythical.survival.api.module.Module;
import net.mythical.survival.api.utils.Util;

public interface SurvivalCore {

    Util getUtil();

    Data getData();

    Module getModule();
}
