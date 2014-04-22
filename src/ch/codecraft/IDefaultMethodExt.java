package ch.codecraft;

/**
 * Created by chris_000 on 2014-03-28.
 */
public interface IDefaultMethodExt extends IDefaultMethod {
    default void defaultMethodExt() {
        System.out.println("IDefaultMethodExt.defaultMethodExt()");
    }
}
