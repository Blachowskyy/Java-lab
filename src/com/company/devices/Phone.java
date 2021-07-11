package com.company.devices;
import com.company.Human;
import com.company.selleable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Phone extends Device implements selleable {
    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_REPO_PROTOCOL = "https://";
    private static final String DEFAULT_REPO_ADDRESS = "repo.apps.com";
    public Phone(String producer, String model, Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    Human owner;
    Set<Application> installedApplications = new HashSet<Application>();
    public void setOwner(Human owner){
        this.owner = owner;
    }
    public void installApp(Application app){
        if(this.owner.getCash() >= app.price){
            System.out.println("Owner have money:");
            this.owner.subtractCash(app.price);
            System.out.println("Charging account: " + app.price);
            installedApplications.add(app);
            System.out.println("Installed app:  " + app.name);
        }else{
            System.out.println("Owner can't buy this app, reason: can't afford it");
        }

        System.out.println("");
    }
    public void showInstalledApps(){
        System.out.println();
        System.out.println("Installed apps in phone:");
        for(Application app: installedApplications){
            System.out.println(app.name);
        }
        System.out.println();
    }
    public void showInstalledFreeApps(){
        System.out.println();
        System.out.println("Installed free apps in phone:");
        for(Application app: installedApplications){
            if(app.price == 0.0) {
                System.out.println(app.name);
            }
        }
        System.out.println();
    }
    public void showInstalledAppsAlphabetically(){
        System.out.println(installedApplications.toString());
        System.out.println();
    }
    public Double valueOfInstalledApps(){
        Double value = 0.0;
        for(Application app: installedApplications){
            value += app.price;
        }
        return value;
    }
    public boolean isAppInstalled(Application app){
        return installedApplications.contains(app);
    }
    public boolean isAppInstalled(String appName){
        boolean isInstalled = false;
        for (Application app: installedApplications){
            if(app.getName() == appName){
                isInstalled = true;
                break;
            }
        }
        return isInstalled;
    }
    @Override
    public void turnOn() {
        System.out.println("Phone turned on:  " +producer+" "+ model);
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        boolean isBuyerHasMoney;
        boolean isSellerHasPhone;
        if (seller.getPhone() == null ){
            System.out.println("Seller don't own the phone");
            isSellerHasPhone = false;
        }else{
            isSellerHasPhone = true;
        }
        if (buyer.getCash() < price){
            System.out.println("Buyer have no money");
            isBuyerHasMoney = false;
        }else{
            isBuyerHasMoney = true;
        }
        if (isBuyerHasMoney && isSellerHasPhone){
            buyer.subtractCash(price);
            seller.addCash(price);
            buyer.setPhone(seller.getPhone());
            System.out.println("Buyer get phone " + buyer.getPhone().toString());
            seller.setPhone(null);
            System.out.println("Seller gave away phone");
        }
    }
    public void installApp(String appId){
        this.installApp(appId, DEFAULT_APP_VERSION, DEFAULT_REPO_PROTOCOL, DEFAULT_REPO_ADDRESS);
    }
    public void installApp(String appId, String appVersion){
        this.installApp(appId,appVersion,DEFAULT_REPO_PROTOCOL,DEFAULT_REPO_ADDRESS);
    }
    public void installApp(List<String> appIds) {
        for (String appId : appIds) {
            this.installApp(appId);
        }
    }
    public void installApp(String appId, String appVersion, String repoProtocol, String repoAddress){
        String repoURL = repoProtocol + repoAddress;
        System.out.println("Estabilishing connection to: " + repoURL);
        System.out.println("Instaling app, please wait.... " + appId);
        System.out.println("Application version: " + appVersion);
        System.out.println("Done, thanks for the patience :D");
    }
}