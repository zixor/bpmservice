package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.model.Location;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(path = "/locations", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity locations(@RequestParam(value = "lang", defaultValue = "en") String language) {
        return ResponseEntity.ok(createResponse(language));
    }

    private String createResponse(String filterIso) {
        JSONArray array = new JSONArray();
        List<Location> locations = getLocations(filterIso);
        JSONObject jsonObject1 = new JSONObject();
        locations.forEach(location -> {
            jsonObject1.put("language_id", location.getLanguage_id());
            jsonObject1.put("name", location.getName());
            jsonObject1.put("iso_639_1", location.getIso_639_1());
            jsonObject1.put("locale_language", location.getLocale_language());
            array.put(jsonObject1);
        });
        return array.toString();
    }

    public List<Location> getLocations(String filterIso) {
        List<Location> lst = new ArrayList<>();
        lst.add(new Location(1, "Afrikaans", "af", "af"));
        lst.add(new Location(2, "Arabic", "ar", "ar"));
        lst.add(new Location(3, "Armenian", "hy", "hy"));
        lst.add(new Location(5, "Bengali", "bn", "bn"));
        lst.add(new Location(6, "Bulgarian", "bg", "bg"));
        lst.add(new Location(7, "Burmese", "my", "my"));
        lst.add(new Location(8, "Chinese-Cantonese", "zh", "zh-hk"));
        lst.add(new Location(9, "Catalan", "ca", "ca"));
        lst.add(new Location(10, "Croatian", "hr", "hr"));
        lst.add(new Location(11, "Czech", "cs", "cs"));
        lst.add(new Location(12, "Danish", "da", "da"));
        lst.add(new Location(13, "Dari", "dr", "dr"));
        lst.add(new Location(14, "Dutch", "nl", "nl"));
        lst.add(new Location(15, "English", "en", "en"));
        lst.add(new Location(16, "Farsi", "fa", "fa"));
        lst.add(new Location(17, "Finnish", "fi", "fi"));
        lst.add(new Location(18, "Flemish", "fl", "fl"));
        lst.add(new Location(19, "French-Parisian", "fr", "fr-fr"));
        lst.add(new Location(20, "German", "de", "de"));
        lst.add(new Location(21, "Greek", "el", "el"));
        lst.add(new Location(22, "Hebrew", "he", "he"));
        lst.add(new Location(23, "Hindi", "hi", "hi"));
        lst.add(new Location(24, "Hungarian", "hu", "hu"));
        lst.add(new Location(26, "Italian", "it", "it"));
        lst.add(new Location(27, "Japanese", "ja", "ja"));
        lst.add(new Location(29, "Korean", "ko", "ko"));
        lst.add(new Location(30, "Malay", "ms", "ms"));

        if (!StringUtils.isEmpty(filterIso)) {
            lst = lst.stream()
                    .filter(location -> location.getIso_639_1().equals(filterIso))
                    .collect(Collectors.toList());
        }
        return lst;
    }
}
