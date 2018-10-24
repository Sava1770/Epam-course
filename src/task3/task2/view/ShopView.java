package task3.task2.view;

import task3.task2.entity.Shop;

import java.util.List;

public class ShopView {


    public void printShopDepartments(Shop shop, String shopName){
        System.out.println("Your shop name is " + shopName + "\n");

        for(int i = 0; i < shop.getDepartments().size(); i++){  //гетерами вывести нужные элементы

            System.out.println("Department name: " + shop.getDepartments().get(i).getDepartmentName()+
                               " Department id: " + shop.getDepartments().get(i).getId()+
                               " Place " + shop.getDepartments().get(i).getPlace());
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
