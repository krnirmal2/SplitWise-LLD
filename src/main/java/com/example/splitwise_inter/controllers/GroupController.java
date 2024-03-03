package com.example.splitwise_inter.controllers;

import com.example.splitwise_inter.dtos.ResponseStatus;
import com.example.splitwise_inter.dtos.SettleGroupRequestDTO;
import com.example.splitwise_inter.dtos.SettleGroupResponseDTO;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {

    public SettleGroupResponseDTO settleGroup(SettleGroupRequestDTO requestDTO){
        SettleGroupResponseDTO responseDTO = new SettleGroupResponseDTO();
        responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        responseDTO.setMessage("Not implemented yet");
        return responseDTO;
    }
}
