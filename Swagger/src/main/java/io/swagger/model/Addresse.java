package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Addresse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-23T20:23:17.581651531Z[GMT]")


public class Addresse   {
  @JsonProperty("Straße")
  private String strae = null;

  @JsonProperty("Stadt")
  private String stadt = null;

  @JsonProperty("Bundesland")
  private String bundesland = null;

  @JsonProperty("Postleitzahl")
  private String postleitzahl = null;

  public Addresse strae(String strae) {
    this.strae = strae;
    return this;
  }

  /**
   * Get strae
   * @return strae
   **/
  @Schema(example = "Erzbergerstraße 121", description = "")
  
    public String getStrae() {
    return strae;
  }

  public void setStrae(String strae) {
    this.strae = strae;
  }

  public Addresse stadt(String stadt) {
    this.stadt = stadt;
    return this;
  }

  /**
   * Get stadt
   * @return stadt
   **/
  @Schema(example = "Karlsruhe", description = "")
  
    public String getStadt() {
    return stadt;
  }

  public void setStadt(String stadt) {
    this.stadt = stadt;
  }

  public Addresse bundesland(String bundesland) {
    this.bundesland = bundesland;
    return this;
  }

  /**
   * Get bundesland
   * @return bundesland
   **/
  @Schema(example = "Baden-Württemberg", description = "")
  
    public String getBundesland() {
    return bundesland;
  }

  public void setBundesland(String bundesland) {
    this.bundesland = bundesland;
  }

  public Addresse postleitzahl(String postleitzahl) {
    this.postleitzahl = postleitzahl;
    return this;
  }

  /**
   * Get postleitzahl
   * @return postleitzahl
   **/
  @Schema(example = "76133", description = "")
  
    public String getPostleitzahl() {
    return postleitzahl;
  }

  public void setPostleitzahl(String postleitzahl) {
    this.postleitzahl = postleitzahl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addresse addresse = (Addresse) o;
    return Objects.equals(this.strae, addresse.strae) &&
        Objects.equals(this.stadt, addresse.stadt) &&
        Objects.equals(this.bundesland, addresse.bundesland) &&
        Objects.equals(this.postleitzahl, addresse.postleitzahl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strae, stadt, bundesland, postleitzahl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addresse {\n");
    
    sb.append("    strae: ").append(toIndentedString(strae)).append("\n");
    sb.append("    stadt: ").append(toIndentedString(stadt)).append("\n");
    sb.append("    bundesland: ").append(toIndentedString(bundesland)).append("\n");
    sb.append("    postleitzahl: ").append(toIndentedString(postleitzahl)).append("\n");
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
