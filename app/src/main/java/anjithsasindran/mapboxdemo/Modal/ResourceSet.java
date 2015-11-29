
package anjithsasindran.mapboxdemo.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResourceSet {

    @SerializedName("estimatedTotal")
    @Expose
    private int estimatedTotal;
    @SerializedName("resources")
    @Expose
    private List<Resource> resources = new ArrayList<Resource>();

    /**
     * 
     * @return
     *     The estimatedTotal
     */
    public int getEstimatedTotal() {
        return estimatedTotal;
    }

    /**
     * 
     * @param estimatedTotal
     *     The estimatedTotal
     */
    public void setEstimatedTotal(int estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }

    /**
     * 
     * @return
     *     The resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * 
     * @param resources
     *     The resources
     */
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

}
