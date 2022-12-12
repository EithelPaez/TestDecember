package com.example.test1demoproyect1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/sortProducts")
    @ResponseBody
    public JSONArray getSortedProducts(JSONArray productList) {
        return getSortedDates(productList);
    }

    @GetMapping("/getProdAvailability")
    @ResponseBody
    public ResponseEntity<Void> getAvailability(String storeId, String productId) {
        Store store = new Store(storeId);
        if ( store.getAvailability() <= 0 ) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @GetMapping("/getProdCapacity")
    @ResponseBody
    public ResponseEntity<Object> getCapacity(String storeId, String productId) {
        Store store = new Store(storeId);
        if (store.getCapacity() <= 0) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
          return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    private JSONArray getSortedDates(JSONArray array) throws JSONException {
        List<JSONObject> list = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            list.add(array.getJSONObject(i));
        }
        list.sort((a1, a2) -> {
            try {
                return Integer.compare(a1.getInt("launchDate"), a2.getInt("launchDate"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return 0;
        });
        return new JSONArray(list);
    }
}
