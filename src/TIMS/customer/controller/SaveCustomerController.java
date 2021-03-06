/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsCustomer;
import TIMS.customer.dto.CustomerDto;
import TIMS.customer.model.CustomerModel;

/**
 *
 * @author Sithara
 */
public class SaveCustomerController extends BaseController {

    protected CustomerModel customerModel = null;

    public CustomerModel getCustomerModel() {
        if (this.customerModel == null) {
            this.customerModel = new CustomerModel();
        }
        return customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }

    public void saveCustomer(CustomerDto customerDto) {
        TimsCustomer saveCustomer = this.getCustomerModel().saveCustomer(customerDto);

        CustomerDto dto = new CustomerDto();        
        
        dto.setCode(saveCustomer.getCode());
        dto.setCity(saveCustomer.getCity());
        dto.setEmail(saveCustomer.getEmail());
        dto.setFax(saveCustomer.getFax());
        dto.setMobile(saveCustomer.getMobileNo());
        dto.setName(saveCustomer.getName());
        dto.setOther(saveCustomer.getOther());
        dto.setOtherName(saveCustomer.getOtherName());
        dto.setPobox(saveCustomer.getPobox());
        dto.setStreet(saveCustomer.getStreet());
        dto.setTel(saveCustomer.getTelephone());
        dto.setType(saveCustomer.getType());

        AddCustomerController addCustomerController = new AddCustomerController(dto);
        addCustomerController.execute();
    }

    @Override
    public void execute() {
    }
}
