package task2.view;

import task2.entity.Shop;

public class ShopView {


    public void printShopDepartments(Shop shop){
        System.out.println(shop);

        for(int i = 0; i < shop.getDepartments().size(); i++){  //гетерами вывести нужные элементы

            System.out.println(shop.getDepartments().get(i));
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
