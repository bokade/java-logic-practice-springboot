package JavaLogicBuilding.logic.singleton;

class BillPughSingleton {

    private BillPughSingleton() {}

    // static inner helper class
    private static class Helper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.INSTANCE;
    }
}
