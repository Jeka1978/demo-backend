package com.iai.cads.demobackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserConf {

    private int id;
    private int sessionId;
    private String command;



}
