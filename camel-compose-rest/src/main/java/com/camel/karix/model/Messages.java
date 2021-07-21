package com.camel.karix.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {

	private List<String> dest;

	private String text;

	private String send;

	private String type;

	private String dcs;

	private String udhi_inc;

	private String port;

	private String dlr_req;

	private String vp;

	private String app_country;

	private String country_cd;

	private String template_id;

	private List<String> template_values;

	private String urltrack;

	private String cust_ref;

	private String tag;

	private String tag1;

	private String tag2;

	private String tag3;

	private String tag4;

	private String tag5;
}
