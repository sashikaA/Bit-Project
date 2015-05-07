package TIMS.app.lib.hbm;
// Generated May 30, 2014 10:33:11 PM by Hibernate Tools 3.2.1.GA



/**
 * TimsProductBrandId generated by hbm2java
 */
public class TimsProductBrandId  implements java.io.Serializable {


     private int productCode;
     private int brandCode;

    public TimsProductBrandId() {
    }

    public TimsProductBrandId(int productCode, int brandCode) {
       this.productCode = productCode;
       this.brandCode = brandCode;
    }
   
    public int getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public int getBrandCode() {
        return this.brandCode;
    }
    
    public void setBrandCode(int brandCode) {
        this.brandCode = brandCode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TimsProductBrandId) ) return false;
		 TimsProductBrandId castOther = ( TimsProductBrandId ) other; 
         
		 return (this.getProductCode()==castOther.getProductCode())
 && (this.getBrandCode()==castOther.getBrandCode());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getProductCode();
         result = 37 * result + this.getBrandCode();
         return result;
   }   


}

