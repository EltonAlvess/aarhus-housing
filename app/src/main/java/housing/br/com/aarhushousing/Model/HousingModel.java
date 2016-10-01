package housing.br.com.aarhushousing.Model;

import java.io.Serializable;

/**
 * Created by eltonalves on 9/12/16.
 */
public class HousingModel implements Serializable {
    private String Title;
    private String Type;
    private String Period;
    private String Address;
    private String Size;
    private String Roms;
    private String Deposit;
    private String MonthlyRent;
    private String PaymentOnAccount;
    private String Furnished;
    private String Smoking;
    private String Tenants;
    private String AdditionalDescription;
    private String Name;
    private String Phone;
    private String Email;
    private String Images;


    public String getImages(){return Images;}
    public void setImages(String img){
        Images = img;
    }

    public String getTitle(){
        return Title;
    }

    public void setTitle(String title){
        this.Title = title;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getPeriod() {
        return Period;
    }

    public void setPeriod(String period) {
        this.Period = period;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public String getRoms() {
        return Roms;
    }

    public void setRoms(String roms) {
        this.Roms = roms;
    }

    public String getDeposit() {
        return Deposit;
    }

    public void setDeposit(String deposit) {
        this.Deposit = deposit;
    }

    public String getMonthlyRent() {
        return MonthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.MonthlyRent = monthlyRent;
    }

    public String getPaymentOnAccount() {
        return PaymentOnAccount;
    }

    public void setPaymentOnAccount(String paymentAccount) {
        this.PaymentOnAccount = paymentAccount;
    }

    public String getFurnished() {
        return Furnished;
    }

    public void setFurnished(String furnished) {
        this.Furnished = furnished;
    }

    public String getSmoking() {
        return Smoking;
    }

    public void setSmoking(String smoking) {
        this.Smoking = smoking;
    }

    public String getTenants() {
        return Tenants;
    }

    public void setTenants(String tenants) {
        this.Tenants = tenants;
    }

    public String getAdditionalDescription() {
        return AdditionalDescription;
    }

    public void setAdditionalDescription(String addDescription) {
        AdditionalDescription = addDescription;
    }

    public String getName() {
        return Name;
    }

    public void setName(String ownerName) {
        this.Name = ownerName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }


}
