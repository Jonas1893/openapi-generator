/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
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
import java.time.OffsetDateTime;
import java.util.Arrays;

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

import org.openapitools.client.JSON;

/**
 * Order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class Order {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Long id;

  public static final String SERIALIZED_NAME_PET_ID = "petId";
  @SerializedName(SERIALIZED_NAME_PET_ID)
  @javax.annotation.Nullable
  private Long petId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @javax.annotation.Nullable
  private Integer quantity;

  public static final String SERIALIZED_NAME_SHIP_DATE = "shipDate";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime shipDate;

  /**
   * Order Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_COMPLETE = "complete";
  @SerializedName(SERIALIZED_NAME_COMPLETE)
  @javax.annotation.Nullable
  private Boolean complete = false;

  public Order() {
  }

  public Order id(@javax.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }


  public Order petId(@javax.annotation.Nullable Long petId) {
    this.petId = petId;
    return this;
  }

  /**
   * Get petId
   * @return petId
   */
  @javax.annotation.Nullable
  public Long getPetId() {
    return petId;
  }

  public void setPetId(@javax.annotation.Nullable Long petId) {
    this.petId = petId;
  }


  public Order quantity(@javax.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@javax.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
  }


  public Order shipDate(@javax.annotation.Nullable OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Get shipDate
   * @return shipDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(@javax.annotation.Nullable OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }


  public Order status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public Order complete(@javax.annotation.Nullable Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
   */
  @javax.annotation.Nullable
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(@javax.annotation.Nullable Boolean complete) {
    this.complete = complete;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId, quantity, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id", "petId", "quantity", "shipDate", "status", "complete"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Order
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Order.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Order is not found in the empty JSON string", Order.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Order.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Order` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Order.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Order' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Order> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Order.class));

       return (TypeAdapter<T>) new TypeAdapter<Order>() {
           @Override
           public void write(JsonWriter out, Order value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Order read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Order given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Order
   * @throws IOException if the JSON string is invalid with respect to Order
   */
  public static Order fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Order.class);
  }

  /**
   * Convert an instance of Order to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

