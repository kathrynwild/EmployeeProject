package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entity.Address;

public interface AddressService {
	
	List<Address> getAllAddressDetails();

	Optional<Address> getAddressById(long addressId);

	Address addAddress(Address address);

	void deleteAddress(long addressId);

	Address updateAddress(long addressId, Address address);

}
