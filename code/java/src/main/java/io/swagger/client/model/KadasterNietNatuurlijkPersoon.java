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
import io.swagger.client.model.Adres;
import io.swagger.client.model.KadasterPersoon;
import io.swagger.client.model.Postadres;
import io.swagger.client.model.Waardelijst;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * KadasterNietNatuurlijkPersoon
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:36:51.120+02:00[Europe/Amsterdam]")
public class KadasterNietNatuurlijkPersoon extends KadasterPersoon {
  @SerializedName("statutaireNaam")
  private String statutaireNaam = null;

  @SerializedName("statutaireZetel")
  private String statutaireZetel = null;

  @SerializedName("rechtsvorm")
  private Waardelijst rechtsvorm = null;

  @SerializedName("kvkNummer")
  private String kvkNummer = null;

  @SerializedName("rsin")
  private String rsin = null;

  public KadasterNietNatuurlijkPersoon statutaireNaam(String statutaireNaam) {
    this.statutaireNaam = statutaireNaam;
    return this;
  }

   /**
   * Get statutaireNaam
   * @return statutaireNaam
  **/
  @Schema(description = "")
  public String getStatutaireNaam() {
    return statutaireNaam;
  }

  public void setStatutaireNaam(String statutaireNaam) {
    this.statutaireNaam = statutaireNaam;
  }

  public KadasterNietNatuurlijkPersoon statutaireZetel(String statutaireZetel) {
    this.statutaireZetel = statutaireZetel;
    return this;
  }

   /**
   * Get statutaireZetel
   * @return statutaireZetel
  **/
  @Schema(description = "")
  public String getStatutaireZetel() {
    return statutaireZetel;
  }

  public void setStatutaireZetel(String statutaireZetel) {
    this.statutaireZetel = statutaireZetel;
  }

  public KadasterNietNatuurlijkPersoon rechtsvorm(Waardelijst rechtsvorm) {
    this.rechtsvorm = rechtsvorm;
    return this;
  }

   /**
   * Get rechtsvorm
   * @return rechtsvorm
  **/
  @Schema(description = "")
  public Waardelijst getRechtsvorm() {
    return rechtsvorm;
  }

  public void setRechtsvorm(Waardelijst rechtsvorm) {
    this.rechtsvorm = rechtsvorm;
  }

  public KadasterNietNatuurlijkPersoon kvkNummer(String kvkNummer) {
    this.kvkNummer = kvkNummer;
    return this;
  }

   /**
   * Get kvkNummer
   * @return kvkNummer
  **/
  @Schema(description = "")
  public String getKvkNummer() {
    return kvkNummer;
  }

  public void setKvkNummer(String kvkNummer) {
    this.kvkNummer = kvkNummer;
  }

  public KadasterNietNatuurlijkPersoon rsin(String rsin) {
    this.rsin = rsin;
    return this;
  }

   /**
   * Get rsin
   * @return rsin
  **/
  @Schema(description = "")
  public String getRsin() {
    return rsin;
  }

  public void setRsin(String rsin) {
    this.rsin = rsin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KadasterNietNatuurlijkPersoon kadasterNietNatuurlijkPersoon = (KadasterNietNatuurlijkPersoon) o;
    return Objects.equals(this.statutaireNaam, kadasterNietNatuurlijkPersoon.statutaireNaam) &&
        Objects.equals(this.statutaireZetel, kadasterNietNatuurlijkPersoon.statutaireZetel) &&
        Objects.equals(this.rechtsvorm, kadasterNietNatuurlijkPersoon.rechtsvorm) &&
        Objects.equals(this.kvkNummer, kadasterNietNatuurlijkPersoon.kvkNummer) &&
        Objects.equals(this.rsin, kadasterNietNatuurlijkPersoon.rsin) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutaireNaam, statutaireZetel, rechtsvorm, kvkNummer, rsin, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KadasterNietNatuurlijkPersoon {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    statutaireNaam: ").append(toIndentedString(statutaireNaam)).append("\n");
    sb.append("    statutaireZetel: ").append(toIndentedString(statutaireZetel)).append("\n");
    sb.append("    rechtsvorm: ").append(toIndentedString(rechtsvorm)).append("\n");
    sb.append("    kvkNummer: ").append(toIndentedString(kvkNummer)).append("\n");
    sb.append("    rsin: ").append(toIndentedString(rsin)).append("\n");
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
