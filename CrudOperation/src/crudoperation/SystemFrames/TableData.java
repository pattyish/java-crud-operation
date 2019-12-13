
package crudoperation.SystemFrames;

class TableData {
   private String productName, productPrice; 
   private int productQuantity;
   public TableData(String name, String price, int quantity){
       this.productName = name;
       this.productPrice = price;
       this.productQuantity = quantity;
   }
   public String getProductName(){
       return this.productName;
   }
   public String getProductPrice(){
       return this.productPrice;
   }
   public int getQuantity(){
       return this.productQuantity;
   }
}
