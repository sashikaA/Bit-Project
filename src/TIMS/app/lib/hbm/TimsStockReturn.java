package TIMS.app.lib.hbm;
// Generated May 30, 2014 10:33:11 PM by Hibernate Tools 3.2.1.GA



/**
 * TimsStockReturn generated by hbm2java
 */
public class TimsStockReturn  implements java.io.Serializable {


     private Integer code;
     private TimsInvoice timsInvoiceByInvoiceNo;
     private TimsProduct timsProduct;
     private TimsBarnd timsBarnd;
     private TimsInvoice timsInvoiceByRefInvoiceNo;
     private String type;
     private String reason;
     private Integer qty;
     private Long rate;
     private String other;

    public TimsStockReturn() {
    }

    public TimsStockReturn(TimsInvoice timsInvoiceByInvoiceNo, TimsProduct timsProduct, TimsBarnd timsBarnd, TimsInvoice timsInvoiceByRefInvoiceNo, String type, String reason, Integer qty, Long rate, String other) {
       this.timsInvoiceByInvoiceNo = timsInvoiceByInvoiceNo;
       this.timsProduct = timsProduct;
       this.timsBarnd = timsBarnd;
       this.timsInvoiceByRefInvoiceNo = timsInvoiceByRefInvoiceNo;
       this.type = type;
       this.reason = reason;
       this.qty = qty;
       this.rate = rate;
       this.other = other;
    }
   
    public Integer getCode() {
        return this.code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    public TimsInvoice getTimsInvoiceByInvoiceNo() {
        return this.timsInvoiceByInvoiceNo;
    }
    
    public void setTimsInvoiceByInvoiceNo(TimsInvoice timsInvoiceByInvoiceNo) {
        this.timsInvoiceByInvoiceNo = timsInvoiceByInvoiceNo;
    }
    public TimsProduct getTimsProduct() {
        return this.timsProduct;
    }
    
    public void setTimsProduct(TimsProduct timsProduct) {
        this.timsProduct = timsProduct;
    }
    public TimsBarnd getTimsBarnd() {
        return this.timsBarnd;
    }
    
    public void setTimsBarnd(TimsBarnd timsBarnd) {
        this.timsBarnd = timsBarnd;
    }
    public TimsInvoice getTimsInvoiceByRefInvoiceNo() {
        return this.timsInvoiceByRefInvoiceNo;
    }
    
    public void setTimsInvoiceByRefInvoiceNo(TimsInvoice timsInvoiceByRefInvoiceNo) {
        this.timsInvoiceByRefInvoiceNo = timsInvoiceByRefInvoiceNo;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Long getRate() {
        return this.rate;
    }
    
    public void setRate(Long rate) {
        this.rate = rate;
    }
    public String getOther() {
        return this.other;
    }
    
    public void setOther(String other) {
        this.other = other;
    }




}


