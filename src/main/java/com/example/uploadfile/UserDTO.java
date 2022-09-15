package com.example.uploadfile;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

	@lombok.NonNull
    private String name;

	@lombok.NonNull
    private String address;

	@lombok.NonNull
    private String mobileNo;

    private AddressProofDTO addressProof;
}