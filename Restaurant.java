package codeAlong2;

public class Restaurant {
    private Chef mainChef;
    //TODO: declare another Chef instance variable
    public Restaurant() {
        // TODO : uncomment this line once the Chef class has a constructor!
        //this.mainChef = new Chef("Andy");
        // TODO: create the other chef (initialize and instantiate)
        this.createMenu();
    }
    public void createMenu(){
        this.mainChef.setSignatureDish("cookies");
        //TODO: uncomment this line once you've made this method in Chef()!
        //this.mainChef.setSignaturePrice(6);

        // TODO: use the getters and setters to add the other chefs signature dish

    }

    public void seeMenu(){
        // TODO: Uncomment this line
        //System.out.println(this.mainChef.getSignatureDish() + ", "+ this.mainChef.getSignaturePrice());
        // TODO: use the getters to print out the sous chefs signature dish
        // TODO: add another dish to the menu
        System.out.println("");

        // TODO: have our 2 chefs cook something
        System.out.println("");

    }
}