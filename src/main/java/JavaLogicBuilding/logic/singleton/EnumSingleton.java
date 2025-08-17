package JavaLogicBuilding.logic.singleton;

enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Enum Singleton!");
    }
}
