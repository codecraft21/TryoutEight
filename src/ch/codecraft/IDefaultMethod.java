package ch.codecraft;

/**
 * Created by chris_000 on 2014-03-28.
 */
public interface IDefaultMethod {
    default void defaultMethod() {
        System.out.println("IDefaultMethod.defaultMethod()");
    }
}
