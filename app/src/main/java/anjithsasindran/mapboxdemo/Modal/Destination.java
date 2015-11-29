
package anjithsasindran.mapboxdemo.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Destination {

    @SerializedName("authenticationResultCode")
    @Expose
    private String authenticationResultCode;
    @SerializedName("brandLogoUri")
    @Expose
    private String brandLogoUri;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("resourceSets")
    @Expose
    private List<ResourceSet> resourceSets = new ArrayList<ResourceSet>();
    @SerializedName("statusCode")
    @Expose
    private int statusCode;
    @SerializedName("statusDescription")
    @Expose
    private String statusDescription;
    @SerializedName("traceId")
    @Expose
    private String traceId;

    /**
     * 
     * @return
     *     The authenticationResultCode
     */
    public String getAuthenticationResultCode() {
        return authenticationResultCode;
    }

    /**
     * 
     * @param authenticationResultCode
     *     The authenticationResultCode
     */
    public void setAuthenticationResultCode(String authenticationResultCode) {
        this.authenticationResultCode = authenticationResultCode;
    }

    /**
     * 
     * @return
     *     The brandLogoUri
     */
    public String getBrandLogoUri() {
        return brandLogoUri;
    }

    /**
     * 
     * @param brandLogoUri
     *     The brandLogoUri
     */
    public void setBrandLogoUri(String brandLogoUri) {
        this.brandLogoUri = brandLogoUri;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The resourceSets
     */
    public List<ResourceSet> getResourceSets() {
        return resourceSets;
    }

    /**
     * 
     * @param resourceSets
     *     The resourceSets
     */
    public void setResourceSets(List<ResourceSet> resourceSets) {
        this.resourceSets = resourceSets;
    }

    /**
     * 
     * @return
     *     The statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * 
     * @param statusCode
     *     The statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     *     The statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * 
     * @param statusDescription
     *     The statusDescription
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * 
     * @return
     *     The traceId
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * 
     * @param traceId
     *     The traceId
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

}
