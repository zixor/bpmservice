package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.model.Location;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    private static final String MESSAGE_FORMAT = "Hello %s!";

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity helloWorldGet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    @RequestMapping(path = "locations", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity locations(@RequestParam(value = "lang", defaultValue = "en") String language) {
        return ResponseEntity.ok(getLocations(language));
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String name) {
        return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
    }

    private String getLocations(String language) {
        JSONArray array = new JSONArray();
        array.put(new Location(1, "Afrikaans", "af", "af"));
        array.put(new Location(2, "Arabic", "ar", "ar"));
        array.put(new Location(3, "Armenian", "hy", "hy"));
        array.put(new Location(5, "Bengali", "bn", "bn"));
        array.put(new Location(6, "Bulgarian", "bg", "bg"));
        array.put(new Location(7, "Burmese", "my", "my"));
        array.put(new Location(8, "Chinese-Cantonese", "zh", "zh-hk"));
        array.put(new Location(9, "Catalan", "ca", "ca"));
        array.put(new Location(10, "Croatian", "hr", "hr"));
        array.put(new Location(11, "Czech", "cs", "cs"));
        array.put(new Location(12, "Danish", "da", "da"));
        array.put(new Location(13, "Dari", "dr", "dr"));
        array.put(new Location(14, "Dutch", "nl", "nl"));
        array.put(new Location(15, "English", "en", "en"));
        array.put(new Location(16, "Farsi", "fa", "fa"));
        array.put(new Location(17, "Finnish", "fi", "fi"));
        array.put(new Location(18, "Flemish", "fl", "fl"));
        array.put(new Location(19, "French-Parisian", "fr", "fr-fr"));
        array.put(new Location(20, "German", "de", "de"));
        array.put(new Location(21, "Greek", "el", "el"));
        array.put(new Location(22, "Hebrew", "he", "he"));
        array.put(new Location(23, "Hindi", "hi", "hi"));
        array.put(new Location(24, "Hungarian", "hu", "hu"));
        array.put(new Location(26, "Italian", "it", "it"));
        array.put(new Location(27, "Japanese", "ja", "ja"));
        array.put(new Location(29, "Korean", "ko", "ko"));
        array.put(new Location(30, "Malay", "ms", "ms"));
        return array.toString();
    }
}
