package TIMS.app.lib.hbm;
// Generated May 30, 2014 10:33:11 PM by Hibernate Tools 3.2.1.GA



/**
 * TimsSale generated by hbm2java
 */
public class TimsSale  implements java.io.Serializable {


     private Integer code;
     private Integer timsInvoice;
     private Integer timsProduct;
     private Integer timsBarnd;
     private Float rate;
     private Integer qty;
     private Double discount;

    public TimsSale() {
    }

    public TimsSale(Integer timsInvoice, Integer timsProduct, Integer timsBarnd, Float rate, Integer qty, Double discount) {
       this.timsInvoice = timsInvoice;
       this.timsProduct = timsProduct;
       this.timsBarnd = timsBarnd;
       this.rate = rate;
       this.qty = qty;
       this.discount = discount;
    }
   
    public Integer getCode() {
        return this.code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    public Integer getTimsInvoice() {
        return this.timsInvoice;
    }
    
    public void setTimsInvoice(Integer timsInvoice) {
        this.timsInvoice = timsInvoice;
    }
    public Integer getTimsProduct() {
        return this.timsProduct;
    }
    
    public void setTimsProduct(Integer timsProduct) {
        this.timsProduct = timsProduct;
    }
    public Integer getTimsBarnd() {
        return this.timsBarnd;
    }
    
    public void setTimsBarnd(Integer timsBarnd) {
        this.timsBarnd = timsBarnd;
    }
    public Float getRate() {
        return this.rate;
    }
    
    public void setRate(Float rate) {
        this.rate = rate;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }




}


