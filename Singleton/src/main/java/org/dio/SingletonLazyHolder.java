package org.dio;

/**
 *
 */
/*
* Singleton "Lazy Holder".
*
* @see
*
* @author AleehSophia
*/
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}