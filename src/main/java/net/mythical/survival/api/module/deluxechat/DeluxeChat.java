package net.mythical.survival.api.module.deluxechat;

import me.clip.deluxechat.compatibility.CompatibilityManager;

public interface DeluxeChat {

    void injectVersion(CompatibilityManager compatibilityManager);

    void makeCompatible();

}
