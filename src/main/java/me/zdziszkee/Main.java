package me.zdziszkee;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import me.zdziszkee.tasks.ArraySort;
import me.zdziszkee.tasks.EfficientContains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 3, -4, 3, -11, 7};
        ArraySort.sort(array);
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println(EfficientContains.exists(3, array));
        parseJson("""
                {
                  "product": "Live JSON generator",
                  "version": 3.1,
                  "releaseDate": "2014-06-25T00:00:00.000Z",
                  "demo": true,
                  "person": {
                    "id": 12345,
                    "name": "John Doe",
                    "phones": {
                      "home": "800-123-4567",
                      "mobile": "877-123-1234"
                    },
                    "email": [
                      "jd@example.com",
                      "jd@example.org"
                    ],
                    "dateOfBirth": "1980-01-02T00:00:00.000Z",
                    "registered": true,
                    "emergencyContacts": [
                      {
                        "name": "Jane Doe",
                        "phone": "888-555-1212",
                        "relationship": "spouse"
                      },
                      {
                        "name": "Justin Doe",
                        "phone": "877-123-1212",
                        "relationship": "parent"
                      }
                    ]
                  }
                }
                """);

    }

    public static JsonElement parseJson(String json) {
        if (json.isEmpty()) {
            return JsonNull.INSTANCE;
        }
        final StringBuilder builder = new StringBuilder();
        boolean isInsideValue = false;
        for (int i = 0; i < json.length(); i++) {
            char character = json.charAt(i);
            switch (character) {
                case '{': {
                }
                case '}': {
                }
                case '[': {
                }
                case ']': {
                }
                case ':': {
                }
                case ',': {
                }
                case '"': {
                    isInsideValue = !isInsideValue;
                }

                default: {

                }
            }
        }


        return null;
    }


}