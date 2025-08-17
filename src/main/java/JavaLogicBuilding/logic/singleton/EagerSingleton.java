package JavaLogicBuilding.logic.singleton;

class EagerSingleton {
    // object is created at class loading time
    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor so that no other object can be created
    private EagerSingleton() {
    }

    // global access point
    public static EagerSingleton getInstance() {
        return instance;
    }
}
