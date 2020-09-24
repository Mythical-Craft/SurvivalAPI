package net.mythical.survival.api.module;

import net.mythical.survival.api.module.chat.Chat;
import net.mythical.survival.api.module.injector.Injector;

public interface ModuleManager {

    Injector getInjector();

    Chat getChat();
}
