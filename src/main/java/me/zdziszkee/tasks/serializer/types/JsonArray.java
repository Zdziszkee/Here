package me.zdziszkee.tasks.serializer.types;


import java.util.ArrayList;
import java.util.Iterator;

public class JsonArray extends JsonElement {
    private final ArrayList<JsonElement> elements;


    public JsonArray() {
        elements = new ArrayList<>();
    }


    public JsonArray(int capacity) {
        elements = new ArrayList<>(capacity);
    }


    public void add(Boolean bool) {
        elements.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }


    public void add(Character character) {
        elements.add(character == null ? JsonNull.INSTANCE : new JsonPrimitive(character));
    }


    public void add(Number number) {
        elements.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }


    public void add(String string) {
        elements.add(string == null ? JsonNull.INSTANCE : new JsonPrimitive(string));
    }


    public void add(JsonElement element) {
        if (element == null) {
            element = JsonNull.INSTANCE;
        }
        elements.add(element);
    }


    public void addAll(JsonArray array) {
        elements.addAll(array.elements);
    }

    public JsonElement set(int index, JsonElement element) {
        return elements.set(index, element == null ? JsonNull.INSTANCE : element);
    }

    public boolean remove(JsonElement element) {
        return elements.remove(element);
    }


    public JsonElement remove(int index) {
        return elements.remove(index);
    }


    public boolean contains(JsonElement element) {
        return elements.contains(element);
    }


    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }


    public Iterator<JsonElement> iterator() {
        return elements.iterator();
    }


    public JsonElement get(int i) {
        return elements.get(i);
    }


    @Override
    public boolean equals(Object o) {
        return (o == this) || (o instanceof JsonArray && ((JsonArray) o).elements.equals(elements));
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }


}
