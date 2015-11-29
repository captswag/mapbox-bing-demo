
package anjithsasindran.mapboxdemo.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("adminDistrict")
    @Expose
    private String adminDistrict;
    @SerializedName("adminDistrict2")
    @Expose
    private String adminDistrict2;
    @SerializedName("countryRegion")
    @Expose
    private String countryRegion;
    @SerializedName("formattedAddress")
    @Expose
    private String formattedAddress;
    @SerializedName("locality")
    @Expose
    private String locality;

    /**
     * 
     * @return
     *     The adminDistrict
     */
    public String getAdminDistrict() {
        return adminDistrict;
    }

    /**
     * 
     * @param adminDistrict
     *     The adminDistrict
     */
    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    /**
     * 
     * @return
     *     The adminDistrict2
     */
    public String getAdminDistrict2() {
        return adminDistrict2;
    }

    /**
     * 
     * @param adminDistrict2
     *     The adminDistrict2
     */
    public void setAdminDistrict2(String adminDistrict2) {
        this.adminDistrict2 = adminDistrict2;
    }

    /**
     * 
     * @return
     *     The countryRegion
     */
    public String getCountryRegion() {
        return countryRegion;
    }

    /**
     * 
     * @param countryRegion
     *     The countryRegion
     */
    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    /**
     * 
     * @return
     *     The formattedAddress
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * 
     * @param formattedAddress
     *     The formattedAddress
     */
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    /**
     * 
     * @return
     *     The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * 
     * @param locality
     *     The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

}
