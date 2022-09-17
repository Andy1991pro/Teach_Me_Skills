package classwork;

public abstract class Computer {//final - вводится перед class для запрета изменить класс
    // abstract - вводится для запрета создания класса
    // protected - вводится в метод (метод будет виден только наследникам)
    int cost;
    String model;
    int screenSize;
    int batteryLife;

    public Computer(String model) {
        this.model=model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
