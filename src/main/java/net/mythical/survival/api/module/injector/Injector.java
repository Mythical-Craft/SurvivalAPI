package net.mythical.survival.api.module.injector;

public interface Injector {

    void load(Injection injection);

    void unload(Injection injection);

}
