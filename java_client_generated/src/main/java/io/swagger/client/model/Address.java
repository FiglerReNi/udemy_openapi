/*
 * OpenApi Course
 * Specification for OpenApi Course
 *
 * OpenAPI spec version: 1.0
 * Contact: example@example.hu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Address
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T13:40:27.368714462Z[GMT]")
public class Address {
  @SerializedName("line")
  private String line = null;

  @SerializedName("city")
  private String city = null;

  /**
   * 2 Letter State Code
   */
  @JsonAdapter(StateCodeEnum.Adapter.class)
  public enum StateCodeEnum {
    AL("AL"),
    AK("AK"),
    AZ("AZ"),
    AR("AR"),
    CA("CA");

    private String value;

    StateCodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateCodeEnum fromValue(String input) {
      for (StateCodeEnum b : StateCodeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateCodeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StateCodeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StateCodeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("stateCode")
  private StateCodeEnum stateCode = null;

  @SerializedName("zipCode")
  private Integer zipCode = null;

  public Address line(String line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @Schema(example = "Kinizsi ut 2/B", description = "")
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(example = "Budaörs", description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address stateCode(StateCodeEnum stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * 2 Letter State Code
   * @return stateCode
  **/
  @Schema(description = "2 Letter State Code")
  public StateCodeEnum getStateCode() {
    return stateCode;
  }

  public void setStateCode(StateCodeEnum stateCode) {
    this.stateCode = stateCode;
  }

  public Address zipCode(Integer zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @Schema(example = "2040", description = "")
  public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.line, address.line) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateCode, address.stateCode) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, city, stateCode, zipCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
