/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsSupplier;
import java.util.List;

/**
 *
 * @author Damith
 */
public class SupplierDao extends BaseDao {

    TimsSupplier supplier = null;

    public SupplierDao() {
    }

    public SupplierDao(TimsSupplier supplier) {
        this.supplier = supplier;
    }

    public TimsSupplier saveSupplier() {
        return this.saveSupplier(this.supplier);
    }

    public TimsSupplier saveSupplier(TimsSupplier supplier) {
        return (TimsSupplier) saveEntity(supplier);

    }

    public TimsSupplier updateSupplier(TimsSupplier supplier) {
        return (TimsSupplier) updateEntity(supplier);
    }

    public TimsSupplier updateSupplier() {
        return this.updateSupplier(this.supplier);
    }

    public TimsSupplier getSupplierByCode(Integer code) {
        return (TimsSupplier) this.getEntityByPrimaryKey(TimsSupplier.class, code);
    }

    public List getAllSuppliers() {
        String sql = "FROM  TimsSupplier";
        return this.executeQuery(sql, false);
    }

    public int deleteSupplierById(Integer supplierId) {
        return this.deletEntityByPrimaryKey(TimsSupplier.class, supplierId);
    }
}
