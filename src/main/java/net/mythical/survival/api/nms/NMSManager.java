package net.mythical.survival.api.nms;

import java.util.Map;

public interface NMSManager {

    void register(String str, NMS nms);

    void unregister(String str);

    String getVersion();

    Map<String, NMS> getNMS();
}
