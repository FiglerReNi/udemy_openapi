package io.swagger.api;

import io.swagger.model.Beer;
import io.swagger.model.BeerOrder;
import io.swagger.model.BeerPagedList;
import io.swagger.model.Customer;
import io.swagger.model.CustomerPagedList;
import java.util.UUID;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-02T13:50:05.924358236Z[GMT]")
@RestController
public class AppApiController implements AppApi {

    private static final Logger log = LoggerFactory.getLogger(AppApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AppApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createBeer(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Beer body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createCustomer(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createOrderByCustomer(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeerOrder body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteBeerById(@Parameter(in = ParameterIn.PATH, description = "Beer Id", required=true, schema=@Schema()) @PathVariable("beerId") UUID beerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomerById(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Beer> getBeerById(@Parameter(in = ParameterIn.PATH, description = "Beer Id", required=true, schema=@Schema()) @PathVariable("beerId") UUID beerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Beer>(objectMapper.readValue("{\n  \"quantity\" : 6,\n  \"price\" : 0.8008282,\n  \"name\" : \"name\",\n  \"brewery\" : {\n    \"name\" : \"name\",\n    \"location\" : \"location\"\n  },\n  \"upc\" : \"upc\",\n  \"style\" : \"ALE\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", Beer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Beer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Beer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerById(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{\n  \"firstName\" : \"Renata\",\n  \"lastName\" : \"Figler\",\n  \"address\" : {\n    \"zipCode\" : 2040,\n    \"city\" : \"Budaörs\",\n    \"line\" : \"Kinizsi ut 2/B\",\n    \"stateCode\" : \"AL\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BeerPagedList> getListOfBeers(@Parameter(in = ParameterIn.QUERY, description = "Page Number" ,schema=@Schema( defaultValue="1")) @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber,@Parameter(in = ParameterIn.QUERY, description = "Page Size" ,schema=@Schema( defaultValue="25")) @Valid @RequestParam(value = "pageSize", required = false, defaultValue="25") Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BeerPagedList>(objectMapper.readValue("{\n  \"content\" : [ {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"quantity\" : 6,\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"upc\" : \"upc\",\n    \"style\" : \"ALE\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  } ]\n}", BeerPagedList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BeerPagedList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BeerPagedList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomerPagedList> getListOfCustomers(@Parameter(in = ParameterIn.QUERY, description = "Page Number" ,schema=@Schema( defaultValue="1")) @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber,@Parameter(in = ParameterIn.QUERY, description = "Page Size" ,schema=@Schema( defaultValue="25")) @Valid @RequestParam(value = "pageSize", required = false, defaultValue="25") Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CustomerPagedList>(objectMapper.readValue("{\n  \"content\" : [ {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Renata\",\n    \"lastName\" : \"Figler\",\n    \"address\" : {\n      \"zipCode\" : 2040,\n      \"city\" : \"Budaörs\",\n      \"line\" : \"Kinizsi ut 2/B\",\n      \"stateCode\" : \"AL\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  } ]\n}", CustomerPagedList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CustomerPagedList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CustomerPagedList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyBeerById(@Parameter(in = ParameterIn.PATH, description = "Beer Id", required=true, schema=@Schema()) @PathVariable("beerId") UUID beerId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Beer body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyCustomerById(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyListOfCustomers() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
