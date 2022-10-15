/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Document;
import cy.bishub.schematron.api.model.DocumentList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-15T15:13:55.822+02:00[Europe/Paris]")
@Validated
@Tag(name = "Document", description = "Document operations")
@RequestMapping("${openapi.Schematron - API - Server - Interface.base-path:}")
public interface DocumentApi {

    default DocumentApiDelegate getDelegate() {
        return new DocumentApiDelegate() {};
    }

    /**
     * PUT /document
     * Create Document
     *
     * @param document Document Request Body (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "createDocument",
        tags = { "Document" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Document Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Document.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/document",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Document> createDocument(
        @Parameter(name = "Document", description = "Document Request Body", required = true) @Valid @RequestBody Document document
    ) {
        return getDelegate().createDocument(document);
    }


    /**
     * DELETE /document/{DocumentId}
     * Delete Document
     *
     * @param documentId Document Id (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "deleteDocument",
        tags = { "Document" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Document Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Document.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/document/{DocumentId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Document> deleteDocument(
        @NotNull @Parameter(name = "DocumentId", description = "Document Id", required = true) @Valid @RequestParam(value = "DocumentId", required = true) Long documentId
    ) {
        return getDelegate().deleteDocument(documentId);
    }


    /**
     * GET /document/{DocumentId}
     * Get Document
     *
     * @param documentId Document Id (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "getDocument",
        tags = { "Document" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Document Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Document.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/document/{DocumentId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Document> getDocument(
        @NotNull @Parameter(name = "DocumentId", description = "Document Id", required = true) @Valid @RequestParam(value = "DocumentId", required = true) Long documentId
    ) {
        return getDelegate().getDocument(documentId);
    }


    /**
     * GET /document
     * Get Document List
     *
     * @param page Page (optional, default to 1)
     * @param pageSize Page Size (optional, default to 20)
     * @param sortBy Sort By parameter (optional)
     * @param sortOrder Sort Order parameter (optional)
     * @return Document List Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "getDocumentList",
        tags = { "Document" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Document List Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DocumentList.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/document",
        produces = { "application/json" }
    )
    default ResponseEntity<DocumentList> getDocumentList(
        @Parameter(name = "Page", description = "Page") @Valid @RequestParam(value = "Page", required = false, defaultValue = "1") Long page,
        @Parameter(name = "PageSize", description = "Page Size") @Valid @RequestParam(value = "PageSize", required = false, defaultValue = "20") Long pageSize,
        @Parameter(name = "SortBy", description = "Sort By parameter") @Valid @RequestParam(value = "SortBy", required = false) List<String> sortBy,
        @Parameter(name = "SortOrder", description = "Sort Order parameter") @Valid @RequestParam(value = "SortOrder", required = false) List<String> sortOrder
    ) {
        return getDelegate().getDocumentList(page, pageSize, sortBy, sortOrder);
    }


    /**
     * PATCH /document/{DocumentId}
     * Update Document
     *
     * @param documentId Document Id (required)
     * @param document Document Request Body (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "updateDocument",
        tags = { "Document" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Document Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Document.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/document/{DocumentId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Document> updateDocument(
        @NotNull @Parameter(name = "DocumentId", description = "Document Id", required = true) @Valid @RequestParam(value = "DocumentId", required = true) Long documentId,
        @Parameter(name = "Document", description = "Document Request Body", required = true) @Valid @RequestBody Document document
    ) {
        return getDelegate().updateDocument(documentId, document);
    }

}
