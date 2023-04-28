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
import io.swagger.client.model.CustomerList;
import io.swagger.client.model.PagedResponse;
import io.swagger.client.model.PagedResponsePageable;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CustomerPagedList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T13:40:27.368714462Z[GMT]")
public class CustomerPagedList extends PagedResponse {
  @SerializedName("content")
  private CustomerList content = null;

  public CustomerPagedList content(CustomerList content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public CustomerList getContent() {
    return content;
  }

  public void setContent(CustomerList content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPagedList customerPagedList = (CustomerPagedList) o;
    return Objects.equals(this.content, customerPagedList.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPagedList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
