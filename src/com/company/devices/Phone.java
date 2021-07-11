package com.company.devices;
import com.company.Human;
import com.company.selleable;
import java.util.List;
public class Phone extends Device implements selleable {
    Double memory;
    Double screenSize;
    private static final String DEFAULT_REPO_ADDRESS = "repo.apps.com";
    private static final String DEFAULT_REPO_PROTOCOL = "https://";
    private static final String DEFAULT_APPLICATION_VERSION = "latest";
    public Phone(String producer, String model, Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public void turnOn(){
        System.out.println("This phone "+producer+" "+model+" is now turned on.");
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        boolean isBuyerHasMoney;
        boolean isSellerHasPhone;
        if (seller.getPhone() == null ){
            System.out.println("Seller don't have a phone...");
            isSellerHasPhone = false;
        }else{
            isSellerHasPhone = true;
        }
        if (buyer.getCash() < price){
            System.out.println("Buyer don't have money!");
            isBuyerHasMoney = false;
        }else{
            isBuyerHasMoney = true;
        }
        if (isBuyerHasMoney && isSellerHasPhone){
            buyer.subtractCash(price);
            seller.addCash(price);
            buyer.setPhone(seller.getPhone());
            System.out.println("Buyer got a phone " + buyer.getPhone().toString());
            seller.setPhone(null);
            System.out.println("We removed sellers phone");
        }
    }
    public void installApp(String appId){
        this.installApp(appId);
    }
    public void installApp(String appId, String appVersion){
        appVersion = DEFAULT_APPLICATION_VERSION;
        this.installApp(appId, appVersion);
    }
    public void installApp(List<String> appIds){
        for (String appId : appIds){
            this.installApp(appId);
        }
    }
    public void installApp(String appId, String appVersion,String repoProtocol, String repoAddress){
        String repoURL = repoProtocol + repoAddress;
        System.out.println("Estabilishing connection to: " + repoURL);
        System.out.println("Instaling app, please wait.... " + appId);
        System.out.println("Application version: " + appVersion);
        System.out.println("Done, thanks for the patience :D");
    }
}
