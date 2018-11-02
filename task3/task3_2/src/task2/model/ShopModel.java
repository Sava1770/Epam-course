package task2.model;

import task2.entity.Shop;
import task2.entity.Shop.Department;
import task2.model.comparators.DepartmentComparator;
import task2.model.comparators.IdComparator;

public class ShopModel {

    private ShopRepository shopRepository;
    private static final IdComparator ID_COMPARATOR = new IdComparator();
    private static final DepartmentComparator DEPARTMENT_COMPARATOR = new DepartmentComparator();

    public void setShopInRepository(Shop shop) {
        shopRepository.setShop(shop);
    }

    public ShopModel(ShopRepository shopRepository){
        this.shopRepository = shopRepository;
    }

    public void departmentRemove(int id){
        shopRepository.removeDepartment(id);
    }

    public void departmentSortById (){shopRepository.getShop().getDepartments().sort(ID_COMPARATOR); }

    public void departmentSortByProducts(){
        shopRepository.getShop().getDepartments().sort(DEPARTMENT_COMPARATOR);
    }

    public void addDepartment(String departmentName, String productName, String place){
        shopRepository.addDepartment(new Department(departmentName, productName, place));
    }

    public Shop getShop() {
        return shopRepository.getShop();
    }
}
