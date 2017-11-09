package basic_java;

public class Mobile {
    private int price, totalStorage, storageInUse;
    private String model;
    private boolean isOn;

    public Mobile(int Price, int totalStorage, String Model, boolean isOn) {
        storageInUse = 0;
        this.price = Price;
        this.totalStorage = totalStorage;
        this.model = Model;
        this.isOn = isOn;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalStorage() {
        return totalStorage;
    }

    public void setTotalStorage(int totalStorage) {
        this.totalStorage = totalStorage;
    }

    public int getStorageInUse() {
        return storageInUse;
    }

    public void setStorageInUse(int storageInUse) {
        this.storageInUse = storageInUse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void onOff() {
        if (this.isOn) {
            this.isOn = false;
        } else {
            this.isOn = true;
        }
    }

    public boolean chackSpace(int amount) {
        if ((this.storageInUse + amount) > this.totalStorage) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return ("Model: " + this.model + "\nPrice: " + this.price
                + "\nTotal Storage:  " + this.totalStorage);
    }

}
