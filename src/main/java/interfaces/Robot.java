package interfaces;

public class Robot implements Robotable{
    @Override
    public String memorySN() {
        return null;
    }

    @Override
    public boolean memoryExist() {
        return false;
    }

    @Override
    public int memoryVolatage() {
        return 0;
    }

    @Override
    public boolean memoryExists(int slot) {
        return false;
    }
}
