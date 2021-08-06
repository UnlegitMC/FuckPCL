package com.guimc.fuckpcl;

import com.guimc.fuckpcl.utils.WindowUtils;

public class PCLChecker {
    public static boolean runCheck() {
        // PCL only support windows
        if (!WindowUtils.isWindows())
            return false;

        // PCL Title (String).contains("Plain Craft Launcher 2")
        return WindowUtils.findWindow("Plain Craft Launcher");
    }
}
