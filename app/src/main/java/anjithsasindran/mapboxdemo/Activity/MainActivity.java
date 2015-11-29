package anjithsasindran.mapboxdemo.Activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.views.MapView;

import java.util.HashMap;
import java.util.Map;

import anjithsasindran.mapboxdemo.Interface.BingApi;
import anjithsasindran.mapboxdemo.Keys.ApiKeys;
import anjithsasindran.mapboxdemo.Modal.Destination;
import anjithsasindran.mapboxdemo.Modal.Point;
import anjithsasindran.mapboxdemo.R;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    EditText searchLocation;
    FloatingActionsMenu fabMenu;
    MapView mapView;
    InputMethodManager imm;
    public static final String ENDPOINT = "http://dev.virtualearth.net/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setStyleUrl(Style.MAPBOX_STREETS);
        mapView.setCenterCoordinate(new LatLng(40.73581, -73.99155));
        mapView.setZoomLevel(11);
        mapView.onCreate(savedInstanceState);

        fabMenu = (FloatingActionsMenu) findViewById(R.id.fab_menu);
        imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        searchLocation = (EditText) findViewById(R.id.searchLocation);
        searchLocation.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    if (searchLocation.getText().toString().trim().length() != 0) {

                        Map<String, String> options = new HashMap<>();
                        options.put("q", searchLocation.getText().toString());
                        options.put("key", ApiKeys.BING_MAPS_KEY);

                        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl(ENDPOINT)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();
                        BingApi api = retrofit.create(BingApi.class);

                        Call<Destination> destination = api.getCoordinates(options);
                        destination.enqueue(new Callback<Destination>() {
                            @Override
                            public void onResponse(Response<Destination> response, Retrofit retrofit) {
                                Point point = response.body().getResourceSets().get(0)
                                        .getResources().get(0).getPoint();

                                mapView.addMarker(new MarkerOptions().position(new LatLng(point.getCoordinates().get(0),
                                        point.getCoordinates().get(1))));
                                mapView.setCenterCoordinate(new LatLng(point.getCoordinates().get(0),
                                        point.getCoordinates().get(1)));
                            }

                            @Override
                            public void onFailure(Throwable t) {

                            }
                        });

                        imm.hideSoftInputFromWindow(searchLocation.getWindowToken(), 0);
                        return true;
                    } else {
                        Toast.makeText(getBaseContext(), "Enter location", Toast.LENGTH_SHORT).show();
                    }
                }
                return false;
            }
        });
    }

    public void enterLocation(View view) {
        fabMenu.collapse();
        searchLocation.requestFocus();
        imm.showSoftInput(searchLocation, InputMethodManager.SHOW_IMPLICIT);
    }

    public void selectStyle(View view) {
        fabMenu.collapse();
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setItems(new CharSequence[]{"Streets", "Emerald", "Dark", "Light",
                "Satellite"}, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    mapView.setStyle(Style.MAPBOX_STREETS);
                } else if (i == 1) {
                    mapView.setStyle(Style.EMERALD);
                } else if (i == 2) {
                    mapView.setStyle(Style.DARK);
                } else if (i == 3) {
                    mapView.setStyle(Style.LIGHT);
                } else {
                    mapView.setStyle(Style.SATELLITE);
                }
            }
        });
        dialogBuilder.create().show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}