package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Attribute;
import cy.bishub.schematron.api.model.AttributeList;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link AttributeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-16T11:11:56.606013+02:00[Europe/Paris]")
public interface AttributeApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /attribute
     * Create Attribute
     *
     * @param attribute Attribute Request Body (required)
     * @return Attribute Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see AttributeApi#createAttribute
     */
    default ResponseEntity<Attribute> createAttribute(Attribute attribute) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"namespace\" : { \"name\" : \"name\", \"id\" : 1, \"url\" : \"url\" }, \"id\" : 5, \"updated\" : \"2000-01-23T04:56:07.000+00:00\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /attribute/{AttributeId}
     * Delete Attribute
     *
     * @param attributeId Attribute Id (required)
     * @return Attribute Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see AttributeApi#deleteAttribute
     */
    default ResponseEntity<Attribute> deleteAttribute(Long attributeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"namespace\" : { \"name\" : \"name\", \"id\" : 1, \"url\" : \"url\" }, \"id\" : 5, \"updated\" : \"2000-01-23T04:56:07.000+00:00\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /attribute/{AttributeId}
     * Get Attribute
     *
     * @param attributeId Attribute Id (required)
     * @return Attribute Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see AttributeApi#getAttribute
     */
    default ResponseEntity<Attribute> getAttribute(Long attributeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"namespace\" : { \"name\" : \"name\", \"id\" : 1, \"url\" : \"url\" }, \"id\" : 5, \"updated\" : \"2000-01-23T04:56:07.000+00:00\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /attribute
     * Get Attribute List
     *
     * @param page Page (optional, default to 1)
     * @param pageSize Page Size (optional, default to 20)
     * @param sortBy Sort By parameter (optional)
     * @param sortOrder Sort Order parameter (optional)
     * @return Attribute List Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see AttributeApi#getAttributeList
     */
    default ResponseEntity<AttributeList> getAttributeList(Long page,
        Long pageSize,
        List<String> sortBy,
        List<String> sortOrder) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"namespace\" : { \"name\" : \"name\", \"id\" : 1, \"url\" : \"url\" }, \"id\" : 5, \"updated\" : \"2000-01-23T04:56:07.000+00:00\", \"content\" : \"content\" }, { \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"namespace\" : { \"name\" : \"name\", \"id\" : 1, \"url\" : \"url\" }, \"id\" : 5, \"updated\" : \"2000-01-23T04:56:07.000+00:00\", \"content\" : \"content\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /attribute/{AttributeId}
     * Update Attribute
     *
     * @param attributeId Attribute Id (required)
     * @param attribute Attribute Request Body (required)
     * @return Attribute Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see AttributeApi#updateAttribute
     */
    default ResponseEntity<Attribute> updateAttribute(Long attributeId,
        Attribute attribute) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"namespace\" : { \"name\" : \"name\", \"id\" : 1, \"url\" : \"url\" }, \"id\" : 5, \"updated\" : \"2000-01-23T04:56:07.000+00:00\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
