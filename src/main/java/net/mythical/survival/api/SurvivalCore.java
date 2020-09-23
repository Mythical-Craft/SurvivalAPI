package net.mythical.survival.api;

import net.mythical.survival.api.data.Data;
import net.mythical.survival.api.module.ModuleManager;
import net.mythical.survival.api.nms.NMSManager;
import net.mythical.survival.api.utils.Util;
import org.bukkit.entity.Player;

import java.util.Optional;
import java.util.UUID;

public interface SurvivalCore {

    Util getUtil();

    Data getData();

    ModuleManager getModule();

    NMSManager getNMS();

}
