package task2.model;

import task2.entity.Shop;
import task2.entity.Shop.Department;

import java.util.List;

public class ShopRepository {

    private Shop shop;

    public Shop getShop() {
       return shop;
    }

    public void setShop(Shop shop){
        this.shop = shop;
    }

    public void addDepartment(Department department){
        shop.getDepartments().add(department);
    }

    public void removeDepartment(int id){
        List<Department> departments = shop.getDepartments();
        for(int i = 0; i < departments.size(); i++){
            if(departments.get(i).getId() == id){
                departments.remove(i);
                break;
            }
        }
    }



}
