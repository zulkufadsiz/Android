package com.example.zulkuf.sdukampus.data;

import org.json.JSONObject;

/**
 * Created by zulkuf on 10/03/17.
 */

public class Channel implements JSONPopulator {
    private Item item;
    private Units units;
    private Location location;

    public Item getItem() {
        return item;
    }

    public Units getUnits() {
        return units;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public void populate(JSONObject data) {

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));

        location = new Location();
        location.populate(data.optJSONObject("location"));

    }
}
