package ${package}.tests;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void nashornTest() throws Exception{
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        Integer evaled = (Integer) engine.eval("2+2");
        assertEquals("2+2", new Integer(4), evaled);
    }
}
