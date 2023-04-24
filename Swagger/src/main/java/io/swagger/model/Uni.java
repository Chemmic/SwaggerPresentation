package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Addresse;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Uni
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-23T20:23:17.581651531Z[GMT]")


public class Uni   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("Addresse")
  private Addresse addresse = null;

  public Uni id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Uni name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "DHBW Karlsruhe", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Uni addresse(Addresse addresse) {
    this.addresse = addresse;
    return this;
  }

  /**
   * Get addresse
   * @return addresse
   **/
  @Schema(description = "")
  
    @Valid
    public Addresse getAddresse() {
    return addresse;
  }

  public void setAddresse(Addresse addresse) {
    this.addresse = addresse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Uni uni = (Uni) o;
    return Objects.equals(this.id, uni.id) &&
        Objects.equals(this.name, uni.name) &&
        Objects.equals(this.addresse, uni.addresse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, addresse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Uni {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresse: ").append(toIndentedString(addresse)).append("\n");
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
