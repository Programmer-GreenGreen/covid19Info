package com.covid19.springboot.covid19Info.Controller;


import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class APIController {

    @GetMapping("/jsonapi")
    public String callApiWithJson() {
        StringBuffer result = new StringBuffer();
        String jsonPrintString = null;
        try {
            String apiUrl = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson" +
                    "?serviceKey=4vrGSjzcpuTvsEVRnS4pd%2F3XS6bkayc9r%2B%2FUq640pb5YEwJnswnd%2Fwb%2FpSFSQjDir0s51eNaeRu7ost%2F2gP%2FNA%3D%3D" +
                    "&pageNo=5&numOfRows=20" +
                    "&startCreateDt=20220119" +
                    "&endCreateDt=20220128";
            URL url = new URL(apiUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));
            String returnLine;
            while((returnLine = bufferedReader.readLine()) != null) {
                result.append(returnLine);
            }

            JSONObject jsonObject = XML.toJSONObject(result.toString());
            jsonPrintString = jsonObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonPrintString;
    }
}
