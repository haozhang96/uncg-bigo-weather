package edu.uncg.csc.bigo.weather.models.api.location;
/**
 * This class defines the Geocodio location API.
 *
 * @updated 2018/11/01
 * @authors Harman Bains, Hao Zhang
 */


import edu.uncg.csc.bigo.weather.models.api.JSONAPI;
import edu.uncg.csc.bigo.weather.models.util.LocationCoordinate;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;


public final class GeocodioAPI extends JSONAPI implements LocationAPI {
    public GeocodioAPI(String _apiKey) {
        super(String.format("https://api.geocod.io/v1.3/geocode?q=%%d&api_key=%s", _apiKey));
    }


    public LocationCoordinate getCurrentCoordinate() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This method is currently unsupported.");
    }


    public boolean isZipCodeValid(int _zipCode) throws IOException, JSONException {
        return this.getResponse(_zipCode).getJSONArray("results").length() > 0;
    }


    public LocationCoordinate zipCodeToCoordinate(int _zipCode) throws IOException, JSONException {
        //
        JSONObject locationJSON = this.getResponse(_zipCode)
                .getJSONArray("results")
                .getJSONObject(0)
                .getJSONObject("location");

        //
        double  latitude = locationJSON.getDouble("lat"),
                longitude = locationJSON.getDouble("lng");
        return new LocationCoordinate(latitude, longitude);
    }
}