package com.theleakmark.product.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
@Api(value="onlinestore1", description="Operations for stock")
public class StockController {

    @ApiOperation(value = "View the book's availability", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully get availability"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/available")
    public String available() {
        return "Available Stock";
    }

    @ApiOperation(value = "Check Out the stock", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully check out"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/checked-out")
    public String checkedOut() {
        return "checked-out the stock";
    }
}
