package PDP.groupPractice.myPractice;

public class Magazine {
    private String type;
    private String name;
    private double price;
    private int qty;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean buying(int num){
        if(getQty()>=num){
            setQty(getQty()-num);
            return true;
        }return false;
    }

    public void setAdd(int num){
         this.qty+=num;
    }

    public int getAdd(){
        return this.qty;
    }


}
