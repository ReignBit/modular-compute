package com.reignbit.modularcompute.core.vm;


import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaThread;
import org.luaj.vm2.lib.jse.JsePlatform;

public class LuaMachine {
    private final Globals globals;
    private LuaThread thread;

    public LuaMachine(String code) {
        this.globals = JsePlatform.standardGlobals();
        LuaFunction chunk = (LuaFunction) globals.load(code);
        thread = new LuaThread(globals, chunk);
    }
}
