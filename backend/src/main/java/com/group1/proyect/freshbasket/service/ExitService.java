package com.group1.proyect.freshbasket.service;

import com.group1.proyect.freshbasket.dto.request.ExitRequestDTO;
import com.group1.proyect.freshbasket.dto.response.ExitResponseDTO;

import java.util.List;

public interface ExitService {

    ExitResponseDTO create(ExitRequestDTO request);

    List<ExitResponseDTO> findAll();

    ExitResponseDTO findById(Long id);

    ExitResponseDTO update(Long id, ExitRequestDTO request);

    void delete(Long id);
}