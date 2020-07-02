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
import io.swagger.client.model.HalLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * KadastraalOnroerendeZaakLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:36:51.120+02:00[Europe/Amsterdam]")
public class KadastraalOnroerendeZaakLinks {
  @SerializedName("self")
  private HalLink self = null;

  @SerializedName("zakelijkGerechtigden")
  private List<HalLink> zakelijkGerechtigden = null;

  public KadastraalOnroerendeZaakLinks self(HalLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }

  public KadastraalOnroerendeZaakLinks zakelijkGerechtigden(List<HalLink> zakelijkGerechtigden) {
    this.zakelijkGerechtigden = zakelijkGerechtigden;
    return this;
  }

  public KadastraalOnroerendeZaakLinks addZakelijkGerechtigdenItem(HalLink zakelijkGerechtigdenItem) {
    if (this.zakelijkGerechtigden == null) {
      this.zakelijkGerechtigden = new ArrayList<HalLink>();
    }
    this.zakelijkGerechtigden.add(zakelijkGerechtigdenItem);
    return this;
  }

   /**
   * Get zakelijkGerechtigden
   * @return zakelijkGerechtigden
  **/
  @Schema(description = "")
  public List<HalLink> getZakelijkGerechtigden() {
    return zakelijkGerechtigden;
  }

  public void setZakelijkGerechtigden(List<HalLink> zakelijkGerechtigden) {
    this.zakelijkGerechtigden = zakelijkGerechtigden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KadastraalOnroerendeZaakLinks kadastraalOnroerendeZaakLinks = (KadastraalOnroerendeZaakLinks) o;
    return Objects.equals(this.self, kadastraalOnroerendeZaakLinks.self) &&
        Objects.equals(this.zakelijkGerechtigden, kadastraalOnroerendeZaakLinks.zakelijkGerechtigden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, zakelijkGerechtigden);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KadastraalOnroerendeZaakLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    zakelijkGerechtigden: ").append(toIndentedString(zakelijkGerechtigden)).append("\n");
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
