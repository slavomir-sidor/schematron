package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Namespace;
import cy.bishub.schematron.api.model.NamespaceList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-16T11:11:56.606013+02:00[Europe/Paris]")
@Controller
public class NamespaceApiController implements NamespaceApi {

    private final NamespaceApiDelegate delegate;

    public NamespaceApiController(@Autowired(required = false) NamespaceApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new NamespaceApiDelegate() {});
    }

    @Override
    public NamespaceApiDelegate getDelegate() {
        return delegate;
    }

}
