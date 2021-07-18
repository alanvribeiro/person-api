package one.digitalinnovation.personapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Api("Manages person")
public interface PersonControllerDocs {

    @ApiOperation(value = "Person creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success person creation"),
            @ApiResponse(code = 400, message = "Missing required fields or wrong field range value.")
    })
    MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO);

    @ApiOperation(value = "Returns a list of all persons registered in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all persons registered in the system")
    })
    List<PersonDTO> listAll();

    @ApiOperation(value = "Returns person found by a given id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success person found in the system"),
            @ApiResponse(code = 404, message = "Person with given id not found.")
    })
    PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException;

    @ApiOperation(value = "Person updated operation")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success person updated"),
            @ApiResponse(code = 400, message = "Missing required fields or wrong field range value.")
    })
    MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException;

    @ApiOperation(value = "Delete a person found by a given valid id")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Success person deleted in the system"),
            @ApiResponse(code = 404, message = "Beer with given id not found.")
    })
    void deleteById(@PathVariable Long id) throws PersonNotFoundException;

}
