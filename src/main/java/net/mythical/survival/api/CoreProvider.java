package net.mythical.survival.api;

public final class CoreProvider {

    private static SurvivalCore survival = null;

    public static SurvivalCore getCore(){
        if (survival != null){
            return survival;
        } else {
            throw new IllegalStateException("The API isn't registered yet!");
        }
    }

    public static void register(SurvivalCore core){
        survival = core;
    }

    public static void unregister(){
        survival = null;
    }
}
