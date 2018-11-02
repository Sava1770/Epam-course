package view;

public class BankView {

        public void printMessage(String message){
            System.out.println(message);
        }

        public void print(double resultSum, String name, boolean opportunityToGetSet, boolean appExist){
            String opportunity;
            String applicationExist;

            if(opportunityToGetSet){                            //check opportunity to get or add money
                opportunity = "yes";
            }
            else {
                opportunity = "no";
            }

            if(appExist){                                       //check bank application existence
                applicationExist = "have ";
            }
            else {
                applicationExist = "don't have ";
            }

            System.out.println("Name of bank: " + name + ", opportunity to get or set your money in every moment: " + opportunity + ", this bank " + applicationExist +
                                "own application, and your result sum " + resultSum);
        }

    }

