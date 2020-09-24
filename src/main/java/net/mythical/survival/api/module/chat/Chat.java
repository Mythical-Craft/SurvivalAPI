package net.mythical.survival.api.module.chat;


import net.mythical.survival.api.module.Module;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Chat extends Module {

    default String translateHex(String message) {
        Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");
        Matcher matcher = pattern.matcher(message);
        while (pattern.matcher(message).find()) {
            String color = message.substring(matcher.start(), matcher.end());
            message = message.replace(color, getColoredChat().of(color) + "");
            matcher = pattern.matcher(message);
        }
        return getColoredChat().translate('&', message);
    }

    ColoredChat getColoredChat();

}
