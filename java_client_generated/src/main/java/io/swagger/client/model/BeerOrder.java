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
import io.swagger.client.model.BeerOrderLine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * BeerOrder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T13:40:27.368714462Z[GMT]")
public class BeerOrder {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("customerId")
  private UUID customerId = null;

  @SerializedName("customerRef")
  private String customerRef = null;

  @SerializedName("beerOrderLines")
  private List<BeerOrderLine> beerOrderLines = null;

  @SerializedName("orderStatusCallBackUrl")
  private String orderStatusCallBackUrl = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public BeerOrder customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @Schema(required = true, description = "")
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public BeerOrder customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

   /**
   * Get customerRef
   * @return customerRef
  **/
  @Schema(description = "")
  public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public BeerOrder beerOrderLines(List<BeerOrderLine> beerOrderLines) {
    this.beerOrderLines = beerOrderLines;
    return this;
  }

  public BeerOrder addBeerOrderLinesItem(BeerOrderLine beerOrderLinesItem) {
    if (this.beerOrderLines == null) {
      this.beerOrderLines = new ArrayList<BeerOrderLine>();
    }
    this.beerOrderLines.add(beerOrderLinesItem);
    return this;
  }

   /**
   * Get beerOrderLines
   * @return beerOrderLines
  **/
  @Schema(description = "")
  public List<BeerOrderLine> getBeerOrderLines() {
    return beerOrderLines;
  }

  public void setBeerOrderLines(List<BeerOrderLine> beerOrderLines) {
    this.beerOrderLines = beerOrderLines;
  }

  public BeerOrder orderStatusCallBackUrl(String orderStatusCallBackUrl) {
    this.orderStatusCallBackUrl = orderStatusCallBackUrl;
    return this;
  }

   /**
   * Get orderStatusCallBackUrl
   * @return orderStatusCallBackUrl
  **/
  @Schema(description = "")
  public String getOrderStatusCallBackUrl() {
    return orderStatusCallBackUrl;
  }

  public void setOrderStatusCallBackUrl(String orderStatusCallBackUrl) {
    this.orderStatusCallBackUrl = orderStatusCallBackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeerOrder beerOrder = (BeerOrder) o;
    return Objects.equals(this.id, beerOrder.id) &&
        Objects.equals(this.customerId, beerOrder.customerId) &&
        Objects.equals(this.customerRef, beerOrder.customerRef) &&
        Objects.equals(this.beerOrderLines, beerOrder.beerOrderLines) &&
        Objects.equals(this.orderStatusCallBackUrl, beerOrder.orderStatusCallBackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, customerRef, beerOrderLines, orderStatusCallBackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeerOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    beerOrderLines: ").append(toIndentedString(beerOrderLines)).append("\n");
    sb.append("    orderStatusCallBackUrl: ").append(toIndentedString(orderStatusCallBackUrl)).append("\n");
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
