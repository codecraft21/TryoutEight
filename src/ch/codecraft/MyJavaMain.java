package ch.codecraft;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chris_000 on 2014-03-28.
 */
public class MyJavaMain implements IDefaultMethodExt {
    public static void main(String[] args) {
        MyJavaMain m = new MyJavaMain();
        m.defaultMethod();
        m.defaultMethodExt();
        m.anotherDefaultMethodExt();

        Map<String,String> map = new HashMap<>();
        String val = map.getOrDefault("key", "nuts");
        System.out.println(val);
    }
}
