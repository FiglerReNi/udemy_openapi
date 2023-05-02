package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-02T13:50:05.924358236Z[GMT]")


public class Address   {
  @JsonProperty("line")
  private String line = null;

  @JsonProperty("city")
  private String city = null;

  /**
   * 2 Letter State Code
   */
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateCodeEnum fromValue(String text) {
      for (StateCodeEnum b : StateCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("stateCode")
  private StateCodeEnum stateCode = null;

  @JsonProperty("zipCode")
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
  
  @Size(min=2,max=2)   public StateCodeEnum getStateCode() {
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
