/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Query;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DataQuery
 */
@JsonPropertyOrder({
  DataQuery.JSON_PROPERTY_SUFFIX,
  DataQuery.JSON_PROPERTY_TEXT,
  DataQuery.JSON_PROPERTY_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class DataQuery extends Query {
  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  @jakarta.annotation.Nullable
  private String suffix;

  public static final String JSON_PROPERTY_TEXT = "text";
  @jakarta.annotation.Nullable
  private String text;

  public static final String JSON_PROPERTY_DATE = "date";
  @jakarta.annotation.Nullable
  private Instant date;

  public DataQuery() {

  }

  public DataQuery suffix(@jakarta.annotation.Nullable String suffix) {
    
    this.suffix = suffix;
    return this;
  }

  /**
   * test suffix
   * @return suffix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuffix() {
    return suffix;
  }


  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuffix(@jakarta.annotation.Nullable String suffix) {
    this.suffix = suffix;
  }

  public DataQuery text(@jakarta.annotation.Nullable String text) {
    
    this.text = text;
    return this;
  }

  /**
   * Some text containing white spaces
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@jakarta.annotation.Nullable String text) {
    this.text = text;
  }

  public DataQuery date(@jakarta.annotation.Nullable Instant date) {
    
    this.date = date;
    return this;
  }

  /**
   * A date
   * @return date
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Instant getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@jakarta.annotation.Nullable Instant date) {
    this.date = date;
  }


  @Override
  public DataQuery id(@jakarta.annotation.Nullable Long id) {
    this.setId(id);
    return this;
  }

  @Override
  public DataQuery outcomes(@jakarta.annotation.Nullable List<OutcomesEnum> outcomes) {
    this.setOutcomes(outcomes);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataQuery dataQuery = (DataQuery) o;
    return Objects.equals(this.suffix, dataQuery.suffix) &&
        Objects.equals(this.text, dataQuery.text) &&
        Objects.equals(this.date, dataQuery.date) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, text, date, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataQuery {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

}

