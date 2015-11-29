
package anjithsasindran.mapboxdemo.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GeocodePoint {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coordinates")
    @Expose
    private List<Float> coordinates = new ArrayList<Float>();
    @SerializedName("calculationMethod")
    @Expose
    private String calculationMethod;
    @SerializedName("usageTypes")
    @Expose
    private List<String> usageTypes = new ArrayList<String>();

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    public List<Float> getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The calculationMethod
     */
    public String getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * 
     * @param calculationMethod
     *     The calculationMethod
     */
    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    /**
     * 
     * @return
     *     The usageTypes
     */
    public List<String> getUsageTypes() {
        return usageTypes;
    }

    /**
     * 
     * @param usageTypes
     *     The usageTypes
     */
    public void setUsageTypes(List<String> usageTypes) {
        this.usageTypes = usageTypes;
    }

}
