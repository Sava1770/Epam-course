package task2.entity;

import task2.model.comparators.IdComparator;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static int count = 0;
    private String shopName;
    private int workersNumber;

    private List<Department> departments = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString(){
        return "Your shop name is " + shopName + "\n";
    }

    public static class Department{

        private String departmentName;
        private String productName;
        private String place;
        private int Id = count++;

        public Department(String departmentName, String productName, String place){

            this.departmentName = departmentName;
            this.productName = productName;
            this.place = place;
        }

        public int getId() {
            return Id;
        }

        public String getPlace() {
            return place;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        @Override
        public String toString(){
         return  "Department name: " + departmentName + " Department id: " + Id + " Place " + place;
        }
    }
}
