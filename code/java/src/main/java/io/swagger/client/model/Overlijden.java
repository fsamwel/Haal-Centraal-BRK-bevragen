/*
 * Kadastraal onroerende zaken
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.
 *
 * OpenAPI spec version: 1.0.0
 * 
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
import io.swagger.client.model.DatumOnvolledig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Overlijden is een groep gegevens over het overlijden van een persoon.
 */
@Schema(description = "Overlijden is een groep gegevens over het overlijden van een persoon.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:36:51.120+02:00[Europe/Amsterdam]")
public class Overlijden {
  @SerializedName("datum")
  private DatumOnvolledig datum = null;

  public Overlijden datum(DatumOnvolledig datum) {
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @Schema(description = "")
  public DatumOnvolledig getDatum() {
    return datum;
  }

  public void setDatum(DatumOnvolledig datum) {
    this.datum = datum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overlijden overlijden = (Overlijden) o;
    return Objects.equals(this.datum, overlijden.datum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overlijden {\n");
    
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
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
