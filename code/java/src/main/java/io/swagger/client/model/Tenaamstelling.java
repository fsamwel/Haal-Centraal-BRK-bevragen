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
import io.swagger.client.model.Aantekening;
import io.swagger.client.model.NatuurlijkPersoonBeperkt;
import io.swagger.client.model.NietNatuurlijkPersoonBeperkt;
import io.swagger.client.model.TypeBreuk;
import io.swagger.client.model.Waardelijst;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Een registratie van (een aandeel in) een zakelijk recht dat een persoon heeft, dat rust op een kadastraal onroerende zaak.  Waardelijst in deze component : [burgerlijkeStaatTenTijdeVanVerkrijging](http://www.kadaster.nl/schemas/waardelijsten/BurgerlijkeStaat/) en [verkregenNamensSamenwerkingsverband](http://www.kadaster.nl/schemas/waardelijsten/Samenwerkingsverband/)
 */
@Schema(description = "Een registratie van (een aandeel in) een zakelijk recht dat een persoon heeft, dat rust op een kadastraal onroerende zaak.  Waardelijst in deze component : [burgerlijkeStaatTenTijdeVanVerkrijging](http://www.kadaster.nl/schemas/waardelijsten/BurgerlijkeStaat/) en [verkregenNamensSamenwerkingsverband](http://www.kadaster.nl/schemas/waardelijsten/Samenwerkingsverband/)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:36:51.120+02:00[Europe/Amsterdam]")
public class Tenaamstelling {
  @SerializedName("aandeel")
  private TypeBreuk aandeel = null;

  @SerializedName("burgerlijkeStaatTenTijdeVanVerkrijging")
  private Waardelijst burgerlijkeStaatTenTijdeVanVerkrijging = null;

  @SerializedName("verkregenNamensSamenwerkingsverband")
  private Waardelijst verkregenNamensSamenwerkingsverband = null;

  @SerializedName("aantekeningen")
  private List<Aantekening> aantekeningen = null;

  @SerializedName("gezamenlijkAandeel")
  private TypeBreuk gezamenlijkAandeel = null;

  @SerializedName("betrokkenPartner")
  private NatuurlijkPersoonBeperkt betrokkenPartner = null;

  @SerializedName("betrokkenSamenwerkingsverband")
  private NietNatuurlijkPersoonBeperkt betrokkenSamenwerkingsverband = null;

  @SerializedName("betrokkenGorzenEnAanwassen")
  private NietNatuurlijkPersoonBeperkt betrokkenGorzenEnAanwassen = null;

  public Tenaamstelling aandeel(TypeBreuk aandeel) {
    this.aandeel = aandeel;
    return this;
  }

   /**
   * Get aandeel
   * @return aandeel
  **/
  @Schema(description = "")
  public TypeBreuk getAandeel() {
    return aandeel;
  }

  public void setAandeel(TypeBreuk aandeel) {
    this.aandeel = aandeel;
  }

  public Tenaamstelling burgerlijkeStaatTenTijdeVanVerkrijging(Waardelijst burgerlijkeStaatTenTijdeVanVerkrijging) {
    this.burgerlijkeStaatTenTijdeVanVerkrijging = burgerlijkeStaatTenTijdeVanVerkrijging;
    return this;
  }

   /**
   * Get burgerlijkeStaatTenTijdeVanVerkrijging
   * @return burgerlijkeStaatTenTijdeVanVerkrijging
  **/
  @Schema(description = "")
  public Waardelijst getBurgerlijkeStaatTenTijdeVanVerkrijging() {
    return burgerlijkeStaatTenTijdeVanVerkrijging;
  }

  public void setBurgerlijkeStaatTenTijdeVanVerkrijging(Waardelijst burgerlijkeStaatTenTijdeVanVerkrijging) {
    this.burgerlijkeStaatTenTijdeVanVerkrijging = burgerlijkeStaatTenTijdeVanVerkrijging;
  }

  public Tenaamstelling verkregenNamensSamenwerkingsverband(Waardelijst verkregenNamensSamenwerkingsverband) {
    this.verkregenNamensSamenwerkingsverband = verkregenNamensSamenwerkingsverband;
    return this;
  }

   /**
   * Get verkregenNamensSamenwerkingsverband
   * @return verkregenNamensSamenwerkingsverband
  **/
  @Schema(description = "")
  public Waardelijst getVerkregenNamensSamenwerkingsverband() {
    return verkregenNamensSamenwerkingsverband;
  }

  public void setVerkregenNamensSamenwerkingsverband(Waardelijst verkregenNamensSamenwerkingsverband) {
    this.verkregenNamensSamenwerkingsverband = verkregenNamensSamenwerkingsverband;
  }

  public Tenaamstelling aantekeningen(List<Aantekening> aantekeningen) {
    this.aantekeningen = aantekeningen;
    return this;
  }

  public Tenaamstelling addAantekeningenItem(Aantekening aantekeningenItem) {
    if (this.aantekeningen == null) {
      this.aantekeningen = new ArrayList<Aantekening>();
    }
    this.aantekeningen.add(aantekeningenItem);
    return this;
  }

   /**
   * Een aantekening is een verwijzing naar een ter inschrijving aangeboden stuk. Een aantekening op een tenaamstelling van een zakelijk recht is meestal een beperking. Bijvoorbeeld de verkrijging van een aandeel in een zakelijk recht onder opschortende voorwaarde, een beperking van de handelingsbevoegdheid van de zakelijk gerechtigde, of een koopovereenkomst
   * @return aantekeningen
  **/
  @Schema(description = "Een aantekening is een verwijzing naar een ter inschrijving aangeboden stuk. Een aantekening op een tenaamstelling van een zakelijk recht is meestal een beperking. Bijvoorbeeld de verkrijging van een aandeel in een zakelijk recht onder opschortende voorwaarde, een beperking van de handelingsbevoegdheid van de zakelijk gerechtigde, of een koopovereenkomst")
  public List<Aantekening> getAantekeningen() {
    return aantekeningen;
  }

  public void setAantekeningen(List<Aantekening> aantekeningen) {
    this.aantekeningen = aantekeningen;
  }

  public Tenaamstelling gezamenlijkAandeel(TypeBreuk gezamenlijkAandeel) {
    this.gezamenlijkAandeel = gezamenlijkAandeel;
    return this;
  }

   /**
   * Get gezamenlijkAandeel
   * @return gezamenlijkAandeel
  **/
  @Schema(description = "")
  public TypeBreuk getGezamenlijkAandeel() {
    return gezamenlijkAandeel;
  }

  public void setGezamenlijkAandeel(TypeBreuk gezamenlijkAandeel) {
    this.gezamenlijkAandeel = gezamenlijkAandeel;
  }

  public Tenaamstelling betrokkenPartner(NatuurlijkPersoonBeperkt betrokkenPartner) {
    this.betrokkenPartner = betrokkenPartner;
    return this;
  }

   /**
   * Get betrokkenPartner
   * @return betrokkenPartner
  **/
  @Schema(description = "")
  public NatuurlijkPersoonBeperkt getBetrokkenPartner() {
    return betrokkenPartner;
  }

  public void setBetrokkenPartner(NatuurlijkPersoonBeperkt betrokkenPartner) {
    this.betrokkenPartner = betrokkenPartner;
  }

  public Tenaamstelling betrokkenSamenwerkingsverband(NietNatuurlijkPersoonBeperkt betrokkenSamenwerkingsverband) {
    this.betrokkenSamenwerkingsverband = betrokkenSamenwerkingsverband;
    return this;
  }

   /**
   * Get betrokkenSamenwerkingsverband
   * @return betrokkenSamenwerkingsverband
  **/
  @Schema(description = "")
  public NietNatuurlijkPersoonBeperkt getBetrokkenSamenwerkingsverband() {
    return betrokkenSamenwerkingsverband;
  }

  public void setBetrokkenSamenwerkingsverband(NietNatuurlijkPersoonBeperkt betrokkenSamenwerkingsverband) {
    this.betrokkenSamenwerkingsverband = betrokkenSamenwerkingsverband;
  }

  public Tenaamstelling betrokkenGorzenEnAanwassen(NietNatuurlijkPersoonBeperkt betrokkenGorzenEnAanwassen) {
    this.betrokkenGorzenEnAanwassen = betrokkenGorzenEnAanwassen;
    return this;
  }

   /**
   * Get betrokkenGorzenEnAanwassen
   * @return betrokkenGorzenEnAanwassen
  **/
  @Schema(description = "")
  public NietNatuurlijkPersoonBeperkt getBetrokkenGorzenEnAanwassen() {
    return betrokkenGorzenEnAanwassen;
  }

  public void setBetrokkenGorzenEnAanwassen(NietNatuurlijkPersoonBeperkt betrokkenGorzenEnAanwassen) {
    this.betrokkenGorzenEnAanwassen = betrokkenGorzenEnAanwassen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenaamstelling tenaamstelling = (Tenaamstelling) o;
    return Objects.equals(this.aandeel, tenaamstelling.aandeel) &&
        Objects.equals(this.burgerlijkeStaatTenTijdeVanVerkrijging, tenaamstelling.burgerlijkeStaatTenTijdeVanVerkrijging) &&
        Objects.equals(this.verkregenNamensSamenwerkingsverband, tenaamstelling.verkregenNamensSamenwerkingsverband) &&
        Objects.equals(this.aantekeningen, tenaamstelling.aantekeningen) &&
        Objects.equals(this.gezamenlijkAandeel, tenaamstelling.gezamenlijkAandeel) &&
        Objects.equals(this.betrokkenPartner, tenaamstelling.betrokkenPartner) &&
        Objects.equals(this.betrokkenSamenwerkingsverband, tenaamstelling.betrokkenSamenwerkingsverband) &&
        Objects.equals(this.betrokkenGorzenEnAanwassen, tenaamstelling.betrokkenGorzenEnAanwassen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aandeel, burgerlijkeStaatTenTijdeVanVerkrijging, verkregenNamensSamenwerkingsverband, aantekeningen, gezamenlijkAandeel, betrokkenPartner, betrokkenSamenwerkingsverband, betrokkenGorzenEnAanwassen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenaamstelling {\n");
    
    sb.append("    aandeel: ").append(toIndentedString(aandeel)).append("\n");
    sb.append("    burgerlijkeStaatTenTijdeVanVerkrijging: ").append(toIndentedString(burgerlijkeStaatTenTijdeVanVerkrijging)).append("\n");
    sb.append("    verkregenNamensSamenwerkingsverband: ").append(toIndentedString(verkregenNamensSamenwerkingsverband)).append("\n");
    sb.append("    aantekeningen: ").append(toIndentedString(aantekeningen)).append("\n");
    sb.append("    gezamenlijkAandeel: ").append(toIndentedString(gezamenlijkAandeel)).append("\n");
    sb.append("    betrokkenPartner: ").append(toIndentedString(betrokkenPartner)).append("\n");
    sb.append("    betrokkenSamenwerkingsverband: ").append(toIndentedString(betrokkenSamenwerkingsverband)).append("\n");
    sb.append("    betrokkenGorzenEnAanwassen: ").append(toIndentedString(betrokkenGorzenEnAanwassen)).append("\n");
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
