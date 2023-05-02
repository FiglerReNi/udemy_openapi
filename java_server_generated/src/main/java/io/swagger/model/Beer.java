package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Brewery;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beer Object
 */
@Schema(description = "Beer Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-02T13:50:05.924358236Z[GMT]")


public class Beer   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets style
   */
  public enum StyleEnum {
    ALE("ALE"),
    
    PALE_ALE("PALE_ALE"),
    
    IPA("IPA"),
    
    WHEAT("WHEAT"),
    
    LAGER("LAGER");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("style")
  private StyleEnum style = null;

  @JsonProperty("upc")
  private String upc = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("brewery")
  private Brewery brewery = null;

  public Beer id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Beer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Beer style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   **/
  @Schema(description = "")
  
    public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Beer upc(String upc) {
    this.upc = upc;
    return this;
  }

  /**
   * Get upc
   * @return upc
   **/
  @Schema(description = "")
  
    public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public Beer price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Beer quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   **/
  @Schema(description = "")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Beer brewery(Brewery brewery) {
    this.brewery = brewery;
    return this;
  }

  /**
   * Get brewery
   * @return brewery
   **/
  @Schema(description = "")
  
    @Valid
    public Brewery getBrewery() {
    return brewery;
  }

  public void setBrewery(Brewery brewery) {
    this.brewery = brewery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beer beer = (Beer) o;
    return Objects.equals(this.id, beer.id) &&
        Objects.equals(this.name, beer.name) &&
        Objects.equals(this.style, beer.style) &&
        Objects.equals(this.upc, beer.upc) &&
        Objects.equals(this.price, beer.price) &&
        Objects.equals(this.quantity, beer.quantity) &&
        Objects.equals(this.brewery, beer.brewery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, style, upc, price, quantity, brewery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    brewery: ").append(toIndentedString(brewery)).append("\n");
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
