/*
 * agent/service.proto
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: version not set
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Agent.JSON;

/**
 * ListRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:39:15.166128119Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ListRequestFilters {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private List<String> email = new ArrayList<>();

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private List<String> lastname = new ArrayList<>();

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private List<String> code = new ArrayList<>();

  public ListRequestFilters() {
  }

  public ListRequestFilters email(List<String> email) {
    this.email = email;
    return this;
  }

  public ListRequestFilters addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }


  public ListRequestFilters lastname(List<String> lastname) {
    this.lastname = lastname;
    return this;
  }

  public ListRequestFilters addLastnameItem(String lastnameItem) {
    if (this.lastname == null) {
      this.lastname = new ArrayList<>();
    }
    this.lastname.add(lastnameItem);
    return this;
  }

  /**
   * Get lastname
   * @return lastname
   */
  @javax.annotation.Nullable
  public List<String> getLastname() {
    return lastname;
  }

  public void setLastname(List<String> lastname) {
    this.lastname = lastname;
  }


  public ListRequestFilters code(List<String> code) {
    this.code = code;
    return this;
  }

  public ListRequestFilters addCodeItem(String codeItem) {
    if (this.code == null) {
      this.code = new ArrayList<>();
    }
    this.code.add(codeItem);
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public List<String> getCode() {
    return code;
  }

  public void setCode(List<String> code) {
    this.code = code;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ListRequestFilters instance itself
   */
  public ListRequestFilters putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRequestFilters listRequestFilters = (ListRequestFilters) o;
    return Objects.equals(this.email, listRequestFilters.email) &&
        Objects.equals(this.lastname, listRequestFilters.lastname) &&
        Objects.equals(this.code, listRequestFilters.code)&&
        Objects.equals(this.additionalProperties, listRequestFilters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, lastname, code, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRequestFilters {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("email");
    openapiFields.add("lastname");
    openapiFields.add("code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListRequestFilters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRequestFilters is not found in the empty JSON string", ListRequestFilters.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull() && !jsonObj.get("email").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be an array in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull() && !jsonObj.get("lastname").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be an array in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull() && !jsonObj.get("code").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be an array in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRequestFilters>() {
           @Override
           public void write(JsonWriter out, ListRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ListRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ListRequestFilters instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListRequestFilters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListRequestFilters
   * @throws IOException if the JSON string is invalid with respect to ListRequestFilters
   */
  public static ListRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRequestFilters.class);
  }

  /**
   * Convert an instance of ListRequestFilters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

