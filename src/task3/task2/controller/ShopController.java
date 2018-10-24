package task3.task2.controller;

import task3.task2.entity.Shop;
import task3.task2.model.ShopModel;
import task3.task2.view.Input;
import task3.task2.view.ShopView;

import static task3.task2.view.Constants.*;


public class ShopController {

    private ShopView view;
    private ShopModel model;

    public ShopController(ShopView view, ShopModel model){
        this.view = view;
        this.model = model;
    }


    public void run(){
        String departmentName;
        String productName;
        String place;
        int removePosition;
        int num = 1;

        String shopName = Input.inputLine(view, OUTPUT);
        Shop shop = new Shop();
        model.setShopInRepository(shop);

        while(num >= 1 && num < 5)
        switch(num = Input.inputValue(view, OUTPUT_SELECT_FIRST)){
            case 1:
                departmentName = Input.inputLine(view, DEPARTMENT_INPUT);
                productName = Input.inputLine(view, PRODUCT_INPUT);
                place = Input.inputLine(view, PLACE_INPUT);
                model.addDepartment(departmentName, productName, place);
                break;
            case 2:
                model.departmentSortById();
                view.printShopDepartments(model.getShop(), shopName);
                break;
            case 3:
                model.departmentSortByProducts();
                view.printShopDepartments(model.getShop(), shopName);
                break;
            case 4:
                removePosition = Input.inputValue(view, REMOVE_POSITION);
                model.departmentRemove(removePosition);
                break;
        }

    }
}
