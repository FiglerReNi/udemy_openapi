package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BeerOrderStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-02T13:50:05.924358236Z[GMT]")


public class BeerOrderStatus   {
  @JsonProperty("orderId")
  private UUID orderId = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  public BeerOrderStatus orderId(UUID orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   **/
  @Schema(description = "")
  
    @Valid
    public UUID getOrderId() {
    return orderId;
  }

  public void setOrderId(UUID orderId) {
    this.orderId = orderId;
  }

  public BeerOrderStatus orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
   **/
  @Schema(description = "")
  
    public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeerOrderStatus beerOrderStatus = (BeerOrderStatus) o;
    return Objects.equals(this.orderId, beerOrderStatus.orderId) &&
        Objects.equals(this.orderStatus, beerOrderStatus.orderStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeerOrderStatus {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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
