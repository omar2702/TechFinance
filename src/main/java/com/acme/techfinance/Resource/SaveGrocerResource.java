package com.acme.techfinance.Resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
public class SaveGrocerResource {
    @NotNull
    @NotBlank
    @Size(max = 30)
    private String username;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String password;
}
