
package anjithsasindran.mapboxdemo.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Point {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coordinates")
    @Expose
    private List<Float> coordinates = new ArrayList<Float>();

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

}
