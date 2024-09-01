package codeAlong2;

public class Restaurant {
    private Chef mainChef;
    private Chef sousChef;
    public Restaurant() {
        this.mainChef = new Chef("Andy");
        this.sousChef = new Chef("Effie");
        this.createMenu();
    }
    public void createMenu(){
        this.mainChef.setSignatureDish("cookies");
        this.mainChef.setSignaturePrice(6);

        this.sousChef.setSignatureDish("chicken parm");
        this.sousChef.setSignaturePrice(30);
    }

    public void seeMenu(){
        System.out.println(this.mainChef.getSignatureDish() + ", "+ this.mainChef.getSignaturePrice());
        System.out.println(this.sousChef.getSignatureDish() + ", "+ this.sousChef.getSignaturePrice());
        System.out.println("pasta, 20");

        this.sousChef.cook(this.sousChef.getSignatureDish());
        this.mainChef.cook("pasta");

    }
}