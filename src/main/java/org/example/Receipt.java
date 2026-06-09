//Store name
//Date
//Total Amount

package org.example;
public class Receipt {
    private String storeName;
    private String date;
    private  double TotalAmount;
    public Receipt(){

    }
    public Receipt(String storeName, String date, double TotalAmount){
        this.storeName = storeName;
        this.date = date;
        this.TotalAmount = TotalAmount;
    }
    public  String getStoreName(){
        return storeName;
    }
    public void setStoreName(String storeName){
        this.storeName=storeName;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public double getTotalAmount(){
        return TotalAmount;
    }
    public void setTotalAmount(double TotalAmount){
        this.TotalAmount = TotalAmount;
    }
}

