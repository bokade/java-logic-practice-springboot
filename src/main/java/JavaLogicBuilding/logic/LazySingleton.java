package JavaLogicBuilding.logic;

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {   // create only when needed
            instance = new LazySingleton();
        }
        return instance;
    }
}
