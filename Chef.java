package codeAlong2;

public class Chef {
    private String signatureDish = "toast";
    private int signaturePrice = 5;

    public Chef(String name){
        System.out.println("I am chef " + name + "!");
    }
    public void setSignatureDish(String dish){
        this.signatureDish = dish;
    }
    public String getSignatureDish(){
        return this.signatureDish;
    }

    public void setSignaturePrice(int price){this.signaturePrice = price;}
    public int getSignaturePrice(){return this.signaturePrice;}

    public void cook(String order){
        System.out.println("Your " + order + " is being prepped now!");
    }

}