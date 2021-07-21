package com.camel.karix.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Root {

	private String ver;
	private String key;
	private String encrpt;
	private String sch_at;
	private List<Messages> mesages;
}