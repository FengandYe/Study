package io.lll.service;

import io.lll.dto.out.AddressShowOutDTO;

public interface AddressService {

    public AddressShowOutDTO getById(Integer addressId);

    public AddressShowOutDTO create(AddressShowOutDTO addressShowOutDTO);

    public AddressShowOutDTO update(AddressShowOutDTO addressShowOutDTO);
}
