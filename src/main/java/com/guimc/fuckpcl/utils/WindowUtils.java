package com.guimc.fuckpcl.utils;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.win32.StdCallLibrary;

import java.util.ArrayList;

public class WindowUtils {
    public interface User32 extends StdCallLibrary {
        User32 INSTANCE = Native.loadLibrary("user32", User32.class);
        boolean EnumWindows(WinUser.WNDENUMPROC lpEnumFunc, Pointer arg);
        int GetWindowTextA(HWND hWnd, byte[] lpString, int nMaxCount);
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }

    public static String[] getWindowNames() {
        final User32 user32 = User32.INSTANCE;
        final ArrayList<String> list = new ArrayList<>();

        user32.EnumWindows((hwnd, arg1) -> {
            byte[] windowText = new byte[512];
            user32.GetWindowTextA(hwnd, windowText, 512);
            String wText = Native.toString(windowText);
            list.add(wText);
            return true;
        }, null);

        return list.toArray(new String[0]);
    }
}