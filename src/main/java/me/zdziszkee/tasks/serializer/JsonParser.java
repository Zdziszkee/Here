package me.zdziszkee.tasks.serializer;

import me.zdziszkee.tasks.serializer.types.JsonElement;
import me.zdziszkee.tasks.serializer.types.JsonNull;

public class JsonParser {
    public static final String EXAMPLE_JSON = """
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
            """;

    JsonElement parseJson(String json) {
        //TODO parser implementation
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
