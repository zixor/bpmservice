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

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity helloWorldGet(@RequestParam(value = "lang", defaultValue = "en") String language) {
        return ResponseEntity.ok(createResponse(language));
    }

    @RequestMapping(path = "locations", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity locations(@RequestParam(value = "lang", defaultValue = "en") String language) {
        return ResponseEntity.ok(createResponse(language));
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String filterIso) {

        JSONObject jsonObject = new JSONObject();
        if (StringUtils.isEmpty(filterIso) || filterIso.equalsIgnoreCase("en")) {
            jsonObject.put("language_id", 15);
            jsonObject.put("name", "English");
            jsonObject.put("iso_639_1", "en");
            jsonObject.put("locale_language", "en");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("af")) {
            jsonObject.put("language_id", 1);
            jsonObject.put("name", "Afrikaans");
            jsonObject.put("iso_639_1", "af");
            jsonObject.put("locale_language", "af");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("ar")) {
            jsonObject.put("language_id", 2);
            jsonObject.put("name", "Arabic");
            jsonObject.put("iso_639_1", "ar");
            jsonObject.put("locale_language", "ar");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("hy")) {
            jsonObject.put("language_id", 3);
            jsonObject.put("name", "Armenian");
            jsonObject.put("iso_639_1", "hy");
            jsonObject.put("locale_language", "hy");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("bn")) {
            jsonObject.put("language_id", 5);
            jsonObject.put("name", "Bengali");
            jsonObject.put("iso_639_1", "bn");
            jsonObject.put("locale_language", "bn");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("bg")) {
            jsonObject.put("language_id", 6);
            jsonObject.put("name", "Bulgarian");
            jsonObject.put("iso_639_1", "bg");
            jsonObject.put("locale_language", "bg");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("my")) {
            jsonObject.put("language_id", 7);
            jsonObject.put("name", "Burmese");
            jsonObject.put("iso_639_1", "my");
            jsonObject.put("locale_language", "my");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("zh-hk")) {
            jsonObject.put("language_id", 8);
            jsonObject.put("name", "Chinese-Cantonese");
            jsonObject.put("iso_639_1", "zh");
            jsonObject.put("locale_language", "zh-hk");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("ca")) {
            jsonObject.put("language_id", 9);
            jsonObject.put("name", "Catalan");
            jsonObject.put("iso_639_1", "ca");
            jsonObject.put("locale_language", "ca");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("hr")) {
            jsonObject.put("language_id", 10);
            jsonObject.put("name", "Croatian");
            jsonObject.put("iso_639_1", "hr");
            jsonObject.put("locale_language", "hr");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("cs")) {
            jsonObject.put("language_id", 11);
            jsonObject.put("name", "Czech");
            jsonObject.put("iso_639_1", "cs");
            jsonObject.put("locale_language", "cs");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("da")) {
            jsonObject.put("language_id", 12);
            jsonObject.put("name", "Danish");
            jsonObject.put("iso_639_1", "da");
            jsonObject.put("locale_language", "da");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("dr")) {
            jsonObject.put("language_id", 13);
            jsonObject.put("name", "Dari");
            jsonObject.put("iso_639_1", "dr");
            jsonObject.put("locale_language", "dr");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("nl")) {
            jsonObject.put("language_id", 14);
            jsonObject.put("name", "Dutch");
            jsonObject.put("iso_639_1", "nl");
            jsonObject.put("locale_language", "nl");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("it")) {
            jsonObject.put("language_id", 26);
            jsonObject.put("name", "Italian");
            jsonObject.put("iso_639_1", "it");
            jsonObject.put("locale_language", "it");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("fr")) {
            jsonObject.put("language_id", 19);
            jsonObject.put("name", "French-Parisian");
            jsonObject.put("iso_639_1", "fr");
            jsonObject.put("locale_language", "fr");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("de")) {
            jsonObject.put("language_id", 20);
            jsonObject.put("name", "German");
            jsonObject.put("iso_639_1", "de");
            jsonObject.put("locale_language", "de");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("hi")) {
            jsonObject.put("language_id", 23);
            jsonObject.put("name", "Hindi");
            jsonObject.put("iso_639_1", "hi");
            jsonObject.put("locale_language", "hi");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("ja")) {
            jsonObject.put("language_id", 23);
            jsonObject.put("name", "Japanese");
            jsonObject.put("iso_639_1", "ja");
            jsonObject.put("locale_language", "ja");
        }

        if (!StringUtils.isEmpty(filterIso) && filterIso.equalsIgnoreCase("ko")) {
            jsonObject.put("language_id", 23);
            jsonObject.put("name", "Korean");
            jsonObject.put("iso_639_1", "ko");
            jsonObject.put("locale_language", "ko");
        }
        
        return jsonObject.toString();
    }

}
