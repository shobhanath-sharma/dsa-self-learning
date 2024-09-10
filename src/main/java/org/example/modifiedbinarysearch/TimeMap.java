package org.example.modifiedbinarysearch;

import org.example.common.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {

    Map<String, List<Pair<Integer, String>>> timeBasedKVMap;

    public TimeMap() {
        timeBasedKVMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<Pair<Integer, String>> emptyPair = new ArrayList<>();
        List<Pair<Integer, String>> existingMapValue = timeBasedKVMap.getOrDefault(key, emptyPair);

        existingMapValue.add(new Pair<>(timestamp, value));
        timeBasedKVMap.put(key, existingMapValue);
    }

    public String get(String key, int timestamp) {
        String result = "";
        if (key != null && timeBasedKVMap.containsKey(key)) {

            List<Pair<Integer, String>> existingValue = timeBasedKVMap.get(key);
            int l = 0;
            int r = existingValue.size() - 1;

            while (l <= r) {
                int mid = (l + r) / 2;
                if ( existingValue.get(mid).getKey() <= timestamp){
                    result = existingValue.get(mid).getValue();
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }

        }

        return result;
    }
}