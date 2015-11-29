package anjithsasindran.mapboxdemo.Interface;

import java.util.Map;

import anjithsasindran.mapboxdemo.Modal.Destination;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by Anjith Sasindran
 * on 27-Nov-15.
 */
public interface BingApi {

    @GET("/REST/v1/Locations")
    Call<Destination> getCoordinates(@QueryMap Map<String, String> options);
}
