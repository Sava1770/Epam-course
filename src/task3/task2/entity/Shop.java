package task3.task2.entity;

public class Shop {

    private static int count = 0;
    private String shopName;
    private int Id = count++;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getId() {
        return Id;
    }

    public class Department{

        private String departmentName;
        private String productName;
        private String place;


    }
}
