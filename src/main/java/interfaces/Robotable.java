package interfaces;

public interface Robotable {
    String memorySN();
    boolean memoryExist();
    int memoryVolatage();
    boolean memoryExists(int slot);
}
