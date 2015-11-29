
package anjithsasindran.mapboxdemo.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Resource {

    @SerializedName("__type")
    @Expose
    private String Type;
    @SerializedName("bbox")
    @Expose
    private List<Float> bbox = new ArrayList<Float>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("point")
    @Expose
    private Point point;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("confidence")
    @Expose
    private String confidence;
    @SerializedName("entityType")
    @Expose
    private String entityType;
    @SerializedName("geocodePoints")
    @Expose
    private List<GeocodePoint> geocodePoints = new ArrayList<GeocodePoint>();
    @SerializedName("matchCodes")
    @Expose
    private List<String> matchCodes = new ArrayList<String>();

    /**
     * 
     * @return
     *     The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The __type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The bbox
     */
    public List<Float> getBbox() {
        return bbox;
    }

    /**
     * 
     * @param bbox
     *     The bbox
     */
    public void setBbox(List<Float> bbox) {
        this.bbox = bbox;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The point
     */
    public Point getPoint() {
        return point;
    }

    /**
     * 
     * @param point
     *     The point
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * 
     * @return
     *     The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The confidence
     */
    public String getConfidence() {
        return confidence;
    }

    /**
     * 
     * @param confidence
     *     The confidence
     */
    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    /**
     * 
     * @return
     *     The entityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * 
     * @param entityType
     *     The entityType
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * 
     * @return
     *     The geocodePoints
     */
    public List<GeocodePoint> getGeocodePoints() {
        return geocodePoints;
    }

    /**
     * 
     * @param geocodePoints
     *     The geocodePoints
     */
    public void setGeocodePoints(List<GeocodePoint> geocodePoints) {
        this.geocodePoints = geocodePoints;
    }

    /**
     * 
     * @return
     *     The matchCodes
     */
    public List<String> getMatchCodes() {
        return matchCodes;
    }

    /**
     * 
     * @param matchCodes
     *     The matchCodes
     */
    public void setMatchCodes(List<String> matchCodes) {
        this.matchCodes = matchCodes;
    }

}
