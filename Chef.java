package codeAlong2;

public class Chef {
    private String signatureDish;
    private int signaturePrice;

    public Chef(String name){
        this.signatureDish = "toast";
        this.signaturePrice = 5;
        System.out.println("I am chef " + name + "!");
    }

    public void setSignatureDish(String dish){
        this.signatureDish = dish;
    }

    public String getSignatureDish(){
        return this.signatureDish;
    }

    public void setSignaturePrice(int price){
        this.signaturePrice = price;
    }

    public int getSignaturePrice(){
        return this.signaturePrice;
    }

    public void cook(String order){
        System.out.println("Your " + order + " is being prepped now!");
        System.out.println("Your " + order + " is nearly done!");
        System.out.println("Your " + order + " is now served! Yum!");
    }
}