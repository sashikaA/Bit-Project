package TIMS.app.lib.hbm;
// Generated May 30, 2014 10:33:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TimsBarnd generated by hbm2java
 */
public class TimsBarnd  implements java.io.Serializable {


     private Integer code;
     private String name;
     private String description;
     private String other;
     private Set timsProductBrands = new HashSet(0);
     private Set timsSaleReturns = new HashSet(0);
     private Set timsPurcheses = new HashSet(0);
     private Set timsStockReturns = new HashSet(0);
     private Set timsSales = new HashSet(0);

    public TimsBarnd() {
    }

	
    public TimsBarnd(String name) {
        this.name = name;
    }
    public TimsBarnd(String name, String description, String other, Set timsProductBrands, Set timsSaleReturns, Set timsPurcheses, Set timsStockReturns, Set timsSales) {
       this.name = name;
       this.description = description;
       this.other = other;
       this.timsProductBrands = timsProductBrands;
       this.timsSaleReturns = timsSaleReturns;
       this.timsPurcheses = timsPurcheses;
       this.timsStockReturns = timsStockReturns;
       this.timsSales = timsSales;
    }
   
    public Integer getCode() {
        return this.code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getOther() {
        return this.other;
    }
    
    public void setOther(String other) {
        this.other = other;
    }
    public Set getTimsProductBrands() {
        return this.timsProductBrands;
    }
    
    public void setTimsProductBrands(Set timsProductBrands) {
        this.timsProductBrands = timsProductBrands;
    }
    public Set getTimsSaleReturns() {
        return this.timsSaleReturns;
    }
    
    public void setTimsSaleReturns(Set timsSaleReturns) {
        this.timsSaleReturns = timsSaleReturns;
    }
    public Set getTimsPurcheses() {
        return this.timsPurcheses;
    }
    
    public void setTimsPurcheses(Set timsPurcheses) {
        this.timsPurcheses = timsPurcheses;
    }
    public Set getTimsStockReturns() {
        return this.timsStockReturns;
    }
    
    public void setTimsStockReturns(Set timsStockReturns) {
        this.timsStockReturns = timsStockReturns;
    }
    public Set getTimsSales() {
        return this.timsSales;
    }
    
    public void setTimsSales(Set timsSales) {
        this.timsSales = timsSales;
    }




}

