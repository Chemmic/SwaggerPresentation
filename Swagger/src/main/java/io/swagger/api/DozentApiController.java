package io.swagger.api;

import io.swagger.model.Dozent;
import io.swagger.model.Uni;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-23T20:23:17.581651531Z[GMT]")
@RestController
public class DozentApiController implements DozentApi {

    private static final Logger log = LoggerFactory.getLogger(DozentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DozentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Dozent> addDozent(@Parameter(in = ParameterIn.DEFAULT, description = "Erstelle einen neuen Dozent/in", required=true, schema=@Schema()) @Valid @RequestBody Dozent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Dozent>(objectMapper.readValue("{\n  \"Uni\" : {\n    \"Addresse\" : {\n      \"Bundesland\" : \"Baden-Württemberg\",\n      \"Postleitzahl\" : \"76133\",\n      \"Stadt\" : \"Karlsruhe\",\n      \"Straße\" : \"Erzbergerstraße 121\"\n    },\n    \"name\" : \"DHBW Karlsruhe\",\n    \"id\" : 1\n  },\n  \"name\" : \"nuo li\",\n  \"id\" : 10,\n  \"status\" : \"aktiv\"\n}", Dozent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Dozent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Dozent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDozent(@Parameter(in = ParameterIn.PATH, description = "Dozent id der/die gelöscht werden soll", required=true, schema=@Schema()) @PathVariable("dozentId") Long dozentId,@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Dozent>> findDozentByStatus(@Parameter(in = ParameterIn.QUERY, description = "Status Werte welche zum Filtern genutzt werden" ,schema=@Schema(allowableValues={ "aktiv", "faul" }
, defaultValue="aktiv")) @Valid @RequestParam(value = "status", required = false, defaultValue="aktiv") String status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Dozent>>(objectMapper.readValue("[ {\n  \"Uni\" : {\n    \"Addresse\" : {\n      \"Bundesland\" : \"Baden-Württemberg\",\n      \"Postleitzahl\" : \"76133\",\n      \"Stadt\" : \"Karlsruhe\",\n      \"Straße\" : \"Erzbergerstraße 121\"\n    },\n    \"name\" : \"DHBW Karlsruhe\",\n    \"id\" : 1\n  },\n  \"name\" : \"nuo li\",\n  \"id\" : 10,\n  \"status\" : \"aktiv\"\n}, {\n  \"Uni\" : {\n    \"Addresse\" : {\n      \"Bundesland\" : \"Baden-Württemberg\",\n      \"Postleitzahl\" : \"76133\",\n      \"Stadt\" : \"Karlsruhe\",\n      \"Straße\" : \"Erzbergerstraße 121\"\n    },\n    \"name\" : \"DHBW Karlsruhe\",\n    \"id\" : 1\n  },\n  \"name\" : \"nuo li\",\n  \"id\" : 10,\n  \"status\" : \"aktiv\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Dozent>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Dozent>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Dozent> getDozentById(@Parameter(in = ParameterIn.PATH, description = "ID vom Dozent/in", required=true, schema=@Schema()) @PathVariable("dozentId") Long dozentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Dozent>(objectMapper.readValue("{\n  \"Uni\" : {\n    \"Addresse\" : {\n      \"Bundesland\" : \"Baden-Württemberg\",\n      \"Postleitzahl\" : \"76133\",\n      \"Stadt\" : \"Karlsruhe\",\n      \"Straße\" : \"Erzbergerstraße 121\"\n    },\n    \"name\" : \"DHBW Karlsruhe\",\n    \"id\" : 1\n  },\n  \"name\" : \"nuo li\",\n  \"id\" : 10,\n  \"status\" : \"aktiv\"\n}", Dozent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Dozent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Dozent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDozentWithForm(@Parameter(in = ParameterIn.PATH, description = "ID des Dozent/in der/die geupdated werden soll", required=true, schema=@Schema()) @PathVariable("dozentId") Long dozentId,@Parameter(in = ParameterIn.QUERY, description = "Name des Dozent/in der/die geupdated werden soll" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name,@Parameter(in = ParameterIn.QUERY, description = "Status des Dozent/in der/die geupdated werden soll" ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
