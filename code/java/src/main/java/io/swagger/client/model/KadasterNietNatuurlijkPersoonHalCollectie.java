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
import io.swagger.client.model.HalCollectionLinks;
import io.swagger.client.model.KadasterNietNatuurlijkPersoonHalCollectieEmbedded;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * KadasterNietNatuurlijkPersoonHalCollectie
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:36:51.120+02:00[Europe/Amsterdam]")
public class KadasterNietNatuurlijkPersoonHalCollectie {
  @SerializedName("_links")
  private HalCollectionLinks _links = null;

  @SerializedName("_embedded")
  private KadasterNietNatuurlijkPersoonHalCollectieEmbedded _embedded = null;

  public KadasterNietNatuurlijkPersoonHalCollectie _links(HalCollectionLinks _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public HalCollectionLinks getLinks() {
    return _links;
  }

  public void setLinks(HalCollectionLinks _links) {
    this._links = _links;
  }

  public KadasterNietNatuurlijkPersoonHalCollectie _embedded(KadasterNietNatuurlijkPersoonHalCollectieEmbedded _embedded) {
    this._embedded = _embedded;
    return this;
  }

   /**
   * Get _embedded
   * @return _embedded
  **/
  @Schema(description = "")
  public KadasterNietNatuurlijkPersoonHalCollectieEmbedded getEmbedded() {
    return _embedded;
  }

  public void setEmbedded(KadasterNietNatuurlijkPersoonHalCollectieEmbedded _embedded) {
    this._embedded = _embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KadasterNietNatuurlijkPersoonHalCollectie kadasterNietNatuurlijkPersoonHalCollectie = (KadasterNietNatuurlijkPersoonHalCollectie) o;
    return Objects.equals(this._links, kadasterNietNatuurlijkPersoonHalCollectie._links) &&
        Objects.equals(this._embedded, kadasterNietNatuurlijkPersoonHalCollectie._embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, _embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KadasterNietNatuurlijkPersoonHalCollectie {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
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
