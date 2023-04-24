package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Uni;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dozent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-23T20:23:17.581651531Z[GMT]")


public class Dozent   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("Uni")
  private Uni uni = null;

  /**
   * Ist der/die Dozent/in aktiv am lehren
   */
  public enum StatusEnum {
    AKTIV("aktiv"),
    
    FAUL("faul");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public Dozent id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Dozent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "nuo li", required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dozent uni(Uni uni) {
    this.uni = uni;
    return this;
  }

  /**
   * Get uni
   * @return uni
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Uni getUni() {
    return uni;
  }

  public void setUni(Uni uni) {
    this.uni = uni;
  }

  public Dozent status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Ist der/die Dozent/in aktiv am lehren
   * @return status
   **/
  @Schema(description = "Ist der/die Dozent/in aktiv am lehren")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dozent dozent = (Dozent) o;
    return Objects.equals(this.id, dozent.id) &&
        Objects.equals(this.name, dozent.name) &&
        Objects.equals(this.uni, dozent.uni) &&
        Objects.equals(this.status, dozent.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uni, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dozent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uni: ").append(toIndentedString(uni)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
